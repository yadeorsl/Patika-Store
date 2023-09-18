public class HomeAdress implements Adress{
    private String homeAdress;

    public HomeAdress(String address) {
        this.homeAdress = address;
    }

    @Override
    public void printAddress() {
        System.out.println("Ev Adresi: " + homeAdress);
    }
}
