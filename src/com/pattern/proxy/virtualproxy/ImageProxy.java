package com.pattern.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 创建一个用来显示的ImageProxy
 * 此处可以使用状态模式实现，因为此处有两个状态，一开始是 ImageNotLoaded,当ImageIcon取回后就转换到ImageLoaded状态
 */
public class ImageProxy implements Icon {

    // 此imageIcon是我们希望在加载后显示出来的真正图像
    private ImageIcon imageIcon;
    private URL imageURL;
    private Thread retrievalThread;
    private boolean retrieving = false;

    // 我们将图像的url传入构造器中。这是我们希望显示的图像所在的位置
    public ImageProxy(URL url) {
        this.imageURL = url;
    }

    // 当需要在屏幕上绘制图像时，就调用此方法
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        // 如果已经由imageIcon，就告诉它画出自己
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            // 否则就显示加载中的消息
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                // 我们不希望挂起整个用户界面，所以用另一个线程取出画像。
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        imageIcon = new ImageIcon(imageURL, "CD Cover");
                        // 当图像准备好时，我们告诉swing，需要重绘。
                        c.repaint();
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        // 在图像加载完毕前，返回默认的宽和高。图像加载完毕后，转给imageIcon处理
        if (imageIcon != null)
            return imageIcon.getIconWidth();
        return 800;
    }

    @Override
    public int getIconHeight() {
        // 在图像加载完毕前，返回默认的宽和高。图像加载完毕后，转给imageIcon处理
        if (imageIcon != null)
            return imageIcon.getIconHeight();
        return 800;
    }
}
