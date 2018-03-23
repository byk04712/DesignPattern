package com.pattern.status.gumball;

/**
 * 糖果机器
 */
public class GumballMachine {
    /**
     * 糖果售馨
     */
    public final static int SOLD_OUT = 0;
    /**
     * 没有25分钱
     */
    public final static int NO_QUARTER = 1;
    /**
     * 有25分钱
     */
    public final static int HAS_QUARTER = 2;
    /**
     * 售出糖果
     */
    public final static int SOLD = 3;

    // 新的机器默认状态是糖果售馨
    private int state = SOLD_OUT;
    // 记录机器内糖果数目
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 当有25分钱进来时执行此方法
     */
    public void insertQuarter() {
        // 如果已经投过25分钱，则告诉用户
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        }
        // 如果没有25分钱状态下，我们就接受25分钱，并将状态改为有25分钱
        else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        }
        // 如果已经卖光了，则拒绝收钱
        else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter, the machine is sold out");
        }
        // 如果顾客刚才买了糖果，就需要等待一下，好让状态转换完毕，恢复到没有25分钱的状态
        else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    /**
     * 退回25分钱
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("Quarter returned");
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already returned the crank");
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball !!!");
        } else if (state == NO_QUARTER) {
            System.out.println("You returned but there's no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You returned but there's no gumball");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    public void refill(int numGumballs) {
        this.count = numGumballs;
        state = NO_QUARTER;
    }

    private void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nMighty Gumball, Inc.");
        sb.append("\nJava-enabled Standing Gumball Model #2004\n");
        sb.append("Inventory:" + count + " gumball");

        if (count != 1) {
            sb.append("s");
        }
        sb.append("\nMachine is ");
        if (state == SOLD_OUT)
            sb.append("sold out");
        else if (state == NO_QUARTER)
            sb.append("waiting for quarter");
        else if (state == HAS_QUARTER)
            sb.append("waiting for turn of crank");
        else if (state == SOLD)
            sb.append("delivering a gumball");

        sb.append("\n");
        return sb.toString();
    }
}
