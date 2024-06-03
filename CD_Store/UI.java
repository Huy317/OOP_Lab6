import javax.swing.*;
import java.awt.*;
public class UI extends JFrame {
    private JTextField txtId, txtTitle, txtPrice, txtYearOfRelease;
    private JButton btnAdd, btnClear, btnShowAll;
    public UI(String title) throws HeadlessException{
        super(title);
        this.setSize(600,600);
        this.setLocation(200,200);
        this.setLayout(new GridLayout(7,1));

        JPanel panel1 = new JPanel(new FlowLayout());
        JLabel idLabel = new JLabel("CD ID");
        txtId = new JTextField(20);
        panel1.add(idLabel);panel1.add(txtId);

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.pack();
        
    }
}
