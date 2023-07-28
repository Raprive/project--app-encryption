import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultPage extends JFrame implements ActionListener {

    JButton backBtn;
    static JLabel result;
    static JLabel resultTranslate;

    ResultPage(String message) {

        result = new JLabel();
        result.setForeground(Color.white);
        result.setText("Kodenya adalah " + TesKalimat.tesTipeInput(message));
        result.setFont(new Font(null,Font.PLAIN,15));

        resultTranslate = new JLabel();
        resultTranslate.setForeground(Color.white);
        resultTranslate.setText("Terjemahan adalah " + TesKalimat.tesTipeInput2((message)));
        resultTranslate.setFont(new Font(null,Font.PLAIN,15));

        JPanel containerResult = new JPanel();
        containerResult.add(result);
        containerResult.add(resultTranslate);
        containerResult.setBackground(Color.black);

        backBtn = new JButton();
        backBtn.setText("Back");
        backBtn.setFocusable(false);
        backBtn.setBackground(Color.lightGray);
        backBtn.addActionListener(this);

        JPanel containerBack = new JPanel();
        containerBack.add(backBtn);
        containerBack.setBackground(Color.black);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(480,190);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.add(containerResult,BorderLayout.CENTER);
        this.add(containerBack,BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backBtn) {
            this.setVisible(false);
            new MainPage();
            MainPage.msg.setText("Coba lagi?");
        }
    }
}
