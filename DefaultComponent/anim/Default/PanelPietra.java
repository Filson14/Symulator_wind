/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: PanelPietra
//!	Generated Date	: Mon, 22, Jun 2015 
	File Path	: DefaultComponent/anim/Default/PanelPietra.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/PanelPietra.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class PanelPietra 
public class PanelPietra implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassPanelPietra = new AnimClass("Default.PanelPietra",false);
    //#]
    
    protected int pietro;		//## attribute pietro 
    
    protected Sterownik itsSterownik;		//## link itsSterownik 
    
    
    // Constructors
    
    /**
     * @param pietro
    */
    //## operation PanelPietra(int) 
    public  PanelPietra(int pietro) {
        System.out.println("Tworze panel pietra");;
        try {
            animInstance().notifyConstructorEntered(animClassPanelPietra.getUserClass(),
               new ArgData[] {
                   new ArgData(int.class, "pietro", AnimInstance.animToString(pietro))
               });
        
        //#[ operation PanelPietra(int) 
        this.pietro = pietro;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    //## auto_generated 
    public  PanelPietra() {
        try {
            animInstance().notifyConstructorEntered(animClassPanelPietra.getUserClass(),
               new ArgData[] {
               });
        
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getPietro() {
        return pietro;
    }
    
    //## auto_generated 
    public void setPietro(int p_pietro) {
        pietro = p_pietro;
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
                itsSterownik._removeItsPanelPietra(this);
            }
        __setItsSterownik(p_Sterownik);
    }
    
    //## auto_generated 
    public void setItsSterownik(Sterownik p_Sterownik) {
        if(p_Sterownik != null)
            {
                p_Sterownik._addItsPanelPietra(this);
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
        return animClassPanelPietra; 
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
        
        msg.add("pietro", pietro);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsSterownik", false, true, itsSterownik);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(PanelPietra.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            PanelPietra.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            PanelPietra.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/PanelPietra.java
*********************************************************************/

