
import java.net.URL ;
import javax.swing.ImageIcon ;
import javax.swing.JOptionPane ;
public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation =new URL(
            "http://images5.fanpop.com/image/photos/26900000/Nicolas-Cage-nicolas-cage-26969758-2059-2560.jpg");
        JOptionPane.showMessageDialog(null, "Sup Mate", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation)) ;
        }
    }
