/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: Sterownik
//!	Generated Date	: Mon, 22, Jun 2015 
	File Path	: DefaultComponent/anim/Default/Sterownik.java
*********************************************************************/

package Default;

//## auto_generated
import java.util.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Sterownik.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Sterownik 
public class Sterownik implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSterownik = new AnimClass("Default.Sterownik",false);
    //#]
    
    protected int iloscPieter = 6;		//## attribute iloscPieter 
    
    protected int iloscWind = 2;		//## attribute iloscWind 
    
    protected ArrayList<PanelPietra> itsPanelPietra = itsPanelPietra = new ArrayList<PanelPietra>();		//## link itsPanelPietra 
    
    protected ArrayList<Winda> itsWinda = itsWinda = new ArrayList<Winda>();		//## link itsWinda 
    
    
    // Constructors
    
    //## operation Sterownik() 
    public  Sterownik() {
        try {
            animInstance().notifyConstructorEntered(animClassSterownik.getUserClass(),
               new ArgData[] {
               });
        
        //#[ operation Sterownik() 
        System.out.println("Start sterownika");
        for(int i=0; i<iloscPieter; i++){
        	addItsPanelPietra(new PanelPietra(i));
        }                                         
        for(int i=0; i<iloscWind; i++){
        	addItsWinda(new Winda(i));
        }                                         
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getIloscPieter() {
        return iloscPieter;
    }
    
    //## auto_generated 
    public void setIloscPieter(int p_iloscPieter) {
        iloscPieter = p_iloscPieter;
    }
    
    //## auto_generated 
    public int getIloscWind() {
        return iloscWind;
    }
    
    //## auto_generated 
    public void setIloscWind(int p_iloscWind) {
        iloscWind = p_iloscWind;
    }
    
    //## auto_generated 
    public ListIterator<PanelPietra> getItsPanelPietra() {
        ListIterator<PanelPietra> iter = itsPanelPietra.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsPanelPietra(PanelPietra p_PanelPietra) {
        if(p_PanelPietra != null)
            {
                animInstance().notifyRelationAdded("itsPanelPietra", p_PanelPietra);
            }
        else
            {
                animInstance().notifyRelationCleared("itsPanelPietra");
            }
        itsPanelPietra.add(0, p_PanelPietra);
    }
    
    //## auto_generated 
    public void addItsPanelPietra(PanelPietra p_PanelPietra) {
        if(p_PanelPietra != null)
            {
                p_PanelPietra._setItsSterownik(this);
            }
        _addItsPanelPietra(p_PanelPietra);
    }
    
    //## auto_generated 
    public void _removeItsPanelPietra(PanelPietra p_PanelPietra) {
        animInstance().notifyRelationRemoved("itsPanelPietra", p_PanelPietra);
        itsPanelPietra.remove(p_PanelPietra);
    }
    
    //## auto_generated 
    public void removeItsPanelPietra(PanelPietra p_PanelPietra) {
        if(p_PanelPietra != null)
            {
                p_PanelPietra.__setItsSterownik(null);
            }
        _removeItsPanelPietra(p_PanelPietra);
    }
    
    //## auto_generated 
    public void _clearItsPanelPietra() {
        animInstance().notifyRelationCleared("itsPanelPietra");
        itsPanelPietra.clear();
    }
    
    //## auto_generated 
    public void clearItsPanelPietra() {
        ListIterator<PanelPietra> iter = itsPanelPietra.listIterator();
        while (iter.hasNext()){
            (itsPanelPietra.get(iter.nextIndex()))._clearItsSterownik();
            iter.next();
        }
        _clearItsPanelPietra();
    }
    
    //## auto_generated 
    public ListIterator<Winda> getItsWinda() {
        ListIterator<Winda> iter = itsWinda.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsWinda(Winda p_Winda) {
        if(p_Winda != null)
            {
                animInstance().notifyRelationAdded("itsWinda", p_Winda);
            }
        else
            {
                animInstance().notifyRelationCleared("itsWinda");
            }
        itsWinda.add(0, p_Winda);
    }
    
    //## auto_generated 
    public void addItsWinda(Winda p_Winda) {
        if(p_Winda != null)
            {
                p_Winda._setItsSterownik(this);
            }
        _addItsWinda(p_Winda);
    }
    
    //## auto_generated 
    public void _removeItsWinda(Winda p_Winda) {
        animInstance().notifyRelationRemoved("itsWinda", p_Winda);
        itsWinda.remove(p_Winda);
    }
    
    //## auto_generated 
    public void removeItsWinda(Winda p_Winda) {
        if(p_Winda != null)
            {
                p_Winda.__setItsSterownik(null);
            }
        _removeItsWinda(p_Winda);
    }
    
    //## auto_generated 
    public void _clearItsWinda() {
        animInstance().notifyRelationCleared("itsWinda");
        itsWinda.clear();
    }
    
    //## auto_generated 
    public void clearItsWinda() {
        ListIterator<Winda> iter = itsWinda.listIterator();
        while (iter.hasNext()){
            (itsWinda.get(iter.nextIndex()))._clearItsSterownik();
            iter.next();
        }
        _clearItsWinda();
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassSterownik; 
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
        
        msg.add("iloscPieter", iloscPieter);
        msg.add("iloscWind", iloscWind);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("itsPanelPietra", false, false, itsPanelPietra);
        msg.add("itsWinda", false, false, itsWinda);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Sterownik.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Sterownik.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Sterownik.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/Sterownik.java
*********************************************************************/

