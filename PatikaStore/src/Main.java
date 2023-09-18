import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Marka> markalar = new ArrayList<>();
        markalar.add(new Marka(1, "Apple"));
        markalar.add(new Marka(2, "Asus"));
        markalar.add(new Marka(3, "Casper"));
        markalar.add(new Marka(4, "HP"));
        markalar.add(new Marka(5, "Huawei"));
        markalar.add(new Marka(6, "Lenovo"));

        ArrayList<Notebook> notebooklar = new ArrayList<>();
        notebooklar.add(new Notebook(1, "HUAWEI Matebook 14", 7000.0, markalar.get(4), 512, 14, 16));
        notebooklar.add(new Notebook(2, "LENOVO V14 IGL", 3699.0, markalar.get(5), 1024, 14, 8));
        notebooklar.add(new Notebook(3, "ASUS Tuf Gaming", 8199.0, markalar.get(1), 2048, 15, 32));


        ArrayList<Phone> cepTelefonlari = new ArrayList<>();
        cepTelefonlari.add(new Phone(1, 12000, 3199.0, 100, "SAMSUNG GALAXY A51", markalar.get(1), 32, 6.1, 4000, 6, "Mavi"));
        cepTelefonlari.add(new Phone(2, 25000, 7379.0, 200, "iPhone 11 64 GB", markalar.get(0), 64, 6.1, 4000, 6, "Gri"));
        cepTelefonlari.add(new Phone(3, 18000, 4012.0, 150, "Redmi Note 10 Pro 8GB", markalar.get(3), 128, 6.1, 4000, 6, "Kırmızı"));
        Scanner scanner = new Scanner(System.in);
        int tercih = -1;
        while (tercih != 0) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            tercih = scanner.nextInt();

            switch (tercih) {
                case 1:
                    listeleNotebooklar(notebooklar);
                    break;
                case 2:
                    listeleCepTelefonlari(cepTelefonlari);
                    break;
                case 3:
                    listeleMarkalar(markalar);
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz tercih! Lütfen geçerli bir tercih girin.");
            }


        }
        scanner.close();
    }

    private static void listeleCepTelefonlari(ArrayList<Phone> cepTelefonlari) {
        System.out.println("Cep Telefonu Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ID "+ "Ürün Adı "+ "Fiyat "+ "Marka"+ "Depolama"+ "Ekran"+ "Kamera"+ "Pil"+ "RAM"+ "Renk");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (Phone cepTelefonu : cepTelefonlari) {
            System.out.println(cepTelefonu.getId()+" \t\t\t\t"+ cepTelefonu.getUrunAdi()+" \t\t\t\t"+ cepTelefonu.getBirimFiyat()+" \t\t\t\t"+ cepTelefonu.getMarka().getMarkaName()+
                    cepTelefonu.getHafizaBilgisi()+ cepTelefonu.getEkranBoyutu()+
                    cepTelefonu.getPilGucu()+" "+ cepTelefonu.getRam()+" \t\t\t\t"+ cepTelefonu.getRenk());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }


    private static void listeleMarkalar(ArrayList<Marka> markalar) {
        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (Marka marka : markalar) {
            System.out.println("- " + marka.getMarkaName());
        }
        System.out.println();
    }

    public static void listeleNotebooklar(ArrayList<Notebook> notebooks) {
        System.out.println("Notebook Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-2s | %-28s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks) {
            System.out.printf("| %-2d | %-28s | %-10.2f | %-10s | %-10d | %-10.1f | %-10d |\n",
                    notebook.getId(), notebook.getName(), notebook.getBirimFiyat(), notebook.getMarka().getMarkaName(),
                    notebook.getDepolama(), notebook.getEkranBoyutu(), notebook.getRam());

        }
    }
}