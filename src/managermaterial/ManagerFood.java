package managermaterial;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class ManagerFood {
    public static void main(String[] args) {
        Meat meat1 = new Meat("01","Bánh Trưng01",LocalDate.now().plusDays(1),500000,6);
        Meat meat2 = new Meat("01","Bánh Trưng01",LocalDate.now(),1000000,6);
        System.out.println(meat1.getAmount());
        System.out.println(meat2.getAmount());
    }
}
