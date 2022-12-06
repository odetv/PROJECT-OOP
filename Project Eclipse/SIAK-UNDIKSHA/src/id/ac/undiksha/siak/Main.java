package id.ac.undiksha.siak;
import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa(
				"I Gede Gelgel Abdiutama",
				"2115101014",
				"Sukasada",
				true,
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK"
				);
		mhs1.printAllInfo();
		
		Dosen dosen1 = new Dosen(
				"A.A. Gede Yudhi Paramartha, S.Kom., M.Kom.",
				"198806222015041003",
				true,
				"Singaraja",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK",
				"Koorprodi Ilmu Komputer"
				);
		dosen1.printAllInfo();
		
		Pegawai pegawai1 = new Pegawai(
				"Pegawai",
				"127891192017040221",
				false,
				"Buleleng",
				"Laboratorium FTK"
				);
		pegawai1.printAllInfo();
	}

}
