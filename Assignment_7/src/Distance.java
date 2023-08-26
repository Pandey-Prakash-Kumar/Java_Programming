public class Distance {
    private double km,m,cm;

    public void setKm(double km) {
        this.km = km;
    }

    public void setM(double m) {
        this.m = m;
    }

    public void setCm(double cm) {
        this.cm = cm;
    }

    void getDistanceInKm(){
        System.out.println(km);
    }
    void setDistanceInM(double m){
        this.m = m;
    }
    void getDistanceInM(){
        System.out.println(m);
    }
    void setDistanceInCm(double cm){
        this.cm=cm;
    }
    void getDistanceInCm(){
        System.out.println(cm);
    }
    public Distance addDistance (Distance d){
        Distance temp = new Distance();
        temp.cm = cm+d.cm;
        temp.m = temp.cm/100+m+d.m;
        temp.km = temp.m/1000+km+d.km;
        return temp;
    }
}
