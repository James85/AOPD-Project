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

public class BMoveHint extends aos.jack.jak.beliefset.ClosedWorld {
    static public rmit.ai.clima.jackagt.data.BMoveHint__Tuple __hole = new rmit.ai.clima.jackagt.data.BMoveHint__Tuple(true);
    public rmit.ai.clima.jackagt.data.BMoveHint__Tuple[][] __tables;
    public boolean attach(aos.jack.jak.event.EventRecipient __h)
    {
        java.lang.Object __o = __h;
        if (!super.attach(__h)) 
            return false;
        return true;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor getByEndPoints(int __v0, int __v1, int __v2, int __v3, aos.jack.jak.logic.StringVariable __v4, aos.jack.jak.logic.IntegerVariable __v5)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.BMoveHint__Tuple __t = new rmit.ai.clima.jackagt.data.BMoveHint__Tuple();
        rmit.ai.clima.jackagt.data.BMoveHint.__Cursor __c = new rmit.ai.clima.jackagt.data.BMoveHint.__Cursor(__t);
        __t.srcX = __v0;
        __t.srcY = __v1;
        __t.endX = __v2;
        __t.endY = __v3;
        if (!__v4.check_unifiable(StringType)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:getByEndPoints:IIIIOO: arg 4 move Incorrect Variable type");
        if (__v4.isGround()) {
            try {
                __t.move = __v4.as_string();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:getByEndPoints:IIIIOO: got " + e.toString());
            }
        }
         else 
            __c.move = __v4;
        if (!__v5.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:getByEndPoints:IIIIOO: arg 5 length Incorrect Variable type");
        if (__v5.isGround()) {
            try {
                __t.length = __v5.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:getByEndPoints:IIIIOO: got " + e.toString());
            }
        }
         else 
            __c.length = __v5;
        __c.init(0,this);
        return __c;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor get(aos.jack.jak.logic.IntegerVariable __v0, aos.jack.jak.logic.IntegerVariable __v1, aos.jack.jak.logic.IntegerVariable __v2, aos.jack.jak.logic.IntegerVariable __v3, aos.jack.jak.logic.StringVariable __v4, aos.jack.jak.logic.IntegerVariable __v5)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.BMoveHint__Tuple __t = new rmit.ai.clima.jackagt.data.BMoveHint__Tuple();
        rmit.ai.clima.jackagt.data.BMoveHint.__Cursor __c = new rmit.ai.clima.jackagt.data.BMoveHint.__Cursor(__t);
        if (!__v0.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: arg 0 srcX Incorrect Variable type");
        if (__v0.isGround()) {
            try {
                __t.srcX = __v0.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: got " + e.toString());
            }
        }
         else 
            __c.srcX = __v0;
        if (!__v1.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: arg 1 srcY Incorrect Variable type");
        if (__v1.isGround()) {
            try {
                __t.srcY = __v1.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: got " + e.toString());
            }
        }
         else 
            __c.srcY = __v1;
        if (!__v2.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: arg 2 endX Incorrect Variable type");
        if (__v2.isGround()) {
            try {
                __t.endX = __v2.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: got " + e.toString());
            }
        }
         else 
            __c.endX = __v2;
        if (!__v3.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: arg 3 endY Incorrect Variable type");
        if (__v3.isGround()) {
            try {
                __t.endY = __v3.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: got " + e.toString());
            }
        }
         else 
            __c.endY = __v3;
        if (!__v4.check_unifiable(StringType)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: arg 4 move Incorrect Variable type");
        if (__v4.isGround()) {
            try {
                __t.move = __v4.as_string();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: got " + e.toString());
            }
        }
         else 
            __c.move = __v4;
        if (!__v5.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: arg 5 length Incorrect Variable type");
        if (__v5.isGround()) {
            try {
                __t.length = __v5.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("BMoveHint:get:OOOOOO: got " + e.toString());
            }
        }
         else 
            __c.length = __v5;
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
        return new rmit.ai.clima.jackagt.data.BMoveHint__Tuple();
    }
    
    public aos.jack.jak.beliefset.Tuple getTuple(int t, int l)
    {
        return __tables[t][l];
    }
    
    public aos.jack.jak.beliefset.Tuple[] newTable(int t)
    {
        return new rmit.ai.clima.jackagt.data.BMoveHint__Tuple[t];
    }
    
    public aos.jack.jak.beliefset.Tuple[][] newTables(int t)
    {
        return new rmit.ai.clima.jackagt.data.BMoveHint__Tuple[t][];
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
        __tables = (rmit.ai.clima.jackagt.data.BMoveHint__Tuple[][]) t;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor newCursor(aos.jack.jak.beliefset.Tuple __t)
    {
        if (__t instanceof rmit.ai.clima.jackagt.data.BMoveHint__Tuple) 
            return new rmit.ai.clima.jackagt.data.BMoveHint.__Cursor((rmit.ai.clima.jackagt.data.BMoveHint__Tuple) __t);
        return null;
    }
    
    public void add(int __v0, int __v1, int __v2, int __v3, java.lang.String __v4, int __v5)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        add(__v0,__v1,__v2,__v3,__v4,__v5,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void add(int __v0, int __v1, int __v2, int __v3, java.lang.String __v4, int __v5, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.BMoveHint__Tuple __t = new rmit.ai.clima.jackagt.data.BMoveHint__Tuple();
        __t.srcX = __v0;
        __t.srcY = __v1;
        __t.endX = __v2;
        __t.endY = __v3;
        __t.move = __v4;
        __t.length = __v5;
        super.assertTuple(__t,__d);
    }
    
    public void remove(int __v0, int __v1, int __v2, int __v3, java.lang.String __v4, int __v5)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        remove(__v0,__v1,__v2,__v3,__v4,__v5,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void remove(int __v0, int __v1, int __v2, int __v3, java.lang.String __v4, int __v5, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.BMoveHint__Tuple __t = new rmit.ai.clima.jackagt.data.BMoveHint__Tuple();
        __t.srcX = __v0;
        __t.srcY = __v1;
        __t.endX = __v2;
        __t.endY = __v3;
        __t.move = __v4;
        __t.length = __v5;
        super.retractTuple(__t,__d);
    }
    
    public BMoveHint()
    {
    }
    
    public BMoveHint(java.lang.String n)
    {
        super();
        read(n);
    }
    
    class __Cursor extends aos.jack.jak.beliefset.ClosedWorldCursor {
        public rmit.ai.clima.jackagt.data.BMoveHint__Tuple __tuple = null;
        public aos.jack.jak.logic.Variable srcX;
        public aos.jack.jak.logic.Variable srcY;
        public aos.jack.jak.logic.Variable endX;
        public aos.jack.jak.logic.Variable endY;
        public aos.jack.jak.logic.Variable move;
        public aos.jack.jak.logic.Variable length;
        public __Cursor()
        {
            __tuple = __hole;
        }
        
        public __Cursor(rmit.ai.clima.jackagt.data.BMoveHint__Tuple __t)
        {
            super();
            __tuple = __t;
        }
        
        public int match(int __ti, int __st, int __c, boolean __k, int __ind)
        {
            rmit.ai.clima.jackagt.data.BMoveHint__Tuple[] __tab = __tables[__ti];
            rmit.ai.clima.jackagt.data.BMoveHint__Tuple __t;
            int __sz = __tab.length;
            int __i;
            if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_DB) != 0) {
                aos.jack.jak.core.Jak.log.log("BMoveHint__Tuple:match:" + __ti + ":" + __st + ":" + __c + ":" + __k + ":" + __ind);
                aos.jack.jak.core.Jak.log.log("Tuple=" + __tuple);
                aos.jack.jak.core.Jak.log.log("Outputs are");
                aos.jack.jak.core.Jak.log.log("  srcX:" + srcX);
                aos.jack.jak.core.Jak.log.log("  srcY:" + srcY);
                aos.jack.jak.core.Jak.log.log("  endX:" + endX);
                aos.jack.jak.core.Jak.log.log("  endY:" + endY);
                aos.jack.jak.core.Jak.log.log("  move:" + move);
                aos.jack.jak.core.Jak.log.log("  length:" + length);
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
                    if (srcX == null) {
                        if (__tuple.srcX != __t.srcX) 
                            continue;
                    }
                     else {
                        if (!srcX.unify(__t.srcX)) 
                            continue;
                    }
                    if (srcY == null) {
                        if (__tuple.srcY != __t.srcY) 
                            continue;
                    }
                     else {
                        if (!srcY.unify(__t.srcY)) 
                            continue;
                    }
                    if (endX == null) {
                        if (__tuple.endX != __t.endX) 
                            continue;
                    }
                     else {
                        if (!endX.unify(__t.endX)) 
                            continue;
                    }
                    if (endY == null) {
                        if (__tuple.endY != __t.endY) 
                            continue;
                    }
                     else {
                        if (!endY.unify(__t.endY)) 
                            continue;
                    }
                    if (__k) 
                        return __i;
                    if (move == null) {
                        if (!__tuple.move.equals(__t.move)) 
                            continue;
                    }
                     else {
                        if (!move.unify(__t.move)) 
                            continue;
                    }
                    if (length == null) {
                        if (__tuple.length != __t.length) 
                            continue;
                    }
                     else {
                        if (!length.unify(__t.length)) 
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
            if (srcX != null) 
                return srcX.getEnv().newChoicePoint();
            if (srcY != null) 
                return srcY.getEnv().newChoicePoint();
            if (endX != null) 
                return endX.getEnv().newChoicePoint();
            if (endY != null) 
                return endY.getEnv().newChoicePoint();
            if (move != null) 
                return move.getEnv().newChoicePoint();
            if (length != null) 
                return length.getEnv().newChoicePoint();
            return null;
        }
        
        public boolean isKeyGround()
        {
            if (srcX != null) 
                return false;
            if (srcY != null) 
                return false;
            if (endX != null) 
                return false;
            if (endY != null) 
                return false;
            return true;
        }
        
    }
}
