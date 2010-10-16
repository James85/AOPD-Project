package rmit.ai.clima.jackagt;
import rmit.ai.clima.gui.grid.GridPoint;

public class Target
{
   public enum Type
   {
      Gold,
      Explore
   }
   
   public Type type;
   public GridPoint pos;
   public int weight;
}
