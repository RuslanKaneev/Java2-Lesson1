package lesson1;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Феликс");
        Robot robot = new Robot("Федор");
        Cat cat = new Cat("Борис");
        Wall wall = new Wall(1.9);
        Treadmill treadmill = new Treadmill(5000);
        Runner [] runner = {human,robot,cat};
        Jumper [] obst = {wall,treadmill};

        for (int i = 0; i < runner.length; i++) {
            for (int j = 0; j < obst.length; j++) {
                runner[i].run();
                obst[i].jump();
            }
        }
    }
}