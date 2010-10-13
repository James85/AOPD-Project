

/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.data;
import aos.jack.jak.beliefset.ClosedWorld;
import aos.jack.jak.beliefset.Tuple;

/** Automatically generated class from 'null'. */
public class BMoveHint__Tuple extends aos.jack.jak.beliefset.Tuple implements aos.apib.Base, java.io.Serializable {

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

  public int	srcX;
  public int	srcY;
  public int	endX;
  public int	endY;
  public String	move;
  public int	length;


public BMoveHint__Tuple(boolean v)
{
    super();
    isFree = v;
}



public java.lang.String name()
{
    return "BMoveHint__Tuple";
}



public java.lang.String toString()
{
    java.lang.StringBuffer __s = new java.lang.StringBuffer();
    __s.append(srcX);
    __s.append(":");
    __s.append(srcY);
    __s.append(":");
    __s.append(endX);
    __s.append(":");
    __s.append(endY);
    __s.append(":");
    __s.append(move);
    __s.append(":");
    __s.append(length);
    return __s.toString();
}



public int hash(int __i)
{
    int __r = 0;
    switch (__i) {
        case 0: 
        {
            __r ^= (((int) (endY ^ (endY << 13))) & (~(1 << 31)));
            __r ^= (((int) (endX ^ (endX << 13))) & (~(1 << 31)));
            __r ^= (((int) (srcY ^ (srcY << 13))) & (~(1 << 31)));
            __r ^= (((int) (srcX ^ (srcX << 13))) & (~(1 << 31)));
            return __r;
        }
        case 1: 
        {
            return __r;
        }
    }
    return 0;
}


  /** Automatically generated constructor. */
  public BMoveHint__Tuple() {
    streamer.setup();
    if (!getStreamer().initialized) return;
    __init__BMoveHint__Tuple();
  }

  /** Automatically generated method. */
  void __init__BMoveHint__Tuple() {
	srcX = 0;
	srcY = 0;
	endX = 0;
	endY = 0;
	move = null;
	length = 0;

  }

  /** Automatically generated JACOB streamer class */
  static class __SS extends aos.apib.StreamerSupport {
    BMoveHint__Tuple __def = null;

    /** Return a static instance. */

    public aos.apib.Base getDefaultInstance() { return __def; }

    private String[] fn = {
    ":srcX",
    ":srcY",
    ":endX",
    ":endY",
    ":move",
    ":length",
    };

    private String[] dn = {
    ":srcX",
    ":srcY",
    ":endX",
    ":endY",
    ":move",
    ":length",
    };

    private boolean[] ftr = {
    false,
    false,
    false,
    false,
    false,
    false,
    };

    private boolean[] fst = {
    false,
    false,
    false,
    false,
    false,
    false,
    };

    private boolean[] fhd = {
    false,
    false,
    false,
    false,
    false,
    false,
    };

    private int[] ft = {
    3,
    3,
    3,
    3,
    11,
    3,
    };

    private aos.apib.EnumInfo[] fe = {
	null,
	null,
	null,
	null,
	null,
	null,
    };

    private String[] cm = {
    null,
    null,
    null,
    null,
    null,
    null,
    };


    private aos.apib.StreamerSupport[][] al = {
	null,
	null,
	null,
	null,
	null,
	null,
    };

    private String[] fsubt = {
    null, 
    null, 
    null, 
    null, 
    null, 
    null, 
    };

    /** Construct the streamer. */
    public __SS() {
      __type = "BMoveHint__Tuple";
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

      __def = (BMoveHint__Tuple)newInstance();
      setStreamedType(__def.getClass());
      baseclasses = findBaseStreamer(__def.getClass());
    }

    /** Initialization. */
    protected void init() {
      setup();
      __def.__init__BMoveHint__Tuple();
    }

    /** JACOB method. */
    public boolean isDummy() { return false; }

    /** JACOB method. */
    public aos.apib.Base new_instance() {
      return new BMoveHint__Tuple();
    }

    /** JACOB method. */
    public aos.apib.Base[] new_array(int n) {
      return new BMoveHint__Tuple[n];
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
      BMoveHint__Tuple v = (BMoveHint__Tuple)o;
      switch (i) {
      case 0:
	v.srcX = in.getInt();
	break;
   case 1:
	v.srcY = in.getInt();
	break;
   case 2:
	v.endX = in.getInt();
	break;
   case 3:
	v.endY = in.getInt();
	break;
   case 4:
	v.move = in.getString(true);
	break;
   case 5:
	v.length = in.getInt();
	break;
      case 6:
        in.readBaseClasses(o, this, 0);
        break;
      default:
        if (i >= 0 && i <= 6) break;
        in.error("Reader for BMoveHint__Tuple: illegal field number:"+i);
        return false;
      }
      return true;
    }

    /** JACOB class writing method. */
    public boolean write(aos.apib.OutStream out, aos.apib.Base o) {
      BMoveHint__Tuple v = (BMoveHint__Tuple)o;
      int i = -1;
      while ((i = out.nextField(i, this)) >= 0) {
        switch (i) {
      case 0:
	out.putInt(v.srcX, i, __def.srcX, this);
	break;
   case 1:
	out.putInt(v.srcY, i, __def.srcY, this);
	break;
   case 2:
	out.putInt(v.endX, i, __def.endX, this);
	break;
   case 3:
	out.putInt(v.endY, i, __def.endY, this);
	break;
   case 4:
	out.putString(v.move, i, __def.move, this);
	break;
   case 5:
	out.putInt(v.length, i, __def.length, this);
	break;
        case 6:
          out.writeBaseClasses(o, this);
          break;
        default:
          if (i >= 0 && i <= 6) break;
          out.error("Writer for BMoveHint__Tuple: illegal field number:"+i);
          return false;
        }
      }
      return true;
    }

    /** JACOB method. */
    public boolean isDefault(aos.apib.Base o) {
      BMoveHint__Tuple v = (BMoveHint__Tuple)o;

	if (v.srcX != __def.srcX) return false;
	if (v.srcY != __def.srcY) return false;
	if (v.endX != __def.endX) return false;
	if (v.endY != __def.endY) return false;
	if (v.move != __def.move) {
	   if (v.move == null) return false;
	   if (__def.move == null) return false;
	   if (!v.move.equals(__def.move)) return false;
	}
	if (v.length != __def.length) return false;
      if (baseclasses != null && baseclasses.length == 1)
        return baseclasses[0].isDefault(o);
      return true;
    }

    /** JACOB method. */
    public void findNonApib(aos.apib.OutStream out, aos.apib.Base o) {
     BMoveHint__Tuple v = (BMoveHint__Tuple)o;

      if (baseclasses != null && baseclasses.length == 1)
        baseclasses[0].findNonApib(out, o);
    }
  }

}

