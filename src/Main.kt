fun main(){
    println("Text Analysis")
    println("------------------")
    println("Enter some text: ")
    val userInput = readln()

    characters(userInput)
}


fun characters(string: String){
    println("Characters: $string.length")
}

fun spaces(string: String){
    println("Spaces: ")
}