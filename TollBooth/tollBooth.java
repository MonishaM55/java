package TollBooth;
public class tollBooth {
    public static void main(String[] args) {
        // TODO code application logic here
        Truck t1=new Nissan(5,1500);
        Truck t2=new Benz(4,1200);
        TollComaney a=new TollComaney();
        a.cal_Display(t1);
        a.cal_Display(t2);
        a.collect_reset();
             
    }
}