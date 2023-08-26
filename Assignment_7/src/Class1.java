class Complex{
    int real, imaginary;
    void setValues(int r, int i){
        real = r;
        imaginary=i;
    }
    void printValues(){
        System.out.println("real = "+real);
        System.out.println("imaginary = "+imaginary);
    }
}
public class Class1 {
    public static void main(String[] args) {
    Complex c1 = new Complex();
    c1.setValues(3,4);
    c1.printValues();
    }
}
