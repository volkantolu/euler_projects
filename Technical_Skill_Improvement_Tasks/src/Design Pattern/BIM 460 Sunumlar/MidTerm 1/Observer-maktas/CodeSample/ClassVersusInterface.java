/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//package observer10;

//Observer
interface AlarmListener { public void alarm(); }

//Subject
class SensorSystem {
   private java.util.Vector listeners = new java.util.Vector();

   public void register( AlarmListener al ) { listeners.addElement( al ); }
   public void soundTheAlarm() {

      for (java.util.Enumeration e=listeners.elements(); e.hasMoreElements(); )
         ((AlarmListener)e.nextElement()).alarm();
}  }
class Lighting implements AlarmListener {
   public void alarm() { System.out.println( "lights up" ); }
}

class Gates implements AlarmListener {
   public void alarm() { System.out.println( "gates close" ); }
}
class AlarmSound implements AlarmListener {

public void alarm() { System.out.println( "Alarm sounds are on" ); }

}

/**
 *
 * @author memo
 */
public class ClassVersusInterface {
  public static void main( String[] args ) {
      SensorSystem ss = new SensorSystem();
      ss.register( new Gates()        );
      ss.register( new Lighting()     );
      ss.register(new  AlarmSound()   );
      ss.soundTheAlarm();
}
}
