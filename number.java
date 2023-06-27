import java.awt.*;
import java.applet.*;

public class number extends Applet
{
public void paint (Graphics g){

int a=1;
int b=2;
int c=a+b;
String s = "Sum = " + String.valueOf(c);
g.drawString(s,100,100);
}

}