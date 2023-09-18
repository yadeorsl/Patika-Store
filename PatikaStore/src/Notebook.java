public class Notebook {
    private int id;
    private double birimFiyat;
    private double indirimOrani;
    private int stokMiktari;
    private String urunAdi;
    private Marka marka;
    private int ram;
    private int depolama;
    private double ekranBoyutu;
    private String name;

    public Notebook(int id, String name,double birimFiyat,Marka marka,int stokMiktari,  int ram, int depolama) {
        this.id = id;
        this.name=name;
        this.birimFiyat = birimFiyat;
        this.marka = marka;
        this.stokMiktari = stokMiktari;
        this.ram = ram;
        this.depolama = depolama;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }
}
