package lesson1;

public class Robot implements Participant{
    private String name;
    public Robot(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(this.name + " побежал");
    }
    public void jump(){
        System.out.println(this.name + " прыгнул");
    }
    public void jumpWall(Wall wall) {
        if (wall.getHeight() > 5) {
            System.out.println(this.name + " не смог прыгнуть в высоту" + wall.getHeight() + " м.");
        } else if (wall.getHeight() <= 5 && wall.getHeight() > 0) {
            System.out.println(this.name + " прыгнул в высоту" + wall.getHeight() + " м.");
        }else{
            System.out.println(this.name + " не прыгал");
        }
    }

    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getLenght() > 100000) {
            System.out.println(this.name + " не смог пробежать " + treadmill.getLenght() + " м.");
        } else if (treadmill.getLenght() <= 100000 && treadmill.getLenght() > 0) {
            System.out.println(this.name + " пробежал " + treadmill.getLenght() + " м.");
        } else{
            System.out.println(this.name + " не бежал");
        }
    }
}
