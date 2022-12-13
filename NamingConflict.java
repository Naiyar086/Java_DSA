interface NamingConflict{
void m1();
//Here we define two methods of same name.
} 
   interface I1{
       void m1();
   }
   class test implements I1,NamingConflict{
       public void m1(){
//Now we have to give body to either one of the interface.
//Behaviour of that body is same for the both interface.

       }
   }
}
/*case 2:
/But if we have same name(Method signature) interfaces but they have different arguments then 
we have to give body to both of the interface.
*/
/*Case 3:
/Method name same but different return type. In this case we also have to give
body to both of the interfaces. But we cannot say that it is correct. It gives
error.
