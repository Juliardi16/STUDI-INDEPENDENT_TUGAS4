package tugas4;

public class JuliardiRestoCabangTimur extends JuliardiResto {
    String namaPemilikfranchise = "",
            noTelpResto = "",
            cabang = "";
    int jumlahKaryawan = 0;

    String[] promoMenuCabangTimur = {"Paket Keluarga", "Paket Ulang Tahun"};

    public JuliardiRestoCabangTimur(String namaPemilikfranchise, String noTelpResto, String cabang) {
        this.namaPemilikfranchise = namaPemilikfranchise;
        this.noTelpResto = noTelpResto;
        this.cabang = cabang;
    }

    @Override
    public void tampilPromo() {
        System.out.println("Daftar Promo Cabang Timur :");
        for (int i = 0; i<promoMenuCabangTimur.length; i++) {
            System.out.println(i+1 + ". " +  promoMenuCabangTimur[i]);
        }

    }

    public String getNamaPemilikfranchise() {
        return namaPemilikfranchise;
    }

    public void setNamaPemilikfranchise(String namaPemilikfranchise) {
        this.namaPemilikfranchise = namaPemilikfranchise;
    }

    @Override
    public String getNoTelpResto() {
        return noTelpResto;
    }

    @Override
    public void setNoTelpResto(String noTelpResto) {
        this.noTelpResto = noTelpResto;
    }

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public int getJumlahKaryawan() {
        return jumlahKaryawan;
    }

    public void setJumlahKaryawan(int jumlahKaryawan) {
        this.jumlahKaryawan = jumlahKaryawan;
    }
}

