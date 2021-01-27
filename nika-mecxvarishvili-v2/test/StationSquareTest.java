import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StationSquareTest {
    @Test
    public void stationTest1(){
        Passenger nika = new Passenger("ნიკა", false);
        Passenger sandro = new Passenger("სანდრო", true);
        Train train = new Train();
        train.addPassenger(nika);
        train.addPassenger(sandro);

        assertEquals(1,train.getPassengerList().size());
    }
}