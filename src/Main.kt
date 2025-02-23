fun main(){
    println("Text Analysis")
    println("------------------")
    println("Enter some text: ")
    val userInput = readln()

    characters(userInput)
    spaces(userInput)
    words(userInput)
    vowels(userInput)
    punctuation(userInput)
}


fun characters(string: String){
    println("Characters: ${string.length}")
}

fun words(string: String){

    val list = string.split(" ")
    var count = 0
    for (word in list){
        count++
    }
    println("Words: $count")
}

fun spaces(string: String){
    var count = 0
    for (word in string){
        if (word == ' '){
            count++
        }else{
            continue
        }
    }
    println("Spaces: $count")
}

fun vowels(string: String){

    var count = 0
    for (char in string.lowercase()) {
        when (char) {
            'a' -> count++
            'e' -> count++
            'i' -> count++
            'o' -> count++
            'u' -> count++
        }
    }
    println("Vowels: $count")
}

fun punctuation(string: String){
    var count = 0
    for (char in string) {
        when (char) {
            '.' -> count++
            ',' -> count++
            '!' -> count++
            ';' -> count++
            ':' -> count++
            '?' -> count++
        }
    }
    println("Punctuation: $count")
}