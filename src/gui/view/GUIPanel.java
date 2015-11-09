package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;

/**
 * 
 * @author Billy Konesavanh
 * @version 0.1 November 9, 2015
 */
public class GUIPanel extends JPanel
{
	private GUIController baseController;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
	}

}
