package co.id.bpkh.model;

public class notifikasi <T> {
//	private String no_Va;
//	private String no_validasi;
//	private String nama_jamaah;
	private int status;
	private String message;
	private Object result;
	
	public notifikasi(int status, String message, Object result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	//	public String getNo_validasi() {
//		return no_validasi;
//	}
//	public void setNo_validasi(String no_validasi) {
//		this.no_validasi = no_validasi;
//	}
//	public String getNama_jamaah() {
//		return nama_jamaah;
//	}
//	public void setNama_jamaah(String nama_jamaah) {
//		this.nama_jamaah = nama_jamaah;
//	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
//	public String getNo_Va() {
//		return no_Va;
//	}
//	public void setNo_Va(String no_Va) {
//		this.no_Va = no_Va;
//	}
	
	
	
}
