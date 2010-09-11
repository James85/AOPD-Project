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

public class CurrentPosition extends aos.jack.jak.beliefset.ClosedWorld {
    static public rmit.ai.clima.jackagt.data.CurrentPosition__Tuple __hole = new rmit.ai.clima.jackagt.data.CurrentPosition__Tuple(true);
    public rmit.ai.clima.jackagt.data.CurrentPosition__Tuple[][] __tables;
    public boolean attach(aos.jack.jak.event.EventRecipient __h)
    {
        java.lang.Object __o = __h;
        if (!super.attach(__h)) 
            return false;
        return true;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor check(int __v0, int __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentPosition__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentPosition__Tuple();
        rmit.ai.clima.jackagt.data.CurrentPosition.__Cursor __c = new rmit.ai.clima.jackagt.data.CurrentPosition.__Cursor(__t);
        __t.posX = __v0;
        __t.posY = __v1;
        __c.init(1,this);
        return __c;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor get(aos.jack.jak.logic.IntegerVariable __v0, aos.jack.jak.logic.IntegerVariable __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentPosition__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentPosition__Tuple();
        rmit.ai.clima.jackagt.data.CurrentPosition.__Cursor __c = new rmit.ai.clima.jackagt.data.CurrentPosition.__Cursor(__t);
        if (!__v0.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("CurrentPosition:get:OO: arg 0 posX Incorrect Variable type");
        if (__v0.isGround()) {
            try {
                __t.posX = __v0.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("CurrentPosition:get:OO: got " + e.toString());
            }
        }
         else 
            __c.posX = __v0;
        if (!__v1.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("CurrentPosition:get:OO: arg 1 posY Incorrect Variable type");
        if (__v1.isGround()) {
            try {
                __t.posY = __v1.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("CurrentPosition:get:OO: got " + e.toString());
            }
        }
         else 
            __c.posY = __v1;
        __c.init(-1,this);
        return __c;
    }
    
    public int keyIndex()
    {
        return 0;
    }
    
    public int fullIndex()
    {
        return 1;
    }
    
    public int nIndexes()
    {
        return 2;
    }
    
    public aos.jack.jak.beliefset.Tuple newTuple()
    {
        return new rmit.ai.clima.jackagt.data.CurrentPosition__Tuple();
    }
    
    public aos.jack.jak.beliefset.Tuple getTuple(int t, int l)
    {
        return __tables[t][l];
    }
    
    public aos.jack.jak.beliefset.Tuple[] newTable(int t)
    {
        return new rmit.ai.clima.jackagt.data.CurrentPosition__Tuple[t];
    }
    
    public aos.jack.jak.beliefset.Tuple[][] newTables(int t)
    {
        return new rmit.ai.clima.jackagt.data.CurrentPosition__Tuple[t][];
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
        __tables = (rmit.ai.clima.jackagt.data.CurrentPosition__Tuple[][]) t;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor newCursor(aos.jack.jak.beliefset.Tuple __t)
    {
        if (__t instanceof rmit.ai.clima.jackagt.data.CurrentPosition__Tuple) 
            return new rmit.ai.clima.jackagt.data.CurrentPosition.__Cursor((rmit.ai.clima.jackagt.data.CurrentPosition__Tuple) __t);
        return null;
    }
    
    public void add(int __v0, int __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        add(__v0,__v1,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void add(int __v0, int __v1, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentPosition__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentPosition__Tuple();
        __t.posX = __v0;
        __t.posY = __v1;
        super.assertTuple(__t,__d);
    }
    
    public void remove(int __v0, int __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        remove(__v0,__v1,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void remove(int __v0, int __v1, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentPosition__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentPosition__Tuple();
        __t.posX = __v0;
        __t.posY = __v1;
        super.retractTuple(__t,__d);
    }
    
    public CurrentPosition()
    {
    }
    
    public CurrentPosition(java.lang.String n)
    {
        super();
        read(n);
    }
    
    class __Cursor extends aos.jack.jak.beliefset.ClosedWorldCursor {
        public rmit.ai.clima.jackagt.data.CurrentPosition__Tuple __tuple = null;
        public aos.jack.jak.logic.Variable posX;
        public aos.jack.jak.logic.Variable posY;
        public __Cursor()
        {
            __tuple = __hole;
        }
        
        public __Cursor(rmit.ai.clima.jackagt.data.CurrentPosition__Tuple __t)
        {
            super();
            __tuple = __t;
        }
        
        public int match(int __ti, int __st, int __c, boolean __k, int __ind)
        {
            rmit.ai.clima.jackagt.data.CurrentPosition__Tuple[] __tab = __tables[__ti];
            rmit.ai.clima.jackagt.data.CurrentPosition__Tuple __t;
            int __sz = __tab.length;
            int __i;
            if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_DB) != 0) {
                aos.jack.jak.core.Jak.log.log("CurrentPosition__Tuple:match:" + __ti + ":" + __st + ":" + __c + ":" + __k + ":" + __ind);
                aos.jack.jak.core.Jak.log.log("Tuple=" + __tuple);
                aos.jack.jak.core.Jak.log.log("Outputs are");
                aos.jack.jak.core.Jak.log.log("  posX:" + posX);
                aos.jack.jak.core.Jak.log.log("  posY:" + posY);
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
                    if (__k) 
                        return __i;
                    if (posX == null) {
                        if (__tuple.posX != __t.posX) 
                            continue;
                    }
                     else {
                        if (!posX.unify(__t.posX)) 
                            continue;
                    }
                    if (posY == null) {
                        if (__tuple.posY != __t.posY) 
                            continue;
                    }
                     else {
                        if (!posY.unify(__t.posY)) 
                            continue;
                    }
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
            if (posX != null) 
                return posX.getEnv().newChoicePoint();
            if (posY != null) 
                return posY.getEnv().newChoicePoint();
            return null;
        }
        
        public boolean isKeyGround()
        {
            return true;
        }
        
    }
}
