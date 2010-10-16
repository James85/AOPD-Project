package rmit.ai.clima.jackagt;
import rmit.ai.clima.gui.grid.GridPoint;

public class Target
{
   public class Type
   {
      public static final int GOLD = 0;
      public static final int EXPLORE = 1;
   }
   
   public int type;
   public GridPoint pos;
   public int weight;
}
