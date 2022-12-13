//overriding wrt static modifier.....>Method Hiding
abstract class Parent {
    abstract void m1(){
        System.out.println("This is from parent");
    }
}

abstract class Child extends Parent {
    void m1() {
        System.out.println("this is from child");

    }
}

class OverRidingDemo6 {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.m1();
        Child obj2 = new Child();
        obj2.m1();

        Parent obj3 = new Child();
        obj3.m1();
    }
}
