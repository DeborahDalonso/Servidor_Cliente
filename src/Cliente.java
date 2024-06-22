import java.rmi.Naming;

/**
 * Classe representando um cliente que envia requisições ao servidor.
 * O cliente localiza o servidor RMI e envia uma requisição,
 * recebendo o resultado da execução da requisição.
 */
public class Cliente {
    public static void main(String[] args) {
        try {
            // Localiza o servidor de requisições no registro RMI
            ServidorRequisicoes servidor = (ServidorRequisicoes) Naming.lookup("//localhost/ServidorRequisicoes");

            // Cria uma nova requisição simples com uma mensagem
            Requisicao requisicao = new RequisicaoSimples("Olá, servidor!");
            // Envia a requisição ao servidor e recebe o resultado
            Resultado resultado = servidor.requisita(requisicao);

            // Imprime o resultado recebido do servidor
            System.out.println("Resultado: " + resultado.getMensagem());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
