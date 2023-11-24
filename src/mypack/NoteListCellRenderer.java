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
		Styler styler = new Styler();
		
		notePanel.add(noteTitle, BorderLayout.NORTH);
		notePanel.add(noteBody, BorderLayout.CENTER);
		
		// sstyling
		styler.styleNotePanel(notePanel, noteTitle, noteBody);
		
    	
		return notePanel;
	}

}
