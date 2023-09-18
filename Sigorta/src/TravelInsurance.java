import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
 class TravelInsurance extends Insurance{
     public TravelInsurance(String name, double cost, Date startDate, Date endDate) {
         super(name, cost, startDate, endDate);
     }

     @Override
     public double calculate() {
         // Seyahat sigortası ücret hesaplama
         return 0.0; // Gerçek hesaplama burada yapılacak
     }
}
