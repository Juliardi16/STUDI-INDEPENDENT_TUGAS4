package tugas4;

public class Main {
    public static void main(String[] args) {
        JuliardiResto resto = new JuliardiResto();
        JuliardiRestoCabangUtara cabangUtara = new JuliardiRestoCabangUtara("Ibnu Malik", "02199999999", "Jakarta Utara");
        JuliardiRestoCabangTimur cabangTimur = new JuliardiRestoCabangTimur("Farid Kharisudin", "02188888888", "Jakarta Timur");

        cabangUtara.setJumlahKaryawan(50);
        cabangTimur.setJumlahKaryawan(40);

        System.out.println("Nama Resto : " + resto.getNamaResto());
        System.out.println("Owner Franchise : " + cabangTimur.getNamaPemilikfranchise());
        System.out.println("Cabang : " + cabangTimur.getCabang());
        System.out.println("Jumlah Karyawan : " + cabangTimur.getJumlahKaryawan());
        cabangTimur.tampilPromo();
        System.out.println();
        System.out.println();
        System.out.println("Nama Resto : " + resto.getNamaResto());
        System.out.println("Owner Franchise : " + cabangUtara.getNamaPemilikfranchise());
        System.out.println("Cabang : " + cabangUtara.getCabang());
        System.out.println("Jumlah Karyawan : " + cabangUtara.getJumlahKaryawan());
        cabangUtara.tampilPromo();
    }
    }


