package designPatterns.chainOfResponsability.cashWithdrawal.components;

public abstract class AbstractWithdraw implements Withdraw {
    public static int banknotes;
    public static int notes100;
    public static int notes50;
    public static int notes20;
    public static int notes10;
    public static int notes5;
    public static int notes2;
    public static int sum;
    protected Withdraw nextValue;

    public void setNextValue(Withdraw nextValue) {
        this.nextValue = nextValue;
    }

    public void valueRequest(int request) {
        if (nextValue != null) {
            nextValue.valueRequest(request);
        }
    }
}
