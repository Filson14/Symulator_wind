/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: evDrugieGora
//!	Generated Date	: Wed, 24, Jun 2015 
	File Path	: DefaultComponent/anim/Default/evDrugieGora.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/evDrugieGora.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event evDrugieGora() 
public class evDrugieGora extends RiJEvent implements AnimatedEvent {
    
    public static final int evDrugieGora_Default_id = 18619;		//## ignore 
    
    
    // Constructors
    
    public  evDrugieGora() {
        lId = evDrugieGora_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evDrugieGora_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.evDrugieGora");
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
          String s="evDrugieGora(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/evDrugieGora.java
*********************************************************************/

