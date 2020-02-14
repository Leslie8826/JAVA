import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FixedImages extends JPanel{
	Image Background, DeathStar, BlackHole;

	// Reading the 2 fixed images: space and death star on the JFrame
	public FixedImages(Image a, Image b){
		try {
			this.DeathStar = ImageIO.read(new File("src/DeathStar.jpg"));
			this.Background = ImageIO.read(new File("src/Space.jpg"));
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
		setPreferredSize(new Dimension(100, 100));
		setBackground(Color.WHITE);
	}
	
	// Reading the 3 fixed images: space, death star and back hole on the JFrame
	public FixedImages(Image a, Image b, Image c){
		try {
			this.DeathStar = ImageIO.read(new File("src/DeathStar.jpg"));
			this.Background = ImageIO.read(new File("src/Space.jpg"));
			this.BlackHole = ImageIO.read(new File("src/BlackHole.jpg"));
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
		setPreferredSize(new Dimension(100, 100));
		setBackground(Color.WHITE);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// The background image takes the dimension of the JFrame
		g.drawImage(Background, 0, 0, getWidth(), getHeight(), this);
		
		// The death star image is placed at coordinates (700, 0)
		g.drawImage(DeathStar, 700, 0, this);
		
		// The black hole image is placed at coordinates (10, 100)
		g.drawImage(BlackHole, 10, 100, this);
	}
}

