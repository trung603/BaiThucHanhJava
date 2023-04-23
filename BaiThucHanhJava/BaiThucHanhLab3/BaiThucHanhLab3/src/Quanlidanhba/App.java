package Quanlidanhba;

public class App {
    public static void main(String[] args) {
         DanhbaAB db = new DanhbaAB(9);
         
       db.Update("Thuy", "0904887124");
       db.SeachByName("Trung", "0968223358");
       db.Delete("Thuy");
       
    }
}
    