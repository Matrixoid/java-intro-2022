## Домашнее задание 5. Свой сканнер

Модификации
 * *Base*
    * Откомпилированные тесты: [FastReverseTest.jar](tests/FastReverseTest.jar)
        * Аргументы командной строки: модификации
	* Запуск тестов для всех модификаций: [run](tests/run.bat)
 * *Oct* (32, 33)
    * Во вводе и выводе используются числа в восьмеричной системе счисления
    * Класс должен иметь имя `reverse.ReverseOct`
 * *MinRAbc* (32, 33)
    * Вместо каждого числа выведите минимум из чисел, предшествующих
      ему в строки и его самого
    * Во вводе и выводе десятичные числа пишутся буквами:
      нулю соответствует буква `a`, единице – `b` и так далее
    * Класс должен иметь имя `reverse.ReverseMinRAbc`
 * *Abc* (34, 35)
    * Во вводе и выводе используются числа, записаные буквами:
      нулю соответствует буква `a`, единице – `b` и так далее
    * Класс должен иметь имя `reverse.ReverseAbc`
 * *MinСAbc* (34, 35)
    * Рассмотрим входные данные как (не полностью определенную) матрицу,
      вместо каждого числа выведите минимум из чисел,
      находящихся в его столбце в предыдущих строках, и его самого
    * Во вводе и выводе десятичные числа пишутся буквами:
      нулю соответствует буква `a`, единице – `b` и так далее
    * Класс должен иметь имя `reverse.ReverseMinCAbc`
 * *OctDec* (36, 37)
    * На вход подаются десятичные и восьмиричные числа
    * Восьмиричные числа имеют суффикс `o`
    * Класс должен иметь имя `reverse.ReverseOctDec`
 * *SumHexAbc* (36, 37)
    * Рассмотрим входные данные как (не полностью определенную) матрицу,
      вместо каждого числа выведите сумму чисел
      в прямоугольнике верхний левый угол матрицы — текущее число
    * На вход подаются десятичные и шестнадцатеричные числа
    * Шестнадцатеричные числа имеют префикс `0x`
    * Десятичные числа записаны буквами:
      нулю соответствует буква `a`, единице – `b` и так далее
    * В выходе должны быть десятичные числа, записаные буквами
    * Класс должен иметь имя `reverse.ReverseSumHexAbc`
 * *OctAbc* (38, 39)
    * На вход подаются десятичные и восьмиричные числа
    * Восьмиричные числа имеют суффикс `o`
    * Десятичные числа могут быть записаны буквами:
      нулю соответствует буква `a`, единице – `b` и так далее
    * Класс должен иметь имя `reverse.ReverseOctAbc`
 * *SumHexDecAbc* (38, 39)
    * Рассмотрим входные данные как (не полностью определенную) матрицу,
      вместо каждого числа выведите сумму чисел
      в прямоугольнике верхний левый угол матрицы — текущее число
    * На вход подаются десятичные и шестнадцатеричные числа
    * Шестнадцатеричные числа имеют префикс `0x`
    * Десятичные числа могут быть записаны буквами:
      нулю соответствует буква `a`, единице – `b` и так далее
    * В выходе должны быть десятичные числа, записаные буквами
    * Класс должен иметь имя `reverse.ReverseSumHexDecAbc`