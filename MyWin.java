import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWin extends JFrame {
    private int students = 0;
    private JLabel countLabel;
    private JButton addStudent;
    private JButton removeStudent;
    public MyWin(){
        super("My First Window");
        setBounds(100, 100, 500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        countLabel = new JLabel("In the class room:" + students);
        addStudent = new JButton("Add student");
        removeStudent = new JButton("Remove student");
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(countLabel, BorderLayout.NORTH);
        buttonsPanel.add(addStudent);
        buttonsPanel.add(removeStudent);
        add(buttonsPanel, BorderLayout.SOUTH);
        initListeners();
    }

    private void initListeners() {
        addStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                students++;
                updateStudentCounter();
            }
        });
        removeStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (students > 0) {
                    students--;
                    updateStudentCounter();
                }
            }
        });
    }
    private void updateStudentCounter() {
        countLabel.setText("In the class room:" + students);
    }

    public static void main(String[] args) {
        MyWin app = new MyWin();
        app.setVisible(true);
        app.pack();
    }
}
