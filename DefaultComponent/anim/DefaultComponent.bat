echo off

set RHAP_JARS_DIR=e:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=e:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\oxf.jar;e:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\anim.jar;e:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\animcom.jar;e:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=e:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\oxf.jar;e:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\anim.jar;e:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\animcom.jar;e:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist Default\Pasazer.class del Default\Pasazer.class
if exist Default\Winda.class del Default\Winda.class
if exist Default\PanelPietra.class del Default\PanelPietra.class
if exist Default\Sterownik.class del Default\Sterownik.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Default\PanelWindy.class del Default\PanelWindy.class
if exist Default\Osoba_przed_winda.class del Default\Osoba_przed_winda.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end

