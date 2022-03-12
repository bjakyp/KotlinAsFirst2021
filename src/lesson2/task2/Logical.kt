@file:Suppress("UNUSED_PARAMETER")

package lesson2.task2

import lesson1.task1.sqr
import kotlin.math.abs
import kotlin.math.sqrt

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
    sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая (2 балла)
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean
{
    var tmp=number.toString()

     if (tmp[0].toString().toInt()+tmp[1].toString().toInt() == tmp[2].toString().toInt()+tmp[3].toString().toInt())
            return true
     else  return false
}

/**
 * Простая (2 балла)
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean
{
    if (x1-x2==0) return true
    if (y1-y2==0) return true
    if (abs(x1-x2)== abs(y1-y2)) return true
    return false
}


/**
 * Простая (2 балла)
 *
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
fun daysInMonth(month: Int, year: Int): Int
{
   var result=0
    when (month)
    {
       1 -> result=31
       2 -> { if (year%100==0 && year%400!=0)  result=28 else if (year%4==0) result=29 else result=28 }
       3 -> result=31
       4 -> result=30
        5 -> result=31
        6 -> result=30
        7 -> result=31
        8 -> result=31
        9 -> result=30
        10 -> result=31
        11 -> result=3
        12 -> result=31
    }
    return result
}

/**
 * Простая (2 балла)
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */
fun circleInside(
    x1: Double, y1: Double, r1: Double,
    x2: Double, y2: Double, r2: Double
): Boolean
    {
        if (sqrt(sqr(x2 - x1) + sqr(y2 - y1)) + r1 <= r2)
                return true
        else
            return false
    }


        /**
         * Средняя (3 балла)
         *
         * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
         * Стороны отверстия должны быть параллельны граням кирпича.
         * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
         * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
         * Вернуть true, если кирпич пройдёт
         */
        fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean
        {
            if (((a<=r) and (b<=s)) or ((a<=s) and (b<=r))) return true
            if (((a<=r) and (c<=s)) or ((a<=s) and (c<=r))) return true
            if (((b<=r) and (c<=s)) or ((b<=s) and (c<=r))) return true
            return false
    }
