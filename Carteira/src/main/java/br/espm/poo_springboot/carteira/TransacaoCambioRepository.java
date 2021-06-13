package br.espm.poo_springboot.carteira;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TransacaoCambioRepository extends CrudRepository<TransacaoCambioModel, String> {

    @Override
    TransacaoCambioModel save(TransacaoCambioModel s);

    @Override
    Optional<TransacaoCambioModel> findById(String s);

    @Query("SELECT tc from TransacaoCambioModel tc where tc.idCarteira = :idCarteira order by tc.dtData")
    List<TransacaoCambioModel> listByCarteira(@Param("idCarteira") String idCarteira);

}
