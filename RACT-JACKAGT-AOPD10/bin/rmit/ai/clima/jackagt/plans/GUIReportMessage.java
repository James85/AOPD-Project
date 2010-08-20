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
import aos.jack.util.thread.Semaphore;
import rmit.ai.clima.jackagt.data.BAgentNumbers;
import rmit.ai.clima.jackagt.agents.GUIAgent;
import java.util.Calendar;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class GUIReportMessage extends aos.jack.jak.plan.Plan {
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_h;
    public aos.jack.util.thread.Semaphore mutex_accessGUI_dat;
    public rmit.ai.clima.jackagt.data.BAgentNumbers bel_agentNumbers_dat;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/GUIReportMessage.plan",
            "body",
            "41",
            "44",
            "47",
            "49",
            "50",
            "53",
            "54",
            "60",
            "38"};
    private final static java.lang.String[] __planVariableNames = {
            "eguidebugmessage_h",
            "mutex_accessGUI_dat",
            "bel_agentNumbers_dat"};
    private final static java.lang.String[] __planVariableTypes = {
            "rmit.ai.clima.jackagt.events.EGUIDebugMessage",
            "aos.jack.util.thread.Semaphore",
            "rmit.ai.clima.jackagt.data.BAgentNumbers"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "guiAgent",
            "$agentNo",
            "agentNo"};
    private final static java.lang.String[] __fsmTypes_body = {
            "GUIAgent",
            "logical int",
            "int"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__13_0",
            "__local__13_1",
            "__local__13_2"};
    public GUIReportMessage()
    {
    }
    
    private GUIReportMessage(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.GUIReportMessage __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eguidebugmessage_h = __env.eguidebugmessage_h;
        mutex_accessGUI_dat = __env.mutex_accessGUI_dat;
        bel_agentNumbers_dat = __env.bel_agentNumbers_dat;
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eguidebugmessage_h = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) __a.findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        if (eguidebugmessage_h == null) {
            warning("Failed to find EGUIDebugMessage eguidebugmessage_h");
            return false;
        }
        mutex_accessGUI_dat = (aos.jack.util.thread.Semaphore) lookupNamedObject("mutex_accessGUI_dat","aos.jack.util.thread.Semaphore",0);
        if (mutex_accessGUI_dat == null) {
            warning("Failed to find Semaphore mutex_accessGUI_dat");
            return false;
        }
        bel_agentNumbers_dat = (rmit.ai.clima.jackagt.data.BAgentNumbers) lookupNamedObject("bel_agentNumbers_dat","rmit.ai.clima.jackagt.data.BAgentNumbers",0);
        if (bel_agentNumbers_dat == null) {
            warning("Failed to find BAgentNumbers bel_agentNumbers_dat");
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
        return new rmit.ai.clima.jackagt.plans.GUIReportMessage.__bodyFSM();
    }
    
    private GUIReportMessage(rmit.ai.clima.jackagt.events.EGUIDebugMessage __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.GUIReportMessage __env)
    {
        this(__t,__env);
        this.eguidebugmessage_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return eguidebugmessage_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.EGUIDebugMessage";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled();
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.EGUIDebugMessage)) 
            return null;
        rmit.ai.clima.jackagt.events.EGUIDebugMessage __e1 = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) __e;
        return new rmit.ai.clima.jackagt.plans.GUIReportMessage(__e1,__t,this);
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
                return aos.util.ToObject.box(eguidebugmessage_h);
            }
            case 1: 
            {
                return aos.util.ToObject.box(mutex_accessGUI_dat);
            }
            case 2: 
            {
                return aos.util.ToObject.box(bel_agentNumbers_dat);
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
            return ((((eguidebugmessage_h.reporting && ((rmit.ai.clima.jackagt.agents.GUIAgent) getAgent()).guiReady))?aos.jack.jak.cursor.Cursor.trueCursor:aos.jack.jak.cursor.Cursor.falseCursor));
        }
        catch (java.lang.Exception e) {
            e.printStackTrace();
            return aos.jack.jak.cursor.Cursor.falseCursor;
        }
    }
    
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        rmit.ai.clima.jackagt.agents.GUIAgent __local__13_0;
        aos.jack.jak.logic.IntegerVariable __local__13_1;
        int __local__13_2;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-GUIReportMessage.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.GUIReportMessage.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("GUIReportMessage.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (41) 	   	GUIAgent guiAgent = (GUIAgent)getAgent();
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__13_0 = (rmit.ai.clima.jackagt.agents.GUIAgent) getAgent();
                            __state = 11;
                            break;
                        }
                        //* (44) 		@waitFor(mutex_accessGUI_dat.planWait()); // Hold the mutex for updating the GUI
                        case 11: 
                        {
                            __task.push(new aos.jack.jak.fsm.WaitForFSM(getAgent(),__task,this,0));
                            __state = -__state;
                            __subtask_pass = 12;
                            __subtask_fail = 4;
                            return SUBTASK;
                        }
                        //* (47) 			logical int $agentNo;
                        case 12: 
                        {
                            __local__13_1 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 13;
                            break;
                        }
                        //* (49) 	    	bel_agentNumbers_dat.getNo(eguidebugmessage_h.from, $agentNo);
                        case 13: 
                        {
                            boolean __b;
                            aos.jack.jak.cursor.Cursor __c = null;
                            try {
                                __c = genCursor(1);
                                __b = __c.next();
                            }
                            finally {
                                if (__c != null) 
                                    __c.finished();
                            }
                            if (__b) 
                                __state = 14;
                             else 
                                throw planfailed;
                            break;
                        }
                        //* (50) 			int agentNo = $agentNo.as_int();
                        case 14: 
                        {
                            __local__13_2 = __local__13_1.as_int();
                            __state = 15;
                            break;
                        }
                        //* (53)        		if(guiAgent.showGUI) {
                        case 15: 
                        {
                            if (__local__13_0.showGUI) 
                                __state = 16;
                             else 
                                __state = 17;
                            break;
                        }
                        //* (54) 	        	guiAgent.guiInterface.reportMessage(agentNo, eguidebugmessage_h.entity, 
                        case 16: 
                        {
                            __breakLevel = 2;
                            __state = 17;
                            __local__13_0.guiInterface.reportMessage(__local__13_2,eguidebugmessage_h.entity,"[" + eguidebugmessage_h.timestamp.get(java.util.Calendar.MINUTE) + ":" + eguidebugmessage_h.timestamp.get(java.util.Calendar.SECOND) + ":" + eguidebugmessage_h.timestamp.get(java.util.Calendar.MILLISECOND) + "] " + eguidebugmessage_h.message);
                            break;
                        }
                        //* (60) 	    mutex_accessGUI_dat.signal(); // release mutex
                        case 17: 
                        {
                            __state = 18;
                            mutex_accessGUI_dat.signal();
                            break;
                        }
                        //* (38)     #reasoning method
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
                case 0: 
                {
                    return (mutex_accessGUI_dat.planWait());
                }
                case 1: 
                {
                    return (bel_agentNumbers_dat.getNo(eguidebugmessage_h.from,__local__13_1));
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
            return rmit.ai.clima.jackagt.plans.GUIReportMessage.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.GUIReportMessage.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__13_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__13_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__13_2);
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