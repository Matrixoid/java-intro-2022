set pth=%cd%\SumTest2022.jar
set pth2=%cd%\SumTest2023.jar
cd ..\src
javac *.java
java -ea -jar %pth% Base
java -ea -jar %pth% Double
java -ea -jar %pth% Float
java -ea -jar %pth% Octal
java -ea -jar %pth% LongOctal
java -ea -jar %pth2% DoubleSpace
java -ea -jar %pth2% LongSpace
java -ea -jar %pth2% BigIntegerSpace
del /s /q *.class
pause