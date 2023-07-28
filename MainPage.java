import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame implements ActionListener {

    JPanel containerText;
    JPanel containerSubmit;
    JButton submit;
    static JTextField msg;
    JLabel label;

    MainPage() {

        submit = new JButton();
        submit.setText("Submit");
        submit.setFocusable(false);
        submit.setFont(new Font(null,Font.PLAIN,13));
        submit.setBackground(Color.lightGray);
        submit.addActionListener(this);
        submit.setBounds(20,23,80,50);

        containerSubmit = new JPanel();
        containerSubmit.setBounds(0,50,100,140);
        containerSubmit.setBackground(Color.black);
        containerSubmit.setLayout(null);
        containerSubmit.add(submit);

        msg = new JTextField();
        msg.setBounds(130,30,270,30);
        msg.setText("Masukkan kata/kalimat tanpa karakter khusus!");

        containerText = new JPanel();
        containerText.setBounds(0,50,500,500);
        containerText.setBackground(Color.black);
        containerText.setLayout(null);
        containerText.add(msg);

        label = new JLabel();
        label.setText("Masukkan kata yang ingin dikode: ");
        label.setForeground(Color.white);
        label.setOpaque(true);
        label.setBackground(Color.black);
        label.setFont(new Font(null, Font.PLAIN,20));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,480,50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(480,190);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.add(label);
        this.add(containerSubmit);
        this.add(containerText);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit) {
            this.setVisible(false);
            new ResultPage(msg.getText());
        }
    }
}
