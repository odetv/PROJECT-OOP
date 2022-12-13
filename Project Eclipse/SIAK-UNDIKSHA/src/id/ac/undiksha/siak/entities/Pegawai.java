package id.ac.undiksha.siak.entities;

public class Pegawai extends Manusia{
	private String nip;
	private String unit;
	
	public Pegawai() {
		super();
		this.setNip("(NIP belum diisi)");
		this.setUnit("(Unit Kerja belum diisi)");
	}

	public Pegawai(String nama, String alamat, boolean jenisKelamin, String nip, String unit) {
		super(nama, alamat, jenisKelamin);
		this.nip = nip;
		this.unit = unit;
	}

	public void printAllInfo() {
		System.out.println("IDENTITAS PEGAWAI");
		System.out.println("Nama\t\t: " 		+ this.getNama());
		System.out.println("Alamat\t\t: " 		+ this.getAlamat());
		System.out.println("Jenis Kelamin\t: "	+ (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
		System.out.println("NIP\t\t: " 			+ this.getNip());
		System.out.println("Unit\t\t: " 		+ this.getUnit());
		System.out.println("\n");
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
