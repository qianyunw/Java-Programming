import java.applet.*;  
import java.awt.*;  

import javax.swing.JTextField;

public class Main2 extends Applet{
	private int InitCnt;
	private int StartCnt;
	private int StopCnt;
	private int DestroyCnt;

	private int PaintCnt;
	
	public Main2(){		// 在 init()执行前执行构造方法
		InitCnt = 0;
		StartCnt = 0;
		StopCnt = 0;
		DestroyCnt = 0;
		PaintCnt = 0;
	}
	public void init(){
		resize(320, 240);
		InitCnt++;
	}
	public void destroy(){
		DestroyCnt++;
	}
	public void start(){
		StartCnt++;
	}
	public void stop(){
		StopCnt++;
	}
	public void paint(Graphics g){
		PaintCnt++;
		g.drawLine(20,200,300,200);		// 画出坐标轴和标尺
		g.drawLine(20,200,20,20);
		g.drawLine(20,170,15,170);
		g.drawLine(20,140,15,140);
		g.drawLine(20,110,15,110);
		g.drawLine(20,80,15,80); 
		g.drawLine(20,50,15,50);
		g.drawString("Init()",25,213);
		g.drawString("Start()",75,213);
		g.drawString("Stop()",125,213);
		g.drawString("Destroy()",175,213);
		g.drawString("paint()",235,213);
		g.fillRect(25,200-InitCnt*30,40,InitCnt*30);  // 显示各种方法被调用的次数
		g.fillRect(75,200-StartCnt*30,40,StartCnt*30);
		g.fillRect(125,200-StopCnt*30,40,StopCnt*30);
		g.fillRect(175,200-DestroyCnt*30,40,DestroyCnt*30);
		g.fillRect(235,200-PaintCnt*30,40,PaintCnt*30);
	} 
 }