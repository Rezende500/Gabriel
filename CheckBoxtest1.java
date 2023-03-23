import javax.swing.JFrame;

public class CheckBoxtest
{
    public static void main( String [] args )
    {
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
        checkBoxFrame.setDefaltCloseOperation( JFrame.EXIT_ON_CLOSE );
        checkBoxFrame.setSize ( 275, 100 );
        checkBoxFrame.setVisible( true );
    }
}