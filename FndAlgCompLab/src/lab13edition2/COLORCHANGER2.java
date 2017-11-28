package lab13edition2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class COLORCHANGER2 extends SimpleFrame{
		private JPanel panel;
		private static final int DEFAULT_WIDTH = 300;
		private static final int DEFAULT_HEIGHT = 200;
		private static int numClicks = 0;
		
		public COLORCHANGER2() {
			setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
			
			//create buttons
			JButton chButton = new JButton("Change");
			JButton rButton = new JButton("Reset");
		//	JButton exButton = new JButton("Close");
			
			panel = new JPanel();
			
			//add buttons to panel
			panel.add(chButton);
			panel.add(rButton);
		//	panel.add(exButton);
			
			//add panel to frame
			add(panel);
			
			//create button actions
			ColorAction chAction = new ColorAction();
			ResAction rAction = new ResAction();
		//	CloseAction exAction = new CloseAction();
			
			//associate actions with buttons
			chButton.addActionListener(chAction);
			rButton.addActionListener(rAction);
		//	exButton.addActionListener(exAction);	
		}
		
		/* An action listener that sets the panel's background color */
		private class ColorAction implements ActionListener
		{
			private Color backgroundColor;
			
			public ColorAction()
			{
				
				if((numClicks%5==0)||(numClicks==0)) {
					numClicks++;
					backgroundColor = Color.BLACK;
				}
				else if(numClicks%5==1) {
					numClicks++;
					backgroundColor = Color.GREEN;
				}
				else if(numClicks%5==2) {
					numClicks++;
					backgroundColor = Color.ORANGE;
				}
				else if(numClicks%5==3) {
					numClicks++;
					backgroundColor = Color.PINK;
				}
			}
			
			public void actionPerformed(ActionEvent event)
			{
				panel.setBackground(backgroundColor);
			}
		}
		
		private class ResAction implements ActionListener{
			public ResAction()
			{
				COLORCHANGER2.numClicks = 0;
			}
			
			public void actionPerformed(ActionEvent event)
			{
				panel.setBackground(Color.BLACK);
			}
		}
		/*
		private class CloseAction implements ActionListener{
			public CloseAction()
			{
				System.exit(0);
			}
			public void actionPerformed(ActionEvent event)
			{
				//panel.disable();
				System.exit(0);
			}
		}
		*/
		
	}
