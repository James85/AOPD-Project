/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.events;
import aos.jack.jak.event.BDIGoalEvent;

/******** Start PDT Design Block *** DO NOT EDIT IT *********/

public class EFindPath extends aos.jack.jak.event.BDIGoalEvent {
    public int srcX;
    public int srcY;
    public int dstX;
    public int dstY;
    private final static java.lang.String[] __eventVariableNames = {
            "srcX",
            "srcY",
            "dstX",
            "dstY"};
    private final static java.lang.String[] __eventVariableTypes = {
            "int",
            "int",
            "int",
            "int"};
    public java.lang.String getDocumentation()
    {
        return "/******** Start PDT Design Block *** DO NOT EDIT IT *********/\n";
    }
    
    public rmit.ai.clima.jackagt.events.EFindPath post(int srcX, int srcY, int dstX, int dstY)
    {
        rmit.ai.clima.jackagt.events.EFindPath tmp = new rmit.ai.clima.jackagt.events.EFindPath();
        tmp.init(this);
        return tmp.post_body(srcX,srcY,dstX,dstY);
    }
    
    private rmit.ai.clima.jackagt.events.EFindPath post_body(int srcX, int srcY, int dstX, int dstY)
    {
        this.srcX = srcX;
        this.srcY = srcY;
        this.dstX = dstX;
        this.dstY = dstY;
        return this;
    }
    
    public EFindPath()
    {
    }
    
    public java.lang.String stateInfo()
    {
        return "rmit/ai/clima/jackagt/events/EFindPath.event [" + super.stateInfo() + "]";
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
                return aos.util.ToObject.box(srcX);
            }
            case 1: 
            {
                return aos.util.ToObject.box(srcY);
            }
            case 2: 
            {
                return aos.util.ToObject.box(dstX);
            }
            case 3: 
            {
                return aos.util.ToObject.box(dstY);
            }
            default: 
            {
                throw new java.lang.IndexOutOfBoundsException("Event " + this + " does not have variable number " + n);
            }
        }
    }
    
}
