public class Dolphin extends Animal implements Swim{
    private String color;
    private double swimmingSpeed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        System.out.println("Dolphin: I am swimming at the speed " + (int)swimmingSpeed);
    }

    @Override
    public void eatingFood(){
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }
}