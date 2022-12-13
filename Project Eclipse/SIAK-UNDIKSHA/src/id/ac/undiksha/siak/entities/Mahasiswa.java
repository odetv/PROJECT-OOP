package id.ac.undiksha.siak.entities;

public class Mahasiswa extends Manusia {
	private String nim;
	private String prodi;
	private String jurusan;
	private String fakultas;
	
	public Mahasiswa() {
		super();
		this.setNim("(NIM belum diisi)");
		this.setProdi("(Prodi belum diisi)");
		this.setJurusan("(Jurusan belum diisi)");
		this.setFakultas("(Fakultas belum diisi)");
	}

	public Mahasiswa(String nama, String alamat, boolean jenisKelamin, String nim, String prodi, String jurusan, String fakultas) {
		super(nama, alamat, jenisKelamin);
		this.nim = nim;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public void printAllInfo() {
		System.out.println("IDENTITAS MAHASISWA");
		System.out.println("Nama\t\t: " 		+ this.getNama());
		System.out.println("Alamat\t\t: " 		+ this.getAlamat());
		System.out.println("Jenis Kelamin\t: "	+ (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
		System.out.println("NIM\t\t: " 			+ this.getNim());
		System.out.println("Prodi\t\t: " 		+ this.getProdi());
		System.out.println("Jurusan\t\t: " 		+ this.getJurusan());
		System.out.println("Fakultas\t: " 		+ this.getFakultas());
		System.out.println("\n");
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getProdi() {
		return prodi;
	}

	public void setProdi(String prodi) {
		this.prodi = prodi;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public String getFakultas() {
		return fakultas;
	}

	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}
	
	
}
