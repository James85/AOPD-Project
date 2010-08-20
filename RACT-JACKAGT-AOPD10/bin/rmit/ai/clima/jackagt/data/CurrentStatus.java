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
import aos.jack.plugin.view.rt.CleanupCursor;
import java.lang.Object;
import aos.jack.jak.cursor.Cursor;

public class CurrentStatus extends aos.jack.jak.beliefset.ClosedWorld {
    static public rmit.ai.clima.jackagt.data.CurrentStatus__Tuple __hole = new rmit.ai.clima.jackagt.data.CurrentStatus__Tuple(true);
    public rmit.ai.clima.jackagt.data.CurrentStatus__Tuple[][] __tables;
    public boolean attach(aos.jack.jak.event.EventRecipient __h)
    {
        java.lang.Object __o = __h;
        if (!super.attach(__h)) 
            return false;
        return true;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor check(boolean __v0, boolean __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentStatus__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentStatus__Tuple();
        rmit.ai.clima.jackagt.data.CurrentStatus.__Cursor __c = new rmit.ai.clima.jackagt.data.CurrentStatus.__Cursor(__t);
        __t.debugConsole = __v0;
        __t.debugGUI = __v1;
        __c.init(-1,this);
        return __c;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor get(aos.jack.jak.logic.BooleanVariable __v0, aos.jack.jak.logic.BooleanVariable __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentStatus__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentStatus__Tuple();
        rmit.ai.clima.jackagt.data.CurrentStatus.__Cursor __c = new rmit.ai.clima.jackagt.data.CurrentStatus.__Cursor(__t);
        if (!__v0.check_unifiable(java.lang.Boolean.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("CurrentStatus:get:OO: arg 0 debugConsole Incorrect Variable type");
        if (__v0.isGround()) {
            try {
                __t.debugConsole = __v0.as_boolean();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("CurrentStatus:get:OO: got " + e.toString());
            }
        }
         else 
            __c.debugConsole = __v0;
        if (!__v1.check_unifiable(java.lang.Boolean.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("CurrentStatus:get:OO: arg 1 debugGUI Incorrect Variable type");
        if (__v1.isGround()) {
            try {
                __t.debugGUI = __v1.as_boolean();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("CurrentStatus:get:OO: got " + e.toString());
            }
        }
         else 
            __c.debugGUI = __v1;
        __c.init(-1,this);
        return __c;
    }
    
    public boolean debugConsole()
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentStatus.__complex_10 __c = new rmit.ai.clima.jackagt.data.CurrentStatus.__complex_10();
        try {
            return __c.__complex_10_debugConsole();
        }
        catch (java.lang.Exception __e) {
            throw new aos.jack.jak.beliefset.BeliefSetException("debugConsole got exception " + __e);
        }
    }
    
    public boolean debugGUI()
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentStatus.__complex_11 __c = new rmit.ai.clima.jackagt.data.CurrentStatus.__complex_11();
        try {
            return __c.__complex_11_debugGUI();
        }
        catch (java.lang.Exception __e) {
            throw new aos.jack.jak.beliefset.BeliefSetException("debugGUI got exception " + __e);
        }
    }
    
    public int keyIndex()
    {
        return 0;
    }
    
    public int fullIndex()
    {
        return -1;
    }
    
    public int nIndexes()
    {
        return 1;
    }
    
    public aos.jack.jak.beliefset.Tuple newTuple()
    {
        return new rmit.ai.clima.jackagt.data.CurrentStatus__Tuple();
    }
    
    public aos.jack.jak.beliefset.Tuple getTuple(int t, int l)
    {
        return __tables[t][l];
    }
    
    public aos.jack.jak.beliefset.Tuple[] newTable(int t)
    {
        return new rmit.ai.clima.jackagt.data.CurrentStatus__Tuple[t];
    }
    
    public aos.jack.jak.beliefset.Tuple[][] newTables(int t)
    {
        return new rmit.ai.clima.jackagt.data.CurrentStatus__Tuple[t][];
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
        __tables = (rmit.ai.clima.jackagt.data.CurrentStatus__Tuple[][]) t;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor newCursor(aos.jack.jak.beliefset.Tuple __t)
    {
        if (__t instanceof rmit.ai.clima.jackagt.data.CurrentStatus__Tuple) 
            return new rmit.ai.clima.jackagt.data.CurrentStatus.__Cursor((rmit.ai.clima.jackagt.data.CurrentStatus__Tuple) __t);
        return null;
    }
    
    public void add(boolean __v0, boolean __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        add(__v0,__v1,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void add(boolean __v0, boolean __v1, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentStatus__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentStatus__Tuple();
        __t.debugConsole = __v0;
        __t.debugGUI = __v1;
        super.assertTuple(__t,__d);
    }
    
    public void remove(boolean __v0, boolean __v1)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        remove(__v0,__v1,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void remove(boolean __v0, boolean __v1, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        rmit.ai.clima.jackagt.data.CurrentStatus__Tuple __t = new rmit.ai.clima.jackagt.data.CurrentStatus__Tuple();
        __t.debugConsole = __v0;
        __t.debugGUI = __v1;
        super.retractTuple(__t,__d);
    }
    
    public CurrentStatus()
    {
    }
    
    public CurrentStatus(java.lang.String n)
    {
        super();
        read(n);
    }
    
    class __Cursor extends aos.jack.jak.beliefset.ClosedWorldCursor {
        public rmit.ai.clima.jackagt.data.CurrentStatus__Tuple __tuple = null;
        public aos.jack.jak.logic.Variable debugConsole;
        public aos.jack.jak.logic.Variable debugGUI;
        public __Cursor()
        {
            __tuple = __hole;
        }
        
        public __Cursor(rmit.ai.clima.jackagt.data.CurrentStatus__Tuple __t)
        {
            super();
            __tuple = __t;
        }
        
        public int match(int __ti, int __st, int __c, boolean __k, int __ind)
        {
            rmit.ai.clima.jackagt.data.CurrentStatus__Tuple[] __tab = __tables[__ti];
            rmit.ai.clima.jackagt.data.CurrentStatus__Tuple __t;
            int __sz = __tab.length;
            int __i;
            if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_DB) != 0) {
                aos.jack.jak.core.Jak.log.log("CurrentStatus__Tuple:match:" + __ti + ":" + __st + ":" + __c + ":" + __k + ":" + __ind);
                aos.jack.jak.core.Jak.log.log("Tuple=" + __tuple);
                aos.jack.jak.core.Jak.log.log("Outputs are");
                aos.jack.jak.core.Jak.log.log("  debugConsole:" + debugConsole);
                aos.jack.jak.core.Jak.log.log("  debugGUI:" + debugGUI);
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
                    if (debugConsole == null) {
                        if (__tuple.debugConsole != __t.debugConsole) 
                            continue;
                    }
                     else {
                        if (!debugConsole.unify(__t.debugConsole)) 
                            continue;
                    }
                    if (debugGUI == null) {
                        if (__tuple.debugGUI != __t.debugGUI) 
                            continue;
                    }
                     else {
                        if (!debugGUI.unify(__t.debugGUI)) 
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
            if (debugConsole != null) 
                return debugConsole.getEnv().newChoicePoint();
            if (debugGUI != null) 
                return debugGUI.getEnv().newChoicePoint();
            return null;
        }
        
        public boolean isKeyGround()
        {
            return true;
        }
        
    }
    class __complex_10 extends aos.jack.plugin.view.rt.CleanupCursor {
        aos.jack.jak.logic.BooleanVariable __local_2;
        aos.jack.jak.logic.BooleanVariable __local_3;
        public java.lang.Object genObject(int __index)
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal Object Construction");
            return null;
        }
        
        public aos.jack.jak.cursor.Cursor genCursor(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
                case 0: 
                {
                    return (get(__local_2,__local_3));
                }
            }
            aos.jack.jak.core.Jak.error("illegal Cursor Construction");
            return null;
        }
        
        public aos.jack.jak.fsm.FSM genFSM(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal FSM Construction");
            return null;
        }
        
        public boolean testCondition(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal test Construction");
            return false;
        }
        
        public __complex_10()
        {
            super();
        }
        
        public boolean __complex_10_debugConsole()
            throws java.lang.Exception
        {
            {
                __local_2 = (aos.jack.jak.logic.BooleanVariable) new_variable(java.lang.Boolean.TYPE);
                __local_3 = (aos.jack.jak.logic.BooleanVariable) new_variable(java.lang.Boolean.TYPE);
            }
            if (genCursor(0).next()) {
                return __local_2.as_boolean();
            }
             else 
                return false;
        }
        
    }
    class __complex_11 extends aos.jack.plugin.view.rt.CleanupCursor {
        aos.jack.jak.logic.BooleanVariable __local_2;
        aos.jack.jak.logic.BooleanVariable __local_3;
        public java.lang.Object genObject(int __index)
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal Object Construction");
            return null;
        }
        
        public aos.jack.jak.cursor.Cursor genCursor(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
                case 0: 
                {
                    return (get(__local_2,__local_3));
                }
            }
            aos.jack.jak.core.Jak.error("illegal Cursor Construction");
            return null;
        }
        
        public aos.jack.jak.fsm.FSM genFSM(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal FSM Construction");
            return null;
        }
        
        public boolean testCondition(int __index)
            throws java.lang.Exception
        {
            switch (__index) {
            }
            aos.jack.jak.core.Jak.error("illegal test Construction");
            return false;
        }
        
        public __complex_11()
        {
            super();
        }
        
        public boolean __complex_11_debugGUI()
            throws java.lang.Exception
        {
            {
                __local_2 = (aos.jack.jak.logic.BooleanVariable) new_variable(java.lang.Boolean.TYPE);
                __local_3 = (aos.jack.jak.logic.BooleanVariable) new_variable(java.lang.Boolean.TYPE);
            }
            if (genCursor(0).next()) {
                return __local_3.as_boolean();
            }
             else 
                return true;
        }
        
    }
}
