 class Enterprise extends Account {
     public Enterprise(User user) {
         super(user);
     }

     @Override
     public void addInsurance(Insurance insurance) {
         // Firma hesabına özgü işlemler
     }

     @Override
     public void removeInsurance(Insurance insurance) {
         // Firma hesabına özgü işlemler
     }
 }

 // AuthenticationStatus enum
 enum AuthenticationStatus {
     SUCCESS, FAIL
 }


