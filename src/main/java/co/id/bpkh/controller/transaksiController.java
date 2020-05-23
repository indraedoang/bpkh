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

import co.id.bpkh.exception.ResourceNotFoundException;
import co.id.bpkh.model.ResultBpkh;
import co.id.bpkh.model.bank;
import co.id.bpkh.model.masterdata;
import co.id.bpkh.model.notifikasi;
import co.id.bpkh.model.rjth;
import co.id.bpkh.model.setoranAwal;
import co.id.bpkh.repository.bankRepository;
import co.id.bpkh.repository.masterdataRepository;
import co.id.bpkh.repository.rjthRepository;
import co.id.bpkh.repository.setoranAwalRepository;


@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class transaksiController {
	LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("GMT+07:00"));
	@Autowired
	setoranAwalRepository setoranAwalRepo;
	@Autowired 
	masterdataRepository masterdataRepo;
	@Autowired
	rjthRepository rjthRepo;
	@Autowired
	bankRepository bankRepo;
	
	@GetMapping("/bpkh/datanasabah")
	public List<masterdata> index1()
	{
		return masterdataRepo.findAll();
	}
	@PostMapping("/bpkh/setoranAwal")
	public notifikasi<ResultBpkh> store(@Valid @RequestBody masterdata masterdata)
	{
		ResultBpkh result = new ResultBpkh();
		bank getbank = new bank();
	 	rjth DataRjth = new rjth();
		masterdata.getKode_bank();
		masterdata.getKode_wilayah();
		masterdata.getKode_haji();
		masterdata.getKode_jenis_kelamin();
		DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
		String years = df.format(Calendar.getInstance().getTime());
		
		 String generate_number = masterdataRepo.no_va(masterdata.getKode_bank());
		 int referensi;
		 int seq;
		 int Year =  localDateTime.getYear();
		 int status;
		 int totalUang;
		 String pesan;
		// get data bank 
		 String idRjth = rjthRepo.findId(masterdata.getKode_bank());
		 String total = rjthRepo.totalUang(masterdata.getKode_bank());
		 if(idRjth != null) {
			 totalUang = Integer.parseInt(total)+Integer.parseInt(masterdata.getNominal());
			 int idrjth = Integer.parseInt(idRjth);
			 DataRjth = rjthRepo.findById(idrjth).orElseThrow(() -> new ResourceNotFoundException("id", "id", idrjth));
			 DataRjth.setTotal(Integer.toString(totalUang));
		 }else {
			 totalUang = Integer.parseInt(masterdata.getNominal());
			 getbank = bankRepo.findByKodeBank(masterdata.getKode_bank());
			 DataRjth.setKode_bank(getbank.getKode_bank());
			 DataRjth.setNama_bank(getbank.getNama_bank());
			 DataRjth.setTotal(Integer.toString(totalUang));
			 
		 }
		
	 // end
		 
		 //int id = rjthRepo.findById(idRjth);
		 
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
			status = 0;
			pesan = "Data Berhasil di Simpan !";
			result.setNo_Va(no_va);
			result.setNo_validasi(masterdata.getNo_validasi());
			result.setNama_jamaah(masterdata.getNama_jamaah());
			masterdata.setNo_va(no_va);
			masterdataRepo.save(masterdata);
			rjthRepo.save(DataRjth);
			
		}catch (Exception e) {
			status = 69;
			 pesan = "Data Gagal di Simpan !";
			String no_Va = "empty";
			String no_va1 = "0";
			result.setNo_Va(no_va1);
			result.setNo_validasi(masterdata.getNo_validasi());
			result.setNama_jamaah(masterdata.getNama_jamaah());
		}
		return new notifikasi<>(status, pesan, result);
	}
	
	
	
	@GetMapping("/bpkh/data/nasabah")
	public List<setoranAwal> index()
	{
		return setoranAwalRepo.datanasabah();
	}
	
	//@PostMapping("/bpkh/setoranAwal")
//	public notifikasi store(@Valid @RequestBody setoranAwal setoranawal)
//	{
//		notifikasi message = new notifikasi();
//		try{
//			int status = 0;
//			String pesan = "Data Berhasil di Simpan !";
//			String no_Va = "2020202020";
//			message.setStatus(status);
//			message.setMessage(pesan);
//			//message.setNo_Va(no_Va);
//			setoranawal.setS_NO_VA(no_Va);
//			setoranAwalRepo.save(setoranawal);
//		}catch (Exception e) {
//			int status = 0;
//			String pesan = "Data Gagal di Simpan !";
//			String no_Va = "empty";
//			message.setStatus(status);
//			message.setMessage(pesan);
//			//message.setNo_Va(no_Va);
//		}
//		return message;
//	}
	
}
