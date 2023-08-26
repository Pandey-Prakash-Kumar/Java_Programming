class Time{
    int hr,min,sec;
    void setValues(int h, int m, int s){
        hr = h;
        min = m;
        sec = s;
    }
    void display(){
        System.out.println(hr+" hr "+min+" min "+sec+" sec ");
    }
}
public class Class2 {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.setValues(2,30,40);
        t1.display();

    }
}
