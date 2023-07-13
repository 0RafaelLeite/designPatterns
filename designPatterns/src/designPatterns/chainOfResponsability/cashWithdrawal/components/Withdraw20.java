package designPatterns.chainOfResponsability.cashWithdrawal.components;

public class Withdraw20 extends AbstractWithdraw{
    @Override
    public void valueRequest(int request) {
        int diff = 0;
        while(sum < request){
            diff = request - sum;
            if (diff >= 20) {
                sum += 20;
                banknotes++;
                notes20++;
            } else {
                super.valueRequest(request);
            }
        }
    }
}
