## Домашнее задание 4. Подсчет слов

Модификации
 * *Base*
    * Класс должен иметь имя `WordStatInput`
    * Откомпилированные тесты: [WordStatTest.jar](tests/WordStatTest.jar)
        * Аргументы командной строки: модификации
	* Запуск тестов для всех модификаций: [run](tests/run.bat)
 * *WordsPrefix* (36, 37)
    * Выходной файл должен содержать все различные префиксы длины 3
      слов, встречающихся во входном файле,
      в лексикографическом порядке.
      Слова длины меньшей 3 используются как есть.
    * Класс должен иметь имя `WordStatWordsPrefix`
 * *WordsShingles* (38, 39)
    * Выходной файл должен содержать все различные подстроки длины 3
      слов, встречающихся во входном файле,
      в лексикографическом порядке.
      Слова длины меньшей 3 используются как есть.
    * Класс должен иметь имя `WordStatWordsShingles`
 * *Words* (32, 33)
    * В выходном файле слова должны быть упорядочены
      в лексикографическом порядке
    * Класс должен иметь имя `WordStatWords`
 * *WordsSuffix* (34, 35)
    * Выходной файл должен содержать все различные суффиксы длины 3
      слов встречающихся во входном файле,
      в лексикографическом порядке.
      Слова длины меньшей 3 используются как есть.
    * Класс должен иметь имя `WordStatWordsSuffix`