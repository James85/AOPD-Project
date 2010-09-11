/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.events;
import aos.jack.jak.event.MessageEvent;
import rmit.ai.clima.gui.grid.GridPoint;
import rmit.ai.clima.comms.Cell;

/******** Start PDT Design Block *** DO NOT EDIT IT *********/

public class EUpdateBel extends aos.jack.jak.event.MessageEvent {
    public int step;
    public rmit.ai.clima.gui.grid.GridPoint currentPos;
    public rmit.ai.clima.comms.Cell[] cells;
    public int noCarryingGold;
    public java.lang.String name;
    private final static java.lang.String[] __eventVariableNames = {
            "step",
            "currentPos",
            "cells",
            "noCarryingGold",
            "name"};
    private final static java.lang.String[] __eventVariableTypes = {
            "int",
            "GridPoint",
            "Cell[]",
            "int",
            "String"};
    public java.lang.String getDocumentation()
    {
        return "/******** Start PDT Design Block *** DO NOT EDIT IT *********/\n";
    }
    
    public rmit.ai.clima.jackagt.events.EUpdateBel post(int step, rmit.ai.clima.gui.grid.GridPoint currentPos, rmit.ai.clima.comms.Cell[] cells, int noCarryingGold)
    {
        rmit.ai.clima.jackagt.events.EUpdateBel tmp = new rmit.ai.clima.jackagt.events.EUpdateBel();
        tmp.init(this);
        return tmp.post_body(step,currentPos,cells,noCarryingGold);
    }
    
    private rmit.ai.clima.jackagt.events.EUpdateBel post_body(int step, rmit.ai.clima.gui.grid.GridPoint currentPos, rmit.ai.clima.comms.Cell[] cells, int noCarryingGold)
    {
        this.step = step;
        this.currentPos = currentPos;
        this.cells = cells;
        this.noCarryingGold = noCarryingGold;
        return this;
    }
    
    public rmit.ai.clima.jackagt.events.EUpdateBel post(int step, rmit.ai.clima.gui.grid.GridPoint currentPos, rmit.ai.clima.comms.Cell[] cells, int noCarryingGold, java.lang.String name)
    {
        rmit.ai.clima.jackagt.events.EUpdateBel tmp = new rmit.ai.clima.jackagt.events.EUpdateBel();
        tmp.init(this);
        return tmp.post_body(step,currentPos,cells,noCarryingGold,name);
    }
    
    private rmit.ai.clima.jackagt.events.EUpdateBel post_body(int step, rmit.ai.clima.gui.grid.GridPoint currentPos, rmit.ai.clima.comms.Cell[] cells, int noCarryingGold, java.lang.String name)
    {
        this.step = step;
        this.currentPos = currentPos;
        this.cells = cells;
        this.noCarryingGold = noCarryingGold;
        this.name = name;
        return this;
    }
    
    public EUpdateBel()
    {
    }
    
    public java.lang.String stateInfo()
    {
        return "rmit/ai/clima/jackagt/events/EUpdateBel.event [" + super.stateInfo() + "]";
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
                return aos.util.ToObject.box(step);
            }
            case 1: 
            {
                return aos.util.ToObject.box(currentPos);
            }
            case 2: 
            {
                return aos.util.ToObject.box(cells);
            }
            case 3: 
            {
                return aos.util.ToObject.box(noCarryingGold);
            }
            case 4: 
            {
                return aos.util.ToObject.box(name);
            }
            default: 
            {
                throw new java.lang.IndexOutOfBoundsException("Event " + this + " does not have variable number " + n);
            }
        }
    }
    
}