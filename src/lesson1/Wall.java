package lesson1;

public class Wall implements Jumper{
    private double height;
    public Wall(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double setHight(double height) {
        if (height > 0)
            return this.height = height;
        else
            return 0;
    }
    public void jump(){

    }
}
