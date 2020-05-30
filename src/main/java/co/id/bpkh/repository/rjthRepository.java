package co.id.bpkh.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import co.id.bpkh.model.rjth;

public interface rjthRepository extends JpaRepository<rjth,Long>{
	@Query(value="select deposito from DD_MAST_BANK where kode_bank = ?1  ",nativeQuery = true)
	 String totalUang(String kode_bank);
	
	@Query(value="select id from DD_MAST_BANK where kode_bank = ?1  ",nativeQuery = true)
	String findId(String kode_bank);
	
	//int findById(String idRjth);
	Optional<rjth> findById(int id);
}
