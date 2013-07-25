import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Image implements ActionListener {

	private JLabel carLabel;
	private JButton fButton;
	private JPanel buttonPanel,carPanel, intersectPanel;
	private int position=0;
	//private Graphics page;
	public Image() {
		fButton = new JButton("->");
		fButton.addActionListener(this);
		//Dimension d = new Dimension(500,500);
		JFrame frame = new JFrame("Image Demo");
		ImageIcon icon = new ImageIcon("images\\carWest.png");
		carLabel = new JLabel(icon,SwingConstants.CENTER);
		carPanel = new JPanel();
		carPanel.setBackground(Color.CYAN);
		carPanel.add(carLabel);
		buttonPanel = new JPanel();
		carLabel.setBorder(BorderFactory.createEmptyBorder(340, 400, 390, 580));
		intersectPanel = new Intersection();
		//fButton.setBounds(0,0,0,0); //20, 720, 20, 700
		intersectPanel.add(carLabel);
		buttonPanel.add(fButton,BorderLayout.EAST);
		//carPanel.add(intersectPanel);
		frame.add(intersectPanel, BorderLayout.CENTER);
		frame.add(fButton, BorderLayout.SOUTH);
		
		//frame.getContentPane().add(carPanel);
		Toolkit tk = Toolkit.getDefaultToolkit();  
		int xSize = ((int) tk.getScreenSize().getWidth());  
		int ySize = ((int) tk.getScreenSize().getHeight()); 
		System.out.println(xSize+","+ySize);
		//frame.getContentPane().add(carPanel);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH); 
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		case "->":
			position+=5;
			carLabel.setBorder(BorderFactory.createEmptyBorder(340, 400+position, 390, 580-position));
			break;

		default:
			break;
		}
	}
	

}
