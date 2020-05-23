package co.id.bpkh.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "DD_MAST_BANK")
@EntityListeners(AuditingEntityListener.class)
public class rjth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String kode_bank;
	private String nama_bank;
	private String total;
	private String giro;
	private String deposito;
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
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getGiro() {
		return giro;
	}
	public void setGiro(String giro) {
		this.giro = giro;
	}
	public String getDeposito() {
		return deposito;
	}
	public void setDeposito(String deposito) {
		this.deposito = deposito;
	}
	
	
	
	
}
