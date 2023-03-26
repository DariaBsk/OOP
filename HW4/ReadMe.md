Реализовать класс для работы с одномерными динамическими массивами произвольных данных(произвольного типа). Класс будет иметь следующие конструкторы:

Конструктор без параметров – конструктор по умолчанию, проводяющий базовую иницаилизацию массива
Конструктор с параметром T[] – конструктор, который проводит инициализацию и заполняет массив данными, пришедшими из параметра Так же класс будет иметь следующие публичные методы:
Вставка в массив
Удаление элемента по индексу
Удаление всех элементов с заданным значением
Поиск минимума
Поиск максимума
Поиск суммы элементов массива
Поиск произведения элементов массива
Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
Пузырьковая сортировка
Сортировка простыми вставками
Сортировка простым выбором
Получение элемента массива по индексу
Задание значения элементу массива с заданным индексом
Печать массива на экран
Длинна массива Так же класс должен содержать следующие приватные поля:
Сам массив произвольных данных.
Длинну массива *Так же массив должен содержать следующие перегруженные операторы:
Оператор, получающий элемент по заданному индексу
Оператор, позволяющий установить значение элемента по заданному индексу *Так же в случае, если могут произойти ошибки или некорретная работа в конструкторах или методах, необходимо использовать механизм исключений для обработки возможных ошибок.