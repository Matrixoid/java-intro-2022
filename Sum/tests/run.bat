set pth=%cd%\SumTest.jar
cd ..\out\production\Sum
java -ea -jar %pth% Base
java -ea -jar %pth% Double
java -ea -jar %pth% Float
java -ea -jar %pth% Octal
java -ea -jar %pth% LongOctal
pause