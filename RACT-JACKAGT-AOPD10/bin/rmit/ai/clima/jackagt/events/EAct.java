/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.events;
import aos.jack.jak.event.BDIGoalEvent;

public class EAct extends aos.jack.jak.event.BDIGoalEvent {
    public rmit.ai.clima.jackagt.events.EAct act()
    {
        rmit.ai.clima.jackagt.events.EAct tmp = new rmit.ai.clima.jackagt.events.EAct();
        tmp.init(this);
        return tmp.act_body();
    }
    
    private rmit.ai.clima.jackagt.events.EAct act_body()
    {
        return this;
    }
    
    public EAct()
    {
    }
    
    public java.lang.String stateInfo()
    {
        return "rmit/ai/clima/jackagt/events/EAct.event [" + super.stateInfo() + "]";
    }
    
}
