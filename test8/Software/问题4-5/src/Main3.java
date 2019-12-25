import java.applet.*;  
import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Main3 extends Applet{
	
	private JTextField textField;
	private String textContent;

	public void init(){
    	resize(600, 350);
	}
	public Main3(){	 
		this.setLayout(null);
		textField = new JTextField();
		textField.setBounds(20, 58, 500, 250);
		textField.setColumns(10);
		this.add(textField);    
		textField.setText("我是被按钮们控制的字");
		Button buttonBig = new Button("放大它");
		buttonBig.setBounds(200, 310, 76, 23);
		this.add(buttonBig);
		buttonBig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentSize = textField.getFont().getSize();
				Font f=new Font("楷体",Font.BOLD+Font.ITALIC,currentSize*2);
				textField.setFont(f);
			}
		});	
		Button buttonSmall = new Button("缩小它");
		buttonSmall.setBounds(300, 310, 76, 23);
		this.add(buttonSmall);
		buttonSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentSize = textField.getFont().getSize();
				Font f=new Font("楷体",Font.BOLD+Font.ITALIC,currentSize/2);
				textField.setFont(f);
			}
		});	
	}
 }