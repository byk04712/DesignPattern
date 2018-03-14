package com.pattern.command.command;

import com.pattern.command.receiver.Stereo;

/**
 * 打开音箱同时放置CD
 */
public class StereOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        // 打开它
        this.stereo.on();
        // 设置成播放CD
        this.stereo.setCd();
        // 设置音量
        this.stereo.setVolume(12);
    }

    @Override
    public void undo() {
        this.stereo.off();
    }

    @Override
    public String toString() {
        return this.stereo.getName() +  " " + this.getClass().getSimpleName();
    }
}
