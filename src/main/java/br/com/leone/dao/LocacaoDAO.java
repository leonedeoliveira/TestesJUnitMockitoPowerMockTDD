package br.com.leone.dao;

import br.com.leone.entidades.Locacao;

import java.util.List;

public interface LocacaoDAO {

    public void salvar(Locacao locacao);

    List<Locacao> obterLocacoesPendentes();
}
