package br.espm.poo_springboot.ativo;

import  br.espm.poo_springboot.ativo.CotacaoModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CotacaoRepository extends CrudRepository<CotacaoModel, String> {

    @Override
    Iterable<CotacaoModel> findAll();

    @Override
    Optional<CotacaoModel> findById(String s);

    @Query("SELECT c from CotacaoModel c WHERE c.idAtivo = :idAtivo AND c.dtData <= :data ORDER BY c.dtData DESC")
    List<CotacaoModel> listByAtivoData(
            @Param("idAtivo") String idAtivo,
            @Param("data") Date data);

    @Query("SELECT c FROM CotacaoModel c " +
            "WHERE " +
            "(c.idAtivo is null or c.idAtivo = :idAtivo) AND " +
            "(c.dtData is null or c.dtData >= :dtInicio) AND " +
            "(c.dtData is null or c.dtData <= :dtFim)"
    )
    List<CotacaoModel> listBy(
            @Param("idAtivo") String idAtivo,
            @Param("dtInicio") Date dtInicio,
            @Param("dtFim") Date dtFim
    );

}
