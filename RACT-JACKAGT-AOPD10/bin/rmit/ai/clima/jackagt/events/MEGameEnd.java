/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.events;
import aos.jack.jak.event.MessageEvent;

/******** Start PDT Design Block *** DO NOT EDIT IT *********/

public class MEGameEnd extends aos.jack.jak.event.MessageEvent {
    public java.lang.String result;
    public int score;
    private final static java.lang.String[] __eventVariableNames = {
            "result",
            "score"};
    private final static java.lang.String[] __eventVariableTypes = {
            "String",
            "int"};
    public java.lang.String getDocumentation()
    {
        return "/******** Start PDT Design Block *** DO NOT EDIT IT *********/\n";
    }
    
    public rmit.ai.clima.jackagt.events.MEGameEnd send()
    {
        rmit.ai.clima.jackagt.events.MEGameEnd tmp = new rmit.ai.clima.jackagt.events.MEGameEnd();
        tmp.init(this);
        return tmp.send_body();
    }
    
    private rmit.ai.clima.jackagt.events.MEGameEnd send_body()
    {
        return this;
    }
    
    public MEGameEnd()
    {
    }
    
    public java.lang.String stateInfo()
    {
        return "rmit/ai/clima/jackagt/events/MEGameEnd.event [" + super.stateInfo() + "]";
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
                return aos.util.ToObject.box(result);
            }
            case 1: 
            {
                return aos.util.ToObject.box(score);
            }
            default: 
            {
                throw new java.lang.IndexOutOfBoundsException("Event " + this + " does not have variable number " + n);
            }
        }
    }
    
}
