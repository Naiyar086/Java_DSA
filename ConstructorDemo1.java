/*Syntax:
class classname {
    void method{

    }
    classname(Parameters){

    }
}
// 1. same name of the class
2. Body of the method
3. 
Why we should go for constructor?
Answer= To initialize an object.
      At the time of object creation
*/
class ConstructorDemo1 {
    ConstructorDemo1(){
        System.out.println("this is from constructor");
    }
    //1. At the time of object creation.
    public static void main(String[] args) {
        ConstructorDemo1 obj1=new ConstructorDemo1();
        ConstructorDemo1 obj2=new ConstructorDemo1();
        ConstructorDemo1 obj3=new ConstructorDemo1();

        System.out.println("This is from main method");
    }
    

    }
}
