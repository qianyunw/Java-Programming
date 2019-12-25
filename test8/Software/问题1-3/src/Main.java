import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Main extends JFrame {

	private JPanel contentPane;

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
	private static Color[] color={Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,       //������ɫ����
		Color.ORANGE,Color.YELLOW,Color.RED,Color.PINK,Color.LIGHT_GRAY};
	private static final Random rand = new Random();   //�����������
	private static Color getC(){      //��ȡ�����ɫֵ�ķ���
		return color[rand.nextInt(color.length)];
	}
	
	public class myPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(getC());
	    	g.fillRect(0,60,30,30);//Ϳֱ�Ǿ���
			g.setColor(getC());
	    	g.fillRect(40,60,30,30);//Ϳֱ�Ǿ���
			g.setColor(getC());
	    	g.fillRect(80,60,30,30);//Ϳֱ�Ǿ���
			g.setColor(getC());
	    	g.fillRect(120,60,30,30);//Ϳֱ�Ǿ���
			g.setColor(getC());
	    	g.fillRect(160,60,30,30);//Ϳֱ�Ǿ���
			g.setColor(getC());
	    	g.fillRect(200,60,30,30);//Ϳֱ�Ǿ���
			g.setColor(getC());
	    	g.fillRect(240,60,30,30);//Ϳֱ�Ǿ���
			g.setColor(getC());
	    	g.fillRect(280,60,30,30);//Ϳֱ�Ǿ���
			g.setColor(getC());
	    	g.fillRect(320,60,30,30);//Ϳֱ�Ǿ���
			g.setColor(getC());
	    	g.fillRect(360,60,30,30);//Ϳֱ�Ǿ���
		}
	}
	
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		myPanel panel = new myPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	}
	/**

    @Override
    public void paint(Graphics g) {
    	
    	g.drawString("�߶�", 20, 50);
    	g.drawString("ֱ�Ǿ���", 20, 80);
    	g.drawString("Բ�Ǿ���", 20, 120);
    	g.drawString("Բ", 20, 170);
    	g.drawString("��Բ", 20, 220);
    	
    	g.drawLine(80,45,200,45);//��һ���߶�

    	g.setColor(Color.pink);
    	g.fillRect(80,60,30,30);//Ϳֱ�Ǿ���
    	
   	    g.setColor(Color.blue); 
   	    g.fillRoundRect(80,100,40,40,10,10);//ͿԲ�Ǿ���

   	    g.setColor(Color.cyan);
   	    g.fillOval(80,150,40,40);//ͿԲ��
   	     
   	    g.setColor(Color.magenta);
   	    g.fillOval(80,200,80,30);//Ϳ��Բ
   	    
   	    Font f=new Font("����",Font.BOLD,15);
   	    g.setFont(f);
   	    g.setColor(Color.BLACK); 
   	 	g.drawString("��",20,270);
   	 	
   	 	f=new Font("��Բ",Font.ITALIC,25);
	    g.setFont(f);
   	    g.setColor(Color.green); 
	 	g.drawString("ϲ��",40,270);
	 	
	 	f=new Font("����",Font.BOLD+Font.ITALIC,35);
   	    g.setFont(f);
   	    g.setColor(Color.yellow); 
   	 	g.drawString("��ɫ",90,270);
    }
**/
}
