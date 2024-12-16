package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    val address = Library.LibraryAddress("123 Library St", "Booktown", "12345")
    address.printAddress()

    val library = Library()

    val book1 = Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.FICTION, BookStatus.Available)
    val book2 = Book("1984", "George Orwell", Genre.FICTION, BookStatus.Available)
    val book3 = Book("Harry Potter", "J.K. Rowling", Genre.CHILDREN, BookStatus.Available)

    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    val member = library.LibraryMember("Alice", "M001")

    member.checkoutBook(book1, "2024-12-20")
    member.reserveBook(book2)

    println("\nCurrent Book Status:")
    library.showAllBooksStatus()
}