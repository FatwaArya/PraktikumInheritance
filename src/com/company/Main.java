package com.company;
class Guru{
    private String nama;
    private int usia;

    public Guru (String nama, int usia){
        this.nama =nama;
        this.usia = usia;
    }
    public void info(){
        System.out.println("Nama: "+this.nama);
        System.out.println("Usia: "+this.usia);

    }
}

class mataPelajaran extends Guru{
    private String Mapel;

    public mataPelajaran(String Mapel, String nama, int usia){
        super(nama, usia);
        this.Mapel = Mapel;
    }
    @Override
    public void info() {
        System.out.println("Mata Pelajaran: "+ this.Mapel );
        super.info();
    }
}

class ruangKelas extends mataPelajaran{
    private String Kelas;
    public ruangKelas(String Kelas,String Mapel, String nama, int usia) {
        super(Mapel, nama, usia);
        this.Kelas = Kelas;
    }

    @Override
    public void info() {
        System.out.println("Mengajar di kelas: "+ Kelas);
        super.info();
    }
}

public class Main {

    public static void main(String[] args) {
	ruangKelas GuruA = new ruangKelas("X RPL 4","Fisika","Siswanto",56);
    GuruA.info();
    }
}
