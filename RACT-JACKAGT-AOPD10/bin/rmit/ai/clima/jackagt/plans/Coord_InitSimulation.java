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
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.logic.Signature;
import rmit.ai.clima.jackagt.events.MESimStart;
import rmit.ai.clima.jackagt.data.BPlayerPerceptReceived;
import rmit.ai.clima.jackagt.data.BPlayer;
import rmit.ai.clima.jackagt.data.BObstacleAt;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.interfaces.DebugInterface;
import java.lang.Object;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class Coord_InitSimulation extends aos.jack.jak.plan.Plan {
    public rmit.ai.clima.jackagt.events.MESimStart mesimstart_h;
    public rmit.ai.clima.jackagt.data.BPlayerPerceptReceived bel_playerPerceptReceived_dat;
    public rmit.ai.clima.jackagt.data.BPlayer bel_players_dat;
    public rmit.ai.clima.jackagt.data.BObstacleAt bel_obstacleAt_dat;
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public rmit.ai.clima.interfaces.DebugInterface consoleIface;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/Coord_InitSimulation.plan",
            "body",
            "48",
            "49",
            "50",
            "51",
            "52",
            "56",
            "59",
            "44",
            "66",
            "67",
            "44"};
    private final static java.lang.String[] __planVariableNames = {
            "mesimstart_h",
            "bel_playerPerceptReceived_dat",
            "bel_players_dat",
            "bel_obstacleAt_dat",
            "bel_simulationProp_dat",
            "consoleIface"};
    private final static java.lang.String[] __planVariableTypes = {
            "rmit.ai.clima.jackagt.events.MESimStart",
            "BPlayerPerceptReceived",
            "rmit.ai.clima.jackagt.data.BPlayer",
            "rmit.ai.clima.jackagt.data.BObstacleAt",
            "rmit.ai.clima.jackagt.data.SimulationProp",
            "DebugInterface"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "gridX",
            "gridY",
            "depotX",
            "depotY",
            "numSteps"};
    private final static java.lang.String[] __fsmTypes_body = {
            "int",
            "int",
            "int",
            "int",
            "int"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__7_0",
            "__local__7_1",
            "__local__7_2",
            "__local__7_3",
            "__local__7_4"};
    static boolean relevant(rmit.ai.clima.jackagt.events.MESimStart ev)
    {
        return true;
    }
    
    public Coord_InitSimulation()
    {
    }
    
    private Coord_InitSimulation(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.Coord_InitSimulation __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        mesimstart_h = __env.mesimstart_h;
        bel_playerPerceptReceived_dat = __env.bel_playerPerceptReceived_dat;
        bel_players_dat = __env.bel_players_dat;
        bel_obstacleAt_dat = __env.bel_obstacleAt_dat;
        bel_simulationProp_dat = __env.bel_simulationProp_dat;
        consoleIface = (rmit.ai.clima.interfaces.DebugInterface) __ns.getIF(rmit.ai.clima.interfaces.DebugInterface.class);
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        mesimstart_h = (rmit.ai.clima.jackagt.events.MESimStart) __a.findEvent("rmit.ai.clima.jackagt.events.MESimStart");
        if (mesimstart_h == null) {
            warning("Failed to find MESimStart mesimstart_h");
            return false;
        }
        bel_playerPerceptReceived_dat = (rmit.ai.clima.jackagt.data.BPlayerPerceptReceived) lookupNamedObject("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.BPlayerPerceptReceived",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_playerPerceptReceived_dat == null) {
            warning("Failed to find BPlayerPerceptReceived bel_playerPerceptReceived_dat");
            return false;
        }
        bel_players_dat = (rmit.ai.clima.jackagt.data.BPlayer) lookupNamedObject("bel_players_dat","rmit.ai.clima.jackagt.data.BPlayer",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_players_dat == null) {
            warning("Failed to find BPlayer bel_players_dat");
            return false;
        }
        bel_obstacleAt_dat = (rmit.ai.clima.jackagt.data.BObstacleAt) lookupNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_obstacleAt_dat == null) {
            warning("Failed to find BObstacleAt bel_obstacleAt_dat");
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
        return new rmit.ai.clima.jackagt.plans.Coord_InitSimulation.__bodyFSM();
    }
    
    private Coord_InitSimulation(rmit.ai.clima.jackagt.events.MESimStart __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.Coord_InitSimulation __env)
    {
        this(__t,__env);
        this.mesimstart_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return mesimstart_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.MESimStart";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.jackagt.events.MESimStart) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.MESimStart)) 
            return null;
        rmit.ai.clima.jackagt.events.MESimStart __e1 = (rmit.ai.clima.jackagt.events.MESimStart) __e;
        return new rmit.ai.clima.jackagt.plans.Coord_InitSimulation(__e1,__t,this);
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
                return aos.util.ToObject.box(mesimstart_h);
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
                return aos.util.ToObject.box(bel_obstacleAt_dat);
            }
            case 4: 
            {
                return aos.util.ToObject.box(bel_simulationProp_dat);
            }
            case 5: 
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
        int __local__7_0;
        int __local__7_1;
        int __local__7_2;
        int __local__7_3;
        int __local__7_4;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-Coord_InitSimulation.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.Coord_InitSimulation.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("Coord_InitSimulation.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (48)       int gridX = mesimstart_h.gridSize.x;
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__7_0 = mesimstart_h.gridSize.x;
                            __state = 11;
                            break;
                        }
                        //* (49)       int gridY = mesimstart_h.gridSize.y;
                        case 11: 
                        {
                            __local__7_1 = mesimstart_h.gridSize.y;
                            __state = 12;
                            break;
                        }
                        //* (50)       int depotX = mesimstart_h.depotPosition.x;
                        case 12: 
                        {
                            __local__7_2 = mesimstart_h.depotPosition.x;
                            __state = 13;
                            break;
                        }
                        //* (51)       int depotY = mesimstart_h.depotPosition.y;
                        case 13: 
                        {
                            __local__7_3 = mesimstart_h.depotPosition.y;
                            __state = 14;
                            break;
                        }
                        //* (52)       int numSteps = mesimstart_h.numSteps;
                        case 14: 
                        {
                            __local__7_4 = mesimstart_h.numSteps;
                            __state = 15;
                            break;
                        }
                        //* (56)       bel_players_dat.add(mesimstart_h.from);
                        case 15: 
                        {
                            __state = 16;
                            //initialise flag that tracks which players have sent info this turn 

                            bel_players_dat.add(mesimstart_h.from);
                            break;
                        }
                        //* (59)       if (bel_simulationProp_dat.check(gridX, gridY, depotX, depotY, numSteps)) 
                        case 16: 
                        {
                            boolean __b;
                            aos.jack.jak.cursor.Cursor __c = null;
                            try {
                                __c = genCursor(0);
                                __b = __c.next();
                            }
                            finally {
                                if (__c != null) 
                                    __c.finished();
                            }
                            if (__b) 
                                __state = 17;
                             else 
                                __state = 18;
                            break;
                        }
                        //* (44)    #reasoning method
                        case 17: 
                        {
                            __state = 20;
                            break;
                        }
                        //* (66)          bel_simulationProp_dat.add(gridX, gridY, depotX, depotY, numSteps);
                        case 18: 
                        {
                            __breakLevel = 2;
                            __state = 19;
                            // Initalize parameters for the new simulation

                            bel_simulationProp_dat.add(__local__7_0,__local__7_1,__local__7_2,__local__7_3,__local__7_4);
                            break;
                        }
                        //* (67)          bel_obstacleAt_dat.add(depotX, depotY, Cursor.FALSE);
                        case 19: 
                        {
                            __state = 20;
                            bel_obstacleAt_dat.add(__local__7_2,__local__7_3,aos.jack.jak.cursor.Cursor.FALSE);
                            break;
                        }
                        //* (44)    #reasoning method
                        case 20: 
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
                case 0: 
                {
                    return (bel_simulationProp_dat.check(__local__7_0,__local__7_1,__local__7_2,__local__7_3,__local__7_4));
                }
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
            return rmit.ai.clima.jackagt.plans.Coord_InitSimulation.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.Coord_InitSimulation.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__7_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__7_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__7_2);
                }
                case 3: 
                {
                    return aos.util.ToObject.box(__local__7_3);
                }
                case 4: 
                {
                    return aos.util.ToObject.box(__local__7_4);
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
