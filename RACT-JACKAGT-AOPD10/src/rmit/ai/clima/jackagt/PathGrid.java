package rmit.ai.clima.jackagt;
import rmit.ai.clima.gui.grid.*;

public class PathGrid
{
   //handle to the PathGrid Singleton
   private static PathGrid instance = null;
   
   public int width;
   public int height;
   PathNode [] grid;
   
      
   public static PathGrid getInstance(int width, int height)
   {
      if(instance == null)
      {
         instance = new PathGrid( width, height );
         System.out.println("Instantiating the grid");
      }
      return instance;
   }
   
   public static void Reset()
   {
      instance = null;
   }
   
   public void Clean()
   {
      for (int x=0; x<this.width; ++x) {
         for (int y=0; y<this.height; ++y) {

            PathNode node =  grid[y * width + x]; 
            node.visited = false;
            node.obstacle = false;
         }
      }
   }

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

