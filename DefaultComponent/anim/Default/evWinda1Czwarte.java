/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: evWinda1Czwarte
//!	Generated Date	: Wed, 24, Jun 2015 
	File Path	: DefaultComponent/anim/Default/evWinda1Czwarte.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evWinda1Czwarte.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evWinda1Czwarte() 
public class evWinda1Czwarte extends RiJEvent implements AnimatedEvent {
    
    public static final int evWinda1Czwarte_Default_id = 18631;		//## ignore 
    
    
    // Constructors
    
    public  evWinda1Czwarte() {
        lId = evWinda1Czwarte_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evWinda1Czwarte_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evWinda1Czwarte");
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
          String s="evWinda1Czwarte(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/evWinda1Czwarte.java
*********************************************************************/

