import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
class User {
     private String firstName;
     private String lastName;
     private String email;
     private String password;
     private String occupation;
     private int age;
     private ArrayList<Adress> addresses;
     private Date lastLoginDate;

     public User(String firstName, String lastName, String email, String password, String occupation, int age) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.email = email;
         this.password = password;
         this.occupation = occupation;
         this.age = age;
         this.addresses = new ArrayList<>();
     }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public ArrayList<Adress> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Adress> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Adress address) {
         addresses.add(address);
     }

     public void removeAddress(Adress address) {
         addresses.remove(address);
     }

     public void login(String inputEmail, String inputPassword) throws InvalidAuthenticationException {
         if (inputEmail.equals(email) && inputPassword.equals(password)) {
             lastLoginDate = new Date();
         } else {
             throw new InvalidAuthenticationException("Geçersiz kimlik bilgileri.");
         }
     }

}
