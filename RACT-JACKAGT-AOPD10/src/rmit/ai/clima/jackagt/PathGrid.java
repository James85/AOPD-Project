package rmit.ai.clima.jackagt;
import rmit.ai.clima.gui.grid.*;

public class PathGrid
{
   //handle to the PathGrid Singleton
   private static PathGrid instance = null;

   public int width;
   public int height;
   public boolean gotObstacles;
   PathNode [] grid;


   public static PathGrid InitInstance(int width, int height)
   {
      if(instance == null)
      {
         System.out.println("Instantiating the grid");
         instance = new PathGrid( width, height );
      }
      return instance;
   }
   
   public static PathGrid GetInstance() throws Exception
   {
      if(instance == null) throw new Exception("Trying to access uninstantiated PathGrid!!!");
      return instance;
   }

   public static void ReleaseInstance()
   {
      instance = null;
   }

   public PathGrid (int width, int height)
   {
      this.width = width;
      this.height = height;
      this.gotObstacles = false;
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
   
   public void clearObstacles()
   {
      this.gotObstacles = false;
      for (int x=0; x<this.width; ++x) {
         for (int y=0; y<this.height; ++y) {

            PathNode node = getNode(x,y);
            node.obstacle = false;
            node.visited = false;
            node.f = 0;
            node.g = 0;
            node.h = 0;
         }
      }
   }

   public void clearNodes()
   {
      for (int x=0; x<this.width; ++x) {
         for (int y=0; y<this.height; ++y) {

            PathNode node = getNode(x,y);
            node.visited = false;
            node.f = 0;
            node.g = 0;
            node.h = 0;
         }
      }
   }

   public PathNode getNode (GridPoint pt)
   {
      return getNode( pt.x, pt.y );
   }
   
   public PathNode getNode (int x, int y)
   {
      return grid[ y * width + x ];
   }
}

