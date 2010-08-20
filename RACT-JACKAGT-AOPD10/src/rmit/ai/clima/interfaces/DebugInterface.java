/*
 * AgentInterface.java
 *
 * Created on July 7, 2008, 10:55 AM
 *
 */
package rmit.ai.clima.interfaces;

/**
 *
 * @author Dave
 */
public interface DebugInterface {

   public abstract void showDebug(String Entity, String Message);
   public abstract void showDebug(String Message);
   public abstract void showConsoleDebug(String Entity, String Message);
   public abstract void showConsoleDebug(String Message);
}
