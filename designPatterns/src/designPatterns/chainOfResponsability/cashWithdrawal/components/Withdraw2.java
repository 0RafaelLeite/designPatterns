package designPatterns.chainOfResponsability.cashWithdrawal.components;

public class Withdraw2 extends AbstractWithdraw{
    @Override
    public void valueRequest(int request) {
        int diff = 0;
        while(sum < request){
            diff = request - sum;
            if (diff >= 2) {
                sum += 2;
                banknotes++;
                notes2++;
            } else {
                System.out.println("Proccess finished");
            }
        }
    }
}

