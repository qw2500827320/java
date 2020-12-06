import java.time.LocalDate;

public class Juice extends Drinks {
    int EXP=2;

    public Juice(String name, double cost, LocalDate PD, int EXP)
    {
        super(name, cost, PD, EXP);
    }

    public Juice() {
    }

    public String toString() {
        return "Juice{" +
                "EXP=" + EXP +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", PD=" + PD +
                ", EXP=" + EXP +
                '}';
    }
}
