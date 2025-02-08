public class Dolphin extends Animal implements Swim{
    private String dolphinColor;
    private double swimmingSpeed;

    public String getDolphinColor() {
        return dolphinColor;
    }

    public void setDolphinColor(String color) {
        this.dolphinColor = color;
    }

    public double getSwimmingSpeed(){
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double speed) {
        this.swimmingSpeed = speed;
    }

    public Dolphin() {
        super("Dolphin");
    }

    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }

    @Override
    public void eatingFood(){
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }
}