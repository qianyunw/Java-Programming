import java.applet.*;  
import java.awt.*;  
  
public class Main extends Applet {  
	
    public void paint(Graphics g){       
    	resize(1200, 600);
    	Image img=getImage(getDocumentBase(),"1.JPG");
    	int img_weight = img.getWidth(this);
    	int img_height = img.getHeight(this);
    	g.drawImage(img,20,10,this);	//‘≠Õº
    	g.drawImage(img,650,10,img_weight/2,img_height/2,this);	//Àı–°“ª∞Î
    	g.drawImage(img,20,450,(int)(img_weight*1.5),img_height/3,this);	//øÌ±‚Õº
    	g.drawImage(img,1000,10,img_weight/4,(int)(img_height*1.5),this);	// ›∏ﬂÕº
    }  
} 
