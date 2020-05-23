package co.id.bpkh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.id.bpkh.model.bank;

public interface bankRepository  extends JpaRepository<bank, Long> {
	@Query(value="select * from DD_BANK where kode_bank = ?1  ",nativeQuery = true)
	bank findByKodeBank(String kode_bank);
}
