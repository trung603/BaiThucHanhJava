package baithuchanhlab3;
import java.util.Scanner;
public class hinhtrutron { 
  final float PI = 3.14f;
    float bankinh;
    float chieucao;
    float chuvi;
    float dientich;
    float thetich;
    void nhapbankinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap vao ban kinh hinh tru tron: ");
        bankinh = sc.nextFloat();
    }
    void nhapchieucao()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap vao chieu cao hinh tru tron:  ");
        chieucao = sc.nextFloat();
    }
    void tinhchuvi()
    {
        chuvi = 2 * PI * bankinh * chieucao;
    }
    void tinhdientich()
    {
        dientich = 2 * PI * bankinh + (2* PI * bankinh * bankinh);
    }
    void tinhthetich()
    {
        thetich = PI * bankinh * bankinh * chieucao;
    }
    void hienthi()
    {
        System.out.printf(" bankinh = %f, chieucao = %f, chuvi = %f, dientich = %f, thetich = %f ", bankinh, chieucao, chuvi, dientich, thetich);
    }  
}
