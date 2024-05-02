package LatihanResponsi;

public class Student extends Person {
    String nim;

    Student(String name, String address, String nim)
    {
        super(name, address);
        this.nim = nim;
    }

    public String getNim()
    {
        return nim;
    }

    @Override
    public void identity()
    {
        super.identity();
        System.out.println("NIM: "+getNim());
    }

    public int hitungPembayaran(int spp, int sks, int modul)
    {
        return spp*(sks+modul);
    }

    @Override
    public void hobi(String hobi)
    {
        super.hobi(hobi);
    }
}
