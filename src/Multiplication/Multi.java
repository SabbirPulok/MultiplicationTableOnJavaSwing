package Multiplication;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Multi extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container c;
	private Font font;
	private JLabel imgLabel,TextField;
	private ImageIcon img;
	private JTextField number;
	private JTextArea showNumber;
	private JButton clearBtn;
	private Cursor cursor;
	
	Multi()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		font = new Font("Tahoma", Font.BOLD,16);
		
		img = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\MultiplicationTable\\jigsaw.png");
		this.setIconImage(img.getImage());
		
		//img = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\MultiplicationTable\\multi.jpg");
		img = new ImageIcon(new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\MultiplicationTable\\multi.jpg").getImage().getScaledInstance(460, 150, Image.SCALE_DEFAULT));
		
		imgLabel = new JLabel(img);
		imgLabel.setBounds(20,30,img.getIconWidth(),img.getIconHeight());
		c.add(imgLabel);
		
		TextField = new JLabel("Enter Your Number: ");
		TextField.setBounds(30,190,200,30);
		TextField.setFont(font);
		TextField.setForeground(Color.BLUE);
		c.add(TextField);
		
		number = new JTextField();
		number.setBounds(241,190,90,40);
		number.setHorizontalAlignment(JTextField.CENTER);
		number.setBackground(Color.BLACK);
		number.setForeground(Color.GREEN);
		number.setFont(font);
		c.add(number);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		clearBtn = new JButton("Clear");
		clearBtn.setBounds(241,240,90,50);
		clearBtn.setCursor(cursor);
		clearBtn.setBackground(Color.RED);
		clearBtn.setForeground(Color.WHITE);
		clearBtn.setFont(font);
		c.add(clearBtn);
		
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
				{
					number.setText("");
					showNumber.setText("");
				}
			});
		
		showNumber = new JTextArea();
		showNumber.setBounds(40,300,300,320);
		showNumber.setFont(font);
		showNumber.setBackground(Color.BLACK);
		showNumber.setForeground(Color.GREEN);
		c.add(showNumber);
		
		number.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				 
				try {
					int num = Integer.parseInt(number.getText());
					for(int i =1; i<=10; i++)
					{
						int result = num*i;
						
						String res = String.valueOf(result);
						String n = String.valueOf(num);
						String incr = String.valueOf(i);
						
						showNumber.append(n+" * "+incr+" = "+res+"\n");
					}
			
			 //number.setText("");

        } catch (NumberFormatException ae) {
            JOptionPane.showMessageDialog(null, "Please enter a number");
        }
    }
			

		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi frame  = new Multi();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Multiplication Table");
		frame.setBounds(400,10,500,660);
		frame.setResizable(false);
	}

}
