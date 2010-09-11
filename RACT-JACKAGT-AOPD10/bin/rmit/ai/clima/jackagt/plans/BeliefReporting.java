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
import aos.jack.jak.event.Event;
import aos.jack.jak.task.Task;
import aos.jack.jak.core.Generator;
import aos.jack.jak.logic.Signature;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.jackagt.events.MEInformAgentStatus;
import rmit.ai.clima.jackagt.events.EShowBeliefs;
import rmit.ai.clima.jackagt.data.CurrentStatus;
import rmit.ai.clima.jackagt.data.BObstacleAt;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.jackagt.data.BGoldAt;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class BeliefReporting extends aos.jack.jak.plan.Plan {
    final static java.lang.String[] dir = {
            "cur",
            "n",
            "ne",
            "e",
            "se",
            "s",
            "sw",
            "w",
            "nw"};
    final static java.lang.String ID = "BEL_REPORT";
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public rmit.ai.clima.jackagt.events.MEInformAgentStatus meinformagentstatus_p;
    public rmit.ai.clima.jackagt.events.EShowBeliefs eshowbeliefs_h;
    public rmit.ai.clima.jackagt.data.CurrentStatus bel_currentStatus_dat;
    public rmit.ai.clima.jackagt.data.BObstacleAt bel_obstacleAt_dat;
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.jackagt.data.BGoldAt bel_goldAt_dat;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/BeliefReporting.plan",
            "body",
            "68",
            "69",
            "72",
            "63"};
    private static aos.jack.jak.plan.ExMap[] __exMap_fail;
    private static java.lang.String[] __tt__fail = {
            "rmit/ai/clima/jackagt/plans/BeliefReporting.plan",
            "fail",
            "57",
            "57"};
    private final static java.lang.String[] __planVariableNames = {
            "dir",
            "ID",
            "eguidebugmessage_s",
            "meinformagentstatus_p",
            "eshowbeliefs_h",
            "bel_currentStatus_dat",
            "bel_obstacleAt_dat",
            "bel_currentRequestActionId_dat",
            "bel_goldAt_dat"};
    private final static java.lang.String[] __planVariableTypes = {
            "String[]",
            "String",
            "EGUIDebugMessage",
            "MEInformAgentStatus",
            "EShowBeliefs",
            "CurrentStatus",
            "BObstacleAt",
            "rmit.ai.clima.jackagt.data.CurrentRequestActionId",
            "BGoldAt"};
    private final static java.lang.String[] __reasoningMethods = {
            "body",
            "fail"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "$lastActionSentId",
            "$step"};
    private final static java.lang.String[] __fsmTypes_body = {
            "logical int",
            "logical int"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__1_0",
            "__local__1_1"};
    // The ID of the plan (for printing)	

    static boolean relevant(rmit.ai.clima.jackagt.events.EShowBeliefs ev)
    {
        return true;
    }
    
    public BeliefReporting()
    {
    }
    
    private BeliefReporting(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.BeliefReporting __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eguidebugmessage_s = __env.eguidebugmessage_s;
        meinformagentstatus_p = __env.meinformagentstatus_p;
        eshowbeliefs_h = __env.eshowbeliefs_h;
        bel_currentStatus_dat = __env.bel_currentStatus_dat;
        bel_obstacleAt_dat = __env.bel_obstacleAt_dat;
        bel_currentRequestActionId_dat = __env.bel_currentRequestActionId_dat;
        bel_goldAt_dat = __env.bel_goldAt_dat;
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) __a.findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        if (eguidebugmessage_s == null) {
            warning("Failed to find EGUIDebugMessage eguidebugmessage_s");
            return false;
        }
        meinformagentstatus_p = (rmit.ai.clima.jackagt.events.MEInformAgentStatus) __a.findEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus");
        if (meinformagentstatus_p == null) {
            warning("Failed to find MEInformAgentStatus meinformagentstatus_p");
            return false;
        }
        eshowbeliefs_h = (rmit.ai.clima.jackagt.events.EShowBeliefs) __a.findEvent("rmit.ai.clima.jackagt.events.EShowBeliefs");
        if (eshowbeliefs_h == null) {
            warning("Failed to find EShowBeliefs eshowbeliefs_h");
            return false;
        }
        bel_currentStatus_dat = (rmit.ai.clima.jackagt.data.CurrentStatus) lookupNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus",0);
        if (bel_currentStatus_dat == null) {
            warning("Failed to find CurrentStatus bel_currentStatus_dat");
            return false;
        }
        bel_obstacleAt_dat = (rmit.ai.clima.jackagt.data.BObstacleAt) lookupNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",0);
        if (bel_obstacleAt_dat == null) {
            warning("Failed to find BObstacleAt bel_obstacleAt_dat");
            return false;
        }
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) lookupNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",0);
        if (bel_currentRequestActionId_dat == null) {
            warning("Failed to find CurrentRequestActionId bel_currentRequestActionId_dat");
            return false;
        }
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.BGoldAt) lookupNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt",0);
        if (bel_goldAt_dat == null) {
            warning("Failed to find BGoldAt bel_goldAt_dat");
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
        return new rmit.ai.clima.jackagt.plans.BeliefReporting.__bodyFSM();
    }
    
    public aos.jack.jak.plan.PlanFSM fail()
    {
        return new rmit.ai.clima.jackagt.plans.BeliefReporting.__failFSM();
    }
    
    private BeliefReporting(rmit.ai.clima.jackagt.events.EShowBeliefs __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.BeliefReporting __env)
    {
        this(__t,__env);
        this.eshowbeliefs_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return eshowbeliefs_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.EShowBeliefs";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.jackagt.events.EShowBeliefs) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.EShowBeliefs)) 
            return null;
        rmit.ai.clima.jackagt.events.EShowBeliefs __e1 = (rmit.ai.clima.jackagt.events.EShowBeliefs) __e;
        return new rmit.ai.clima.jackagt.plans.BeliefReporting(__e1,__t,this);
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
                return aos.util.ToObject.box(dir);
            }
            case 1: 
            {
                return aos.util.ToObject.box(ID);
            }
            case 2: 
            {
                return aos.util.ToObject.box(eguidebugmessage_s);
            }
            case 3: 
            {
                return aos.util.ToObject.box(meinformagentstatus_p);
            }
            case 4: 
            {
                return aos.util.ToObject.box(eshowbeliefs_h);
            }
            case 5: 
            {
                return aos.util.ToObject.box(bel_currentStatus_dat);
            }
            case 6: 
            {
                return aos.util.ToObject.box(bel_obstacleAt_dat);
            }
            case 7: 
            {
                return aos.util.ToObject.box(bel_currentRequestActionId_dat);
            }
            case 8: 
            {
                return aos.util.ToObject.box(bel_goldAt_dat);
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
            return (((bel_currentStatus_dat.debugGUI())?aos.jack.jak.cursor.Cursor.trueCursor:aos.jack.jak.cursor.Cursor.falseCursor));
        }
        catch (java.lang.Exception e) {
            e.printStackTrace();
            return aos.jack.jak.cursor.Cursor.falseCursor;
        }
    }
    
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        aos.jack.jak.logic.IntegerVariable __local__1_0;
        aos.jack.jak.logic.IntegerVariable __local__1_1;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-BeliefReporting.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.BeliefReporting.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("BeliefReporting.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (68)         logical int $lastActionSentId, $step;
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__1_0 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__1_1 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 11;
                            break;
                        }
                        //* (69) 		bel_currentRequestActionId_dat.query_step($step);
                        case 11: 
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
                                __state = 12;
                             else 
                                throw planfailed;
                            break;
                        }
                        //* (72) 		@send("gui", eguidebugmessage_s.reportMessage(ID, "My current request action id is "+ $step.as_int()) );
                        case 12: 
                        {
                            __state = 13;
                            agent.send("gui",eguidebugmessage_s.reportMessage(ID,"My current request action id is " + __local__1_1.as_int()));
                            break;
                        }
                        //* (63)     #reasoning method
                        case 13: 
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
                    return (bel_currentRequestActionId_dat.query_step(__local__1_1));
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
            return rmit.ai.clima.jackagt.plans.BeliefReporting.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.BeliefReporting.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__1_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__1_1);
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
    class __failFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-BeliefReporting.fail:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.BeliefReporting.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("BeliefReporting.fail: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (57)     fail()
                        case 10: 
                        {
                            __breakLevel = 0;
                            __state = 11;
                            break;
                        }
                        //* (57)     fail()
                        case 11: 
                        {
                            if (__pending == null) 
                                __state = PASSED_STATE;
                            __tothrow = __pending;
                            break;
                        }
                    }
                }
                catch (java.lang.Throwable e) {
                    handleException(e,__exMap_fail);
                }
            }
             while (!agent.changing_focus);
            return CONTINUE;
        }
        
        public java.lang.String methodName()
        {
            return "fail";
        }
        
        __failFSM()
        {
        }
        
        public java.lang.String stateInfo()
        {
            int n = __curstate;
            java.lang.String file = __tt__fail[0];
            java.lang.String method = __tt__fail[1];
            if (n < 0) 
                n = -n;
            n -= (10 - 2);
            java.lang.String line = (n < 2)?"??":__tt__fail[n];
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
            return rmit.ai.clima.jackagt.plans.BeliefReporting.this;
        }
        
        public void enter()
        {
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.BeliefReporting.fail");
        }
        
    }
}
