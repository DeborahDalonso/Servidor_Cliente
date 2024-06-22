import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

/**
 * Implementação do servidor de requisições.
 * Esta classe implementa a interface remota e define o comportamento do método requisita.
 */
public class ServidorRequisicoesImpl extends UnicastRemoteObject implements ServidorRequisicoes {

    // Construtor padrão que lança RemoteException
    protected ServidorRequisicoesImpl() throws RemoteException {
        super();
    }

    /**
     * Implementação do método remoto requisita.
     * Este método recebe uma requisição, executa a lógica definida na requisição e retorna o resultado.
     * Isso permite que o cliente envie uma requisição para o servidor e receba um resultado processado.
     * @param r Requisição enviada pelo cliente.
     * @return Resultado da execução da requisição.
     * @throws RemoteException Se ocorrer um erro de comunicação remota.
     */
    @Override
    public Resultado requisita(Requisicao r) throws RemoteException {
        return r.executa();
    }

    // Método principal para iniciar o servidor
    public static void main(String[] args) {
        try {
            // Cria uma instância do servidor
            ServidorRequisicoesImpl servidor = new ServidorRequisicoesImpl();
            // Liga o servidor ao registro RMI com o nome "ServidorRequisicoes"
            java.rmi.Naming.rebind("//localhost/ServidorRequisicoes", servidor);
            System.out.println("Servidor pronto.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
