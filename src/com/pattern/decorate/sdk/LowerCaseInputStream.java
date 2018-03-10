package com.pattern.decorate.sdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 编写自己的 Java.io 装饰者类，继续装饰者对象 FilterInputStream
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * 构造函数里将 被装饰者 传入
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    // 重写 read 函数
    @Override
    public int read() throws IOException {
        int c = super.read();
        // 将内容转成写
        return c == -1 ? c : Character.toLowerCase(c);
    }

    // 重写 read 函数
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
