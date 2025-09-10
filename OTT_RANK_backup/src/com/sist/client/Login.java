package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame 
implements ActionListener
{
    JLabel la1, la2;
    JTextField tf;
    JPasswordField pf;
    JButton b1, b2, b3;

    JoinForm join=new JoinForm();
    
    public Login() {
       
        setTitle("Login");
        setSize(253, 175); 
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // EXIT_ON_CLOSE면 로그인 창 닫았을 시 메인창도 같이 꺼짐
        setLocationRelativeTo(null); 

        la1 = new JLabel("ID", JLabel.CENTER);
        la2 = new JLabel("PW", JLabel.CENTER);
        tf = new JTextField();
        pf = new JPasswordField();
        b1 = new JButton("로그인");
        b2 = new JButton("가입");
        b3 = new JButton("취소");

       
        la1.setBounds(10, 18, 40, 25);
        tf.setBounds(57, 18, 118, 28);

        la2.setBounds(14, 51, 40, 25);
        pf.setBounds(57, 51, 118, 28);

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0)); 
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.setBounds(15, 93, 205, 30);

        
        add(la1);
        add(tf);
        add(la2);
        add(pf);
        add(p);
        
        b1.addActionListener(this); // 로그인
       b2.addActionListener(this); // 회원가입 
       b3.addActionListener(this); // 취소
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1)
      {
         dispose();
      }
      else if(e.getSource()==b2)
      {
         this.setVisible(false);
         join.setVisible(true);
      }
      else if(e.getSource()==b3)
      {
         dispose();
         System.exit(0);
      }
   }
}
