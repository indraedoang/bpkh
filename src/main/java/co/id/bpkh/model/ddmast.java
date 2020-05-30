package co.id.bpkh.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "DDMAST")
@EntityListeners(AuditingEntityListener.class)
public class ddmast {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String no_va;
	private String rek_rjth;
	private String amt_rjth;
	private String rek_va;
	private String amt_va;
	private String AMT;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNo_va() {
		return no_va;
	}
	public void setNo_va(String no_va) {
		this.no_va = no_va;
	}
	public String getRek_rjth() {
		return rek_rjth;
	}
	public void setRek_rjth(String rek_rjth) {
		this.rek_rjth = rek_rjth;
	}
	public String getAmt_rjth() {
		return amt_rjth;
	}
	public void setAmt_rjth(String amt_rjth) {
		this.amt_rjth = amt_rjth;
	}
	public String getRek_va() {
		return rek_va;
	}
	public void setRek_va(String rek_va) {
		this.rek_va = rek_va;
	}
	public String getAmt_va() {
		return amt_va;
	}
	public void setAmt_va(String amt_va) {
		this.amt_va = amt_va;
	}
	public String getAMT() {
		return AMT;
	}
	public void setAMT(String aMT) {
		AMT = aMT;
	}
	
	
}
