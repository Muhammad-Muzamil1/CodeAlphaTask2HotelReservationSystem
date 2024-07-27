import java.util.*;

public class AvaliableRooms{

    public void checkAvalability(){

        ArrayList Roomslist = new ArrayList<>();
        RoomCategory AR = new RoomCategory();

        System.out.println("The List of Avalaiable Rooms Are:\n");
        
        Roomslist.addAll(AR.AvaRooms());
        System.out.println("******************************************************");
        System.out.println(Roomslist);
        System.out.println("******************************************************");

    }
}
