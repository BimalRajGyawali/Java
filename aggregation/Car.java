package aggregation;

public class Car
{
    /*Aggregation means creating a class type variable
    * in another class.
    *
    *  Aggregation can be used in those classes which shows
    *  Has-A relationship. Example : Employee Has A Car
    *
    */

    private String model;
    private double price;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
