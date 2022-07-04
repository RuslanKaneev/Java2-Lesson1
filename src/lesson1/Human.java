package lesson1;

public class Human implements Moving {
    private String name;

    public Human(String name) {
        this.name = name;
    }


    public Boolean jump(Obstacles obstacles) {

        if(obstacles instanceof Wall wall) {
            if (wall.getHeight() > 2) {
                System.out.println(this.name + " не смог прыгнуть в высоту " + wall.getHeight() + " м.");
                return false;
            } else if (wall.getHeight() <= 2 && wall.getHeight() > 0) {
                System.out.println(this.name + " прыгнул в высоту " + wall.getHeight() + " м.");
                return true;
            } else {
                System.out.println(this.name + " не прыгал");
                return false;
            }
        }
        return false;
    }

    public Boolean run(Obstacles obstacles) {
        if(obstacles instanceof Treadmill treadmill) {
            if (treadmill.getLenght() > 10000) {
                System.out.println(this.name + " не смог пробежать " + treadmill.getLenght() + " м.");
                return false;
            } else if (treadmill.getLenght() <= 10000 && treadmill.getLenght() > 0) {
                System.out.println(this.name + " пробежал " + treadmill.getLenght() + " м.");
                return true;
            } else {
                System.out.println(this.name + " не бежал");
                return false;
            }
        }
        return false;
    }

}
