package br.espm.poo_springboot.carteira;

import br.espm.poo_springboot.ativo.controller.AtivoController;
import br.espm.poo_springboot.ativo.datatype.Cotacao;
import br.espm.poo_springboot.ativo.datatype.Ativo;
import br.espm.poo_springboot.carteira.common.datatype.Carteira;
import br.espm.poo_springboot.carteira.common.datatype.TransacaoBean;
import br.espm.poo_springboot.carteira.common.datatype.TransacaoAtivo;
import br.espm.poo_springboot.carteira.common.datatype.TransacaoTipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class TransacaoAtivoService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    private AtivoController ativoController;

    @Autowired
    private CarteiraService carteiraService;

    @Autowired
    private TransacaoAtivoRepository transacaoAtivoRepository;

    public List<TransacaoAtivo> listByCarteira(String idCarteira) {
        List<TransacaoAtivo> l = transacaoAtivoRepository
                .listByCarteira(idCarteira).stream()
                .map(TransacaoAtivoModel::to)
                .collect(Collectors.toList());
        return l;
    }

    public TransacaoAtivo compra(String idCarteira, TransacaoBean bean) {
        Carteira c = carteiraService.findBy(idCarteira);
        if (c == null) {
            throw new RuntimeException("Carteira nao existe: " + idCarteira);
        }

        Date agora = new Date();

        Ativo ativo = ativoController.ativos(bean.getSimbolo());
        if (ativo == null) {
            throw new RuntimeException("Ativo nao existe: " + bean.getSimbolo());
        }

        Cotacao cotacao = ativoController.cotacao(ativo.getSimbolo(), sdf.format(agora));
        if (cotacao == null) {
            throw new RuntimeException("Cotacao nao existe: " + sdf.format(agora));
        }

        TransacaoAtivo tc = new TransacaoAtivo();
        tc.setId(UUID.randomUUID().toString());
        tc.setCarteira(c);
        tc.setCotacao(cotacao);
        tc.setTipo(TransacaoTipo.COMPRA);
        tc.setQuantidade(bean.getQtd());
        tc.setData(agora);

        return transacaoAtivoRepository.save(new TransacaoAtivoModel(tc)).to();
    }

    public TransacaoAtivo venda(String idCarteira, TransacaoBean bean) {
        Carteira c = carteiraService.findBy(idCarteira);
        if (c == null) {
            throw new RuntimeException("Carteira nao existe: " + idCarteira);
        }

        Date agora = new Date();

        Ativo ativo = ativoController.ativos(bean.getSimbolo());
        if (ativo == null) {
            throw new RuntimeException("Ativo nao existe: " + bean.getSimbolo());
        }

        Cotacao cotacao = ativoController.cotacao(ativo.getSimbolo(), sdf.format(agora));
        if (cotacao == null) {
            throw new RuntimeException("Cotacao nao existe: " + sdf.format(agora));
        }

        if (BigDecimal.ZERO.compareTo(bean.getLimite()) <= 0
                && bean.getLimite().compareTo(cotacao.getValor()) > 0) {
            throw new RuntimeException("Cotacao limite, atual: " + cotacao.getValor());
        }

        TransacaoAtivo tc = new TransacaoAtivo();
        tc.setId(UUID.randomUUID().toString());
        tc.setCarteira(c);
        tc.setCotacao(cotacao);
        tc.setTipo(TransacaoTipo.VENDA);
        tc.setQuantidade(bean.getQtd());
        tc.setData(agora);

        return transacaoAtivoRepository.save(new TransacaoAtivoModel(tc)).to();
    }

}
