/*********************************************************************
	Rhapsody	: 8.0.4
	Login		: Filson
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Sterownik
//!	Generated Date	: Wed, 24, Jun 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Sterownik.java
*********************************************************************/

package Default;

//## auto_generated
import java.util.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;

//----------------------------------------------------------------------------
// Default/Sterownik.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Sterownik 
public class Sterownik implements RiJStateConcept {
    
    public Reactive reactive;		//## ignore 
    
    protected int iloscPieter = 6;		//## attribute iloscPieter 
    
    protected int iloscWind = 2;		//## attribute iloscWind 
    
    protected ArrayList<Winda> itsWinda = itsWinda = new ArrayList<Winda>();		//## link itsWinda 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int TrzecieGora=1;
    public static final int TrzecieDol=2;
    public static final int start=3;
    public static final int PierwszeGora=4;
    public static final int PierwszeDol=5;
    public static final int PiateDol=6;
    public static final int ParterGora=7;
    public static final int DrugieGora=8;
    public static final int DrugieDol=9;
    public static final int CzwarteGora=10;
    public static final int CzwarteDol=11;
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
        reactive = new Reactive(p_thread);
        //#[ operation Sterownik() 
        System.out.println("Start sterownika");
                                                
        for(int i=0; i<iloscWind; i++){
        	addItsWinda(new Winda(i));
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
            if(rootState_active == start)
                {
                    res = start_takeEvent(id);
                }
            return res;
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
            //#]
        }
        
        //## statechart_method 
        public void DrugieDol_exit() {
            DrugieDolExit();
        }
        
        //## statechart_method 
        public void DrugieGora_exit() {
            DrugieGoraExit();
        }
        
        //## statechart_method 
        public void DrugieGora_enter() {
            rootState_subState = DrugieGora;
            rootState_active = DrugieGora;
            DrugieGoraEnter();
        }
        
        //## statechart_method 
        public void start_exit() {
            startExit();
        }
        
        //## statechart_method 
        public void TrzecieGora_exit() {
            TrzecieGoraExit();
        }
        
        //## statechart_method 
        public void TrzecieGora_enter() {
            rootState_subState = TrzecieGora;
            rootState_active = TrzecieGora;
            TrzecieGoraEnter();
        }
        
        //## statechart_method 
        public void CzwarteDol_exit() {
            CzwarteDolExit();
        }
        
        //## statechart_method 
        public int PiateDol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void PierwszeGoraExit() {
        }
        
        //## statechart_method 
        public void CzwarteDol_entDef() {
            CzwarteDol_enter();
        }
        
        //## statechart_method 
        public void PiateDolEnter() {
            //#[ state PiateDol.(Entry) 
             System.out.println("Wezwanie: Piate, na dol");
            //#]
        }
        
        //## statechart_method 
        public void PierwszeDol_enter() {
            rootState_subState = PierwszeDol;
            rootState_active = PierwszeDol;
            PierwszeDolEnter();
        }
        
        //## statechart_method 
        public void CzwarteGora_exit() {
            CzwarteGoraExit();
        }
        
        //## statechart_method 
        public void DrugieDol_enter() {
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
            //#]
        }
        
        //## statechart_method 
        public int startTakeevCzwarteGora() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            CzwarteGora_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevTrzecieGora() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            TrzecieGora_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void TrzecieDol_enter() {
            rootState_subState = TrzecieDol;
            rootState_active = TrzecieDol;
            TrzecieDolEnter();
        }
        
        //## statechart_method 
        public void CzwarteDolExit() {
        }
        
        //## statechart_method 
        public int CzwarteGora_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
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
        public void TrzecieDol_entDef() {
            TrzecieDol_enter();
        }
        
        //## statechart_method 
        public void ParterGora_enter() {
            rootState_subState = ParterGora;
            rootState_active = ParterGora;
            ParterGoraEnter();
        }
        
        //## statechart_method 
        public void PiateDol_exit() {
            PiateDolExit();
        }
        
        //## statechart_method 
        public int startTakeevPiateDol() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            PiateDol_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void CzwarteDol_enter() {
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
            PierwszeDolExit();
        }
        
        //## statechart_method 
        public int startTakeevCzwarteDol() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            CzwarteDol_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevParterGora() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            ParterGora_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevTrzecieDol() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            TrzecieDol_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public int DrugieDol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int DrugieGora_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public int PierwszeDol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void TrzecieGoraExit() {
        }
        
