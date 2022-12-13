package id.ac.undiksha.siak.entities;

public abstract class Manusia {
	private String nama;
	private String alamat;
	private boolean jenisKelamin;
	
	public Manusia() {
		this.setNama("(Nama belum diisi)");
		this.setAlamat("(Alamat belum diisi)");
	}

	public Manusia(String nama, String alamat, boolean jenisKelamin) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public boolean getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
}