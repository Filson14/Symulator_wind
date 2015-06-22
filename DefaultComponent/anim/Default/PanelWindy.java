/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: PanelWindy
//!	Generated Date	: Mon, 22, Jun 2015 
	File Path	: DefaultComponent/anim/Default/PanelWindy.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/PanelWindy.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class PanelWindy 
public class PanelWindy implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassPanelWindy = new AnimClass("Default.PanelWindy",false);
    //#]
    
    protected int id;		//## attribute id 
    
    protected Winda itsWinda;		//## link itsWinda 
    
    
    // Constructors
    
    //## operation PanelWindy() 
    public  PanelWindy() {
        System.out.println("Tworze panel windy " + itsWinda.getId());;
        try {
            animInstance().notifyConstructorEntered(animClassPanelWindy.getUserClass(),
               new ArgData[] {
               });
        
        //#[ operation PanelWindy() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getId() {
        return id;
    }
    
    //## auto_generated 
    public void setId(int p_id) {
        id = p_id;
    }
    
    //## auto_generated 
    public Winda getItsWinda() {
        return itsWinda;
    }
    
    //## auto_generated 
    public void __setItsWinda(Winda p_Winda) {
        itsWinda = p_Winda;
        if(p_Winda != null)
            {
                animInstance().notifyRelationAdded("itsWinda", p_Winda);
            }
        else
            {
                animInstance().notifyRelationCleared("itsWinda");
            }
    }
    
    //## auto_generated 
    public void _setItsWinda(Winda p_Winda) {
        if(itsWinda != null)
            {
                itsWinda.__setItsPanelWindy(null);
            }
        __setItsWinda(p_Winda);
    }
    
    //## auto_generated 
    public void setItsWinda(Winda p_Winda) {
        if(p_Winda != null)
            {
                p_Winda._setItsPanelWindy(this);
            }
        _setItsWinda(p_Winda);
    }
    
    //## auto_generated 
    public void _clearItsWinda() {
        animInstance().notifyRelationCleared("itsWinda");
        itsWinda = null;
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassPanelWindy; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
        msg.add("id", id);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsWinda", false, true, itsWinda);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(PanelWindy.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            PanelWindy.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            PanelWindy.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/PanelWindy.java
*********************************************************************/

