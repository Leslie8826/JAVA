import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Start
{
  public static void main(String[] args) throws IOException
  {
	 /* Displays the background, the death star and the black hole as fixed images 
	  * with the FixedImages class */
	 Image background = null, deathStar = null, blackHole = null;
	 
	 JFrame window = new JFrame();
	 
     window.setContentPane(new FixedImages(background, deathStar, blackHole));
	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 window.pack();
	 window.setLocation(100, 100);
	 window.setSize(1000, 600);
	 window.setVisible(true);
	 
	 /* Creates an array of spaceship objects containing 3 spaceships.
	  * l and p are integers to make the parameters of the spaceship constructor vary.
	  * l varies a little and p varies a lot
	  * */
	 Spaceship[] spaceship = new Spaceship[3];
	 int p=0;
	 for (int l=0; l<3; l=l+1, p=p+100){
		 spaceship[l] = new Spaceship(l+20, p+100, p+2, p+10, l);
		 window.add(spaceship[l]);
	 }
	 
	 /* Creates an array of meteorite objects containing 10 meteorites.
	  * u and z are integers to make the parameters of the meteorite constructor vary.
	  * u varies a little and z varies a lot
	  * */
	 int z=0;
	 Meteorite[] meteorite = new Meteorite[10];
	 for (int u=0; u<10; u=u+1, z=z+50){
		 meteorite[u] = new Meteorite(-u-20, z+100, u+105, z+10);
		 window.add(meteorite[u]);
		 }	 
 }
}

