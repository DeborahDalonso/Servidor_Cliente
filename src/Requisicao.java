import java.io.Serializable;

/**
 * Classe abstrata representando uma requisição.
 * Esta classe deve ser serializável para que possa ser enviada pela rede.
 * Define um método abstrato executa que será implementado pelas subclasses,
 * permitindo diferentes tipos de requisições.
 */
public abstract class Requisicao implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Método abstrato que define a lógica da execução da requisição.
     * As subclasses devem implementar este método para definir a lógica específica da requisição.
     * @return Resultado da execução.
     */
    public abstract Resultado executa();
}
