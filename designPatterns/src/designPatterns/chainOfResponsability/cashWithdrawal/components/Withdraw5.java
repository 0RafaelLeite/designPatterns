package designPatterns.chainOfResponsability.cashWithdrawal.components;

public class Withdraw5 extends AbstractWithdraw{
    @Override
    public void valueRequest(int request) {
        int diff = 0;
        while(sum < request){
            diff = request - sum;
            if (diff >= 5) {
                sum += 5;
                banknotes++;
                notes5++;
            } else {
                super.valueRequest(request);
            }
        }
    }
}
