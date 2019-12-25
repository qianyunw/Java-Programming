import java.awt.Graphics; 
import java.applet.Applet;
/**  嘎嘎
  *  王倩芸
  */
public class AppletHelloWorld extends Applet{    // AppletHelloWorld 类定义 
	public void paint(Graphics g){      // 重载 paint()方法
          g.drawString("Java Applet Hello World!",25,25);// 输出图形文字 
	}	// end paint
}    // end AppletHelloWorld