class TestSingleton {
    // for singleton we need private constructor.
    private TestSingleton() {

    }

    // Factory Method
    static TestSingleton getTestSingleton() {
        if (obj1 == null) {
            obj1 = new TestSingleton();
        }
        return obj1;
    }
}

class SIngletonDemo1 {

    public static void main(String[] args) {
        TestSingleton obj1 = TestSingleton.getTestSingleton();
        TestSingleton obj2 = TestSingleton.getTestSingleton();
        TestSingleton obj3 = TestSingleton.getTestSingleton();
        System.out.println("Address of obj1: " + obj1.hashCode());
        System.out.println("Address of obj2: " + obj2.hashCode());
        System.out.println("Address of obj3: " + obj3.hashCode());
        System.out.println(obj1 = obj2);

    }
}
