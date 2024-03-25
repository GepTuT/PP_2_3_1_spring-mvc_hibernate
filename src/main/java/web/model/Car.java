package web.model;

public class Car {


    private String brand;
    private String model;
    private int series;
    private int price;

    public Car(String brand, String model, int series, int price) {
        this.brand = brand;
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringBuilder("Car{")
                .append("brand='").append(brand).append('\'')
                .append(", model='").append(model).append('\'')
                .append(", series='").append(series).append('\'')
                .append(", price='").append(price).append('\'')
                .toString();
    }


}
