import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MobileImages extends JLabel implements ActionListener{
	int dX = 0;   
    
	// Constructor for the meteorites
    public MobileImages(int first_X, int first_Y, int dX, int delay)
    {
    	// first_X, first_Y: beginning coordinates of the meteorite object on the JFrame window
    	// dX: Movement of the meteorite object on the x axis
    	this.dX = dX; 
    	
    	// Definition of the visual of the meteorite (mobile image object)
        setIcon(new ImageIcon("src/meteorite.png") );
        setSize(getPreferredSize());
        
        // The mobile movement begins at first_X on the x axis and at first_Y on the y axis
        setLocation(first_X, first_Y);
       
        // Elapsed time (in milliseconds) between 2 actionEvents applied on the meteorite object
        // or, elapsed time between 2 successive positions of the meteorite object on the x axis
        new javax.swing.Timer(delay, this).start();
    }   
    
    
    // Constructor for the spaceship
    public MobileImages(int premier_X, int premier_Y, int dX, int delay, int test)
    {
    	test = 0;
        this.dX = dX;

        setIcon( new ImageIcon("src/millenium_falcon.png") );
        setSize( getPreferredSize() );
        setLocation(premier_X, premier_Y);
        new javax.swing.Timer(delay, this).start();
        }
	
   public void actionPerformed(ActionEvent e)
   {
    	Container parent = getParent();

    	// Determines the successive positions of the object on the x axis
    	int X = getLocation().x + dX;
    	
    	/* After the mobile movement starts on the x axis, if the object reaches the end of the JFrame, 
    	 the object takes the opposite direction*/
       if (X < 0)
        {
        	X = 0;
           dX *= -1;
        }
       
       
       /* If the position of the object combined with the object width is greater than
        * the background image width, X takes a new value. The object also changes direction.
        * */
        if ( X + getSize().width > parent.getSize().width)
        {
        	X = parent.getSize().width - getSize().width;
            dX *= -1;
        }

        // Defines the successive positions of the object on the y axis
        int Y = getLocation().y;

        
        /* The object takes the coordinates X and Y between each time interval of the timer
         * */
        setLocation(X, Y); 
    }   

}
