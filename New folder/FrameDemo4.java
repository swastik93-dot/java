//GUI implimentation
//window creation 
//window close

//He sagale packges aheat
import java.lang.*;
import java.awt.*;     //awt is A TOOLKIT (macanic kade aste tashi)
import java.awt.event.*;

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);//yani frame screen vr yail
        
//action ghatalili kalava mahnun listnor lavala
//so addWindowListener
        fobj.addWindowListener(new MarvellousListener());
    }
}
  // windowadapter ni override hoil ty ne khalchya(magil programm chya)error jyanchi garaj nahi ty yenar nahi
class MarvellousListener extends WindowAdapter          //implements WindowListener
{
    //tayar zalale window close hoil ya mule
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);  //ya ne ata WINDOW Close hoil
    }
   
}

class FrameDemo4
{
    public static void main(String arg[])
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("PPA");

    }
}