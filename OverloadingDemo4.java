//
class Animal {

}

class Monkey extends Animal {

}

class OverloadingDemo4 {
    void m1(Animal a) {
        System.out.println("this is from animal");

    }

    void m1(Monkey m) {
        System.out.println("this is from monkey");
    }

}

class Over4 {
    public static void main(String[] args) {
        OverloadingDemo4 obj1 = new OverloadingDemo4();

        Animal a1 = new Animal();
        Monkey m1 = new Monkey();
        Animal a2 = new Animal();
        // Overloading ==> Compiler ==> Based on object reference
        obj1.m1(a2);

    }
}
