/*
 * Class modifier: 1.Public 2.Default 3.Final 4.Abstarct 5.strictfp
 
 * Why class modifier? Because class modifier tell us about which class type can
create child class or which class can make objects. And also it gives informn
 about that class to the jvm.

 */
package p1;

import p2; // A folder is created in path named p1

public class ClassModifierDemo1 extends PublicDemo1 {

    public static void main(String[] args) {
        PubicDemo1 obj1 = new PublicDemo1();
        // object created
    }
}
