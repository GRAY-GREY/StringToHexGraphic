/*
 *Author @Kurt Kelly
 *			-kurtbkelly@gmail.com
 *
 *Published February 26th, 2019
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GraphicBuilder extends JPanel {

	private final int WIDTH = 800;
	private final int HEIGHT = WIDTH;
	private int lengthOfPixel;
	private StringToHexadecimalGraphic Converter;
	
	/**Constuctor gets necessary methods from JPanel object and variables from,
	*object 'StringToHexadecimalGraphic'
	*
	*@params 'StringToHexadecimalGraphic' object
	*/
	public GraphicBuilder(StringToHexadecimalGraphic Converter) {
		super();
		this.Converter = Converter;
		lengthOfPixel = WIDTH/Converter.getNumOfPixels();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	    Graphics2D rectangle = (Graphics2D) g;
	    for(int i = 0; i < Converter.getColorsInHex().size(); i++)
	    	System.out.println(Converter.getColorsInHex().get(i));
	    for(int y = 0; y < Converter.getNumOfPixels(); y++)
	    	for(int x = 0; x < Converter.getNumOfPixels(); x++) {
	    		if(y*Converter.getNumOfPixels()+x>=Converter.getColorsInHex().size())
	    			rectangle.setColor(Color.WHITE);
	    		else rectangle.setColor(Color.decode(Converter.getColorsInHex().get(y*Converter.getNumOfPixels()+x)));
	    		rectangle.fillRect(x*lengthOfPixel, y*lengthOfPixel, lengthOfPixel, lengthOfPixel);
	    	}
	}
	
	public int getSizeOfGraphic() {
		return HEIGHT;
	}
	
}
