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
import rmit.ai.clima.jackagt.events.EExecuteCLIMAaction;
import rmit.ai.clima.jackagt.events.MEPlayerAction;
import java.util.Random;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class PMoveRand extends aos.jack.jak.plan.Plan {
    final static java.lang.String[] actions = {
            "left",
            "right",
            "up",
            "down"};
    java.util.Random random = new java.util.Random();
    public rmit.ai.clima.jackagt.events.EExecuteCLIMAaction eexecuteclimaaction_p;
    public rmit.ai.clima.jackagt.events.MEPlayerAction meplayeraction_h;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/PMoveRand.plan",
            "body",
            "37",
            "38",
            "39",
            "33"};
    private final static java.lang.String[] __planVariableNames = {
            "actions",
            "random",
            "eexecuteclimaaction_p",
            "meplayeraction_h"};
    private final static java.lang.String[] __planVariableTypes = {
            "String[]",
            "java.util.Random",
            "rmit.ai.clima.jackagt.events.EExecuteCLIMAaction",
            "MEPlayerAction"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "dir"};
    private final static java.lang.String[] __fsmTypes_body = {
            "String"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__20_0"};
    static boolean relevant(rmit.ai.clima.jackagt.events.MEPlayerAction e)
    {
        return (e.action.equalsIgnoreCase("moveRand"));
    }
    
    public PMoveRand()
    {
    }
    
    private PMoveRand(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.PMoveRand __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eexecuteclimaaction_p = __env.eexecuteclimaaction_p;
        meplayeraction_h = __env.meplayeraction_h;
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eexecuteclimaaction_p = (rmit.ai.clima.jackagt.events.EExecuteCLIMAaction) __a.findEvent("rmit.ai.clima.jackagt.events.EExecuteCLIMAaction");
        if (eexecuteclimaaction_p == null) {
            warning("Failed to find EExecuteCLIMAaction eexecuteclimaaction_p");
            return false;
        }
        meplayeraction_h = (rmit.ai.clima.jackagt.events.MEPlayerAction) __a.findEvent("rmit.ai.clima.jackagt.events.MEPlayerAction");
        if (meplayeraction_h == null) {
            warning("Failed to find MEPlayerAction meplayeraction_h");
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
        return new rmit.ai.clima.jackagt.plans.PMoveRand.__bodyFSM();
    }
    
    private PMoveRand(rmit.ai.clima.jackagt.events.MEPlayerAction __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.PMoveRand __env)
    {
        this(__t,__env);
        this.meplayeraction_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return meplayeraction_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.MEPlayerAction";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.jackagt.events.MEPlayerAction) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.MEPlayerAction)) 
            return null;
        rmit.ai.clima.jackagt.events.MEPlayerAction __e1 = (rmit.ai.clima.jackagt.events.MEPlayerAction) __e;
        return new rmit.ai.clima.jackagt.plans.PMoveRand(__e1,__t,this);
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
                return aos.util.ToObject.box(actions);
            }
            case 1: 
            {
                return aos.util.ToObject.box(random);
            }
            case 2: 
            {
                return aos.util.ToObject.box(eexecuteclimaaction_p);
            }
            case 3: 
            {
                return aos.util.ToObject.box(meplayeraction_h);
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
        java.lang.String __local__20_0;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-PMoveRand.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.PMoveRand.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("PMoveRand.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (37)       String dir = actions[ random.nextInt(4) ];  // pick a random direction
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__20_0 = actions[random.nextInt(4)];
                            __state = 11;
                            break;
                        }
                        //* (38)       System.out.println( "MOVING RANDOMLY TO: "+ dir );
                        case 11: 
                        {
                            __state = 12;
                            // pick a random direction

                            java.lang.System.out.println("MOVING RANDOMLY TO: " + __local__20_0);
                            break;
                        }
                        //* (39)       eexecuteclimaaction_p.post(dir); // Post an ExecuteClimaAction event to execute the action in the server
                        case 12: 
                        {
                            __task.push(eexecuteclimaaction_p.post(__local__20_0));
                            __state = -__state;
                            __subtask_pass = 13;
                            __subtask_fail = 4;
                            return SUBTASK;
                        }
                        //* (33) 	#reasoning method
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
            return rmit.ai.clima.jackagt.plans.PMoveRand.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.PMoveRand.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__20_0);
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
