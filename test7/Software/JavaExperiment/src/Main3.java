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
	private JTextField textField1;
	private String textContent;
	
	public Main3(){	
		this.setLayout(null);
		textField = new JTextField();
		textField.setBounds(32, 58, 122, 21);
		textField.setColumns(10);
		this.add(textField);
		textField1 = new JTextField();
		textField1.setBounds(32, 1, 122, 21);
		textField1.setColumns(10);
		textField1.setText("��������״̬��");
		this.add(textField1);
		Button button = new Button("���ұ任");
		button.setBounds(52, 112, 76, 23);
		this.add(button);
		textField.getDocument().addDocumentListener(new DocumentListener() {
			   //�����ı����ݵĲ����¼���
			   public void removeUpdate(DocumentEvent e) {
				   String keyword = textField.getText();
				   textContent = keyword;
			   }
			   //�����ı����ݵĲ����¼��� 
			   public void insertUpdate(DocumentEvent e) {
				   String keyword = textField.getText();
				   textContent = keyword;
			   }
			   //�����ı����Եı仯�� 
			   public void changedUpdate(DocumentEvent e) {
			   }
			  });
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText(textContent);
			}
		});	
	}
 }