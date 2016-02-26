package ca.uwo.csd.cs2212.team08;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class MainScreen extends JFrame {
	
	private JPanel contentPane;
	//private APIData data;
	    
	     public MainScreen() {
	          this.initUI();
	     }
	    
	     private void initUI () {
	    	 //Calendar cal = Calendar.getInstance();
	    	 //cal.get(Calendar.YEAR);
	    	 //data = new APIData();
	    	 //data.refreshData(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
	    	 this.setTitle("Team08 Fitbit");
	    	 this.setSize(1024, 768);
	    	 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	 this.setLocationRelativeTo(null);
	    	 contentPane = new JPanel();
	    	 contentPane.setBorder(new EmptyBorder(5, 0, 5, 0));
	    	 this.setContentPane(contentPane);
	    	 contentPane.setLayout(null);
	    	 
	    	 
	    	 //create a dash board panel for the steps
	    	 DashBoardPanel pnlSteps = new DashBoardPanel(150, 189);
	    	 pnlSteps.setBounds(50, 191, 308, 167);
	    	 //creates a mouse listener that tracks when it has been clicked
	    	 pnlSteps.addMouseListener(new MouseAdapter() {
	    		 @Override
	    		 public void mouseClicked(MouseEvent arg0) {
	    			 //what to do on button click
	    			 StepsPanel steps = new StepsPanel();
	    			 steps.setVisible(true);
	    			 dispose();
	    		 }
	    	 });
	    	 //set the layout to absolute
	    	 pnlSteps.setLayout(null);
	    	 //add panel to the content pane
	    	 contentPane.add(pnlSteps);
	    	 
	    	 //create a progress bar for the steps panel
	    	 JProgressBar stepsProgress = new JProgressBar();
	    	 //this will be switched with a ratio between the daily goal and the current steps
	    	 stepsProgress.setValue(20);
	    	 stepsProgress.setToolTipText("Current progress towards your goal");
	    	 stepsProgress.setForeground(new Color(51, 153, 255));
	    	 stepsProgress.setBounds(21, 110, 266, 36);
	    	 pnlSteps.add(stepsProgress);
	    	 
	    	 /*JLabel lblSteps = new JLabel(Integer.toString(data.getSteps()));
	    	 lblSteps.setHorizontalAlignment(SwingConstants.CENTER);
	    	 lblSteps.setBounds(102, 21, 92, 26);
	    	 pnlSteps.add(lblSteps);*/
	    	 
	    	 JLabel lblStepsTtile = new JLabel("Steps");
	    	 lblStepsTtile.setHorizontalAlignment(SwingConstants.CENTER);
	    	 lblStepsTtile.setBounds(102, 63, 92, 26);
	    	 pnlSteps.add(lblStepsTtile);
	    	 
	    	 
	    	 
	    	 //create a label to display the title of the panel
	    	 JLabel lblTitle = new JLabel("Fit Bit");
	    	 lblTitle.setBounds(318, 10, 68, 33);
	    	 contentPane.add(lblTitle);
	    	 
	    	 DashBoardPanel StairsPanel = new DashBoardPanel(150, 189);
	    	 StairsPanel.setLayout(null);
	    	 StairsPanel.setBounds(413, 191, 308, 167);
	    	 contentPane.add(StairsPanel);
	    	 
	    	 JProgressBar stairsProgress = new JProgressBar();
	    	 stairsProgress.setValue(20);
	    	 stairsProgress.setToolTipText("Current progress towards your goal");
	    	 stairsProgress.setForeground(SystemColor.textHighlight);
	    	 stairsProgress.setBounds(21, 110, 266, 36);
	    	 StairsPanel.add(stairsProgress);
	    	 
	    	 JLabel lblStairs = new JLabel("Stairs");
	    	 lblStairs.setHorizontalAlignment(SwingConstants.CENTER);
	    	 lblStairs.setBounds(102, 63, 92, 26);
	    	 StairsPanel.add(lblStairs);

	     }
}

