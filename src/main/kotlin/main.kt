fun main() {
    println("Hello World") // this says hello
    println("war-crimes are fun") // war-crimes are in fact. fun
    println(420+69) // very important calculation
    print(" is the answer to all our problems")
    var name: String = ("john") // String
    var gay: Boolean = true // Boolean
    println(name)
    print("is gay")
    var letter: Char = 'd' // char
    var double: Double = 5.345 // double
    // science
    val myNum1: Float = 35E3F
    val myNum2: Double = 12E4
    // val for non modifying vars. var for everything elseS
    println(myNum1)
    println(myNum2)
    // converting numbers
    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
    // To convert a numeric data type to another type, you must use one of the following functions: toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():
    // Logic gates are && for logical AND, || for logical or, ! for logical not
    // to init a var and add to it later you MUST define its type
    var name1: String
    name1 = "John"
    println(name1)
    var txt = "Hello World"
    println(txt[0]) // First char
    println(txt[3]) // fourth char
    var longtext: String = "QWERTYUIOASDFGHJKLZXCVBNM"
    println("Length of text is: " + longtext.length)
    // .toUpperCase() and .toLowerCase() is equivalent to .upper() and .lower() in python
    // Comparisons
    var txt32 = "GAY"
    var txt33 = "GAY"
    println(txt32.compareTo(txt33)) // Returns 0 as they are equal
    txt = "Please locate where 'locate' occurs!"
    println(txt.indexOf("locate"))  // Outputs 7
    // Referring to variables can be done with $ like in bash
    val firstName = "Gaylord"
    val lastName  = "Focker"
    println("Their name is $firstName $lastName")
    // Boolean expressions can and will answer with true or false
    val z = 5
    val a = 5
    println(z == a)
    println(10 == 15)


    if (10 == 20) {
        println("something has seriously gone wrong")
    } else if (10 > 20) {
        println("maybe")
    } else {
        println("all is good")
    }

    val time = 20
    val greeting = if (time < 18) {
        "good day"
    } else {
        "good evening"
    }
    // you have to include else when doing this ^
    // you can onmit curly braces when if has only one statement
    // val greeting = if (time < 18) "good day" else "good evening"

    // instead of if else loops you can use "when"
    val day = 4
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Error"
    }

    // while loops (fun)
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }
    i = 0
    // do while (so it runs the code first then checks if the thing is true. if it is then it repeats the code in the Do block)
    do {
        println(i)
        i++
        }
      while (i < 5);
    // break can be used to fuck off out of a loop
    i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            println("breaking loop")
            break
        }
    }
    // continue to break one iteration in a loop (this skips 4)
    i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }

    // arrays

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
    // outputs volvo

    cars[0] = "Amphe"
    println(cars[0]) // now outputs amphe

    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
    // oh yeah for exists
    for (x in cars) {
        println(x)
    }

    println(cars.size)
}
