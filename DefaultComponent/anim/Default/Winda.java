/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: Winda
//!	Generated Date	: Wed, 24, Jun 2015 
	File Path	: DefaultComponent/anim/Default/Winda.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Winda.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Winda 
public class Winda implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassWinda = new AnimClass("Default.Winda",false);
    //#]
    
    protected int id;		//## attribute id 
    
    protected int obecnePietro = 0;		//## attribute obecnePietro 
    
    protected Sterownik itsSterownik;		//## link itsSterownik 
    
    
    // Constructors
    
    /**
     * @param id
    */
    //## operation Winda(int) 
    public  Winda(int id) {
        try {
            animInstance().notifyConstructorEntered(animClassWinda.getUserClass(),
               new ArgData[] {
                   new ArgData(int.class, "id", AnimInstance.animToString(id))
               });
        
        //#[ operation Winda(int) 
        System.out.println("Buduje winde nr " + id);            
        this.id = id;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    //## auto_generated 
    public  Winda() {
        try {
            animInstance().notifyConstructorEntered(animClassWinda.getUserClass(),
               new ArgData[] {
               });
        
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
    public int getObecnePietro() {
        return obecnePietro;
    }
    
    //## auto_generated 
    public void setObecnePietro(int p_obecnePietro) {
        obecnePietro = p_obecnePietro;
    }
    
    //## auto_generated 
    public Sterownik getItsSterownik() {
        return itsSterownik;
    }
    
    //## auto_generated 
    public void __setItsSterownik(Sterownik p_Sterownik) {
        itsSterownik = p_Sterownik;
        if(p_Sterownik != null)
            {
                animInstance().notifyRelationAdded("itsSterownik", p_Sterownik);
            }
        else
            {
                animInstance().notifyRelationCleared("itsSterownik");
            }
    }
    
    //## auto_generated 
    public void _setItsSterownik(Sterownik p_Sterownik) {
        if(itsSterownik != null)
            {
                itsSterownik._removeItsWinda(this);
            }
        __setItsSterownik(p_Sterownik);
    }
    
    //## auto_generated 
    public void setItsSterownik(Sterownik p_Sterownik) {
        if(p_Sterownik != null)
            {
                p_Sterownik._addItsWinda(this);
            }
        _setItsSterownik(p_Sterownik);
    }
    
    //## auto_generated 
    public void _clearItsSterownik() {
        animInstance().notifyRelationCleared("itsSterownik");
        itsSterownik = null;
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassWinda; 
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
        msg.add("obecnePietro", obecnePietro);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsSterownik", false, true, itsSterownik);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Winda.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Winda.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Winda.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/Winda.java
*********************************************************************/

