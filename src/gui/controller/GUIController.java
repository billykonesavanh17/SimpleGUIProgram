package gui.controller;

import gui.view.GUIFrame;
/**
 * GUIController for the Simple GUI Program
 * @author Billy Konesavanh
 * @version 0.x November 9, 2015
 */
public class GUIController
{
	/**
	 * Reference to the GUIFrame object for internal use.
	 */
	private GUIFrame baseFrame;
	
	/**
	 * Creates a GUIController and initializes the GUIFrame.
	 */
	public GUIController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{}

}
