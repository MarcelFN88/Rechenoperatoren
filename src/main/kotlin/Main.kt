fun main() {
    val a1 = 5 + 8 * 4 - 2
    val a2 = (5 + 8) * (4 - 2)

    println("Ergebnisse: $a1 und $a2")

    val b1 = 11.0 /4
    println("Division: $b1")
    val b2 = 11 / 4
    val b_rest = 11 % 4

    println("Ganzzahl-Division: $b2 und Rest: $b_rest\n")

    var c = 2.5;    println("Zahl: $c")
    c += 3.2;       println("+= 3.2: $c")
    c -= 0.3;      println("-= 0.3: $c")
    c *= 4;      println("*= 4: $c")
    c /= 3;      println("/= 3: $c")
    c %= 1.5;      println("%= 1.5: $c")

    var d = 3
    d++
    d--
    ++d
    --d
    println("Inkrement und Dekrement: $d")

    var x = 3
    val y = 6.0 / x++
    println("Postfix: $x und $y")

    var p = 3
    val q = 6.0 / ++p
    println("Prefix: $p und $q")
}