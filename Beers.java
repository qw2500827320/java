import java.time.LocalDate;

public class Beers extends Drinks {
    int EXP=30;
    float ac;//酒精度数

    public Beers() {

    }

    public Beers(String name, double cost, LocalDate PD, int EXP, float ac)
    {
        super(name, cost, PD, EXP);
    }

    public String toString() {
        return "Beers{" +
                "EXP=" + EXP +
                ", ac=" + ac +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", PD=" + PD +
                ", EXP=" + EXP +
                '}';
    }
}
