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
import rmit.ai.clima.jackagt.events.MESimEnd;
import rmit.ai.clima.jackagt.data.PlayerPerceptReceived;
import rmit.ai.clima.jackagt.data.BPlayer;
import rmit.ai.clima.jackagt.data.PlayerPosition;
import rmit.ai.clima.jackagt.data.BPlayerGold;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.interfaces.DebugInterface;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class Coord_EndSimulation extends aos.jack.jak.plan.Plan {
    public rmit.ai.clima.jackagt.events.MESimEnd mesimend_h;
    public rmit.ai.clima.jackagt.data.PlayerPerceptReceived bel_playerPerceptReceived_dat;
    public rmit.ai.clima.jackagt.data.BPlayer bel_players_dat;
    public rmit.ai.clima.jackagt.data.PlayerPosition bel_playerPositions_dat;
    public rmit.ai.clima.jackagt.data.BPlayerGold bel_playerGold_dat;
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public rmit.ai.clima.interfaces.DebugInterface consoleIface;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/Coord_EndSimulation.plan",
            "body",
            "53",
            "54",
            "55",
            "56",
            "57",
            "58",
            "61",
            "49"};
    private final static java.lang.String[] __planVariableNames = {
            "mesimend_h",
            "bel_playerPerceptReceived_dat",
            "bel_players_dat",
            "bel_playerPositions_dat",
            "bel_playerGold_dat",
            "bel_simulationProp_dat",
            "consoleIface"};
    private final static java.lang.String[] __planVariableTypes = {
            "rmit.ai.clima.jackagt.events.MESimEnd",
            "rmit.ai.clima.jackagt.data.PlayerPerceptReceived",
            "BPlayer",
            "rmit.ai.clima.jackagt.data.PlayerPosition",
            "BPlayerGold",
            "rmit.ai.clima.jackagt.data.SimulationProp",
            "rmit.ai.clima.interfaces.DebugInterface"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "$gridX",
            "$gridY",
            "$depotX",
            "$depotY",
            "$noSteps",
            "$agentName",
            "$xPos",
            "$yPos"};
    private final static java.lang.String[] __fsmTypes_body = {
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical String",
            "logical int",
            "logical int"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__5_0",
            "__local__5_1",
            "__local__5_2",
            "__local__5_3",
            "__local__5_4",
            "__local__5_5",
            "__local__5_6",
            "__local__5_7"};
    static boolean relevant(rmit.ai.clima.jackagt.events.MESimEnd ev)
    {
        return true;
    }
    
    public Coord_EndSimulation()
    {
    }
    
    private Coord_EndSimulation(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.Coord_EndSimulation __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        mesimend_h = __env.mesimend_h;
        bel_playerPerceptReceived_dat = __env.bel_playerPerceptReceived_dat;
        bel_players_dat = __env.bel_players_dat;
        bel_playerPositions_dat = __env.bel_playerPositions_dat;
        bel_playerGold_dat = __env.bel_playerGold_dat;
        bel_simulationProp_dat = __env.bel_simulationProp_dat;
        consoleIface = (rmit.ai.clima.interfaces.DebugInterface) __ns.getIF(rmit.ai.clima.interfaces.DebugInterface.class);
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        mesimend_h = (rmit.ai.clima.jackagt.events.MESimEnd) __a.findEvent("rmit.ai.clima.jackagt.events.MESimEnd");
        if (mesimend_h == null) {
            warning("Failed to find MESimEnd mesimend_h");
            return false;
        }
        bel_playerPerceptReceived_dat = (rmit.ai.clima.jackagt.data.PlayerPerceptReceived) lookupNamedObject("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.PlayerPerceptReceived",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_playerPerceptReceived_dat == null) {
            warning("Failed to find PlayerPerceptReceived bel_playerPerceptReceived_dat");
            return false;
        }
        bel_players_dat = (rmit.ai.clima.jackagt.data.BPlayer) lookupNamedObject("bel_players_dat","rmit.ai.clima.jackagt.data.BPlayer",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_players_dat == null) {
            warning("Failed to find BPlayer bel_players_dat");
            return false;
        }
        bel_playerPositions_dat = (rmit.ai.clima.jackagt.data.PlayerPosition) lookupNamedObject("bel_playerPositions_dat","rmit.ai.clima.jackagt.data.PlayerPosition",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_playerPositions_dat == null) {
            warning("Failed to find PlayerPosition bel_playerPositions_dat");
            return false;
        }
        bel_playerGold_dat = (rmit.ai.clima.jackagt.data.BPlayerGold) lookupNamedObject("bel_playerGold_dat","rmit.ai.clima.jackagt.data.BPlayerGold",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_playerGold_dat == null) {
            warning("Failed to find BPlayerGold bel_playerGold_dat");
            return false;
        }
        bel_simulationProp_dat = (rmit.ai.clima.jackagt.data.SimulationProp) lookupNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",0);
        if (bel_simulationProp_dat == null) {
            warning("Failed to find SimulationProp bel_simulationProp_dat");
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
        return new rmit.ai.clima.jackagt.plans.Coord_EndSimulation.__bodyFSM();
    }
    
    private Coord_EndSimulation(rmit.ai.clima.jackagt.events.MESimEnd __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.Coord_EndSimulation __env)
    {
        this(__t,__env);
        this.mesimend_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return mesimend_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.MESimEnd";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.jackagt.events.MESimEnd) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.MESimEnd)) 
            return null;
        rmit.ai.clima.jackagt.events.MESimEnd __e1 = (rmit.ai.clima.jackagt.events.MESimEnd) __e;
        return new rmit.ai.clima.jackagt.plans.Coord_EndSimulation(__e1,__t,this);
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
                return aos.util.ToObject.box(mesimend_h);
            }
            case 1: 
            {
                return aos.util.ToObject.box(bel_playerPerceptReceived_dat);
            }
            case 2: 
            {
                return aos.util.ToObject.box(bel_players_dat);
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
                return aos.util.ToObject.box(bel_simulationProp_dat);
            }
            case 6: 
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
        aos.jack.jak.logic.IntegerVariable __local__5_0;
        aos.jack.jak.logic.IntegerVariable __local__5_1;
        aos.jack.jak.logic.IntegerVariable __local__5_2;
        aos.jack.jak.logic.IntegerVariable __local__5_3;
        aos.jack.jak.logic.IntegerVariable __local__5_4;
        aos.jack.jak.logic.StringVariable __local__5_5;
        aos.jack.jak.logic.IntegerVariable __local__5_6;
        aos.jack.jak.logic.IntegerVariable __local__5_7;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-Coord_EndSimulation.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.Coord_EndSimulation.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("Coord_EndSimulation.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (53)         logical int $gridX, $gridY, $depotX, $depotY, $noSteps;
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__5_0 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__5_1 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__5_2 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__5_3 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__5_4 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 11;
                            break;
                        }
                        //* (54)         bel_simulationProp_dat.get($gridX, $gridY, $depotX, $depotY, $noSteps).removeAll();
                        case 11: 
                        {
                            __state = 12;
                            bel_simulationProp_dat.get(__local__5_0,__local__5_1,__local__5_2,__local__5_3,__local__5_4).removeAll();
                            break;
                        }
                        //* (55)         logical String $agentName;
                        case 12: 
                        {
                            __local__5_5 = (aos.jack.jak.logic.StringVariable) __logic.new_variable(java.lang.String.class);
                            __state = 13;
                            break;
                        }
                        //* (56)         logical int $xPos, $yPos;
                        case 13: 
                        {
                            __local__5_6 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__5_7 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 14;
                            break;
                        }
                        //* (57)         bel_playerPositions_dat.get($agentName,$xPos,$yPos).removeAll();
                        case 14: 
                        {
                            __state = 15;
                            bel_playerPositions_dat.get(__local__5_5,__local__5_6,__local__5_7).removeAll();
                            break;
                        }
                        //* (58)         bel_playerPerceptReceived_dat.get($agentName).removeAll();
                        case 15: 
                        {
                            __state = 16;
                            bel_playerPerceptReceived_dat.get(__local__5_5).removeAll();
                            break;
                        }
                        //* (61)       	consoleIface.showConsoleDebug("Agent "+mesimend_h.from+ " reported the end of a simulation...");
                        case 16: 
                        {
                            __state = 17;
                            consoleIface.showConsoleDebug("Agent " + mesimend_h.from + " reported the end of a simulation...");
                            break;
                        }
                        //* (49)     #reasoning method
                        case 17: 
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
            return rmit.ai.clima.jackagt.plans.Coord_EndSimulation.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.Coord_EndSimulation.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__5_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__5_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__5_2);
                }
                case 3: 
                {
                    return aos.util.ToObject.box(__local__5_3);
                }
                case 4: 
                {
                    return aos.util.ToObject.box(__local__5_4);
                }
                case 5: 
                {
                    return aos.util.ToObject.box(__local__5_5);
                }
                case 6: 
                {
                    return aos.util.ToObject.box(__local__5_6);
                }
                case 7: 
                {
                    return aos.util.ToObject.box(__local__5_7);
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