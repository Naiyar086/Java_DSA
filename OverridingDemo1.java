class Parent {
    void Eat() {
        System.out.println(" Parent=Veg biryani");
    }

    void Drink() {
        System.out.println("Parent=Coca cola");
    }

    void Smoke() {
        System.out.println("Parent=hukka");
    }

    void sleep() {
        System.out.println("Parent=7 hours");
    }

    void Marry() {
        System.out.println("according to my parents");
    }

    void Property() {
        System.out.println("100 crore, 2 kg diamond");
    }
}

class Child1 extends Parent {
    void Drink() {
        System.out.println("Want to drink Soda");
    }

    void Marry() {
        System.out.println("Want to marry a fair girl");

    }

}

class Child2 extends Parent {

}

    // class OverridingDemo1 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.Eat();
        p1.Drink();
        p1.Smoke();
        p1.sleep();
        p1.Marry();
        p1.Property();

        Child1 c1 = new Child1();
        c1.Eat();
        c1.Drink();
        c1.Smoke();
        c1.sleep();
        c1.Marry();
        c1.Property();

    }

}
