@ECHO OFF

set JACKAGT=.

set PATH_JAR_JACK=%JACKAGT%\lib\jack.jar
set PATH_JAR_CLIMACOMMS=%JACKAGT%\lib\climacomms.jar
set PATH_JAR_JACKAGT=%JACKAGT%\lib\jackagt.jar
set PATH_JAR_EXTRAS=%JACKAGT%\lib\gui.jar
set PATH_JARS=%PATH_JAR_JACKAGT%;%PATH_JAR_JACK%;%PATH_JAR_CLIMACOMMS%;%PATH_JAR_EXTRAS%

set HOST=10.0.2.2
set PORT=12300

REM Team information login/password
set USER1=participant1
set PASS1=1
set USER2=participant2
set PASS2=2
set USER3=participant3
set PASS3=3
set USER4=participant4
set PASS4=4
set USER5=participant5
set PASS5=5
set USER6=participant6
set PASS6=6

REM Command line options to be passed to Java
set props_host=-Dclima.host=%HOST% -Dclima.port=%PORT% %*

set props_play1=-Dclima.agent.player1.username=%USER1% -Dclima.agent.player1.password=%PASS1%
set props_play2=-Dclima.agent.player2.username=%USER2% -Dclima.agent.player2.password=%PASS2%
set props_play3=-Dclima.agent.player3.username=%USER3% -Dclima.agent.player3.password=%PASS3%
set props_play4=-Dclima.agent.player4.username=%USER4% -Dclima.agent.player4.password=%PASS4%
set props_play5=-Dclima.agent.player5.username=%USER5% -Dclima.agent.player5.password=%PASS5%
set props_play6=-Dclima.agent.player6.username=%USER6% -Dclima.agent.player6.password=%PASS6%

set props_debug=-Djack.run.debug.options=events:plans

set props=%props_host% %props_play1% %props_play2% %props_play3% %props_play4% %props_play5% %props_play6%


echo Jack AGT: %PATH_JAR_JACKAGT%
echo Path to jack.jar: %PATH_JACK%
echo Path to climacomms.jar: %PATH_JAR_CLIMACOMMS%
echo Path to extras.jar: %PATH_JAR_EXTRAS%
echo Current path: %CD%
echo Java options: %props%

echo =============

REM ***** RUN THE JACK AGENT SYSTEM! ********
java -classpath %PATH_JARS%;%CD%\bin;%CD% %props% Main player1 player2 player3 player4 player5 player6




