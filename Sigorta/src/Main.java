
public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", "Doe", "john@example.com", "12345", "Engineer", 30);
        User user2 = new User("Alice", "Smith", "alice@example.com", "abcde", "Doctor", 25);
        Adress homeAddress1 = new HomeAdress("123 Main St, City1");
        Adress homeAddress2 = new HomeAdress("456 Elm St, City2");
        Adress businessAddress = new BussinessAddres("789 Business St, City3");
        user1.addAddress(homeAddress1);
        user1.addAddress(businessAddress);
        user2.addAddress(homeAddress2);
        Account individualAccount = new Individual(user1);
        Account enterpriseAccount = new Enterprise(user2);
        AccountManager accountManager = new AccountManager();
        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        try {
            Account loggedInAccount = accountManager.login("john@example.com", "12345");
            loggedInAccount.printUserInfo();
        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
    }
}