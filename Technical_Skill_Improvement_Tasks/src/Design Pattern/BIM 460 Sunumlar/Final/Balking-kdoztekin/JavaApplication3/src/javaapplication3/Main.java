package javaapplication3;

class Book{

    public boolean isReading = false;

    public void read(String name){
        synchronized (this){
            if (isReading){
                System.out.println(name + ": The book is busy, skipping");
                return;
            }
            isReading = true;
        }
        System.out.println(name + " is reading book");
        try{
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        endReading(name);
    }
    public void endReading(String name){
        System.out.println(name + " is done reading");
        isReading=false;
    }
}

class Reader extends Thread{

    Book booka = null;
    String namea = null;

    public Reader(String name, Book book){
        booka = book;
        namea = name;
    }

    public void run(){
        System.out.println(namea + ": Started");
        booka.read(namea);
        System.out.println(namea + ": Exiting");
    }
}

public class Main{

    public static void main(String[] args){
        Book book = new Book();
        Reader reader1 = new Reader("Reader1", book);
        Reader reader2 = new Reader("Reader2", book);
        reader1.start();
        reader2.start();
        try{
            reader1.join();
        }
        catch (InterruptedException e){
            System.out.println("Error in Join for reader1 : "+e);
        }
        try{
            reader2.join();
        }
        catch (InterruptedException e){
            System.out.println("Error in Join for reader2 : "+e);
        }
    }
}