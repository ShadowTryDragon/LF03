package Fahrzeuge.Wasser;

public class Speedboot extends Wasserfahrzeuge {
    private int maxSpeed;
    public Speedboot(double tiefgang, int maxSpeed) {
        super(tiefgang);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void tuckern() {
        System.out.println("tucker tucker tucker");

    }
    public void Sausen() {
        System.out.println("ruiiiiiiii");
    }
}
