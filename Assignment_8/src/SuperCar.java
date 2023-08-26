public class SuperCar {
    private String ownerName;
    private double price;
    private String colour;
    private String brand;

    private SuperCar(){

    }
    private static SuperCar ref;
    public static SuperCar getInstance(){
        if (ref == null){
            ref = new SuperCar();
            return ref;
        }
        return null;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public  String getBrand() {
        return brand;
    }

    public  void setBrand(String brand) {
        this.brand = brand;
    }
    public SuperCar(SuperCar s1) {
        this.ownerName = s1.ownerName;
        this.price = s1.price;
        this.colour = s1.colour;
        this.brand=s1.brand;
    }

    public static void main(String[] args) {
        SuperCar a1 = new SuperCar();
        a1.setColour("red");
        SuperCar a2 = new SuperCar(a1);

        System.out.println(a1.getColour());
        System.out.println(a2.getColour());





        //s1.setColour("green");
        //s2.setColour("Red");
        //System.out.println(s1.getColour());
        //System.out.println((s2.getColour()));


    }
}
