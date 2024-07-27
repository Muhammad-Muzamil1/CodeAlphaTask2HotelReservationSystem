import java.util.*;

public class RoomCategory {
    private static HashMap<String, String> VIPRooms = new HashMap<>();
    private static HashMap<String, String> ACRooms = new HashMap<>();
    private static HashMap<String, String> OridnaryRooms = new HashMap<>();
    private  ArrayList<String> Avaroomlist = new ArrayList<>();
    private static ArrayList<String> BookingDetail = new ArrayList<>();
    private ArrayList information = new ArrayList();
    private int Total = 0;
    private int Days = 0;

        static {
        Roomsdata();
    }

    // Static method to initialize the rooms
    public static void Roomsdata() {
        VIPRooms.put("VIP1", "0");
        VIPRooms.put("VIP2", "0");
        VIPRooms.put("VIP3", "0");
        VIPRooms.put("VIP4", "0");

        ACRooms.put("AC5", "0");
        ACRooms.put("AC6", "0");
        ACRooms.put("AC7", "0");
        ACRooms.put("AC8", "0");

        OridnaryRooms.put("OR9", "0");
        OridnaryRooms.put("OR10", "0");
        OridnaryRooms.put("OR11", "0");
        OridnaryRooms.put("OR12", "0");
    }

    public void BookingDetails() {

        System.out.println("##################################################");
        System.out.println(BookingDetail);
        System.out.println("##################################################\n");        
    }

    private boolean VIPRoom() {
        boolean flag = false;

        for (String keys : VIPRooms.keySet()) {
            if (VIPRooms.get(keys).equals("0")) {
                VIPRooms.put(keys, "1");
                flag = true;
                BookingDetail.add(keys); 
                break; // Stop after booking one room
            }
        }

        if (!flag) {
            System.out.println("All the Rooms in VIP Rooms Category are Booked");
        }
        return flag;
    }

    private boolean ACRoom() {
        boolean flag = false;

        for (String keys : ACRooms.keySet()) {
            if (ACRooms.get(keys).equals("0")) {
                BookingDetail.add(keys);
                ACRooms.put(keys, "1");
                flag = true;
                break; // Stop after booking one room
            }
        }

        if (!flag) {
            System.out.println("All the Rooms in AC Room Category are Booked");
        }

        return flag;
    }

    private boolean OridnaryRoom() {
        boolean flag = false;

        for (String keys : OridnaryRooms.keySet()) {
            if (OridnaryRooms.get(keys).equals("0")) {
                BookingDetail.add(keys);
                OridnaryRooms.put(keys, "1");
                flag = true;
                break; // Stop after booking one room
            }
        }

        if (!flag) {
            System.out.println("All the Rooms in Oridnary Rooms Category are Booked");
        }

        return flag;
    }

    public ArrayList<String> AvaRooms() {
        Avaroomlist.clear(); // Ensure the list is clear before adding available rooms

        for (String keys : VIPRooms.keySet()) {
            if (VIPRooms.get(keys).equals("0")) {
                Avaroomlist.add(keys);
            }
        }

        for (String keys : ACRooms.keySet()) {
            if (ACRooms.get(keys).equals("0")) {
                Avaroomlist.add(keys);
            }
        }

        for (String keys : OridnaryRooms.keySet()) {
            if (OridnaryRooms.get(keys).equals("0")) {
                Avaroomlist.add(keys);
            }
        }
        return Avaroomlist;
    }

    public void reserve() {

        Scanner sc = new Scanner(System.in);

        System.out.println("____________________________BASIC INFORMATION_____________________________________:");
        System.out.println("\nPlease Provide us some Basic Information to Make your Rervation (:");
        System.out.println("Full Name: ");
        information.add(sc.nextLine());
        
        System.out.println("ID Card Number: ");
        information.add(sc.nextInt());
        
        System.out.println("Phone Number: ");
        information.add(sc.nextInt());
        
        System.out.println("Days to Stay In ROOM: ");
        Days = sc.nextInt();
        information.add(Days);
        

        System.out.println("____________________________________________________________________:\n");
        category();
    }

    public void category() {
        Scanner sc = new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(
                "We have 3 Category Rooms:\n1. VIP Rooms Category per Day Rs.5000\n2. AC Rooms per Day Rs.3500\n3. Oridnary Rooms per Day Rs.2500");
        System.out.println("Select Category: ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int category = sc.nextInt();

        BookingDetail.addAll(information);
        
        boolean roomBooked = false;
        switch (category) {
            case 1:
                roomBooked = VIPRoom();
                Total=5000;
                break;

            case 2:
                roomBooked = ACRoom();
                Total=3500;
                break;

            case 3:
                roomBooked = OridnaryRoom();
                Total=2500;
                break;

            default:
                System.out.println("Please Enter the Correct Input :)");
                break;
        }

        if (roomBooked) {
            payment p = new payment();
            p.paymentmethod(Total, Days);
        }
    }
}
