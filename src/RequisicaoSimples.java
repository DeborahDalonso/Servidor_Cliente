/**
 * Implementação concreta da classe Requisicao.
 * Esta classe representa uma requisição simples que contém uma mensagem.
 * Ao ser executada, retorna um resultado com a mensagem recebida.
 */
public class RequisicaoSimples extends Requisicao {
    private static final long serialVersionUID = 1L;
    private String mensagem;

    // Construtor que inicializa a mensagem da requisição
    public RequisicaoSimples(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * Implementação do método executa.
     * Esta implementação retorna um ResultadoSimples com a mensagem recebida.
     * @return Resultado da execução da requisição.
     */
    @Override
    public Resultado executa() {
        return new ResultadoSimples("Mensagem recebida: " + mensagem);
    }
}
