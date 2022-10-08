package labwork5.A.TaskA7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stops = new ArrayList<>();
        stops.add("Ahunbaeva 12");
        stops.add("Maldybaeva 34");
        stops.add("BGTS");

        Tramvai tramvai = new Tramvai(11,"11",16,stops,
                "CATITA",200);

        tramvai.display();

        System.out.println();

        tramvai.driveByRoute();
        tramvai.stopAtPublicTransportStop();
        tramvai.openDoors();
        tramvai.closeDoors();

        System.out.println();

        tramvai.driveByRoute();
        tramvai.stopAtPublicTransportStop();
        tramvai.openDoors();
        tramvai.closeDoors();

        System.out.println();


        tramvai.driveByRoute();
        tramvai.stopAtPublicTransportStop();
        tramvai.openDoors();
        tramvai.closeDoors();

        System.out.println();

        tramvai.driveByRoute();
        tramvai.stopAtPublicTransportStop();
        tramvai.openDoors();
        tramvai.closeDoors();

        System.out.println();

        tramvai.driveByRoute();
        tramvai.stopAtPublicTransportStop();
        tramvai.openDoors();
        tramvai.closeDoors();


        System.out.println();


    }


}
