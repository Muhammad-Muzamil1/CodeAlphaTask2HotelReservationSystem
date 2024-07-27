import java.util.*;

public class main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        RoomCategory r = new RoomCategory();

        System.out.println("&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%");
        System.out.println("\tWELCOME TO HOTEL RESERVATION SYSTEM:");
        System.out.println("&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%&%\n"); 

        while (true) {
        
        System.out.println("----------------------------------------------\n");
        System.out.println("Enter 1 for Make Reservation\nEnter 2 for Booking Details\nEnter 3 for Check Avaliable Rooms\n");
        System.out.println("----------------------------------------------");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:         
                    r.reserve();
                break;
            case 2:
                    r.BookingDetails();
                break;

            case 3:
                AvaliableRooms rooms = new AvaliableRooms();
                rooms.checkAvalability();
                break;
                
            default:
                System.out.println("Please Enter Correct Input :)");
                break;
        }
        
        }
    }
}