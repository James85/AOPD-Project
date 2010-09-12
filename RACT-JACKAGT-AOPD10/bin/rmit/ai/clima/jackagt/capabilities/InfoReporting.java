/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.capabilities;
import aos.jack.jak.agent.Capability;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.jackagt.data.CurrentStatus;
import rmit.ai.clima.jackagt.data.BGoldAt;
import rmit.ai.clima.jackagt.data.BNumCarryingGold;
import rmit.ai.clima.jackagt.data.BCurrentPosition;
import rmit.ai.clima.jackagt.data.BObstacleAt;
import rmit.ai.clima.jackagt.events.ECellChange;
import rmit.ai.clima.jackagt.events.EShowBeliefs;
import rmit.ai.clima.jackagt.events.MEInformCellStatus;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.jackagt.events.MEInformAgentStatus;
import rmit.ai.clima.jackagt.plans.ReportCellChangeToGUI;
import rmit.ai.clima.jackagt.plans.BeliefReporting;
import rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting;

//import ;
//import ;
//import ;
//import ;
//import ;
//import ;
//import ;
//import ;
//import ;

public class InfoReporting extends aos.jack.jak.agent.Capability {
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.jackagt.data.CurrentStatus bel_currentStatus_dat;
    public rmit.ai.clima.jackagt.data.BGoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.BNumCarryingGold bel_numCarryingGold_dat;
    public rmit.ai.clima.jackagt.data.BCurrentPosition bel_currentPosition_dat;
    public rmit.ai.clima.jackagt.data.BObstacleAt bel_obstacleAt_dat;
    public rmit.ai.clima.jackagt.events.MEInformCellStatus meinformcellstatus_s;
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public rmit.ai.clima.jackagt.events.MEInformAgentStatus meinformagentstatus_p;
    public java.lang.String getDocumentation()
    {
        return "//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n";
    }
    
    public void __init1()
    {
        setNamedCreator("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_currentRequestActionId_dat();
            }
            
        },true);
        setNamedCreator("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_currentStatus_dat();
            }
            
        },true);
        setNamedCreator("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_goldAt_dat();
            }
            
        },true);
        setNamedCreator("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.BNumCarryingGold",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_numCarryingGold_dat();
            }
            
        },true);
        setNamedCreator("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.BCurrentPosition",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_currentPosition_dat();
            }
            
        },true);
        setNamedCreator("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_obstacleAt_dat();
            }
            
        },true);
    }
    
    public void __init2()
    {
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) getNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId");
        bel_currentStatus_dat = (rmit.ai.clima.jackagt.data.CurrentStatus) getNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus");
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.BGoldAt) getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt");
        bel_numCarryingGold_dat = (rmit.ai.clima.jackagt.data.BNumCarryingGold) getNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.BNumCarryingGold");
        bel_currentPosition_dat = (rmit.ai.clima.jackagt.data.BCurrentPosition) getNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.BCurrentPosition");
        bel_obstacleAt_dat = (rmit.ai.clima.jackagt.data.BObstacleAt) getNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt");
        meinformcellstatus_s = (rmit.ai.clima.jackagt.events.MEInformCellStatus) findEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus");
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        meinformagentstatus_p = (rmit.ai.clima.jackagt.events.MEInformAgentStatus) findEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus");
        autorun();
    }
    
    synchronized public void __init_desc()
    {
        externals.put("rmit.ai.clima.jackagt.events.EShowBeliefs","rmit.ai.clima.jackagt.events.EShowBeliefs");
        externals.put("rmit.ai.clima.jackagt.events.ECellChange","rmit.ai.clima.jackagt.events.ECellChange");
        externals.put("bel_obstacleAt_dat","bel_obstacleAt_dat");
        externals.put("bel_currentPosition_dat","bel_currentPosition_dat");
        externals.put("bel_numCarryingGold_dat","bel_numCarryingGold_dat");
        externals.put("bel_goldAt_dat","bel_goldAt_dat");
        externals.put("bel_currentStatus_dat","bel_currentStatus_dat");
        externals.put("bel_currentRequestActionId_dat","bel_currentRequestActionId_dat");
        addEvent("rmit.ai.clima.jackagt.events.ECellChange",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EShowBeliefs",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addPlan("rmit.ai.clima.jackagt.plans.ReportCellChangeToGUI",0);
        addPlan("rmit.ai.clima.jackagt.plans.BeliefReporting",0);
        addPlan("rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting",0);
    }
    
    public InfoReporting(aos.jack.jak.agent.NameSpace outer)
    {
        super(outer);
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        __bindToPlan("rmit.ai.clima.jackagt.plans.ReportCellChangeToGUI");
        __bindToPlan("rmit.ai.clima.jackagt.plans.BeliefReporting");
        __bindToPlan("rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting");
    }
    
    private rmit.ai.clima.jackagt.data.CurrentRequestActionId __named_data_bel_currentRequestActionId_dat()
    {
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) getNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId");
        return bel_currentRequestActionId_dat;
    }
    
    private rmit.ai.clima.jackagt.data.CurrentStatus __named_data_bel_currentStatus_dat()
    {
        bel_currentStatus_dat = (rmit.ai.clima.jackagt.data.CurrentStatus) getNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus");
        return bel_currentStatus_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BGoldAt __named_data_bel_goldAt_dat()
    {
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.BGoldAt) getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt");
        return bel_goldAt_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BNumCarryingGold __named_data_bel_numCarryingGold_dat()
    {
        bel_numCarryingGold_dat = (rmit.ai.clima.jackagt.data.BNumCarryingGold) getNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.BNumCarryingGold");
        return bel_numCarryingGold_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BCurrentPosition __named_data_bel_currentPosition_dat()
    {
        bel_currentPosition_dat = (rmit.ai.clima.jackagt.data.BCurrentPosition) getNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.BCurrentPosition");
        return bel_currentPosition_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BObstacleAt __named_data_bel_obstacleAt_dat()
    {
        bel_obstacleAt_dat = (rmit.ai.clima.jackagt.data.BObstacleAt) getNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt");
        return bel_obstacleAt_dat;
    }
    
}
