abstract class Courier {

    public abstract Courier courierDelivery();
}

class Ekart extends Courier {
    public Ekart courierDelivery() {
        System.out.println("This is from Ekart");
        return new Ekart;
    }
}

class DTDC extends Courier {
    public DTDC courierDelivery() {
        System.out.println("This is from DTDC");
        return new DTDC;
    }
}

class BlueDart extends Courier {
    public BlueDart courierDelivery() {
        System.out.println("This is from Bluedart");
        return new BlueDart;
    }
}

class client {
    public static void main(String[] args) {
        Courier obj1 = Factory.();
        obj1.Delivery();
    }
}