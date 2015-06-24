/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: evDrugieDol
//!	Generated Date	: Wed, 24, Jun 2015 
	File Path	: DefaultComponent/anim/Default/evDrugieDol.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evDrugieDol.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evDrugieDol() 
public class evDrugieDol extends RiJEvent implements AnimatedEvent {
    
    public static final int evDrugieDol_Default_id = 18620;		//## ignore 
    
    
    // Constructors
    
    public  evDrugieDol() {
        lId = evDrugieDol_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evDrugieDol_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evDrugieDol");
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
          String s="evDrugieDol(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/evDrugieDol.java
*********************************************************************/

