/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
- каждый класс должен иметь отражающее смысл название и информативный состав;
- использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция;
- наследование должно применяться только тогда, когда это имеет смысл;
- при кодировании должны быть использованы соглашения об оформлении кода Java code convention;
- классы должны быть грамотно разложены по пакетам;
- консольное меню должно быть минимальным;
- для хранения параметров инициализации можно использовать файлы.

Задание "Железнодорожный транспорт":
Определить иерархию подвижного состава железнодорожного транспорта. Создать пассажирский поезд.
Подсчитать общую численность пассажиров и багажа. Провести сортировку вагонов поезда на основе уровня комфортности.
Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.
 */

package Java.Collections;

import Java.Collections.Wagons.ComfortWagon;
import Java.Collections.Wagons.CommonWagon;
import Java.Collections.Wagons.Wagon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Java.Collections.Train train = new Train("Москва");
        System.out.println(train.toString());

        Passenger Pol = new Passenger ("male", "Paul", 45);
        Passenger John = new Passenger ("male", "John", 54);
        Passenger Nick = new Passenger ("male", "Nick", 32);
        Passenger Roger = new Passenger ("male", "Roger", 28);

        Baggage bag1 = new Baggage("BigBag", 50);
        John.addBaggage(bag1);
        John.addBaggage(bag1);
        John.addBaggage(bag1);
        John.addBaggage(bag1);
        John.addBaggage(bag1);
        John.addBaggage(bag1);

        Pol.addBaggage("SmallBag", 10);

        Nick.addBaggage(bag1);
        Nick.addBaggage(bag1);
        Nick.addBaggage(bag1);

        Roger.addBaggage(bag1);

        Wagon common1 = new CommonWagon();
        common1.addPassenger(Pol);
        try {common1.addPassenger(Pol);}
        catch (Exception ex){
        ex.printStackTrace();
        }
        Wagon common2 = new CommonWagon();
        common2.addPassenger(Nick);
        Wagon common3 = new CommonWagon();
        common3.addPassenger(Roger);
        Wagon comfort = new ComfortWagon();
        comfort.addPassenger(John);

        train.addWagon(common1);
        train.addWagon(common2);
        train.addWagon(common3);
        train.addWagon(comfort);

        train.setSpeed(120);
        System.out.println(train.toString());

        for(Wagon wagon: train.waggonList){
            System.out.println(wagon.toString());
        }
    }
}