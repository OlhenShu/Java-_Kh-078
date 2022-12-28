package com.edu;

public class Car {
    private String type;
    private int productionYear;
    private double engineCapacity;

    public Car() {
    }

    public Car(String type, int productionYear, double engineCapacity) {
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

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car (type: " + this.getType() +
                "; production year: " + this.getProductionYear() +
                "; engine capacity: " + this.getEngineCapacity() + ")";
    }

    public static boolean isCarExists (Car[] cars, int year) {
        for (Car car : cars) {
            if (year == car.getProductionYear()) { return true; }
        }
        return false;
    }

    public static void displayCars (Car[] cars) {
        for (Car car : cars) { System.out.println(car); }
    }

    public static void displayCars (Car[] cars, int year) {
        System.out.println("See below all cars with the entered year of production:");
        for (Car car : cars) {
            if (year == car.getProductionYear()) { System.out.println(car); }
        }
    }

    public static Car[] sortCarsByYear (Car[] cars) {
        Car temp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getProductionYear() > cars[j].getProductionYear()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        return cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (getProductionYear() != car.getProductionYear()) return false;
        if (Double.compare(car.getEngineCapacity(), getEngineCapacity()) != 0) return false;
        return getType() != null ? getType().equals(car.getType()) : car.getType() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getType() != null ? getType().hashCode() : 0;
        result = 31 * result + getProductionYear();
        temp = Double.doubleToLongBits(getEngineCapacity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
