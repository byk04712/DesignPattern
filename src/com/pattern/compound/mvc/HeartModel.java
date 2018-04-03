package com.pattern.compound.mvc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;
import java.util.Random;

public class HeartModel implements HeartModelInterface, Runnable {

    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();

    int bpm = 90;
    int time = 1000;

    Random random = new Random(System.currentTimeMillis());
    Thread thread;

    public HeartModel() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public int getHeartRate() {
        return 60000 / time;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int index = beatObservers.indexOf(o);
        if (index >= 0)
            beatObservers.remove(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        int index = bpmObservers.indexOf(0);
        if (index >= 0)
            bpmObservers.remove(o);
    }

    public void notifyBeatObservers() {
        Iterator<BeatObserver> iterator = beatObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().updateBeat();
        }
    }

    public void notifyBPMObservers() {
        Iterator<BPMObserver> iterator = bpmObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().updateBPM();
        }
    }

    @Override
    public void run() {
        int lastrate = -1;

        while (true) {
            int change = random.nextInt(10);
            if (random.nextInt(2) == 0) {
                change = 0 - change;
            }
            int rate = 60000 / (time + change);
            if (rate < 120 && rate > 50) {
                time += change;
                notifyBeatObservers();
                if (rate != lastrate) {
                    lastrate = rate;
                    notifyBPMObservers();
                }
            }
            try {
                Thread.sleep(time);
            } catch (Exception e) {}
        }
    }
}
