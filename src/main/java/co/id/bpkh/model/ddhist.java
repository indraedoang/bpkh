package co.id.bpkh.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "DDHIST")
@EntityListeners(AuditingEntityListener.class)
public class ddhist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String KODE_BANK;
	private String NAMA_BANK;
	@JsonFormat(pattern = "YYYY-MM-dd")
	private LocalDateTime TGL_TRX;
	@JsonFormat(pattern = "YYYY-MM-dd")
	private LocalDateTime TGL_VALUTA;
	private String KODE_TRANS;
	private String KODE_MUTASI;
	private String CURRENCY;
	private String NOMINAL_MUTASI;
	private String SALDO;
	private String KODE_SALDO;
	private String refrensi;
	private String NO_VALIDASI;
	private String NO_PORSI;
	private String NO_BILYET;
	private String NO_REKENING;
	private String NAMA_JAMAAH;
	private String NO_SURAT;
	private String KETERANGAN;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getKODE_BANK() {
		return KODE_BANK;
	}
	public void setKODE_BANK(String kODE_BANK) {
		KODE_BANK = kODE_BANK;
	}
	public String getNAMA_BANK() {
		return NAMA_BANK;
	}
	public void setNAMA_BANK(String nAMA_BANK) {
		NAMA_BANK = nAMA_BANK;
	}
	public LocalDateTime getTGL_TRX() {
		return TGL_TRX;
	}
	public void setTGL_TRX(LocalDateTime tGL_TRX) {
		TGL_TRX = tGL_TRX;
	}
	public LocalDateTime getTGL_VALUTA() {
		return TGL_VALUTA;
	}
	public void setTGL_VALUTA(LocalDateTime tGL_VALUTA) {
		TGL_VALUTA = tGL_VALUTA;
	}
	public String getKODE_TRANS() {
		return KODE_TRANS;
	}
	public void setKODE_TRANS(String kODE_TRANS) {
		KODE_TRANS = kODE_TRANS;
	}
	public String getKODE_MUTASI() {
		return KODE_MUTASI;
	}
	public void setKODE_MUTASI(String kODE_MUTASI) {
		KODE_MUTASI = kODE_MUTASI;
	}
	public String getCURRENCY() {
		return CURRENCY;
	}
	public void setCURRENCY(String cURRENCY) {
		CURRENCY = cURRENCY;
	}
	public String getNOMINAL_MUTASI() {
		return NOMINAL_MUTASI;
	}
	public void setNOMINAL_MUTASI(String nOMINAL_MUTASI) {
		NOMINAL_MUTASI = nOMINAL_MUTASI;
	}
	public String getSALDO() {
		return SALDO;
	}
	public void setSALDO(String sALDO) {
		SALDO = sALDO;
	}
	public String getKODE_SALDO() {
		return KODE_SALDO;
	}
	public void setKODE_SALDO(String kODE_SALDO) {
		KODE_SALDO = kODE_SALDO;
	}
	public String getRefrensi() {
		return refrensi;
	}
	public void setRefrensi(String refrensi) {
		this.refrensi = refrensi;
	}
	public String getNO_VALIDASI() {
		return NO_VALIDASI;
	}
	public void setNO_VALIDASI(String nO_VALIDASI) {
		NO_VALIDASI = nO_VALIDASI;
	}
	public String getNO_PORSI() {
		return NO_PORSI;
	}
	public void setNO_PORSI(String nO_PORSI) {
		NO_PORSI = nO_PORSI;
	}
	public String getNO_BILYET() {
		return NO_BILYET;
	}
	public void setNO_BILYET(String nO_BILYET) {
		NO_BILYET = nO_BILYET;
	}
	public String getNO_REKENING() {
		return NO_REKENING;
	}
	public void setNO_REKENING(String nO_REKENING) {
		NO_REKENING = nO_REKENING;
	}
	public String getNAMA_JAMAAH() {
		return NAMA_JAMAAH;
	}
	public void setNAMA_JAMAAH(String nAMA_JAMAAH) {
		NAMA_JAMAAH = nAMA_JAMAAH;
	}
	public String getNO_SURAT() {
		return NO_SURAT;
	}
	public void setNO_SURAT(String nO_SURAT) {
		NO_SURAT = nO_SURAT;
	}
	public String getKETERANGAN() {
		return KETERANGAN;
	}
	public void setKETERANGAN(String kETERANGAN) {
		KETERANGAN = kETERANGAN;
	}
	
	
	
	
}
