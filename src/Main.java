import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Turtle tao = new Turtle();

        tao.up();
        tao.left(315);
        tao.forward(250);
        tao.down();

        tao.right(135);
        tao.forward(400);

        for(int i=0; i<=3 ; i++){
            tao.right(90);
            tao.forward(400);
        }
        tao.penColor(Color.CYAN);
        tao.left(225);
        tao.forward(350);
        tao.penColor(Color.white);
        tao.right(45);
        tao.forward(155);
        tao.right(180);
        tao.penColor(Color.GREEN);
        tao.forward(400);
        tao.left(225);
       for (int i=0 ; i<=3 ; i++){
        tao.forward(70);
        tao.right(90);
           tao.forward(70);
           tao.left(90);
       }
       tao.up();
       tao.right(225);
       tao.forward(200);
       tao.right(135);
       tao.forward(50);
       tao.left(90);
        tao.down();
        tao.penColor(Color.RED);
        for (int i=0 ; i<=66 ; i++){
            tao.forward(3);
            tao.left(1.25);
        }
        tao.up();
        tao.forward(500);

        tao = new Turtle();
        tao.penColor(Color.BLUE);

        for (int i = 0; i < 5; i++) {
            tao.left(30);
            tao.forward(15);
            tao.right(60);
            tao.forward(15);
            tao.left(30);
        }
        tao.up();
        tao.forward(500);

        tao = new Turtle();
        tao.up();
        tao.penColor(Color.BLUE);
        tao.right(90);
        tao.forward(40);
        tao.left(90);
        tao.forward(40);
        tao.down();
        for (int i = 0; i < 5; i++) {
            tao.left(30);
            tao.forward(15);
            tao.right(60);
            tao.forward(15);
            tao.left(30);
        }
        tao.up();
        tao.forward(500);

        tao = new Turtle();
        tao.up();
        tao.penColor(Color.BLUE);
        tao.right(90);
        tao.forward(100);
        tao.right(90);
        tao.forward(60);
        tao.right(180);
        tao.down();
        for (int i = 0; i < 5; i++) {
            tao.left(30);
            tao.forward(15);
            tao.right(60);
            tao.forward(15);
            tao.left(30);
        }
        tao.up();
        tao.forward(500);


        tao = new Turtle();
        tao.up();
        tao.penColor(Color.BLUE);
        tao.right(90);
        tao.forward(140);
        tao.left(90);
        tao.forward(20);
        tao.down();
        for (int i = 0; i < 5; i++) {
            tao.left(30);
            tao.forward(15);
            tao.right(60);
            tao.forward(15);
            tao.left(30);
        }
        tao.up();
        tao.forward(500);

        tao = new Turtle();
        tao.up();
        tao.right(180);
        tao.forward(190);
        tao.left(90);
        tao.forward(50);
        tao.right(215);
        tao.down();
        tao.forward(40);
        tao.up();
        tao.right(45);
        tao.forward(20);
        tao.right(45);
        tao.down();
        tao.forward(40);
        tao.backward(5);

        tao.left(330);

        tao.penColor(Color.red);
        for (int i = 0; i < 3; i++) {
            tao.right(125);
            tao.forward(5);
        for (int a = 0; a < 3; a++) {
            tao.left(30);
            tao.forward(15);
            tao.right(60);
            tao.forward(10);
            tao.left(30);
        }}tao.up();
        tao.forward(500);

    }
       }


// tao.penColor(Color.RED);