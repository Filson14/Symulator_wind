/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Sterownik
//!	Generated Date	: Mon, 22, Jun 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Sterownik.java
*********************************************************************/

package Default;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// Default/Sterownik.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Sterownik 
public class Sterownik {
    
    protected int iloscPieter = 6;		//## attribute iloscPieter 
    
    protected int iloscWind = 2;		//## attribute iloscWind 
    
    protected ArrayList<PanelPietra> itsPanelPietra = itsPanelPietra = new ArrayList<PanelPietra>();		//## link itsPanelPietra 
    
    protected ArrayList<Winda> itsWinda = itsWinda = new ArrayList<Winda>();		//## link itsWinda 
    
    
    // Constructors
    
    //## operation Sterownik() 
    public  Sterownik() {
        //#[ operation Sterownik() 
        System.out.println("Start sterownika");
        for(int i=0; i<iloscPieter; i++){
        	addItsPanelPietra(new PanelPietra(i));
        }                                         
        
        //#]
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
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Sterownik.java
*********************************************************************/

