package com.cdac.acts;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DataUtility {

    public static Map<String, Books> getData() {

        Map<String, Books> hashmap = new HashMap<>();

        LocalDate date1 = LocalDate.parse("2011-02-04");
        LocalDate date2 = LocalDate.parse("1997-03-13");
        LocalDate date3 = LocalDate.parse("2002-09-08");
        LocalDate date4 = LocalDate.parse("1989-09-05");

        hashmap.put("The Great", new Books("The Great", BookType.adventure, 100, date1, "Scott", 10));
        hashmap.put("1984", new Books("1984", BookType.fantacy, 800, date2, "George", 50));
        hashmap.put("To Kill", new Books("To Kill", BookType.horror, 120, date3, "Lee", 23));
        hashmap.put("Pride", new Books("Pride", BookType.novel, 900, date4, "Jane", 15));
        hashmap.put("The Catcher", new Books("The Catcher", BookType.thriller, 150, date2, "Jinger", 60));

        return hashmap;
    }
    
    public static Boolean CheckDuplicate(Books book, Map<String, Books> hashmap) {
        Set<Map.Entry<String, Books>> entries = hashmap.entrySet();
        
        for (Map.Entry<String, Books> entry : entries) {
            Books existingBook = entry.getValue();

            if (existingBook.getTitle().equalsIgnoreCase(book.getTitle()) && 
                existingBook.getAuthorName().equalsIgnoreCase(book.getAuthorName())) {
                return true;
            }
        }
        return false;
    }

    
}
