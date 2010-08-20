package rmit.ai.clima.gui.grid;

import java.awt.Color;
import java.util.HashMap;

import rmit.ai.clima.gui.graphic.GameGraphic;
import rmit.ai.clima.gui.graphic.GraphicModel;

/**
 * GameGraphics class provides the game graphics used by the gui agent
 * 
 * @author Nitin Yadav
 */
public class GameGraphics {

	/***
	 * graphic objects for various elements of the gold domain
	 */
	static GameGraphic emptyGraphic = new GameGraphic("Empty", 
			GraphicModel.Shape.EMPTY,  java.awt.Color.WHITE, 5, false);
	static GameGraphic obstacleGraphic = new GameGraphic("Obstacle",
			GraphicModel.Shape.RECTANGLE, Color.GREEN, GameGraphic.STATIC_OBJECT, false);
	static GameGraphic goldGraphic = new GameGraphic("Gold", 
			GraphicModel.Shape.DIAMOND, java.awt.Color.YELLOW, 3, false);
	static GameGraphic depotGraphic = new GameGraphic("Depot", 
			GraphicModel.Shape.CYLINDER, Color.RED, 2, false);
	static	GameGraphic agentGraphic = new GameGraphic("Agent", GraphicModel.Shape.CIRCLE,
	            Color.BLUE, 1, false);   
	static GameGraphic unknownGraphic = new GameGraphic("Unknown",
			GraphicModel.Shape.EMPTY,java.awt.Color.GRAY,7,false);
	
	// mapping of string to objects
	static HashMap map = null;
	
	/***
	 * string representation for various elements of the gold domain 
	 */	
	static String emptyString = "empty";
	static String obstacleString = "obstacle";
	static String goldString = "gold";
	static String depotString = "depot";
	static String agentString = "agent";
	static String unknownString = "unknown";
	
	/***
	 * Methods to get the graphic objects
	 */
	public static GameGraphic getAgentGraphic(){return agentGraphic;}
	public static GameGraphic getEmptyGraphic(){return emptyGraphic;}
	public static GameGraphic getGoldGraphic(){return goldGraphic;}
	public static GameGraphic getDepotGraphic(){return depotGraphic;}
	public static GameGraphic getObstacleGraphic(){return obstacleGraphic;}
	
	/***
	 * Methods to get the string representation of graphic objects
	 */
	public static String getAgentString(){return agentString;}
	public static String getEmptyString(){return emptyString;}
	public static String getGoldString(){return goldString;}
	public static String getDepotString(){return depotString;}
	public static String getObstacleString(){return obstacleString;}
	
	/***
	 * get the gamegraphic ojbect given its string
	 */
	public static GameGraphic getGraphicObject(String desc)
	{
		if(map==null){fillMap();}
		return (GameGraphic)map.get(desc);
	}

	private static void fillMap() {
		map = new HashMap();
		map.put(agentString, agentGraphic);
		map.put(depotString, depotGraphic);
		map.put(emptyString, emptyGraphic);
		map.put(goldString, goldGraphic);
		map.put(obstacleString, obstacleGraphic);
		map.put(unknownString, unknownGraphic);
	}
}
