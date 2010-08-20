package rmit.ai.clima.gui.grid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;


/**
 * A GridObject is a GridPoint with a GameGraphic content (e.g., obstacle, gold,
 * agent, enemy) represented as a string
 * 
 * @author Sebastian Sardina
 * @editedBy Phillip Donald
 * @editedBy Abhijeet Anand
 * @editedBy Nitin Yadav
 */

public class GridObject extends GridPoint {
    private static final long      serialVersionUID       = 1L;

    // content of the cell
    private String content;

    /*
     * =========================================================================
     * Set of constructors for this class
     * =======================================================================
     */
    /**
     * Default Constructor for GridObject
     */
    public GridObject() {
        super();
        this.content = null;
    }

    /**
     * Constructor that specifies the position and background of a GridObject
     * 
     * @param gridPoint
     *            The position of this GridObject
     * @param newContent
     *            The background of this GridObject
     
    public GridObject(GridPoint gridPoint, String content) {
        this(gridPoint.getX(), gridPoint.getY(), content);
    }
     */
    
    /**
     * Constructor that specifies the coordinates of a GridObject
     * 
     * @param newx
     *            The x position of the GridObject
     * @param newy
     *            The y position of the GridObject
     */
    public GridObject(int newx, int newy) {
        super(newx, newy);
        this.content=null;
    }

    /**
     * Constructor that specifies the co-ordinates and background of a
     * GridObject
     * 
     * @param newx
     *            The x position of the GridObject
     * @param newy
     *            The y position of the GridObject
     * @param newContent
     *            The string representation of content
     */
    public GridObject(int newx, int newy, String newContent) {
        super(newx, newy);
        this.content = newContent;
    }


    /*
     * =========================================================================
     * Public Static Methods
     * =======================================================================
     */

    /**
     * Returns the content of this GridObject
     * 
     * @return Content of this GridObject
     */
    public String getContent(){return content;}

    /**
     * Returns a string describing the contents of this GridObject
     * 
     * @return A description of the contents of this GridObject
     */
    public String contentToString() {
        return content;
    }

    /**
     * Whether this GridObject is the example implementation of the Default
     * GameGraphic or not.
     * 
     * @return True if this GridObject is unknown
     */
    public boolean isUnknown() {
        return (content.equals("unknown"));
    }

}
