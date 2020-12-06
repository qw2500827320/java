import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public  class West2FriedChickenRestaurant implements FriedChickenRestaurant {
    ArrayList Beerslist;
    ArrayList Juicelist;
    double balance;
    public final static ArrayList Setmeallist=new ArrayList();
    static {
        Setmeallist.add("套餐一");
        Setmeallist.add("套餐二");
    }
    public West2FriedChickenRestaurant(){
    }
    public West2FriedChickenRestaurant(ArrayList Beerslist, ArrayList juicelist, double balance) {
        this.Beerslist = Beerslist;
        this.Juicelist = juicelist;
        this.balance = balance;
    }

    private void use(ArrayList beerslist, float ac, String name,
                    int EXP,LocalDate date1,double balance){
        Drinks drinks1=new Beers(name ,3.0,date1,EXP,ac);
        try {
            if(beerslist.contains(name)){

                if( drinks1.safe()) {
                    beerslist.remove(name);
                    System.out.println(name+"过期,已移除");
                }
                else {
                    beerslist.remove(name);
                    System.out.println(name+"已出售，酒精度数为"+ac);
                }

            }
            else throw new IngredientSortOutException(name);
        }catch (RuntimeException r){
                System.out.println(r.getMessage());
        }
    }

    private void use(ArrayList juicelist,String name,
                    int EXP,LocalDate date1){
        Drinks drinks1=new Juice(name ,3.0,date1,EXP);
        try {

            if(juicelist.contains(name)){
                if( drinks1.safe()) {
                    juicelist.remove(name);
                    System.out.println(name+"过期,已移除");
                }
                juicelist.remove(name);
                System.out.println(name+"已出售");
            }
            else throw new IngredientSortOutException(name);
        }catch (RuntimeException r){
                System.out.println(r.getMessage());
        }
    }
    public void sell_setmeal(int num,Drinks dr,ArrayList arrayList,int EXP,
                             LocalDate date1,String name,double balance) {
       West2FriedChickenRestaurant we2=new West2FriedChickenRestaurant();
       int i=0;
       if(dr instanceof Beers){
           for(;i<num;i++){
               we2.use(arrayList,20f,name,EXP,date1,balance);
               System.out.println("\n");
           }
       }
       else {
           for(;i<num;i++){
               we2.use(arrayList,"柠檬汁", EXP, date1);
               System.out.println("\n");
           }
       }

    }

    public void stock(int num,Drinks dr,ArrayList arrayList,String name,double balance) {
        Drinks drinks1=new Beers();
        if(dr instanceof Beers){
            int i=0;
            for(;i<num;i++){
                try {
                    if (num*2-this.balance<=0){
                        balance=balance-2;
                        arrayList.add(name);
                    }
                    else throw new OverdraftBalanceException(num*2-this.balance);
                }
                catch (RuntimeException r){
                    System.out.println("进货还差"+r.toString());break;
                }
            }
            this.balance=balance;
        }
        else {
            int i=0;
            for(;i<num;i++) {
                balance=balance-1;
                arrayList.add(name);
            }
            this.balance=balance;
    }
}
}
