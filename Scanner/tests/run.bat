set pth1=%cd%\FastReverseTest.jar
set pth2=%cd%\WordStatTest.jar
cd ..\out\production\Scanner
java -ea -jar %pth1% Base
java -ea -jar %pth1% Abc
java -ea -jar %pth1% Oct
java -ea -jar %pth1% OctDec
java -ea -jar %pth1% OctAbc
java -ea -jar %pth2% Base
java -ea -jar %pth2% Words
java -ea -jar %pth2% WordsSuffix
java -ea -jar %pth2% WordsPrefix
java -ea -jar %pth2% WordsShingles
pause