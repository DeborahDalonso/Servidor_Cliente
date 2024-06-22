/**
 * Implementação concreta da interface Resultado.
 * Esta classe encapsula o resultado da execução de uma requisição simples.
 * Contém uma mensagem que é retornada ao cliente.
 */
class ResultadoSimples implements Resultado {
    private static final long serialVersionUID = 1L;
    private String mensagem;

    // Construtor que inicializa a mensagem do resultado
    public ResultadoSimples(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * Retorna a mensagem do resultado da requisição.
     * @return Mensagem do resultado.
     */
    @Override
    public String getMensagem() {
        return mensagem;
    }
}
