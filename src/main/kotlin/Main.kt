fun main() {
    ageClassifier(12)
    haveYouBeen("Tanzanian")
    println( capacityOfVehicle(3))
    println(numberArray(arrayOf(2,3, 4,5)))
    println(sumArray(arrayOf(2, 3, 5, 6)))
    println(mixedArray(arrayOf("Hopper", 1, 3.4, 3, 5.5)))

//    println( numberArray(1,2,3,4))
   

//    println(sumArray(1))


}
fun ageClassifier(age:Int){

//    if (age in 13..19){
//        println("You are a teenager")
//    }
//
//
//    else{
//        println("You are not a teenager")
//    }
//    //Baby 1, Toddler 2-3, Child, Adult, Retiree 60

    if (age<=1){
        println("You are a baby")
    }
    else if (age in 2 ..3){
        println("You are a toddler")
    }
    else if (age in 3 .. 17){
        if (age in 13..19) {
            println("You are a teenager")
        }
            else{
                println("You are a child")
            }
    }
    else if (age in 18 .. 59){
        println("You are an adult")
    }
  else{
      println("You are are a retiree")
    }
}
//fun classifier2(age: Int){
//    when(age){
//        0,1-> println("You are a baby")
//        2,3 -> println("You are a Toddler")
//        3,4,...
//    }
//}

fun haveYouBeen(nationality: String) {

    when (nationality) {
        "Kenyan" -> println("Have you been to Nairobi?")
        "Tanzanian" -> println("Have you been to Dodoma?")
        "Rwandan" -> println("Have you been to Kigali?")
        "Ugandan" -> println("Have you been to Kampala?")
        "Sudanese" -> println("Have you been to Khartoum?")
        else -> println("Have you beeen to East Africa")
    }
}

//write a function that takes in an interger representing the
// number of passangers a vehicle can seat, typically between 2 and 7
//Classifies the vehicle as :
//Coupe 2 seater
//Sedan, 4-5 seater
// Wagon above 5 seater

fun capacityOfVehicle(capacity: Int): String{
    when(capacity){
        2 -> return ("Coupe")
        4,5 -> return("Sedan")
        6,7-> return("Wagon")
        else-> return("Not classified")
    }
}
//Write a function that takes in an array of random intengers
//and prints out whether each is odd or even

fun numberArray(numbers: Array<Int>){
    for (number in numbers){
        if (number % 2 == 0){
            println("even")
        }
        else{
            println("Odd")
        }
    }
}
fun sumArray(nums: Array<Int>):Int{
    var sum = 0
    for (num in nums){
        sum+=num
    }
    return sum
}

//write a function that takes in an array of mixed types
//and returns the sum of all the decimal elements
fun mixedArray(arrs:Array<Any>):Double{
    var sum = 0.0
    for (element in arrs){
        if (element is Double){
            sum+= element
        }
    }
    return sum
}