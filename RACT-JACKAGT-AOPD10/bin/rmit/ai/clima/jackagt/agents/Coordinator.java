/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.agents;
import aos.jack.jak.agent.Agent;
import rmit.ai.clima.interfaces.DebugInterface;
import rmit.ai.clima.jackagt.data.BPlayer;
import rmit.ai.clima.jackagt.data.BPlayerPosition;
import rmit.ai.clima.jackagt.data.BGoldAt;
import rmit.ai.clima.jackagt.data.SimulationProp;
import rmit.ai.clima.jackagt.data.BPlayerPerceptReceived;
import rmit.ai.clima.jackagt.data.BMoveHint;
import rmit.ai.clima.jackagt.data.BPlayerClosestGold;
import rmit.ai.clima.jackagt.data.BPlayerGold;
import rmit.ai.clima.jackagt.data.BObstacleAt;
import rmit.ai.clima.jackagt.events.MESimStart;
import rmit.ai.clima.jackagt.events.EFindPath;
import rmit.ai.clima.jackagt.events.MEGameEnd;
import rmit.ai.clima.jackagt.events.MEPlayerAction;
import rmit.ai.clima.jackagt.events.MEReportPlayerPercept;
import rmit.ai.clima.jackagt.events.EFindClosestGold;
import rmit.ai.clima.jackagt.events.MESimEnd;
import rmit.ai.clima.jackagt.events.EUpdateBel;
import rmit.ai.clima.jackagt.events.EChoosePlayerActions;
import rmit.ai.clima.jackagt.events.MEInformAgentStatus;
import rmit.ai.clima.jackagt.plans.Coord_EndSimulation;
import rmit.ai.clima.jackagt.plans.Coord_AssimilatePlayerPercept;
import rmit.ai.clima.jackagt.plans.Coord_InitSimulation;
import rmit.ai.clima.jackagt.plans.UpdateCellsAround;
import rmit.ai.clima.jackagt.plans.Coord_EndGame;
import rmit.ai.clima.jackagt.plans.PCoord_ChoosePlayerActions;
import rmit.ai.clima.jackagt.capabilities.CPathFinding;
import java.lang.Object;

