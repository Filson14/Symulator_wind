/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Stasiu
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: evWinda2Piate
//!	Generated Date	: Thu, 25, Jun 2015 
	File Path	: DefaultComponent/anim/Default/evWinda2Piate.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evWinda2Piate.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evWinda2Piate() 
public class evWinda2Piate extends RiJEvent implements AnimatedEvent {
    
    public static final int evWinda2Piate_Default_id = 18638;		//## ignore 
    
    
    // Constructors
    
    public  evWinda2Piate() {
        lId = evWinda2Piate_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evWinda2Piate_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evWinda2Piate");
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
          String s="evWinda2Piate(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/evWinda2Piate.java
*********************************************************************/

