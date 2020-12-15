@echo off
java -jar rpcgen.jar -debug -validateMarshal -validateUnmarshal -java protocol.main.xml
pause