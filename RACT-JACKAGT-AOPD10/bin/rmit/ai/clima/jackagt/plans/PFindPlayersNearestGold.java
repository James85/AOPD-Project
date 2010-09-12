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
import java.lang.Object;
import rmit.ai.clima.jackagt.events.EFindClosestGold;
import rmit.ai.clima.jackagt.data.BPlayerClosestGold;
import rmit.ai.clima.jackagt.data.BPlayer;
import rmit.ai.clima.jackagt.data.BPlayerPosition;
import rmit.ai.clima.jackagt.data.BGoldAt;
import java.util.Vector;
import rmit.ai.clima.gui.grid.GridPoint;
import java.util.Collections;
import aos.jack.jak.fsm.FSM;
import aos.jack.jak.core.Jak;

public class PFindPlayersNearestGold extends aos.jack.jak.plan.Plan {
    public rmit.ai.clima.jackagt.events.EFindClosestGold efindclosestgold_h;
    public rmit.ai.clima.jackagt.data.BPlayerClosestGold bel_playerClosestGold_dat;
    public rmit.ai.clima.jackagt.data.BPlayer bel_players_dat;
    public rmit.ai.clima.jackagt.data.BPlayerPosition bel_playerPositions_dat;
    public rmit.ai.clima.jackagt.data.BGoldAt bel_goldAt_dat;
    private static aos.jack.jak.plan.ExMap[] __exMap_body;
    private static java.lang.String[] __tt__body = {
            "rmit/ai/clima/jackagt/plans/PFindPlayersNearestGold.plan",
            "body",
            "39",
            "40",
            "41",
            "43",
            "45",
            "49",
            "50",
            "53",
            "54",
            "55",
            "57",
            "58",
            "60",
            "62",
            "63",
            "64",
            "65",
            "66",
            "68",
            "71",
            "72",
            "76",
            "79",
            "79",
            "82",
            "83",
            "84",
            "84",
            "86",
            "87",
            "88",
            "84",
            "90",
            "91",
            "93",
            "94",
            "79",
            "36"};
    private final static java.lang.String[] __planVariableNames = {
            "efindclosestgold_h",
            "bel_playerClosestGold_dat",
            "bel_players_dat",
            "bel_playerPositions_dat",
            "bel_goldAt_dat"};
    private final static java.lang.String[] __planVariableTypes = {
            "EFindClosestGold",
            "rmit.ai.clima.jackagt.data.BPlayerClosestGold",
            "rmit.ai.clima.jackagt.data.BPlayer",
            "rmit.ai.clima.jackagt.data.BPlayerPosition",
            "rmit.ai.clima.jackagt.data.BGoldAt"};
    private final static java.lang.String[] __reasoningMethods = {
            "body"};
    private final static java.lang.String[] __fsmVariableNames_body = {
            "distances",
            "playerAssigned",
            "usedDistances",
            "$name",
            "c_player",
            "playerId",
            "$playerX",
            "$playerY",
            "playerPos",
            "$goldX",
            "$goldY",
            "c_gold",
            "pg",
            "i",
            "b_discard",
            "pg",
            "j",
            "pg2"};
    private final static java.lang.String[] __fsmTypes_body = {
            "Vector",
            "boolean[]",
            "Vector",
            "logical String",
            "Cursor",
            "int",
            "logical int",
            "logical int",
            "GridPoint",
            "logical int",
            "logical int",
            "Cursor",
            "PlayerGold",
            "int",
            "boolean",
            "PlayerGold",
            "int",
            "PlayerGold"};
    private final static java.lang.String[] __fsmLocalNames_body = {
            "__local__20_0",
            "__local__20_1",
            "__local__20_2",
            "__local__20_3",
            "__local__20_4",
            "__local__20_5",
            "__local__20_6",
            "__local__20_7",
            "__local__20_8",
            "__local__20_9",
            "__local__20_10",
            "__local__20_11",
            "__local__20_12",
            "__local__20_13",
            "__local__20_14",
            "__local__20_15",
            "__local__20_16",
            "__local__20_17"};
    public PFindPlayersNearestGold()
    {
    }
    
