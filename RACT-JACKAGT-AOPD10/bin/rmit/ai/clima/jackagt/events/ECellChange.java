/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.events;
import aos.jack.jak.event.BDIGoalEvent;
import aos.jack.jak.event.Event;
import aos.jack.jak.logic.LogicException;
import aos.jack.jak.logic.Signature;
import aos.jack.jak.logic.LogicEnv;
import aos.extension.rule.RuleMonitor;
import rmit.ai.clima.jackagt.data.GoldAt;
import rmit.ai.clima.jackagt.data.CellEmpty;
import java.lang.Object;
import rmit.ai.clima.gui.grid.GridObject;
import aos.jack.jak.core.Jak;
import rmit.ai.clima.gui.grid.GameGraphics;
import rmit.ai.clima.gui.grid.GridPoint;

public class ECellChange extends aos.jack.jak.event.BDIGoalEvent implements aos.extension.rule.RuleHandler {
    public java.lang.String message;
    public rmit.ai.clima.gui.grid.GridObject gridObject;
    aos.jack.jak.logic.IntegerVariable $x;
    aos.jack.jak.logic.IntegerVariable $y;
    aos.jack.jak.logic.IntegerVariable $id;
    public rmit.ai.clima.jackagt.data.GoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.CellEmpty bel_cellEmpty_dat;
    public aos.jack.jak.logic.LogicEnv __logic = null;
    private final static java.lang.String[] __eventVariableNames = {
            "message",
            "gridObject",
            "$x",
            "$y",
            "$id",
            "bel_goldAt_dat",
            "bel_cellEmpty_dat"};
    private final static java.lang.String[] __eventVariableTypes = {
            "String",
            "GridObject",
            "logical int",
            "logical int",
            "logical int",
            "GoldAt",
            "CellEmpty"};
    private boolean __rule_init = false;
    public rmit.ai.clima.jackagt.events.ECellChange goldRemoved(int x, int y)
    {
        rmit.ai.clima.jackagt.events.ECellChange tmp = new rmit.ai.clima.jackagt.events.ECellChange();
        tmp.init(this);
        return tmp.goldRemoved_body(x,y);
    }
    
    private rmit.ai.clima.jackagt.events.ECellChange goldRemoved_body(int x, int y)
    {
        this.gridObject = new rmit.ai.clima.gui.grid.GridObject(x,y,"nogold");
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
                return (bel_goldAt_dat.getLocWithGold($x,$y));
            }
            case 1: 
            {
                return (bel_goldAt_dat.getLocWithGold($x,$y)).negate();
            }
            case 2: 
            {
                return (bel_cellEmpty_dat.get($x,$y));
            }
            case 3: 
            {
                return (bel_cellEmpty_dat.get($x,$y)).negate();
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
    
    public aos.jack.jak.event.Event __auto_post(int __index)
        throws aos.jack.jak.logic.LogicException
    {
        rmit.ai.clima.jackagt.events.ECellChange __tmp = new rmit.ai.clima.jackagt.events.ECellChange();
        __tmp.__automatic(this,__index);
        agent.postEvent(__tmp);
        return __tmp;
    }
    
    public void backtrack()
    {
        __logic.clear();
    }
    
    public ECellChange()
    {
    }
    
    public aos.jack.jak.logic.Signature getSignature(int __log)
    {
        aos.jack.jak.logic.Signature __s = super.getSignature(__log + 3);
        __s.addLogical($x);
        __s.addLogical($y);
        __s.addLogical($id);
        return __s;
    }
    
    public java.lang.String stateInfo()
    {
        return "rmit/ai/clima/jackagt/events/ECellChange.event [" + super.stateInfo() + "]";
    }
    
    public java.lang.String[] variableNames()
    {
        return __eventVariableNames;
    }
    
    public java.lang.String[] variableTypes()
    {
        return __eventVariableTypes;
    }
    
    public java.lang.Object getVariable(int n)
    {
        switch (n) {
            case 0: 
            {
                return aos.util.ToObject.box(message);
            }
            case 1: 
            {
                return aos.util.ToObject.box(gridObject);
            }
            case 2: 
            {
                return aos.util.ToObject.box($x);
            }
            case 3: 
            {
                return aos.util.ToObject.box($y);
            }
            case 4: 
            {
                return aos.util.ToObject.box($id);
            }
            case 5: 
            {
                return aos.util.ToObject.box(bel_goldAt_dat);
            }
            case 6: 
            {
                return aos.util.ToObject.box(bel_cellEmpty_dat);
            }
            default: 
            {
                throw new java.lang.IndexOutOfBoundsException("Event " + this + " does not have variable number " + n);
            }
        }
    }
    
    public void addRelevant(aos.jack.jak.plan.Plan __p)
    {
        super.addRelevant(__p);
        if (__rule_init) 
            return ;
        __rule_init = true;
        try {
            __automatic(null,-1);
        }
        catch (aos.jack.jak.logic.LogicException e) {
        }
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.GoldAt) agent.getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt");
        bel_cellEmpty_dat = (rmit.ai.clima.jackagt.data.CellEmpty) agent.getNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty");
        new aos.extension.rule.RuleMonitor(this,0);
        new aos.extension.rule.RuleMonitor(this,1);
        new aos.extension.rule.RuleMonitor(this,2);
        new aos.extension.rule.RuleMonitor(this,3);
    }
    
    public void __automatic(rmit.ai.clima.jackagt.events.ECellChange __e, int __index)
        throws aos.jack.jak.logic.LogicException
    {
        __logic = new aos.jack.jak.logic.LogicEnv();
        $x = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $y = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $id = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        if (__e == null) 
            return ;
        init(__e);
        if ((__e.$x != null) && __e.$x.isBound()) 
            $x.unify(__e.$x.deref());
        if ((__e.$y != null) && __e.$y.isBound()) 
            $y.unify(__e.$y.deref());
        if ((__e.$id != null) && __e.$id.isBound()) 
            $id.unify(__e.$id.deref());
        switch (__index) {
            case 0: 
            {
                {
                    // Cell has a gold


                    gridObject = new rmit.ai.clima.gui.grid.GridObject($x.as_int(),$y.as_int(),rmit.ai.clima.gui.grid.GameGraphics.getGoldString());
                    message = "Just learned of gold at " + rmit.ai.clima.gui.grid.GridPoint.toString($x.as_int(),$y.as_int());
                }
                break;
            }
            case 1: 
            {
                {
                    // Cell has no gold


                    gridObject = new rmit.ai.clima.gui.grid.GridObject($x.as_int(),$y.as_int(),"nogold");
                    message = "Just learned no gold at " + rmit.ai.clima.gui.grid.GridPoint.toString($x.as_int(),$y.as_int());
                }
                break;
            }
            case 2: 
            {
                {
                    gridObject = new rmit.ai.clima.gui.grid.GridObject($x.as_int(),$y.as_int(),rmit.ai.clima.gui.grid.GameGraphics.getEmptyString());
                    message = "Just learned of an empty cell at location " + rmit.ai.clima.gui.grid.GridPoint.toString($x.as_int(),$y.as_int());
                }
                break;
            }
            case 3: 
            {
                {
                    gridObject = new rmit.ai.clima.gui.grid.GridObject($x.as_int(),$y.as_int(),rmit.ai.clima.gui.grid.GameGraphics.getObstacleString());
                    message = "Just learned of an obstacle at location " + rmit.ai.clima.gui.grid.GridPoint.toString($x.as_int(),$y.as_int());
                }
                break;
            }
        }
    }
    
}