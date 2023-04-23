package Quanlidanhba;

public class Danhba {
    public String name;
    public String sdt;
    
    public Danhba(String name, String sdt) {
        this.name = name;
        this.sdt = sdt;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSDT() {
        return sdt;
    }
    
    public void setSDT(String sdt) {
        this.sdt = sdt;
    }
}
