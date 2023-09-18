public class Marka {
   private int id;
   private String markaName;

    public Marka(int id, String markaName) {

        this.id = id;
        this.markaName = markaName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarkaName() {
        return markaName;
    }

    public void setMarkaName(String markaName) {
        this.markaName = markaName;
    }
}
