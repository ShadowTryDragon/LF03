public class OptionenSingleton {
private String speicherort;
    private  static OptionenSingleton instance;

    private OptionenSingleton() {

    }

    public static OptionenSingleton getInstance() {
        if (instance == null) {
            instance = new OptionenSingleton();
        }
        return instance;
    }

    public String getSpeicherort() {
        return speicherort;
    }

    public void setSpeicherort(String speicherort) {
        this.speicherort = speicherort;
    }
}
