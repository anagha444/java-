import java.awt.*;
import  MAIn.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class LOGIN extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, password_label, message;
   JTextField userName_text;
   String Username;
   String Password;
   JPasswordField password_text;
   JButton submit, cancel;
   JFrame frame;
   public void signup()
   {
   System.out.println("Enter the username");
   Scanner sc = new Scanner(System.in);
    Username=sc.nextLine(); 
    System.out.println("Enter the password");
   Scanner sp = new Scanner(System.in);
   Password=sp.nextLine(); 
   }
   public void DLoginDemo() {
      // Username Label
      user_label = new JLabel();
      user_label.setText("User Name :");
      userName_text = new JTextField();
      // Password Label
      password_label = new JLabel();
      password_label.setText("Password :");
      password_text = new JPasswordField();
      // Submit
      submit = new JButton("SUBMIT");
      panel = new JPanel(new GridLayout(3, 1));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      submit.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Please Login Here !");
      setSize(450,350);
      setVisible(true);
   }
   public static void main(String[] args) {
   LOGIN p = new LOGIN();
   p.signup();
   p.DLoginDemo();
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
      String userName = userName_text.getText();
      String password = password_text.getText();
      if (userName.trim().equals(Username) && password.trim().equals(Password)) {
         message.setText(" Hello " + userName + "");
        dispose();
         MAIn G = new MAIn();
        G.main(null);
      } else {
         message.setText(" Invalid user.. ");
      }
   }
}