package co.id.bpkh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.id.bpkh.model.cfmast;

public interface cfmastRepository extends JpaRepository<cfmast, Long>{
	@Query(value="select top 1 SUBSTRING(no_va,12,5) as no_va from CFMAST WHERE kode_bank = ?1 ORDER BY no_va DESC ",nativeQuery = true)
	 String no_va(String kode_bank);
}
