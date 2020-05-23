package co.id.bpkh.controller;

import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.id.bpkh.model.masterdata;
import co.id.bpkh.model.notifikasi;
import co.id.bpkh.model.setoranAwal;
import co.id.bpkh.repository.masterdataRepository;
import co.id.bpkh.repository.setoranAwalRepository;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class transaksiController {
	LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("GMT+07:00"));
	@Autowired
	setoranAwalRepository setoranAwalRepo;
	@Autowired 
	masterdataRepository masterdataRepo;
	
	
	@GetMapping("/bpkh/datanasabah")
	public List<masterdata> index1()
	{
		return masterdataRepo.findAll();
	}
	@PostMapping("/bpkh/datanasabah")
	public notifikasi store(@Valid @RequestBody masterdata masterdata)
	{
		notifikasi message = new notifikasi();
		masterdata.getKode_bank();
		masterdata.getKode_wilayah();
		masterdata.getKode_haji();
		masterdata.getKode_jenis_kelamin();
		DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
		String years = df.format(Calendar.getInstance().getTime());
		
		 String generate_number = masterdataRepo.no_va();
		 int referensi;
		 int seq;
		 int Year =  localDateTime.getYear();
		 
		 if(generate_number == null) {
			 seq = 1;
		 }else {
			 seq = Integer.parseInt(generate_number)+1;
		 }
		 referensi = seq;
		 DecimalFormat refrensi = new DecimalFormat("00000");
		 String c = refrensi.format(referensi);
		 String no_va = masterdata.getKode_bank()+masterdata.getKode_wilayah()+years+masterdata.getKode_haji()+masterdata.getKode_jenis_kelamin()+c;
		try{
			int status = 0;
			String pesan = "Data Berhasil di Simpan !";
//			message.setResult(result); setNo_Va(no_va);
//			message.setNo_validasi(masterdata.getNo_validasi());
//			message.setNama_jamaah(masterdata.getNama_jamaah());
			message.setStatus(status);
			message.setMessage(pesan);
			masterdata.setNo_va(no_va);
			masterdataRepo.save(masterdata);
		}catch (Exception e) {
			int status = 69;
			String pesan = "Data Gagal di Simpan !";
			String no_Va = "empty";
			//message.setNo_Va(no_va);
//			message.setNo_validasi(masterdata.getNo_validasi());
//			message.setNama_jamaah(masterdata.getNama_jamaah());
			message.setStatus(status);
			message.setMessage(pesan);
		}
		return message;
	}
	
	
	
	@GetMapping("/bpkh/data/nasabah")
	public List<setoranAwal> index()
	{
		return setoranAwalRepo.datanasabah();
	}
	
	@PostMapping("/bpkh/setoranAwal")
	public notifikasi store(@Valid @RequestBody setoranAwal setoranawal)
	{
		notifikasi message = new notifikasi();
		try{
			int status = 0;
			String pesan = "Data Berhasil di Simpan !";
			String no_Va = "2020202020";
			message.setStatus(status);
			message.setMessage(pesan);
			//message.setNo_Va(no_Va);
			setoranawal.setS_NO_VA(no_Va);
			setoranAwalRepo.save(setoranawal);
		}catch (Exception e) {
			int status = 0;
			String pesan = "Data Gagal di Simpan !";
			String no_Va = "empty";
			message.setStatus(status);
			message.setMessage(pesan);
			//message.setNo_Va(no_Va);
		}
		return message;
	}
	
}
