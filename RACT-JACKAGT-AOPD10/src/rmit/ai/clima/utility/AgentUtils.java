package rmit.ai.clima.utility;

/*
 * This is a class containing several general utilities that the agent may use
 * at different places
 * 
 **/


public class AgentUtils
{
	

	// Extract the agent number (4) from an agent name like "player4@portal"
	// OBS: the current implementation requires agents to be called playerN@
	// 	where N being the player number
	public static int extractAgentNoFromMessage(String agentName)	{
	   int endIndex = agentName.indexOf("@");
		
		return Integer.parseInt(agentName.substring(6,endIndex))-1;
	}

	
	public static void reportMessage(String message)	{
		System.out.println(message);
	}
	
}