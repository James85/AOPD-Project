package rmit.ai.clima.jackagt;
import rmit.ai.clima.gui.grid.GridPoint;
import rmit.ai.clima.jackagt.Target;

public class PlayerTarget extends Object implements Comparable
{
   public String name;
   public Target target;
   public int dist;

   public boolean equals (Object obj)
   {
      PlayerTarget pg = (PlayerTarget) obj;
      return pg.dist == this.dist;
   }
   public int compareTo (Object obj)
   {
      PlayerTarget pg = (PlayerTarget) obj;
      return ( this.dist - pg.dist );
   }
}
