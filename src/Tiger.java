public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private double speed;
    private int soundLevelOfRoar;

    public Tiger() {
        super("Tiger");
    }

    public int getNumberOfStripes(){
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public void walking() {
        System.out.println("Tiger: I am walking at the speed of " + speed + " mph");
    }

    @Override
    public void eatingFood(){
        System.out.println("Tiger: I am eating meat");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }
}
