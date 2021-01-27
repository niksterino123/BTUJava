package ge.edu.btu;

public class Passenger {
    private String name;
    private boolean ticket;

    public Passenger(String newName, boolean newTicket){
        name = newName;
        ticket = newTicket;
    }

    public String getName(){
        return name;
    }
    public boolean hasTicket(){
        return ticket;
    }

}