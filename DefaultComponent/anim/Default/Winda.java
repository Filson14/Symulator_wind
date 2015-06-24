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
    public static final int jazda=2;
    public static final int bezczynny=3;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Winda_Timeout_jazda_id = 1;		//## ignore 
    
    
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
        		wynik = true;
        		break;	
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
        	if(przystankiWGore[i] || przystankiWDol[i])
        		wynik = true;
        		break;	
        }       
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
        }
        
        if(!kierunekWGore){
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
        try {
        kierunekWGore = p_kierunekWGore;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
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
                case bezczynny:
                {
                    bezczynny_add(animStates);
                }
                break;
                case jazda:
                {
                    jazda_add(animStates);
                }
                break;
                case pietro:
                {
                    pietro_add(animStates);
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
                case bezczynny:
                {
                    res = bezczynny_takeEvent(id);
                }
                break;
                case jazda:
                {
                    res = jazda_takeEvent(id);
                }
                break;
                case pietro:
                {
                    res = pietro_takeEvent(id);
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
        public int pietro_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = pietroTakeNull();
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
                    //## transition 3 
                    if(osiagnalWlasciwePietro())
                        {
                            animInstance().notifyTransitionStarted("2");
                            animInstance().notifyTransitionStarted("3");
                            jazda_exit();
                            pietro_entDef();
                            animInstance().notifyTransitionEnded("3");
                            animInstance().notifyTransitionEnded("2");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            animInstance().notifyTransitionStarted("2");
                            animInstance().notifyTransitionStarted("4");
                            jazda_exit();
                            jazda_entDef();
                            animInstance().notifyTransitionEnded("4");
                            animInstance().notifyTransitionEnded("2");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void jazda_entDef() {
            jazda_enter();
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
        public void pietro_enter() {
            animInstance().notifyStateEntered("ROOT.pietro");
            pushNullConfig();
            rootState_subState = pietro;
            rootState_active = pietro;
            pietroEnter();
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
            wyznaczKierunek();
                 
            if(kierunekWGore)
             	obecnePietro++;
             else
             	obecnePietro--;
            //#]
            itsRiJThread.schedTimeout(2000, Winda_Timeout_jazda_id, this, "ROOT.jazda");
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
        public void bezczynnyEnter() {
        }
        
        //## statechart_method 
        public void pietroEnter() {
            //#[ state pietro.(Entry) 
            System.out.println("Winda na pietrze " + obecnePietro);
            System.out.println("Otwieram drzwi na pietrze " + obecnePietro);
            //#]
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
        public void bezczynny_exit() {
            bezczynnyExit();
            animInstance().notifyStateExited("ROOT.bezczynny");
        }
        
        //## statechart_method 
        public void pietro_exit() {
            popNullConfig();
            pietroExit();
            animInstance().notifyStateExited("ROOT.pietro");
        }
        
        //## statechart_method 
        public void pietroExit() {
            //#[ state pietro.(Exit) 
            System.out.println("Zamykam drzwi na pietrze " + obecnePietro);
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
        public int pietroTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 6 
            if(maZamowienia())
                {
                    animInstance().notifyTransitionStarted("5");
                    animInstance().notifyTransitionStarted("6");
                    pietro_exit();
                    jazda_entDef();
                    animInstance().notifyTransitionEnded("6");
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    animInstance().notifyTransitionStarted("5");
                    animInstance().notifyTransitionStarted("7");
                    pietro_exit();
                    bezczynny_entDef();
                    animInstance().notifyTransitionEnded("7");
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
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

