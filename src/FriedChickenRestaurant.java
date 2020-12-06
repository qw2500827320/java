import java.time.LocalDate;
import java.util.ArrayList;

public interface FriedChickenRestaurant {
    void sell_setmeal(int num, Drinks dr, ArrayList arrayList,
                      int EXP,LocalDate date1,String name,double balance);
    void stock(int num,Drinks dr,ArrayList arrayList,String name,double balance);
}
