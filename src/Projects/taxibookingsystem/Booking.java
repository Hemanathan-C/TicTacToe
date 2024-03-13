package Projects.taxibookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    public static void bookTaxi(int customerID,char pickupPoint,char dropPoint,int pickupTime,List<Taxi> freeTaxis) {
        int min = 999;
        int distanceBetweenPickUpAndDrop = 0;
        int earnings = 0;
        int nextFreeTime = 0;
        char nextSpot = 'Z';
        Taxi bookedTaxi = null;
        String tripDetail = "";

        for (Taxi t : freeTaxis) {
            int distanceBetweenCustomerAndTaxi = Math.abs((t.currentSpot - '0') - (pickupPoint - '0')) * 15;
            if (distanceBetweenCustomerAndTaxi < min) {
                bookedTaxi = t;
                //distance between pickup and drop = (drop - pickup) * 15KM
                distanceBetweenPickUpAndDrop = Math.abs((dropPoint - '0') - (pickupPoint - '0')) * 15;

                //trip earning = 100 + (distanceBetweenpickUpandDrop-5) * 10
                earnings = (distanceBetweenPickUpAndDrop - 5) * 10 + 100;

                //drop time calculation
                int dropTime = pickupTime + distanceBetweenPickUpAndDrop / 15;

                //when taxi will be free next
                nextFreeTime = dropTime;

                //taxi will be at drop point after trip
                nextSpot = dropPoint;

                // creating trip detail
                tripDetail = customerID + "               " + customerID + "          " + pickupPoint + "      " +
                        dropPoint + "       " + pickupTime + "          " + dropTime + "           " + earnings;
                min = distanceBetweenCustomerAndTaxi;
            }

        }
        //setting corresponding details to allotted taxi
        bookedTaxi.setDetails(nextSpot, nextFreeTime, bookedTaxi.totalEarnings + earnings, tripDetail);
        //BOOKED SUCCESSFULLY
        System.out.println("Taxi " + bookedTaxi.id + " booked");
    }

    public static List<Taxi> createTaxis(int n)
    {
        List<Taxi> List_Of_Taxi = new ArrayList<Taxi>();
        // creating taxi's
        for(int i=1 ;i <=n;i++)
        {
            Taxi t = new Taxi();
            List_Of_Taxi.add(t);
        }
        return List_Of_Taxi;
    }

    public static List<Taxi> getAvailableTaxi(List<Taxi> taxis,int pickupTime,char pickupPoint)
    {
        List<Taxi> freeTaxis = new ArrayList<Taxi>();
        for(Taxi t : taxis)
        {
            if(t.freeTime <= pickupTime && (Math.abs((t.currentSpot - '0') - (pickupPoint - '0')) <= pickupTime - t.freeTime)) {
                freeTaxis.add(t);
            }
        }
        return freeTaxis;
    }
}
