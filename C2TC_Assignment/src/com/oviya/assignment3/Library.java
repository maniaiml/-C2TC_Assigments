package com.oviya.assignment3;

import java.util.ArrayList;

class Library {
    private ArrayList<Item> items;

    Library() {
        items = new ArrayList<>();
    }

    void addItem(Item item) {
        items.add(item);
    }

    void showAllItems() {
        System.out.println("Library contains:");
        for (Item item : items) {
            if (item instanceof Book) {
                Book b = (Book) item;
                System.out.println("- " + b.title + " by " + b.author);
            } else if (item instanceof Magazine) {
                Magazine m = (Magazine) item;
                System.out.println("- " + m.title + " Issue " + m.issueNumber);
            }
        }
    }
}

