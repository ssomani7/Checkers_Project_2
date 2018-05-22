package ooad.saurabh.assignment2.trailversion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Checkers extends JPanel{

	private static final long serialVersionUID = 1L;

	/**
    * Main routine makes it possible to run Checkers as a stand-alone
    * application.  Opens a window showing a Checkers panel; the program
    * ends when the user closes the window.
    */
	   public static void main(String[] args) {
	      JFrame window = new JFrame("Checkers_Assignment2 !!!");
	      Checkers content = new Checkers();
	      window.setContentPane(content);
	      window.pack();
	      Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	      window.setLocation( (screensize.width - window.getWidth())/2,
	            (screensize.height - window.getHeight())/2 );
	      window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      window.setResizable(false);  
	      window.setVisible(true);
	   }

	   /**
	    * The constructor creates the Board (which in turn creates and manages
	    * the buttons and message label), adds all the components, and sets
	    * the bounds of the components.  A null layout is used.  (This is
	    * the only thing that is done in the main Checkers class.)
	    */
	   public Checkers() {
	      
	      setLayout(null); //use boxLayout from previous assignment.
	      setPreferredSize( new Dimension(350,250) );  
	      setBackground(new Color(0,150,0));  //Dark green background.
	      
	      /* Create the components and add them to the applet. */    
	      Board board = new Board();  // Note: The constructor for the
	                                  // board also creates the buttons
	                                  // and label.
	      add(board);
	      add(board.getNewGameButton());
	      add(board.getResignButton());
	      add(board.getHelpButton());
	      add(board.getMessage());
	      
	      /* Set the position and size of each component by calling
	       its setBounds() method. */	      
	      board.setBounds(20,20,164,164); // Note:  size MUST be 164-by-164 !
	      board.getNewGameButton().setBounds(210, 30, 120, 30);
	      board.getResignButton().setBounds(210, 70, 120, 30);
	      board.getHelpButton().setBounds(210, 120, 120, 30);
	      board.getMessage().setBounds(0, 200, 350, 30);	      
	   } // end constructor
}//end class Checkers 
