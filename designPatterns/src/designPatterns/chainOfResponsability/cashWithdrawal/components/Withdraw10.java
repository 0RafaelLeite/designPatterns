package designPatterns.chainOfResponsability.cashWithdrawal.components;

public class Withdraw10 extends AbstractWithdraw{
    @Override
    public void valueRequest(int request) {
        int diff = 0;
        while(sum < request){
            diff = request - sum;
            if (diff >= 10) {
                sum += 10;
                banknotes++;
                notes10++;
            } else {
                super.valueRequest(request);
            }
        }
    }
}
