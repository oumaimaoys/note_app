package mypack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;

class NoteListCellRenderer implements ListCellRenderer<Note> {

	@Override
	public Component getListCellRendererComponent(JList<? extends Note> list, Note note, int index, boolean isSelected,
			boolean cellHasFocus) {
		
	  	// notes panel elements
		JPanel notePanel = new JPanel(new BorderLayout());
		JLabel noteTitle = new JLabel(note.getTitle());
		JTextArea noteBody = new JTextArea(note.getBody());
		
		notePanel.add(noteTitle, BorderLayout.NORTH);
		
		JScrollPane noteScrollPane = new JScrollPane(noteBody);
		//noteScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		notePanel.add(noteScrollPane, BorderLayout.CENTER);
		
		notePanel.setPreferredSize(new Dimension(300,200));
		noteTitle.setPreferredSize(new Dimension(300,20));
		noteBody.setPreferredSize(new Dimension(300,170));
		
		notePanel.setBackground(Color.CYAN);
		
    	
		return notePanel;
	}

}
