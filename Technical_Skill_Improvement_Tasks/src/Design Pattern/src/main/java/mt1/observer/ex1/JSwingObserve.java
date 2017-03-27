package mt1.observer.ex1;
//package observer10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.util.Vector;
import javax.swing.*;

//
//Observer
//
abstract interface Observer {
  public void sendNotify(String s);
}
//=============================================
//
//Subject
//
abstract interface Subject {
//tell the Subject you are interested in changes
public void registerInterest(Observer obs);
public void unsubscribeInterest(Observer obs) ;

}

//=============================================
//
//ConcreteSubject
//
class Watch2L extends JFrame
implements ActionListener, ItemListener, Subject {
Button Close;
JRadioButton red, green, blue,yellow;

Vector observers;
//------------------------------------------
public Watch2L() {
super("Change 2 other frames");
//list of observing frames
observers = new Vector();
//add panel to content pane
JPanel p = new JPanel(true);
p.setLayout(new BorderLayout());
getContentPane().add("Center", p);
//vertical box layout
Box box = new Box(BoxLayout.Y_AXIS);
p.add("Center", box);

//add 3 radio buttons
box.add(red = new JRadioButton("Red"));
box.add(green = new JRadioButton("Green"));
box.add(blue = new JRadioButton("Blue"));
box.add(yellow = new JRadioButton("Yellow"));
//listen for clicks on radio buttons
blue.addItemListener(this);
red.addItemListener(this);
green.addItemListener(this);
yellow.addItemListener(this);
ButtonGroup bgr = new ButtonGroup();
bgr.add(red);
bgr.add(green);
bgr.add(blue);
bgr.add(yellow);
setBounds(300, 300, 300, 300);
setVisible(true);

addWindowListener(new WindowAdapter(){
            @Override
      public void windowClosing(WindowEvent we){
        System.exit(0);
      }
    });

}

public void registerInterest(Observer obs) {
//adds observer to list in Vector
observers.addElement(obs);
}

public void unsubscribeInterest(Observer obs) {
//adds observer to list in Vector
  observers.remove(obs);
}


private void notifyObservers(JRadioButton rad) {
//sends text of selected button to all observers
String color = rad.getText();
for (int i=0; i< observers.size(); i++) {
((Observer)(observers.elementAt(i))).sendNotify(color);
  }
 }

public void itemStateChanged(ItemEvent e) {
//responds to radio button clicks
//if the button is selected
if(e.getStateChange() == ItemEvent.SELECTED)
notifyObservers((JRadioButton)e.getSource());
}

    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

//=============================================
//
//ConcreteObserver1
//

class ColorFrame extends JFrame
implements Observer {
Color color;
String color_name="black";
JPanel p = new JPanel(true);
JButton subscribe,unsubscribe ;
Subject s;
//--------------------------------------
public ColorFrame(Subject s2) {

super("Colors"); //set frame caption
getContentPane().add("Center", p);

this.s = s2;
//vertical box layout
Box box = new Box(BoxLayout.Y_AXIS);
p.add("Center", box);

//Subscribe buttons
subscribe = new JButton("Subscribe");
unsubscribe = new JButton("Unsubscribe");
//add 3 radio buttons
box.add(subscribe);
box.add(unsubscribe);
subscribe.setActionCommand("sub");
unsubscribe.setActionCommand("unsub");

 
subscribe.addActionListener(enableActionListener);
unsubscribe.addActionListener(enableActionListener);


setBounds(300, 300, 300, 300);
color = Color.DARK_GRAY;
//setBackground(color);

setVisible(true);


addWindowListener(new WindowAdapter(){
            @Override
      public void windowClosing(WindowEvent we){
        System.exit(0);
      }
    });
}

ActionListener enableActionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
          if(actionEvent.getActionCommand().equals("sub")){
            s.registerInterest(ColorFrame.this);
            System.out.println("ColorFrame Object subscribed to Color Object");
            subscribe.setEnabled(false);
            unsubscribe.setEnabled(true);
          }
            
          if(actionEvent.getActionCommand().equals("unsub")){
             s.unsubscribeInterest(ColorFrame.this);
             System.out.println("ColorFrame Object Unsubscribed from Color Object");
             unsubscribe.setEnabled(false);
             subscribe.setEnabled(true);
           }
    
      }
    };




