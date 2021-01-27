package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Passenger> passengerList = new ArrayList<>();
    public void addPassenger(Passenger newPassenger) {
        if (newPassenger.hasTicket())
            passengerList.add(newPassenger);
    }

    public List<Passenger> getPassengerList(){
        return passengerList;
    }

}
