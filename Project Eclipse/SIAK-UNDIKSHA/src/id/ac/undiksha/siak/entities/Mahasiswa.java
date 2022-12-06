package id.ac.undiksha.siak.entities;

public class Mahasiswa {
	private String nama;
	private String nim;
	private String alamat;
	private boolean jenisKelamin; //0=perempuan, 1=laki-laki
	private String prodi;
	private String jurusan;
	private String fakultas;
	
	public Mahasiswa() {
		this.setNama("(Nama belum diisi)");
		this.setNim("(NIM belum diisi)");
		this.setAlamat("(Alamat belum diisi)");
		this.setProdi("(Prodi belum diisi)");
		this.setJurusan("(Jurusan belum diisi)");
		this.setFakultas("(Fakultas belum diisi)");
	}
	
	public Mahasiswa(String nama, String nim, String alamat, boolean jenisKelamin, String prodi, String jurusan,
			String fakultas) {
		super();
		this.nama = nama;
		this.nim = nim;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public void printAllInfo() {
		System.out.println("IDENTITAS MAHASISWA");
		System.out.println("Nama\t\t: " 		+ this.getNama());
		System.out.println("NIM\t\t: " 			+ this.getNim());
		System.out.println("Jenis Kelamin\t: "	+ (jenisKelamin ? "Laki-laki" : "Perempuan"));
		System.out.println("Alamat\t\t: " 		+ this.getAlamat());
		System.out.println("Prodi\t\t: " 		+ this.getProdi());
		System.out.println("Jurusan\t\t: " 		+ this.getJurusan());
		System.out.println("Fakultas\t: " 		+ this.getFakultas());
		System.out.println("\n");
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public boolean isJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
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
