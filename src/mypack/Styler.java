package mypack;

import javax.swing.*;
import java.awt.*;


class Styler {
	public Styler() {
		
	}
	public void styleHeader(JPanel header) {
		header.setBackground(new Color(162, 136, 166));
        header.setPreferredSize(new Dimension(header.getPreferredSize().height, 50));
	}
	
	public void styleSearch(JTextField search) {
		search.setPreferredSize(new Dimension(200,30));
        search.setFont(new Font("Verdana", Font.PLAIN, 14));
        search.setForeground(new Color(28, 29, 33));
        search.setBackground(Color.WHITE);
        search.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
	}
	public void styleButton(JButton button) {
		button.setBackground(new Color(204, 188, 188));
		button.setFont(new Font("Verdana", Font.BOLD, 12));
		button.setForeground(new Color(28, 29, 33));
		button.setBounds(new Rectangle(900,60,40,20));
		
	}
	
	public void styleHeading1(JLabel h1) {
		h1.setFont(new Font("Verdana", Font.BOLD, 40));
		h1.setForeground(new Color(28, 29, 33));
	}
	
	public void styleHeading3(JLabel h3) {
		h3.setFont(new Font("Verdana", Font.BOLD, 30));
		h3.setForeground(new Color(28, 29, 33));
	}
	
	public void styleParagragh(JTextArea text) {
		text.setFont(new Font("Verdana", Font.PLAIN, 15));
		text.setForeground(new Color(28, 29, 33));
	}
	
	
	public void styleNotePanel(JPanel notePanel, JLabel noteTitle, JTextArea noteBody) {
		this.styleHeading3(noteTitle);
		this.styleParagragh(noteBody);
		
		notePanel.setBackground(new Color(236, 235, 243));
		noteTitle.setBackground(new Color(236, 235, 243));
		noteBody.setBackground(new Color(236, 235, 243));
		
		notePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		notePanel.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
		noteTitle.setBorder(BorderFactory.createEmptyBorder(5, 2, 5, 0));
		noteBody.setBorder(BorderFactory.createEmptyBorder(5, 2, 5, 0));
		
		notePanel.setPreferredSize(new Dimension(280,200));
		noteTitle.setPreferredSize(new Dimension(280,40));
		noteBody.setPreferredSize(new Dimension(300,170));
	}
}
