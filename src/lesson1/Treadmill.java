package lesson1;

public class Treadmill extends Obstacles {
    private int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public double setLenght(int lenght) {
        if (lenght >= 0)
            return this.lenght = lenght;
        else
            return 0;
    }

}
