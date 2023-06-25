set pth=%cd%\WordStatTest.jar
cd ..\out\production\WordStat
java -ea -jar %pth% Base
java -ea -jar %pth% Words
java -ea -jar %pth% WordsSuffix
java -ea -jar %pth% WordsPrefix
java -ea -jar %pth% WordsShingles
pause