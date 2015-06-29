/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Stasiu
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Winda
//!	Generated Date	: Thu, 25, Jun 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Winda.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Winda.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Winda 
public class Winda implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected int id;		//## attribute id 
    
    protected boolean kierunekWGore = true;		//## attribute kierunekWGore 
    
    protected int obecnePietro = 0;		//## attribute obecnePietro 
    
    protected boolean przystankiWDol[] = new boolean[6];		//## attribute przystankiWDol 
    
    protected boolean przystankiWGore[] = new boolean[6];		//## attribute przystankiWGore 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int pietro=1;
    public static final int kierunekUstalony=2;
    public static final int jedz_w_gore=3;
    public static final int jedz_w_dol=4;
    public static final int jazda=5;
    public static final int bezczynny=6;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Winda_Timeout_pietro_id = 1;		//## ignore 
    
    public static final int Winda_Timeout_jazda_id = 2;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## operation Winda() 
    public  Winda(RiJThread p_thread) {
        reactive = new Reactive(p_thread);
        //#[ operation Winda() 
        System.out.println("Buduje winde nr");                       
        
        for(int i=0; i<6; i++){
        	przystankiWGore[i] = false;
        	przystankiWDol[i] = false;
        }
        //#]
    }
    
    /**
     * @param pietro
    */
    //## operation dodajStopWDol(int) 
    public void dodajStopWDol(int pietro) {
        //#[ operation dodajStopWDol(int) 
        przystankiWDol[pietro] = true;
        //#]
    }
    
    /**
     * @param pietro
    */
    //## operation dodajStopWGore(int) 
    public void dodajStopWGore(int pietro) {
        //#[ operation dodajStopWGore(int) 
        przystankiWGore[pietro] = true;
        //#]
    }
    
    //## operation lacznaIloscPrzystankow() 
    public int lacznaIloscPrzystankow() {
        //#[ operation lacznaIloscPrzystankow() 
        int suma = 0;
        for(int i=0; i<6; i++){
        	if(maPrzystanekWGore(i) || maPrzystanekWDol(i)){
        		suma ++;
        	}
        }         
        
        return suma;
        //#]
    }
    
    /**
     * @param pietro
    */
    //## operation maPrzystanekWDol(int) 
    public boolean maPrzystanekWDol(int pietro) {
        //#[ operation maPrzystanekWDol(int) 
        return przystankiWDol[pietro];
        //#]
    }
    
    /**
     * @param pietro
    */
    //## operation maPrzystanekWGore(int) 
    public boolean maPrzystanekWGore(int pietro) {
        //#[ operation maPrzystanekWGore(int) 
        return przystankiWGore[pietro];
        //#]
    }
    
    //## operation maPrzystankiPonizej() 
    public boolean maPrzystankiPonizej() {
        //#[ operation maPrzystankiPonizej() 
        boolean wynik = false;
        for(int i = obecnePietro-1; i>=0; i--){
        	if(przystankiWGore[i] || przystankiWDol[i])     
        		{
        			wynik = true;
        			break;
        		}	
        }       
        return wynik;
        //#]
    }
    
    //## operation maPrzystankiPowyzej() 
    public boolean maPrzystankiPowyzej() {
        //#[ operation maPrzystankiPowyzej() 
        boolean wynik = false;
        for(int i = obecnePietro+1; i<6; i++){
        	if(przystankiWGore[i] || przystankiWDol[i]){
        		wynik = true;
        		break;
        	}	
        }
        //System.out.println("Ma przystanki powyzej: " + wynik);       
        return wynik;
        //#]
    }
    
    //## operation maZamowienia() 
    public boolean maZamowienia() {
        //#[ operation maZamowienia() 
        for(int i=0; i<6; i++){
        	if(przystankiWGore[i] || przystankiWDol[i]){
        		return true;   
        	}
        }
        return false;
        //#]
    }
    
    //## operation osiagnalWlasciwePietro() 
    public boolean osiagnalWlasciwePietro() {
        //#[ operation osiagnalWlasciwePietro() 
        boolean wynik = false;
        
        if(kierunekWGore){
        	if(przystankiWGore[obecnePietro] || !maPrzystankiPowyzej()){
        		przystankiWGore[obecnePietro] = false;
        		przystankiWDol[obecnePietro] = false;
        		wynik = true;                     
        	}else{
        		wynik = false; 
        	}
        }             
        
        if(!kierunekWGore){
        	if(przystankiWDol[obecnePietro] || !maPrzystankiPonizej()){
        		przystankiWDol[obecnePietro] = false;
        		przystankiWGore[obecnePietro] = false;
        		wynik = true;                     
        	}else{
        		wynik = false; 
        	}
        }         
        
        return wynik;
        //#]
    }
    
    //## operation wyznaczKierunek() 
    public void wyznaczKierunek() {
        //#[ operation wyznaczKierunek() 
        if(kierunekWGore){
        	if(!maPrzystankiPowyzej()) kierunekWGore = false;
        }else{
        	if(!maPrzystankiPonizej()) kierunekWGore = true;
        }
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
    public boolean getKierunekWGore() {
        return kierunekWGore;
    }
    
    //## auto_generated 
    public void setKierunekWGore(boolean p_kierunekWGore) {
        kierunekWGore = p_kierunekWGore;
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
    public boolean getPrzystankiWDol(int i1) {
        return przystankiWDol[i1];
    }
    
    //## auto_generated 
    public void setPrzystankiWDol(int i1, boolean p_przystankiWDol) {
        przystankiWDol[i1] = p_przystankiWDol;
    }
    
    //## auto_generated 
    public boolean getPrzystankiWGore(int i1) {
        return przystankiWGore[i1];
    }
    
    //## auto_generated 
    public void setPrzystankiWGore(int i1, boolean p_przystankiWGore) {
        przystankiWGore[i1] = p_przystankiWGore;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case jazda:
                {
                    res = jazda_takeEvent(id);
                }
                break;
                case bezczynny:
                {
                    res = bezczynny_takeEvent(id);
                }
                break;
                case pietro:
                {
                    res = pietro_takeEvent(id);
                }
                break;
                case jedz_w_gore:
                {
                    res = jedz_w_gore_takeEvent(id);
                }
                break;
                case jedz_w_dol:
                {
                    res = jedz_w_dol_takeEvent(id);
                }
                break;
                case kierunekUstalony:
                {
                    res = kierunekUstalony_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void bezczynnyExit() {
        }
        
        //## statechart_method 
        public void jedz_w_dol_enter() {
            pushNullConfig();
            rootState_subState = jedz_w_dol;
            rootState_active = jedz_w_dol;
            jedz_w_dolEnter();
        }
        
        //## statechart_method 
        public void jedz_w_dol_entDef() {
            jedz_w_dol_enter();
        }
        
        //## statechart_method 
        public void jedz_w_gore_enter() {
            pushNullConfig();
            rootState_subState = jedz_w_gore;
            rootState_active = jedz_w_gore;
            jedz_w_goreEnter();
        }
        
        //## statechart_method 
        public int pietro_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = pietroTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void bezczynny_entDef() {
            bezczynny_enter();
        }
        
        //## statechart_method 
        public int bezczynny_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evUruchom.evUruchom_Default_id))
                {
                    res = bezczynnyTakeevUruchom();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int jazdaTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Winda_Timeout_jazda_id)
                {
                    //## transition 7 
                    if(kierunekWGore)
                        {
                            //## transition 9 
                            if(maPrzystankiPowyzej())
                                {
                                    jazda_exit();
                                    jedz_w_gore_entDef();
                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                }
                            else
                                {
                                    //## transition 10 
                                    if(!maPrzystankiPowyzej())
                                        {
                                            jazda_exit();
                                            jedz_w_dol_entDef();
                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                        }
                                }
                        }
                    else
                        {
                            //## transition 8 
                            if(!kierunekWGore)
                                {
                                    //## transition 11 
                                    if(maPrzystankiPonizej())
                                        {
                                            jazda_exit();
                                            jedz_w_dol_entDef();
                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                        }
                                    else
                                        {
                                            //## transition 16 
                                            if(!maPrzystankiPonizej())
                                                {
                                                    jazda_exit();
                                                    jedz_w_gore_entDef();
                                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                                }
                                        }
                                }
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void jazda_entDef() {
            jazda_enter();
        }
        
        //## statechart_method 
        public void kierunekUstalonyExit() {
        }
        
        //## statechart_method 
        public void kierunekUstalonyEnter() {
        }
        
        //## statechart_method 
        public int jedz_w_dol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = jedz_w_dolTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int jedz_w_dolTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            jedz_w_dol_exit();
            kierunekUstalony_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int jedz_w_goreTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            jedz_w_gore_exit();
            kierunekUstalony_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int kierunekUstalonyTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 6 
            if(osiagnalWlasciwePietro())
                {
                    kierunekUstalony_exit();
                    pietro_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    kierunekUstalony_exit();
                    //#[ transition 5 
                    if(kierunekWGore)
                     	obecnePietro++;
                     else
                     	obecnePietro--;
                    //#]
                    jazda_entDef();
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void kierunekUstalony_enter() {
            pushNullConfig();
            rootState_subState = kierunekUstalony;
            rootState_active = kierunekUstalony;
            kierunekUstalonyEnter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void jazda_enter() {
            rootState_subState = jazda;
            rootState_active = jazda;
            jazdaEnter();
        }
        
        //## statechart_method 
        public void jedz_w_goreEnter() {
            //#[ state jedz_w_gore.(Entry) 
             kierunekWGore = true;
            //#]
        }
        
        //## statechart_method 
        public void kierunekUstalony_exit() {
            popNullConfig();
            kierunekUstalonyExit();
        }
        
        //## statechart_method 
        public void pietro_enter() {
            rootState_subState = pietro;
            rootState_active = pietro;
            pietroEnter();
        }
        
        //## statechart_method 
        public void jedz_w_dolExit() {
        }
        
        //## statechart_method 
        public int kierunekUstalony_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = kierunekUstalonyTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void rootState_enter() {
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public void jazdaEnter() {
            //#[ state jazda.(Entry) 
            System.out.println("Winda na pietrze " + obecnePietro);
            
                 
            
            //#]
            itsRiJThread.schedTimeout(2000, Winda_Timeout_jazda_id, this, null);
        }
        
        //## statechart_method 
        public void jedz_w_dolEnter() {
            //#[ state jedz_w_dol.(Entry) 
            kierunekWGore = false;
            //#]
        }
        
        //## statechart_method 
        public void kierunekUstalony_entDef() {
            kierunekUstalony_enter();
        }
        
        //## statechart_method 
        public void pietro_entDef() {
            pietro_enter();
        }
        
        //## statechart_method 
        public void jazdaExit() {
            itsRiJThread.unschedTimeout(Winda_Timeout_jazda_id, this);
        }
        
        //## statechart_method 
        public void jedz_w_gore_exit() {
            popNullConfig();
            jedz_w_goreExit();
        }
        
        //## statechart_method 
        public void bezczynnyEnter() {
        }
        
        //## statechart_method 
        public void jedz_w_goreExit() {
        }
        
        //## statechart_method 
        public void pietroEnter() {
            //#[ state pietro.(Entry) 
            System.out.println("Dojechala na pietro " + obecnePietro);
            System.out.println("Otwieram drzwi na pietrze " + obecnePietro);
            //#]
            itsRiJThread.schedTimeout(2000, Winda_Timeout_pietro_id, this, null);
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            bezczynny_entDef();
        }
        
        //## statechart_method 
        public void jazda_exit() {
            jazdaExit();
        }
        
        //## statechart_method 
        public void jedz_w_dol_exit() {
            popNullConfig();
            jedz_w_dolExit();
        }
        
        //## statechart_method 
        public void bezczynny_exit() {
            bezczynnyExit();
        }
        
        //## statechart_method 
        public void pietro_exit() {
            pietroExit();
        }
        
        //## statechart_method 
        public void pietroExit() {
            itsRiJThread.unschedTimeout(Winda_Timeout_pietro_id, this);
            //#[ state pietro.(Exit) 
            System.out.println("Zamykam drzwi na pietrze " + obecnePietro + "\n");
            //#]
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void bezczynny_enter() {
            rootState_subState = bezczynny;
            rootState_active = bezczynny;
            bezczynnyEnter();
        }
        
        //## statechart_method 
        public int bezczynnyTakeevUruchom() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            bezczynny_exit();
            jazda_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int jazda_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = jazdaTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int jedz_w_gore_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = jedz_w_goreTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void jedz_w_gore_entDef() {
            jedz_w_gore_enter();
        }
        
        //## statechart_method 
        public int pietroTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Winda_Timeout_pietro_id)
                {
                    //## transition 3 
                    if(maZamowienia())
                        {
                            pietro_exit();
                            jazda_entDef();
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            pietro_exit();
                            bezczynny_entDef();
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Winda.java
*********************************************************************/

