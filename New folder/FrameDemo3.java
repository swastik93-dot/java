//GUI implimentation
//window creation 
//window close

import java.lang.*;
import java.awt.*;     //He sagale packges aheat
import java.awt.event.*;

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);
//action ghatalili kalava mahnun listnor lavala
//so addWindowListener
        fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener implements WindowListener
{
    //ya saglya error hotya te  methods define  kalya

    public void windowDeactivated(WindowEvent obj){}
    public void windowActivated(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){}
    public void windowIconified(WindowEvent obj){}
    public void windowClosed(WindowEvent obj){}
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);  //ya ne ata WINDOW Close hoil
    }
    public void windowOpened(WindowEvent obj){}
}

class FrameDemo3
{
    public static void main(String arg[])
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("PPA");

    }
}