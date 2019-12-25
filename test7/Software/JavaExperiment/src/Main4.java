import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.applet.AudioClip;

public class Main4 extends Applet
{
   AudioClip audio;
   Button buttonForever;
   Button buttonOnce;
   public void init()
   {
      buttonForever=new Button("Forever");
      buttonOnce=new Button("Once");
      add(buttonForever);
      add(buttonOnce);

      System.out.println(getDocumentBase());
      try
      {
         audio=getAudioClip(getDocumentBase(),"yes.au");
      }
      catch(Exception e)
      {
         System.out.println(e.toString());
      }
      
      buttonForever.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  try
    		  {
    			  audio.loop();
    		  }
    		  catch (Exception err)
    		  {
    			  System.out.println (err.toString());
    		  }
    	  }
      });	
      
      buttonOnce.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  try
		      {
    			  audio.play();
		      } 
		      catch (Exception err)
		      {
		    	  System.out.println (err.toString());
		      }
    	  }
      });	
   }
}