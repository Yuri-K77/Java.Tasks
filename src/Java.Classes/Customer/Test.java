/*
Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти
данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

Customer: id, Фамилия, Имя, Отчество, адрес, номер кредитной карточки, номер банковского счета.

Создать массив объектов. Вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */

package Java.Classes.Customer;

import java.util.*;


public class Test {
    public static void main(String[] args) {
        Shop megamarket = new Shop("Megamarket");

        megamarket.addCustomerToShopList(new Customer("Иван", "Сергеевич", "Козлов", "Беларусь", 12345, 12345));
        megamarket.addCustomerToShopList(new Customer("Андрей", "Антонович", "Буглак", "Молдова", 23456, 23456));
        megamarket.addCustomerToShopList(new Customer("Богдан", "Юрьевич", "Цеслер", "Польша", 34567, 34567));
        megamarket.addCustomerToShopList(new Customer("Виктор", "Николаевич", "Шубенков", "Украина", 45678, 45678));
        megamarket.addCustomerToShopList(new Customer("Оливия", "Петровна", "Ростинова", "Латвия", 56789, 56789));
        megamarket.addCustomerToShopList(new Customer("Наталья", "Феликсовна", "Завьялова", "Россия", 67890, 67890));
        megamarket.addCustomerToShopList(new Customer("Полина", "Ростиславовна", "Жигаева", "Украина", 78900, 78901));
        megamarket.addCustomerToShopList(new Customer("Юрий", "Александрович", "Нугаев", "Беларусь", 89000, 89012));
        megamarket.addCustomerToShopList(new Customer("Пётр", "Сергеевич", "Александров", "Беларусь", 90123, 90123));
        megamarket.addCustomerToShopList(new Customer("Станислав", "Александрович", "Цеслюк", "Украина", 88888, 10234));

        System.out.println("\nSort by name:");
        List<Customer> listSortByName = megamarket.getListByName();
        for (Customer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nPrint customers by diapazon credit card:");
        List<Customer> listSortByDiapazonCreditCard = megamarket.getListByDiapasonCreaditCard(11111, 10000);
        for (Customer c : listSortByDiapazonCreditCard) {
            System.out.println(c);
        }
    }
}