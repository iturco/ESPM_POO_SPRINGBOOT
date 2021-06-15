package br.espm.poo_springboot.carteira;

import br.espm.poo_springboot.ativo.controller.AtivoController;
import br.espm.poo_springboot.cambio.common.controller.CambioController;
import br.espm.poo_springboot.carteira.common.datatype.Carteira;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CarteiraService {

    @Autowired
    private CarteiraRepository carteiraRepository;

    

    @Autowired
    private TransacaoCambioService transacaoCambioService;

    @Autowired
    private AtivoController ativoController;
    
    @Autowired
    private CambioController cambioController;

    @Autowired
    private TransacaoAtivoService transacaoAtivoService;

    public Carteira create(Carteira c) {
        c.setId(UUID.randomUUID().toString());
        return carteiraRepository.save(new CarteiraModel(c)).to();
    }

    public Carteira findBy(String id) {
        Carteira c = carteiraRepository
                .findById(id)
                .map(CarteiraModel::to)
                .orElse(null);
        if (c != null) {
            // Aqui e uma amarracao mapping 1 .. n
            c.setTransacoesCambio(transacaoCambioService.listByCarteira(c.getId()));
            c.getTransacoesCambio().forEach(transacaoCambio -> {
                transacaoCambio.setCotacao(cambioController.cotacao(transacaoCambio.getCotacao().getId()));
            });
            c.setTransacoesAtivos(transacaoAtivoService.listByCarteira(c.getId()));
            c.getTransacoesAtivos().forEach(transacaoAtivo -> {
                transacaoAtivo.setCotacao(ativoController.cotacao(transacaoAtivo.getCotacao().getId()));
            });
            // c.setTransacoesAtivo(...);
        }
        return c;
    }

}
