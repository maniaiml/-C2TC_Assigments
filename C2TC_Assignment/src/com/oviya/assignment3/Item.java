package com.oviya.assignment3;

//Part A – Inheritance (is-a relationship)

//Base class
class Item {
 int id;
 String title;

 Item(int id, String title) {
     this.id = id;
     this.title = title;
 }

 void displayInfo() {
     System.out.println("ID: " + id + ", Title: " + title);
 }
}
