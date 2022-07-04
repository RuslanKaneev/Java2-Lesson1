package lesson1;

public class Human implements Jumper, Runner {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(this.name + " побежал");
    }

    public void jump() {
        System.out.println(this.name + " прыгнул");
    }


    public void jump(Wall wall) {
        if (wall.getHeight() > 2) {
            System.out.println(this.name + " не смог прыгнуть в высоту" + wall.getHeight() + " м.");
        } else if (wall.getHeight() <= 2 && wall.getHeight() > 0) {
            System.out.println(this.name + " прыгнул в высоту" + wall.getHeight() + " м.");
        }else{
            System.out.println(this.name + " не прыгал");
        }
    }

    public void run(Treadmill treadmill) {
        if (treadmill.getLenght() > 10000) {
            System.out.println(this.name + " не смог пробежать " + treadmill.getLenght() + " м.");
        } else if (treadmill.getLenght() <= 10000 && treadmill.getLenght() > 0) {
            System.out.println(this.name + " пробежал " + treadmill.getLenght() + " м.");
        } else{
            System.out.println(this.name + " не бежал");
        }
    }

}
