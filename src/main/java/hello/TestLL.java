package hello;

import java.util.ArrayList;

class TestLL {
    public static void main(String[] args) {
        Greeter greeter=Greeter.getInstance();//this is singleton class instance.
        Greeter greeter1=Greeter.getInstance();
        System.out.println(greeter);
        System.out.println(greeter1);
        System.out.println(greeter.createAndReverseList());
    }
}