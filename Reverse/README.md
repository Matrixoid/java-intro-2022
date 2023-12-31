## Домашнее задание 3. Реверс

Модификации
 * *Base*
    * Откомпилированные тесты: [ReverseTest.jar](tests/ReverseTest.jar)
        * Аргументы командной строки: модификация
    * Запуск тестов для всех модификаций: [run](tests/run.bat)
 * *Even* (32, 33)
    * Выведите (в реверсивном порядке) только четные числа
    * Класс должен иметь имя `ReverseEven`
 * *MinR* (32, 33)
    * Вместо каждого числа выведите минимум из чисел, предшествующих
      ему в строки и его самого
    * Класс должен иметь имя `ReverseMinR`
 * *Transpose* (34, 35)
    * Рассмотрим входные данные как (не полностью определенную) матрицу,
      выведите ее в транспонированном виде
    * Класс должен иметь имя `ReverseTranspose`
 * *MinС* (34, 35)
    * Рассмотрим входные данные как (не полностью определенную) матрицу,
      вместо каждого числа выведите минимум из чисел,
      находящихся в его столбце в предыдущих строках, и его самого
    * Класс должен иметь имя `ReverseMinC`
 * *Memory* (36-39)
    * Пусть _M_ – объём памяти, необходимый для сохранения ввода
      в двумерном массиве `int` минимального размера.
      Ваша программа должна использовать не более 4_M_ + 1024 байт памяти.
    * Накладные расходы на запуск вашей программы JVM не учитываются.
 * *Sum* (36, 37)
    * Рассмотрим входные данные как (не полностью определенную) матрицу,
      вместо каждого числа выведите сумму чисел
      в его столбце и строке
    * Класс должен иметь имя `ReverseSum`
 * *SumHex* (36, 37)
    * Рассмотрим входные данные как (не полностью определенную) матрицу,
      вместо каждого числа выведите сумму чисел
      в прямоугольнике верхний левый угол матрицы — текущее число.
    * Во вводе и выводе используются числа в шестнадцатеричной системе счисления.
    * Класс должен иметь имя `ReverseSumHex`
 * *Avg* (38, 39)
    * Рассмотрим входные данные как (не полностью определенную) матрицу,
      вместо каждого числа выведите среднее из чисел в его столбце и строке
    * Класс должен иметь имя `ReverseAvg`
 * *SumHexDec* (38, 39)
    * Рассмотрим входные данные как (не полностью определенную) матрицу,
      вместо каждого числа выведите сумму чисел
      в прямоугольнике верхний левый угол матрицы — текущее число.
    * На вход подаются десятичные и шестнадцатеричные числа.
    * Шестнадцатеричные числа имеют префикс `0x`.
    * Класс должен иметь имя `ReverseSumHexDec`.