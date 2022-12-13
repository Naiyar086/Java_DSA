interface I1 {
    int x = 100;
}

interface I2 {
    int x = 10;
}

interface VariableNamingConflict {

}

class test implements I2, I1 {
    public static void main(String[] args) {
        System.out.println(I2.x);
    }
}
