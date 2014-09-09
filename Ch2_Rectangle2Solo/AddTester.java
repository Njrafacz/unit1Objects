// Nick Rafacz
// Rectangle 2
// Period 5 
// Mr. Schmitt
import java.awt.Rectangle ;

public class AddTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5,10,20,30) ;
        box.add(0,0);
        // moves rectangle down and to the left
        System.out.println(box) ;
    }
}