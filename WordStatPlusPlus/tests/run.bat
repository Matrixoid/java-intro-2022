set pth=%cd%\WsppTest.jar
cd ..\out\production\WordStatPlusPlus
java -ea -jar %pth% Base
java -ea -jar %pth% LastL
java -ea -jar %pth% CountLastL
java -ea -jar %pth% Position
java -ea -jar %pth% CountPosition
pause