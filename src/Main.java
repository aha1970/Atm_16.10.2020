public class Main {
    public static void main(String[] args) {
        Atm atm=new Atm(5_000_000);

        int totalCashATM=atm.withdrowMoney(35_000);
        totalCashATM=atm.depositMoney(150_000);
        totalCashATM=atm.withdrowMoney(1_000);

        totalCashATM=atm.getTotalCash();
        System.out.println(totalCashATM);


    }
}
