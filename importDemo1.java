/* import java.util.* 
import java.sql.* --implicit import
*/
/*import java.util.Scanner
import java.util.ArrayList==explicit import
*/
class importDemo1 {
    // System.out.println("This is from import class");
    public static void main(String[] args) {
        // CurrentFolder cf1 = new CurrentFolder();
        /*
         * java.util.Date d1 = new java.Util.Date(); java.util.Scanner = new
         * java.util.Scanner(System.in); java.util.ArrayList = new
         * java.util.ArrayList(); java.sql.Connection c1=null; java.sql.Statement
         * s1=null; Instead of this java has import command to use.
         */
        // cf1.method1();
        Date d1 = new Date();
        Scanner s1 = new Scanner(System.in);
        ArrayList a1 = new ArrayList();
        LinkedList l1 = new LinkedList();
        Connection c1 = null;
        Statement st1 = null;
        System.out.println("This is from import");
    }
}
