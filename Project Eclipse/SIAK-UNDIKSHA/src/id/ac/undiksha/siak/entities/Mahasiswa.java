package id.ac.undiksha.siak.entities;

import id.ac.undiksha.organisasi.Prodi;

public class Mahasiswa extends Manusia {
	private String nim;
	private Prodi prodi;
	
	public Mahasiswa() {
		super();
		prodi = new Prodi();
		this.setNim("(NIM belum diisi)");
	}

	public Mahasiswa(String nama, String alamat, boolean jenisKelamin, String nim, String kodeProdi, String namaProdi, String kodeJurusan, String namaJurusan, String namaFakultas) {
		super(nama, alamat, jenisKelamin);
		prodi = new Prodi(kodeProdi, namaProdi, kodeJurusan, namaJurusan, namaFakultas);
		this.nim = nim;
		
	}

	public void printAllInfo() {
		System.out.println("IDENTITAS MAHASISWA");
		System.out.println("Nama\t\t: " 		+ this.getNama());
		System.out.println("Alamat\t\t: " 		+ this.getAlamat());
		System.out.println("Jenis Kelamin\t: "	+ (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
		System.out.println("NIM\t\t: " 			+ this.getNim());
		System.out.println("Kode Prodi\t: " 	+ this.getProdi().getKodeProdi());
		System.out.println("Nama Prodi\t: " 	+ this.getProdi().getNamaProdi());
		System.out.println("Kode Jurusan\t: " 	+ this.getProdi().getKodeJurusan());
		System.out.println("Nama Jurusan\t: " 	+ this.getProdi().getNamaJurusan());
		System.out.println("Nama Fakultas\t: " 	+ this.getProdi().getNamaFakultas());
		System.out.println("\n");
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public Prodi getProdi() {
		return prodi;
	}

	public void setProdi(Prodi prodi) {
		this.prodi = prodi;
	}
	
}
