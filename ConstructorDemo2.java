class Customer {
    String name;
    String address;

    Customer() {
        System.out.println("This is from default constructor" + this.hashCode());
    }

    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void Display() {
        System.out.println("Name of customer:: " + name);
        System.out.println("Address of customer:: " + address);
    }
}

class ConstructorDemo2 {
    public static void main(String[] args) {
        Customer c1 =new Customer("raja","kanpur");
        System.out.println("This is from customer 1");
        Customer c2=new Customer("rani","Kolkata");
        Customer c3=new Customer("Fraud","Bangalore");

        c1.
    }

}
