class Contact{
    long id;
    String firstName;
    String lastName;
    String mobileNo;
    String emailId;
    public void setData(int c_id, String fName, String lName, String mNum, String e_id ){
        id = c_id;
        firstName=fName;
        lastName=lName;
        mobileNo=mNum;
        emailId=e_id;
    }
    public void getData(){
        System.out.println(id);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(mobileNo);
        System.out.println(emailId);
    }

}
public class Class5 {
    public static void main(String[] args) {
        Contact c1 = new Contact();
        c1.setData(209, "Prakash","Pandey","967362672", "pkumar17@gmail.com");
        c1.getData();
    }
}
