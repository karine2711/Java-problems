package Homework_13_12_2019;

public class Cake {
    public Cake() {
    }

    public Cake(String name, String[] ingredients, String brand, String form, String color, String event,
                Human baker, int length, int numberOfFloors, double price, int numberOfGuests,
                double ccalPerPiece, boolean isDesignedForChildren) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.event = event;
        this.baker = baker;
        this.numberOfFloors = numberOfFloors;
        this.price = price;
        this.numberOfGuests = numberOfGuests;
        this.ccalPerPiece = ccalPerPiece;
        this.isDesignedForChildren = isDesignedForChildren;
    }

    private String name;
    private String brand;
    private String color;
    private String event = "none";
    private Human baker;
    private int numberOfFloors = 1;
    private double price;
    private int numberOfGuests = 5;
    private double ccalPerPiece = 500;
    private boolean isDesignedForChildren = false;

    public boolean isDesignedForChildren() {
        return isDesignedForChildren;
    }

    public void setDesignedForChildren(boolean designedForChildren) {
        isDesignedForChildren = designedForChildren;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Human getBaker() {
        return baker;
    }

    public void setBaker(Human baker) {
        this.baker = baker;
    }



    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public double getCcalPerPiece() {
        return ccalPerPiece;
    }

    public void setCcalPerPiece(double ccalPerPiece) {
        this.ccalPerPiece = ccalPerPiece;
    }


    //Methods
    public static void print(Cake cake) {
        System.out.println(cake.name + " from brand " + cake.brand + " baked by " + cake.baker.firstname + " price: " + cake.price);
    }

    public static void print(Cake[] cakes) {
        for (Cake element : cakes)
            print(element);
    }

    public static void sortAscendPrice(Cake[] cakes) {
        System.out.println("-----------------------------");
        System.out.println("Sorted by price");
        for (int i = cakes.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (cakes[j].price > cakes[j + 1].price) {
                    Cake temp = cakes[j];
                    cakes[j] = cakes[j + 1];
                    cakes[j + 1] = temp;
                }
            }
        }
    }

    public static void filterByEvent(String newevent, Cake[] cakes) {
        System.out.println("-----------------------------");
        System.out.println("Filtered by event" + newevent);
        for (Cake element : cakes)
            if (element.event.equals(newevent))
                print(element);
    }

    public static void printCakesDesignedForChildren(Cake[] cakes) {
        System.out.println("These cakes are designed for children's events");
        for (Cake element : cakes)
            if (element.isDesignedForChildren)
                print(element);
    }

    public static void filterByNumberOfGuestsInRange(int a, int b, Cake[] cakes) {
        System.out.println("-----------------------------");
        System.out.println("Here are some guests that will be enough for " + a + " to " + b + " people");
        for (Cake element : cakes)
            if (element.numberOfGuests >= a && element.numberOfGuests <= b)
                print(element);
    }

    public static void sortDescendByBakersRating(Cake[] cakes) {
        System.out.println("-----------------------------");
        System.out.println("Sorted by bakers' rating");
        for (int i = cakes.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (cakes[j].baker.rating< cakes[j + 1].baker.rating) {
                    Cake temp = cakes[j];
                    cakes[j] = cakes[j + 1];
                    cakes[j + 1] = temp;
                }
            }
        }
    }
    public void getFullInformationOfBaker(){
        System.out.println("--------------------");
        System.out.println("Information about the baker of "+this.name);
        System.out.println("Firstname: "+this.baker.firstname);
        System.out.println("Lastname: "+this.baker.lastname);
        System.out.println("Gender: "+this.baker.gender);
        System.out.println("Age: "+this.baker.age);
        System.out.println("Rating: "+this.baker.rating);
    }

}
