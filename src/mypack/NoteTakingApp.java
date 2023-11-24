package mypack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NoteTakingApp extends JFrame{
	private DefaultListModel<Note> noteListModel;
    private JList<Note> noteJList;
    private JTextField searchField;
    private JButton newNote;
    private String directoryPath;
    private Styler styler;
    
    
    public NoteTakingApp() {
    	super("Note Taking App");
    	
    	styler = new Styler();
    	directoryPath = new String();
    	searchField = new JTextField("Search in notes");
    	newNote = new JButton();
    	noteListModel = new DefaultListModel<>();
        noteJList = new JList<>(noteListModel);
    	noteJList.setCellRenderer(new NoteListCellRenderer());
    	
    	// layout of the app 
    	JPanel headerPanel = new JPanel();
    	JPanel bodyPanel = new JPanel(new BorderLayout());
    	JPanel titlePanel = new JPanel(new FlowLayout());
    	JPanel notesPanel = new JPanel();
    
        // header elements
        headerPanel.add(searchField);
        
        // body elements
        JLabel title = new JLabel("Your Notes");
        newNote = new JButton("+ Note");
        
        titlePanel.add(title);
        titlePanel.add(newNote);
       
        notesPanel.setLayout(new BoxLayout(notesPanel, BoxLayout.Y_AXIS));
        notesPanel.add(noteJList);

        bodyPanel.add(titlePanel, BorderLayout.NORTH);
        bodyPanel.add(notesPanel, BorderLayout.CENTER);
        
        JScrollPane scrollPane = new JScrollPane(notesPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
    	bodyPanel.add(scrollPane);
    	
    	// layout manager 
    	setLayout(new BorderLayout());
    	
    	add(headerPanel, BorderLayout.NORTH);
    	add(bodyPanel, BorderLayout.CENTER);
    
        // styling
    	styler.styleHeader(headerPanel);
        styler.styleSearch(searchField);
        styler.styleButton(newNote);
        styler.styleHeading1(title);
    	bodyPanel.setBackground(new Color(237, 246, 249));
    	notesPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
    	// actions
    	newNote.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addNote();	
			}
    		
    	});
    	
    	setSize(1000, 600);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLocationRelativeTo(null);
    	setVisible(true);
    }
    
    private void addNote() {
    	// configure frame
    	JFrame noteFrame = new JFrame("new note");
    	noteFrame.setSize(400, 300);
        noteFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the nested frame on close
        noteFrame.setLocationRelativeTo(this);
        
        // add elements
        JTextField title = new JTextField();
        JTextArea body = new JTextArea();
        JButton saveButton = new JButton("save");
        
        title.setPreferredSize(new Dimension(180, 20));
        body.setPreferredSize(new Dimension(180, 150));
        
        noteFrame.setLayout(new BorderLayout());
        noteFrame.add(title, BorderLayout.NORTH);
        noteFrame.add(body, BorderLayout.CENTER);
        noteFrame.add(saveButton, BorderLayout.SOUTH);
        
        // Make the nested frame visible
        noteFrame.setVisible(true);
        
        // actions
        saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String titleText = title.getText();
				String bodyText = body.getText();
				if(titleText.isEmpty() || bodyText.isEmpty()) {
					JOptionPane.showMessageDialog(null, "please fill in the fields");
				}
				else {
					Note note = new Note(titleText, bodyText);
					noteListModel.addElement(note);
					noteFrame.dispose();
				}
	
			}
        	
        });
    }
    
    private void saveNote() { // save it into file
    	
    }
    
    private void loadNote() { // load it from file after closing and opening the app
    	
    }
    
    private void editNote() {
    	
    }
    
    private void deleteNote() {
    	
    }
    
    private void getDirectoryPath() {
    	JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // Show the file chooser dialog
        int result = fileChooser.showDialog(this, "Choose");

        // Check if the user selected a folder
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();
            directoryPath = selectedFolder.getAbsolutePath();
        }

    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                NoteTakingApp myApp = new NoteTakingApp();
                if (myApp.directoryPath.length() == 0) {
                	myApp.getDirectoryPath();
                }
            }
        });
    }
}
