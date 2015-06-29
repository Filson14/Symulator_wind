/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Stasiu
	Component	: DefaultComponent
	Configuration 	: anim
	Model Element	: Sterownik
//!	Generated Date	: Thu, 25, Jun 2015 
	File Path	: DefaultComponent/anim/Default/Sterownik.java
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
// Default/Sterownik.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Sterownik 
public class Sterownik implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSterownik = new AnimClass("Default.Sterownik",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int iloscPieter = 6;		//## attribute iloscPieter 
    
    protected int iloscWind = 2;		//## attribute iloscWind 
    
    protected Winda itsWinda_1;		//## classInstance itsWinda_1 
    
    protected Winda itsWinda_2;		//## classInstance itsWinda_2 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int winda2_btn5=1;
    public static final int winda2_btn4=2;
    public static final int winda2_btn3=3;
    public static final int winda2_btn2=4;
    public static final int winda2_btn1=5;
    public static final int winda2_btn0=6;
    public static final int winda1_btn5=7;
    public static final int winda1_btn4=8;
    public static final int winda1_btn3=9;
    public static final int winda1_btn2=10;
    public static final int winda1_btn1=11;
    public static final int winda1_btn0=12;
    public static final int uruchomienieWindy2=13;
    public static final int uruchomienieWindy1=14;
    public static final int TrzecieGora=15;
    public static final int TrzecieDol=16;
    public static final int state_15=17;
    public static final int start=18;
    public static final int PierwszeGora=19;
    public static final int PierwszeDol=20;
    public static final int PiateDol=21;
    public static final int ParterGora=22;
    public static final int DrugieGora=23;
    public static final int DrugieDol=24;
    public static final int CzwarteGora=25;
    public static final int CzwarteDol=26;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
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
    
    //## operation Sterownik() 
    public  Sterownik(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassSterownik.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        //#[ operation Sterownik() 
        System.out.println("Start sterownika");
                                                
        //for(int i=0; i<iloscWind; i++){
        //	addItsWinda(new Winda(i));
        //}                                         
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param pietro
     * @param wezwanieWGore
    */
    //## operation wyznaczWinde(int,boolean) 
    public Winda wyznaczWinde(int pietro, boolean wezwanieWGore) {
        try {
            animInstance().notifyMethodEntered("wyznaczWinde",
               new ArgData[] {
                   new ArgData(int.class, "pietro", AnimInstance.animToString(pietro)),
                   new ArgData(boolean.class, "wezwanieWGore", AnimInstance.animToString(wezwanieWGore))
               });
        
        //#[ operation wyznaczWinde(int,boolean) 
        	// Ktoras z wind ma przystanek w danym kierunku
        	if( (wezwanieWGore && itsWinda_1.maPrzystanekWGore(pietro) || itsWinda_2.maPrzystanekWGore(pietro)) || (!wezwanieWGore && itsWinda_1.maPrzystanekWDol(pietro) || itsWinda_2.maPrzystanekWDol(pietro))){
        		return null;
        	}else{
        		// Winda1 jedzie we wlasciwym kierunku i jest przed danym pietrem
        		if( itsWinda_1.kierunekWGore == wezwanieWGore && ( (wezwanieWGore && itsWinda_1.obecnePietro < pietro) || (!wezwanieWGore && itsWinda_1.obecnePietro > pietro) ) ){
        			// Winda2 jedzie we wlasciwym kierunku i jest przed danym pietrem
        			if(itsWinda_2.kierunekWGore == wezwanieWGore && ( (wezwanieWGore && itsWinda_2.obecnePietro < pietro) || (!wezwanieWGore && itsWinda_2.obecnePietro > pietro) )){
        				return znajdzBlizszaWinde(pietro);	
        			}else{
        				return itsWinda_1;
        			}
        		}else{
        			// Winda2 jedzie we wlasciwym kierunku i jest przed danym pietrem
        			if(itsWinda_2.kierunekWGore == wezwanieWGore && ( (wezwanieWGore && itsWinda_2.obecnePietro < pietro) || (!wezwanieWGore && itsWinda_2.obecnePietro > pietro) )){
        				return itsWinda_2;	
        			}else{
        				return znajdzBlizszaWinde(pietro);
        			}
        		}
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
    //## operation znajdzBlizszaWinde(int) 
    public Winda znajdzBlizszaWinde(int pietro) {
        try {
            animInstance().notifyMethodEntered("znajdzBlizszaWinde",
               new ArgData[] {
                   new ArgData(int.class, "pietro", AnimInstance.animToString(pietro))
               });
        
        //#[ operation znajdzBlizszaWinde(int) 
        //Ktora ma mniej pieter do zatrzymania
        if(itsWinda_1.lacznaIloscPrzystankow() < itsWinda_2.lacznaIloscPrzystankow()){
        	return itsWinda_1;	
        }else if(itsWinda_1.lacznaIloscPrzystankow() > itsWinda_2.lacznaIloscPrzystankow()){
        	return itsWinda_2;
        }else{
        	//Sprawdzenie ktora jest blizej
        	if(Math.abs(itsWinda_1.obecnePietro - pietro) < Math.abs(itsWinda_2.obecnePietro - pietro)){
        		return itsWinda_1;
        	}else{
        		return itsWinda_2;
        	}
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
    public Winda getItsWinda_1() {
        return itsWinda_1;
    }
    
    //## auto_generated 
    public Winda newItsWinda_1(RiJThread p_thread) {
        itsWinda_1 = new Winda(p_thread);
        animInstance().notifyRelationAdded("itsWinda_1", itsWinda_1);
        return itsWinda_1;
    }
    
    //## auto_generated 
    public void deleteItsWinda_1() {
        animInstance().notifyRelationRemoved("itsWinda_1", itsWinda_1);
        itsWinda_1=null;
    }
    
    //## auto_generated 
    public Winda getItsWinda_2() {
        return itsWinda_2;
    }
    
    //## auto_generated 
    public Winda newItsWinda_2(RiJThread p_thread) {
        itsWinda_2 = new Winda(p_thread);
        animInstance().notifyRelationAdded("itsWinda_2", itsWinda_2);
        return itsWinda_2;
    }
    
    //## auto_generated 
    public void deleteItsWinda_2() {
        animInstance().notifyRelationRemoved("itsWinda_2", itsWinda_2);
        itsWinda_2=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsWinda_1 = newItsWinda_1(p_thread);
        itsWinda_2 = newItsWinda_2(p_thread);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsWinda_1.startBehavior();
        done &= itsWinda_2.startBehavior();
        done &= reactive.startBehavior();
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
                case start:
                {
                    start_add(animStates);
                }
                break;
                case ParterGora:
                {
                    ParterGora_add(animStates);
                }
                break;
                case PierwszeGora:
                {
                    PierwszeGora_add(animStates);
                }
                break;
                case PierwszeDol:
                {
                    PierwszeDol_add(animStates);
                }
                break;
                case DrugieGora:
                {
                    DrugieGora_add(animStates);
                }
                break;
                case DrugieDol:
                {
                    DrugieDol_add(animStates);
                }
                break;
                case TrzecieGora:
                {
                    TrzecieGora_add(animStates);
                }
                break;
                case TrzecieDol:
                {
                    TrzecieDol_add(animStates);
                }
                break;
                case CzwarteGora:
                {
                    CzwarteGora_add(animStates);
                }
                break;
                case CzwarteDol:
                {
                    CzwarteDol_add(animStates);
                }
                break;
                case PiateDol:
                {
                    PiateDol_add(animStates);
                }
                break;
                case state_15:
                {
                    state_15_add(animStates);
                }
                break;
                case winda1_btn0:
                {
                    winda1_btn0_add(animStates);
                }
                break;
                case winda1_btn1:
                {
                    winda1_btn1_add(animStates);
                }
                break;
                case winda1_btn2:
                {
                    winda1_btn2_add(animStates);
                }
                break;
                case winda1_btn3:
                {
                    winda1_btn3_add(animStates);
                }
                break;
                case winda1_btn4:
                {
                    winda1_btn4_add(animStates);
                }
                break;
                case winda1_btn5:
                {
                    winda1_btn5_add(animStates);
                }
                break;
                case winda2_btn0:
                {
                    winda2_btn0_add(animStates);
                }
                break;
                case winda2_btn1:
                {
                    winda2_btn1_add(animStates);
                }
                break;
                case winda2_btn2:
                {
                    winda2_btn2_add(animStates);
                }
                break;
                case winda2_btn3:
                {
                    winda2_btn3_add(animStates);
                }
                break;
                case winda2_btn4:
                {
                    winda2_btn4_add(animStates);
                }
                break;
                case winda2_btn5:
                {
                    winda2_btn5_add(animStates);
                }
                break;
                case uruchomienieWindy1:
                {
                    uruchomienieWindy1_add(animStates);
                }
                break;
                case uruchomienieWindy2:
                {
                    uruchomienieWindy2_add(animStates);
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
                case start:
                {
                    res = start_takeEvent(id);
                }
                break;
                case ParterGora:
                {
                    res = ParterGora_takeEvent(id);
                }
                break;
                case PierwszeGora:
                {
                    res = PierwszeGora_takeEvent(id);
                }
                break;
                case PierwszeDol:
                {
                    res = PierwszeDol_takeEvent(id);
                }
                break;
                case DrugieGora:
                {
                    res = DrugieGora_takeEvent(id);
                }
                break;
                case DrugieDol:
                {
                    res = DrugieDol_takeEvent(id);
                }
                break;
                case TrzecieGora:
                {
                    res = TrzecieGora_takeEvent(id);
                }
                break;
                case TrzecieDol:
                {
                    res = TrzecieDol_takeEvent(id);
                }
                break;
                case CzwarteGora:
                {
                    res = CzwarteGora_takeEvent(id);
                }
                break;
                case CzwarteDol:
                {
                    res = CzwarteDol_takeEvent(id);
                }
                break;
                case PiateDol:
                {
                    res = PiateDol_takeEvent(id);
                }
                break;
                case state_15:
                {
                    res = state_15_takeEvent(id);
                }
                break;
                case winda1_btn0:
                {
                    res = winda1_btn0_takeEvent(id);
                }
                break;
                case winda1_btn1:
                {
                    res = winda1_btn1_takeEvent(id);
                }
                break;
                case winda1_btn2:
                {
                    res = winda1_btn2_takeEvent(id);
                }
                break;
                case winda1_btn3:
                {
                    res = winda1_btn3_takeEvent(id);
                }
                break;
                case winda1_btn4:
                {
                    res = winda1_btn4_takeEvent(id);
                }
                break;
                case winda1_btn5:
                {
                    res = winda1_btn5_takeEvent(id);
                }
                break;
                case winda2_btn0:
                {
                    res = winda2_btn0_takeEvent(id);
                }
                break;
                case winda2_btn1:
                {
                    res = winda2_btn1_takeEvent(id);
                }
                break;
                case winda2_btn2:
                {
                    res = winda2_btn2_takeEvent(id);
                }
                break;
                case winda2_btn3:
                {
                    res = winda2_btn3_takeEvent(id);
                }
                break;
                case winda2_btn4:
                {
                    res = winda2_btn4_takeEvent(id);
                }
                break;
                case winda2_btn5:
                {
                    res = winda2_btn5_takeEvent(id);
                }
                break;
                case uruchomienieWindy1:
                {
                    res = uruchomienieWindy1_takeEvent(id);
                }
                break;
                case uruchomienieWindy2:
                {
                    res = uruchomienieWindy2_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void winda2_btn5_add(AnimStates animStates) {
            animStates.add("ROOT.winda2_btn5");
        }
        
        //## statechart_method 
        public void winda2_btn4_add(AnimStates animStates) {
            animStates.add("ROOT.winda2_btn4");
        }
        
        //## statechart_method 
        public void winda2_btn3_add(AnimStates animStates) {
            animStates.add("ROOT.winda2_btn3");
        }
        
        //## statechart_method 
        public void winda2_btn2_add(AnimStates animStates) {
            animStates.add("ROOT.winda2_btn2");
        }
        
        //## statechart_method 
        public void winda2_btn1_add(AnimStates animStates) {
            animStates.add("ROOT.winda2_btn1");
        }
        
        //## statechart_method 
        public void winda2_btn0_add(AnimStates animStates) {
            animStates.add("ROOT.winda2_btn0");
        }
        
        //## statechart_method 
        public void winda1_btn5_add(AnimStates animStates) {
            animStates.add("ROOT.winda1_btn5");
        }
        
        //## statechart_method 
        public void winda1_btn4_add(AnimStates animStates) {
            animStates.add("ROOT.winda1_btn4");
        }
        
        //## statechart_method 
        public void winda1_btn3_add(AnimStates animStates) {
            animStates.add("ROOT.winda1_btn3");
        }
        
        //## statechart_method 
        public void winda1_btn2_add(AnimStates animStates) {
            animStates.add("ROOT.winda1_btn2");
        }
        
        //## statechart_method 
        public void winda1_btn1_add(AnimStates animStates) {
            animStates.add("ROOT.winda1_btn1");
        }
        
        //## statechart_method 
        public void winda1_btn0_add(AnimStates animStates) {
            animStates.add("ROOT.winda1_btn0");
        }
        
        //## statechart_method 
        public void uruchomienieWindy2_add(AnimStates animStates) {
            animStates.add("ROOT.uruchomienieWindy2");
        }
        
        //## statechart_method 
        public void uruchomienieWindy1_add(AnimStates animStates) {
            animStates.add("ROOT.uruchomienieWindy1");
        }
        
        //## statechart_method 
        public void TrzecieGora_add(AnimStates animStates) {
            animStates.add("ROOT.TrzecieGora");
        }
        
        //## statechart_method 
        public void TrzecieDol_add(AnimStates animStates) {
            animStates.add("ROOT.TrzecieDol");
        }
        
        //## statechart_method 
        public void state_15_add(AnimStates animStates) {
            animStates.add("ROOT.state_15");
        }
        
        //## statechart_method 
        public void start_add(AnimStates animStates) {
            animStates.add("ROOT.start");
        }
        
        //## statechart_method 
        public void PierwszeGora_add(AnimStates animStates) {
            animStates.add("ROOT.PierwszeGora");
        }
        
        //## statechart_method 
        public void PierwszeDol_add(AnimStates animStates) {
            animStates.add("ROOT.PierwszeDol");
        }
        
        //## statechart_method 
        public void PiateDol_add(AnimStates animStates) {
            animStates.add("ROOT.PiateDol");
        }
        
        //## statechart_method 
        public void ParterGora_add(AnimStates animStates) {
            animStates.add("ROOT.ParterGora");
        }
        
        //## statechart_method 
        public void DrugieGora_add(AnimStates animStates) {
            animStates.add("ROOT.DrugieGora");
        }
        
        //## statechart_method 
        public void DrugieDol_add(AnimStates animStates) {
            animStates.add("ROOT.DrugieDol");
        }
        
        //## statechart_method 
        public void CzwarteGora_add(AnimStates animStates) {
            animStates.add("ROOT.CzwarteGora");
        }
        
        //## statechart_method 
        public void CzwarteDol_add(AnimStates animStates) {
            animStates.add("ROOT.CzwarteDol");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void CzwarteGoraEnter() {
            //#[ state CzwarteGora.(Entry) 
             System.out.println("Wezwanie: Czwarte, do gory");     
            Winda winda = wyznaczWinde(4, true);
            if(winda != null){
            	winda.dodajStopWGore(4); 
            	winda.gen(new evUruchom());
            }
            
            //#]
        }
        
        //## statechart_method 
        public void DrugieDol_exit() {
            popNullConfig();
            DrugieDolExit();
            animInstance().notifyStateExited("ROOT.DrugieDol");
        }
        
        //## statechart_method 
        public int DrugieGoraTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("13");
            DrugieGora_exit();
            state_15_entDef();
            animInstance().notifyTransitionEnded("13");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void DrugieGora_exit() {
            popNullConfig();
            DrugieGoraExit();
            animInstance().notifyStateExited("ROOT.DrugieGora");
        }
        
        //## statechart_method 
        public void DrugieGora_enter() {
            animInstance().notifyStateEntered("ROOT.DrugieGora");
            pushNullConfig();
            rootState_subState = DrugieGora;
            rootState_active = DrugieGora;
            DrugieGoraEnter();
        }
        
        //## statechart_method 
        public void start_exit() {
            startExit();
            animInstance().notifyStateExited("ROOT.start");
        }
        
        //## statechart_method 
        public void TrzecieGora_exit() {
            popNullConfig();
            TrzecieGoraExit();
            animInstance().notifyStateExited("ROOT.TrzecieGora");
        }
        
        //## statechart_method 
        public void TrzecieGora_enter() {
            animInstance().notifyStateEntered("ROOT.TrzecieGora");
            pushNullConfig();
            rootState_subState = TrzecieGora;
            rootState_active = TrzecieGora;
            TrzecieGoraEnter();
        }
        
        //## statechart_method 
        public int uruchomienieWindy1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = uruchomienieWindy1TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void uruchomienieWindy2_exit() {
            popNullConfig();
            uruchomienieWindy2Exit();
            animInstance().notifyStateExited("ROOT.uruchomienieWindy2");
        }
        
        //## statechart_method 
        public void winda1_btn5Exit() {
        }
        
        //## statechart_method 
        public void winda2_btn0Exit() {
        }
        
        //## statechart_method 
        public void winda2_btn4Enter() {
            //#[ state winda2_btn4.(Entry) 
            itsWinda_2.dodajStopWGore(4);
            itsWinda_2.dodajStopWDol(4);
            //#]
        }
        
        //## statechart_method 
        public void CzwarteDol_exit() {
            popNullConfig();
            CzwarteDolExit();
            animInstance().notifyStateExited("ROOT.CzwarteDol");
        }
        
        //## statechart_method 
        public int PiateDol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = PiateDolTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void PierwszeGoraExit() {
        }
        
        //## statechart_method 
        public int startTakeevWinda2Czwarte() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("32");
            start_exit();
            winda2_btn4_entDef();
            animInstance().notifyTransitionEnded("32");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int uruchomienieWindy1TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("46");
            uruchomienieWindy1_exit();
            start_entDef();
            animInstance().notifyTransitionEnded("46");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void uruchomienieWindy1_exit() {
            popNullConfig();
            uruchomienieWindy1Exit();
            animInstance().notifyStateExited("ROOT.uruchomienieWindy1");
        }
        
        //## statechart_method 
        public void winda2_btn1Exit() {
        }
        
        //## statechart_method 
        public int winda2_btn2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda2_btn2TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void winda2_btn3Enter() {
            //#[ state winda2_btn3.(Entry) 
            itsWinda_2.dodajStopWGore(3);
            itsWinda_2.dodajStopWDol(3);
            //#]
        }
        
        //## statechart_method 
        public int winda2_btn5_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda2_btn5TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void CzwarteDol_entDef() {
            CzwarteDol_enter();
        }
        
        //## statechart_method 
        public void PiateDolEnter() {
            //#[ state PiateDol.(Entry) 
             System.out.println("Wezwanie: Piate, na dol");   
            Winda winda = wyznaczWinde(5, false);
            if(winda != null){
            	winda.dodajStopWDol(5); 
            	winda.gen(new evUruchom());
            }
            //#]
        }
        
        //## statechart_method 
        public void PierwszeDol_enter() {
            animInstance().notifyStateEntered("ROOT.PierwszeDol");
            pushNullConfig();
            rootState_subState = PierwszeDol;
            rootState_active = PierwszeDol;
            PierwszeDolEnter();
        }
        
        //## statechart_method 
        public int startTakeevWinda1Drugie() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("24");
            start_exit();
            winda1_btn2_entDef();
            animInstance().notifyTransitionEnded("24");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda1_btn0_entDef() {
            winda1_btn0_enter();
        }
        
        //## statechart_method 
        public int winda1_btn1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda1_btn1TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int winda1_btn2TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("43");
            winda1_btn2_exit();
            uruchomienieWindy1_entDef();
            animInstance().notifyTransitionEnded("43");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda2_btn2Exit() {
        }
        
        //## statechart_method 
        public void winda2_btn2Enter() {
            //#[ state winda2_btn2.(Entry) 
            itsWinda_2.dodajStopWGore(2);
            itsWinda_2.dodajStopWDol(2);
            //#]
        }
        
        //## statechart_method 
        public void winda2_btn5_exit() {
            popNullConfig();
            winda2_btn5Exit();
            animInstance().notifyStateExited("ROOT.winda2_btn5");
        }
        
        //## statechart_method 
        public void CzwarteGora_exit() {
            popNullConfig();
            CzwarteGoraExit();
            animInstance().notifyStateExited("ROOT.CzwarteGora");
        }
        
        //## statechart_method 
        public void DrugieDol_enter() {
            animInstance().notifyStateEntered("ROOT.DrugieDol");
            pushNullConfig();
            rootState_subState = DrugieDol;
            rootState_active = DrugieDol;
            DrugieDolEnter();
        }
        
        //## statechart_method 
        public void DrugieDol_entDef() {
            DrugieDol_enter();
        }
        
        //## statechart_method 
        public void PierwszeDolEnter() {
            //#[ state PierwszeDol.(Entry) 
            System.out.println("Wezwanie: Pierwsze, na dol");   
            
            Winda winda = wyznaczWinde(1, false);
            if(winda != null){
            	winda.dodajStopWDol(1); 
            	winda.gen(new evUruchom());
            }
            
            //#]
        }
        
        //## statechart_method 
        public int startTakeevWinda2Drugie() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("30");
            start_exit();
            winda2_btn2_entDef();
            animInstance().notifyTransitionEnded("30");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevCzwarteGora() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            start_exit();
            CzwarteGora_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevTrzecieGora() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            start_exit();
            TrzecieGora_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int state_15_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = state_15TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void TrzecieDol_enter() {
            animInstance().notifyStateEntered("ROOT.TrzecieDol");
            pushNullConfig();
            rootState_subState = TrzecieDol;
            rootState_active = TrzecieDol;
            TrzecieDolEnter();
        }
        
        //## statechart_method 
        public void winda1_btn3_entDef() {
            winda1_btn3_enter();
        }
        
        //## statechart_method 
        public int winda1_btn4_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda1_btn4TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void winda2_btn1Enter() {
            //#[ state winda2_btn1.(Entry) 
            itsWinda_2.dodajStopWGore(1);
            itsWinda_2.dodajStopWDol(1);
            //#]
        }
        
        //## statechart_method 
        public int winda2_btn2TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("36");
            winda2_btn2_exit();
            uruchomienieWindy2_entDef();
            animInstance().notifyTransitionEnded("36");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda2_btn2_entDef() {
            winda2_btn2_enter();
        }
        
        //## statechart_method 
        public void winda2_btn3Exit() {
        }
        
        //## statechart_method 
        public void winda2_btn4_exit() {
            popNullConfig();
            winda2_btn4Exit();
            animInstance().notifyStateExited("ROOT.winda2_btn4");
        }
        
        //## statechart_method 
        public void CzwarteDolExit() {
        }
        
        //## statechart_method 
        public int CzwarteGora_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = CzwarteGoraTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void DrugieDolExit() {
        }
        
        //## statechart_method 
        public void PiateDol_entDef() {
            PiateDol_enter();
        }
        
        //## statechart_method 
        public void start_entDef() {
            start_enter();
        }
        
        //## statechart_method 
        public int state_15TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("16");
            state_15_exit();
            start_entDef();
            animInstance().notifyTransitionEnded("16");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_15_enter() {
            animInstance().notifyStateEntered("ROOT.state_15");
            pushNullConfig();
            rootState_subState = state_15;
            rootState_active = state_15;
            state_15Enter();
        }
        
        //## statechart_method 
        public void TrzecieDol_entDef() {
            TrzecieDol_enter();
        }
        
        //## statechart_method 
        public void winda2_btn0Enter() {
            //#[ state winda2_btn0.(Entry) 
            itsWinda_2.dodajStopWGore(0);
            itsWinda_2.dodajStopWDol(0);
            //#]
        }
        
        //## statechart_method 
        public void winda2_btn3_exit() {
            popNullConfig();
            winda2_btn3Exit();
            animInstance().notifyStateExited("ROOT.winda2_btn3");
        }
        
        //## statechart_method 
        public void winda2_btn4Exit() {
        }
        
        //## statechart_method 
        public void winda2_btn5_entDef() {
            winda2_btn5_enter();
        }
        
        //## statechart_method 
        public void ParterGora_enter() {
            animInstance().notifyStateEntered("ROOT.ParterGora");
            pushNullConfig();
            rootState_subState = ParterGora;
            rootState_active = ParterGora;
            ParterGoraEnter();
        }
        
        //## statechart_method 
        public void PiateDol_exit() {
            popNullConfig();
            PiateDolExit();
            animInstance().notifyStateExited("ROOT.PiateDol");
        }
        
        //## statechart_method 
        public int startTakeevPiateDol() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            start_exit();
            PiateDol_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_15Enter() {
        }
        
        //## statechart_method 
        public void uruchomienieWindy2_entDef() {
            uruchomienieWindy2_enter();
        }
        
        //## statechart_method 
        public int winda1_btn1TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("44");
            winda1_btn1_exit();
            uruchomienieWindy1_entDef();
            animInstance().notifyTransitionEnded("44");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda1_btn5Enter() {
            //#[ state winda1_btn5.(Entry) 
            itsWinda_1.dodajStopWGore(5);
            itsWinda_1.dodajStopWDol(5);
            //#]
        }
        
        //## statechart_method 
        public void winda2_btn2_exit() {
            popNullConfig();
            winda2_btn2Exit();
            animInstance().notifyStateExited("ROOT.winda2_btn2");
        }
        
        //## statechart_method 
        public void winda2_btn5Exit() {
        }
        
        //## statechart_method 
        public void CzwarteDol_enter() {
            animInstance().notifyStateEntered("ROOT.CzwarteDol");
            pushNullConfig();
            rootState_subState = CzwarteDol;
            rootState_active = CzwarteDol;
            CzwarteDolEnter();
        }
        
        //## statechart_method 
        public void ParterGora_entDef() {
            ParterGora_enter();
        }
        
        //## statechart_method 
        public void PierwszeDol_exit() {
            popNullConfig();
            PierwszeDolExit();
            animInstance().notifyStateExited("ROOT.PierwszeDol");
        }
        
        //## statechart_method 
        public int startTakeevWinda1Parter() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("22");
            start_exit();
            winda1_btn0_entDef();
            animInstance().notifyTransitionEnded("22");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevCzwarteDol() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            start_exit();
            CzwarteDol_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevParterGora() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            start_exit();
            ParterGora_entDef();
            animInstance().notifyTransitionEnded("1");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda1_btn4Enter() {
            //#[ state winda1_btn4.(Entry) 
            itsWinda_1.dodajStopWGore(4);
            itsWinda_1.dodajStopWDol(4);
            //#]
        }
        
        //## statechart_method 
        public int winda2_btn1_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda2_btn1TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int winda2_btn1TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("35");
            winda2_btn1_exit();
            uruchomienieWindy2_entDef();
            animInstance().notifyTransitionEnded("35");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda2_btn1_exit() {
            popNullConfig();
            winda2_btn1Exit();
            animInstance().notifyStateExited("ROOT.winda2_btn1");
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevWinda2Parter() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("28");
            start_exit();
            winda2_btn0_entDef();
            animInstance().notifyTransitionEnded("28");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevTrzecieDol() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("7");
            start_exit();
            TrzecieDol_entDef();
            animInstance().notifyTransitionEnded("7");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void uruchomienieWindy1Exit() {
        }
        
        //## statechart_method 
        public void winda1_btn0_enter() {
            animInstance().notifyStateEntered("ROOT.winda1_btn0");
            pushNullConfig();
            rootState_subState = winda1_btn0;
            rootState_active = winda1_btn0;
            winda1_btn0Enter();
        }
        
        //## statechart_method 
        public void winda1_btn3Enter() {
            //#[ state winda1_btn3.(Entry) 
            itsWinda_1.dodajStopWGore(3);
            itsWinda_1.dodajStopWDol(3);
            //#]
        }
        
        //## statechart_method 
        public void winda2_btn0_exit() {
            popNullConfig();
            winda2_btn0Exit();
            animInstance().notifyStateExited("ROOT.winda2_btn0");
        }
        
        //## statechart_method 
        public int winda2_btn4_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda2_btn4TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int CzwarteDolTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("20");
            CzwarteDol_exit();
            state_15_entDef();
            animInstance().notifyTransitionEnded("20");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int PiateDolTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("21");
            PiateDol_exit();
            state_15_entDef();
            animInstance().notifyTransitionEnded("21");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_15_exit() {
            popNullConfig();
            state_15Exit();
            animInstance().notifyStateExited("ROOT.state_15");
        }
        
        //## statechart_method 
        public int TrzecieDolTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("19");
            TrzecieDol_exit();
            state_15_entDef();
            animInstance().notifyTransitionEnded("19");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void uruchomienieWindy2Exit() {
        }
        
        //## statechart_method 
        public int winda1_btn0_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda1_btn0TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void winda1_btn1_enter() {
            animInstance().notifyStateEntered("ROOT.winda1_btn1");
            pushNullConfig();
            rootState_subState = winda1_btn1;
            rootState_active = winda1_btn1;
            winda1_btn1Enter();
        }
        
        //## statechart_method 
        public void winda1_btn1_entDef() {
            winda1_btn1_enter();
        }
        
        //## statechart_method 
        public void winda1_btn2_enter() {
            animInstance().notifyStateEntered("ROOT.winda1_btn2");
            pushNullConfig();
            rootState_subState = winda1_btn2;
            rootState_active = winda1_btn2;
            winda1_btn2Enter();
        }
        
        //## statechart_method 
        public void winda1_btn2Enter() {
            //#[ state winda1_btn2.(Entry) 
             itsWinda_1.dodajStopWGore(2);
            itsWinda_1.dodajStopWDol(2);
            //#]
        }
        
        //## statechart_method 
        public int winda1_btn3_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda1_btn3TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int winda1_btn5TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("40");
            winda1_btn5_exit();
            uruchomienieWindy1_entDef();
            animInstance().notifyTransitionEnded("40");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda1_btn5_exit() {
            popNullConfig();
            winda1_btn5Exit();
            animInstance().notifyStateExited("ROOT.winda1_btn5");
        }
        
        //## statechart_method 
        public void winda2_btn0_entDef() {
            winda2_btn0_enter();
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
        public int DrugieDol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = DrugieDolTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int DrugieGora_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = DrugieGoraTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int PierwszeDol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = PierwszeDolTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int PierwszeGoraTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("12");
            PierwszeGora_exit();
            state_15_entDef();
            animInstance().notifyTransitionEnded("12");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void TrzecieGoraExit() {
        }
        
        //## statechart_method 
        public int winda1_btn0TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("45");
            winda1_btn0_exit();
            uruchomienieWindy1_entDef();
            animInstance().notifyTransitionEnded("45");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda1_btn1Enter() {
            //#[ state winda1_btn1.(Entry) 
            itsWinda_1.dodajStopWGore(1);
            itsWinda_1.dodajStopWDol(1);
            //#]
        }
        
        //## statechart_method 
        public void winda1_btn3_enter() {
            animInstance().notifyStateEntered("ROOT.winda1_btn3");
            pushNullConfig();
            rootState_subState = winda1_btn3;
            rootState_active = winda1_btn3;
            winda1_btn3Enter();
        }
        
        //## statechart_method 
        public void winda1_btn4_exit() {
            popNullConfig();
            winda1_btn4Exit();
            animInstance().notifyStateExited("ROOT.winda1_btn4");
        }
        
        //## statechart_method 
        public void winda1_btn4_entDef() {
            winda1_btn4_enter();
        }
        
        //## statechart_method 
        public int winda2_btn0TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("34");
            winda2_btn0_exit();
            uruchomienieWindy2_entDef();
            animInstance().notifyTransitionEnded("34");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda2_btn3_entDef() {
            winda2_btn3_enter();
        }
        
        //## statechart_method 
        public int winda2_btn5TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("39");
            winda2_btn5_exit();
            uruchomienieWindy2_entDef();
            animInstance().notifyTransitionEnded("39");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int DrugieDolTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("18");
            DrugieDol_exit();
            state_15_entDef();
            animInstance().notifyTransitionEnded("18");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int ParterGoraTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            ParterGora_exit();
            state_15_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void PierwszeGora_enter() {
            animInstance().notifyStateEntered("ROOT.PierwszeGora");
            pushNullConfig();
            rootState_subState = PierwszeGora;
            rootState_active = PierwszeGora;
            PierwszeGoraEnter();
        }
        
        //## statechart_method 
        public int startTakeevWinda2Pierwsze() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("29");
            start_exit();
            winda2_btn1_entDef();
            animInstance().notifyTransitionEnded("29");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevWinda1Trzecie() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("25");
            start_exit();
            winda1_btn3_entDef();
            animInstance().notifyTransitionEnded("25");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int TrzecieGora_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = TrzecieGoraTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int TrzecieGoraTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("14");
            TrzecieGora_exit();
            state_15_entDef();
            animInstance().notifyTransitionEnded("14");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void uruchomienieWindy1_enter() {
            animInstance().notifyStateEntered("ROOT.uruchomienieWindy1");
            pushNullConfig();
            rootState_subState = uruchomienieWindy1;
            rootState_active = uruchomienieWindy1;
            uruchomienieWindy1Enter();
        }
        
        //## statechart_method 
        public void winda1_btn0Enter() {
            //#[ state winda1_btn0.(Entry) 
            itsWinda_1.dodajStopWGore(0);
            itsWinda_1.dodajStopWDol(0);
            //#]
        }
        
        //## statechart_method 
        public void winda1_btn3_exit() {
            popNullConfig();
            winda1_btn3Exit();
            animInstance().notifyStateExited("ROOT.winda1_btn3");
        }
        
        //## statechart_method 
        public void winda1_btn4_enter() {
            animInstance().notifyStateEntered("ROOT.winda1_btn4");
            pushNullConfig();
            rootState_subState = winda1_btn4;
            rootState_active = winda1_btn4;
            winda1_btn4Enter();
        }
        
        //## statechart_method 
        public void winda1_btn5_enter() {
            animInstance().notifyStateEntered("ROOT.winda1_btn5");
            pushNullConfig();
            rootState_subState = winda1_btn5;
            rootState_active = winda1_btn5;
            winda1_btn5Enter();
        }
        
        //## statechart_method 
        public int CzwarteGoraTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("15");
            CzwarteGora_exit();
            state_15_entDef();
            animInstance().notifyTransitionEnded("15");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void CzwarteGora_entDef() {
            CzwarteGora_enter();
        }
        
        //## statechart_method 
        public void ParterGoraExit() {
        }
        
        //## statechart_method 
        public int PierwszeGora_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = PierwszeGoraTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evWinda1Parter.evWinda1Parter_Default_id))
                {
                    res = startTakeevWinda1Parter();
                }
            else if(event.isTypeOf(evWinda2Trzecie.evWinda2Trzecie_Default_id))
                {
                    res = startTakeevWinda2Trzecie();
                }
            else if(event.isTypeOf(evWinda2Parter.evWinda2Parter_Default_id))
                {
                    res = startTakeevWinda2Parter();
                }
            else if(event.isTypeOf(evDrugieGora.evDrugieGora_Default_id))
                {
                    res = startTakeevDrugieGora();
                }
            else if(event.isTypeOf(evWinda2Czwarte.evWinda2Czwarte_Default_id))
                {
                    res = startTakeevWinda2Czwarte();
                }
            else if(event.isTypeOf(evPierwszeDol.evPierwszeDol_Default_id))
                {
                    res = startTakeevPierwszeDol();
                }
            else if(event.isTypeOf(evPierwszeGora.evPierwszeGora_Default_id))
                {
                    res = startTakeevPierwszeGora();
                }
            else if(event.isTypeOf(evWinda2Piate.evWinda2Piate_Default_id))
                {
                    res = startTakeevWinda2Piate();
                }
            else if(event.isTypeOf(evPiateDol.evPiateDol_Default_id))
                {
                    res = startTakeevPiateDol();
                }
            else if(event.isTypeOf(evDrugieDol.evDrugieDol_Default_id))
                {
                    res = startTakeevDrugieDol();
                }
            else if(event.isTypeOf(evWinda1Piate.evWinda1Piate_Default_id))
                {
                    res = startTakeevWinda1Piate();
                }
            else if(event.isTypeOf(evCzwarteDol.evCzwarteDol_Default_id))
                {
                    res = startTakeevCzwarteDol();
                }
            else if(event.isTypeOf(evParterGora.evParterGora_Default_id))
                {
                    res = startTakeevParterGora();
                }
            else if(event.isTypeOf(evWinda2Pierwsze.evWinda2Pierwsze_Default_id))
                {
                    res = startTakeevWinda2Pierwsze();
                }
            else if(event.isTypeOf(evTrzecieDol.evTrzecieDol_Default_id))
                {
                    res = startTakeevTrzecieDol();
                }
            else if(event.isTypeOf(evWinda1Trzecie.evWinda1Trzecie_Default_id))
                {
                    res = startTakeevWinda1Trzecie();
                }
            else if(event.isTypeOf(evWinda1Drugie.evWinda1Drugie_Default_id))
                {
                    res = startTakeevWinda1Drugie();
                }
            else if(event.isTypeOf(evCzwarteGora.evCzwarteGora_Default_id))
                {
                    res = startTakeevCzwarteGora();
                }
            else if(event.isTypeOf(evTrzecieGora.evTrzecieGora_Default_id))
                {
                    res = startTakeevTrzecieGora();
                }
            else if(event.isTypeOf(evWinda2Drugie.evWinda2Drugie_Default_id))
                {
                    res = startTakeevWinda2Drugie();
                }
            else if(event.isTypeOf(evWinda1Czwarte.evWinda1Czwarte_Default_id))
                {
                    res = startTakeevWinda1Czwarte();
                }
            else if(event.isTypeOf(evWinda1Pierwsze.evWinda1Pierwsze_Default_id))
                {
                    res = startTakeevWinda1Pierwsze();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void state_15Exit() {
        }
        
        //## statechart_method 
        public void TrzecieDolEnter() {
            //#[ state TrzecieDol.(Entry) 
            System.out.println("Wezwanie: Trzecie, na dol");             
            Winda winda = wyznaczWinde(3, false);
            if(winda != null){
            	winda.dodajStopWDol(3); 
            	winda.gen(new evUruchom());
            }
            //#]
        }
        
        //## statechart_method 
        public void TrzecieGora_entDef() {
            TrzecieGora_enter();
        }
        
        //## statechart_method 
        public int uruchomienieWindy2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = uruchomienieWindy2TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void uruchomienieWindy2_enter() {
            animInstance().notifyStateEntered("ROOT.uruchomienieWindy2");
            pushNullConfig();
            rootState_subState = uruchomienieWindy2;
            rootState_active = uruchomienieWindy2;
            uruchomienieWindy2Enter();
        }
        
        //## statechart_method 
        public void winda1_btn2_exit() {
            popNullConfig();
            winda1_btn2Exit();
            animInstance().notifyStateExited("ROOT.winda1_btn2");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            start_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void DrugieGoraExit() {
        }
        
        //## statechart_method 
        public void ParterGoraEnter() {
            //#[ state ParterGora.(Entry) 
            System.out.println("Wezwanie: Parter, do gory"); 
            Winda winda = wyznaczWinde(0, true);
            if(winda != null){
            	winda.dodajStopWGore(0); 
            	winda.gen(new evUruchom());
            }
            
            //#]
        }
        
        //## statechart_method 
        public void PiateDolExit() {
        }
        
        //## statechart_method 
        public int PierwszeDolTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("17");
            PierwszeDol_exit();
            state_15_entDef();
            animInstance().notifyTransitionEnded("17");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevWinda1Czwarte() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("26");
            start_exit();
            winda1_btn4_entDef();
            animInstance().notifyTransitionEnded("26");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevPierwszeGora() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            start_exit();
            PierwszeGora_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void TrzecieDolExit() {
        }
        
        //## statechart_method 
        public void winda1_btn0Exit() {
        }
        
        //## statechart_method 
        public void winda1_btn1_exit() {
            popNullConfig();
            winda1_btn1Exit();
            animInstance().notifyStateExited("ROOT.winda1_btn1");
        }
        
        //## statechart_method 
        public int winda1_btn4TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("41");
            winda1_btn4_exit();
            uruchomienieWindy1_entDef();
            animInstance().notifyTransitionEnded("41");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int winda2_btn0_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda2_btn0TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void winda2_btn0_enter() {
            animInstance().notifyStateEntered("ROOT.winda2_btn0");
            pushNullConfig();
            rootState_subState = winda2_btn0;
            rootState_active = winda2_btn0;
            winda2_btn0Enter();
        }
        
        //## statechart_method 
        public void winda2_btn1_enter() {
            animInstance().notifyStateEntered("ROOT.winda2_btn1");
            pushNullConfig();
            rootState_subState = winda2_btn1;
            rootState_active = winda2_btn1;
            winda2_btn1Enter();
        }
        
        //## statechart_method 
        public int winda2_btn3_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda2_btn3TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void CzwarteGoraExit() {
        }
        
        //## statechart_method 
        public void DrugieGora_entDef() {
            DrugieGora_enter();
        }
        
        //## statechart_method 
        public void PierwszeDolExit() {
        }
        
        //## statechart_method 
        public void PierwszeDol_entDef() {
            PierwszeDol_enter();
        }
        
        //## statechart_method 
        public void PierwszeGoraEnter() {
            //#[ state PierwszeGora.(Entry) 
            System.out.println("Wezwanie: Pierwsze, do gory");
            Winda winda = wyznaczWinde(1, true);
            if(winda != null){
            	winda.dodajStopWGore(1); 
            	winda.gen(new evUruchom());
            }
            
            //#]
        }
        
        //## statechart_method 
        public int startTakeevWinda1Pierwsze() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("23");
            start_exit();
            winda1_btn1_entDef();
            animInstance().notifyTransitionEnded("23");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevDrugieDol() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("5");
            start_exit();
            DrugieDol_entDef();
            animInstance().notifyTransitionEnded("5");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevPierwszeDol() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            start_exit();
            PierwszeDol_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_15_entDef() {
            state_15_enter();
        }
        
        //## statechart_method 
        public int TrzecieDol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = TrzecieDolTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void winda1_btn0_exit() {
            popNullConfig();
            winda1_btn0Exit();
            animInstance().notifyStateExited("ROOT.winda1_btn0");
        }
        
        //## statechart_method 
        public void winda1_btn1Exit() {
        }
        
        //## statechart_method 
        public void winda2_btn2_enter() {
            animInstance().notifyStateEntered("ROOT.winda2_btn2");
            pushNullConfig();
            rootState_subState = winda2_btn2;
            rootState_active = winda2_btn2;
            winda2_btn2Enter();
        }
        
        //## statechart_method 
        public int winda2_btn4TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("38");
            winda2_btn4_exit();
            uruchomienieWindy2_entDef();
            animInstance().notifyTransitionEnded("38");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void DrugieDolEnter() {
            //#[ state DrugieDol.(Entry) 
             System.out.println("Wezwanie: Drugie, na dol");  
            Winda winda = wyznaczWinde(2, false);
            if(winda != null){
            	winda.dodajStopWDol(2); 
            	winda.gen(new evUruchom());
            }
            //#]
        }
        
        //## statechart_method 
        public void DrugieGoraEnter() {
            //#[ state DrugieGora.(Entry) 
            System.out.println("Wezwanie: Drugie, do gory"); 
            Winda winda = wyznaczWinde(2, true);
            if(winda != null){
            	winda.dodajStopWGore(2); 
            	winda.gen(new evUruchom());
            }
            
            //#]
        }
        
        //## statechart_method 
        public int ParterGora_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = ParterGoraTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void startExit() {
        }
        
        //## statechart_method 
        public void startEnter() {
        }
        
        //## statechart_method 
        public void TrzecieDol_exit() {
            popNullConfig();
            TrzecieDolExit();
            animInstance().notifyStateExited("ROOT.TrzecieDol");
        }
        
        //## statechart_method 
        public void TrzecieGoraEnter() {
            //#[ state TrzecieGora.(Entry) 
             System.out.println("Wezwanie: Trzecie, do gory");
            Winda winda = wyznaczWinde(3, true);
            if(winda != null){
            	winda.dodajStopWGore(3); 
            	winda.gen(new evUruchom());
            }
            
            //#]
        }
        
        //## statechart_method 
        public void uruchomienieWindy2Enter() {
            //#[ state uruchomienieWindy2.(Entry) 
            itsWinda_2.gen(new evUruchom());
            //#]
        }
        
        //## statechart_method 
        public int winda1_btn2_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda1_btn2TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void winda1_btn2Exit() {
        }
        
        //## statechart_method 
        public void winda1_btn2_entDef() {
            winda1_btn2_enter();
        }
        
        //## statechart_method 
        public int winda1_btn5_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = winda1_btn5TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void winda2_btn1_entDef() {
            winda2_btn1_enter();
        }
        
        //## statechart_method 
        public void winda2_btn3_enter() {
            animInstance().notifyStateEntered("ROOT.winda2_btn3");
            pushNullConfig();
            rootState_subState = winda2_btn3;
            rootState_active = winda2_btn3;
            winda2_btn3Enter();
        }
        
        //## statechart_method 
        public void winda2_btn4_enter() {
            animInstance().notifyStateEntered("ROOT.winda2_btn4");
            pushNullConfig();
            rootState_subState = winda2_btn4;
            rootState_active = winda2_btn4;
            winda2_btn4Enter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int CzwarteDol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = CzwarteDolTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void CzwarteDolEnter() {
            //#[ state CzwarteDol.(Entry) 
               System.out.println("Wezwanie: Czwarte, na dol");    
            Winda winda = wyznaczWinde(4, false);
            if(winda != null){
            	winda.dodajStopWDol(4); 
            	winda.gen(new evUruchom());
            }
            //#]
        }
        
        //## statechart_method 
        public void ParterGora_exit() {
            popNullConfig();
            ParterGoraExit();
            animInstance().notifyStateExited("ROOT.ParterGora");
        }
        
        //## statechart_method 
        public void PiateDol_enter() {
            animInstance().notifyStateEntered("ROOT.PiateDol");
            pushNullConfig();
            rootState_subState = PiateDol;
            rootState_active = PiateDol;
            PiateDolEnter();
        }
        
        //## statechart_method 
        public void PierwszeGora_entDef() {
            PierwszeGora_enter();
        }
        
        //## statechart_method 
        public int startTakeevWinda2Piate() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("33");
            start_exit();
            winda2_btn5_entDef();
            animInstance().notifyTransitionEnded("33");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevDrugieGora() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            start_exit();
            DrugieGora_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void uruchomienieWindy1Enter() {
            //#[ state uruchomienieWindy1.(Entry) 
            itsWinda_1.gen(new evUruchom());
            //#]
        }
        
        //## statechart_method 
        public int uruchomienieWindy2TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("47");
            uruchomienieWindy2_exit();
            start_entDef();
            animInstance().notifyTransitionEnded("47");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int winda1_btn3TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("42");
            winda1_btn3_exit();
            uruchomienieWindy1_entDef();
            animInstance().notifyTransitionEnded("42");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda1_btn3Exit() {
        }
        
        //## statechart_method 
        public void winda1_btn5_entDef() {
            winda1_btn5_enter();
        }
        
        //## statechart_method 
        public void winda2_btn4_entDef() {
            winda2_btn4_enter();
        }
        
        //## statechart_method 
        public void winda2_btn5_enter() {
            animInstance().notifyStateEntered("ROOT.winda2_btn5");
            pushNullConfig();
            rootState_subState = winda2_btn5;
            rootState_active = winda2_btn5;
            winda2_btn5Enter();
        }
        
        //## statechart_method 
        public void CzwarteGora_enter() {
            animInstance().notifyStateEntered("ROOT.CzwarteGora");
            pushNullConfig();
            rootState_subState = CzwarteGora;
            rootState_active = CzwarteGora;
            CzwarteGoraEnter();
        }
        
        //## statechart_method 
        public void PierwszeGora_exit() {
            popNullConfig();
            PierwszeGoraExit();
            animInstance().notifyStateExited("ROOT.PierwszeGora");
        }
        
        //## statechart_method 
        public int startTakeevWinda2Trzecie() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("31");
            start_exit();
            winda2_btn3_entDef();
            animInstance().notifyTransitionEnded("31");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevWinda1Piate() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("27");
            start_exit();
            winda1_btn5_entDef();
            animInstance().notifyTransitionEnded("27");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void start_enter() {
            animInstance().notifyStateEntered("ROOT.start");
            rootState_subState = start;
            rootState_active = start;
            startEnter();
        }
        
        //## statechart_method 
        public void uruchomienieWindy1_entDef() {
            uruchomienieWindy1_enter();
        }
        
        //## statechart_method 
        public void winda1_btn4Exit() {
        }
        
        //## statechart_method 
        public int winda2_btn3TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("37");
            winda2_btn3_exit();
            uruchomienieWindy2_entDef();
            animInstance().notifyTransitionEnded("37");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void winda2_btn5Enter() {
            //#[ state winda2_btn5.(Entry) 
            itsWinda_2.dodajStopWGore(5);
            itsWinda_2.dodajStopWDol(5);
            //#]
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
            return Sterownik.this.animInstance(); 
        }
        
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
        
        msg.add("itsWinda_1", true, true, itsWinda_1);
        msg.add("itsWinda_2", true, true, itsWinda_2);
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
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/anim/Default/Sterownik.java
*********************************************************************/

