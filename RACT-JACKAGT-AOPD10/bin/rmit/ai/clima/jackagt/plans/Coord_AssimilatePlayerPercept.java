/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.plans;
import aos.jack.jak.plan.Plan;
import aos.jack.jak.plan.PlanFSM;
import aos.jack.jak.plan.ExMap;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import aos.jack.jak.event.Event;
import aos.jack.jak.task.Task;
import aos.jack.jak.core.Generator;
import aos.jack.jak.logic.Signature;
import rmit.ai.clima.jackagt.events.EUpdateBel;
import rmit.ai.clima.jackagt.events.EChoosePlayerActions;
import rmit.ai.clima.jackagt.events.MEReportPlayerPercept;
import rmit.ai.clima.jackagt.data.BPlayerPosition;
import rmit.ai.clima.jackagt.data.BPlayerGold;
import rmit.ai.clima.jackagt.data.BPlayerPerceptReceived;
import rmit.ai.clima.jackagt.data.BPlayer;
import rmit.ai.clima.interfaces.DebugInterface;
import java.lang.Object;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class Coord_AssimilatePlayerPercept extends aos.jack.jak.plan.Plan {
    public rmit.ai.clima.jackagt.events.EUpdateBel eupdatebel_p;
    public rmit.ai.clima.jackagt.events.EChoosePlayerActions echooseplayeractions_p;
    public rmit.ai.clima.jackagt.events.MEReportPlayerPercept mereportplayerpercept_h;
    public rmit.ai.clima.jackagt.data.BPlayerPosition bel_playerPositions_dat;
    public rmit.ai.clima.jackagt.data.BPlayerGold bel_playerGold_dat;
    public rmit.ai.clima.jackagt.data.BPlayerPerceptReceived bel_playerPerceptReceived_dat;
    public rmit.ai.clima.jackagt.data.BPlayer bel_players_dat;
    public rmit.ai.clima.interfaces.DebugInterface consoleIface;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/Coord_AssimilatePlayerPercept.plan",
            "body",
            "44",
            "46",
            "47",
            "49",
            "52",
            "55",
            "57",
            "58",
            "41"};
    private final static java.lang.String[] __planVariableNames = {
            "eupdatebel_p",
            "echooseplayeractions_p",
            "mereportplayerpercept_h",
            "bel_playerPositions_dat",
            "bel_playerGold_dat",
            "bel_playerPerceptReceived_dat",
            "bel_players_dat",
            "consoleIface"};
    private final static java.lang.String[] __planVariableTypes = {
            "rmit.ai.clima.jackagt.events.EUpdateBel",
            "EChoosePlayerActions",
            "rmit.ai.clima.jackagt.events.MEReportPlayerPercept",
            "rmit.ai.clima.jackagt.data.BPlayerPosition",
            "rmit.ai.clima.jackagt.data.BPlayerGold",
            "rmit.ai.clima.jackagt.data.BPlayerPerceptReceived",
            "rmit.ai.clima.jackagt.data.BPlayer",
            "DebugInterface"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "$name"};
    private final static java.lang.String[] __fsmTypes_body = {
            "logical String"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__4_0"};
    public Coord_AssimilatePlayerPercept()
    {
    }
    
    private Coord_AssimilatePlayerPercept(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.Coord_AssimilatePlayerPercept __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eupdatebel_p = __env.eupdatebel_p;
        echooseplayeractions_p = __env.echooseplayeractions_p;
        mereportplayerpercept_h = __env.mereportplayerpercept_h;
        bel_playerPositions_dat = __env.bel_playerPositions_dat;
        bel_playerGold_dat = __env.bel_playerGold_dat;
        bel_playerPerceptReceived_dat = __env.bel_playerPerceptReceived_dat;
        bel_players_dat = __env.bel_players_dat;
        consoleIface = (rmit.ai.clima.interfaces.DebugInterface) __ns.getIF(rmit.ai.clima.interfaces.DebugInterface.class);
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eupdatebel_p = (rmit.ai.clima.jackagt.events.EUpdateBel) __a.findEvent("rmit.ai.clima.jackagt.events.EUpdateBel");
        if (eupdatebel_p == null) {
            warning("Failed to find EUpdateBel eupdatebel_p");
            return false;
        }
        echooseplayeractions_p = (rmit.ai.clima.jackagt.events.EChoosePlayerActions) __a.findEvent("rmit.ai.clima.jackagt.events.EChoosePlayerActions");
        if (echooseplayeractions_p == null) {
            warning("Failed to find EChoosePlayerActions echooseplayeractions_p");
            return false;
        }
        mereportplayerpercept_h = (rmit.ai.clima.jackagt.events.MEReportPlayerPercept) __a.findEvent("rmit.ai.clima.jackagt.events.MEReportPlayerPercept");
        if (mereportplayerpercept_h == null) {
            warning("Failed to find MEReportPlayerPercept mereportplayerpercept_h");
            return false;
        }
        bel_playerPositions_dat = (rmit.ai.clima.jackagt.data.BPlayerPosition) lookupNamedObject("bel_playerPositions_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_playerPositions_dat == null) {
            warning("Failed to find BPlayerPosition bel_playerPositions_dat");
            return false;
        }
        bel_playerGold_dat = (rmit.ai.clima.jackagt.data.BPlayerGold) lookupNamedObject("bel_playerGold_dat","rmit.ai.clima.jackagt.data.BPlayerGold",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_playerGold_dat == null) {
            warning("Failed to find BPlayerGold bel_playerGold_dat");
            return false;
        }
        bel_playerPerceptReceived_dat = (rmit.ai.clima.jackagt.data.BPlayerPerceptReceived) lookupNamedObject("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.BPlayerPerceptReceived",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_playerPerceptReceived_dat == null) {
            warning("Failed to find BPlayerPerceptReceived bel_playerPerceptReceived_dat");
            return false;
        }
        bel_players_dat = (rmit.ai.clima.jackagt.data.BPlayer) lookupNamedObject("bel_players_dat","rmit.ai.clima.jackagt.data.BPlayer",0);
        if (bel_players_dat == null) {
            warning("Failed to find BPlayer bel_players_dat");
            return false;
        }
        return true;
    }
    
    public aos.jack.jak.plan.Plan freeze()
    {
        return this;
    }
    
    public aos.jack.jak.plan.Plan unfreeze()
    {
        return this;
    }
    
    public java.lang.Object genObject(int __index)
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal Object Construction");
        return null;
    }
    
    public aos.jack.jak.cursor.Cursor genCursor(int __index)
        throws java.lang.Exception
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal Cursor Construction");
        return null;
    }
    
    public aos.jack.jak.fsm.FSM genFSM(int __index)
        throws java.lang.Exception
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal FSM Construction");
        return null;
    }
    
    public boolean testCondition(int __index)
        throws java.lang.Exception
    {
        switch (__index) {
        }
        aos.jack.jak.core.Jak.error("illegal test Construction");
        return false;
    }
    
    public aos.jack.jak.plan.PlanFSM body()
    {
        return new rmit.ai.clima.jackagt.plans.Coord_AssimilatePlayerPercept.__bodyFSM();
    }
    
    private Coord_AssimilatePlayerPercept(rmit.ai.clima.jackagt.events.MEReportPlayerPercept __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.Coord_AssimilatePlayerPercept __env)
    {
        this(__t,__env);
        this.mereportplayerpercept_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return mereportplayerpercept_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.MEReportPlayerPercept";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled();
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.MEReportPlayerPercept)) 
            return null;
        rmit.ai.clima.jackagt.events.MEReportPlayerPercept __e1 = (rmit.ai.clima.jackagt.events.MEReportPlayerPercept) __e;
        return new rmit.ai.clima.jackagt.plans.Coord_AssimilatePlayerPercept(__e1,__t,this);
    }
    
    public java.lang.String[] variableNames()
    {
        return __planVariableNames;
    }
    
    public java.lang.String[] variableTypes()
    {
        return __planVariableTypes;
    }
    
    public java.lang.Object getVariable(int n)
    {
        switch (n) {
            case 0: 
            {
                return aos.util.ToObject.box(eupdatebel_p);
            }
            case 1: 
            {
                return aos.util.ToObject.box(echooseplayeractions_p);
            }
            case 2: 
            {
                return aos.util.ToObject.box(mereportplayerpercept_h);
            }
            case 3: 
            {
                return aos.util.ToObject.box(bel_playerPositions_dat);
            }
            case 4: 
            {
                return aos.util.ToObject.box(bel_playerGold_dat);
            }
            case 5: 
            {
                return aos.util.ToObject.box(bel_playerPerceptReceived_dat);
            }
            case 6: 
            {
                return aos.util.ToObject.box(bel_players_dat);
            }
            case 7: 
            {
                return aos.util.ToObject.box(consoleIface);
            }
            default: 
            {
                throw new java.lang.IndexOutOfBoundsException("Plan " + this + " does not have variable number " + n);
            }
        }
    }
    
    public java.lang.String[] reasoningMethods()
    {
        return mergeReasoningMethods(__reasoningMethods,super.reasoningMethods());
    }
    
    public aos.jack.jak.cursor.Cursor context()
    {
        try {
            return (((true)?aos.jack.jak.cursor.Cursor.trueCursor:aos.jack.jak.cursor.Cursor.falseCursor));
        }
        catch (java.lang.Exception e) {
            e.printStackTrace();
            return aos.jack.jak.cursor.Cursor.falseCursor;
        }
    }
    
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        aos.jack.jak.logic.StringVariable __local__4_0;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-Coord_AssimilatePlayerPercept.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.Coord_AssimilatePlayerPercept.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("Coord_AssimilatePlayerPercept.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (44)       @subtask( eupdatebel_p.post(mereportplayerpercept_h.step, mereportplayerpercept_h.currentPos, mereportplayerpercept_h.cells, mereportplayerpercept_h.noCarryingGold) );
                        case 10: 
                        {
                            __breakLevel = 0;
                            __task.push(eupdatebel_p.post(mereportplayerpercept_h.step,mereportplayerpercept_h.currentPos,mereportplayerpercept_h.cells,mereportplayerpercept_h.noCarryingGold));
                            __state = -__state;
                            __subtask_pass = 11;
                            __subtask_fail = 4;
                            return SUBTASK;
                        }
                        //* (46) 		bel_playerPositions_dat.add(mereportplayerpercept_h.name, mereportplayerpercept_h.currentPos.x , mereportplayerpercept_h.currentPos.y );
                        case 11: 
                        {
                            __state = 12;
                            bel_playerPositions_dat.add(mereportplayerpercept_h.name,mereportplayerpercept_h.currentPos.x,mereportplayerpercept_h.currentPos.y);
                            break;
                        }
                        //* (47) 		bel_playerGold_dat.add(mereportplayerpercept_h.name, mereportplayerpercept_h.noCarryingGold);
                        case 12: 
                        {
                            __state = 13;
                            bel_playerGold_dat.add(mereportplayerpercept_h.name,mereportplayerpercept_h.noCarryingGold);
                            break;
                        }
                        //* (49) 		bel_playerPerceptReceived_dat.add(mereportplayerpercept_h.name);
                        case 13: 
                        {
                            __state = 14;
                            bel_playerPerceptReceived_dat.add(mereportplayerpercept_h.name);
                            break;
                        }
                        //* (52) 		logical String $name;
                        case 14: 
                        {
                            __local__4_0 = (aos.jack.jak.logic.StringVariable) __logic.new_variable(java.lang.String.class);
                            __state = 15;
                            break;
                        }
                        //* (55) 		if(bel_playerPerceptReceived_dat.nFacts()  == bel_players_dat.nFacts())
                        case 15: 
                        {
                            if (bel_playerPerceptReceived_dat.nFacts() == bel_players_dat.nFacts()) 
                                __state = 16;
                             else 
                                __state = 18;
                            break;
                        }
                        //* (57) 		   bel_playerPerceptReceived_dat.get($name).removeAll();
                        case 16: 
                        {
                            __breakLevel = 2;
                            __state = 17;
                            bel_playerPerceptReceived_dat.get(__local__4_0).removeAll();
                            break;
                        }
                        //* (58) 		   @post( echooseplayeractions_p.post() );
                        case 17: 
                        {
                            __state = 18;
                            agent.postEvent(echooseplayeractions_p.post());
                            break;
                        }
                        //* (41) 	body()
                        case 18: 
                        {
                            if (__pending == null) 
                                __state = PASSED_STATE;
                            __tothrow = __pending;
                            break;
                        }
                    }
                }
                catch (java.lang.Throwable e) {
                    handleException(e,__exMap_body);
                }
            }
             while (!agent.changing_focus);
            return CONTINUE;
        }
        
        public java.lang.String methodName()
        {
            return "body";
        }
        
        __bodyFSM()
        {
        }
        
        public java.lang.String stateInfo()
        {
            int n = __curstate;
            java.lang.String file = __tt__body[0];
            java.lang.String method = __tt__body[1];
            if (n < 0) 
                n = -n;
            n -= (10 - 2);
            java.lang.String line = (n < 2)?"??":__tt__body[n];
            return file + ":" + line + " " + method + " [" + __curstate + "]";
        }
        
        public java.lang.Object genObject(int __index)
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal Object Construction");
            return null;
        }
        
        public aos.jack.jak.cursor.Cursor genCursor(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal Cursor Construction");
            return null;
        }
        
        public aos.jack.jak.fsm.FSM genFSM(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal FSM Construction");
            return null;
        }
        
        public boolean testCondition(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal test Construction");
            return false;
        }
        
        public aos.jack.jak.plan.Plan getPlan()
        {
            return rmit.ai.clima.jackagt.plans.Coord_AssimilatePlayerPercept.this;
        }
        
        protected aos.jack.jak.fsm.FSM fail()
        {
            return getPlan().fail();
        }
        
        protected aos.jack.jak.fsm.FSM pass()
        {
            return getPlan().pass();
        }
        
        public void enter()
        {
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.Coord_AssimilatePlayerPercept.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__4_0);
                }
                default: 
                {
                    throw new java.lang.IndexOutOfBoundsException("Reasoning Method " + methodName() + " does not have variable number " + n);
                }
            }
        }
        
        public java.lang.String[] variableNames()
        {
            return __fsmVariableNames_body;
        }
        
        public java.lang.String[] variableTypes()
        {
            return __fsmTypes_body;
        }
        
        public java.lang.String[] variableLocalNames()
        {
            return __fsmLocalNames_body;
        }
        
    }
}
