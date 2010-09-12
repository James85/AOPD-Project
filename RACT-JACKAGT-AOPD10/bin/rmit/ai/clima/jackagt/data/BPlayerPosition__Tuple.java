

/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.data;
import aos.jack.jak.beliefset.ClosedWorld;
import aos.jack.jak.beliefset.Tuple;

/** Automatically generated class from 'null'. */
public class BPlayerPosition__Tuple extends aos.jack.jak.beliefset.Tuple implements aos.apib.Base, java.io.Serializable {

  public static final __SS streamer = new __SS();

  /** Automatically generated method. */
  public aos.apib.StreamerSupport getStreamer()
    { return streamer; }

  /** Automatically generated method. */
  public int hashCode() {
     streamer.setup();
     return aos.apib.Util.hashCode(this);
  }

  /** Automatically generated method. */
  public boolean equals(Object o) {
     if (!(o instanceof aos.apib.Base)) return false;
     return aos.apib.Util.equals(this, (aos.apib.Base)o);
  }

  public String	agentName;
  public int	posX;
  public int	posY;


public BPlayerPosition__Tuple(boolean v)
{
    super();
    isFree = v;
}



public java.lang.String name()
{
    return "BPlayerPosition__Tuple";
}



public java.lang.String toString()
{
    java.lang.StringBuffer __s = new java.lang.StringBuffer();
    __s.append(agentName);
    __s.append(":");
    __s.append(posX);
    __s.append(":");
    __s.append(posY);
    return __s.toString();
}



public int hash(int __i)
{
    int __r = 0;
    switch (__i) {
        case 0: 
        {
            __r ^= (agentName.hashCode() & (~(1 << 31)));
            return __r;
        }
        case 1: 
        {
            return __r;
        }
        case 2: 
        {
            __r ^= (((int) (posY ^ (posY << 13))) & (~(1 << 31)));
            __r ^= (((int) (posX ^ (posX << 13))) & (~(1 << 31)));
            return __r;
        }
    }
    return 0;
}


  /** Automatically generated constructor. */
  public BPlayerPosition__Tuple() {
    streamer.setup();
    if (!getStreamer().initialized) return;
    __init__BPlayerPosition__Tuple();
  }

  /** Automatically generated method. */
  void __init__BPlayerPosition__Tuple() {
	agentName = null;
	posX = 0;
	posY = 0;

  }

  /** Automatically generated JACOB streamer class */
  static class __SS extends aos.apib.StreamerSupport {
    BPlayerPosition__Tuple __def = null;

    /** Return a static instance. */

    public aos.apib.Base getDefaultInstance() { return __def; }

    private String[] fn = {
    ":agentName",
    ":posX",
    ":posY",
    };

    private String[] dn = {
    ":agentName",
    ":posX",
    ":posY",
    };

    private boolean[] ftr = {
    false,
    false,
    false,
    };

    private boolean[] fst = {
    false,
    false,
    false,
    };

    private boolean[] fhd = {
    false,
    false,
    false,
    };

    private int[] ft = {
    11,
    3,
    3,
    };

    private aos.apib.EnumInfo[] fe = {
	null,
	null,
	null,
    };

    private String[] cm = {
    null,
    null,
    null,
    };


    private aos.apib.StreamerSupport[][] al = {
	null,
	null,
	null,
    };

    private String[] fsubt = {
    null, 
    null, 
    null, 
    };

    /** Construct the streamer. */
    public __SS() {
      __type = "BPlayerPosition__Tuple";
      __icon = null;
      __comment = "Auto generated by the JACK Agents Compiler";
      __field_names = fn;
      __display_names = dn;
      __field_types = ft;
      __field_static = fst;
      __field_hidden = fhd;
      __field_transient = ftr;
      __field_subtypes = fsubt;
      __field_comments = cm;
      __enuminfos = fe;
      __allowed = al;
      register(__type, this);
    }

    private boolean setup_done = false;

    /** Initialization. */
    protected void setup() {
      if ( setup_done ) return;

      setup_done = true; 

      __def = (BPlayerPosition__Tuple)newInstance();
      setStreamedType(__def.getClass());
      baseclasses = findBaseStreamer(__def.getClass());
    }

    /** Initialization. */
    protected void init() {
      setup();
      __def.__init__BPlayerPosition__Tuple();
    }

    /** JACOB method. */
    public boolean isDummy() { return false; }

    /** JACOB method. */
    public aos.apib.Base new_instance() {
      return new BPlayerPosition__Tuple();
    }

    /** JACOB method. */
    public aos.apib.Base[] new_array(int n) {
      return new BPlayerPosition__Tuple[n];
    }

    /** JACOB class reading method. */
    public boolean read(aos.apib.InStream in, aos.apib.Base o) {
      int i = -1;
      while ((i = in.nextField(i, this)) >= 0) {
        if ( !readField( in, o, i ) ) {
          return false;
        }
      }
      return true;
    }

    /** JACOB method to read fields. */
    public boolean readField(aos.apib.InStream in, aos.apib.Base o,int i) {
      if ( i > __field_names.length )
        return getBaseClassStreamer().readField( in, o, i - __field_names.length - 1 );
      BPlayerPosition__Tuple v = (BPlayerPosition__Tuple)o;
      switch (i) {
      case 0:
	v.agentName = in.getString(true);
	break;
   case 1:
	v.posX = in.getInt();
	break;
   case 2:
	v.posY = in.getInt();
	break;
      case 3:
        in.readBaseClasses(o, this, 0);
        break;
      default:
        if (i >= 0 && i <= 3) break;
        in.error("Reader for BPlayerPosition__Tuple: illegal field number:"+i);
        return false;
      }
      return true;
    }

    /** JACOB class writing method. */
    public boolean write(aos.apib.OutStream out, aos.apib.Base o) {
      BPlayerPosition__Tuple v = (BPlayerPosition__Tuple)o;
      int i = -1;
      while ((i = out.nextField(i, this)) >= 0) {
        switch (i) {
      case 0:
	out.putString(v.agentName, i, __def.agentName, this);
	break;
   case 1:
	out.putInt(v.posX, i, __def.posX, this);
	break;
   case 2:
	out.putInt(v.posY, i, __def.posY, this);
	break;
        case 3:
          out.writeBaseClasses(o, this);
          break;
        default:
          if (i >= 0 && i <= 3) break;
          out.error("Writer for BPlayerPosition__Tuple: illegal field number:"+i);
          return false;
        }
      }
      return true;
    }

    /** JACOB method. */
    public boolean isDefault(aos.apib.Base o) {
      BPlayerPosition__Tuple v = (BPlayerPosition__Tuple)o;

	if (v.agentName != __def.agentName) {
	   if (v.agentName == null) return false;
	   if (__def.agentName == null) return false;
	   if (!v.agentName.equals(__def.agentName)) return false;
	}
	if (v.posX != __def.posX) return false;
	if (v.posY != __def.posY) return false;
      if (baseclasses != null && baseclasses.length == 1)
        return baseclasses[0].isDefault(o);
      return true;
    }

    /** JACOB method. */
    public void findNonApib(aos.apib.OutStream out, aos.apib.Base o) {
     BPlayerPosition__Tuple v = (BPlayerPosition__Tuple)o;

      if (baseclasses != null && baseclasses.length == 1)
        baseclasses[0].findNonApib(out, o);
    }
  }

}

