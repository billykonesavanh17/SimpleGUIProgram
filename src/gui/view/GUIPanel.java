package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import gui.controller.GUIController;

/**
 * 
 * @author Billy Konesavanh
 * @version 0.2 November 9, 2015 added button, textfield and helper methods.
 */
public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstField;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Please do not click the button");
		firstField = new JTextField("Words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
