set pth=%cd%\WordStatTest2022.jar
set pth2=%cd%\WordStatTest2023.jar
cd ../src
javac *.java
java -ea -jar %pth% Base
java -ea -jar %pth% Words
java -ea -jar %pth% WordsSuffix
java -ea -jar %pth% WordsPrefix
java -ea -jar %pth% WordsShingles
java -ea -jar %pth2% CountPrefixL
java -ea -jar %pth2% Count
java -ea -jar %pth2% CountMiddleL
java -ea -jar %pth2% CountAffixL
del /s /q *.class
pause