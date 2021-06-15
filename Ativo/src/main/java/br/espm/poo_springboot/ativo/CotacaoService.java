package br.espm.poo_springboot.ativo;

import br.espm.poo_springboot.ativo.datatype.Cotacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class CotacaoService {

    @Autowired
    private AtivoService ativoService;

    @Autowired
    private CotacaoRepository cotacaoRepository;

    public Cotacao findById(String id) {
        return fill(
                cotacaoRepository
                        .findById(id)
                        .map(CotacaoModel::to)
                        .orElse(null)
        );
    }

    public Cotacao findBy(String idAtivo, Date data) {
/*
        List<CotacaoModel> cotacoes = cotacaoRepository.listByAtivoData(idAtivo, data);
        if (cotacoes.size() > 0) {
            CotacaoModel cm = cotacoes.get(0);
            return cm.to();
        } else {
            return null;
        }
*/
        Cotacao cotacao = cotacaoRepository
                .listByAtivoData(idAtivo, data).stream()
                .map(CotacaoModel::to)
                .findFirst()
                .orElse(null);
        // Aqui esta sendo feito um relacionamento
        return fill(cotacao);
    }

    public List<Cotacao> listBy(String idAtivo, Date dtInicio, Date dtFim) {
        return cotacaoRepository
                .listBy(idAtivo, dtInicio, dtFim).stream()
                .map(CotacaoModel::to)
                .collect(Collectors.toList());
    }

    private Cotacao fill(Cotacao c) {
        if (c != null) {
            c.setAtivo(ativoService.findBy(UUID.fromString(c.getAtivo().getId())));
        }
        return c;
    }

}
