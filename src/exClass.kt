class Book (var author:String)
{

    var title = ""
    var yearPublished = 0
    var genre = ""



    fun getBookInfo(): String
    { return "$title by $author ($yearPublished) and type is $genre"}
}


fun main()
{
    var myBook = Book("Najla")
//    myBook.author = "Najla"
    myBook.title = "How to enjoy the Life"
    myBook.yearPublished= 2020
    myBook.genre = "Funny"

    println(myBook.getBookInfo())

}