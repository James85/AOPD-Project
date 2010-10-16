package rmit.ai.clima.jackagt;
import rmit.ai.clima.gui.grid.GridPoint;

public class Target
{
   public class Type
   {
      static final int GOLD = 0;
      static final int EXPLORE = 1;
   }
   
   public Type type;
   public GridPoint pos;
   public int weight;
}
