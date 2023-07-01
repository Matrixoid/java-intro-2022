set src=%cd%\..\src\markup
javac -d %cd% %src%\*.java
javac markup\MarkupTest.java
javac markup\MarkupListTest.java
java -ea markup.MarkupTest Base
java -ea markup.MarkupTest Html
java -ea markup.MarkupTest Tex
java -ea markup.MarkupListTest HtmlList 
del /s /q markup\*.class
del /s /q base\*.class
pause 