package Task24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Task6 {
	
	
	 public static void main(String[] args) {
	        
	        JFrame frame = new JFrame("To-Do App for user");
	        frame.setSize(400, 500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(null);

	        
	        JTextField taskField = new JTextField();
	        taskField.setBounds(20, 20, 250, 30);
	        frame.add(taskField);

	        
	        JButton addButton = new JButton("Add Task");
	        addButton.setBounds(280, 20, 90, 30);
	        frame.add(addButton);

	        
	        DefaultListModel<String> taskListModel = new DefaultListModel<>();
	        JList<String> taskList = new JList<>(taskListModel);
	        JScrollPane scrollPane = new JScrollPane(taskList);
	        scrollPane.setBounds(20, 70, 350, 300);
	        frame.add(scrollPane);

	        
	        JButton removeButton = new JButton("Remove Task");
	        removeButton.setBounds(130, 390, 120, 30);
	        frame.add(removeButton);

	        
	        addButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String task = taskField.getText().trim();
	                if (!task.isEmpty()) {
	                    taskListModel.addElement(task);
	                    taskField.setText("");
	                } else {
	                    JOptionPane.showMessageDialog(frame, "Please enter a task.");
	                }
	            }
	        }
	        );

	       
	        removeButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                int selectedIndex = taskList.getSelectedIndex();
	                if (selectedIndex != -1) {
	                    taskListModel.remove(selectedIndex);
	                } else {
	                    JOptionPane.showMessageDialog(frame, "Please select a task to remove.");
	                }
	            }
	        }
	        );

	        
	        frame.setVisible(true);
	    }

}
