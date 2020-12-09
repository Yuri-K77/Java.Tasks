package Java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Passenger {
    private String gender;
    private String name;
    private int age;
    private List<Baggage> baggageList = new ArrayList<Baggage>();

    public Passenger(String gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public void addBaggage(String baggageName, double baggageWeight) {
        Baggage baggage = new Baggage(baggageName, baggageWeight);
        this.baggageList.add(baggage);
    }

    public void addBaggage (Baggage baggage) {
        this.baggageList.add(baggage);
    }

    public void removeBaggage() {
        this.baggageList.clear();
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Baggage> getBaggageList() {
        return baggageList;
    }

    public int getBaggageCount() {
        return baggageList.size();
    }

    public double getBaggageWeight() {
        double sum = 0.0;
        for (Baggage baggage: baggageList) {
            sum = sum + baggage.baggageWeight;
        }
        return sum;
    }
}