public class Coordinator extends aos.jack.jak.agent.Agent implements rmit.ai.clima.interfaces.DebugInterface {
    public rmit.ai.clima.jackagt.data.BPlayer bel_players_dat;
    public rmit.ai.clima.jackagt.data.BPlayerPosition bel_playerTarget_dat;
    public rmit.ai.clima.jackagt.data.BGoldAt bel_goldAt_dat;
    public rmit.ai.clima.jackagt.data.SimulationProp bel_simulationProp_dat;
    public rmit.ai.clima.jackagt.data.BPlayerPerceptReceived bel_playerPerceptReceived_dat;
    public rmit.ai.clima.jackagt.data.BMoveHint bel_moveHint_dat;
    public rmit.ai.clima.jackagt.data.BPlayerClosestGold bel_playerClosestGold_dat;
    public rmit.ai.clima.jackagt.data.BPlayerPosition bel_playerPositions_dat;
    public rmit.ai.clima.jackagt.data.BPlayerGold bel_playerGold_dat;
    public rmit.ai.clima.jackagt.data.BObstacleAt bel_obstacleAt_dat;
    public rmit.ai.clima.jackagt.capabilities.CPathFinding cpathfinding_cap;
    private rmit.ai.clima.jackagt.events.EFindPath efindpath_p;
    private rmit.ai.clima.jackagt.events.MEPlayerAction meplayeraction_s;
    private rmit.ai.clima.jackagt.events.EFindClosestGold efindclosestgold_p;
    private rmit.ai.clima.jackagt.events.EUpdateBel eupdatebel_p;
    private rmit.ai.clima.jackagt.events.EChoosePlayerActions echooseplayeractions_p;
    private rmit.ai.clima.jackagt.events.MEInformAgentStatus meinformagentstatus_p;
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
        setNamedCreator("bel_players_dat","rmit.ai.clima.jackagt.data.BPlayer",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_players_dat();
            }
            
        },true);
        setNamedCreator("bel_playerTarget_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_playerTarget_dat();
            }
            
        },true);
        setNamedCreator("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_goldAt_dat();
            }
            
        },true);
        setNamedCreator("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_simulationProp_dat();
            }
            
        },true);
        setNamedCreator("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.BPlayerPerceptReceived",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_playerPerceptReceived_dat();
            }
            
        },true);
        setNamedCreator("bel_moveHint_dat","rmit.ai.clima.jackagt.data.BMoveHint",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_moveHint_dat();
            }
            
        },true);
        setNamedCreator("bel_playerClosestGold_dat","rmit.ai.clima.jackagt.data.BPlayerClosestGold",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_playerClosestGold_dat();
            }
            
        },true);
        setNamedCreator("bel_playerPositions_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_playerPositions_dat();
            }
            
        },true);
        setNamedCreator("bel_playerGold_dat","rmit.ai.clima.jackagt.data.BPlayerGold",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_playerGold_dat();
            }
            
        },true);
        setNamedCreator("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_bel_obstacleAt_dat();
            }
            
        },true);
        if (cpathfinding_cap == null) {
            cpathfinding_cap = new rmit.ai.clima.jackagt.capabilities.CPathFinding(this);
            cpathfinding_cap.__initCapability(this,"cpathfinding_cap");
        }
        cpathfinding_cap.__init1();
    }
    
    public void __init2()
    {
        super.__init2();
        getNamedObject("bel_players_dat","rmit.ai.clima.jackagt.data.BPlayer");
        getNamedObject("bel_playerTarget_dat","rmit.ai.clima.jackagt.data.BPlayerPosition");
        getNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt");
        getNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp");
        getNamedObject("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.BPlayerPerceptReceived");
        getNamedObject("bel_moveHint_dat","rmit.ai.clima.jackagt.data.BMoveHint");
        getNamedObject("bel_playerClosestGold_dat","rmit.ai.clima.jackagt.data.BPlayerClosestGold");
        getNamedObject("bel_playerPositions_dat","rmit.ai.clima.jackagt.data.BPlayerPosition");
        getNamedObject("bel_playerGold_dat","rmit.ai.clima.jackagt.data.BPlayerGold");
        getNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt");
        efindpath_p = (rmit.ai.clima.jackagt.events.EFindPath) findEvent("rmit.ai.clima.jackagt.events.EFindPath");
        meplayeraction_s = (rmit.ai.clima.jackagt.events.MEPlayerAction) findEvent("rmit.ai.clima.jackagt.events.MEPlayerAction");
        efindclosestgold_p = (rmit.ai.clima.jackagt.events.EFindClosestGold) findEvent("rmit.ai.clima.jackagt.events.EFindClosestGold");
        eupdatebel_p = (rmit.ai.clima.jackagt.events.EUpdateBel) findEvent("rmit.ai.clima.jackagt.events.EUpdateBel");
        echooseplayeractions_p = (rmit.ai.clima.jackagt.events.EChoosePlayerActions) findEvent("rmit.ai.clima.jackagt.events.EChoosePlayerActions");
        meinformagentstatus_p = (rmit.ai.clima.jackagt.events.MEInformAgentStatus) findEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus");
        cpathfinding_cap.__init2();
    }
    
    synchronized private void __init_desc()
    {
        addNamedObject("bel_players_dat","rmit.ai.clima.jackagt.data.BPlayer",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_playerTarget_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_simulationProp_dat","rmit.ai.clima.jackagt.data.SimulationProp",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.BPlayerPerceptReceived",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_moveHint_dat","rmit.ai.clima.jackagt.data.BMoveHint",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_playerClosestGold_dat","rmit.ai.clima.jackagt.data.BPlayerClosestGold",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_playerPositions_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_playerGold_dat","rmit.ai.clima.jackagt.data.BPlayerGold",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",aos.jack.jak.agent.Agent.WRITEABLE);
        cpathfinding_cap = new rmit.ai.clima.jackagt.capabilities.CPathFinding(this);
        cpathfinding_cap.__initCapability(this,"cpathfinding_cap");
        cpathfinding_cap.init_desc();
        addEvent("rmit.ai.clima.jackagt.events.MESimStart",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EFindPath",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EFindPath",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEGameEnd",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEPlayerAction",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEReportPlayerPercept",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EFindClosestGold",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EFindClosestGold",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MESimEnd",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EUpdateBel",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EUpdateBel",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EChoosePlayerActions",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.EChoosePlayerActions",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("rmit.ai.clima.jackagt.events.MEInformAgentStatus",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_EndSimulation",0);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_AssimilatePlayerPercept",0);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_InitSimulation",0);
        addPlan("rmit.ai.clima.jackagt.plans.UpdateCellsAround",0);
        addPlan("rmit.ai.clima.jackagt.plans.Coord_EndGame",0);
        addPlan("rmit.ai.clima.jackagt.plans.PCoord_ChoosePlayerActions",0);
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
        cpathfinding_cap.__bindNames();
    }
    
    private rmit.ai.clima.jackagt.data.BPlayer __named_data_bel_players_dat()
    {
        if (bel_players_dat != null) 
            return bel_players_dat;
        bel_players_dat = new rmit.ai.clima.jackagt.data.BPlayer();
        if (!bel_players_dat.attach(this)) 
            bel_players_dat = null;
        setNamedObject("bel_players_dat","rmit.ai.clima.jackagt.data.BPlayer",bel_players_dat);
        return bel_players_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BPlayerPosition __named_data_bel_playerTarget_dat()
    {
        if (bel_playerTarget_dat != null) 
            return bel_playerTarget_dat;
        bel_playerTarget_dat = new rmit.ai.clima.jackagt.data.BPlayerPosition();
        if (!bel_playerTarget_dat.attach(this)) 
            bel_playerTarget_dat = null;
        setNamedObject("bel_playerTarget_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",bel_playerTarget_dat);
        return bel_playerTarget_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BGoldAt __named_data_bel_goldAt_dat()
    {
        if (bel_goldAt_dat != null) 
            return bel_goldAt_dat;
        bel_goldAt_dat = new rmit.ai.clima.jackagt.data.BGoldAt();
        if (!bel_goldAt_dat.attach(this)) 
            bel_goldAt_dat = null;
        setNamedObject("bel_goldAt_dat","rmit.ai.clima.jackagt.data.BGoldAt",bel_goldAt_dat);
        return bel_goldAt_dat;
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
    
    private rmit.ai.clima.jackagt.data.BPlayerPerceptReceived __named_data_bel_playerPerceptReceived_dat()
    {
        if (bel_playerPerceptReceived_dat != null) 
            return bel_playerPerceptReceived_dat;
        bel_playerPerceptReceived_dat = new rmit.ai.clima.jackagt.data.BPlayerPerceptReceived();
        if (!bel_playerPerceptReceived_dat.attach(this)) 
            bel_playerPerceptReceived_dat = null;
        setNamedObject("bel_playerPerceptReceived_dat","rmit.ai.clima.jackagt.data.BPlayerPerceptReceived",bel_playerPerceptReceived_dat);
        return bel_playerPerceptReceived_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BMoveHint __named_data_bel_moveHint_dat()
    {
        if (bel_moveHint_dat != null) 
            return bel_moveHint_dat;
        bel_moveHint_dat = new rmit.ai.clima.jackagt.data.BMoveHint();
        if (!bel_moveHint_dat.attach(this)) 
            bel_moveHint_dat = null;
        setNamedObject("bel_moveHint_dat","rmit.ai.clima.jackagt.data.BMoveHint",bel_moveHint_dat);
        return bel_moveHint_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BPlayerClosestGold __named_data_bel_playerClosestGold_dat()
    {
        if (bel_playerClosestGold_dat != null) 
            return bel_playerClosestGold_dat;
        bel_playerClosestGold_dat = new rmit.ai.clima.jackagt.data.BPlayerClosestGold();
        if (!bel_playerClosestGold_dat.attach(this)) 
            bel_playerClosestGold_dat = null;
        setNamedObject("bel_playerClosestGold_dat","rmit.ai.clima.jackagt.data.BPlayerClosestGold",bel_playerClosestGold_dat);
        return bel_playerClosestGold_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BPlayerPosition __named_data_bel_playerPositions_dat()
    {
        if (bel_playerPositions_dat != null) 
            return bel_playerPositions_dat;
        bel_playerPositions_dat = new rmit.ai.clima.jackagt.data.BPlayerPosition();
        if (!bel_playerPositions_dat.attach(this)) 
            bel_playerPositions_dat = null;
        setNamedObject("bel_playerPositions_dat","rmit.ai.clima.jackagt.data.BPlayerPosition",bel_playerPositions_dat);
        return bel_playerPositions_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BPlayerGold __named_data_bel_playerGold_dat()
    {
        if (bel_playerGold_dat != null) 
            return bel_playerGold_dat;
        bel_playerGold_dat = new rmit.ai.clima.jackagt.data.BPlayerGold();
        if (!bel_playerGold_dat.attach(this)) 
            bel_playerGold_dat = null;
        setNamedObject("bel_playerGold_dat","rmit.ai.clima.jackagt.data.BPlayerGold",bel_playerGold_dat);
        return bel_playerGold_dat;
    }
    
    private rmit.ai.clima.jackagt.data.BObstacleAt __named_data_bel_obstacleAt_dat()
    {
        if (bel_obstacleAt_dat != null) 
            return bel_obstacleAt_dat;
        bel_obstacleAt_dat = new rmit.ai.clima.jackagt.data.BObstacleAt();
        if (!bel_obstacleAt_dat.attach(this)) 
            bel_obstacleAt_dat = null;
        setNamedObject("bel_obstacleAt_dat","rmit.ai.clima.jackagt.data.BObstacleAt",bel_obstacleAt_dat);
        return bel_obstacleAt_dat;
    }
    
    public void setEnabled(boolean t)
    {
        super.setEnabled(t);
        cpathfinding_cap.setEnabled(t);
    }
    
}
