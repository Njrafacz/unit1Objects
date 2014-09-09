import java.awt.Color;
import java.util.Random ;
import java.util.concurrent.TimeUnit ;
public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld = new World() ;
        Turtle t1 = new Turtle(turtleWorld);
        Turtle t2 = new Turtle(turtleWorld);
        int counter = 0;
        int num = 0;
        t2.penUp();
        t2.backward(150) ;
        t2.penDown();
        int color_count = 0;
        while (counter <=75)
        {
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
            if (num == 20)
            {
                t1.setShellColor(Color.BLACK);
                t1.setPenColor(Color.BLACK);
                t2.setShellColor(Color.RED);
                t2.setPenColor(Color.RED);
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




       
