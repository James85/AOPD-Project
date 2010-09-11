/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.agents;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.interfaces.DebugInterface;
import rmit.ai.clima.jackagt.data.PlayerPerceptReceived;
import rmit.ai.clima.jackagt.data.AgentGold;
import rmit.ai.clima.jackagt.data.PlayerInfo;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.jackagt.data.GoldAt;
import rmit.ai.clima.jackagt.data.ObstacleAt;
import rmit.ai.clima.jackagt.data.AgentPositions;
import rmit.ai.clima.jackagt.events.MESimEnd;
import rmit.ai.clima.jackagt.events.ECellStatusChanged;
import rmit.ai.clima.jackagt.events.MEGameEnd;
import rmit.ai.clima.jackagt.events.MESimStart;
import rmit.ai.clima.jackagt.events.EUpdateBel;
import rmit.ai.clima.jackagt.plans.Coord_EndSimulation;
import rmit.ai.clima.jackagt.plans.Coord_InitSimulation;
import rmit.ai.clima.jackagt.plans.Coord_ReportCellChanged;
import rmit.ai.clima.jackagt.plans.UpdateCellsAround;
import rmit.ai.clima.jackagt.plans.Coord_UpdateAgentStatus;
import rmit.ai.clima.jackagt.plans.Coord_EndGame;
import java.lang.Object;

public class Coordinator extends aos.jack.jak.agent.Agent implements rmit.ai.clima.interfaces.DebugInterface {
    public rmit.ai.clima.jackagt.data.PlayerPerceptReceived bel_playerPerceptReceived_dat;
    public rmit.ai.clima.jackagt.data.AgentGold bel_agentGold_dat;
    public rmit.ai.clima.jackagt.data.PlayerInfo bel_team_dat;
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public rmit.ai.clima.jackagt.data.GoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.ObstacleAt bel_obstacleAt_dat;
    public rmit.ai.clima.jackagt.data.AgentPositions bel_agentPositions_dat;
    private rmit.ai.clima.jackagt.events.ECellStatusChanged ecellstatuschanged_p;
    // Inner capabilities are declared here.
/******** End PDT Design Block *** DO NOT EDIT IT *********/
//other Data Member and Method definitions.
/* Constructor */

    public Coordinator(java.lang.String name)
    {
        super(name);
        boolean __b = getAgentType() == rmit.ai.clima.jackagt.agents.Coordinator.class;
        if (__b) {
            __init1();
            __init2();
        }
        if (__b) 
            startAgent();
    }
    
    // START OF DebugInterface INTERFACE IMPLEMENTATION   

    public void showDebug(java.lang.String Message)
    {
        //		send("gui", eguidebugmessage_s.reportMessage(Message));

        showConsoleDebug(Message);
    }
    
    public void showDebug(java.lang.String Entity, java.lang.String Message)
    {
        showDebug(Entity + "::" + Message);
    }
    
    public void showConsoleDebug(java.lang.String Entity, java.lang.String Message)
    {
        showConsoleDebug("(" + Entity + ")" + Message);
    }
    
    public void showConsoleDebug(java.lang.String Message)
    {
        java.lang.System.out.println(this.name() + ":: " + Message);
    }
    
    public java.lang.Class getAgentType()
    {
        return rmit.ai.clima.jackagt.agents.Coordinator.class;
    }
    
