import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020,10,1);
        LocalDate date2=LocalDate.of(2020,12,20);
        LocalDate date3 = LocalDate.of(2020,12,1);
        Drinks dr1=new Beers("青岛啤酒" ,2,date1,30,20f);
        Drinks dr2=new Juice("柠檬汁",1,date2,2);
        Drinks dr3=new Beers("西二啤酒" ,2,date3,30,20f);
        //青岛啤酒已过期，其余两个正常
        SetMeal se=new SetMeal();
        System.out.println(se.toString());//介绍套餐类型
        ArrayList<String> beerslist=new ArrayList<>();
        beerslist.add("青岛啤酒");
        beerslist.add("西二啤酒");
        ArrayList<String> juicelist=new ArrayList<>();
        juicelist.add("柠檬汁");
        juicelist.add("柠檬汁");
        //西二炸鸡店初始拥有1瓶青岛啤酒，一瓶西二啤酒，2杯柠檬汁和10块钱，假定炸鸡的成本价等于售价，不予考虑
        West2FriedChickenRestaurant we=new West2FriedChickenRestaurant(beerslist,juicelist,10.0);
        //测试正常批量出售，num代表出售或进货数量
        we.sell_setmeal(1,dr2,juicelist,2,date2,"柠檬汁", we.balance);
        //测试过期移除功能，饮料售空异常
        we.sell_setmeal(2,dr3,beerslist,10,date1,"青岛啤酒",we.balance);
        //测试正常批量进货，并打印进货后账目余额
        we.stock(3,dr3,beerslist,"西二啤酒", we.balance);
        System.out.println(beerslist);
        System.out.println(we.balance);
        we.stock(2,dr2,juicelist,"柠檬汁", we.balance);
        System.out.println(juicelist);
        System.out.println(we.balance);
        //测试钱不够的情况
        we.stock(2,dr3,beerslist,"西二啤酒", we.balance);
        System.out.println(we.balance);
    }
}

