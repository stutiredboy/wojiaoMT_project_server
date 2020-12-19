@echo off
java -jar rpcgen.jar -debug -outputEncoding utf8 -validateMarshal -validateUnmarshal -java protocol.main.xml
pause