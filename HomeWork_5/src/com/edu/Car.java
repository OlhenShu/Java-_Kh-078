package com.edu;

public class Car {
    private String type;
    private int productionYear;
    private float engineCapacity;

    public Car() {
    }

    public Car(String type, int productionYear, float engineCapacity) {
        this.type = type;
        this.productionYear = productionYear;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car (type: " + this.getType() +
                "; production year: " + this.getProductionYear() +
                "; engine capacity: " + this.getEngineCapacity() + ")";
    }
}
