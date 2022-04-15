/*
 * Java Application: 	Search Engine
 * Operation: 			This search engine will allow you to search for a word of your choice
 * 						from a given set of five files to check which file has the best match
 * 						with the chosen word, it will also display which file had the
 * 						strongest match with the word and be placed into an array for display
 * 
 * Author:				Yinka Adebesin
 * Date:				15th April 2022
 * 
 */
package Assignment;

// All imports
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MySearchEngine extends JFrame implements ActionListener{
	
	//Apparently this removes the error so it stays :/
	private static final long serialVersionUID = 1L;
	
	// Basic attributes
	String word;
	String forf1, forf2, forf3, forf4, forf5;
	int i;
	int j;
	
	// Array attribute
	ArrayList<Integer> record = new ArrayList<Integer>();
	
	// FileProcessor attribute
	FileProcessor Refer;
	
	// Javax.swing attributes
	JPanel panel;
	JTextField jtf;
	JLabel label, label1;
	JButton Search;
	JRadioButton FirstFile, SecondFile, ThirdFile, FourthFile, FifthFile;
	
	// Constructor
	MySearchEngine() {
		
		// Setting the behaviour of the JFrame 
		this.setLayout(new FlowLayout());
		this.setSize(600,400);
		this.setResizable(false);
		this.setTitle("Search Engine");
		this.setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Instantiating a new object
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		
		//Instantiating a new object(s)
		FirstFile = new JRadioButton("1");
		SecondFile = new JRadioButton("2");
		ThirdFile = new JRadioButton("3");
		FourthFile = new JRadioButton("4");
		FifthFile = new JRadioButton("5");
		
		//Instantiating a new object
		label = new JLabel();
		label.setText("Welcome to the Search engine.Please select all files, then enter a text:");
		
		//Instantiating a new object
		jtf = new JTextField();
		jtf.setPreferredSize(new Dimension(100,25));
		
		//Instantiating a new object
		Refer = new FileProcessor();
		
		//Instantiating a new object
		Search = new JButton();
		Search.setBounds(200,100,100,50);
		Search.setText("Search");
		Search.getText();
		Search.addActionListener(this);
		
		// Adding all objects to JFrame
		this.add(label);
		
		this.add(panel);
		
		panel.add(FirstFile);
		panel.add(SecondFile);
		panel.add(ThirdFile);
		panel.add(FourthFile);
		panel.add(FifthFile);
		
		this.add(jtf);
		this.add(Search);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// When the 'Search' button is clicked
		if(e.getSource() == Search) {
			
			// Print to the console
			System.out.println("Word:\t" + jtf.getText() + "\n\n");
			
			if(FirstFile.isSelected()){
				word = jtf.getText();
				
				while(Refer.scan1.hasNext()) {
					forf1 = Refer.scan1.nextLine();
					if(forf1.contains(word)) {
						i++;
					}
				}
				if(i > 0) {
					// Print to the console
					System.out.println("File:\t1\nPresence:\tFound");
					System.out.println("Appearances:\t" + i);
				}
				else {
					// Print to the console
					System.out.println("\nFile:\t1\nPresence:\tNot found");
					System.out.println("Error:\t Word does not match.");
				}
				
				i = 0;
			}
			if(SecondFile.isSelected()){
				word = jtf.getText();
				
				while(Refer.scan2.hasNext()) {
					forf2 = Refer.scan2.nextLine();
					if(forf2.contains(word)) {
						i++;
					}
				}
				if(i > 0) {
					// Print to the console
					System.out.println("\nFile:\t2\nWord:\tFound");
					System.out.println("Appearances:\t" + i);
				}
				else {
					// Print to the console
					System.out.println("\nFile:\t2\nPresence:\tNot found");
					System.out.println("Error:\t Word does not match.");
				}
				
				record.add(i);
				i = 0;
			}
			if(ThirdFile.isSelected()){
				word = jtf.getText();
				
				while(Refer.scan3.hasNext()) {
					forf3 = Refer.scan3.nextLine();
					if(forf3.contains(word)) {
						i++;
					}
				}
				if(i > 0) {
					// Print to the console
					System.out.println("\nFile:\t3\nWord:\tFound");
					System.out.println("Appearances:\t" + i);
				}
				else {
					// Print to the console
					System.out.println("\nFile:\t3\nPresence:\tNot found");
					System.out.println("Error:\t Word does not match.");
				}
				
				record.add(i);
				i = 0;
			}
			if(FourthFile.isSelected()){
				word = jtf.getText();
				
				while(Refer.scan4.hasNext()) {
					forf4 = Refer.scan4.nextLine();
					if(forf4.contains(word)) {
						i++;
					}
				}
				if(i > 0) {
					// Print to the console
					System.out.println("\nFile:\t4\nWord:\tFound");
					System.out.println("Appearances:\t" + i);
				}
				else {
					// Print to the console
					System.out.println("\nFile:\t4\nPresence:\tNot found");
					System.out.println("Error:\t Word does not match.");
				}
				
				record.add(i);
				i = 0;
			}
			if(FifthFile.isSelected()){
				word = jtf.getText();
				
				while(Refer.scan5.hasNext()) {
					forf5 = Refer.scan5.nextLine();
					if(forf5.contains(word)) {
						i++;
					}
				}
				if(i > 0) {
					// Print to the console
					System.out.println("\nFile:\t5\nPresence:\tFound");
					System.out.println("Appearances:\t" + i);
				}
				else {
					// Print to the console
					System.out.println("\nFile:\t5\nPresence:\tNot found");
					System.out.println("Error:\t Word does not match.");
				}
				
				record.add(i);
				i = 0;
				
			}
			if(record.isEmpty()) {
				// A pop-up will appear should this statement be true ^^
				JOptionPane.showMessageDialog(
						null,
						"You did not select any file to be assessed",
						"File Not Selected",
						JOptionPane.ERROR_MESSAGE);
			}
			if(jtf.getText() == "") {
				// A pop-up will appear should this statement be true ^^
				JOptionPane.showMessageDialog(
						null,
						"You did not type a word to be examined",
						"Word Not Selected",
						JOptionPane.WARNING_MESSAGE);
			}
			
			// Displaying the final record of the array to the console
			System.out.println("\n\nThis is the record, counting from File1 -- File5:\t" + record);
		}
		
	}

}
