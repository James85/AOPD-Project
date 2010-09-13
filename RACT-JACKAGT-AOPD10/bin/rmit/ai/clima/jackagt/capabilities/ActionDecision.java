/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.capabilities;
import aos.jack.jak.agent.Capability;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.jackagt.data.BGoldAt;
import rmit.ai.clima.jackagt.data.BCurrentPosition;
import rmit.ai.clima.jackagt.data.BNumCarryingGold;
import rmit.ai.clima.jackagt.data.BObstacleAt;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.jackagt.events.MEPlayerAction;
import rmit.ai.clima.jackagt.events.EExecuteCLIMAaction;
import rmit.ai.clima.jackagt.plans.PDropGold;
import rmit.ai.clima.jackagt.plans.PPick;
import rmit.ai.clima.jackagt.plans.PMoveTo;
import rmit.ai.clima.jackagt.plans.PMoveRand;
import java.lang.Object;

public class ActionDecision extends aos.jack.jak.agent.Capability {
    public rmit.ai.clima.jackagt.data.BGoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.BCurrentPosition bel_currentPosition_dat;
    public rmit.ai.clima.jackagt.data.BNumCarryingGold bel_numCarryingGold_dat;
    public rmit.ai.clima.jackagt.data.BObstacleAt bel_obstacleAt_dat;
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public rmit.ai.clima.jackagt.events.EExecuteCLIMAaction eexecuteclimaaction_p;
    public void __init1()
    {
        setNamedCreator("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_goldAt_dat();
            }
            
        },true);
        setNamedCreator("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.BCurrentPosition",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_currentPosition_dat();
            }
            
        },true);
        setNamedCreator("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.BNumCarryingGold",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_numCarryingGold_dat();
            }
            
        },true);
        setNamedCreator("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_obstacleAt_dat();
            }
            
        },true);
    }
    
    public void __init2()
    {
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.BGoldAt) getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt");
        bel_currentPosition_dat = (rmit.ai.clima.jackagt.data.BCurrentPosition) getNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.BCurrentPosition");
        bel_numCarryingGold_dat = (rmit.ai.clima.jackagt.data.BNumCarryingGold) getNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.BNumCarryingGold");
        getNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt");
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        eexecuteclimaaction_p = (rmit.ai.clima.jackagt.events.EExecuteCLIMAaction) findEvent("rmit.ai.clima.jackagt.events.EExecuteCLIMAaction");
        autorun();
    }
    
    synchronized public void __init_desc()
    {
        externals.put("rmit.ai.clima.jackagt.events.EExecuteCLIMAaction","rmit.ai.clima.jackagt.events.EExecuteCLIMAaction");
        externals.put("rmit.ai.clima.jackagt.events.MEPlayerAction","rmit.ai.clima.jackagt.events.MEPlayerAction");
        externals.put("bel_numCarryingGold_dat","bel_numCarryingGold_dat");
        externals.put("bel_currentPosition_dat","bel_currentPosition_dat");
        externals.put("bel_goldAt_dat","bel_goldAt_dat");
        addNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",0);
        addEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEPlayerAction",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EExecuteCLIMAaction",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addPlan("rmit.ai.clima.jackagt.plans.PDropGold",0);
        addPlan("rmit.ai.clima.jackagt.plans.PPick",0);
        addPlan("rmit.ai.clima.jackagt.plans.PMoveTo",0);
        addPlan("rmit.ai.clima.jackagt.plans.PMoveRand",0);
    }
    
    public ActionDecision(aos.jack.jak.agent.NameSpace outer)
    {
        super(outer);
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        __bindToPlan("rmit.ai.clima.jackagt.plans.PDropGold");
        __bindToPlan("rmit.ai.clima.jackagt.plans.PPick");
        __bindToPlan("rmit.ai.clima.jackagt.plans.PMoveTo");
        __bindToPlan("rmit.ai.clima.jackagt.plans.PMoveRand");
    }
    
    private rmit.ai.clima.jackagt.data.BGoldAt __named_data_bel_goldAt_dat()
    {
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.BGoldAt) getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt");
        return bel_goldAt_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BCurrentPosition __named_data_bel_currentPosition_dat()
    {
        bel_currentPosition_dat = (rmit.ai.clima.jackagt.data.BCurrentPosition) getNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.BCurrentPosition");
        return bel_currentPosition_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BNumCarryingGold __named_data_bel_numCarryingGold_dat()
    {
        bel_numCarryingGold_dat = (rmit.ai.clima.jackagt.data.BNumCarryingGold) getNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.BNumCarryingGold");
        return bel_numCarryingGold_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BObstacleAt __named_data_bel_obstacleAt_dat()
    {
        if (bel_obstacleAt_dat != null) 
            return bel_obstacleAt_dat;
        bel_obstacleAt_dat = (rmit.ai.clima.jackagt.data.BObstacleAt) findGlobal("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt");
        if (bel_obstacleAt_dat != null) {
            setNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",bel_obstacleAt_dat);
            return bel_obstacleAt_dat;
        }
        bel_obstacleAt_dat = new rmit.ai.clima.jackagt.data.BObstacleAt();
        if (!bel_obstacleAt_dat.attach(this)) 
            bel_obstacleAt_dat = null;
        addGlobal("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",bel_obstacleAt_dat);
        setNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",bel_obstacleAt_dat);
        return bel_obstacleAt_dat;
    }
    
}
