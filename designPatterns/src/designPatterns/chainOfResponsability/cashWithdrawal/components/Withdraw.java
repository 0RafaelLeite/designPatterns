package designPatterns.chainOfResponsability.cashWithdrawal.components;

public interface Withdraw {
    void setNextValue(Withdraw nextValue);
    void valueRequest(int request);
}
