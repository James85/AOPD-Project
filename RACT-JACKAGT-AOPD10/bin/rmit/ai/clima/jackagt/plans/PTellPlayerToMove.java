/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.plans;
import aos.jack.jak.plan.Plan;
import aos.jack.jak.plan.PlanFSM;
import aos.jack.jak.plan.PlanInstanceInfo;
import aos.jack.jak.plan.ExMap;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.event.Event;
import aos.jack.jak.task.Task;
import aos.jack.jak.core.Generator;
import aos.jack.jak.logic.Signature;
import rmit.ai.clima.jackagt.events.EFindPath;
import rmit.ai.clima.jackagt.events.MEPlayerAction;
import rmit.ai.clima.jackagt.events.EFindClosestGold;
import rmit.ai.clima.jackagt.events.EPostPlayerAction;
import rmit.ai.clima.jackagt.data.BGoldAt;
import rmit.ai.clima.jackagt.data.BPlayerPosition;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.jackagt.data.BPlayerGold;
import rmit.ai.clima.jackagt.data.BMoveHint;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class PTellPlayerToMove extends aos.jack.jak.plan.Plan {
    aos.jack.jak.logic.IntegerVariable $goldX;
    aos.jack.jak.logic.IntegerVariable $goldY;
    aos.jack.jak.logic.IntegerVariable $playerX;
    aos.jack.jak.logic.IntegerVariable $playerY;
    aos.jack.jak.logic.IntegerVariable $depotX;
    aos.jack.jak.logic.IntegerVariable $depotY;
    aos.jack.jak.logic.IntegerVariable $targetX;
    aos.jack.jak.logic.IntegerVariable $targetY;
    aos.jack.jak.logic.IntegerVariable $numGold;
    public rmit.ai.clima.jackagt.events.EFindPath efindpath_p;
    public rmit.ai.clima.jackagt.events.MEPlayerAction meplayeraction_s;
    public rmit.ai.clima.jackagt.events.EFindClosestGold efindclosestgold_p;
    public rmit.ai.clima.jackagt.events.EPostPlayerAction epostplayeraction_h;
    public rmit.ai.clima.jackagt.data.BGoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.BPlayerPosition bel_playerPositions_dat;
    public rmit.ai.clima.jackagt.data.BPlayerPosition bel_playerTarget_dat;
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public rmit.ai.clima.jackagt.data.BPlayerGold bel_playerGold_dat;
    public rmit.ai.clima.jackagt.data.BMoveHint bel_moveHint_dat;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/PTellPlayerToMove.plan",
            "body",
            "46",
            "47",
            "49",
            "50",
            "52",
            "54",
            "55",
            "56",
            "43"};
    private final static java.lang.String[] __planVariableNames = {
            "$goldX",
            "$goldY",
            "$playerX",
            "$playerY",
            "$depotX",
            "$depotY",
            "$targetX",
            "$targetY",
            "$numGold",
            "efindpath_p",
            "meplayeraction_s",
            "efindclosestgold_p",
            "epostplayeraction_h",
            "bel_goldAt_dat",
            "bel_playerPositions_dat",
            "bel_playerTarget_dat",
            "bel_simulationProp_dat",
            "bel_playerGold_dat",
            "bel_moveHint_dat"};
    private final static java.lang.String[] __planVariableTypes = {
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "aos.jack.jak.logic.IntegerVariable",
            "aos.jack.jak.logic.IntegerVariable",
            "logical int",
            "rmit.ai.clima.jackagt.events.EFindPath",
            "MEPlayerAction",
            "EFindClosestGold",
            "rmit.ai.clima.jackagt.events.EPostPlayerAction",
            "BGoldAt",
            "rmit.ai.clima.jackagt.data.BPlayerPosition",
            "BPlayerPosition",
            "SimulationProp",
            "BPlayerGold",
            "rmit.ai.clima.jackagt.data.BMoveHint"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __logSignatureVariableNames = {
            "$goldX",
            "$goldY",
            "$playerX",
            "$playerY",
            "$depotX",
            "$depotY",
            "$targetX",
            "$targetY",
            "$numGold"};
    private final static java.lang.String[] __logSignatureVariableTypes = {
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "aos.jack.jak.logic.IntegerVariable",
            "aos.jack.jak.logic.IntegerVariable",
            "logical int"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "$x",
            "$y",
            "baseName",
            "$targetMove"};
    private final static java.lang.String[] __fsmTypes_body = {
            "logical int",
            "logical int",
            "String",
            "logical String"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__29_0",
            "__local__29_1",
            "__local__29_2",
            "__local__29_3"};
    public aos.jack.jak.plan.PlanInstanceInfo getInstanceInfo()
    {
        return aos.jack.jak.plan.PlanInstanceInfo.def[4];
    }
    
    public PTellPlayerToMove()
    {
    }
    
    private PTellPlayerToMove(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.PTellPlayerToMove __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        efindpath_p = __env.efindpath_p;
        meplayeraction_s = __env.meplayeraction_s;
        efindclosestgold_p = __env.efindclosestgold_p;
        epostplayeraction_h = __env.epostplayeraction_h;
        bel_goldAt_dat = __env.bel_goldAt_dat;
        bel_playerPositions_dat = __env.bel_playerPositions_dat;
        bel_playerTarget_dat = __env.bel_playerTarget_dat;
        bel_simulationProp_dat = __env.bel_simulationProp_dat;
        bel_playerGold_dat = __env.bel_playerGold_dat;
        bel_moveHint_dat = __env.bel_moveHint_dat;
        $goldX = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $goldY = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $playerX = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $playerY = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $depotX = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $depotY = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $targetX = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $targetY = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $numGold = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        efindpath_p = (rmit.ai.clima.jackagt.events.EFindPath) __a.findEvent("rmit.ai.clima.jackagt.events.EFindPath");
        if (efindpath_p == null) {
            warning("Failed to find EFindPath efindpath_p");
            return false;
        }
        meplayeraction_s = (rmit.ai.clima.jackagt.events.MEPlayerAction) __a.findEvent("rmit.ai.clima.jackagt.events.MEPlayerAction");
        if (meplayeraction_s == null) {
            warning("Failed to find MEPlayerAction meplayeraction_s");
            return false;
        }
        efindclosestgold_p = (rmit.ai.clima.jackagt.events.EFindClosestGold) __a.findEvent("rmit.ai.clima.jackagt.events.EFindClosestGold");
        if (efindclosestgold_p == null) {
            warning("Failed to find EFindClosestGold efindclosestgold_p");
            return false;
        }
        epostplayeraction_h = (rmit.ai.clima.jackagt.events.EPostPlayerAction) __a.findEvent("rmit.ai.clima.jackagt.events.EPostPlayerAction");
        if (epostplayeraction_h == null) {
            warning("Failed to find EPostPlayerAction epostplayeraction_h");
            return false;
        }
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.BGoldAt) lookupNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt",0);
        if (bel_goldAt_dat == null) {
            warning("Failed to find BGoldAt bel_goldAt_dat");
            return false;
        }
        bel_playerPositions_dat = (rmit.ai.clima.jackagt.data.BPlayerPosition) lookupNamedObject("bel_playerPositions_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",0);
        if (bel_playerPositions_dat == null) {
            warning("Failed to find BPlayerPosition bel_playerPositions_dat");
            return false;
        }
        bel_playerTarget_dat = (rmit.ai.clima.jackagt.data.BPlayerPosition) lookupNamedObject("bel_playerTarget_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",0);
        if (bel_playerTarget_dat == null) {
            warning("Failed to find BPlayerPosition bel_playerTarget_dat");
            return false;
        }
        bel_simulationProp_dat = (rmit.ai.clima.jackagt.data.SimulationProp) lookupNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",0);
        if (bel_simulationProp_dat == null) {
            warning("Failed to find SimulationProp bel_simulationProp_dat");
            return false;
        }
        bel_playerGold_dat = (rmit.ai.clima.jackagt.data.BPlayerGold) lookupNamedObject("bel_playerGold_dat","rmit.ai.clima.jackagt.data.BPlayerGold",0);
        if (bel_playerGold_dat == null) {
            warning("Failed to find BPlayerGold bel_playerGold_dat");
            return false;
        }
        bel_moveHint_dat = (rmit.ai.clima.jackagt.data.BMoveHint) lookupNamedObject("bel_moveHint_dat","rmit.ai.clima.jackagt.data.BMoveHint",0);
        if (bel_moveHint_dat == null) {
            warning("Failed to find BMoveHint bel_moveHint_dat");
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
                return (bel_playerTarget_dat.getByName(epostplayeraction_h.playerName,$targetX,$targetY));
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
    
    public aos.jack.jak.plan.PlanFSM body()
    {
        return new rmit.ai.clima.jackagt.plans.PTellPlayerToMove.__bodyFSM();
    }
    
    private PTellPlayerToMove(rmit.ai.clima.jackagt.events.EPostPlayerAction __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.PTellPlayerToMove __env)
    {
        this(__t,__env);
        this.epostplayeraction_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return epostplayeraction_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.EPostPlayerAction";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled();
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.EPostPlayerAction)) 
            return null;
        rmit.ai.clima.jackagt.events.EPostPlayerAction __e1 = (rmit.ai.clima.jackagt.events.EPostPlayerAction) __e;
        return new rmit.ai.clima.jackagt.plans.PTellPlayerToMove(__e1,__t,this);
    }
    
    protected aos.jack.jak.logic.Signature initSignature(int __log)
    {
        aos.jack.jak.logic.Signature __s = super.initSignature(__log + 9);
        __s.addLogical($goldX);
        __s.addLogical($goldY);
        __s.addLogical($playerX);
        __s.addLogical($playerY);
        __s.addLogical($depotX);
        __s.addLogical($depotY);
        __s.addLogical($targetX);
        __s.addLogical($targetY);
        __s.addLogical($numGold);
        return __s;
    }
    
    public void setFromSignature(aos.jack.jak.logic.Signature __s)
    {
        super.setFromSignature(__s);
        $goldX = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
        $goldY = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
        $playerX = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
        $playerY = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
        $depotX = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
        $depotY = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
        $targetX = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
        $targetY = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
        $numGold = (aos.jack.jak.logic.IntegerVariable) __s.getLogical();
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
                return aos.util.ToObject.box($goldX);
            }
            case 1: 
            {
                return aos.util.ToObject.box($goldY);
            }
            case 2: 
            {
                return aos.util.ToObject.box($playerX);
            }
            case 3: 
            {
                return aos.util.ToObject.box($playerY);
            }
            case 4: 
            {
                return aos.util.ToObject.box($depotX);
            }
            case 5: 
            {
                return aos.util.ToObject.box($depotY);
            }
            case 6: 
            {
                return aos.util.ToObject.box($targetX);
            }
            case 7: 
            {
                return aos.util.ToObject.box($targetY);
            }
            case 8: 
            {
                return aos.util.ToObject.box($numGold);
            }
            case 9: 
            {
                return aos.util.ToObject.box(efindpath_p);
            }
            case 10: 
            {
                return aos.util.ToObject.box(meplayeraction_s);
            }
            case 11: 
            {
                return aos.util.ToObject.box(efindclosestgold_p);
            }
            case 12: 
            {
                return aos.util.ToObject.box(epostplayeraction_h);
            }
            case 13: 
            {
                return aos.util.ToObject.box(bel_goldAt_dat);
            }
            case 14: 
            {
                return aos.util.ToObject.box(bel_playerPositions_dat);
            }
            case 15: 
            {
                return aos.util.ToObject.box(bel_playerTarget_dat);
            }
            case 16: 
            {
                return aos.util.ToObject.box(bel_simulationProp_dat);
            }
            case 17: 
            {
                return aos.util.ToObject.box(bel_playerGold_dat);
            }
            case 18: 
            {
                return aos.util.ToObject.box(bel_moveHint_dat);
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
            return (genCursor(0));
        }
        catch (java.lang.Exception e) {
            e.printStackTrace();
            return aos.jack.jak.cursor.Cursor.falseCursor;
        }
    }
    
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        aos.jack.jak.logic.IntegerVariable __local__29_0;
        aos.jack.jak.logic.IntegerVariable __local__29_1;
        java.lang.String __local__29_2;
        aos.jack.jak.logic.StringVariable __local__29_3;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-PTellPlayerToMove.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.PTellPlayerToMove.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("PTellPlayerToMove.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (46) 	   logical int $x, $y;
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__29_0 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__29_1 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 11;
                            break;
                        }
                        //* (47) 	   bel_playerPositions_dat.getByName( epostplayeraction_h.playerName, $x, $y );
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
                        //* (49) 	     String baseName = epostplayeraction_h.playerName;
                        case 12: 
                        {
                            __local__29_2 = epostplayeraction_h.playerName;
                            __state = 13;
                            break;
                        }
                        //* (50) 	      baseName = baseName.substring(0,baseName.indexOf("@"));
                        case 13: 
                        {
                            __state = 14;
                            __local__29_2 = __local__29_2.substring(0,__local__29_2.indexOf("@"));
                            break;
                        }
                        //* (52) 	   @subtask(efindpath_p.post( epostplayeraction_h.playerName, $x.as_int(), $y.as_int(), $targetX.as_int(), $targetY.as_int() ));
                        case 14: 
                        {
                            __task.push(efindpath_p.post(epostplayeraction_h.playerName,__local__29_0.as_int(),__local__29_1.as_int(),$targetX.as_int(),$targetY.as_int()));
                            __state = -__state;
                            __subtask_pass = 15;
                            __subtask_fail = 4;
                            return SUBTASK;
                        }
                        //* (54) 	   logical String $targetMove;
                        case 15: 
                        {
                            __local__29_3 = (aos.jack.jak.logic.StringVariable) __logic.new_variable(java.lang.String.class);
                            __state = 16;
                            break;
                        }
                        //* (55)       bel_moveHint_dat.getByEndPoints($x.as_int(), $y.as_int(), $targetX.as_int(), $targetY.as_int(), $targetMove );
                        case 16: 
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
                                __state = 17;
                             else 
                                throw planfailed;
                            break;
                        }
                        //* (56) 	   @send( baseName, meplayeraction_s.send( "moveTo", $targetMove.as_string() ));
                        case 17: 
                        {
                            __state = 18;
                            agent.send(__local__29_2,meplayeraction_s.send("moveTo",__local__29_3.as_string()));
                            break;
                        }
                        //* (43) 	body()
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
                    return (bel_playerPositions_dat.getByName(epostplayeraction_h.playerName,__local__29_0,__local__29_1));
                }
                case 1: 
                {
                    return (bel_moveHint_dat.getByEndPoints(__local__29_0.as_int(),__local__29_1.as_int(),$targetX.as_int(),$targetY.as_int(),__local__29_3));
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
            return rmit.ai.clima.jackagt.plans.PTellPlayerToMove.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.PTellPlayerToMove.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__29_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__29_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__29_2);
                }
                case 3: 
                {
                    return aos.util.ToObject.box(__local__29_3);
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
