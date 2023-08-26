class Circle{
    int radius;
    Integer r1=radius;
    void setRadius(int r){
        r1=r;
    }
    Double getArea(){
        return 3.14*r1*r1;
    }
    Double getCircumference(){
        return 2*3.14*r1;
    }
}
class MarkSheet{
    Integer marksOfPhysics,marksOfMaths,marksOfChemistry,marksOfEnglish,marksOfHindi;

    public Integer getMarksOfPhysics() {
        return marksOfPhysics;
    }

    public void setMarksOfPhysics(Integer marksOfPhysics) {
        this.marksOfPhysics = marksOfPhysics;
    }

    public Integer getMarksOfMaths() {
        return marksOfMaths;
    }

    public void setMarksOfMaths(Integer marksOfMaths) {
        this.marksOfMaths = marksOfMaths;
    }

    public Integer getMarksOfChemistry() {
        return marksOfChemistry;
    }

    public void setMarksOfChemistry(Integer marksOfChemistry) {
        this.marksOfChemistry = marksOfChemistry;
    }

    public Integer getMarksOfEnglish() {
        return marksOfEnglish;
    }

    public void setMarksOfEnglish(Integer marksOfEnglish) {
        this.marksOfEnglish = marksOfEnglish;
    }

    public Integer getMarksOfHindi() {
        return marksOfHindi;
    }

    public void setMarksOfHindi(Integer marksOfHindi) {
        this.marksOfHindi = marksOfHindi;
    }

    void setMarks(Integer physics, Integer maths, Integer chemistry, Integer english, Integer hindi){
        marksOfPhysics=physics;
        marksOfMaths=maths;
        marksOfChemistry=chemistry;
        marksOfEnglish=english;
        marksOfHindi=hindi;
    }
   void getMarks(){
       System.out.println(marksOfPhysics);
       System.out.println(marksOfMaths);
       System.out.println(marksOfChemistry);
       System.out.println(marksOfEnglish);
       System.out.println(marksOfHindi);
   }
   public Integer maximumMarks(){
        Integer maxMark = marksOfPhysics;
        if (marksOfMaths>maxMark)
            maxMark=marksOfMaths;
        if (marksOfMaths>maxMark)
            maxMark=marksOfMaths;
        if (marksOfChemistry>maxMark)
            maxMark=marksOfChemistry;
        if (marksOfEnglish>maxMark)
            maxMark=marksOfEnglish;
        if (marksOfHindi>maxMark)
            maxMark=marksOfHindi;
        return maxMark;
   }
   public Double averageMarks(){
        Double avg = (double) ((marksOfHindi+marksOfPhysics+marksOfEnglish+marksOfChemistry+marksOfMaths)/5);
        return avg;
   }
   public Boolean isPass(int pMarks){
        Boolean result = true;
        if (marksOfPhysics<pMarks)
            result=false;
        if (marksOfMaths<pMarks)
           result=false;
        if (marksOfChemistry<pMarks)
           result=false;
        if (marksOfEnglish<pMarks)
           result=false;
        if (marksOfHindi<pMarks)
           result=false;
        return result;
   }
   
}





public class WrapperClass {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println(c1.getArea());
        MarkSheet m1 = new MarkSheet();
        m1.setMarks(50,60,40, 80, 60);
        m1.getMarks();
        System.out.println(m1.maximumMarks());
        System.out.println(m1.averageMarks());
        m1.isPass(20);


    }

}
