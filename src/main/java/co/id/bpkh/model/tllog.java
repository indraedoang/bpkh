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
@Table(name = "TLLOG")
@EntityListeners(AuditingEntityListener.class)
public class tllog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String kode_bank;
	private String nama_bank;
	private String no_identitas;
	private String nama_jamaah;
	private String nominal;
	@JsonFormat(pattern = "YYYY-MM-dd h:i:s")
	private LocalDateTime creation_date;
	
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
	public String getNo_identitas() {
		return no_identitas;
	}
	public void setNo_identitas(String no_identitas) {
		this.no_identitas = no_identitas;
	}
	public String getNama_jamaah() {
		return nama_jamaah;
	}
	public void setNama_jamaah(String nama_jamaah) {
		this.nama_jamaah = nama_jamaah;
	}
	public String getNominal() {
		return nominal;
	}
	public void setNominal(String nominal) {
		this.nominal = nominal;
	}
	public LocalDateTime getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(LocalDateTime creation_date) {
		this.creation_date = creation_date;
	}
	

}
