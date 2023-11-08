package Kitap_Siralayici;

public class Book {
    private String Name;
    private int PageNumber;
    private String Author;
    private int RealiseYear;

    public Book(String Name,int PageNumber,String Author,int RealiseYear){
        this.Author=Author;
        this.Name=Name;
        this.PageNumber=PageNumber;
        this.RealiseYear=RealiseYear;

    }

    //Getter and Setter

    public void setName(String Name){
        this.Name=Name;

    }

    public void setAuthor(String Author) {
        Author = Author;
    }

    public void setPageNumber(int PageNumber) {
        PageNumber = PageNumber;
    }

    public void setRealiseYear(int RealiseYear) {
        RealiseYear = RealiseYear;
    }
    public String getName(){
        return this.Name;
    }
    public String getAuthor(){
        return this.Author;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public int getRealiseYear() {
        return RealiseYear;
    }
}
