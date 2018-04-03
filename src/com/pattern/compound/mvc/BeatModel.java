package com.pattern.compound.mvc;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * MetaEventListener 是MJDJ代码需要的
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {

    // 定序器（Sequencer）对象知道如何产生真实的节拍
    private Sequencer sequencer;
    // 两种观察者，一种观察节拍，一种观察bpm改变
    private ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    private ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    private int bpm = 90;
    Sequence sequence;
    Track track;

    @Override
    public void initialize() {
        // 此方法为我们设置定序器和节拍音轨
        setUpMidi();
        buildTrackAndStart();
    }

    private void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);
        track.add(makeEvent(192,9,1,0,4));
        try {
            sequencer.setSequence(sequence);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void makeTracks(int[] list) {

        for (int i = 0; i < list.length; i++) {
            int key = list[i];

            if (key != 0) {
                track.add(makeEvent(144,9,key, 100, i));
                track.add(makeEvent(128,9,key, 100, i+1));
            }
        }
    }

    public  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);

        } catch(Exception e) {
            e.printStackTrace();
        }
        return event;
    }

    private void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void on() {
        // 此方法开始了定序器，并将bpm设定为默认值90
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        // 此方法通过将bpm设置为0，停止定制器
        setBPM(0);
        sequencer.stop();
    }

    // 控制器用此方法控制操纵节拍，它做了三件事
    @Override
    public void setBPM(int bpm) {
        // 设置bpm实例变量
        this.bpm = bpm;
        //  要求定序器改变BPM
        sequencer.setTempoInBPM(getBPM());
        // 通知所有的BPM观察者，BPM已经改变了
        notifyBPMObservers();
    }

    private void notifyBPMObservers() {
        Iterator<BPMObserver> iterator = bpmObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().updateBPM();
        }
    }

    @Override
    public int getBPM() {
        return this.bpm;
    }

    // 当新的节拍开始时，MJDJ代码会调用此方法，它会通知全部的beatObserver，新的节拍开始了
    void beatEvent() {
        notifyBeatObservers();
    }

    private void notifyBeatObservers() {
        Iterator<BeatObserver> iterator = beatObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().updateBeat();
        }
    }

    @Override
    public void registerObserver(BeatObserver o) {
        this.beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        this.beatObservers.remove(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        this.bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        this.bpmObservers.remove(o);
    }

    @Override
    public void meta(MetaMessage meta) {
        if (meta.getType() == 47) {
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }
}
