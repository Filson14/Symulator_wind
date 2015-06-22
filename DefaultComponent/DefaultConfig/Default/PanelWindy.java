/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: PanelWindy
//!	Generated Date	: Mon, 22, Jun 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/PanelWindy.java
*********************************************************************/

package Default;


//----------------------------------------------------------------------------
// Default/PanelWindy.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class PanelWindy 
public class PanelWindy {
    
    protected int id;		//## attribute id 
    
    protected Winda itsWinda;		//## link itsWinda 
    
    
    // Constructors
    
    //## operation PanelWindy() 
    public  PanelWindy() {
        //#[ operation PanelWindy() 
        //#]
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
        itsWinda = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/PanelWindy.java
*********************************************************************/

