package objects;

public class Sitzplatz {
    private int reihe;
    private int sitz;
    private Block block;
    private Zuschauer zuschauer;


    public Sitzplatz(int reihe,int sitz, Block block, Zuschauer zuschauer) {
        this.reihe = reihe;
        this.sitz = sitz;
        this.block = block;
        this.zuschauer = zuschauer;
    }

    public Zuschauer getZuschauer() {
        return zuschauer;
    }

    public Block getBlock() {
        return block;
    }

    public int getSitz() {
        return sitz;
    }

    public int getReihe() {
        return reihe;
    }

    @Override
    public String toString() {
        return "Sitzplatz{" +
                "reihe=" + reihe +
                ", sitz=" + sitz +
                ", block=" + block +
                ", zuschauer=" + zuschauer +
                '}';
    }
}
