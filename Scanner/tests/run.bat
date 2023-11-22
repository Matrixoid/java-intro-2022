set pth1=%cd%\FastReverseTest2022.jar
set pth2=%cd%\WordStatTest2022.jar
set pth3=%cd%\FastReverseTest2023.jar
set pth4=%cd%\WordStatTest2023.jar
cd ../src
javac scanner\*.java
javac reverse\*.java
javac wordstat\*.java
java -ea -jar %pth1% Base
java -ea -jar %pth1% Sum
java -ea -jar %pth1% Transpose
java -ea -jar %pth1% Even
java -ea -jar %pth1% Avg
java -ea -jar %pth1% Abc
java -ea -jar %pth1% Oct
java -ea -jar %pth1% OctDec
java -ea -jar %pth1% OctAbc
java -ea -jar %pth2% Base
java -ea -jar %pth2% Words
java -ea -jar %pth2% WordsSuffix
java -ea -jar %pth2% WordsPrefix
java -ea -jar %pth2% WordsShingles
java -ea -jar %pth3% MinR
java -ea -jar %pth3% MinC
java -ea -jar %pth3% SumHex
java -ea -jar %pth3% SumHexDec
java -ea -jar %pth3% MinRAbc
java -ea -jar %pth3% MinCAbc
java -ea -jar %pth3% SumHexAbc
java -ea -jar %pth3% SumHexDecAbc
java -ea -jar %pth4% CountPrefixL
java -ea -jar %pth4% Count
java -ea -jar %pth4% CountMiddleL
java -ea -jar %pth4% CountAffixL
del /s /q *.class
pause