        //## statechart_method 
        public void PierwszeGora_enter() {
            rootState_subState = PierwszeGora;
            rootState_active = PierwszeGora;
            PierwszeGoraEnter();
        }
        
        //## statechart_method 
        public int TrzecieGora_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
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
            return res;
        }
        
        //## statechart_method 
        public int start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evDrugieGora.evDrugieGora_Default_id))
                {
                    res = startTakeevDrugieGora();
                }
            else if(event.isTypeOf(evPierwszeDol.evPierwszeDol_Default_id))
                {
                    res = startTakeevPierwszeDol();
                }
            else if(event.isTypeOf(evPierwszeGora.evPierwszeGora_Default_id))
                {
                    res = startTakeevPierwszeGora();
                }
            else if(event.isTypeOf(evPiateDol.evPiateDol_Default_id))
                {
                    res = startTakeevPiateDol();
                }
            else if(event.isTypeOf(evDrugieDol.evDrugieDol_Default_id))
                {
                    res = startTakeevDrugieDol();
                }
            else if(event.isTypeOf(evCzwarteDol.evCzwarteDol_Default_id))
                {
                    res = startTakeevCzwarteDol();
                }
            else if(event.isTypeOf(evParterGora.evParterGora_Default_id))
                {
                    res = startTakeevParterGora();
                }
            else if(event.isTypeOf(evTrzecieDol.evTrzecieDol_Default_id))
                {
                    res = startTakeevTrzecieDol();
                }
            else if(event.isTypeOf(evCzwarteGora.evCzwarteGora_Default_id))
                {
                    res = startTakeevCzwarteGora();
                }
            else if(event.isTypeOf(evTrzecieGora.evTrzecieGora_Default_id))
                {
                    res = startTakeevTrzecieGora();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void TrzecieDolEnter() {
            //#[ state TrzecieDol.(Entry) 
            System.out.println("Wezwanie: Trzecie, na dol");
            //#]
        }
        
        //## statechart_method 
        public void TrzecieGora_entDef() {
            TrzecieGora_enter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            start_entDef();
        }
        
        //## statechart_method 
        public void DrugieGoraExit() {
        }
        
        //## statechart_method 
        public void ParterGoraEnter() {
            //#[ state ParterGora.(Entry) 
            System.out.println("Wezwanie: Parter, do gory");
            //#]
        }
        
        //## statechart_method 
        public void PiateDolExit() {
        }
        
        //## statechart_method 
        public int startTakeevPierwszeGora() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            PierwszeGora_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void TrzecieDolExit() {
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
            //#]
        }
        
        //## statechart_method 
        public int startTakeevDrugieDol() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            DrugieDol_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int startTakeevPierwszeDol() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            PierwszeDol_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int TrzecieDol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void DrugieDolEnter() {
            //#[ state DrugieDol.(Entry) 
             System.out.println("Wezwanie: Drugie, na dol");
            //#]
        }
        
        //## statechart_method 
        public void DrugieGoraEnter() {
            //#[ state DrugieGora.(Entry) 
            System.out.println("Wezwanie: Drugie, do gory");
            //#]
        }
        
        //## statechart_method 
        public int ParterGora_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
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
            TrzecieDolExit();
        }
        
        //## statechart_method 
        public void TrzecieGoraEnter() {
            //#[ state TrzecieGora.(Entry) 
             System.out.println("Wezwanie: Trzecie, do gory");
            //#]
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int CzwarteDol_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void CzwarteDolEnter() {
            //#[ state CzwarteDol.(Entry) 
               System.out.println("Wezwanie: Czwarte, na dol");
            //#]
        }
        
        //## statechart_method 
        public void ParterGora_exit() {
            ParterGoraExit();
        }
        
        //## statechart_method 
        public void PiateDol_enter() {
            rootState_subState = PiateDol;
            rootState_active = PiateDol;
            PiateDolEnter();
        }
        
        //## statechart_method 
        public void PierwszeGora_entDef() {
            PierwszeGora_enter();
        }
        
        //## statechart_method 
        public int startTakeevDrugieGora() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            start_exit();
            DrugieGora_entDef();
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void CzwarteGora_enter() {
            rootState_subState = CzwarteGora;
            rootState_active = CzwarteGora;
            CzwarteGoraEnter();
        }
        
        //## statechart_method 
        public void PierwszeGora_exit() {
            PierwszeGoraExit();
        }
        
        //## statechart_method 
        public void start_enter() {
            rootState_subState = start;
            rootState_active = start;
            startEnter();
        }
        
    }
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Sterownik.java
*********************************************************************/

