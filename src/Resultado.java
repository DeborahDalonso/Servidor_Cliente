import java.io.Serializable;

/**
 * Interface representando o resultado de uma requisição.
 * Esta interface deve ser serializável para que possa ser enviada pela rede.
 * Define um método getMensagem para obter a mensagem de resultado,
 * encapsulando o resultado da execução de uma requisição.
 */
public interface Resultado extends Serializable {
    /**
     * Retorna a mensagem do resultado da requisição.
     * @return Mensagem do resultado.
     */
    String getMensagem();
}
