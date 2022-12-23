package id.ac.undiksha.organisasi;

public class Prodi implements Jurusan {
	private String kodeProdi;
	private String namaProdi;
	
	public Prodi() {
		this.setKodeProdi("(Kode Prodi belum diisi)");
		this.setNamaProdi("(Prodi belum diisi)");
		this.setKodeJurusan("(Kode Jurusan belum diisi)");
		this.setNamaJurusan("(Nama Jurusan belum diisi)");
		this.setNamaFakultas("(Nama Fakultas belum diisi)");
	}
	
	public Prodi(String kodeProdi, String namaProdi, String kodeJurusan, String namaJurusan, String namaFakultas) {
		super();
		this.kodeProdi 		= kodeProdi;
		this.namaProdi 		= namaProdi;
		this.kodeJurusan 	= kodeJurusan;
		this.namaJurusan 	= namaJurusan;
		this.namaFakultas 	= namaFakultas;
	}

	public String getKodeProdi() {
		return kodeProdi;
	}

	public void setKodeProdi(String kodeProdi) {
		this.kodeProdi = kodeProdi;
	}

	public String getNamaProdi() {
		return namaProdi;
	}

	public void setNamaProdi(String namaProdi) {
		this.namaProdi = namaProdi;
	}
	
	
	private String kodeJurusan;
	private String namaJurusan;
	private String namaFakultas;

	@Override
	public void setKodeJurusan(String kodeJurusan) {
		this.kodeJurusan = kodeJurusan;
	}
	
	@Override
	public String getKodeJurusan() {
		return this.kodeJurusan;
	}
	
	@Override
	public void setNamaJurusan(String namaJurusan) {
		this.namaJurusan = namaJurusan;
	}
	
	@Override
	public String getNamaJurusan() {
		return this.namaJurusan;
	}

	@Override
	public void setNamaFakultas(String namaFakultas) {
		this.namaFakultas = namaFakultas;
	}

	@Override
	public String getNamaFakultas() {
		return this.namaFakultas;
	}
	
}