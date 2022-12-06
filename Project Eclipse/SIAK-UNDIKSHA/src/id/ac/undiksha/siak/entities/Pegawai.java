package id.ac.undiksha.siak.entities;

public class Pegawai {
	private String nama;
	private String nip;
	private boolean jenisKelamin; //0=perempuan, 1=laki-laki
	private String alamat;
	private String unit;
	
	public Pegawai() {
		this.setNama("(Nama belum diisi)");
		this.setNip("(NIP belum diisi)");
		this.setAlamat("(Alamat belum diisi)");
		this.setUnit("(Unit Kerja belum diisi)");
	}
	
	public Pegawai(String nama, String nip, boolean jenisKelamin, String alamat, String unit) {
		super();
		this.nama = nama;
		this.nip = nip;
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
		this.unit = unit;
	}

	public void printAllInfo() {
		System.out.println("IDENTITAS PEGAWAI");
		System.out.println("Nama\t\t: " 		+ this.getNama());
		System.out.println("NIP\t\t: " 			+ this.getNip());
		System.out.println("Jenis Kelamin\t: "	+ (jenisKelamin ? "Laki-laki" : "Perempuan"));
		System.out.println("Alamat\t\t: " 		+ this.getAlamat());
		System.out.println("Unit\t\t: " 		+ this.getUnit());
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
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
}
