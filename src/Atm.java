public class Atm {
    private int totalCash;

    public Atm (int totalCash){
        this.totalCash=totalCash;
    }

    public int getTotalCash() {
        return this.totalCash;
    }

    public int withdrowMoney(int money){
        if(money>this.totalCash){
            return 0;
        }
        this.totalCash=this.totalCash-money;
        return this.totalCash;
    }

    public int depositMoney(int money){
        this.totalCash=this.totalCash+money;
        return this.totalCash;
    }

}
