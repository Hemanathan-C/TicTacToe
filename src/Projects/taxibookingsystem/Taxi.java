package Projects.taxibookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    static int taxiCount = 0;
    int id;
    char currentSpot;
    int freeTime;
    int totalEarnings;
    List<String> trips;

    public Taxi(){
        currentSpot='A';
        freeTime = 6;
        totalEarnings=0;
        trips = new ArrayList<>();
        taxiCount+=1;
        id=taxiCount;
    }

    public void setDetails(char currentSpot,int freeTime,int totalEarnings,String tripDetail){
        this.currentSpot=currentSpot;
        this.freeTime=freeTime;
        this.totalEarnings=totalEarnings;
        this.trips.add(tripDetail);
    }

    public void printDetails(){
        System.out.println("Taxi - "+ this.id + " Total Earnings - " + this.totalEarnings);
        System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");
        for(String trip : trips)
        {
            System.out.println(id + "          " + trip);
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public void printTaxiDetails(){
        //print total earningand taxi details like current location and free time
        System.out.println("Taxi - "+ this.id + " Total Earnings - " +
                this.totalEarnings + " Current spot - " + this.currentSpot +" Free Time - " + this.freeTime);
    }
}
