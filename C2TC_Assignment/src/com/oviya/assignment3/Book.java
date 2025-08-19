package com.oviya.assignment3;

//Subclass Book
class Book extends Item {
 String author;

 Book(int id, String title, String author) {
     super(id, title);
     this.author = author;
 }

 @Override
 void displayInfo() {
     System.out.println("Book: [ID: " + id + ", Title: " + title + ", Author: " + author + "]");
 }
}
