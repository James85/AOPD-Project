#!/bin/bash
#
# Run the test. Arguments are the name of the agents to start. e.g.: ./run bill

# Paths to jack.jar and climacoms.jar files, very important!
# JACK is an environment variable that points to the root of JACK
# (e.g., in yallara JACK=/research/ai/linpa/JACK)
#  JACK=/research/ai/linpa/JACK

# Assume current dir for JACK if non global env. is set
if [ "$JACK" = "" ]; then
   JACK=$PWD
fi

# Root of the Jack Agent system
JACKAGT=.   

# Path to all JAR files used
PATH_JAR_JACK=$JACKAGT/lib/jack.jar:/research/ai/linpa/JACK/lib/jack.jar:/opt/Agent_Software/lib/jack.jar
PATH_JAR_CLIMACOMMS=$JACKAGT/lib/climacomms.jar                         
PATH_JAR_EXTRAS=$JACKAGT/lib/gui.jar                                
PATH_JAR_JACKAGT=$JACKAGT/lib/jackagt.jar                               
PATH_JARS=$PATH_JAR_JACKAGT:$PATH_JAR_JACK:$PATH_JAR_CLIMACOMMS:$PATH_JAR_EXTRAS



# This is the address of the CLIMA game server
HOST=localhost
PORT=12345

# Team information login/password
USER1=participant1
PASS1=1
USER2=participant2
PASS2=2
USER3=participant3
PASS3=3
USER4=participant4
PASS4=4
USER5=participant5
PASS5=5
USER6=participant6
PASS6=6


# Command line options to be passed to Java
props_host="-Dclima.host=$HOST -Dclima.port=$PORT $*"

props_play1="-Dclima.agent.player1.username=$USER1 -Dclima.agent.player1.password=$PASS1"
props_play2="-Dclima.agent.player2.username=$USER2 -Dclima.agent.player2.password=$PASS2"
props_play3="-Dclima.agent.player3.username=$USER3 -Dclima.agent.player3.password=$PASS3"
props_play4="-Dclima.agent.player4.username=$USER4 -Dclima.agent.player4.password=$PASS4"
props_play5="-Dclima.agent.player5.username=$USER5 -Dclima.agent.player5.password=$PASS5"
props_play6="-Dclima.agent.player6.username=$USER6 -Dclima.agent.player6.password=$PASS6"

props_debug="-Djack.run.debug.options=events:plans"


# final command line arguments to java (no JACK debuging)
props="-Xmx90m $props_host $props_play1 $props_play2 $props_play3 $props_play4  $props_play5 $props_play6"

# final command line arguments to java (with JACK debuging, commented out by default!)
#props="-Xmx90m $props_host $props_play1 $props_play2 $props_play3 $props_play4 $props_debug"


echo "Jack AGT: $PATH_JAR_JACKAGT"
echo "Path to jack.jar: $PATH_JACK"
echo "Path to climacomms.jar: $PATH_JAR_CLIMACOMMS"
echo "Path to extras.jar: $PATH_JAR_EXTRAS"
echo "Current path: $PWD"
echo "Java options: $props"


# Make sure the CLASSPATH includes both jack.jar, climacomms.jar, and grid.jar
#CLASSPATH=$PATH_JARS:bin:$CLASSPATH:..:. java $props Main player1 player2 player3 player4 player5 player6

java -cp $PATH_JARS:bin:. $props Main player1 player2 player3 player4 player5 player6

