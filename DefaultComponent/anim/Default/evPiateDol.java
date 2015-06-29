/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Stasiu
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: evPiateDol
//!	Generated Date	: Thu, 25, Jun 2015 
	File Path	: DefaultComponent/anim/Default/evPiateDol.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evPiateDol.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evPiateDol() 
public class evPiateDol extends RiJEvent implements AnimatedEvent {
    
    public static final int evPiateDol_Default_id = 18625;		//## ignore 
    
    
    // Constructors
    
    public  evPiateDol() {
        lId = evPiateDol_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evPiateDol_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evPiateDol");
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
          String s="evPiateDol(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/evPiateDol.java
*********************************************************************/

