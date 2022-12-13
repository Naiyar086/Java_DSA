//dEFAULT CONSTRUCTOR:
class Test {
    Test() {
        System.out.println("This is from test class zero constructor");
    }

    Test(int x) {
        System.out.println("This is from test int class constructor");
    }
}

public class ConstructorDem3extends

Test
{

    ContsructorDemo3(){
        this(10);
    System.out.println("this is from constructor===zero para");
    }

    ContsructorDemo3(int a){
        this(20,30);
        System.out.println("this is from constructor===int");

    }

    ContsructorDemo3(int b,int c){
        this(40,50,60);
        System.out.println("this is from constructor===int,int para");

    }

    ContsructorDemo3(int d,int e,int f){
        this();
        System.out.println("this is from constructor===int,int,int para");

    }

    public static void main(String[] args) {
        ConstructorDemo3 obj1 = new ConstructorDemo3();
        // ConstructorDemo3 obj2=new ConstructorDemo3(10);
        // ConstructorDemo3 obj3=new ConstructorDemo3(20,30);
        // ConstructorDemo3 obj4=new ConstructorDemo3(40,50,60);
        // ConstructorDemo3 obj5=new ConstructorDemo3();
    }

}
