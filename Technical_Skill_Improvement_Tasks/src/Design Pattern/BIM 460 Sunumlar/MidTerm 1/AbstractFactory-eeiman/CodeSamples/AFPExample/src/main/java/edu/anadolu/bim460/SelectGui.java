package edu.anadolu.bim460;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;


public class SelectGui extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pan = new JPanel();
	JRadioButton aRadioButton;
	JRadioButton vRadioButton;
	JRadioButton sRadioButton;
	Car car = null;
	public SelectGui(){
		
		JPanel panel = new JPanel();
		ButtonGroup group = new ButtonGroup();
		aRadioButton = new JRadioButton("Audi");
		vRadioButton = new JRadioButton("VW");
		sRadioButton = new JRadioButton("Skoda");
		aRadioButton.setSelected(true);
		group.add(aRadioButton);
		panel.add(aRadioButton);
		group.add(vRadioButton);
		panel.add(vRadioButton);
		group.add(sRadioButton);		
		panel.add(sRadioButton);
		JButton okButton = new JButton("Create");
		okButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				if (aRadioButton.isSelected()){
					car = new Audi();
				} else if(vRadioButton.isSelected()) {
					car = new VW();
				} else if(sRadioButton.isSelected()) {
					car = new Skoda();
				}
				getInfo(car);
			}

			private void getInfo(Car car) {
				JLabel lab = new JLabel("<html><b style=\"font-style:italic;\">Streeing Wheel:</b><br/><span style=\"font-weight:normal;\">Radius: "
						+car.getSteeringWheel().getRadius()+"cm<br/> Raw Material: "
						+car.getSteeringWheel().getRawMaterial()+"</span><br/><br/>" +
						"<b style=\"font-style:italic;\">Wheel:</b><br/><span style=\"font-weight:normal;\">Radius: "+car.getWheel().getRadius()
						+"'<br/>Type: "+car.getWheel().getType()+"</span></html>");
				pan.removeAll();
				pan.add(new JLabel("<html><br/></html>"));
				JSeparator sep = new JSeparator();
				sep.setPreferredSize(new Dimension(599, 2));
				ImageIcon picturetoInsert = new ImageIcon(car.getPicture());
				JLabel label = new JLabel("",picturetoInsert,JLabel.CENTER);
				pan.add(lab);
				pan.add(label);
				//pan.add(sep);
				pan.getRootPane().revalidate();				
			}
		});
		panel.add(okButton);
		//pan.add(new JButton("sad"));
		JSeparator sep = new JSeparator();
		sep.setPreferredSize(new Dimension(599, 2));
		panel.add(sep);
		panel.add(pan);
		this.setContentPane(panel);
		//con.add(sep);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SelectGui frame = new SelectGui();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(600, 500);
	    frame.setVisible(true);
	}

}
