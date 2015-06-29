/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Stasiu
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: evAlarm
//!	Generated Date	: Thu, 25, Jun 2015 
	File Path	: DefaultComponent/anim/Default/evAlarm.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evAlarm.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evAlarm() 
public class evAlarm extends RiJEvent implements AnimatedEvent {
    
    public static final int evAlarm_Default_id = 18639;		//## ignore 
    
    
    // Constructors
    
    public  evAlarm() {
        lId = evAlarm_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evAlarm_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evAlarm");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="evAlarm(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/evAlarm.java
*********************************************************************/

