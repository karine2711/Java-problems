import Problem1.Empty;
import Problem1.Filled;
import problem2.UpperToggle;
import problem3.Animate;

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
