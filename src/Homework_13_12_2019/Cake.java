package Homework_13_12_2019;

public class Cake {
    private String name;
    private String[] ingredients;
    private String brand;
    private String form;
    private String color;
    private String event;
    private Human baker;
    private int length;
    private int numberOfFloors;
    private double price;
    private int numberOfGuests;
    private double ccalPerPiece;
    private boolean isDesignedForChildren;

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

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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
    public  void print(Cake cake){
        System.out.println(cake.name + " from brand "+cake.brand+" baked by "+cake.baker.firstname);
    }
    public void sortAscendPrice(Cake[] cakes) {
        for (int i = cakes.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (cakes[i].price > cakes[i + 1].price) {
                    Cake temp = cakes[i];
                    cakes[i] = cakes[i + 1];
                    cakes[i + 1] = temp;
                }
            }
        }
    }
    public void filterByEvent(String newevent, Cake[] cakes){
        for(Cake element:cakes)
            if(element.event.equals(newevent))
                print(element);
    }
    public void printCakesDesignedForChildren(Cake[] cakes){
        for(Cake element:cakes)
            if(element.isDesignedForChildren)
                print(element);
    }

}
