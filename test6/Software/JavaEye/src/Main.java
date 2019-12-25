import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JTable;


//列表模型
class ListModelA extends AbstractListModel{
	String[] words={"大闸蟹","香蕉","鲍鱼","龙虾","燕窝"};
	public int getSize() {
		return this.words.length;
	}
	public Object getElementAt(int index) {
		return this.words[index];
	}
}

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5C11\u5E74\uFF0C\u6309\u4E0B\u952E\u76D8\u5427\uFF0C\u56DE\u8F66\u6E05\u7A7A\u6211\u2026\u2026");
		lblNewLabel.setForeground(new Color(250, 128, 114));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 10, 414, 28);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 182, 193));
		textField.setBounds(10, 40, 414, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		

		JButton btnNewButton_1 = new JButton("\u6211 \u662F \u522B \u4EBA");
		btnNewButton_1.setFont(new Font("Senty小丸子", Font.PLAIN, 25));
		btnNewButton_1.setForeground(new Color(250, 128, 114));
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setBounds(221, 107, 203, 47);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u9009\u6211\u63A7\u5236\u522B\u4EBA\u7684\u989C\u8272");
		chckbxNewCheckBox.setForeground(new Color(250, 128, 114));
		chckbxNewCheckBox.setBounds(10, 104, 205, 28);
		contentPane.add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u666E\u901A");
		rdbtnNewRadioButton.setForeground(new Color(250, 128, 114));
		rdbtnNewRadioButton.setBounds(10, 134, 57, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("\u9ED1\u4F53");
		radioButton.setForeground(new Color(250, 128, 114));
		radioButton.setBounds(69, 134, 57, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u659C\u4F53");
		radioButton_1.setForeground(new Color(250, 128, 114));
		radioButton_1.setBounds(129, 134, 63, 23);
		contentPane.add(radioButton_1);
		
		ButtonGroup g = new ButtonGroup();
	    g.add(rdbtnNewRadioButton);
	    g.add(radioButton);
	    g.add(radioButton_1);

	    JLabel label = new JLabel("\u9009\u4E2D\uFF1A");
	    label.setForeground(new Color(250, 128, 114));
	    label.setBounds(10, 222, 295, 28);
	    contentPane.add(label);
	    
	    JLabel label_1 = new JLabel("\u53CC\u51FB\uFF1A");
	    label_1.setForeground(new Color(250, 128, 114));
	    label_1.setBounds(315, 219, 109, 34);
	    contentPane.add(label_1);
	    
	    JList list = new JList(new ListModelA());
	    list.setFont(new Font("宋体", Font.PLAIN, 25));
	    list.setBounds(10, 178, 414, 34);
	    list.setBackground(Color.GRAY);
	    list.setForeground(Color.PINK);
	    list.setVisibleRowCount(1);
	    list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
	    //添加列表框到窗体
	    list.addListSelectionListener(new ListSelectionListener(){
	     //实现它的方法
	    	@Override
	    	public void valueChanged(ListSelectionEvent e) {
	    		//TODO Auto-generated method stub
	    		StringBuilder str=new StringBuilder("我要吃： ");
	      
	    		//得到列表框中选定的值
	    		Object valueList[]=list.getSelectedValues();
	      
	    		for(int i=0;i<valueList.length;i++){
	    			String s=(String)valueList[i];
	    			str.append(s);
	    			str.append("、");
	    		}
	    		//将选定的值显示在文本框
	    		label.setText(str.toString());
	    		label_1.setText("双击：");
	    	}
	    });
	    list.addMouseListener(new MouseAdapter(){  
	        public void mouseClicked(MouseEvent e){  
	            if(e.getClickCount()==2){ 
		    		StringBuilder str=new StringBuilder("双击： ");
	            	Object valueList[]=list.getSelectedValues();
		    		for(int i=0;i<valueList.length;i++){
		    			String s=(String)valueList[i];
		    			str.append(s);
		    		}
	            	label_1.setText(str.toString());
	            }  
	        }  
	    });  
	    contentPane.add(list);
	    
	    JButton button = new JButton("\u70B9\u6211\u9000\u51FA");
	    button.setForeground(Color.BLACK);
	    button.setFont(new Font("微软雅黑", Font.PLAIN, 12));
	    button.setBackground(new Color(255, 182, 193));
	    button.setBounds(331, 314, 93, 23);
	    contentPane.add(button);
	    button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	    
	    
	    JButton button_1 = new JButton("\u70B9\u6211\u65B0\u5EFA");
	    button_1.setBackground(new Color(250, 128, 114));
	    button_1.setForeground(new Color(0, 0, 0));
	    button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("新生儿");
		    	frame.getContentPane().setLayout(null);
			    frame.setBounds(100, 300, 300, 100);
			    frame.setVisible(true);
			}
		});
	    button_1.setBounds(212, 314, 93, 23);
	    contentPane.add(button_1);
	    
	    JLabel label_2 = new JLabel("\u9F20\u6807\u4F4D\u7F6E");
	    label_2.setForeground(new Color(250, 128, 114));
	    label_2.setBounds(10, 260, 205, 28);
	    contentPane.add(label_2);
	    
	    rdbtnNewRadioButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {	
	    		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 25));
	    	}
	    });
	    radioButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {	
	    		btnNewButton_1.setFont(new Font("黑体", Font.PLAIN, 25));
	    	}
	    });
	    radioButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {	
	    		btnNewButton_1.setFont(new Font("宋体", Font.ITALIC, 25));
	    	}
	    });

	 
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			@Override
		    public void itemStateChanged(ItemEvent e) {

		       //判断改变的按键的改变后的状态
		       if(e.getStateChange() == ItemEvent.DESELECTED) {
		    	   btnNewButton_1.setBackground(Color.GRAY);
		       }
		       if(e.getStateChange() == ItemEvent.SELECTED) {
		    	   btnNewButton_1.setBackground(Color.GREEN);
		       }
			}
			
		});
		
		textField.getDocument().addDocumentListener(new DocumentListener() {
			   //监听文本内容的插入事件；
			   public void removeUpdate(DocumentEvent e) {
			    String keyword = textField.getText();
			    lblNewLabel.setText(keyword);
			   }
			   //监听文本内容的插入事件； 
			   public void insertUpdate(DocumentEvent e) {
				   String keyword = textField.getText();
				    lblNewLabel.setText(keyword);
			   }
			   //监听文本属性的变化； 
			   public void changedUpdate(DocumentEvent e) {
			   }
			  });
		textField.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent  e)
			 {   
			  if(e.getSource()== textField)
			  {
			   if(e.getKeyCode() == KeyEvent.VK_ENTER) //判断按下的键是否是回车键
			   {  
				   textField.setText("");   
			   }
			  }  
			 }

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			} 
		});
		
		this.addMouseMotionListener(new MouseMotionListener() {
			
			@Override  
		    public void mouseMoved(MouseEvent e) {  
	    		StringBuilder str=new StringBuilder();
	    		str.append("(" + e.getX() + ", " + e.getY() + ")\n");  
	    		label_2.setText(str.toString());
		    }

			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
