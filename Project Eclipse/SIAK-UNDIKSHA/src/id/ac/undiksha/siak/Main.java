package id.ac.undiksha.siak;
import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa(
				"I Gede Gelgel Abdiutama",
				"Sukasada",
				true,
				"2115101014",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK"
				);
		mhs1.printAllInfo();
		
		Dosen dosen1 = new Dosen(
				"A.A. Gede Yudhi Paramartha, S.Kom., M.Kom.",
				"Singaraja",
				true,
				"198806222015041003",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK",
				"Koorprodi Ilmu Komputer"
				);
		dosen1.printAllInfo();
		
		Pegawai pegawai1 = new Pegawai(
				"Pegawai",
				"Buleleng",
				false,
				"127891192017040221",
				"Laboratorium FTK"
				);
		pegawai1.printAllInfo();
	}
}
