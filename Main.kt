fun main() {
//1. Среднее арифметическое:

val a = 20
val b = 30
var sum = 0
for (i in 1..1) {
    sum += (a + b)
}
val average = sum / 2
println("Среднее арифметическое: $average")

//2. Диаметр и длина окружности:

val S = 50.0
val pi = 3.14
var D = 0.0
for (i in 1..1) {
    D = Math.sqrt((4 * S) / pi)
}
val L = pi * D
println("Диаметр: $D, Длина окружности: $L")


//3. Периметр и площадь прямоугольника:

val (x1, y1) = Pair(1, 2)
val (x2, y2) = Pair(4, 5)
var width = 0
var height = 0
for (i in 0..1) {
    width = Math.abs(x2 - x1)
    height = Math.abs(y2 - y1)
}
val perimeter = 2 * (width + height)
val area = width * height
println("Периметр: $perimeter, Площадь: $area")


//4. Последовательность чисел:

    println("Последовательность чисел:")
    for (i in 0..9) {
        println(1 shl i)
    }
//5. Четные числа от 20 до 0:
    println("Четные числа от 20 до 0:")
    for (i in 20 downTo 0 step 2) {
    println(i)
}
}