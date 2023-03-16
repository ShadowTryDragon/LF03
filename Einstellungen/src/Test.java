public class Test {
    public static void main(String[] args) {
        OptionenSingleton optionenSingleton = OptionenSingleton.getInstance();
       optionenSingleton.setSpeicherort("Füllen");

        System.out.println(optionenSingleton.getSpeicherort());

    }
}
