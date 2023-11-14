## Домашнее задание 2. Сумма чисел

Модификации
 * *Float* (32, 33)
    * Входные данные являются 32-битными числами с формате с плавающей точкой
    * Класс должен иметь имя `SumFloat`
 * *Double* (32, 33)
    * Входные данные являются 64-битными числами с формате с плавающей точкой
    * Класс должен иметь имя `SumDouble`
 * *Double* (34, 35)
    * Входные данные являются 64-битными числами с формате с плавающей точкой
    * Класс должен иметь имя `SumDouble`
 * *DoubleSpace* (34, 35)
    * Входные данные являются 64-битными числами с формате с плавающей точкой
    * Класс должен иметь имя `SumDoubleSpace`
    * Числа разделяются [пробелами-разделителями](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html#SPACE_SEPARATOR)
 * *Octal* (36, 37)
    * Восьмеричные числа имеют суффикс `o`
    * Класс должен иметь имя `SumOctal`
 * *LongSpace* (36, 37)
    * Входные данные являются 64-битными целыми числами
    * Класс должен иметь имя `SumLongSpace`
    * Числа разделяются [пробелами-разделителями](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html#SPACE_SEPARATOR)
 * *LongOctal* (38, 39)
    * Входные данные являются 64-битными целыми числами
    * восьмеричные числа имеют суффикс `o`
    * Класс должен иметь имя `SumLongOctal`
 * *BigIntegerSpace* (38, 39)
    * Входные данные помещаются в тип [BigInteger](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/math/BigInteger.html)
    * Класс должен иметь имя `SumBigIntegerSpace`
    * Числа разделяются [пробелами-разделителями](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html#SPACE_SEPARATOR)

Для того, чтобы протестировать исходную программу:

 1. Скачайте откомпилированные тесты ([SumTest2022.jar](tests/SumTest2022.jar)) или ([SumTest2023.jar](tests/SumTest2023.jar))
 1. Откомпилируйте `Sum.java`
 1. Проверьте, что создался `Sum.class`
 1. В каталоге, в котором находится `Sum.class`, выполните команду
    ```
       java -ea -jar <путь к SumTest2022.jar> Base
    ```
    * Например, если `SumTest2022.jar` находится в текущем каталоге, выполните команду
    ```
        java -ea -jar SumTest2022.jar Base
    ```
 1. Для ускорени отладки рекомендуется сделать скрипт, выполняющий шаги 2−4.

Запуск тестов для всех модификаций:
* [run](tests/run.bat)