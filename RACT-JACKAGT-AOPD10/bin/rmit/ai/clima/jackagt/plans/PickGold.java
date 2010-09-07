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
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.cursor.BinaryBoolOp;
import aos.jack.jak.logic.Signature;
import rmit.ai.clima.jackagt.events.EExecuteCLIMAaction;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.jackagt.events.EAct;
import rmit.ai.clima.jackagt.data.CurrentPosition;
import rmit.ai.clima.jackagt.data.NumCarryingGold;
import rmit.ai.clima.jackagt.data.GoldAt;
import rmit.ai.clima.interfaces.DebugInterface;
import java.lang.Object;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class PickGold extends aos.jack.jak.plan.Plan {
    aos.jack.jak.logic.IntegerVariable $posX;
    aos.jack.jak.logic.IntegerVariable $posY;
    aos.jack.jak.logic.IntegerVariable $noGold;
    public rmit.ai.clima.jackagt.events.EExecuteCLIMAaction eexecuteclimaaction_p;
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public rmit.ai.clima.jackagt.events.EAct eact_h;
    public rmit.ai.clima.jackagt.data.CurrentPosition bel_currentPosition_dat;
    public rmit.ai.clima.jackagt.data.NumCarryingGold bel_numCarryingGold_dat;
    public rmit.ai.clima.jackagt.data.GoldAt bel_goldAt_dat;
    public rmit.ai.clima.interfaces.DebugInterface consoleIface;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/PickGold.plan",
            "body",
            "62",
            "63",
            "56"};
    private final static java.lang.String[] __planVariableNames = {
            "$posX",
            "$posY",
            "$noGold",
            "eexecuteclimaaction_p",
            "eguidebugmessage_s",
            "eact_h",
            "bel_currentPosition_dat",
            "bel_numCarryingGold_dat",
            "bel_goldAt_dat",
            "consoleIface"};
    private final static java.lang.String[] __planVariableTypes = {
            "logical int",
            "logical int",
            "logical int",
            "rmit.ai.clima.jackagt.events.EExecuteCLIMAaction",
            "EGUIDebugMessage",
            "EAct",
            "CurrentPosition",
            "NumCarryingGold",
            "GoldAt",
            "rmit.ai.clima.interfaces.DebugInterface"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __logSignatureVariableNames = {
            "$posX",
            "$posY",
            "$noGold"};
    private final static java.lang.String[] __logSignatureVariableTypes = {
            "logical int",
            "logical int",
            "logical int"};
    static boolean relevant(rmit.ai.clima.jackagt.events.EAct ev)
    {
        return true;
    }
    
    public PickGold()
    {
    }
    
    private PickGold(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.PickGold __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eexecuteclimaaction_p = __env.eexecuteclimaaction_p;
        eguidebugmessage_s = __env.eguidebugmessage_s;
        eact_h = __env.eact_h;
        bel_currentPosition_dat = __env.bel_currentPosition_dat;
        bel_numCarryingGold_dat = __env.bel_numCarryingGold_dat;
        bel_goldAt_dat = __env.bel_goldAt_dat;
        consoleIface = (rmit.ai.clima.interfaces.DebugInterface) __ns.getIF(rmit.ai.clima.interfaces.DebugInterface.class);
        $posX = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $posY = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $noGold = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eexecuteclimaaction_p = (rmit.ai.clima.jackagt.events.EExecuteCLIMAaction) __a.findEvent("rmit.ai.clima.jackagt.events.EExecuteCLIMAaction");
        if (eexecuteclimaaction_p == null) {
            warning("Failed to find EExecuteCLIMAaction eexecuteclimaaction_p");
            return false;
        }
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) __a.findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        if (eguidebugmessage_s == null) {
            warning("Failed to find EGUIDebugMessage eguidebugmessage_s");
            return false;
        }
        eact_h = (rmit.ai.clima.jackagt.events.EAct) __a.findEvent("rmit.ai.clima.jackagt.events.EAct");
        if (eact_h == null) {
            warning("Failed to find EAct eact_h");
            return false;
        }
        bel_currentPosition_dat = (rmit.ai.clima.jackagt.data.CurrentPosition) lookupNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition",0);
        if (bel_currentPosition_dat == null) {
            warning("Failed to find CurrentPosition bel_currentPosition_dat");
            return false;
        }
        bel_numCarryingGold_dat = (rmit.ai.clima.jackagt.data.NumCarryingGold) lookupNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.NumCarryingGold",0);
        if (bel_numCarryingGold_dat == null) {
            warning("Failed to find NumCarryingGold bel_numCarryingGold_dat");
            return false;
        }
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.GoldAt) lookupNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",0);
        if (bel_goldAt_dat == null) {
            warning("Failed to find GoldAt bel_goldAt_dat");
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
            case 0: 
            {
                return (bel_numCarryingGold_dat.get($noGold));
            }
            case 1: 
            {
                return (new aos.jack.jak.cursor.BinaryBoolOp(this,__logic,aos.jack.jak.cursor.BinaryBoolOp.AND,(short) 0,true,(short) 0,false));
            }
            case 2: 
            {
                return (bel_currentPosition_dat.get($posX,$posY));
            }
            case 3: 
            {
                return (new aos.jack.jak.cursor.BinaryBoolOp(this,__logic,aos.jack.jak.cursor.BinaryBoolOp.AND,(short) 1,true,(short) 2,true));
            }
            case 4: 
            {
                return (bel_goldAt_dat.check($posX.as_int(),$posY.as_int()));
            }
            case 5: 
            {
                return (new aos.jack.jak.cursor.BinaryBoolOp(this,__logic,aos.jack.jak.cursor.BinaryBoolOp.AND,(short) 3,true,(short) 4,true));
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
            case 0: 
            {
                return ($noGold.as_int() < 3);
            }
        }
        aos.jack.jak.core.Jak.error("illegal test Construction");
        return false;
    }
    
    public aos.jack.jak.plan.PlanFSM body()
    {
        return new rmit.ai.clima.jackagt.plans.PickGold.__bodyFSM();
    }
    
    private PickGold(rmit.ai.clima.jackagt.events.EAct __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.PickGold __env)
    {
        this(__t,__env);
        this.eact_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return eact_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.EAct";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.jackagt.events.EAct) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.EAct)) 
            return null;
        rmit.ai.clima.jackagt.events.EAct __e1 = (rmit.ai.clima.jackagt.events.EAct) __e;
        return new rmit.ai.clima.jackagt.plans.PickGold(__e1,__t,this);
    }
    
    protected aos.jack.jak.logic.Signature initSignature(int __log)
    {
        aos.jack.jak.logic.Signature __s = super.initSignature(__log + 3);
        __s.addLogical($posX);
        __s.addLogical($posY);
        __s.addLogical($noGold);
        return __s;
    }
    
    public void setFromSignature(aos.jack.jak.logic.Signature __s)
    {
        super.setFromSignature(__s);
        $posX = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
        $posY = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
        $noGold = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
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
                return aos.util.ToObject.box($posX);
            }
            case 1: 
            {
                return aos.util.ToObject.box($posY);
            }
            case 2: 
            {
                return aos.util.ToObject.box($noGold);
            }
            case 3: 
            {
                return aos.util.ToObject.box(eexecuteclimaaction_p);
            }
            case 4: 
            {
                return aos.util.ToObject.box(eguidebugmessage_s);
            }
            case 5: 
            {
                return aos.util.ToObject.box(eact_h);
            }
            case 6: 
            {
                return aos.util.ToObject.box(bel_currentPosition_dat);
            }
            case 7: 
            {
                return aos.util.ToObject.box(bel_numCarryingGold_dat);
            }
            case 8: 
            {
                return aos.util.ToObject.box(bel_goldAt_dat);
            }
            case 9: 
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
    
    public java.lang.String[] logSignatureVariableNames()
    {
        return __logSignatureVariableNames;
    }
    
    public java.lang.String[] logSignatureVariableTypes()
    {
        return __logSignatureVariableTypes;
    }
    
    public aos.jack.jak.cursor.Cursor context()
    {
        try {
            return (genCursor(5));
        }
        catch (java.lang.Exception e) {
            e.printStackTrace();
            return aos.jack.jak.cursor.Cursor.falseCursor;
        }
    }
    
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-PickGold.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.PickGold.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("PickGold.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (62) 		consoleIface.showConsoleDebug("Agent "+getAgent().name()+" tries to pick up gold");
                        case 10: 
                        {
                            __breakLevel = 0;
                            __state = 11;
                            // The plan body. This describes the actual steps
// an agent performs when it executes this plan.

                            consoleIface.showConsoleDebug("Agent " + getAgent().name() + " tries to pick up gold");
                            break;
                        }
                        //* (63) 		eexecuteclimaaction_p.post("pick");	// Post an ExecuteClimaAction event to execute the action in the server
                        case 11: 
                        {
                            __task.push(eexecuteclimaaction_p.post("pick"));
                            __state = -__state;
                            __subtask_pass = 12;
                            __subtask_fail = 4;
                            return SUBTASK;
                        }
                        //* (56) 	body()
                        case 12: 
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
            return rmit.ai.clima.jackagt.plans.PickGold.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.PickGold.body");
        }
        
    }
}
