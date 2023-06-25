set pth=%cd%\ReverseTest.jar
cd ..\out\production\Reverse
java -ea -jar %pth% Base
java -ea -jar %pth% Sum
java -ea -jar %pth% Transpose
java -ea -jar %pth% Even
java -ea -jar %pth% Avg
pause