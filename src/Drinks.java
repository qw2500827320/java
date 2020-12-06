import java.time.LocalDate;

public abstract class Drinks {
    protected String name;
    protected double cost;
    protected LocalDate PD;
    protected int EXP;

    public Drinks() {
    }

    public Drinks(String name, double cost, LocalDate PD, int EXP) {
        this.name = name;
        this.cost = cost;
        this.PD = PD;
        this.EXP = EXP;
    }

    public abstract String toString();

    public boolean safe(){
        boolean result;
        LocalDate today=LocalDate.now();
        LocalDate safeday= PD.plusDays(EXP);
        if(safeday.isAfter(today)) {
            result=false;
        }
        else result=true;
        return result;
}
}
