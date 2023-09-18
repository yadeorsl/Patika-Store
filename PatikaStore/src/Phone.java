public class Phone {
    private int id;
    private double birimFiyat;
    private double indirimOrani;
    private int stokMiktari;
    private String urunAdi;
    private Marka marka;
    private int hafizaBilgisi;
    private double ekranBoyutu;
    private int pilGucu;
    private int ram;
    private String renk;

    public Phone(int id, double birimFiyat, double indirimOrani, int stokMiktari, String urunAdi, Marka marka, int hafizaBilgisi, double ekranBoyutu, int pilGucu, int ram, String renk) {
        this.id = id;
        this.birimFiyat = birimFiyat;
        this.indirimOrani = indirimOrani;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.hafizaBilgisi = hafizaBilgisi;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public void setIndirimOrani(double indirimOrani) {
        this.indirimOrani = indirimOrani;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public int getHafizaBilgisi() {
        return hafizaBilgisi;
    }

    public void setHafizaBilgisi(int hafizaBilgisi) {
        this.hafizaBilgisi = hafizaBilgisi;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getPilGucu() {
        return pilGucu;
    }

    public void setPilGucu(int pilGucu) {
        this.pilGucu = pilGucu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
