package co.id.bpkh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.id.bpkh.model.ddhist;
import co.id.bpkh.model.ddmast_bank;

public interface ddmastBankRepository extends JpaRepository<ddmast_bank,Long>{
	@Query(value="select * from DD_MAST_BANK WHERE kode_bank = ?1 ",nativeQuery = true)
	 ddmast_bank GetData(String kode_bank);

	void save(ddhist dDhist);
}
