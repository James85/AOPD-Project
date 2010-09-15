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
import rmit.ai.clima.jackagt.events.EFindPath;
import rmit.ai.clima.jackagt.events.EIdentifyTarget;
import rmit.ai.clima.jackagt.data.BPlayerPosition;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.jackagt.data.BObstacleAt;
import rmit.ai.clima.jackagt.data.BMoveHint;
import java.util.Random;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class PIdentifyExploreTarget extends aos.jack.jak.plan.Plan {
    public rmit.ai.clima.jackagt.events.EFindPath efindpath_p;
    public rmit.ai.clima.jackagt.events.EIdentifyTarget eidentifytarget_h;
    public rmit.ai.clima.jackagt.data.BPlayerPosition bel_playerTarget_dat;
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public rmit.ai.clima.jackagt.data.BObstacleAt bel_obstacleAt_dat;
    public rmit.ai.clima.jackagt.data.BPlayerPosition bel_playerPositions_dat;
    public rmit.ai.clima.jackagt.data.BMoveHint bel_moveHint_dat;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/PIdentifyExploreTarget.plan",
            "body",
            "41",
            "42",
            "45",
            "46",
            "48",
            "49",
            "49",
            "50",
            "49",
            "53",
            "54",
            "56",
            "59",
            "60",
            "62",
            "65",
            "66",
            "69",
            "70",
            "73",
            "76",
            "77",
            "78",
            "82",
            "83",
            "84",
            "88",
            "89",
            "90",
            "94",
            "94",
            "38"};
    private final static java.lang.String[] __planVariableNames = {
            "efindpath_p",
            "eidentifytarget_h",
            "bel_playerTarget_dat",
            "bel_simulationProp_dat",
            "bel_obstacleAt_dat",
            "bel_playerPositions_dat",
            "bel_moveHint_dat"};
    private final static java.lang.String[] __planVariableTypes = {
            "rmit.ai.clima.jackagt.events.EFindPath",
            "rmit.ai.clima.jackagt.events.EIdentifyTarget",
            "rmit.ai.clima.jackagt.data.BPlayerPosition",
            "rmit.ai.clima.jackagt.data.SimulationProp",
            "rmit.ai.clima.jackagt.data.BObstacleAt",
            "rmit.ai.clima.jackagt.data.BPlayerPosition",
            "rmit.ai.clima.jackagt.data.BMoveHint"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "$width",
            "$height",
            "$playerX",
            "$playerY",
            "visited",
            "i",
            "targetFound",
            "targetUnreachable",
            "rand",
            "r",
            "i",
            "x",
            "y",
            "$move"};
    private final static java.lang.String[] __fsmTypes_body = {
            "logical int",
            "logical int",
            "logical int",
            "logical int",
            "boolean[]",
            "int",
            "boolean",
            "boolean",
            "Random",
            "int",
            "int",
            "int",
            "int",
            "logical String"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__21_0",
            "__local__21_1",
            "__local__21_2",
            "__local__21_3",
            "__local__21_4",
            "__local__21_5",
            "__local__21_6",
            "__local__21_7",
            "__local__21_8",
            "__local__21_9",
            "__local__21_10",
            "__local__21_11",
            "__local__21_12",
            "__local__21_13"};
    public PIdentifyExploreTarget()
    {
    }
    
    private PIdentifyExploreTarget(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.PIdentifyExploreTarget __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        efindpath_p = __env.efindpath_p;
        eidentifytarget_h = __env.eidentifytarget_h;
        bel_playerTarget_dat = __env.bel_playerTarget_dat;
        bel_simulationProp_dat = __env.bel_simulationProp_dat;
        bel_obstacleAt_dat = __env.bel_obstacleAt_dat;
        bel_playerPositions_dat = __env.bel_playerPositions_dat;
        bel_moveHint_dat = __env.bel_moveHint_dat;
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        efindpath_p = (rmit.ai.clima.jackagt.events.EFindPath) __a.findEvent("rmit.ai.clima.jackagt.events.EFindPath");
        if (efindpath_p == null) {
            warning("Failed to find EFindPath efindpath_p");
            return false;
        }
        eidentifytarget_h = (rmit.ai.clima.jackagt.events.EIdentifyTarget) __a.findEvent("rmit.ai.clima.jackagt.events.EIdentifyTarget");
        if (eidentifytarget_h == null) {
            warning("Failed to find EIdentifyTarget eidentifytarget_h");
            return false;
        }
        bel_playerTarget_dat = (rmit.ai.clima.jackagt.data.BPlayerPosition) lookupNamedObject("bel_playerTarget_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_playerTarget_dat == null) {
            warning("Failed to find BPlayerPosition bel_playerTarget_dat");
            return false;
        }
        bel_simulationProp_dat = (rmit.ai.clima.jackagt.data.SimulationProp) lookupNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",0);
        if (bel_simulationProp_dat == null) {
            warning("Failed to find SimulationProp bel_simulationProp_dat");
            return false;
        }
        bel_obstacleAt_dat = (rmit.ai.clima.jackagt.data.BObstacleAt) lookupNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",0);
        if (bel_obstacleAt_dat == null) {
            warning("Failed to find BObstacleAt bel_obstacleAt_dat");
            return false;
        }
        bel_playerPositions_dat = (rmit.ai.clima.jackagt.data.BPlayerPosition) lookupNamedObject("bel_playerPositions_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",0);
        if (bel_playerPositions_dat == null) {
            warning("Failed to find BPlayerPosition bel_playerPositions_dat");
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
        return new rmit.ai.clima.jackagt.plans.PIdentifyExploreTarget.__bodyFSM();
    }
    
    private PIdentifyExploreTarget(rmit.ai.clima.jackagt.events.EIdentifyTarget __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.PIdentifyExploreTarget __env)
    {
        this(__t,__env);
        this.eidentifytarget_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return eidentifytarget_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.EIdentifyTarget";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled();
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.EIdentifyTarget)) 
            return null;
        rmit.ai.clima.jackagt.events.EIdentifyTarget __e1 = (rmit.ai.clima.jackagt.events.EIdentifyTarget) __e;
        return new rmit.ai.clima.jackagt.plans.PIdentifyExploreTarget(__e1,__t,this);
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
                return aos.util.ToObject.box(efindpath_p);
            }
            case 1: 
            {
                return aos.util.ToObject.box(eidentifytarget_h);
            }
            case 2: 
            {
                return aos.util.ToObject.box(bel_playerTarget_dat);
            }
            case 3: 
            {
                return aos.util.ToObject.box(bel_simulationProp_dat);
            }
            case 4: 
            {
                return aos.util.ToObject.box(bel_obstacleAt_dat);
            }
            case 5: 
            {
                return aos.util.ToObject.box(bel_playerPositions_dat);
            }
            case 6: 
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
        aos.jack.jak.logic.IntegerVariable __local__21_1;
        aos.jack.jak.logic.IntegerVariable __local__21_2;
        aos.jack.jak.logic.IntegerVariable __local__21_3;
        boolean[] __local__21_4;
        int __local__21_5;
        boolean __local__21_6;
        boolean __local__21_7;
        java.util.Random __local__21_8;
        int __local__21_9;
        int __local__21_10;
        int __local__21_11;
        int __local__21_12;
        aos.jack.jak.logic.StringVariable __local__21_13;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-PIdentifyExploreTarget.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.PIdentifyExploreTarget.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("PIdentifyExploreTarget.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (41)       logical int $width, $height;
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__21_0 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__21_1 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 11;
                            break;
                        }
                        //* (42)       bel_simulationProp_dat.getGridSize( $width, $height );
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
                        //* (45)       logical int $playerX, $playerY;
                        case 12: 
                        {
                            __local__21_2 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__21_3 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 13;
                            break;
                        }
                        //* (46)       bel_playerPositions_dat.getByName( eidentifytarget_h.playerName, $playerX, $playerY );
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
                        //* (48)       boolean[] visited = new boolean[ $width.as_int() * $height.as_int() ];
                        case 14: 
                        {
                            __local__21_4 = new boolean[__local__21_0.as_int() * __local__21_1.as_int()];
                            __state = 15;
                            break;
                        }
                        //* (49)       for (int i=0; i < $width.as_int() * $height.as_int(); ++i)
                        case 15: 
                        {
                            __local__21_5 = 0;
                            __state = 16;
                            break;
                        }
                        //* (49)       for (int i=0; i < $width.as_int() * $height.as_int(); ++i)
                        case 16: 
                        {
                            if (__local__21_5 < __local__21_0.as_int() * __local__21_1.as_int()) 
                                __state = 17;
                             else 
                                __state = 19;
                            break;
                        }
                        //* (50)          visited[i] = false;
                        case 17: 
                        {
                            __breakLevel = 2;
                            __state = 18;
                            __local__21_4[__local__21_5] = false;
                            break;
                        }
                        //* (49)       for (int i=0; i < $width.as_int() * $height.as_int(); ++i)
                        case 18: 
                        {
                            __state = 16;
                            ++__local__21_5;
                            break;
                        }
                        //* (53)       boolean targetFound = false;
                        case 19: 
                        {
                            __local__21_6 = false;
                            __state = 20;
                            break;
                        }
                        //* (54)       boolean targetUnreachable = false;
                        case 20: 
                        {
                            __local__21_7 = false;
                            __state = 21;
                            break;
                        }
                        //* (56)       while(!targetFound && !targetUnreachable)
                        case 21: 
                        {
                            if (!__local__21_6 && !__local__21_7) 
                                __state = 22;
                             else 
                                __state = 41;
                            break;
                        }
                        //* (59)          Random rand = new Random();
                        case 22: 
                        {
                            __breakLevel = 4;
                            __local__21_8 = new java.util.Random();
                            __state = 23;
                            break;
                        }
                        //* (60)          int r = rand.nextInt( $width.as_int() * $height.as_int() );
                        case 23: 
                        {
                            __local__21_9 = __local__21_8.nextInt(__local__21_0.as_int() * __local__21_1.as_int());
                            __state = 24;
                            break;
                        }
                        //* (62)          targetUnreachable = false;
                        case 24: 
                        {
                            __state = 25;
                            //         System.out.println("RANDOM NUMBER WAS: "+ r);

                            __local__21_7 = false;
                            break;
                        }
                        //* (65)          int i = r+1;
                        case 25: 
                        {
                            __local__21_10 = __local__21_9 + 1;
                            __state = 26;
                            break;
                        }
                        //* (66)          while(i != r)
                        case 26: 
                        {
                            if (__local__21_10 != __local__21_9) 
                                __state = 27;
                             else 
                                __state = 21;
                            break;
                        }
                        //* (69)             int x = i % $width.as_int();
                        case 27: 
                        {
                            __breakLevel = 8;
                            __local__21_11 = __local__21_10 % __local__21_0.as_int();
                            __state = 28;
                            break;
                        }
                        //* (70)             int y = (i - x) / $width.as_int();
                        case 28: 
                        {
                            __local__21_12 = (__local__21_10 - __local__21_11) / __local__21_0.as_int();
                            __state = 29;
                            break;
                        }
                        //* (73)             if(bel_obstacleAt_dat.checkUnknown(x,y) && visited[i] == false)
                        case 29: 
                        {
                            if (bel_obstacleAt_dat.checkUnknown(__local__21_11,__local__21_12) && __local__21_4[__local__21_10] == false) 
                                __state = 30;
                             else 
                                __state = 39;
                            break;
                        }
                        //* (76)                logical String $move;
                        case 30: 
                        {
                            __breakLevel = 10;
                            __local__21_13 = (aos.jack.jak.logic.StringVariable) __logic.new_variable(java.lang.String.class);
                            __state = 31;
                            break;
                        }
                        //* (77)                @subtask(efindpath_p.post( eidentifytarget_h.playerName, $playerX.as_int(), $playerY.as_int(), x, y ));
                        case 31: 
                        {
                            __task.push(efindpath_p.post(eidentifytarget_h.playerName,__local__21_2.as_int(),__local__21_3.as_int(),__local__21_11,__local__21_12));
                            __state = -__state;
                            __subtask_pass = 32;
                            __subtask_fail = 4;
                            return SUBTASK;
                        }
                        //* (78)                if (bel_moveHint_dat.getByEndPoints($playerX.as_int(), $playerY.as_int(), x, y, $move ))
                        case 32: 
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
                                __state = 33;
                             else 
                                __state = 36;
                            break;
                        }
                        //* (82)                   bel_playerTarget_dat.add( eidentifytarget_h.playerName, x, y);
                        case 33: 
                        {
                            __breakLevel = 12;
                            __state = 34;
                            //Store the player target
//                  System.out.println("I AM GOING TO EXPLORE " + x + ", " + y);

                            bel_playerTarget_dat.add(eidentifytarget_h.playerName,__local__21_11,__local__21_12);
                            break;
                        }
                        //* (83)                   targetFound = true;
                        case 34: 
                        {
                            __state = 35;
                            __local__21_6 = true;
                            break;
                        }
                        //* (84)                   break;
                        case 35: 
                        {
                            __breakLevel = 6;
                            __state = 21;
                            break;
                        }
                        //* (88)                visited[i] = true;
                        case 36: 
                        {
                            __state = 37;
                            //Mark as visited

                            __local__21_4[__local__21_10] = true;
                            break;
                        }
                        //* (89)                targetUnreachable = true;
                        case 37: 
                        {
                            __state = 38;
                            __local__21_7 = true;
                            break;
                        }
                        //* (90)                break;
                        case 38: 
                        {
                            __breakLevel = 6;
                            __state = 21;
                            break;
                        }
                        //* (94)             if (++i == $width.as_int() * $height.as_int() ) i = 0;
                        case 39: 
                        {
                            if (++__local__21_10 == __local__21_0.as_int() * __local__21_1.as_int()) 
                                __state = 40;
                             else 
                                __state = 26;
                            break;
                        }
                        //* (94)             if (++i == $width.as_int() * $height.as_int() ) i = 0;
                        case 40: 
                        {
                            __state = 26;
                            __local__21_10 = 0;
                            break;
                        }
                        //* (38)    body()
                        case 41: 
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
                    return (bel_simulationProp_dat.getGridSize(__local__21_0,__local__21_1));
                }
                case 1: 
                {
                    return (bel_playerPositions_dat.getByName(eidentifytarget_h.playerName,__local__21_2,__local__21_3));
                }
                case 2: 
                {
                    return (bel_moveHint_dat.getByEndPoints(__local__21_2.as_int(),__local__21_3.as_int(),__local__21_11,__local__21_12,__local__21_13));
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
            return rmit.ai.clima.jackagt.plans.PIdentifyExploreTarget.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.PIdentifyExploreTarget.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__21_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__21_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__21_2);
                }
                case 3: 
                {
                    return aos.util.ToObject.box(__local__21_3);
                }
                case 4: 
                {
                    return aos.util.ToObject.box(__local__21_4);
                }
                case 5: 
                {
                    return aos.util.ToObject.box(__local__21_5);
                }
                case 6: 
                {
                    return aos.util.ToObject.box(__local__21_6);
                }
                case 7: 
                {
                    return aos.util.ToObject.box(__local__21_7);
                }
                case 8: 
                {
                    return aos.util.ToObject.box(__local__21_8);
                }
                case 9: 
                {
                    return aos.util.ToObject.box(__local__21_9);
                }
                case 10: 
                {
                    return aos.util.ToObject.box(__local__21_10);
                }
                case 11: 
                {
                    return aos.util.ToObject.box(__local__21_11);
                }
                case 12: 
                {
                    return aos.util.ToObject.box(__local__21_12);
                }
                case 13: 
                {
                    return aos.util.ToObject.box(__local__21_13);
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
