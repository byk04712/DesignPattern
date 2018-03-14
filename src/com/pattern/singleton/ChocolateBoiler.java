package com.pattern.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler = null;

    private ChocolateBoiler() {
        // 代码开始时，锅炉是空的
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    // 在锅炉填入原料时，锅炉必须是空的。一旦填入原料，就将 empty 和 boiled 标志设置好
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    // 锅炉排出时，必须是满的且是煮过的。排除完毕后把empty标志设回true
    public void drain() {
        if (!isBoiled() && !isEmpty()) {
            // 排除煮沸的巧克力和牛奶
            empty = true;
        }
    }

    // 煮混合物时，锅炉必须是满的，并且是没有煮过的，一旦煮沸后，就把boiled标志设为true
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 将炉内物煮沸
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
