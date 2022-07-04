package lesson1;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Феликс");
        Robot robot = new Robot("Федор");
        Cat cat = new Cat("Борис");
        Wall wall = new Wall(1.9);
        Treadmill treadmill = new Treadmill(5000);
        Moving[] movings = {human, robot, cat};
        Obstacles[] obst = {wall, treadmill};

        for (int i = 0; i < movings.length; i++) {
            for (int j = 0; j < obst.length; j++) {
                if (!(movings[i].run(obst[j]) || movings[i].jump(obst[j]))) {
                    break;
                }

            }
        }
    }
}