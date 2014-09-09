// Nick Rafacz
// Period 5
// Mr. Schmitt
// AP COMPUTER SCIENCE
import java.util.Random ;
public class DieSimulator
{
    public static void main(String[] args)
    {
       Random random_number = new Random() ;
       int number = random_number.nextInt(6) ;
       number = number +1 ;
       System.out.println(number);
    }
}