    private PFindPlayersNearestGold(aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold __env)
    {
        __agent = __env.__agent;
        __ns = __env.__ns;
        __planTask = __t;
        __logic = __t.logic;
        efindclosestgold_h = __env.efindclosestgold_h;
        bel_playerClosestGold_dat = __env.bel_playerClosestGold_dat;
        bel_players_dat = __env.bel_players_dat;
        bel_playerPositions_dat = __env.bel_playerPositions_dat;
        bel_goldAt_dat = __env.bel_goldAt_dat;
    }
    
    public boolean init_sentinel(aos.jack.jak.agent.NameSpace __a)
    {
        efindclosestgold_h = (rmit.ai.clima.jackagt.events.EFindClosestGold) __a.findEvent("rmit.ai.clima.jackagt.events.EFindClosestGold");
        if (efindclosestgold_h == null) {
            warning("Failed to find EFindClosestGold efindclosestgold_h");
            return false;
        }
        bel_playerClosestGold_dat = (rmit.ai.clima.jackagt.data.BPlayerClosestGold) lookupNamedObject("bel_playerClosestGold_dat","rmit.ai.clima.jackagt.data.BPlayerClosestGold",aos.jack.jak.agent.Agent.WRITEABLE);
        if (bel_playerClosestGold_dat == null) {
            warning("Failed to find BPlayerClosestGold bel_playerClosestGold_dat");
            return false;
        }
        bel_players_dat = (rmit.ai.clima.jackagt.data.BPlayer) lookupNamedObject("bel_players_dat","rmit.ai.clima.jackagt.data.BPlayer",0);
        if (bel_players_dat == null) {
            warning("Failed to find BPlayer bel_players_dat");
            return false;
        }
        bel_playerPositions_dat = (rmit.ai.clima.jackagt.data.BPlayerPosition) lookupNamedObject("bel_playerPositions_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",0);
        if (bel_playerPositions_dat == null) {
            warning("Failed to find BPlayerPosition bel_playerPositions_dat");
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
        return new rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.__bodyFSM();
    }
    
    private PFindPlayersNearestGold(rmit.ai.clima.jackagt.events.EFindClosestGold __ev, aos.jack.jak.task.Task __t, rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold __env)
    {
        this(__t,__env);
        this.efindclosestgold_h = __ev;
    }
    
    protected aos.jack.jak.logic.Signature eventSignature(int __log)
    {
        return efindclosestgold_h.getSignature(__log);
    }
    
    public java.lang.String handledEvent()
    {
        return "rmit.ai.clima.jackagt.events.EFindClosestGold";
    }
    
    public boolean __relevant(aos.jack.jak.event.Event __e)
    {
        return __ns.isEnabled();
    }
    
    public aos.jack.jak.plan.Plan createPlan(aos.jack.jak.event.Event __e, aos.jack.jak.task.Task __t)
    {
        if (!(__e instanceof rmit.ai.clima.jackagt.events.EFindClosestGold)) 
            return null;
        rmit.ai.clima.jackagt.events.EFindClosestGold __e1 = (rmit.ai.clima.jackagt.events.EFindClosestGold) __e;
        return new rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold(__e1,__t,this);
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
                return aos.util.ToObject.box(efindclosestgold_h);
            }
            case 1: 
            {
                return aos.util.ToObject.box(bel_playerClosestGold_dat);
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
            return (((true)?aos.jack.jak.cursor.Cursor.trueCursor:aos.jack.jak.cursor.Cursor.falseCursor));
        }
        catch (java.lang.Exception e) {
            e.printStackTrace();
            return aos.jack.jak.cursor.Cursor.falseCursor;
        }
    }
    
    class PlayerGold extends java.lang.Object implements java.lang.Comparable {
        public int playerId;
        public java.lang.String name;
        public rmit.ai.clima.gui.grid.GridPoint pos;
        public int dist;
        public boolean equals(java.lang.Object obj)
        {
            rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.PlayerGold pg = (rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.PlayerGold) obj;
            return pg.dist == this.dist;
        }
        
