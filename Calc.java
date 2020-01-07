import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Calc.class" width="300" height="300">  
</applet>*/ 
public class Calc extends Applet implements ActionListener
{
Label l;
TextField t1,t2;
Button b1,b2;
public void init()
{
l=new Label("                           ");
t1=new TextField(10);
t2=new TextField(10);
b1=new Button("ADD");
b2=new Button("SUB");
add(t1);
add(t2);
add(l);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int a,b,c;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
if(e.getSource()==b1)
{
c=a+b;
l.setText("Addition"+c);
}
else if(e.getSource()==b2)
{
c=a-b;
l.setText("sub "+c);
}
}
}











