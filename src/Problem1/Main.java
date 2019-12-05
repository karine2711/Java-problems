package Problem1;

public class Main {
    public static void main(String[] args) {


        //chap@ 16 e
        int n=8;
        
       Filled  object=new Filled();
object.printSectionA(n);
        object.printSectionB();
        object.printSectionC(n);
        object.printSectionD(n);
        object.printSectionE();
        object.printSectionF(n);
Empty object2=new Empty();
        object2.printSectionA(n);
        object2.printSectionB();
        object2.printSectionC(n);
        object2.printSectionD(n);
        object2.printSectionE();
        object2.printSectionF(n);
    }
}
