package classdesign.anulamiento.downlodable;

public interface Downloadable {

    public void download();

}

interface Readable extends Downloadable{
    
    public void readBook();
    
}

abstract class Book implements Readable{
    
    public void readBook(){
        System.out.println("Read book");
    }
    
}

class Ebook extends Book{

    
    /*
    
    // falla sino se le asigna este método
    @Override
    public void download() {
 
    }

    */
    
    @Override
    public void download() {
 
    }
    
    public void readBook(){
        System.out.println("Read E-book");
    }
    
    public static void main(String[] args) {
        Book book = new Ebook();
        book.readBook();
    }
    
}
