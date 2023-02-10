fun main(){
    greet("Makena")
    division(235, 25)
    sum(75, 95, 264, 750)
    factAboutMyself("is that I love cooking")
}
fun greet(name1: String){
    println("Hi $name1")
}
fun division(num1: Int, num2: Int): Int{
    var division = num1 % num2
    return division
}
fun sum(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum = num1+num2+num3+num4
    return sum
}
fun factAboutMyself(fact: String){
    println("Intresting thing about myself $fact")
}