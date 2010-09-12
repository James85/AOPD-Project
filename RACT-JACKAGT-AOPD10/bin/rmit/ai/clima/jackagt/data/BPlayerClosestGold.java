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

public class BPlayerClosestGold extends aos.jack.jak.beliefset.ClosedWorld {
    static public rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple __hole = new rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple(true);
    public rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple[][] __tables;
    public boolean attach(aos.jack.jak.event.EventRecipient __h)
    {
        java.lang.Object __o = __h;
        if (!super.attach(__h)) 
            return false;
        return true;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor get(aos.jack.jak.logic.StringVariable __v0, aos.jack.jak.logic.IntegerVariable __v1, aos.jack.jak.logic.IntegerVariable __v2)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple __t = new rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple();
        rmit.ai.clima.jackagt.data.BPlayerClosestGold.__Cursor __c = new rmit.ai.clima.jackagt.data.BPlayerClosestGold.__Cursor(__t);
        if (!__v0.check_unifiable(StringType)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BPlayerClosestGold:get:OOO: arg 0 name Incorrect Variable type");
        if (__v0.isGround()) {
            try {
                __t.name = __v0.as_string();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BPlayerClosestGold:get:OOO: got " + e.toString());
            }
        }
         else 
            __c.name = __v0;
        if (!__v1.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BPlayerClosestGold:get:OOO: arg 1 xCoord Incorrect Variable type");
        if (__v1.isGround()) {
            try {
                __t.xCoord = __v1.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BPlayerClosestGold:get:OOO: got " + e.toString());
            }
        }
         else 
            __c.xCoord = __v1;
        if (!__v2.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BPlayerClosestGold:get:OOO: arg 2 yCoord Incorrect Variable type");
        if (__v2.isGround()) {
            try {
                __t.yCoord = __v2.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BPlayerClosestGold:get:OOO: got " + e.toString());
            }
        }
         else 
            __c.yCoord = __v2;
        __c.init(-1,this);
        return __c;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor getByName(java.lang.String __v0, aos.jack.jak.logic.IntegerVariable __v1, aos.jack.jak.logic.IntegerVariable __v2)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple __t = new rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple();
        rmit.ai.clima.jackagt.data.BPlayerClosestGold.__Cursor __c = new rmit.ai.clima.jackagt.data.BPlayerClosestGold.__Cursor(__t);
        __t.name = __v0;
        if (!__v1.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BPlayerClosestGold:getByName:IOO: arg 1 xCoord Incorrect Variable type");
        if (__v1.isGround()) {
            try {
                __t.xCoord = __v1.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BPlayerClosestGold:getByName:IOO: got " + e.toString());
            }
        }
         else 
            __c.xCoord = __v1;
        if (!__v2.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BPlayerClosestGold:getByName:IOO: arg 2 yCoord Incorrect Variable type");
        if (__v2.isGround()) {
            try {
                __t.yCoord = __v2.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BPlayerClosestGold:getByName:IOO: got " + e.toString());
            }
        }
         else 
            __c.yCoord = __v2;
        __c.init(0,this);
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
        return new rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple();
    }
    
    public aos.jack.jak.beliefset.Tuple getTuple(int t, int l)
    {
        return __tables[t][l];
    }
    
    public aos.jack.jak.beliefset.Tuple[] newTable(int t)
    {
        return new rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple[t];
    }
    
    public aos.jack.jak.beliefset.Tuple[][] newTables(int t)
    {
        return new rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple[t][];
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
        __tables = (rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple[][]) t;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor newCursor(aos.jack.jak.beliefset.Tuple __t)
    {
        if (__t instanceof rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple) 
            return new rmit.ai.clima.jackagt.data.BPlayerClosestGold.__Cursor((rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple) __t);
        return null;
    }
    
    public void add(java.lang.String __v0, int __v1, int __v2)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        add(__v0,__v1,__v2,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void add(java.lang.String __v0, int __v1, int __v2, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple __t = new rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple();
        __t.name = __v0;
        __t.xCoord = __v1;
        __t.yCoord = __v2;
        super.assertTuple(__t,__d);
    }
    
    public void remove(java.lang.String __v0, int __v1, int __v2)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        remove(__v0,__v1,__v2,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void remove(java.lang.String __v0, int __v1, int __v2, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple __t = new rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple();
        __t.name = __v0;
        __t.xCoord = __v1;
        __t.yCoord = __v2;
        super.retractTuple(__t,__d);
    }
    
    public BPlayerClosestGold()
    {
    }
    
    public BPlayerClosestGold(java.lang.String n)
    {
        super();
        read(n);
    }
    
    class __Cursor extends aos.jack.jak.beliefset.ClosedWorldCursor {
        public rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple __tuple = null;
        public aos.jack.jak.logic.Variable name;
        public aos.jack.jak.logic.Variable xCoord;
        public aos.jack.jak.logic.Variable yCoord;
        public __Cursor()
        {
            __tuple = __hole;
        }
        
        public __Cursor(rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple __t)
        {
            super();
            __tuple = __t;
        }
        
        public int match(int __ti, int __st, int __c, boolean __k, int __ind)
        {
            rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple[] __tab = __tables[__ti];
            rmit.ai.clima.jackagt.data.BPlayerClosestGold__Tuple __t;
            int __sz = __tab.length;
            int __i;
            if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_DB) != 0) {
                aos.jack.jak.core.Jak.log.log("BPlayerClosestGold__Tuple:match:" + __ti + ":" + __st + ":" + __c + ":" + __k + ":" + __ind);
                aos.jack.jak.core.Jak.log.log("Tuple=" + __tuple);
                aos.jack.jak.core.Jak.log.log("Outputs are");
                aos.jack.jak.core.Jak.log.log("  name:" + name);
                aos.jack.jak.core.Jak.log.log("  xCoord:" + xCoord);
                aos.jack.jak.core.Jak.log.log("  yCoord:" + yCoord);
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
                    if (name == null) {
                        if (!__tuple.name.equals(__t.name)) 
                            continue;
                    }
                     else {
                        if (!name.unify(__t.name)) 
                            continue;
                    }
                    if (__k) 
                        return __i;
                    if (xCoord == null) {
                        if (__tuple.xCoord != __t.xCoord) 
                            continue;
                    }
                     else {
                        if (!xCoord.unify(__t.xCoord)) 
                            continue;
                    }
                    if (yCoord == null) {
                        if (__tuple.yCoord != __t.yCoord) 
                            continue;
                    }
                     else {
                        if (!yCoord.unify(__t.yCoord)) 
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
            if (name != null) 
                return name.getEnv().newChoicePoint();
            if (xCoord != null) 
                return xCoord.getEnv().newChoicePoint();
            if (yCoord != null) 
                return yCoord.getEnv().newChoicePoint();
            return null;
        }
        
        public boolean isKeyGround()
        {
            if (name != null) 
                return false;
            return true;
        }
        
    }
}