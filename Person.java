package LatihanResponsi;

public class Person{
    protected String name;
    protected String address;

    Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    public void identity()
    {
        System.out.println("Nama: "+name);
        System.out.println("Alamat: " +address);
    }

    public void hobi(String hobi)
    {
        System.out.println("Hobi "+name+" adalah "+hobi+".");
    }
}

