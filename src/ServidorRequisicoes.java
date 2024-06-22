import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface remota para o servidor de requisições.
 * Define o método que o servidor expõe para os clientes,
 * permitindo que os clientes enviem requisições para o servidor.
 */
public interface ServidorRequisicoes extends Remote {
    /**
     * Método remoto que recebe uma requisição do cliente e retorna um resultado.
     * O método está de acordo com o requisito de permitir que os clientes enviem
     * requisições ao servidor e recebam um resultado após a execução.
     * @param r Requisição enviada pelo cliente.
     * @return Resultado da execução da requisição.
     * @throws RemoteException Se ocorrer um erro de comunicação remota.
     */
    Resultado requisita(Requisicao r) throws RemoteException;
}
