interface InterfaceDemo2 {
    void m1();

    void m2();

   abstract class test implements InterfaceDemo2{
        abstract void m3(){

        }
        class test2 extends test{
            public void m1(){

            }
        }
}
