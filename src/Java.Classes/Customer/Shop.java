package Java.Classes.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Shop {
        private String shopName;
        private ArrayList<Customer> customersList = new ArrayList<>();

        Shop(String shopName) {
            this.shopName = shopName;
        }

        void addCustomerToShopList(Customer customer) {
            customersList.add(customer);
        }

        List<Customer> getListByName() {
            List<Customer> list = new ArrayList<>(customersList);
            Collections.sort(list, (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
            return list;
        }

        List<Customer> getListByDiapasonCreaditCard(int diapazonStart, int diapazonEnd) {
            List<Customer> list = new ArrayList<>();
            for (Customer c : customersList) {
                if (c.getCreditCardId() >= diapazonStart && c.getCreditCardId() >= diapazonEnd) {
                    list.add(c);
                }
            }
            return list;
        }
}