        public int compareTo(java.lang.Object obj)
        {
            rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.PlayerGold pg = (rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.PlayerGold) obj;
            return (this.dist - pg.dist);
        }
        
    }
    class __bodyFSM extends aos.jack.jak.plan.PlanFSM implements aos.jack.jak.core.Generator {
        java.util.Vector __local__20_0;
        boolean[] __local__20_1;
        java.util.Vector __local__20_2;
        aos.jack.jak.logic.StringVariable __local__20_3;
        aos.jack.jak.cursor.Cursor __local__20_4;
        int __local__20_5;
        aos.jack.jak.logic.IntegerVariable __local__20_6;
        aos.jack.jak.logic.IntegerVariable __local__20_7;
        rmit.ai.clima.gui.grid.GridPoint __local__20_8;
        aos.jack.jak.logic.IntegerVariable __local__20_9;
        aos.jack.jak.logic.IntegerVariable __local__20_10;
        aos.jack.jak.cursor.Cursor __local__20_11;
        rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.PlayerGold __local__20_12;
        int __local__20_13;
        boolean __local__20_14;
        rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.PlayerGold __local__20_15;
        int __local__20_16;
        rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.PlayerGold __local__20_17;
        private int __breakLevel = 0;
        public int run(int __status)
            throws java.lang.Throwable
        {
            do {
                try {
                    if (__tothrow != null) 
                        throw __tothrow;
                    if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_PLANS) != 0) 
                        aos.util.logging.LogMsg.log(this,aos.jack.jak.core.Jak.LOG_PLANS,__task + "-PFindPlayersNearestGold.body:" + java.lang.Integer.toString(__state));
                    if (__task.nsteps > 0) {
                        __task.nsteps-- ;
                        if (__task.nsteps == 0) 
                            agent.changeFocus();
                    }
                    if (__state < 10) {
                        __status = super.stdrun(rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.this,__status);
                        if (__status != CONTINUE || agent.changing_focus) 
                            return __status;
                        continue;
                    }
                    __curstate = __state;
                    switch (__state) {
                        default: 
                        {
                            aos.jack.jak.core.Jak.error("PFindPlayersNearestGold.body: Illegal state");
                            return FAILED_STATE;
                        }
                        //* (39) 	   Vector distances = new Vector();
                        case 10: 
                        {
                            __breakLevel = 0;
                            __local__20_0 = new java.util.Vector();
                            __state = 11;
                            break;
                        }
                        //* (40) 	   boolean[] playerAssigned = new boolean[ bel_playerPositions_dat.nFacts() ]; 
                        case 11: 
                        {
                            __local__20_1 = new boolean[bel_playerPositions_dat.nFacts()];
                            __state = 12;
                            break;
                        }
                        //* (41) 	   Vector usedDistances = new Vector();
                        case 12: 
                        {
                            __local__20_2 = new java.util.Vector();
                            __state = 13;
                            break;
                        }
                        //* (43) 	   logical String $name;
                        case 13: 
                        {
                            __local__20_3 = (aos.jack.jak.logic.StringVariable) __logic.new_variable(java.lang.String.class);
                            __state = 14;
                            break;
                        }
                        //* (45) 	   Cursor c_player = bel_players_dat.get( $name );
                        case 14: 
                        {
                            __local__20_4 = (aos.jack.jak.cursor.Cursor) genCursor(0);
                            __state = 15;
                            break;
                        }
                        //* (49) 	   int playerId = 0;
                        case 15: 
                        {
                            __local__20_5 = 0;
                            __state = 16;
                            break;
                        }
                        //* (50) 	   while( c_player.next()  )
                        case 16: 
                        {
                            if (__local__20_4.next()) 
                                __state = 17;
                             else 
                                __state = 31;
                            break;
                        }
                        //* (53) 	      logical int $playerX, $playerY;
                        case 17: 
                        {
                            __breakLevel = 4;
                            __local__20_6 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__20_7 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 18;
                            break;
                        }
                        //* (54) 	      bel_playerPositions_dat.getByName( $name.as_string(), $playerX, $playerY );
                        case 18: 
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
                                __state = 19;
                             else 
                                throw planfailed;
                            break;
                        }
                        //* (55) 	      GridPoint playerPos = new GridPoint( $playerX.as_int(), $playerY.as_int() );
                        case 19: 
                        {
                            __local__20_8 = new rmit.ai.clima.gui.grid.GridPoint(__local__20_6.as_int(),__local__20_7.as_int());
                            __state = 20;
                            break;
                        }
                        //* (57) 	      logical int $goldX, $goldY;
                        case 20: 
                        {
                            __local__20_9 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __local__20_10 = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
                            __state = 21;
                            break;
                        }
                        //* (58) 	      Cursor c_gold = bel_goldAt_dat.get( $goldX, $goldY );
                        case 21: 
                        {
                            __local__20_11 = (aos.jack.jak.cursor.Cursor) genCursor(2);
                            __state = 22;
                            break;
                        }
                        //* (60) 	      while ( c_gold.next() )
                        case 22: 
                        {
                            if (__local__20_11.next()) 
                                __state = 23;
                             else 
                                __state = 29;
                            break;
                        }
                        //* (62) 	         PlayerGold pg = new PlayerGold();
                        case 23: 
                        {
                            __breakLevel = 8;
                            __local__20_12 = new rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.PlayerGold();
                            __state = 24;
                            break;
                        }
                        //* (63) 	         pg.pos = new GridPoint( $goldX.as_int(), $goldY.as_int() );
                        case 24: 
                        {
                            __state = 25;
                            __local__20_12.pos = new rmit.ai.clima.gui.grid.GridPoint(__local__20_9.as_int(),__local__20_10.as_int());
                            break;
                        }
                        //* (64) 	         pg.playerId = playerId;
                        case 25: 
                        {
                            __state = 26;
                            __local__20_12.playerId = __local__20_5;
                            break;
                        }
                        //* (65) 	         pg.name = $name.as_string();
                        case 26: 
                        {
                            __state = 27;
                            __local__20_12.name = __local__20_3.as_string();
                            break;
                        }
                        //* (66) 	         pg.dist = pg.pos.getManhattanDist(playerPos);
                        case 27: 
                        {
                            __state = 28;
                            __local__20_12.dist = __local__20_12.pos.getManhattanDist(__local__20_8);
                            break;
                        }
                        //* (68) 	         distances.add(pg);
                        case 28: 
                        {
                            if (__local__20_0.add(__local__20_12)) 
                                __state = 22;
                             else 
                                throw planfailed;
                            break;
                        }
                        //* (71) 	      playerAssigned[playerId] = false;
                        case 29: 
                        {
                            __state = 30;
                            __local__20_1[__local__20_5] = false;
                            break;
                        }
                        //* (72) 	      playerId++;
                        case 30: 
                        {
                            __state = 16;
                            __local__20_5++ ;
                            break;
                        }
                        //* (76) 	   Collections.sort(distances);
                        case 31: 
                        {
                            __state = 32;
                            java.util.Collections.sort(__local__20_0);
                            break;
                        }
                        //* (79) 	   for ( int i = 0; i < distances.size(); ++i )
                        case 32: 
                        {
                            __local__20_13 = 0;
                            __state = 33;
                            break;
                        }
                        //* (79) 	   for ( int i = 0; i < distances.size(); ++i )
                        case 33: 
                        {
                            if (__local__20_13 < __local__20_0.size()) 
                                __state = 34;
                             else 
                                __state = 47;
                            break;
                        }
                        //* (82) 	      boolean b_discard = false;
                        case 34: 
                        {
                            __breakLevel = 4;
                            __local__20_14 = false;
                            __state = 35;
                            break;
                        }
                        //* (83) 	      PlayerGold pg = (PlayerGold)distances.get(i);
                        case 35: 
                        {
                            __local__20_15 = (rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.PlayerGold) __local__20_0.get(__local__20_13);
                            __state = 36;
                            break;
                        }
                        //* (84) 	      for( int j = 0 ; j < usedDistances.size() ; ++ j)
                        case 36: 
                        {
                            __local__20_16 = 0;
                            __state = 37;
                            break;
                        }
                        //* (84) 	      for( int j = 0 ; j < usedDistances.size() ; ++ j)
                        case 37: 
                        {
                            if (__local__20_16 < __local__20_2.size()) 
                                __state = 38;
                             else 
                                __state = 42;
                            break;
                        }
                        //* (86) 	         PlayerGold pg2 = (PlayerGold)usedDistances.get(j);
                        case 38: 
                        {
                            __breakLevel = 8;
                            __local__20_17 = (rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.PlayerGold) __local__20_2.get(__local__20_16);
                            __state = 39;
                            break;
                        }
                        //* (87) 	         if(pg.name == pg2.name || pg.pos.x == pg2.pos.x && pg.pos.y == pg2.pos.y)
                        case 39: 
                        {
                            if (__local__20_15.name == __local__20_17.name || __local__20_15.pos.x == __local__20_17.pos.x && __local__20_15.pos.y == __local__20_17.pos.y) 
                                __state = 40;
                             else 
                                __state = 41;
                            break;
                        }
                        //* (88) 	            b_discard = true;
                        case 40: 
                        {
                            __state = 41;
                            __local__20_14 = true;
                            break;
                        }
                        //* (84) 	      for( int j = 0 ; j < usedDistances.size() ; ++ j)
                        case 41: 
                        {
                            __state = 37;
                            ++__local__20_16;
                            break;
                        }
                        //* (90) 	      if(b_discard)
                        case 42: 
                        {
                            if (__local__20_14) 
                                __state = 43;
                             else 
                                __state = 44;
                            break;
                        }
                        //* (91) 	         continue;
                        case 43: 
                        {
                            __breakLevel = 3;
                            __state = 46;
                            break;
                        }
                        //* (93) 	      usedDistances.add(pg);
                        case 44: 
                        {
                            if (__local__20_2.add(__local__20_15)) 
                                __state = 45;
                             else 
                                throw planfailed;
                            break;
                        }
                        //* (94) 	      bel_playerClosestGold_dat.add( pg.name, pg.pos.x, pg.pos.y );
                        case 45: 
                        {
                            __state = 46;
                            bel_playerClosestGold_dat.add(__local__20_15.name,__local__20_15.pos.x,__local__20_15.pos.y);
                            break;
                        }
                        //* (79) 	   for ( int i = 0; i < distances.size(); ++i )
                        case 46: 
                        {
                            __state = 33;
                            ++__local__20_13;
                            break;
                        }
                        //* (36) 	body()
                        case 47: 
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
                    return (bel_players_dat.get(__local__20_3));
                }
                case 1: 
                {
                    return (bel_playerPositions_dat.getByName(__local__20_3.as_string(),__local__20_6,__local__20_7));
                }
                case 2: 
                {
                    return (bel_goldAt_dat.get(__local__20_9,__local__20_10));
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
            return rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.this;
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
            __trace = agent.trace("rmit.ai.clima.jackagt.plans.PFindPlayersNearestGold.body");
        }
        
