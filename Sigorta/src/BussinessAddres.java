public class BussinessAddres implements Adress {
    private String businessAddress;

    public BussinessAddres(String address) {
        this.businessAddress = address;
    }

    @Override
    public void printAddress() {
        System.out.println("İş Adresi: " + businessAddress);
    }
}
