package problem3;

import java.lang.reflect.Array;

public class Animate {
    public String[] a = {"|", "/", "|", "\\",};

    public void clock() {
        System.out.println("Problem 3");
        for (;;) {
            for (String element : a) {
                System.out.print("\r");
                System.out.print(String.valueOf(element));
            }
        }


    }
}
