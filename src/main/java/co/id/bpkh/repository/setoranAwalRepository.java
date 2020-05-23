package co.id.bpkh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.id.bpkh.model.setoranAwal;

public interface setoranAwalRepository extends JpaRepository<setoranAwal,Long> {
	//Optional<setoranAwal>findById(int id);
	@Query(value="select * from tt_setoran_awal  ORDER BY s_transdate DESC LIMIT 10 ",nativeQuery = true)
	List<setoranAwal>datanasabah();
}
