package rmit.ai.clima.jackagt;
import rmit.ai.clima.gui.grid.GridPoint;

public class UnexploredBlock
{
   public int count;
   public GridPoint center;
   public GridPoint pivot;
   public int pivotDist;
   
   public UnexploredBlock( GridPoint center)
   {
      this.count = 0;
      this.center = center;
      this.pivot = center;
      this.pivotDist = 0;
   }
}
