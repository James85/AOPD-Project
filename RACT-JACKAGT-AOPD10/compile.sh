#!/bin/sh -f
#
# Compile the agent system
#

cd src
JACKAGTMAIN=$PWD/..

echo $JACKAGTMAIN

JACKOUT=$JACKAGTMAIN/bin/
LIBS=$JACKAGTMAIN/lib/jack.jar:/research/ai/linpa/JACK/lib/jack.jar:../lib/climacomms.jar:../lib/grid.jar:../lib/gui.jar:/opt/Agent_Software/lib/jack.jar:../../RACT-GUI/

# First do a full cleanup of complied stuff
java -cp  $LIBS aos.main.JackBuild -c -r -d $JACKOUT

# Finally, compile JACK application (ONE STEP)
#   One step compilation: JACK produces java files and then compile them
#      If you want to produce 1.5 versions add this to the end: -DJAVACARGS="-target 1.5"
#java -cp $LIBS aos.main.JackBuild -x -r -d "$JACKOUT"
CLASSPATH=$LIBS java -cp $LIBS aos.main.JackBuild -x -r -d "$JACKOUT" -DJAVACARGS="-target 1.5"


# Finally, compile JACK application (TWO STEPS)
#   Two steps compilation: produce java files first, and then compile them with javac
#java -cp lib/jack.jar:lib/climacomms.jar:lib/grid.jar:. aos.main.JackBuild -x -r -nc -D
#javac -target 1.5 -cp lib/jack.jar:lib/climacomms.jar:lib/grid.jar:. agents/*.java events/*.java plans/*.java data/*.java capabilities/*.java ./*.java

cd ..

jar cf lib/jackagt.jar -C bin rmit -C bin Main.class

