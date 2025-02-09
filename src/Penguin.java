public class Penguin extends Animal implements Walk, Swim{
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swim) {
        this.isSwimming = swim;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int speed){
        this.walkSpeed = speed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public Penguin() {
        super("Penguin");
    }

    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }

    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }

    @Override
    public void eatingFood(){
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }
}
