public class Alistirma37Boks {
    public static void main(String[] args) {
        Fighter a1=new Fighter("Mehmet",12,200,100,20);
        Fighter a2=new Fighter("Hüseyin",15,150,95,30);

        Match match=new Match(105,90,a1,a2);
        match.Fight();

    }
}
