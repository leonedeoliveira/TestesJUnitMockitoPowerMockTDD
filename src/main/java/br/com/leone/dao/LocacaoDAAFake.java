package br.com.leone.dao;

import br.com.leone.entidades.Locacao;

import java.util.List;

public class LocacaoDAAFake implements  LocacaoDAO{

    @Override
    public void salvar(Locacao locacao) {

    }

    @Override
    public List<Locacao> obterLocacoesPendentes() {
        return null;
    }
}
