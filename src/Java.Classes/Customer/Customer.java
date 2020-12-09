package Java.Classes.Customer;

class Customer {
        {
            idGenerator++;
        }

        private static int idGenerator = 0;
        private int id = idGenerator;
        private String name;
        private String name2;
        private String name3;
        private String address;
        private int creditCardId;
        private int bankNumberCard;

        Customer(String firstName, String middleName, String lastName, String country, int creditCardId, int bankNumberCard) {
            this.name = firstName;
            this.name2 = middleName;
            this.name3 = lastName;
            this.address = country;
            this.creditCardId = creditCardId;
            this.bankNumberCard = bankNumberCard;
        }
        public String getName() {
            return name;
        }
        public String getName2() {
            return name2;
        }
        public String getName3() {
            return name3;
        }
        public String getAddress() {
            return address;
        }
        public int getCreditCardId() {
            return creditCardId;
        }
        public int getBankNumberCard() {
            return bankNumberCard;
        }
        public String toString() {
            return String.format("ID: %d\t name: %s\t name2: %s\t name3 %s \t from: %s\t credit card %d\t bank number %d", id, name, name2, name3, address, creditCardId, bankNumberCard);
        }
}