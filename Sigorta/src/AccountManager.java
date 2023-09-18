import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
class AccountManager {
    private TreeSet<Account> accounts;

    public AccountManager() {
        this.accounts = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Account login(String email, String password) throws InvalidAuthenticationException {
        for (Account account : accounts) {
            try {
                account.user.login(email, password);
                account.authenticationStatus = AuthenticationStatus.SUCCESS;
                return account;
            } catch (InvalidAuthenticationException e) {
                // Geçersiz kimlik bilgileri, bir sonraki hesabı kontrol et
            }
        }
        throw new InvalidAuthenticationException("Giriş başarısız.");
    }
}