        public java.lang.Object getVariable(int n)
        {
            switch (n) {
                case 0: 
                {
                    return aos.util.ToObject.box(__local__20_0);
                }
                case 1: 
                {
                    return aos.util.ToObject.box(__local__20_1);
                }
                case 2: 
                {
                    return aos.util.ToObject.box(__local__20_2);
                }
                case 3: 
                {
                    return aos.util.ToObject.box(__local__20_3);
                }
                case 4: 
                {
                    return aos.util.ToObject.box(__local__20_4);
                }
                case 5: 
                {
                    return aos.util.ToObject.box(__local__20_5);
                }
                case 6: 
                {
                    return aos.util.ToObject.box(__local__20_6);
                }
                case 7: 
                {
                    return aos.util.ToObject.box(__local__20_7);
                }
                case 8: 
                {
                    return aos.util.ToObject.box(__local__20_8);
                }
                case 9: 
                {
                    return aos.util.ToObject.box(__local__20_9);
                }
                case 10: 
                {
                    return aos.util.ToObject.box(__local__20_10);
                }
                case 11: 
                {
                    return aos.util.ToObject.box(__local__20_11);
                }
                case 12: 
                {
                    return aos.util.ToObject.box(__local__20_12);
                }
                case 13: 
                {
                    return aos.util.ToObject.box(__local__20_13);
                }
                case 14: 
                {
                    return aos.util.ToObject.box(__local__20_14);
                }
                case 15: 
                {
                    return aos.util.ToObject.box(__local__20_15);
                }
                case 16: 
                {
                    return aos.util.ToObject.box(__local__20_16);
                }
                case 17: 
                {
                    return aos.util.ToObject.box(__local__20_17);
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
