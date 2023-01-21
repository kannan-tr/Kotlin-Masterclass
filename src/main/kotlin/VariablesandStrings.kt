package src.main.kotlin

import java.util.*

const val BASE_URL = "kotlinlang.org"
fun main() {
    println("Hi this is \\ a backslash") //Print backslash
    val catName = "My Cat's name is \"Fluffy\""
    println(catName) //Print Double Quotes String
    val slashes = "Two types of Slashes: \\ and /"
    println(slashes) //Print two backslash & forward slash
    val websiteName = "https://www.google.com"
    println(websiteName) //Print Web URL

    //Draw this Bunny
    val bunnyDraw = "(\\(\\\n(-.-)\nO_(\")(\")"
    println(bunnyDraw) //Print sleeping bunny pic

    val petName = "lion"
    println(petName.length)
    println(petName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }) //Capitalize first char
    println(petName.replaceFirstChar { it.lowercase(Locale.getDefault()) }) //Decapitalize first char

    val myText = "  There are many spaces   "
    println(myText.trim()) //Trim the spaces at both end

    val language = "Kotlin"
    println(language[3]) //get the 3rd position letter
    println(language.substring(2)) //Substring from which position
    println(language.substring(0, 3)) //Substring from & to

    println(language.plus(" World!")) //Concatenation
    println(language.uppercase()) //Uppercase string

    val myCountryName = "India"
    println("My country name is $myCountryName") //Accessing val using $
    println("I have ${1 + 1} cow") //Using string expression add two values

    println("My cat variable name length is ${catName.length}") //string expression to get length

    val customerName = "Kannan"
    println("Hello $customerName welcome to the store")
    val apples = 5
    val banana = 2
    println("The total number of fruits are ${apples + banana}")

    val products = 5
    val price = 40
    println("The customer $customerName has to pay rupees ${products * price}")
    println("This is base url for learning Kotlin official website $BASE_URL") // accessing const val using $
}