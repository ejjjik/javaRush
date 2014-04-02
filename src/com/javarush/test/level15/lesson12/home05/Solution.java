package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution
{
    public Solution(){}
    public Solution(int a){}
    public Solution(double a){}
    protected Solution(short a){}
    protected Solution(String a){}
    protected Solution(float a){}
    private Solution(Integer a){}
    private Solution(Double a){}
    private Solution(Character a){}
    Solution(int a, int b){}
    Solution(int a, double b ){}
    Solution(double a, double b){}
}

