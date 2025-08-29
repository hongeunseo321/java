package com.sist.client;
import javax.swing.*;
import java.awt.*;

public class HomeForm extends JPanel{
	JTextField jf;
	JButton b1;

	public HomeForm()
	{
       setLayout(null);

       jf = new JTextField();
       b1 = new JButton("검색");
       
   
       
       JPanel p = new JPanel();
       p.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
       
       jf.setPreferredSize(new Dimension(800, 35));
       b1.setPreferredSize(new Dimension(90, 35));
       
       p.add(jf);
       p.add(b1);
       
       p.setBounds(100, 0, 1020, 40);
       
       add(p);
	}
}
