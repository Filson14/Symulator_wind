/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: anim
//!	Generated Date	: Wed, 24, Jun 2015 
	File Path	: DefaultComponent/anim/MainDefaultComponent.java
*********************************************************************/


//## auto_generated
import Default.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainDefaultComponent.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainDefaultComponent {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("Default.evCzwarteDol");
            Class.forName("Default.evCzwarteGora");
            Class.forName("Default.evDrugieDol");
            Class.forName("Default.evDrugieGora");
            Class.forName("Default.evParterGora");
            Class.forName("Default.evPiateDol");
            Class.forName("Default.evPierwszeDol");
            Class.forName("Default.evPierwszeGora");
            Class.forName("Default.evTrzecieDol");
            Class.forName("Default.evTrzecieGora");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    protected static Sterownik p_Sterownik = null;
    
    //## configuration DefaultComponent::anim 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainDefaultComponent initializer_DefaultComponent = new MainDefaultComponent();
        p_Sterownik = new Sterownik(RiJMainThread.instance());
        p_Sterownik.startBehavior();
        //#[ configuration DefaultComponent::anim 
        //#]
        RiJOXF.Start();
        p_Sterownik=null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/MainDefaultComponent.java
*********************************************************************/

