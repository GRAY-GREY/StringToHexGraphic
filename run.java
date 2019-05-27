import javax.swing.JFrame;

public class run {
	
	public static void main(String[] args) {
		/*Example code
		StringToHexadecimalGraphic WasteHexa = new StringToHexadecimalGraphic("I'll hold your hand when you are feeling mad at me Yeah when the monsters they won't go and your windows won't close I'll pretend to see what you see How long? I say, how long will you relive the things that are gone? Oh yeah, The devil's on your back but I know you can shake him off And every day that you want to waste, that you want to waste, you can And every day that you want to wake up, and you want to wake, you can And every day that you want to change, that you want to change, yeah I'll help you see it through 'cause I just really want to be with you You know it's funny how freedom can make us feel contained Yeah When the muscles in our legs aren't used to all the walking I know if you could snap both your fingers that you'd escape with me But in the meantime, I'll just wait here and listen to you when you speak... or scream And every day that you want to waste, that you want to waste, you can And every day that you want to wake up, and you want to wake, you can And every day that you want to change, that you want to change, yeah I'll help you see it through 'cause I just really want to be with you The truth cuts us and pulls us back up And separates the things that look the same You can fight it off, you can fight it off, you can And every day that you want to waste, that you want to waste, you can And every day that you want to wake up, and you want to wake, you can And every day that you want to change, that you want to change, yeah I'll help you see it through 'cause I just really want to be with you");
		GraphicBuilder Waste = new GraphicBuilder(WasteHexa);
		
		StringToHexadecimalGraphic MonsoonHexa = new StringToHexadecimalGraphic("Just two days after the first of June A pine with arms brushing off the dew Unlike a sky copious with death Precipitation of heart and head Should wash the rest of her youth away And carry on with it as she may But something's pending curvaceously 'Cuz sunburned skin won't agree with me It should've been me It should've been me It should've been me It should've been me The pleasure's good as the pleasure's sound My chin held shut so my heart can talk louder I was a mess just like the pool Our days spent crossed out of Sunday school July has always been shy of June Some monsoon, monsoon, monsoon Come heavy of a golden hue My monsoon monsoon, monsoon Monsoon, monsoon Monsoon, monsoon Monsoon, monsoon Monsoon, monsoon It should've been me It should've been me It should've been me It should've been me It should've been me It should've been me It should've been me It should've been me");
		GraphicBuilder Monsoon = new GraphicBuilder(MonsoonHexa);
		
		JFrame frame = new JFrame();
		frame.setSize(Waste.getSizeOfGraphic(), Waste.getSizeOfGraphic());
		frame.getContentPane().add(Waste);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame frame2 = new JFrame();
		frame2.setSize(Monsoon.getSizeOfGraphic(), Monsoon.getSizeOfGraphic());
		frame2.getContentPane().add(Monsoon);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/
	}
	
}
