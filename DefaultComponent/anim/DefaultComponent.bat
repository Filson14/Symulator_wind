echo off

set RHAP_JARS_DIR=C:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\oxf.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\anim.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\animcom.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\oxf.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\anim.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\animcom.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0.4/Share\LangJava\lib\oxfInst.jar;
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
if exist Default\evWinda2Piate.class del Default\evWinda2Piate.class
if exist Default\evTrzecieGora.class del Default\evTrzecieGora.class
if exist Default\Pasazer.class del Default\Pasazer.class
if exist Default\evAlarm.class del Default\evAlarm.class
if exist Default\evUruchom.class del Default\evUruchom.class
if exist Default\evWinda2Czwarte.class del Default\evWinda2Czwarte.class
if exist Default\evDrugieDol.class del Default\evDrugieDol.class
if exist Default\evWinda1Czwarte.class del Default\evWinda1Czwarte.class
if exist Default\evWinda2Pierwsze.class del Default\evWinda2Pierwsze.class
if exist Default\evPiateDol.class del Default\evPiateDol.class
if exist Default\Sterownik.class del Default\Sterownik.class
if exist Default\evWinda1Piate.class del Default\evWinda1Piate.class
if exist Default\evDrugieGora.class del Default\evDrugieGora.class
if exist Default\Osoba_przed_winda.class del Default\Osoba_przed_winda.class
if exist Default\evWinda1Trzecie.class del Default\evWinda1Trzecie.class
if exist Default\evCzwarteDol.class del Default\evCzwarteDol.class
if exist Default\evPierwszeDol.class del Default\evPierwszeDol.class
if exist Default\evWinda1Drugie.class del Default\evWinda1Drugie.class
if exist Default\Winda.class del Default\Winda.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Default\evWinda2Drugie.class del Default\evWinda2Drugie.class
if exist Default\evCzwarteGora.class del Default\evCzwarteGora.class
if exist Default\evPierwszeGora.class del Default\evPierwszeGora.class
if exist Default\evWinda2Parter.class del Default\evWinda2Parter.class
if exist Default\evWinda1Pierwsze.class del Default\evWinda1Pierwsze.class
if exist Default\Default_pkgClass.class del Default\Default_pkgClass.class
if exist Default\evTrzecieDol.class del Default\evTrzecieDol.class
if exist Default\evParterGora.class del Default\evParterGora.class
if exist Default\evWinda2Trzecie.class del Default\evWinda2Trzecie.class
if exist Default\evWinda1Parter.class del Default\evWinda1Parter.class

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


