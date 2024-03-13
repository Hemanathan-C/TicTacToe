package Projects.taxibookingsystem;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static Projects.taxibookingsystem.Booking.*;

public class App {
    public static void main(String[] args)
    {
        List<Taxi> taxis = createTaxis(4);

        Scanner s = new Scanner(System.in);
        int id = 1;

        while(true)
        {
            System.out.println("0 - > Book Taxi");
            System.out.println("1 - > Print Taxi details");
            int choice = s.nextInt();
            switch(choice)
            {
                case 0:
                {
                    int customerID = id;
                    System.out.println("Enter Pickup point");
                    char pickupPoint = s.next().charAt(0);
                    System.out.println("Enter Drop point");
                    char dropPoint = s.next().charAt(0);
                    System.out.println("Enter Pickup time");
                    int pickupTime = s.nextInt();

                    if(pickupPoint < 'A' || dropPoint > 'F' || pickupPoint > 'F' || dropPoint < 'A')
                    {
                        System.out.println("Valid pickup and drop are A, B, C, D, E, F. Exitting");
                        return;
                    }
                    List<Taxi> freeTaxis = getAvailableTaxi(taxis,pickupTime,pickupPoint);

                    if(freeTaxis.size() == 0)
                    {
                        System.out.println("No Taxi can be alloted. Exitting");
                        return;
                    }

                    //sort taxis based on earnings
                    Collections.sort(freeTaxis,(a, b)->a.totalEarnings - b.totalEarnings);
                    // 3,4,2 - > 2,3,4

                    //get free Taxi nearest to us
                    bookTaxi(id,pickupPoint,dropPoint,pickupTime,freeTaxis);
                    id++;
                    break;
                }
                case 1:
                {
                    //two functions to print details
                    for(Taxi t : taxis)
                        t.printTaxiDetails();
                    for(Taxi t : taxis)
                        t.printDetails();
                    break;
                }
                default:
                    return;
            }
        }
    }
}
