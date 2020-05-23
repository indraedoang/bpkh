package co.id.bpkh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.id.bpkh.model.masterdata;

public interface masterdataRepository  extends JpaRepository<masterdata,Long>{
	@Query(value="select top 1 SUBSTRING(no_va,12,5) as no_va from DD_MAST ORDER BY no_va DESC ",nativeQuery = true)
	 String no_va();
}
