package co.id.bpkh.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "DD_MAST")
@EntityListeners(AuditingEntityListener.class)
public class setoranAwal {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String  S_TRANSDATE; 
	private String S_TRANSTIME;
	private String S_USERTRANS;
	private String S_CABTRANS;
	private String S_RRN;
	private String S_MERCHANTTYPE;
	private int N_AMOUNT;
	private String S_CURRENCY;
	private String S_NOREK;
	private String S_NAMAJEMAAH;
	private String S_JENISJEMAAH;
	private String S_NOIDENTITAS;
	private String S_TEMPATLAHIR;
	private String S_TANGGALLAHIR;
	private String S_KD_JENISKELAMIN;
	private String S_ALAMAT;
	private String S_KODEPOS;
	private String S_KELURAHAN;
	private String S_KECAMATAN;
	private String S_KOTA;
	private String S_KD_PROV;
	private String S_KD_PEKERJAAN;
	private String S_KD_PENDIDIKAN;
	private String S_KD_STS_NIKAH;
	private String S_NO_VALIDASI;
	private String S_RESPONSECODE;
	private int N_JUMLAHCETAK;
	private int N_STS_TALANGAN;
	private String S_NO_REGISTRASI_KHUSUS;
	private String S_NAMA_AYAH;
	private String S_THN_BERANGKAT;
	private String S_EMBARKASI;
	private String S_KLOTER;
	private String S_NO_VA;
	public String getS_TRANSDATE() {
		return S_TRANSDATE;
	}
	public void setS_TRANSDATE(String s_TRANSDATE) {
		S_TRANSDATE = s_TRANSDATE;
	}
	public String getS_TRANSTIME() {
		return S_TRANSTIME;
	}
	public void setS_TRANSTIME(String s_TRANSTIME) {
		S_TRANSTIME = s_TRANSTIME;
	}
	public String getS_USERTRANS() {
		return S_USERTRANS;
	}
	public void setS_USERTRANS(String s_USERTRANS) {
		S_USERTRANS = s_USERTRANS;
	}
	public String getS_CABTRANS() {
		return S_CABTRANS;
	}
	public void setS_CABTRANS(String s_CABTRANS) {
		S_CABTRANS = s_CABTRANS;
	}
	public String getS_RRN() {
		return S_RRN;
	}
	public void setS_RRN(String s_RRN) {
		S_RRN = s_RRN;
	}
	public String getS_MERCHANTTYPE() {
		return S_MERCHANTTYPE;
	}
	public void setS_MERCHANTTYPE(String s_MERCHANTTYPE) {
		S_MERCHANTTYPE = s_MERCHANTTYPE;
	}
	public int getN_AMOUNT() {
		return N_AMOUNT;
	}
	public void setN_AMOUNT(int n_AMOUNT) {
		N_AMOUNT = n_AMOUNT;
	}
	public String getS_CURRENCY() {
		return S_CURRENCY;
	}
	public void setS_CURRENCY(String s_CURRENCY) {
		S_CURRENCY = s_CURRENCY;
	}
	public String getS_NOREK() {
		return S_NOREK;
	}
	public void setS_NOREK(String s_NOREK) {
		S_NOREK = s_NOREK;
	}
	public String getS_NAMAJEMAAH() {
		return S_NAMAJEMAAH;
	}
	public void setS_NAMAJEMAAH(String s_NAMAJEMAAH) {
		S_NAMAJEMAAH = s_NAMAJEMAAH;
	}
	public String getS_JENISJEMAAH() {
		return S_JENISJEMAAH;
	}
	public void setS_JENISJEMAAH(String s_JENISJEMAAH) {
		S_JENISJEMAAH = s_JENISJEMAAH;
	}
	public String getS_NOIDENTITAS() {
		return S_NOIDENTITAS;
	}
	public void setS_NOIDENTITAS(String s_NOIDENTITAS) {
		S_NOIDENTITAS = s_NOIDENTITAS;
	}
	public String getS_TEMPATLAHIR() {
		return S_TEMPATLAHIR;
	}
	public void setS_TEMPATLAHIR(String s_TEMPATLAHIR) {
		S_TEMPATLAHIR = s_TEMPATLAHIR;
	}
	public String getS_TANGGALLAHIR() {
		return S_TANGGALLAHIR;
	}
	public void setS_TANGGALLAHIR(String s_TANGGALLAHIR) {
		S_TANGGALLAHIR = s_TANGGALLAHIR;
	}
	public String getS_KD_JENISKELAMIN() {
		return S_KD_JENISKELAMIN;
	}
	public void setS_KD_JENISKELAMIN(String s_KD_JENISKELAMIN) {
		S_KD_JENISKELAMIN = s_KD_JENISKELAMIN;
	}
	public String getS_ALAMAT() {
		return S_ALAMAT;
	}
	public void setS_ALAMAT(String s_ALAMAT) {
		S_ALAMAT = s_ALAMAT;
	}
	public String getS_KODEPOS() {
		return S_KODEPOS;
	}
	public void setS_KODEPOS(String s_KODEPOS) {
		S_KODEPOS = s_KODEPOS;
	}
	public String getS_KELURAHAN() {
		return S_KELURAHAN;
	}
	public void setS_KELURAHAN(String s_KELURAHAN) {
		S_KELURAHAN = s_KELURAHAN;
	}
	public String getS_KECAMATAN() {
		return S_KECAMATAN;
	}
	public void setS_KECAMATAN(String s_KECAMATAN) {
		S_KECAMATAN = s_KECAMATAN;
	}
	public String getS_KOTA() {
		return S_KOTA;
	}
	public void setS_KOTA(String s_KOTA) {
		S_KOTA = s_KOTA;
	}
	public String getS_KD_PROV() {
		return S_KD_PROV;
	}
	public void setS_KD_PROV(String s_KD_PROV) {
		S_KD_PROV = s_KD_PROV;
	}
	public String getS_KD_PEKERJAAN() {
		return S_KD_PEKERJAAN;
	}
	public void setS_KD_PEKERJAAN(String s_KD_PEKERJAAN) {
		S_KD_PEKERJAAN = s_KD_PEKERJAAN;
	}
	public String getS_KD_PENDIDIKAN() {
		return S_KD_PENDIDIKAN;
	}
	public void setS_KD_PENDIDIKAN(String s_KD_PENDIDIKAN) {
		S_KD_PENDIDIKAN = s_KD_PENDIDIKAN;
	}
	public String getS_KD_STS_NIKAH() {
		return S_KD_STS_NIKAH;
	}
	public void setS_KD_STS_NIKAH(String s_KD_STS_NIKAH) {
		S_KD_STS_NIKAH = s_KD_STS_NIKAH;
	}
	public String getS_NO_VALIDASI() {
		return S_NO_VALIDASI;
	}
	public void setS_NO_VALIDASI(String s_NO_VALIDASI) {
		S_NO_VALIDASI = s_NO_VALIDASI;
	}
	public String getS_RESPONSECODE() {
		return S_RESPONSECODE;
	}
	public void setS_RESPONSECODE(String s_RESPONSECODE) {
		S_RESPONSECODE = s_RESPONSECODE;
	}
	public int getN_JUMLAHCETAK() {
		return N_JUMLAHCETAK;
	}
	public void setN_JUMLAHCETAK(int n_JUMLAHCETAK) {
		N_JUMLAHCETAK = n_JUMLAHCETAK;
	}
	public int getN_STS_TALANGAN() {
		return N_STS_TALANGAN;
	}
	public void setN_STS_TALANGAN(int n_STS_TALANGAN) {
		N_STS_TALANGAN = n_STS_TALANGAN;
	}
	public String getS_NO_REGISTRASI_KHUSUS() {
		return S_NO_REGISTRASI_KHUSUS;
	}
	public void setS_NO_REGISTRASI_KHUSUS(String s_NO_REGISTRASI_KHUSUS) {
		S_NO_REGISTRASI_KHUSUS = s_NO_REGISTRASI_KHUSUS;
	}
	public String getS_NAMA_AYAH() {
		return S_NAMA_AYAH;
	}
	public void setS_NAMA_AYAH(String s_NAMA_AYAH) {
		S_NAMA_AYAH = s_NAMA_AYAH;
	}
	public String getS_THN_BERANGKAT() {
		return S_THN_BERANGKAT;
	}
	public void setS_THN_BERANGKAT(String s_THN_BERANGKAT) {
		S_THN_BERANGKAT = s_THN_BERANGKAT;
	}
	public String getS_EMBARKASI() {
		return S_EMBARKASI;
	}
	public void setS_EMBARKASI(String s_EMBARKASI) {
		S_EMBARKASI = s_EMBARKASI;
	}
	public String getS_KLOTER() {
		return S_KLOTER;
	}
	public void setS_KLOTER(String s_KLOTER) {
		S_KLOTER = s_KLOTER;
	}
	public String getS_NO_VA() {
		return S_NO_VA;
	}
	public void setS_NO_VA(String s_NO_VA) {
		S_NO_VA = s_NO_VA;
	}
	
	
	
	
}
