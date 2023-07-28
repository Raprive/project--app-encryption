import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame implements ActionListener {

    JPanel containerText;
    JPanel containerSubmit;
    JButton submit;
    JButton translate;
    static JTextField msg;
    JLabel label;

    MainPage() {

        submit = new JButton();
        submit.setText("Submit");
        submit.setFocusable(false);
        submit.setFont(new Font(null,Font.PLAIN,11));
        submit.setBackground(Color.lightGray);
        submit.addActionListener(this);
        submit.setBounds(20,23,90,30);

        translate = new JButton();
        translate.setText("Translate");
        translate.setFocusable(false);
        translate.setFont(new Font(null,Font.PLAIN,11));
        translate.setBackground(Color.lightGray);
        translate.addActionListener(this);
        translate.setBounds(20,57,90,30);


        containerSubmit = new JPanel();
        containerSubmit.setBounds(0,50,100,140);
        containerSubmit.setBackground(Color.black);
        containerSubmit.setLayout(null);
        containerSubmit.add(submit);
        containerSubmit.add(translate);

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
            ResultPage.resultTranslate.setVisible(false);
        }

        if(e.getSource()==translate) {
            this.setVisible(false);
            new ResultPage(msg.getText());
            ResultPage.result.setVisible(false);
            ResultPage.resultTranslate.setVisible(true);
        }
    }

}
