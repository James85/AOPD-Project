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
import rmit.ai.clima.jackagt.data.ObstacleAt;
import rmit.ai.clima.jackagt.data.PlayerPosition;
import java.lang.Object;
import aos.jack.jak.core.Jak;

/******** Start PDT Design Block *** DO NOT EDIT IT *********/

public class ECellStatusChanged extends aos.jack.jak.event.BDIGoalEvent implements aos.extension.rule.RuleHandler {
    aos.jack.jak.logic.IntegerVariable $x;
    aos.jack.jak.logic.IntegerVariable $y;
    aos.jack.jak.logic.StringVariable $agentName;
    public java.lang.String msg;
    public rmit.ai.clima.jackagt.data.PlayerPosition bel_playerPositions_dat;
    public rmit.ai.clima.jackagt.data.ObstacleAt bel_obstacleAt_dat;
    public aos.jack.jak.logic.LogicEnv __logic = null;
    private final static java.lang.String[] __eventVariableNames = {
            "$x",
            "$y",
            "$agentName",
            "msg",
            "bel_playerPositions_dat",
            "bel_obstacleAt_dat"};
    private final static java.lang.String[] __eventVariableTypes = {
            "logical int",
            "logical int",
            "logical String",
            "String",
            "PlayerPosition",
            "ObstacleAt"};
    private boolean __rule_init = false;
    public java.lang.String getDocumentation()
    {
        return "/******** Start PDT Design Block *** DO NOT EDIT IT *********/\n";
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
                return (bel_obstacleAt_dat.get($x,$y));
            }
            case 1: 
            {
                return (bel_playerPositions_dat.get($agentName,$x,$y));
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
        rmit.ai.clima.jackagt.events.ECellStatusChanged __tmp = new rmit.ai.clima.jackagt.events.ECellStatusChanged();
        __tmp.__automatic(this,__index);
        agent.postEvent(__tmp);
        return __tmp;
    }
    
    public void backtrack()
    {
        __logic.clear();
    }
    
    public rmit.ai.clima.jackagt.events.ECellStatusChanged send()
    {
        rmit.ai.clima.jackagt.events.ECellStatusChanged tmp = new rmit.ai.clima.jackagt.events.ECellStatusChanged();
        tmp.init(this);
        return tmp.send_body();
    }
    
    private rmit.ai.clima.jackagt.events.ECellStatusChanged send_body()
    {
        return this;
    }
    
    public rmit.ai.clima.jackagt.events.ECellStatusChanged post()
    {
        rmit.ai.clima.jackagt.events.ECellStatusChanged tmp = new rmit.ai.clima.jackagt.events.ECellStatusChanged();
        tmp.init(this);
        return tmp.post_body();
    }
    
    private rmit.ai.clima.jackagt.events.ECellStatusChanged post_body()
    {
        return this;
    }
    
    public ECellStatusChanged()
    {
    }
    
    public aos.jack.jak.logic.Signature getSignature(int __log)
    {
        aos.jack.jak.logic.Signature __s = super.getSignature(__log + 3);
        __s.addLogical($x);
        __s.addLogical($y);
        __s.addLogical($agentName);
        return __s;
    }
    
    public java.lang.String stateInfo()
    {
        return "rmit/ai/clima/jackagt/events/ECellStatusChanged.event [" + super.stateInfo() + "]";
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
                return aos.util.ToObject.box($x);
            }
            case 1: 
            {
                return aos.util.ToObject.box($y);
            }
            case 2: 
            {
                return aos.util.ToObject.box($agentName);
            }
            case 3: 
            {
                return aos.util.ToObject.box(msg);
            }
            case 4: 
            {
                return aos.util.ToObject.box(bel_playerPositions_dat);
            }
            case 5: 
            {
                return aos.util.ToObject.box(bel_obstacleAt_dat);
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
        bel_playerPositions_dat = (rmit.ai.clima.jackagt.data.PlayerPosition) agent.getNamedObject("bel_playerPositions_dat","rmit.ai.clima.jackagt.data.PlayerPosition");
        bel_obstacleAt_dat = (rmit.ai.clima.jackagt.data.ObstacleAt) agent.getNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt");
        new aos.extension.rule.RuleMonitor(this,0);
        new aos.extension.rule.RuleMonitor(this,1);
    }
    
    public void __automatic(rmit.ai.clima.jackagt.events.ECellStatusChanged __e, int __index)
        throws aos.jack.jak.logic.LogicException
    {
        __logic = new aos.jack.jak.logic.LogicEnv();
        $x = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $y = (aos.jack.jak.logic.IntegerVariable) __logic.new_variable(java.lang.Integer.TYPE);
        $agentName = (aos.jack.jak.logic.StringVariable) __logic.new_variable(java.lang.String.class);
        if (__e == null) 
            return ;
        init(__e);
        if ((__e.$x != null) && __e.$x.isBound()) 
            $x.unify(__e.$x.deref());
        if ((__e.$y != null) && __e.$y.isBound()) 
            $y.unify(__e.$y.deref());
        if ((__e.$agentName != null) && __e.$agentName.isBound()) 
            $agentName.unify(__e.$agentName.deref());
        switch (__index) {
            case 0: 
            {
                {
                    this.msg = "A new obstacle has just been discovered at these coordinates: (" + $x.as_int() + "," + $y.as_int() + ")";
                }
                break;
            }
            case 1: 
            {
                {
                    this.msg = $agentName.as_string() + " just moved to a new cell at these coordinates: (" + $x.as_int() + "," + $y.as_int() + ")";
                }
                break;
            }
        }
    }
    
}