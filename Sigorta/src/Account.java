import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
abstract class Account implements Comparable<Account> {
    public int compareTo(Account other) {
        // Karşılaştırma mantığını burada uygulayın, örneğin kullanıcı adına göre karşılaştırabilirsiniz
        return this.user.getFirstName().compareTo(other.user.getFirstName());
    }
    protected User user;
    protected Set<Insurance> insurances;
    protected AuthenticationStatus authenticationStatus;

    public Account(User user) {
        this.user = user;
        this.insurances = new HashSet<>();
        this.authenticationStatus = AuthenticationStatus.FAIL;
    }

    public abstract void addInsurance(Insurance insurance);

    public abstract void removeInsurance(Insurance insurance);

    public void printUserInfo() {
        System.out.println("Kullanıcı Adı: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Meslek: " + user.getOccupation());
        System.out.println("Adresler:");
        for (Adress address : user.getAddresses()) {
            address.printAddress();
        }
        System.out.println("Son Giriş Tarihi: " + user.getLastLoginDate());
    }
}

