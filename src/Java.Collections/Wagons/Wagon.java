package Java.Collections.Wagons;

import Java.Collections.Passenger;
import java.util.ArrayList;
import java.util.List;


public abstract class Wagon {
    private String categoryOfWagon;
    private int maxQuantityOfSeats;
    private List<Passenger> passengerArrayList = new ArrayList<Passenger>();

    protected Wagon(String categoryOfWagon, int quantityOfSeats) {
        this.categoryOfWagon = categoryOfWagon;
        this.maxQuantityOfSeats = quantityOfSeats;
    }

    public void addPassenger(Passenger name) throws Exception {
        if(this.passengerArrayList.size() < maxQuantityOfSeats){
            passengerArrayList.add(name);
        }
        else {
            throw new Exception("No seats available");
        }
    }

    public String getCategoryOfWagon() {
        return categoryOfWagon;
    }

    public int getPassengersQuantity() {
        return passengerArrayList.size();
    }

    public List<Passenger> getPassengerArrayList() {
        return passengerArrayList;
    }

    @Override
    public String toString() {
        return String.format("Wagon type: %s, count of passengers: %d", categoryOfWagon, this.getPassengersQuantity());
    }
}