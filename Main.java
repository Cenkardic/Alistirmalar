package Kitap_Siralayici;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TreeSet<Book>Books=new TreeSet<>(new CompareTo());
        Books.add(new Book("Hayvan Çiftliği", 255, "Orwell", 1945));
        Books.add(new Book("Kayıp Hikeyler",355,"Ardıç",1998));
        Books.add(new Book("Simyacı ",200,"Coelho",1965));
        Books.add(new Book("Kardeşimin Hikayesi ",150,"Livaneli",2010));
        Books.add(new Book("Sineklerin Tanrısı  ",240,"Max",2005));

        for (Book i:Books ) {
            System.out.println(i.getName()+": "+ i.getPageNumber());

        }
    }
}
