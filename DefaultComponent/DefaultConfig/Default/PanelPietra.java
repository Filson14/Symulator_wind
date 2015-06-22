/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: PanelPietra
//!	Generated Date	: Mon, 22, Jun 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/PanelPietra.java
*********************************************************************/

package Default;


//----------------------------------------------------------------------------
// Default/PanelPietra.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class PanelPietra 
public class PanelPietra {
    
    protected int pietro;		//## attribute pietro 
    
    protected Sterownik itsSterownik;		//## link itsSterownik 
    
    
    // Constructors
    
    /**
     * @param pietro
    */
    //## operation PanelPietra(int) 
    public  PanelPietra(int pietro) {
        System.out.println("Tworze panel pietra");;
        //#[ operation PanelPietra(int) 
        this.pietro = pietro;
        //#]
    }
    //## auto_generated 
    public  PanelPietra() {
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
        itsSterownik = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/PanelPietra.java
*********************************************************************/

