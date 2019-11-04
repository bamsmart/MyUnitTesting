package learning.shinesdev.myunittesting.model;

public class CuboidModel {
    private double panjang;
    private double lebar;
    private double tinggi;

    public CuboidModel(){

    }

    public double getVolume(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;

        return panjang * lebar * tinggi;
    }

    public double getLuas(double panjang, double lebar, double tinggi){

        return  0 ;
    }

    public double getKeliling (double panjang, double lebar, double tinggi) {
          return   2 * (panjang + lebar + tinggi);
    }
}
