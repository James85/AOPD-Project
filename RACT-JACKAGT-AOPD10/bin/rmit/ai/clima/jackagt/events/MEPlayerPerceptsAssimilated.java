

/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.4 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package rmit.ai.clima.jackagt.events;
import aos.jack.jak.event.MessageEvent;

/** Automatically generated class from 'null'. */
public class MEPlayerPerceptsAssimilated extends aos.jack.jak.event.MessageEvent implements aos.apib.Base, java.io.Serializable {

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



public java.lang.String getDocumentation()
{
    return "/******** Start PDT Design Block *** DO NOT EDIT IT *********/\n";
}



public rmit.ai.clima.jackagt.events.MEPlayerPerceptsAssimilated send()
{
    rmit.ai.clima.jackagt.events.MEPlayerPerceptsAssimilated tmp = new rmit.ai.clima.jackagt.events.MEPlayerPerceptsAssimilated();
    tmp.init(this);
    return tmp.send_body();
}



private rmit.ai.clima.jackagt.events.MEPlayerPerceptsAssimilated send_body()
{
    return this;
}



public java.lang.String stateInfo()
{
    return "rmit/ai/clima/jackagt/events/MEPlayerPerceptsAssimilated.event [" + super.stateInfo() + "]";
}


  /** Automatically generated constructor. */
  public MEPlayerPerceptsAssimilated() {
    streamer.setup();
    if (!getStreamer().initialized) return;
    __init__MEPlayerPerceptsAssimilated();
  }

  /** Automatically generated method. */
  void __init__MEPlayerPerceptsAssimilated() {

  }

  /** Automatically generated JACOB streamer class */
  static class __SS extends aos.apib.StreamerSupport {
    MEPlayerPerceptsAssimilated __def = null;

    /** Return a static instance. */

    public aos.apib.Base getDefaultInstance() { return __def; }

    private String[] fn = {
    };

    private String[] dn = {
    };

    private boolean[] ftr = {
    };

    private boolean[] fst = {
    };

    private boolean[] fhd = {
    };

    private int[] ft = {
    };

    private aos.apib.EnumInfo[] fe = {
    };

    private String[] cm = {
    };


    private aos.apib.StreamerSupport[][] al = {
    };

    private String[] fsubt = {
    };

    /** Construct the streamer. */
    public __SS() {
      __type = "MEPlayerPerceptsAssimilated";
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

      __def = (MEPlayerPerceptsAssimilated)newInstance();
      setStreamedType(__def.getClass());
      baseclasses = findBaseStreamer(__def.getClass());
    }

    /** Initialization. */
    protected void init() {
      setup();
      __def.__init__MEPlayerPerceptsAssimilated();
    }

    /** JACOB method. */
    public boolean isDummy() { return false; }

    /** JACOB method. */
    public aos.apib.Base new_instance() {
      return new MEPlayerPerceptsAssimilated();
    }

    /** JACOB method. */
    public aos.apib.Base[] new_array(int n) {
      return new MEPlayerPerceptsAssimilated[n];
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
      MEPlayerPerceptsAssimilated v = (MEPlayerPerceptsAssimilated)o;
      switch (i) {
         case 0:
        in.readBaseClasses(o, this, 0);
        break;
      default:
        if (i >= 0 && i <= 0) break;
        in.error("Reader for MEPlayerPerceptsAssimilated: illegal field number:"+i);
        return false;
      }
      return true;
    }

    /** JACOB class writing method. */
    public boolean write(aos.apib.OutStream out, aos.apib.Base o) {
      MEPlayerPerceptsAssimilated v = (MEPlayerPerceptsAssimilated)o;
      int i = -1;
      while ((i = out.nextField(i, this)) >= 0) {
        switch (i) {
           case 0:
          out.writeBaseClasses(o, this);
          break;
        default:
          if (i >= 0 && i <= 0) break;
          out.error("Writer for MEPlayerPerceptsAssimilated: illegal field number:"+i);
          return false;
        }
      }
      return true;
    }

    /** JACOB method. */
    public boolean isDefault(aos.apib.Base o) {
      MEPlayerPerceptsAssimilated v = (MEPlayerPerceptsAssimilated)o;

      if (baseclasses != null && baseclasses.length == 1)
        return baseclasses[0].isDefault(o);
      return true;
    }

    /** JACOB method. */
    public void findNonApib(aos.apib.OutStream out, aos.apib.Base o) {
     MEPlayerPerceptsAssimilated v = (MEPlayerPerceptsAssimilated)o;

      if (baseclasses != null && baseclasses.length == 1)
        baseclasses[0].findNonApib(out, o);
    }
  }

}

