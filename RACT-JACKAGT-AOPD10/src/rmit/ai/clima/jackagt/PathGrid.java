package rmit.ai.clima.jackagt;
import rmit.ai.clima.gui.grid.*;

public class PathGrid
{
   public int width;
   public int height;
   PathNode [] grid;

   public PathGrid (int width, int height)
   {
      this.width = width;
      this.height = height;
      grid = new PathNode[ width * height ];

      for (int x=0; x<width; ++x) {
         for (int y=0; y<height; ++y) {

            PathNode node = new PathNode(); 
            node.pos.x = x;
            node.pos.y = y;
            grid[y * width + x] = node;
         }
      }
   }

   public PathNode getNode (int x, int y)
   {
      return grid[ y * width + x ];
   }

   public PathNode getNode (GridPoint pt)
   {
      return getNode( pt.x, pt.y );
   }
}

