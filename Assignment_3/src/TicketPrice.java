public class TicketPrice {
    public static void main(String[] args) {
        int age=30;
        char gender='f';
        if(gender=='m')
        {
            if(age>50)
                System.out.println("Ticket Price is Rs 10");
            else
                System.out.println("Ticket Price is Rs 40");
        }
        else
        {
            if(age<30)
                System.out.println("Ticket Price is Rs 50");
            else
                System.out.println("Ticket Price is Rs 40");
        }
    }
}
