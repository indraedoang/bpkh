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
public class masterdata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int  id;
	private String kode_bank;
	private String nama_bank;
	private String  transdate;
	private String transtime;
	private String  no_rek_rjth;
	private String no_rek_bank;
	private String  jenis_haji;
	private String  nama_jamaah;
	private String  no_identitas;
	private String tempat_lahir;
	private String  tanggal_lahir;
	private String jenis_kelamin;
	private String  alamat;
	private String  kelurahan;
	private String  kecamatan;
	private String  provinsi;
	private String  kode_pos;
	private String  email;
	private String  no_tlp;
	private String  pekerjaan;
	private String  pendidikan;
	private String  status_nikah;
	private String  nama_ayah;
	private String  no_validasi;
	private String no_va;
	private String kode_wilayah;
	private String kode_haji;
	private int nominal;
	private String kode_jenis_kelamin;
	
	
	
	public String getKode_haji() {
		return kode_haji;
	}
	public void setKode_haji(String kode_haji) {
		this.kode_haji = kode_haji;
	}
	public int getNominal() {
		return nominal;
	}
	public void setNominal(int nominal) {
		this.nominal = nominal;
	}
	public String getNo_va() {
		return no_va;
	}
	public void setNo_va(String no_va) {
		this.no_va = no_va;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getKode_bank() {
		return kode_bank;
	}
	public void setKode_bank(String kode_bank) {
		this.kode_bank = kode_bank;
	}
	public String getNama_bank() {
		return nama_bank;
	}
	public void setNama_bank(String nama_bank) {
		this.nama_bank = nama_bank;
	}
	public String getTransdate() {
		return transdate;
	}
	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}
	public String getTranstime() {
		return transtime;
	}
	public void setTranstime(String transtime) {
		this.transtime = transtime;
	}
	
	public String getNo_rek_rjth() {
		return no_rek_rjth;
	}
	public void setNo_rek_rjth(String no_rek_rjth) {
		this.no_rek_rjth = no_rek_rjth;
	}
	public String getNo_rek_bank() {
		return no_rek_bank;
	}
	public void setNo_rek_bank(String no_rek_bank) {
		this.no_rek_bank = no_rek_bank;
	}
	public String getJenis_haji() {
		return jenis_haji;
	}
	public void setJenis_haji(String jenis_haji) {
		this.jenis_haji = jenis_haji;
	}
	public String getNama_jamaah() {
		return nama_jamaah;
	}
	public void setNama_jamaah(String nama_jamaah) {
		this.nama_jamaah = nama_jamaah;
	}
	public String getNo_identitas() {
		return no_identitas;
	}
	public void setNo_identitas(String no_identitas) {
		this.no_identitas = no_identitas;
	}
	public String getTempat_lahir() {
		return tempat_lahir;
	}
	public void setTempat_lahir(String tempat_lahir) {
		this.tempat_lahir = tempat_lahir;
	}
	public String getTanggal_lahir() {
		return tanggal_lahir;
	}
	public void setTanggal_lahir(String tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}
	public String getJenis_kelamin() {
		return jenis_kelamin;
	}
	public void setJenis_kelamin(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getKelurahan() {
		return kelurahan;
	}
	public void setKelurahan(String kelurahan) {
		this.kelurahan = kelurahan;
	}
	public String getKecamatan() {
		return kecamatan;
	}
	public void setKecamatan(String kecamatan) {
		this.kecamatan = kecamatan;
	}
	public String getProvinsi() {
		return provinsi;
	}
	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}
	public String getKode_pos() {
		return kode_pos;
	}
	public void setKode_pos(String kode_pos) {
		this.kode_pos = kode_pos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNo_tlp() {
		return no_tlp;
	}
	public void setNo_tlp(String no_tlp) {
		this.no_tlp = no_tlp;
	}
	public String getPekerjaan() {
		return pekerjaan;
	}
	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}
	public String getPendidikan() {
		return pendidikan;
	}
	public void setPendidikan(String pendidikan) {
		this.pendidikan = pendidikan;
	}
	public String getStatus_nikah() {
		return status_nikah;
	}
	public void setStatus_nikah(String status_nikah) {
		this.status_nikah = status_nikah;
	}
	public String getNama_ayah() {
		return nama_ayah;
	}
	public void setNama_ayah(String nama_ayah) {
		this.nama_ayah = nama_ayah;
	}
	public String getNo_validasi() {
		return no_validasi;
	}
	public void setNo_validasi(String no_validasi) {
		this.no_validasi = no_validasi;
	}
	public String getKode_wilayah() {
		return kode_wilayah;
	}
	public void setKode_wilayah(String kode_wilayah) {
		this.kode_wilayah = kode_wilayah;
	}
	public String getKode_jenis_kelamin() {
		return kode_jenis_kelamin;
	}
	public void setKode_jenis_kelamin(String kode_jenis_kelamin) {
		this.kode_jenis_kelamin = kode_jenis_kelamin;
	}
	
	
	
	
	
}
