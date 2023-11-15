set pth=%cd%\ReverseTest2022.jar
set pth2=%cd%\ReverseTest2023.jar
cd ../src
javac *.java
java -ea -jar %pth% Base
java -ea -jar %pth% Sum
java -ea -jar %pth% Transpose
java -ea -jar %pth% Even
java -ea -jar %pth% Avg
java -ea -jar %pth2% MinR
java -ea -jar %pth2% MinC
java -ea -jar %pth2% SumHex
java -ea -jar %pth2% SumHexDec
del /s /q *.class
pause