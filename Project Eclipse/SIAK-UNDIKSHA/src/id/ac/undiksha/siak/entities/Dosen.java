package id.ac.undiksha.siak.entities;

import id.ac.undiksha.organisasi.Prodi;

public class Dosen extends Manusia {
	private String nip;
	private Prodi prodi;
	private String jabatan;
	
	public Dosen() {
		super();
		prodi = new Prodi();
		this.setNip("(NIP belum diisi)");
		this.setJabatan("(Jabatan belum diisi)");
	}
	
	public Dosen(String nama, String alamat, boolean jenisKelamin, String nip, String kodeProdi, String namaProdi, String jabatan, String kodeJurusan, String namaJurusan, String namaFakultas) {
		super(nama, alamat, jenisKelamin);
		this.nip = nip;
		prodi = new Prodi(kodeProdi, namaProdi, kodeJurusan, namaJurusan, namaFakultas);
		this.jabatan = jabatan;
	}

	public void printAllInfo() {
		System.out.println("IDENTITAS DOSEN");
		System.out.println("Nama\t\t: " 		+ this.getNama());
		System.out.println("Alamat\t\t: " 		+ this.getAlamat());
		System.out.println("Jenis Kelamin\t: "	+ (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
		System.out.println("NIP\t\t: " 			+ this.getNip());
		System.out.println("Kode Prodi\t: " 	+ this.getProdi().getKodeProdi());
		System.out.println("Nama Prodi\t: " 	+ this.getProdi().getNamaProdi());
		System.out.println("Kode Jurusan\t: " 	+ this.getProdi().getKodeJurusan());
		System.out.println("Nama Jurusan\t: " 	+ this.getProdi().getNamaJurusan());
		System.out.println("Nama Fakultas\t: " 	+ this.getProdi().getNamaFakultas());
		System.out.println("Jabatan\t\t: " 		+ this.getJabatan());
		System.out.println("\n");
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public Prodi getProdi() {
		return prodi;
	}

	public void setProdi(Prodi prodi) {
		this.prodi = prodi;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
}
