import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle1.setPenColor(Color.BLUE) ;
        turtle.penDown();
        turtle1.penDown() ;
        turtle1.turnRight();
        turtle.forward(50);
        turtle1.forward(175) ;
        turtle1.turnRight() ;
        turtle1.forward(175) ; 
        turtle1.turnRight() ;
        turtle1.forward(175) ;
        turtle1.turnRight() ;
        turtle1.forward(175);
    
    }
}
