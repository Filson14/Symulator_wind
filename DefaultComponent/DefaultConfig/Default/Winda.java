/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Winda
//!	Generated Date	: Wed, 24, Jun 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Winda.java
*********************************************************************/

package Default;


//----------------------------------------------------------------------------
// Default/Winda.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Winda 
public class Winda {
    
    protected int id;		//## attribute id 
    
    protected int obecnePietro = 0;		//## attribute obecnePietro 
    
    protected Sterownik itsSterownik;		//## link itsSterownik 
    
    
    // Constructors
    
    /**
     * @param id
    */
    //## operation Winda(int) 
    public  Winda(int id) {
        //#[ operation Winda(int) 
        System.out.println("Buduje winde nr " + id);            
        this.id = id;
        //#]
    }
    //## auto_generated 
    public  Winda() {
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
        itsSterownik = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Winda.java
*********************************************************************/

