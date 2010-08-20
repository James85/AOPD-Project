@ECHO OFF


set JACKAGT=%CD%
set JACKOUT=%JACKAGT%\bin
set LIBS=%JACKAGT%\lib\jack.jar;%JACKAGT%\lib\climacomms.jar;%JACKAGT%\lib\gui.jar;.


cd src


REM First do a full cleanup of complied stuff 
java -classpath %LIBS% aos.main.JackBuild -c -r -d %JACKOUT%

REM Finally, compile JACK application (ONE STEP)
java -classpath %LIBS% aos.main.JackBuild -x -r -d  ..\bin -DJAVACARGS="-target 1.5"


cd ..


REM Build JAR file
REM jar -cf %JACKAGT%\lib\jackagt.jar -C bin rmit -C bin Main.class





