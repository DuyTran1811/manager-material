package managermaterial;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id,String name, LocalDate manufacturingDate,
                int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }


    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        if (getManufacturingDate().isEqual(getToday())){
            return getAmount() * 0.5;
        }
        else if (getManufacturingDate().isEqual(getToday())){
            return getAmount() * 0.7;
        }
        else return getAmount() * 0.9;
    }

}
