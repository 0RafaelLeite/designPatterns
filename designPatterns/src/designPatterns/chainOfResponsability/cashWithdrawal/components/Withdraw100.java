package designPatterns.chainOfResponsability.cashWithdrawal.components;

public class Withdraw100 extends AbstractWithdraw{
    @Override
    public void valueRequest(int request) {
        int diff = 0;
        while(sum < request){
            diff = request - sum;
            if (diff >= 100) {
                sum += 100;
                banknotes++;
                notes100++;
            } else {
                super.valueRequest(request);
            }
        }
    }
}
