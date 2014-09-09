// Nick Rafacz
// Period 5
// Mr. Schmitt
// Turtle Lab
import java.awt.Color;
import java.util.Random ;
import java.util.concurrent.TimeUnit ;
public class TurtleLab
{
    public static void main(String[] args)
    {
        // Creates Turtles
        World turtleWorld = new World() ;
        Turtle t1 = new Turtle(turtleWorld);
        Turtle t2 = new Turtle(turtleWorld);
        int counter = 0;
        int num = 0;
        t2.penUp();
        t2.backward(150) ;
        t2.penDown();
        int color_count ;

        while (counter <=75)
        {
            // Used to delay each action by one second
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
            }
            int length = 0;
            length = counter +20;
            t1.turnLeft();
            t1.forward(length);
            t2.turnRight();
            t2.forward(length) ;
            counter +=1;

                
        }
        t1.turnLeft();
        t1.forward(90);
        t2.turnLeft();
        t2.forward(150);
        while (counter >74)
        {
            // While loop used to create the squares
            try { TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
            }
            int length = 0;
            length = num +20;
            t1. turnLeft();
            t1. forward(length);
            t2.turnRight();
            t2.forward(length);
            num +=1 ;
            Random num_generator = new Random();
            color_count = num_generator.nextInt(6);

            if (num == 20)
            {
                // Random Color Count that decides the shell color and pen color of each turtle 
                if (color_count == 1)
                {
                    t1.show();
                    t2.show();
                    t1.setShellColor(Color.BLUE);
                    t1.setPenColor(Color.BLUE);
                    t2.setShellColor(Color.BLUE);
                    t2.setPenColor(Color.BLUE);
                }
                if (color_count == 2)
                { 
                    t1.show();
                    t2.show();
                    t1.setShellColor(Color.RED);
                    t1.setPenColor(Color.RED);
                    t2.setShellColor(Color.RED);
                    t2.setPenColor(Color.RED);
                }
                if (color_count == 3)
                {
                    t1.show();
                    t2.show();
                    t1.setShellColor(Color.BLACK);
                    t1.setPenColor(Color.BLACK);
                    t2.setShellColor(Color.BLACK);
                    t2.setPenColor(Color.BLACK);
                }
                if (color_count == 4)
                {
                    t1.show();
                    t2.show();
                    t1.setShellColor(Color.ORANGE);
                    t1.setPenColor(Color.ORANGE);
                    t2.setShellColor(Color.ORANGE);
                    t2.setShellColor(Color.ORANGE);
                }
                if (color_count == 5)
                {
                    t1.hide();
                    t2.hide();
                }
                   // Generates the actually squares
                    num = 0 ;
                    length = num +20;
                    counter =0 ;
                    t1.turnLeft();
                    t1.forward(120);
                    t2.turnLeft();
                    t2.forward(80);
                    counter =75 ;
                }

            }

        }
    }


       