//--------------------------------------
    @Override
public void paint(Graphics g) {
Graphics2D d = (Graphics2D)g;
    d.setRenderingHint(
RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    GradientPaint gpaint = new GradientPaint(
        50, 80, color,50, 110, color);
        Ellipse2D el = new Ellipse2D.Double(5, 30, 280, 160);
        d.setPaint(gpaint);
        d.fill(el);
    double rotation = Math.PI/8;
    d.transform(AffineTransform.getRotateInstance(rotation));
    Font font = new Font("Serif", Font.TRUETYPE_FONT, 50);
        d.setFont(font);
        d.setPaint(Color.white);
    String str = color_name;
        d.drawString(str,80,60);
       
}
//--------------------------------------
public void sendNotify(String s) {
//Observer is notified
color_name = s; //save color name
if(s.toUpperCase().equals("RED"))
color = Color.red;
if(s.toUpperCase().equals("BLUE"))
color =Color.blue;
if(s.toUpperCase().equals("GREEN"))
color = Color.green;
if(s.toUpperCase().equals("YELLOW"))
color = Color.yellow;
// setBackground(color);
 repaint();


}

}

//=============================================
//
//ConcreteObserver2
//

class ListFrame extends JFrame
implements Observer {
JList list;
JPanel p;
JScrollPane lsp;
JListData listData;
JButton subscribe,unsubscribe ;
Subject s;
public ListFrame(Subject s2) {
super("Color List");
this.s = s2 ;

//put panel into the frmae
p = new JPanel(true);
getContentPane().add("Center", p);
p.setLayout(new BorderLayout());
//Tell the Subject we are interested

Box box = new Box(BoxLayout.X_AXIS);
p.add (box);

//Create the list
listData = new JListData(); //the list model
list = new JList(listData); //the visual list
lsp = new JScrollPane(); //the scroller
lsp.getViewport().add(list);
box.add("Center", lsp);



//Subscribe buttons
subscribe = new JButton("Subscribe");
unsubscribe = new JButton("Unsubscribe");
//add 3 radio buttons
box.add(subscribe);
box.add(unsubscribe);
subscribe.setActionCommand("sub");
unsubscribe.setActionCommand("unsub");


subscribe.addActionListener(enableActionListener);
unsubscribe.addActionListener(enableActionListener);

lsp.setPreferredSize(new Dimension(100,100));
setBounds(300, 300, 300, 300);
setVisible(true);
addWindowListener(new WindowAdapter(){
            @Override
      public void windowClosing(WindowEvent we){
        System.exit(0);
      }
    });
}

ActionListener enableActionListener = new ActionListener() {
public void actionPerformed(ActionEvent actionEvent) {
  if(actionEvent.getActionCommand().equals("sub")){
    s.registerInterest(ListFrame.this);
    System.out.println("ListFrame subscribed to Color Object");
     subscribe.setEnabled(false);
     unsubscribe.setEnabled(true);
  }
    
  if(actionEvent.getActionCommand().equals("unsub")){
    s.unsubscribeInterest(ListFrame.this);
    System.out.println("ListFrame UNsubscribed from Color Object");
    unsubscribe.setEnabled(false);
    subscribe.setEnabled(true);
    }
     


}
};
//--------------------------------
public void sendNotify(String s) {
listData.addElement(s);

 }
}

class JListData extends AbstractListModel {
private Vector data; //the color name list
public JListData() {
data = new Vector();
}
public int getSize() {
return data.size();
}
public Object getElementAt(int index) {
return data.elementAt(index);
}
//add string to list and tell the list about it
public void addElement(String s) {
data.addElement(s);
fireIntervalAdded(this, data.size()-1, data.size());
}
}

 /**
 *
 * @author memo
 */
public class JSwingObserve {

  public static void main( String[] args ) {

        Subject sbj = new Watch2L();
        //---------create observers---------
        ColorFrame cframe = new ColorFrame(sbj);
        ListFrame lframe = new ListFrame(sbj);
  }

}
