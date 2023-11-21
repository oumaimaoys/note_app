package mypack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NoteTakingApp extends JFrame{
	private ArrayList<Note> noteList;
    private JList<Note> noteJList;
    private JTextField searchField;
    private JButton newNote;
    
    
    public NoteTakingApp() {
    	super("Note Taking App");
    	
    	noteList = new ArrayList<Note>();
    	searchField = new JTextField("Search in notes");
    	newNote = new JButton();
    	
    	// layout of the app 
    	JPanel headerPanel = new JPanel();
    	JPanel bodyPanel = new JPanel(new BorderLayout());
    	JPanel titlePanel = new JPanel(new FlowLayout());
    	JPanel notesPanel = new JPanel(new GridLayout(3,3));
    	
    	// header styling
    	headerPanel.setBackground(new Color(158, 209, 204));
        headerPanel.setPreferredSize(new Dimension(headerPanel.getPreferredSize().height, 50));
        
        //header elements
        searchField.setPreferredSize(new Dimension(200,30));
        searchField.setFont(new Font("Verdana", Font.PLAIN, 14));
        searchField.setForeground(Color.BLUE);
        searchField.setBackground(Color.WHITE);
        searchField.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
        headerPanel.add(searchField);
        
        // body elements
        JLabel title = new JLabel("Your Notes");
        newNote = new JButton("+ Note");
        
        title.setFont(new Font("Verdana", Font.BOLD, 40));
        newNote.setBackground(Color.darkGray);
        newNote.setForeground(Color.white);
        
        titlePanel.add(title);
        titlePanel.add(newNote);
        
        bodyPanel.add(titlePanel, BorderLayout.NORTH);
        bodyPanel.add(notesPanel, BorderLayout.CENTER);
        
        // body styling
    	bodyPanel.setBackground(new Color(237, 246, 249));
    	
    	// layout manager
    	setLayout(new BorderLayout());
    	
    	add(headerPanel, BorderLayout.NORTH);
    	add(bodyPanel, BorderLayout.CENTER);
    	
    	setSize(800, 600);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLocationRelativeTo(null);
    	setVisible(true);
    }
    
    private void addNote() {
    	
    }
    
    private void saveNote() {
    	
    }
    
    private void loadNote() {
    	
    }
    
    private void editNote() {
    	
    }
    
    private void deleteNote() {
    	
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NoteTakingApp();
            }
        });
    }
}
