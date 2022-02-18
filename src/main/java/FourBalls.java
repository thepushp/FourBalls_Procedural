import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    public static final int HEIGHT_FROM_TOP = HEIGHT / 5;
    public static final int DIAMETER = 20;
    public int moveSteps = 1;
    int speed1 = 1;
    int speed2 = 2;
    int speed3 = 3;
    int speed4 = 4;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
//        ellipse(HEIGHT/2,WIDTH/2,160,160);
    }

    @Override
    public void draw() {
//        System.out.println("hello log section");
//        background(255,255,0);
        drawCircle(speed1, 1);
        drawCircle(speed2, 2);
        drawCircle(speed3, 3);
        drawCircle(speed4, 4);
    }

    private void drawCircle(int speed, int addSteps) {
        ellipse(speed, addSteps * HEIGHT_FROM_TOP, DIAMETER, DIAMETER);
        if (addSteps == 1)
            speed1 += addSteps;
        else if (addSteps == 2)
            speed2 += addSteps;
        else if (addSteps == 3)
            speed3 += addSteps;
        else
            speed4 += addSteps;
    }
}
