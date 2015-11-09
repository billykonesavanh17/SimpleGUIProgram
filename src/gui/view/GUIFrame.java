package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

/**
 * 
 * @author bkon4208
 * @version 0.x November 9, 2015
 */
public class GUIFrame extends JFrame
{
	private GUIController baseController;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(400, 400);
		this.setVisible(true);
	}

}
