import java.util.*;

public class payment {

    public void paymentmethod(int Total, int Days){

        Scanner sc = new Scanner(System.in);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Your Total Bill is Rs."+Total*Days+"--");
        System.out.println("In which Method You Want to PAYMENT:\n1. PayPal\n2. Visa Pay");
        System.out.println("$$$$$$$$&&&&&&&&&$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ \n");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                    System.out.println("Enter Your PayPal Number: ");
                    int paypal = sc.nextInt();
                    System.out.println("Your Payment is Successfully Transferred (:\n");
                break;
        
            case 2:
                    System.out.println("Visa Pay Number: ");
                    int visapay = sc.nextInt();
                    System.out.println("Your Payment is Successfully Transferred (:");
                break;

            default:
                System.out.println("Please Enter the Correct Input (:");
                break;
        }

        System.out.println("!!!!!!!!!!!!!---SUCCECCFULLY BOOKED THE ROOM---!!!!!!!!!!!!!!!!!!!!!!!\n");
        System.out.println("Your Room has Booked Please Do not Break or Steal anything from Room\nNOTE: The Room should be in same position when you are leaving (:\nI Hope You Enjoy our Service\nFeedback us If anything which In your Thoughts Must be Improved\n");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n");
    }
}
