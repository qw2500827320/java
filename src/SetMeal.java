import java.time.LocalDate;

public class SetMeal {
    String name1="套餐一:青岛啤酒 炸鸡";
    String name2="套餐二:柠檬汁 炸鸡";
    String name3="套餐三:西二啤酒 炸鸡";
    String chickenname="香酥炸鸡";
    double price1;
    double price2;
    protected String name;
    protected double cost;

    @Override
    public String toString() {
        return "我们的套餐有" +
                name1 + '\'' +""+
                name2 + '\'' +""+
                name3 + '\'' ;
    }

    protected LocalDate PD;
    protected int EXP;


}
