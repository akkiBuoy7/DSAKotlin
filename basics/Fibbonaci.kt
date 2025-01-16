package basics

fun getFibonacci(counter: Int) {
    var c = counter
    print("Fibonacci series up to $counter : ")
    if (c < 1) {
        println(counter)
        return
    }

    var fibo1 = 0
    var fibo2 = 1
    while (c > 0) {
        val temp = fibo1 + fibo2
        print("$fibo1 ")
        fibo2 = fibo1
        fibo1 = temp
        c--
    }
}