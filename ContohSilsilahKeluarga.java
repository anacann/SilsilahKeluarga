class Orang {

    private String nama;
    private int umur;
    private String pekerjaan;
    private double tinggiBadan;
    private double beratBadan;

    public Orang(String nama, int umur, String pekerjaan, double tinggiBadan, double beratBadan) {
        this.nama = nama;
        this.umur = umur;
        this.pekerjaan = pekerjaan;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Tinggi Badan: " + tinggiBadan);
        System.out.println("Berat Badan: " + beratBadan);
        System.out.println();
    }
}

class Kakek extends Orang {

    public Kakek(String nama, int umur, String pekerjaan, double tinggiBadan, double beratBadan) {
        super(nama, umur, pekerjaan, tinggiBadan, beratBadan);
    }
}

class Nenek extends Orang {

    public Nenek(String nama, int umur, String pekerjaan, double tinggiBadan, double beratBadan) {
        super(nama, umur, pekerjaan, tinggiBadan, beratBadan);
    }
}

// Untuk simplifikasi, kita akan menghilangkan kelas OrangTua dan 
// menggabungkan langsung ke Ayah dan Ibu

class Ayah extends Orang {

    public Ayah(String nama, int umur, String pekerjaan, double tinggiBadan, double beratBadan) {
        super(nama, umur, pekerjaan, tinggiBadan, beratBadan);
    }
}

class Ibu extends Orang {

    public Ibu(String nama, int umur, String pekerjaan, double tinggiBadan, double beratBadan) {
        super(nama, umur, pekerjaan, tinggiBadan, beratBadan);
    }
}

class Anak extends Orang {

    public Anak(String nama, int umur, String pekerjaan, double tinggiBadan, double beratBadan) {
        super(nama, umur, pekerjaan, tinggiBadan, beratBadan);
    }
}

class Kakak extends Anak {

    public Kakak(String nama, int umur, String pekerjaan, double tinggiBadan, double beratBadan) {
        super(nama, umur, pekerjaan, tinggiBadan, beratBadan);
    }
}

class Adik extends Anak {

    public Adik(String nama, int umur, String pekerjaan, double tinggiBadan, double beratBadan) {
        super(nama, umur, pekerjaan, tinggiBadan, beratBadan);
    }
}

public class ContohSilsilahKeluarga {

    public static void main(String[] args) {
        Kakek kakek = new Kakek("Rahmat", 80, "Pensiunan", 165, 70);
        Nenek nenek = new Nenek("Ngatinah", 81, "Ibu Rumah Tangga", 158, 65);
        Ayah ayah = new Ayah("Slamet Widodo", 48, "Karyawan Swasta", 170, 75);
        Ibu ibu = new Ibu("Dwi Wahyuni", 47, "Ibu Rumah Tangga", 162, 60);
        Kakak kakak = new Kakak("Ana Arliani Anugrah Putri", 20, "Mahasiswa", 165, 55);
        Adik adik = new Adik("Gita Aulia Rahmadhani", 14, "Pelajar", 150, 45);

        System.out.println("*Silsilah Keluarga*");
        kakek.tampilInfo();
        nenek.tampilInfo();
        System.out.println("*Orang Tua*");
        ayah.tampilInfo();
        ibu.tampilInfo();
        System.out.println("*Anak-Anak*");
        kakak.tampilInfo();
        adik.tampilInfo();
    }
}
