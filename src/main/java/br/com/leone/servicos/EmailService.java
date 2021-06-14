package br.com.leone.servicos;

import br.com.leone.entidades.Usuario;

public interface EmailService {

    public void notificarAtraso(Usuario usuario);
}
