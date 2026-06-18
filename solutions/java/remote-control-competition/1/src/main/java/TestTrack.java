import java.util.*;
import java.util.Collections;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> sortedList = new ArrayList<>(cars);
        Collections.sort(sortedList);
        return sortedList;
    }
}
