/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.capabilities;
import aos.jack.jak.agent.Capability;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.jackagt.data.CurrentStatus;
import rmit.ai.clima.jackagt.data.CurrentPosition;
import rmit.ai.clima.jackagt.data.NumCarryingGold;
import rmit.ai.clima.jackagt.data.CurrentRequestActionId;
import rmit.ai.clima.jackagt.data.GoldAt;
import rmit.ai.clima.iface.LastActionSentBel;
import rmit.ai.clima.jackagt.data.ObstacleAt;
import rmit.ai.clima.jackagt.events.EAgentMoved;
import rmit.ai.clima.jackagt.events.EGUIDebugMessage;
import rmit.ai.clima.jackagt.events.ECellChange;
import rmit.ai.clima.jackagt.events.EShowBeliefs;
import rmit.ai.clima.jackagt.events.MEInformAgentStatus;
import rmit.ai.clima.jackagt.events.MEInformCellStatus;
import rmit.ai.clima.jackagt.plans.BeliefReporting;
import rmit.ai.clima.jackagt.plans.ReportCellChangeToGUI;
import rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting;
import rmit.ai.clima.jackagt.plans.ReportAgentMovement;

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
    public rmit.ai.clima.jackagt.data.CurrentStatus bel_currentStatus_dat;
    public rmit.ai.clima.jackagt.data.CurrentPosition bel_currentPosition_dat;
    public rmit.ai.clima.jackagt.data.NumCarryingGold bel_numCarryingGold_dat;
    public rmit.ai.clima.jackagt.data.CurrentRequestActionId bel_currentRequestActionId_dat;
    public rmit.ai.clima.jackagt.data.GoldAt bel_goldAt_dat;
    public rmit.ai.clima.iface.LastActionSentBel bel_lastActionSent_dat;
    public rmit.ai.clima.jackagt.data.ObstacleAt bel_obstacleAt_dat;
    public rmit.ai.clima.jackagt.events.EGUIDebugMessage eguidebugmessage_s;
    public rmit.ai.clima.jackagt.events.MEInformAgentStatus meinformagentstatus_s;
    public rmit.ai.clima.jackagt.events.MEInformCellStatus meinformcellstatus_s;
    public java.lang.String getDocumentation()
    {
        return "//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n//import ;\n";
    }
    
    public void __init1()
    {
        setNamedCreator("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_currentStatus_dat();
            }
            
        },true);
        setNamedCreator("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_currentPosition_dat();
            }
            
        },true);
        setNamedCreator("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.NumCarryingGold",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_numCarryingGold_dat();
            }
            
        },true);
        setNamedCreator("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_currentRequestActionId_dat();
            }
            
        },true);
        setNamedCreator("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_goldAt_dat();
            }
            
        },true);
        setNamedCreator("bel_lastActionSent_dat","rmit.ai.clima.iface.LastActionSentBel",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_lastActionSent_dat();
            }
            
        },true);
        setNamedCreator("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_bel_obstacleAt_dat();
            }
            
        },true);
    }
    
    public void __init2()
    {
        bel_currentStatus_dat = (rmit.ai.clima.jackagt.data.CurrentStatus) getNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus");
        bel_currentPosition_dat = (rmit.ai.clima.jackagt.data.CurrentPosition) getNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition");
        bel_numCarryingGold_dat = (rmit.ai.clima.jackagt.data.NumCarryingGold) getNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.NumCarryingGold");
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) getNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId");
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.GoldAt) getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt");
        bel_lastActionSent_dat = (rmit.ai.clima.iface.LastActionSentBel) getNamedObject("bel_lastActionSent_dat","rmit.ai.clima.iface.LastActionSentBel");
        bel_obstacleAt_dat = (rmit.ai.clima.jackagt.data.ObstacleAt) getNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt");
        eguidebugmessage_s = (rmit.ai.clima.jackagt.events.EGUIDebugMessage) findEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage");
        meinformagentstatus_s = (rmit.ai.clima.jackagt.events.MEInformAgentStatus) findEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus");
        meinformcellstatus_s = (rmit.ai.clima.jackagt.events.MEInformCellStatus) findEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus");
        autorun();
    }
    
    synchronized public void __init_desc()
    {
        externals.put("rmit.ai.clima.jackagt.events.EShowBeliefs","rmit.ai.clima.jackagt.events.EShowBeliefs");
        externals.put("rmit.ai.clima.jackagt.events.ECellChange","rmit.ai.clima.jackagt.events.ECellChange");
        externals.put("rmit.ai.clima.jackagt.events.EAgentMoved","rmit.ai.clima.jackagt.events.EAgentMoved");
        externals.put("bel_obstacleAt_dat","bel_obstacleAt_dat");
        externals.put("bel_lastActionSent_dat","bel_lastActionSent_dat");
        externals.put("bel_goldAt_dat","bel_goldAt_dat");
        externals.put("bel_currentRequestActionId_dat","bel_currentRequestActionId_dat");
        externals.put("bel_numCarryingGold_dat","bel_numCarryingGold_dat");
        externals.put("bel_currentPosition_dat","bel_currentPosition_dat");
        externals.put("bel_currentStatus_dat","bel_currentStatus_dat");
        addEvent("rmit.ai.clima.jackagt.events.EAgentMoved",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EGUIDebugMessage",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.ECellChange",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EShowBeliefs",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformCellStatus",aos.jack.jak.agent.Agent.SENT_EVENT);
        addPlan("rmit.ai.clima.jackagt.plans.BeliefReporting",0);
        addPlan("rmit.ai.clima.jackagt.plans.ReportCellChangeToGUI",0);
        addPlan("rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting",0);
        addPlan("rmit.ai.clima.jackagt.plans.ReportAgentMovement",0);
    }
    
    public InfoReporting(aos.jack.jak.agent.NameSpace outer)
    {
        super(outer);
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        __bindToPlan("rmit.ai.clima.jackagt.plans.BeliefReporting");
        __bindToPlan("rmit.ai.clima.jackagt.plans.ReportCellChangeToGUI");
        __bindToPlan("rmit.ai.clima.jackagt.plans.ConsoleBeliefPrinting");
        __bindToPlan("rmit.ai.clima.jackagt.plans.ReportAgentMovement");
    }
    
    private rmit.ai.clima.jackagt.data.CurrentStatus __named_data_bel_currentStatus_dat()
    {
        bel_currentStatus_dat = (rmit.ai.clima.jackagt.data.CurrentStatus) getNamedObject("bel_currentStatus_dat","rmit.ai.clima.jackagt.data.CurrentStatus");
        return bel_currentStatus_dat;
    }
    
    private rmit.ai.clima.jackagt.data.CurrentPosition __named_data_bel_currentPosition_dat()
    {
        bel_currentPosition_dat = (rmit.ai.clima.jackagt.data.CurrentPosition) getNamedObject("bel_currentPosition_dat","rmit.ai.clima.jackagt.data.CurrentPosition");
        return bel_currentPosition_dat;
    }
    
    private rmit.ai.clima.jackagt.data.NumCarryingGold __named_data_bel_numCarryingGold_dat()
    {
        bel_numCarryingGold_dat = (rmit.ai.clima.jackagt.data.NumCarryingGold) getNamedObject("bel_numCarryingGold_dat","rmit.ai.clima.jackagt.data.NumCarryingGold");
        return bel_numCarryingGold_dat;
    }
    
    private rmit.ai.clima.jackagt.data.CurrentRequestActionId __named_data_bel_currentRequestActionId_dat()
    {
        bel_currentRequestActionId_dat = (rmit.ai.clima.jackagt.data.CurrentRequestActionId) getNamedObject("bel_currentRequestActionId_dat","rmit.ai.clima.jackagt.data.CurrentRequestActionId");
        return bel_currentRequestActionId_dat;
    }
    
    private rmit.ai.clima.jackagt.data.GoldAt __named_data_bel_goldAt_dat()
    {
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.GoldAt) getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt");
        return bel_goldAt_dat;
    }
    
    private rmit.ai.clima.iface.LastActionSentBel __named_data_bel_lastActionSent_dat()
    {
        bel_lastActionSent_dat = (rmit.ai.clima.iface.LastActionSentBel) getNamedObject("bel_lastActionSent_dat","rmit.ai.clima.iface.LastActionSentBel");
        return bel_lastActionSent_dat;
    }
    
    private rmit.ai.clima.jackagt.data.ObstacleAt __named_data_bel_obstacleAt_dat()
    {
        bel_obstacleAt_dat = (rmit.ai.clima.jackagt.data.ObstacleAt) getNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt");
        return bel_obstacleAt_dat;
    }
    
}
