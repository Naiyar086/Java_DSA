package com.bytecode.client;

import java.util.Scanner;
import com.bytecode.factory.Factory1;
import com.bytecode.abstract1.Courier1;
import com.bytecode.child.*;

public class ClientApp {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter name of Courier Company");
        String courierCompanyName = sc.next();
        Courier1 obj1 = Factory1.getObject(courierCompanyName);
        obj1.Delivery();
    }
}
