package designPatterns.chainOfResponsability.cashWithdrawal.components;

public class Withdraw50 extends AbstractWithdraw{
    @Override
    public void valueRequest(int request) {
        int diff = 0;
        while(sum < request){
            diff = request - sum;
            if (diff >= 50) {
                sum += 50;
                banknotes++;
                notes50++;
            } else {
                super.valueRequest(request);
            }
        }
    }
}
