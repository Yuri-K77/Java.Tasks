package Java.Collections;

import Java.Collections.Wagons.Wagon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Train{
    String name;
    int speed;
    List<Wagon> waggonList = new ArrayList<Wagon>();

    public Train(String name) {
        this.name = name;
    }

    public void addWagon(Wagon name) {
        waggonList.add(name);
    }

    public int getCountOfWagons() {
        return this.waggonList.size();
    }

    public int getCountOfPassengers() {
        int sum = 0;
        for (Wagon wagon : waggonList) {
            sum = sum + wagon.getPassengersQuantity();
        }
        return sum;
    }

    public int getCountOfBaggage(){
        int sum = 0;
        for (Wagon wagon : waggonList) {
            for (Passenger pass:wagon.getPassengerArrayList()) {
                sum = sum + pass.getBaggageCount();
            }
        }
        return sum;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeithOfBaggage() {
        double sum = 0.0;
        for (Wagon wagon : waggonList) {
            for (Passenger pass: wagon.getPassengerArrayList()) {
                sum += pass.getBaggageWeight();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.format("Train name: %s, speed: %d, length: %d of wagons, passengers: %d people, baggage: %d items %f kg", name, speed, getCountOfWagons(), getCountOfPassengers(), getCountOfBaggage(), getWeithOfBaggage());
    }
}