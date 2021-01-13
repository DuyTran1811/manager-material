package managermaterial;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(LocalDate today, String id,
                String name, LocalDate manufacturingDate,
                int cost, double weight) {
        super(today, id, name, manufacturingDate, cost);
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
        if (getManufacturingDate().equals(getToday().plusDays(5))) return getAmount() * 0.3;
        else if (getManufacturingDate().equals(getToday().plusDays(3))) return getAmount() * 0.5;
        else return getAmount() * 0.1;
    }
}
