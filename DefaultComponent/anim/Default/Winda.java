/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Stasiu
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: Winda
//!	Generated Date	: Fri, 26, Jun 2015 
	File Path	: DefaultComponent/anim/Default/Winda.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Winda.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Winda 
public class Winda implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassWinda = new AnimClass("Default.Winda",false);
    //#]
    
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
        try {
            animInstance().notifyConstructorEntered(animClassWinda.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        //#[ operation Winda() 
        System.out.println("Buduje winde nr");                       
        
        for(int i=0; i<6; i++){
        	przystankiWGore[i] = false;
        	przystankiWDol[i] = false;
        }
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param pietro
    */
    //## operation dodajStopWDol(int) 
    public void dodajStopWDol(int pietro) {
        try {
            animInstance().notifyMethodEntered("dodajStopWDol",
               new ArgData[] {
                   new ArgData(int.class, "pietro", AnimInstance.animToString(pietro))
               });
        
        //#[ operation dodajStopWDol(int) 
        przystankiWDol[pietro] = true;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param pietro
    */
    //## operation dodajStopWGore(int) 
    public void dodajStopWGore(int pietro) {
        try {
            animInstance().notifyMethodEntered("dodajStopWGore",
               new ArgData[] {
                   new ArgData(int.class, "pietro", AnimInstance.animToString(pietro))
               });
        
        //#[ operation dodajStopWGore(int) 
        przystankiWGore[pietro] = true;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation lacznaIloscPrzystankow() 
    public int lacznaIloscPrzystankow() {
        try {
            animInstance().notifyMethodEntered("lacznaIloscPrzystankow",
               new ArgData[] {
               });
        
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
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param pietro
    */
    //## operation maPrzystanekWDol(int) 
    public boolean maPrzystanekWDol(int pietro) {
        try {
            animInstance().notifyMethodEntered("maPrzystanekWDol",
               new ArgData[] {
                   new ArgData(int.class, "pietro", AnimInstance.animToString(pietro))
               });
        
        //#[ operation maPrzystanekWDol(int) 
        return przystankiWDol[pietro];
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param pietro
    */
    //## operation maPrzystanekWGore(int) 
    public boolean maPrzystanekWGore(int pietro) {
        try {
            animInstance().notifyMethodEntered("maPrzystanekWGore",
               new ArgData[] {
                   new ArgData(int.class, "pietro", AnimInstance.animToString(pietro))
               });
        
        //#[ operation maPrzystanekWGore(int) 
        return przystankiWGore[pietro];
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation maPrzystankiPonizej() 
    public boolean maPrzystankiPonizej() {
        try {
            animInstance().notifyMethodEntered("maPrzystankiPonizej",
               new ArgData[] {
               });
        
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
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation maPrzystankiPowyzej() 
    public boolean maPrzystankiPowyzej() {
        try {
            animInstance().notifyMethodEntered("maPrzystankiPowyzej",
               new ArgData[] {
               });
        
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
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation maZamowienia() 
    public boolean maZamowienia() {
        try {
            animInstance().notifyMethodEntered("maZamowienia",
               new ArgData[] {
               });
        
        //#[ operation maZamowienia() 
        for(int i=0; i<6; i++){
        	if(przystankiWGore[i] || przystankiWDol[i]){
        		return true;   
        	}
        }
        return false;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation osiagnalWlasciwePietro() 
    public boolean osiagnalWlasciwePietro() {
        try {
            animInstance().notifyMethodEntered("osiagnalWlasciwePietro",
               new ArgData[] {
               });
        
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
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation wyznaczKierunek() 
    public void wyznaczKierunek() {
        try {
            animInstance().notifyMethodEntered("wyznaczKierunek",
               new ArgData[] {
               });
        
        //#[ operation wyznaczKierunek() 
        if(kierunekWGore){
        	if(!maPrzystankiPowyzej()) kierunekWGore = false;
        }else{
        	if(!maPrzystankiPonizej()) kierunekWGore = true;
        }
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
        try {
        obecnePietro = p_obecnePietro;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
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
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
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
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case jazda:
                {
                    jazda_add(animStates);
                }
                break;
                case bezczynny:
                {
                    bezczynny_add(animStates);
                }
                break;
                case pietro:
                {
                    pietro_add(animStates);
                }
                break;
                case jedz_w_gore:
                {
                    jedz_w_gore_add(animStates);
                }
                break;
                case jedz_w_dol:
                {
                    jedz_w_dol_add(animStates);
                }
                break;
                case kierunekUstalony:
                {
                    kierunekUstalony_add(animStates);
                }
                break;
                default:
                    break;
            }
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
        
        //## statechart_method 
        public void pietro_add(AnimStates animStates) {
            animStates.add("ROOT.pietro");
        }
        
        //## statechart_method 
        public void kierunekUstalony_add(AnimStates animStates) {
            animStates.add("ROOT.kierunekUstalony");
        }
        
        //## statechart_method 
        public void jedz_w_gore_add(AnimStates animStates) {
            animStates.add("ROOT.jedz_w_gore");
        }
        
        //## statechart_method 
        public void jedz_w_dol_add(AnimStates animStates) {
            animStates.add("ROOT.jedz_w_dol");
        }
        
        //## statechart_method 
        public void jazda_add(AnimStates animStates) {
            animStates.add("ROOT.jazda");
        }
        
        //## statechart_method 
        public void bezczynny_add(AnimStates animStates) {
            animStates.add("ROOT.bezczynny");
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
            animInstance().notifyStateEntered("ROOT.jedz_w_dol");
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
            animInstance().notifyStateEntered("ROOT.jedz_w_gore");
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
                                    animInstance().notifyTransitionStarted("12");
                                    animInstance().notifyTransitionStarted("7");
                                    animInstance().notifyTransitionStarted("9");
                                    jazda_exit();
                                    jedz_w_gore_entDef();
                                    animInstance().notifyTransitionEnded("9");
                                    animInstance().notifyTransitionEnded("7");
                                    animInstance().notifyTransitionEnded("12");
                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                }
                            else
                                {
                                    //## transition 10 
                                    if(!maPrzystankiPowyzej())
                                        {
                                            animInstance().notifyTransitionStarted("12");
                                            animInstance().notifyTransitionStarted("7");
                                            animInstance().notifyTransitionStarted("10");
                                            jazda_exit();
                                            jedz_w_dol_entDef();
                                            animInstance().notifyTransitionEnded("10");
                                            animInstance().notifyTransitionEnded("7");
                                            animInstance().notifyTransitionEnded("12");
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
                                            animInstance().notifyTransitionStarted("12");
                                            animInstance().notifyTransitionStarted("8");
                                            animInstance().notifyTransitionStarted("11");
                                            jazda_exit();
                                            jedz_w_dol_entDef();
                                            animInstance().notifyTransitionEnded("11");
                                            animInstance().notifyTransitionEnded("8");
                                            animInstance().notifyTransitionEnded("12");
                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                        }
                                    else
                                        {
                                            //## transition 16 
                                            if(!maPrzystankiPonizej())
                                                {
                                                    animInstance().notifyTransitionStarted("12");
                                                    animInstance().notifyTransitionStarted("8");
                                                    animInstance().notifyTransitionStarted("16");
                                                    jazda_exit();
                                                    jedz_w_gore_entDef();
                                                    animInstance().notifyTransitionEnded("16");
                                                    animInstance().notifyTransitionEnded("8");
                                                    animInstance().notifyTransitionEnded("12");
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
            animInstance().notifyTransitionStarted("14");
            jedz_w_dol_exit();
            kierunekUstalony_entDef();
            animInstance().notifyTransitionEnded("14");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int jedz_w_goreTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("13");
            jedz_w_gore_exit();
            kierunekUstalony_entDef();
            animInstance().notifyTransitionEnded("13");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int kierunekUstalonyTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 6 
            if(osiagnalWlasciwePietro())
                {
                    animInstance().notifyTransitionStarted("15");
                    animInstance().notifyTransitionStarted("6");
                    kierunekUstalony_exit();
                    pietro_entDef();
                    animInstance().notifyTransitionEnded("6");
                    animInstance().notifyTransitionEnded("15");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    animInstance().notifyTransitionStarted("15");
                    animInstance().notifyTransitionStarted("5");
                    kierunekUstalony_exit();
                    //#[ transition 5 
                    if(kierunekWGore)
                     	obecnePietro++;
                     else
                     	obecnePietro--;
                    //#]
                    jazda_entDef();
                    animInstance().notifyTransitionEnded("5");
                    animInstance().notifyTransitionEnded("15");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void kierunekUstalony_enter() {
            animInstance().notifyStateEntered("ROOT.kierunekUstalony");
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
            animInstance().notifyStateEntered("ROOT.jazda");
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
            animInstance().notifyStateExited("ROOT.kierunekUstalony");
        }
        
        //## statechart_method 
        public void pietro_enter() {
            animInstance().notifyStateEntered("ROOT.pietro");
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
            animInstance().notifyStateEntered("ROOT");
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
            itsRiJThread.schedTimeout(2000, Winda_Timeout_jazda_id, this, "ROOT.jazda");
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
            animInstance().notifyStateExited("ROOT.jedz_w_gore");
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
            itsRiJThread.schedTimeout(2000, Winda_Timeout_pietro_id, this, "ROOT.pietro");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            bezczynny_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void jazda_exit() {
            jazdaExit();
            animInstance().notifyStateExited("ROOT.jazda");
        }
        
        //## statechart_method 
        public void jedz_w_dol_exit() {
            popNullConfig();
            jedz_w_dolExit();
            animInstance().notifyStateExited("ROOT.jedz_w_dol");
        }
        
        //## statechart_method 
        public void bezczynny_exit() {
            bezczynnyExit();
            animInstance().notifyStateExited("ROOT.bezczynny");
        }
        
        //## statechart_method 
        public void pietro_exit() {
            pietroExit();
            animInstance().notifyStateExited("ROOT.pietro");
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
            animInstance().notifyStateEntered("ROOT.bezczynny");
            rootState_subState = bezczynny;
            rootState_active = bezczynny;
            bezczynnyEnter();
        }
        
        //## statechart_method 
        public int bezczynnyTakeevUruchom() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            bezczynny_exit();
            jazda_entDef();
            animInstance().notifyTransitionEnded("1");
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
                            animInstance().notifyTransitionStarted("2");
                            animInstance().notifyTransitionStarted("3");
                            pietro_exit();
                            jazda_entDef();
                            animInstance().notifyTransitionEnded("3");
                            animInstance().notifyTransitionEnded("2");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            animInstance().notifyTransitionStarted("2");
                            animInstance().notifyTransitionStarted("4");
                            pietro_exit();
                            bezczynny_entDef();
                            animInstance().notifyTransitionEnded("4");
                            animInstance().notifyTransitionEnded("2");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return Winda.this.animInstance(); 
        }
        
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
        msg.add("przystankiWGore", przystankiWGore);
        msg.add("przystankiWDol", przystankiWDol);
        msg.add("kierunekWGore", kierunekWGore);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
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
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/Winda.java
*********************************************************************/

