package id.ac.undiksha.siak;
import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs2 = new Mahasiswa(
				"I Gede Gelgel Abdiutama",
				"Sukasada",
				true,
				"2115101014",
				"ILKOM",
				"Ilmu Komputer",
				"TI",
				"Teknik Informatika",
				"FTK"
				);
		mhs2.printAllInfo();
		
		Dosen dosen1 = new Dosen(
				"A.A. Gede Yudhi Paramartha, S.Kom., M.Kom.",
				"Singaraja",
				true,
				"198806222015041003",
				"ILKOM",
				"Ilmu Komputer",
				"Koorprodi",
				"TI",
				"Teknik Informatika",
				"FTK"
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