    public void __init1()
    {
        super.__init1();
        setNamedCreator("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.PlayerPerceptReceived",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_playerPerceptReceived_dat();
            }
            
        },true);
        setNamedCreator("bel_agentGold_dat","rmit.ai.clima.jackagt.data.AgentGold",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_agentGold_dat();
            }
            
        },true);
        setNamedCreator("bel_team_dat","rmit.ai.clima.jackagt.data.PlayerInfo",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_team_dat();
            }
            
        },true);
        setNamedCreator("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_simulationProp_dat();
            }
            
        },true);
        setNamedCreator("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_goldAt_dat();
            }
            
        },true);
        setNamedCreator("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_obstacleAt_dat();
            }
            
        },true);
        setNamedCreator("bel_agentPositions_dat","rmit.ai.clima.jackagt.data.AgentPositions",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_agentPositions_dat();
            }
            
        },true);
    }
    
    public void __init2()
    {
        super.__init2();
        getNamedObject("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.PlayerPerceptReceived");
        getNamedObject("bel_agentGold_dat","rmit.ai.clima.jackagt.data.AgentGold");
        getNamedObject("bel_team_dat","rmit.ai.clima.jackagt.data.PlayerInfo");
        getNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp");
        getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt");
        getNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt");
        getNamedObject("bel_agentPositions_dat","rmit.ai.clima.jackagt.data.AgentPositions");
        ecellstatuschanged_p = (rmit.ai.clima.jackagt.events.ECellStatusChanged) findEvent("rmit.ai.clima.jackagt.events.ECellStatusChanged");
    }
    
    synchronized private void __init_desc()
    {
        addNamedObject("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.PlayerPerceptReceived",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_agentGold_dat","rmit.ai.clima.jackagt.data.AgentGold",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_team_dat","rmit.ai.clima.jackagt.data.PlayerInfo",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",0);
        addNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt",0);
        addNamedObject("bel_agentPositions_dat","rmit.ai.clima.jackagt.data.AgentPositions",aos.jack.jak.agent.Agent.WRITEABLE);
        addEvent("rmit.ai.clima.jackagt.events.MESimEnd",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.ECellStatusChanged",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.ECellStatusChanged",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEGameEnd",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimStart",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EUpdateBel",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_EndSimulation",0);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_InitSimulation",0);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_ReportCellChanged",0);
        addPlan("rmit.ai.clima.jackagt.plans.UpdateCellsAround",0);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_UpdateAgentStatus",0);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_EndGame",0);
    }
    
    public void init_desc()
    {
        newAgentDesc("Coordinator");
        super.init_desc();
        __init_desc();
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
    }
    
    private rmit.ai.clima.jackagt.data.PlayerPerceptReceived __named_data_bel_playerPerceptReceived_dat()
    {
        if (bel_playerPerceptReceived_dat != null) 
            return bel_playerPerceptReceived_dat;
        bel_playerPerceptReceived_dat = new rmit.ai.clima.jackagt.data.PlayerPerceptReceived();
        if (!bel_playerPerceptReceived_dat.attach(this)) 
            bel_playerPerceptReceived_dat = null;
        setNamedObject("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.PlayerPerceptReceived",bel_playerPerceptReceived_dat);
        return bel_playerPerceptReceived_dat;
    }
    
    private rmit.ai.clima.jackagt.data.AgentGold __named_data_bel_agentGold_dat()
    {
        if (bel_agentGold_dat != null) 
            return bel_agentGold_dat;
        bel_agentGold_dat = new rmit.ai.clima.jackagt.data.AgentGold();
        if (!bel_agentGold_dat.attach(this)) 
            bel_agentGold_dat = null;
        setNamedObject("bel_agentGold_dat","rmit.ai.clima.jackagt.data.AgentGold",bel_agentGold_dat);
        return bel_agentGold_dat;
    }
    
    private rmit.ai.clima.jackagt.data.PlayerInfo __named_data_bel_team_dat()
    {
        if (bel_team_dat != null) 
            return bel_team_dat;
        bel_team_dat = new rmit.ai.clima.jackagt.data.PlayerInfo();
        if (!bel_team_dat.attach(this)) 
            bel_team_dat = null;
        setNamedObject("bel_team_dat","rmit.ai.clima.jackagt.data.PlayerInfo",bel_team_dat);
        return bel_team_dat;
    }
    
    private rmit.ai.clima.jackagt.data.SimulationProp __named_data_bel_simulationProp_dat()
    {
        if (bel_simulationProp_dat != null) 
            return bel_simulationProp_dat;
        bel_simulationProp_dat = new rmit.ai.clima.jackagt.data.SimulationProp();
        if (!bel_simulationProp_dat.attach(this)) 
            bel_simulationProp_dat = null;
        setNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",bel_simulationProp_dat);
        return bel_simulationProp_dat;
    }
    
    private rmit.ai.clima.jackagt.data.GoldAt __named_data_bel_goldAt_dat()
    {
        if (bel_goldAt_dat != null) 
            return bel_goldAt_dat;
        bel_goldAt_dat = (rmit.ai.clima.jackagt.data.GoldAt) findGlobal("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt");
        if (bel_goldAt_dat != null) {
            setNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",bel_goldAt_dat);
            return bel_goldAt_dat;
        }
        bel_goldAt_dat = new rmit.ai.clima.jackagt.data.GoldAt();
        if (!bel_goldAt_dat.attach(this)) 
            bel_goldAt_dat = null;
        addGlobal("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",bel_goldAt_dat);
        setNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",bel_goldAt_dat);
        return bel_goldAt_dat;
    }
    
    private rmit.ai.clima.jackagt.data.ObstacleAt __named_data_bel_obstacleAt_dat()
    {
        if (bel_obstacleAt_dat != null) 
            return bel_obstacleAt_dat;
        bel_obstacleAt_dat = (rmit.ai.clima.jackagt.data.ObstacleAt) findGlobal("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt");
        if (bel_obstacleAt_dat != null) {
            setNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt",bel_obstacleAt_dat);
            return bel_obstacleAt_dat;
        }
        bel_obstacleAt_dat = new rmit.ai.clima.jackagt.data.ObstacleAt();
        if (!bel_obstacleAt_dat.attach(this)) 
            bel_obstacleAt_dat = null;
        addGlobal("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt",bel_obstacleAt_dat);
        setNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.ObstacleAt",bel_obstacleAt_dat);
        return bel_obstacleAt_dat;
    }
    
    private rmit.ai.clima.jackagt.data.AgentPositions __named_data_bel_agentPositions_dat()
    {
        if (bel_agentPositions_dat != null) 
            return bel_agentPositions_dat;
        bel_agentPositions_dat = new rmit.ai.clima.jackagt.data.AgentPositions();
        if (!bel_agentPositions_dat.attach(this)) 
            bel_agentPositions_dat = null;
        setNamedObject("bel_agentPositions_dat","rmit.ai.clima.jackagt.data.AgentPositions",bel_agentPositions_dat);
        return bel_agentPositions_dat;
    }
    
}
