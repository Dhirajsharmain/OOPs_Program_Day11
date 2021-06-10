package model;

public class InventoryPropertiesMap {
    String name;
    long weight;
    long pricePerKg;
    long Value;

    public long getValue() {
        return Value;
    }

    public void setValue(long value) {
        Value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(long pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "InventoryPropertiesMap{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
