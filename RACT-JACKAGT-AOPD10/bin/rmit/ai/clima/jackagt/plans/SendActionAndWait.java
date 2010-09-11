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
import rmit.ai.clima.iface.TellClimaServer;
import rmit.ai.clima.jackagt.events.EExecuteCLIMAaction;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.interfaces.DebugInterface;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;
import rmit.ai.clima.comms.Action;

public class SendActionAndWait extends aos.jack.jak.plan.Plan {
    final static java.lang.String ID = "SEND_ACT";
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public rmit.ai.clima.iface.TellClimaServer tellclimaserver_p;
    public rmit.ai.clima.jackagt.events.EExecuteCLIMAaction eexecuteclimaaction_h;
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.interfaces.DebugInterface debugIface;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/SendActionAndWait.plan",
            "body",
            "54",
            "55",
            "60",
            "63",
            "64",
            "69",
            "49"};
    private final static java.lang.String[] __planVariableNames = {
            "ID",
            "eguidebugmessage_s",
            "tellclimaserver_p",
            "eexecuteclimaaction_h",
            "bel_currentRequestActionId_dat",
            "debugIface"};
    private final static java.lang.String[] __planVariableTypes = {
            "String",
            "EGUIDebugMessage",
            "TellClimaServer",
            "rmit.ai.clima.jackagt.events.EExecuteCLIMAaction",
            "rmit.ai.clima.jackagt.data.CurrentRequestActionId",
            "rmit.ai.clima.interfaces.DebugInterface"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "$id"};
    private final static java.lang.String[] __fsmTypes_body = {
            "logical int"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__21_0"};
    // The ID of the plan (for printing)	

    static boolean relevant(rmit.ai.clima.jackagt.events.EExecuteCLIMAaction ev)
    {
        return true;
    }
    
    public SendActionAndWait()
    {
    }
    
    private SendActionAndWait(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.SendActionAndWait __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eguidebugmessage_s = __env.eguidebugmessage_s;
        tellclimaserver_p = __env.tellclimaserver_p;
        eexecuteclimaaction_h = __env.eexecuteclimaaction_h;
        bel_currentRequestActionId_dat = __env.bel_currentRequestActionId_dat;
        debugIface = (rmit.ai.clima.interfaces.DebugInterface) __ns.getIF(rmit.ai.clima.interfaces.DebugInterface.class);
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) __a.findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        if (eguidebugmessage_s == null) {
            warning("Failed to find EGUIDebugMessage eguidebugmessage_s");
            return false;
        }
        tellclimaserver_p = (rmit.ai.clima.iface.TellClimaServer) __a.findEvent("rmit.ai.clima.iface.TellClimaServer");
        if (tellclimaserver_p == null) {
            warning("Failed to find TellClimaServer tellclimaserver_p");
            return false;
        }
        eexecuteclimaaction_h = (rmit.ai.clima.jackagt.events.EExecuteCLIMAaction) __a.findEvent("rmit.ai.clima.jackagt.events.EExecuteCLIMAaction");
        if (eexecuteclimaaction_h == null) {
            warning("Failed to find EExecuteCLIMAaction eexecuteclimaaction_h");
            return false;
        }
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) lookupNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",0);
        if (bel_currentRequestActionId_dat == null) {
            warning("Failed to find CurrentRequestActionId bel_currentRequestActionId_dat");
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
        return new rmit.ai.clima.jackagt.plans.SendActionAndWait.__bodyFSM();
    }
    
    private SendActionAndWait(rmit.ai.clima.jackagt.events.EExecuteCLIMAaction __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.SendActionAndWait __env)
    {
        this(__t,__env);
        this.eexecuteclimaaction_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return eexecuteclimaaction_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.EExecuteCLIMAaction";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.jackagt.events.EExecuteCLIMAaction) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.EExecuteCLIMAaction)) 
            return null;
        rmit.ai.clima.jackagt.events.EExecuteCLIMAaction __e1 = (rmit.ai.clima.jackagt.events.EExecuteCLIMAaction) __e;
        return new rmit.ai.clima.jackagt.plans.SendActionAndWait(__e1,__t,this);
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
                return aos.util.ToObject.box(ID);
            }
            case 1: 
            {
                return aos.util.ToObject.box(eguidebugmessage_s);
            }
            case 2: 
            {
                return aos.util.ToObject.box(tellclimaserver_p);
            }
            case 3: 
            {
                return aos.util.ToObject.box(eexecuteclimaaction_h);
            }
            case 4: 
            {
                return aos.util.ToObject.box(bel_currentRequestActionId_dat);
            }
            case 5: 
            {
                return aos.util.ToObject.box(debugIface);
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
        aos.jack.jak.logic.IntegerVariable __local__21_0;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-SendActionAndWait.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.SendActionAndWait.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("SendActionAndWait.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (54)     	logical int $id;
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__21_0 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 11;
                            break;
                        }
                        //* (55)     	bel_currentRequestActionId_dat.query_id($id);
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
                        //* (60) 		@post(tellclimaserver_p.tell(new Action(eexecuteclimaaction_h.message, getAgent().name(), "" + 	$id.as_int())));
                        case 12: 
                        {
                            __state = 13;
                            agent.postEvent(tellclimaserver_p.tell(new rmit.ai.clima.comms.Action(eexecuteclimaaction_h.message,getAgent().name(),"" + __local__21_0.as_int())));
                            break;
                        }
                        //* (63)       debugIface.showConsoleDebug("I sent CLIMA action *" + eexecuteclimaaction_h.message +"* for execution with id " + $id.as_int());
                        case 13: 
                        {
                            __state = 14;
                            // Report that the action was sent for execution

                            debugIface.showConsoleDebug("I sent CLIMA action *" + eexecuteclimaaction_h.message + "* for execution with id " + __local__21_0.as_int());
                            break;
                        }
                        //* (64) 		@send("gui", eguidebugmessage_s.reportMessage(ID, "I have decided to move towards: " + "*"+eexecuteclimaaction_h.message+"*"));
                        case 14: 
                        {
                            __state = 15;
                            agent.send("gui",eguidebugmessage_s.reportMessage(ID,"I have decided to move towards: " + "*" + eexecuteclimaaction_h.message + "*"));
                            break;
                        }
                        //* (69)         @wait_for(bel_currentRequestActionId_dat.check_id($id.as_int() + 1));
                        case 15: 
                        {
                            __task.push(new aos.jack.jak.fsm.WaitForFSM(getAgent(),__task,this,1));
                            __state = -__state;
                            __subtask_pass = 16;
                            __subtask_fail = 4;
                            return SUBTASK;
                        }
                        //* (49)     #reasoning method
                        case 16: 
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
                    return (bel_currentRequestActionId_dat.query_id(__local__21_0));
                }
                case 1: 
                {
                    return (bel_currentRequestActionId_dat.check_id(__local__21_0.as_int() + 1));
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
            return rmit.ai.clima.jackagt.plans.SendActionAndWait.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.SendActionAndWait.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__21_0);
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
