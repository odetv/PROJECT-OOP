package id.ac.undiksha.siak.entities;

public class Dosen {
	private String nama;
	private String nip;
	private boolean jenisKelamin; //0=perempuan, 1=laki-laki
	private String alamat;
	private String prodi;
	private String jurusan;
	private String fakultas;
	private String jabatan;
	
	public Dosen() {
		this.setNama("(Nama belum diisi)");
		this.setNip("(NIP belum diisi)");
		this.setAlamat("(Alamat belum diisi)");
		this.setProdi("(Prodi belum diisi)");
		this.setJurusan("(Jurusan belum diisi)");
		this.setFakultas("(Fakultas belum diisi)");
		this.setJabatan("(Jabatan belum diisi)");
	}
	
	public Dosen(String nama, String nip, boolean jenisKelamin, String alamat, String prodi, String jurusan,
			String fakultas, String jabatan) {
		super();
		this.nama = nama;
		this.nip = nip;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
		this.jabatan = jabatan;
	}
	
	public void printAllInfo() {
		System.out.println("IDENTITAS DOSEN");
		System.out.println("Nama\t\t: " 		+ this.getNama());
		System.out.println("NIP\t\t: " 			+ this.getNip());
		System.out.println("Jenis Kelamin\t: "	+ (jenisKelamin ? "Laki-laki" : "Perempuan"));
		System.out.println("Alamat\t\t: " 		+ this.getAlamat());
		System.out.println("Prodi\t\t: " 		+ this.getProdi());
		System.out.println("Jurusan\t\t: " 		+ this.getJurusan());
		System.out.println("Fakultas\t: " 		+ this.getFakultas());
		System.out.println("Jabatan\t\t: " 		+ this.getJabatan());
		System.out.println("\n");
	}

	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
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
	public String getJabatan() {
		return jabatan;
	}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
}
