package com.pattern.compound.mvc;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;
import java.util.ArrayList;

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

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return 0;
    }

    @Override
    public void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeObserver(BeatObserver o) {

    }

    @Override
    public void registerObserver(BPMObserver o) {

    }

    @Override
    public void removeObserver(BPMObserver o) {

    }

    @Override
    public void meta(MetaMessage meta) {

    }
}
