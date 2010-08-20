/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.agents;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.interfaces.DebugInterface;
import rmit.ai.clima.jackagt.data.CellEmpty;
import rmit.ai.clima.jackagt.data.GoldAt;
import rmit.ai.clima.jackagt.data.AgentPositions;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.jackagt.events.ECellStatusChanged;
import rmit.ai.clima.jackagt.events.MESimEnd;
import rmit.ai.clima.jackagt.events.MESimStart;
import rmit.ai.clima.jackagt.events.EUpdateBel;
import rmit.ai.clima.jackagt.events.MEGameEnd;
import rmit.ai.clima.jackagt.events.MEInformAgentStatus;
import rmit.ai.clima.jackagt.plans.Coord_ReportCellChanged;
import rmit.ai.clima.jackagt.plans.Coord_InitSimulation;
import rmit.ai.clima.jackagt.plans.Coord_EndSimulation;
import rmit.ai.clima.jackagt.plans.UpdateCellsAround;
import rmit.ai.clima.jackagt.plans.Coord_ReportAgentInformation;
import rmit.ai.clima.jackagt.plans.Coord_EndGame;
import java.lang.Object;

public class Coordinator extends aos.jack.jak.agent.Agent implements rmit.ai.clima.interfaces.DebugInterface {
    public rmit.ai.clima.jackagt.data.CellEmpty bel_cellEmpty_dat;
    public rmit.ai.clima.jackagt.data.GoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.AgentPositions bel_agentPositions_dat;
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
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
        setNamedCreator("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_cellEmpty_dat();
            }
            
        },true);
        setNamedCreator("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_goldAt_dat();
            }
            
        },true);
        setNamedCreator("bel_agentPositions_dat","rmit.ai.clima.jackagt.data.AgentPositions",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_agentPositions_dat();
            }
            
        },true);
        setNamedCreator("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_simulationProp_dat();
            }
            
        },true);
    }
    
    public void __init2()
    {
        super.__init2();
        getNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty");
        getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt");
        getNamedObject("bel_agentPositions_dat","rmit.ai.clima.jackagt.data.AgentPositions");
        getNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp");
        ecellstatuschanged_p = (rmit.ai.clima.jackagt.events.ECellStatusChanged) findEvent("rmit.ai.clima.jackagt.events.ECellStatusChanged");
    }
    
    synchronized private void __init_desc()
    {
        addNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_agentPositions_dat","rmit.ai.clima.jackagt.data.AgentPositions",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",aos.jack.jak.agent.Agent.WRITEABLE);
        addEvent("rmit.ai.clima.jackagt.events.ECellStatusChanged",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.ECellStatusChanged",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimEnd",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimStart",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EUpdateBel",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEGameEnd",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_ReportCellChanged",0);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_InitSimulation",0);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_EndSimulation",0);
        addPlan("rmit.ai.clima.jackagt.plans.UpdateCellsAround",0);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_ReportAgentInformation",0);
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
    
    private rmit.ai.clima.jackagt.data.CellEmpty __named_data_bel_cellEmpty_dat()
    {
        if (bel_cellEmpty_dat != null) 
            return bel_cellEmpty_dat;
        bel_cellEmpty_dat = new rmit.ai.clima.jackagt.data.CellEmpty();
        if (!bel_cellEmpty_dat.attach(this)) 
            bel_cellEmpty_dat = null;
        setNamedObject("bel_cellEmpty_dat","rmit.ai.clima.jackagt.data.CellEmpty",bel_cellEmpty_dat);
        return bel_cellEmpty_dat;
    }
    
    private rmit.ai.clima.jackagt.data.GoldAt __named_data_bel_goldAt_dat()
    {
        if (bel_goldAt_dat != null) 
            return bel_goldAt_dat;
        bel_goldAt_dat = new rmit.ai.clima.jackagt.data.GoldAt();
        if (!bel_goldAt_dat.attach(this)) 
            bel_goldAt_dat = null;
        setNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.GoldAt",bel_goldAt_dat);
        return bel_goldAt_dat;
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
    
}