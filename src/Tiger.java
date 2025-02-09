public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private double speed;
    private int soundLevel;

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

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevelOfRoar) {
        this.soundLevel = soundLevelOfRoar;
    }

    public void walking() {
        System.out.println("Tiger: I am moving at the speed " + (int)speed);
    }

    @Override
    public void eatingFood(){
        System.out.println("The animal: Tiger is eating.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }
}
