import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
 class Individual extends Account {
     public Individual(User user) {
         super(user);
     }

     @Override
     public void addInsurance(Insurance insurance) {
         insurances.add(insurance);
     }

     @Override
     public void removeInsurance(Insurance insurance) {
         insurances.remove(insurance);
     }
}
