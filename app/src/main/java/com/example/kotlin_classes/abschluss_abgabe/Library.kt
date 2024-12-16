package com.example.kotlin_classes.abschluss_abgabe


class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun searchBookByTitle(title: String): Book? {
        return books.find { it.title.equals(title, ignoreCase = true) }
    }

    fun searchBookByAuthor(author: String): List<Book> {
        return books.filter { it.author.equals(author, ignoreCase = true) }
    }

    fun showAllBooksStatus() {
        books.forEach { book ->
            println("Title: ${book.title}, Author: ${book.author}, Status: ${book.status.formatStatus()}")
        }
    }

    class LibraryAddress(private val street: String, private val city: String, private val zipCode: String) {
        fun printAddress() {
            println("Library Address: $street, $city, $zipCode")
        }
    }

    inner class LibraryMember(val name: String, val memberID: String) {
        fun checkoutBook(book: Book, dueDate: String) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.CheckedOut(dueDate)
                println("$name checked out '${book.title}', due on $dueDate.")
            } else {
                println("Book '${book.title}' is not available for checkout.")
            }
        }

        fun reserveBook(book: Book) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.Reserved(name)
                println("$name reserved '${book.title}'.")
            } else {
                println("Book '${book.title}' is not available for reservation.")
            }
        }
    }
}