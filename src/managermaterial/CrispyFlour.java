package managermaterial;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name,
                       LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        if (getManufacturingDate().equals(getToday().plusMonths(4))) return getAmount() * 0.2;
        else if (getManufacturingDate().equals(getToday().plusMonths(2))) return getAmount() * 0.4;
        else return getAmount() * 0.05;
    }
}
