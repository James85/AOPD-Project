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
import aos.jack.jak.cursor.BinaryBoolOp;
import aos.jack.jak.logic.Signature;
import rmit.ai.clima.jackagt.events.EShowBeliefs;
import rmit.ai.clima.jackagt.events.EUpdateBel;
import rmit.ai.clima.jackagt.events.MEInformAgentStatus;
import rmit.ai.clima.jackagt.events.MEReportPlayerPercept;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.iface.PerceiveClimaServer;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.jackagt.data.BCurrentPosition;
import rmit.ai.clima.jackagt.data.BNumCarryingGold;
import rmit.ai.clima.interfaces.DebugInterface;
import rmit.ai.clima.comms.RequestAction;
import rmit.ai.clima.gui.grid.GridPoint;
import rmit.ai.clima.comms.Cell;
import java.lang.Object;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class HandlePercept extends aos.jack.jak.plan.Plan {
    final static java.lang.String ID = "HAND_PERC";
    public rmit.ai.clima.jackagt.events.EShowBeliefs eshowbeliefs_p;
    public rmit.ai.clima.jackagt.events.EUpdateBel eupdatebel_s;
    public rmit.ai.clima.jackagt.events.MEInformAgentStatus meinformagentstatus_p;
    public rmit.ai.clima.jackagt.events.MEReportPlayerPercept mereportplayerpercept_s;
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public rmit.ai.clima.iface.PerceiveClimaServer perceiveclimaserver_h;
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.jackagt.data.BCurrentPosition bel_currentPosition_dat;
    public rmit.ai.clima.jackagt.data.BNumCarryingGold bel_numCarryingGold_dat;
    public rmit.ai.clima.interfaces.DebugInterface consoleIface;
    private static aos.jack.jak.plan.ExMap[] __exMap_fail;
    private static java.lang.String[] __tt__fail = {
            "rmit/ai/clima/jackagt/plans/HandlePercept.plan",
            "fail",
            "68",
            "65"};
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/HandlePercept.plan",
            "body",
            "76",
            "79",
            "80",
            "81",
            "82",
            "83",
            "84",
            "85",
            "100",
            "104",
            "106",
            "110",
            "111",
            "112",
            "114",
            "121",
            "133",
            "142",
            "146",
            "149",
            "154",
            "72"};
    private final static java.lang.String[] __planVariableNames = {
            "ID",
            "eshowbeliefs_p",
            "eupdatebel_s",
            "meinformagentstatus_p",
            "mereportplayerpercept_s",
            "eguidebugmessage_s",
            "perceiveclimaserver_h",
            "bel_currentRequestActionId_dat",
            "bel_currentPosition_dat",
            "bel_numCarryingGold_dat",
            "consoleIface"};
    private final static java.lang.String[] __planVariableTypes = {
            "String",
            "EShowBeliefs",
            "rmit.ai.clima.jackagt.events.EUpdateBel",
            "MEInformAgentStatus",
            "MEReportPlayerPercept",
            "EGUIDebugMessage",
            "rmit.ai.clima.iface.PerceiveClimaServer",
            "rmit.ai.clima.jackagt.data.CurrentRequestActionId",
            "rmit.ai.clima.jackagt.data.BCurrentPosition",
            "rmit.ai.clima.jackagt.data.BNumCarryingGold",
            "rmit.ai.clima.interfaces.DebugInterface"};
    private final static java.lang.String[] __reasoningMethods = {
            "body",
            "fail"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "reqAction",
            "id",
            "step",
            "items",
            "posX",
            "posY",
            "currentPos",
            "cells",
            "$locationX",
            "$locationY",
            "$noGold"};
    private final static java.lang.String[] __fsmTypes_body = {
            "RequestAction",
            "int",
            "int",
            "int",
            "int",
            "int",
            "GridPoint",
            "Cell[]",
            "logical int",
            "logical int",
            "logical int"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__16_0",
            "__local__16_1",
            "__local__16_2",
            "__local__16_3",
            "__local__16_4",
            "__local__16_5",
            "__local__16_6",
            "__local__16_7",
            "__local__16_8",
            "__local__16_9",
            "__local__16_10"};
    // The ID of the plan (for printing)	

    static boolean relevant(rmit.ai.clima.iface.PerceiveClimaServer ev)
    {
        // the PerceiveClimaServer event is a RequestAction            

        return ev.data instanceof rmit.ai.clima.comms.RequestAction;
    }
    
    public HandlePercept()
    {
    }
    
    private HandlePercept(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.HandlePercept __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        eshowbeliefs_p = __env.eshowbeliefs_p;
        eupdatebel_s = __env.eupdatebel_s;
        meinformagentstatus_p = __env.meinformagentstatus_p;
        mereportplayerpercept_s = __env.mereportplayerpercept_s;
        eguidebugmessage_s = __env.eguidebugmessage_s;
        perceiveclimaserver_h = __env.perceiveclimaserver_h;
        bel_currentRequestActionId_dat = __env.bel_currentRequestActionId_dat;
        bel_currentPosition_dat = __env.bel_currentPosition_dat;
        bel_numCarryingGold_dat = __env.bel_numCarryingGold_dat;
        consoleIface = (rmit.ai.clima.interfaces.DebugInterface) __ns.getIF(rmit.ai.clima.interfaces.DebugInterface.class);
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        eshowbeliefs_p = (rmit.ai.clima.jackagt.events.EShowBeliefs) __a.findEvent("rmit.ai.clima.jackagt.events.EShowBeliefs");
        if (eshowbeliefs_p == null) {
            warning("Failed to find EShowBeliefs eshowbeliefs_p");
            return false;
        }
        eupdatebel_s = (rmit.ai.clima.jackagt.events.EUpdateBel) __a.findEvent("rmit.ai.clima.jackagt.events.EUpdateBel");
        if (eupdatebel_s == null) {
            warning("Failed to find EUpdateBel eupdatebel_s");
            return false;
        }
        meinformagentstatus_p = (rmit.ai.clima.jackagt.events.MEInformAgentStatus) __a.findEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus");
        if (meinformagentstatus_p == null) {
            warning("Failed to find MEInformAgentStatus meinformagentstatus_p");
            return false;
        }
        mereportplayerpercept_s = (rmit.ai.clima.jackagt.events.MEReportPlayerPercept) __a.findEvent("rmit.ai.clima.jackagt.events.MEReportPlayerPercept");
        if (mereportplayerpercept_s == null) {
            warning("Failed to find MEReportPlayerPercept mereportplayerpercept_s");
            return false;
        }
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) __a.findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        if (eguidebugmessage_s == null) {
            warning("Failed to find EGUIDebugMessage eguidebugmessage_s");
            return false;
        }
        perceiveclimaserver_h = (rmit.ai.clima.iface.PerceiveClimaServer) __a.findEvent("rmit.ai.clima.iface.PerceiveClimaServer");
        if (perceiveclimaserver_h == null) {
            warning("Failed to find PerceiveClimaServer perceiveclimaserver_h");
            return false;
        }
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) lookupNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_currentRequestActionId_dat == null) {
            warning("Failed to find CurrentRequestActionId bel_currentRequestActionId_dat");
            return false;
        }
        bel_currentPosition_dat = (rmit.ai.clima.jackagt.data.BCurrentPosition) lookupNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.BCurrentPosition",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_currentPosition_dat == null) {
            warning("Failed to find BCurrentPosition bel_currentPosition_dat");
            return false;
        }
        bel_numCarryingGold_dat = (rmit.ai.clima.jackagt.data.BNumCarryingGold) lookupNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.BNumCarryingGold",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_numCarryingGold_dat == null) {
            warning("Failed to find BNumCarryingGold bel_numCarryingGold_dat");
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
    
    public aos.jack.jak.plan.PlanFSM fail()
    {
        return new rmit.ai.clima.jackagt.plans.HandlePercept.__failFSM();
    }
    
    public aos.jack.jak.plan.PlanFSM body()
    {
        return new rmit.ai.clima.jackagt.plans.HandlePercept.__bodyFSM();
    }
    
    private HandlePercept(rmit.ai.clima.iface.PerceiveClimaServer __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.HandlePercept __env)
    {
        this(__t,__env);
        this.perceiveclimaserver_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return perceiveclimaserver_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.iface.PerceiveClimaServer";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled() && relevant(((rmit.ai.clima.iface.PerceiveClimaServer) __e));
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.iface.PerceiveClimaServer)) 
            return null;
        rmit.ai.clima.iface.PerceiveClimaServer __e1 = (rmit.ai.clima.iface.PerceiveClimaServer) __e;
        return new rmit.ai.clima.jackagt.plans.HandlePercept(__e1,__t,this);
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
                return aos.util.ToObject.box(eshowbeliefs_p);
            }
            case 2: 
            {
                return aos.util.ToObject.box(eupdatebel_s);
            }
            case 3: 
            {
                return aos.util.ToObject.box(meinformagentstatus_p);
            }
            case 4: 
            {
                return aos.util.ToObject.box(mereportplayerpercept_s);
            }
            case 5: 
            {
                return aos.util.ToObject.box(eguidebugmessage_s);
            }
            case 6: 
            {
                return aos.util.ToObject.box(perceiveclimaserver_h);
            }
            case 7: 
            {
                return aos.util.ToObject.box(bel_currentRequestActionId_dat);
            }
            case 8: 
            {
                return aos.util.ToObject.box(bel_currentPosition_dat);
            }
            case 9: 
            {
                return aos.util.ToObject.box(bel_numCarryingGold_dat);
            }
            case 10: 
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
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-HandlePercept.fail:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.HandlePercept.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("HandlePercept.fail: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (68)       consoleIface.showConsoleDebug(getPlanName(), "Plan has failed!");
                        case 10: 
                        {
                            __breakLevel = 0;
                            __state = 11;
                            consoleIface.showConsoleDebug(getPlanName(),"Plan has failed!");
                            break;
                        }
                        //* (65)    #reasoning method
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
            return rmit.ai.clima.jackagt.plans.HandlePercept.this;
        }
        
        public void enter()
        {
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.HandlePercept.fail");
        }
        
    }
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        rmit.ai.clima.comms.RequestAction __local__16_0;
        int __local__16_1;
        int __local__16_2;
        int __local__16_3;
        int __local__16_4;
        int __local__16_5;
        rmit.ai.clima.gui.grid.GridPoint __local__16_6;
        rmit.ai.clima.comms.Cell[] __local__16_7;
        aos.jack.jak.logic.IntegerVariable __local__16_8;
        aos.jack.jak.logic.IntegerVariable __local__16_9;
        aos.jack.jak.logic.IntegerVariable __local__16_10;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-HandlePercept.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.HandlePercept.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("HandlePercept.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (76)       RequestAction reqAction = (RequestAction)perceiveclimaserver_h.data;
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__16_0 = (rmit.ai.clima.comms.RequestAction) perceiveclimaserver_h.data;
                            __state = 11;
                            break;
                        }
                        //* (79)       int id = Integer.parseInt(reqAction.id.trim());	// unique ID of the request-action package
                        case 11: 
                        {
                            __local__16_1 = java.lang.Integer.parseInt(__local__16_0.id.trim());
                            __state = 12;
                            break;
                        }
                        //* (80)       int step = reqAction.step;	// step number within this simulation (id may be much larger)
                        case 12: 
                        {
                            __local__16_2 = __local__16_0.step;
                            __state = 13;
                            break;
                        }
                        //* (81)       int items = reqAction.items;    // if items<0 then no information on perceiveclimaserver_h message
                        case 13: 
                        {
                            __local__16_3 = __local__16_0.items;
                            __state = 14;
                            break;
                        }
                        //* (82)       int posX = reqAction.posx;
                        case 14: 
                        {
                            __local__16_4 = __local__16_0.posx;
                            __state = 15;
                            break;
                        }
                        //* (83)       int posY = reqAction.posy;
                        case 15: 
                        {
                            __local__16_5 = __local__16_0.posy;
                            __state = 16;
                            break;
                        }
                        //* (84)       GridPoint currentPos = new GridPoint(posX, posY);
                        case 16: 
                        {
                            __local__16_6 = new rmit.ai.clima.gui.grid.GridPoint(__local__16_4,__local__16_5);
                            __state = 17;
                            break;
                        }
                        //* (85)       Cell[] cells = reqAction.cells;	// the cells around
                        case 17: 
                        {
                            __local__16_7 = __local__16_0.cells;
                            __state = 18;
                            break;
                        }
                        //* (100)       logical int $locationX, $locationY;
                        case 18: 
                        {
                            __local__16_8 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__16_9 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 19;
                            break;
                        }
                        //* (104)       if(bel_currentPosition_dat.get($locationX,$locationY) && ($locationX.as_int() != posX || $locationY.as_int() != posY))
                        case 19: 
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
                                __state = 20;
                             else 
                                __state = 21;
                            break;
                        }
                        //* (106)          bel_currentPosition_dat.add(posX,posY);
                        case 20: 
                        {
                            __breakLevel = 2;
                            __state = 21;
                            bel_currentPosition_dat.add(__local__16_4,__local__16_5);
                            break;
                        }
                        //* (110)       logical int $noGold;
                        case 21: 
                        {
                            __local__16_10 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 22;
                            break;
                        }
                        //* (111)       bel_numCarryingGold_dat.get($noGold);
                        case 22: 
                        {
                            boolean __b;
                            aos.jack.jak.cursor.Cursor __c = null;
                            try {
                                __c = genCursor(2);
                                __b = __c.next();
                            }
                            finally {
                                if (__c != null) 
                                    __c.finished();
                            }
                            if (__b) 
                                __state = 23;
                             else 
                                throw planfailed;
                            break;
                        }
                        //* (112)       if($noGold.as_int() != items)
                        case 23: 
                        {
                            if (__local__16_10.as_int() != __local__16_3) 
                                __state = 24;
                             else 
                                __state = 25;
                            break;
                        }
                        //* (114)          bel_numCarryingGold_dat.add(items);
                        case 24: 
                        {
                            __breakLevel = 2;
                            __state = 25;
                            bel_numCarryingGold_dat.add(__local__16_3);
                            break;
                        }
                        //* (121)       @subtask( eupdatebel_s.post(id, currentPos, cells, items) );
                        case 25: 
                        {
                            __task.push(eupdatebel_s.post(__local__16_1,__local__16_6,__local__16_7,__local__16_3));
                            __state = -__state;
                            __subtask_pass = 26;
                            __subtask_fail = 4;
                            return SUBTASK;
                        }
                        //* (133)       @send("gui", meinformagentstatus_p.post(currentPos, items, id) );
                        case 26: 
                        {
                            __state = 27;
                            agent.send("gui",meinformagentstatus_p.post(__local__16_6,__local__16_3,__local__16_1));
                            break;
                        }
                        //* (142)       @send("gui", eguidebugmessage_s.reportMessage(ID, "Step: "+ id + " - Location: " + GridPoint.toString(currentPos) + " - Gold: " + items) );
                        case 27: 
                        {
                            __state = 28;
                            agent.send("gui",eguidebugmessage_s.reportMessage(ID,"Step: " + __local__16_1 + " - Location: " + rmit.ai.clima.gui.grid.GridPoint.toString(__local__16_6) + " - Gold: " + __local__16_3));
                            break;
                        }
                        //* (146)       @send( "boss", mereportplayerpercept_s.send( id, currentPos, cells, items, getAgent().name() ));
                        case 28: 
                        {
                            __state = 29;
                            agent.send("boss",mereportplayerpercept_s.send(__local__16_1,__local__16_6,__local__16_7,__local__16_3,getAgent().name()));
                            break;
                        }
                        //* (149)       @post( eshowbeliefs_p.show() );
                        case 29: 
                        {
                            __state = 30;
                            agent.postEvent(eshowbeliefs_p.show());
                            break;
                        }
                        //* (154)       bel_currentRequestActionId_dat.add(id,step);
                        case 30: 
                        {
                            __state = 31;
                            // Update beliefset with the request action id from the incoming percept
// (this needs to be updated last as it will trigger the next round of actions, see SendActionAndWait plan)

                            bel_currentRequestActionId_dat.add(__local__16_1,__local__16_2);
                            break;
                        }
                        //* (72)    #reasoning method
                        case 31: 
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
                    return (bel_currentPosition_dat.get(__local__16_8,__local__16_9));
                }
                case 1: 
                {
                    return (new aos.jack.jak.cursor.BinaryBoolOp(this,__logic,aos.jack.jak.cursor.BinaryBoolOp.AND,(short) 0,true,(short) 0,false));
                }
                case 2: 
                {
                    return (bel_numCarryingGold_dat.get(__local__16_10));
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
                    return ((__local__16_8.as_int() != __local__16_4 || __local__16_9.as_int() != __local__16_5));
                }
            }
            aos.jack.jak.core.Jak.error("illegal test Construction");
            return false;
        }
        
        public aos.jack.jak.plan.Plan getPlan()
        {
            return rmit.ai.clima.jackagt.plans.HandlePercept.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.HandlePercept.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__16_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__16_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__16_2);
                }
                case 3: 
                {
                    return aos.util.ToObject.box(__local__16_3);
                }
                case 4: 
                {
                    return aos.util.ToObject.box(__local__16_4);
                }
                case 5: 
                {
                    return aos.util.ToObject.box(__local__16_5);
                }
                case 6: 
                {
                    return aos.util.ToObject.box(__local__16_6);
                }
                case 7: 
                {
                    return aos.util.ToObject.box(__local__16_7);
                }
                case 8: 
                {
                    return aos.util.ToObject.box(__local__16_8);
                }
                case 9: 
                {
                    return aos.util.ToObject.box(__local__16_9);
                }
                case 10: 
                {
                    return aos.util.ToObject.box(__local__16_10);
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
