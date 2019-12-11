package Homework_13_12_2019;

public class Main {
    public static void main(String[] args) {
        //add some bakers
     Human Ruzan=new Human("Ruzan","Mkrtchyan",'f',45,4.5F);
     Human Anna=new Human("Anna","Chobanyan",'f',30,3.2F);
        Human Poxos=new Human("Poxos","Poxosyan",'m',60,5.0F);
      //add some properties of cake1
        Cake cake1=new Cake();
        cake1.setName("Mikado");
        cake1.setBrand("Nomani");
        cake1.setBaker(Ruzan);
        cake1.setNumberOfGuests(10);
cake1.setPrice(20);
        //add some properties of cake2
        Cake cake2=new Cake();
        cake2.setName("Little Car");
        cake2.setBrand("Lucky");
        cake2.setBaker(Anna);
        cake2.setNumberOfGuests(25);
        cake2.setDesignedForChildren(true);
        cake2.setEvent("Birthday");
        cake2.setPrice(450);
        //add some properties of cake3
        Cake cake3=new Cake();
        cake3.setName("Luxury tower");
        cake3.setBrand("Lucky");
        cake3.setBaker(Poxos);
        cake3.setNumberOfGuests(150);
        cake3.setNumberOfFloors(5);
        cake3.setEvent("Wedding");
        cake3.setPrice(300);
 Cake cakes[]={cake1,cake2,cake3};
Cake.sortAscendPrice(cakes);
Cake.print(cakes);
Cake.filterByEvent("Birthday",cakes);
Cake.printCakesDesignedForChildren(cakes);
Cake.filterByNumberOfGuestsInRange(11,800,cakes);
Cake.sortDescendByBakersRating(cakes);
Cake.print(cakes);
cake1.getFullInformationOfBaker();
    }
}
