package rmit.ai.clima.jackagt;
import rmit.ai.clima.gui.grid.GridPoint;

public class PlayerGold extends Object implements Comparable
{
   public String name;
   public GridPoint pos;
   public int dist;

   public boolean equals(Object obj)
   {
      PlayerGold pg = (PlayerGold) obj;
      return pg.dist == this.dist;
   }
   public int compareTo(Object obj)
   {
      PlayerGold pg = (PlayerGold) obj;
      return ( this.dist - pg.dist );
   }
}
