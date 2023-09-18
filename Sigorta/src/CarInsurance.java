import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
 class CarInsurance extends Insurance {
     public CarInsurance(String name, double cost, Date startDate, Date endDate) {
         super(name, cost, startDate, endDate);
     }

     @Override
     public double calculate() {
         // Otomobil sigortası ücret hesaplama
         return 0.0; // Gerçek hesaplama burada yapıl
     }
 }