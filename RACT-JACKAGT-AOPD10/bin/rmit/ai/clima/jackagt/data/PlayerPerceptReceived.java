/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.data;
import aos.jack.jak.core.Jak;
import aos.jack.jak.event.EventRecipient;
import aos.jack.jak.beliefset.ClosedWorld;
import aos.jack.jak.beliefset.ClosedWorldCursor;
import aos.jack.jak.beliefset.BeliefSetCursor;
import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.jak.beliefset.Tuple;
import aos.jack.jak.beliefset.BeliefSet;
import aos.jack.jak.logic.ChoicePoint;
import aos.jack.jak.logic.Variable;
import aos.jack.jak.cursor.BeliefState;
import aos.jack.jak.cursor.Cursor;

public class PlayerPerceptReceived extends aos.jack.jak.beliefset.ClosedWorld {
    static public rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple __hole = new rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple(true);
    public rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple[][] __tables;
    public boolean attach(aos.jack.jak.event.EventRecipient __h)
    {
        java.lang.Object __o = __h;
        if (!super.attach(__h)) 
            return false;
        return true;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor get(aos.jack.jak.logic.StringVariable __v0)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple __t = new rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple();
        rmit.ai.clima.jackagt.data.PlayerPerceptReceived.__Cursor __c = new rmit.ai.clima.jackagt.data.PlayerPerceptReceived.__Cursor(__t);
        if (!__v0.check_unifiable(StringType)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("PlayerPerceptReceived:get:O: arg 0 agentName Incorrect Variable type");
        if (__v0.isGround()) {
            try {
                __t.agentName = __v0.as_string();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("PlayerPerceptReceived:get:O: got " + e.toString());
            }
        }
         else 
            __c.agentName = __v0;
        __c.init(-1,this);
        return __c;
    }
    
    public int keyIndex()
    {
        return 0;
    }
    
    public int fullIndex()
    {
        return 0;
    }
    
    public int nIndexes()
    {
        return 2;
    }
    
    public aos.jack.jak.beliefset.Tuple newTuple()
    {
        return new rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple();
    }
    
    public aos.jack.jak.beliefset.Tuple getTuple(int t, int l)
    {
        return __tables[t][l];
    }
    
    public aos.jack.jak.beliefset.Tuple[] newTable(int t)
    {
        return new rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple[t];
    }
    
    public aos.jack.jak.beliefset.Tuple[][] newTables(int t)
    {
        return new rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple[t][];
    }
    
    public aos.jack.jak.beliefset.Tuple[] getTable(int t)
    {
        return __tables[t];
    }
    
    public aos.jack.jak.beliefset.Tuple[][] getTables()
    {
        return __tables;
    }
    
    public void setTables(aos.jack.jak.beliefset.Tuple[][] t)
    {
        __tables = (rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple[][]) t;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor newCursor(aos.jack.jak.beliefset.Tuple __t)
    {
        if (__t instanceof rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple) 
            return new rmit.ai.clima.jackagt.data.PlayerPerceptReceived.__Cursor((rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple) __t);
        return null;
    }
    
    public void add(java.lang.String __v0)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        add(__v0,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void add(java.lang.String __v0, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple __t = new rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple();
        __t.agentName = __v0;
        super.assertTuple(__t,__d);
    }
    
    public void remove(java.lang.String __v0)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        remove(__v0,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void remove(java.lang.String __v0, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple __t = new rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple();
        __t.agentName = __v0;
        super.retractTuple(__t,__d);
    }
    
    public PlayerPerceptReceived()
    {
    }
    
    public PlayerPerceptReceived(java.lang.String n)
    {
        super();
        read(n);
    }
    
    class __Cursor extends aos.jack.jak.beliefset.ClosedWorldCursor {
        public rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple __tuple = null;
        public aos.jack.jak.logic.Variable agentName;
        public __Cursor()
        {
            __tuple = __hole;
        }
        
        public __Cursor(rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple __t)
        {
            super();
            __tuple = __t;
        }
        
        public int match(int __ti, int __st, int __c, boolean __k, int __ind)
        {
            rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple[] __tab = __tables[__ti];
            rmit.ai.clima.jackagt.data.PlayerPerceptReceived__Tuple __t;
            int __sz = __tab.length;
            int __i;
            if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_DB) != 0) {
                aos.jack.jak.core.Jak.log.log("PlayerPerceptReceived__Tuple:match:" + __ti + ":" + __st + ":" + __c + ":" + __k + ":" + __ind);
                aos.jack.jak.core.Jak.log.log("Tuple=" + __tuple);
                aos.jack.jak.core.Jak.log.log("Outputs are");
                aos.jack.jak.core.Jak.log.log("  agentName:" + agentName);
            }
            for (__i = __st; __c > 0; __i = (__i + 1) % __sz, __c-- ) {
                __t = __tab[__i];
                if (__t == null) {
                    if (__ind < 0) 
                        continue;
                    return -1;
                }
                if (__t == __hole) 
                    continue;
                if (__t.isFree) {
                    __tab[__i] = __hole;
                    continue;
                }
                if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_DB) != 0) 
                    aos.jack.jak.core.Jak.log.log("t" + __i + ":" + __t);
                try {
                    if (cp != null) 
                        cp.backtrack();
                    if (agentName == null) {
                        if (!__tuple.agentName.equals(__t.agentName)) 
                            continue;
                    }
                     else {
                        if (!agentName.unify(__t.agentName)) 
                            continue;
                    }
                    if (__k) 
                        return __i;
                }
                catch (java.lang.Exception e) {
                    continue;
                }
                return __i;
            }
            return -1;
        }
        
        public int hash(int __i)
        {
            return (__tuple == null?0:__tuple.hash(__i));
        }
        
        public aos.jack.jak.logic.ChoicePoint getChoicePoint()
        {
            if (agentName != null) 
                return agentName.getEnv().newChoicePoint();
            return null;
        }
        
        public boolean isKeyGround()
        {
            if (agentName != null) 
                return false;
            return true;
        }
        
    }
}
