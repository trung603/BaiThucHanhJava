package shapes;

public class HinhHoc {
    public final float PI = 3.14f;
    
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;
     public float getPI(){
        return PI; 
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }

    public float getChuVi(){
        return this.chuVi;
    }
    public void setChuVi(float chuVi){
        this.chuVi = chuVi;
    }

    public float getDienTich(){
        return this.dienTich;
    }
    public void setDienTich(float dienTich){
        this.dienTich = dienTich;
    }

    public float getTheTich(){
        return this.theTich;
    }
    public void setTheTich(float thetich){
        this.theTich = thetich;
    }


    public void xuatTen(){
        System.out.printf("\n--------- %s ---------", ten);
    }

    public void inChuVi(){
        System.out.printf("Chu vi = %f ", chuVi);
    }

    public void inDienTich(){
        System.out.printf("Dien tich = %f ", dienTich);
    }

    public void inTheTich(){
        System.out.printf("The tich = %f ", theTich);
    }
    
}
