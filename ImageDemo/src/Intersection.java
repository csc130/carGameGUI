
import java.awt.*;
import javax.swing.*;


public class Intersection extends JPanel{
	//private Graphics page;
	public Intersection() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(100,100));
	}
	public void paintComponent(Graphics page) {
		super.paintComponents(page);
		page.setColor(Color.BLACK);
		page.drawRect(0, 0, 447,319);
		page.drawRect(0, 449, 447,319);
		page.drawRect(577,0,  447,319);
		page.drawRect(577, 449, 447,319);
		page.setColor(Color.WHITE);
		page.fillRect(0, 319, 1024, 130);
		page.fillRect(447, 0, 130,768);
		page.setColor(Color.BLACK);
		page.drawLine(0, 384, 1024, 384);
		page.drawLine(512, 0, 512, 768);

	}
}
