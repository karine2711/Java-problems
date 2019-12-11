package problems04_12_2019;

import problems04_12_2019.Problem1.*;
import problems04_12_2019.problem2.*;
import problems04_12_2019.problem3.*;

public class Main {
    public static void main(String[] args) {


        //chap@ 16 e
        int n = 8;

        Filled object = new Filled();
        object.printSectionA(n);
        object.printSectionB();
        object.printSectionC(n);
        object.printSectionD(n);
        object.printSectionE();
        object.printSectionF(n);
        Empty object2 = new Empty();
        object2.printSectionA(n);
        object2.printSectionB();
        object2.printSectionC(n);
        object2.printSectionD(n);
        object2.printSectionE();
        object2.printSectionF(n);
        String text = "hello world";
        UpperToggle textobj = new UpperToggle();
        textobj.toggle(text);
        Animate animation = new Animate();
        animation.clock();
    }
}
