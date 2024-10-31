import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MIniChatBot mini = new MIniChatBot();
        Scanner sc = new Scanner(System.in);
        String resposta = "";

        System.out.print("Olá! Eu sou o MiniChatbot.\nComo posso te ajudar hoje? ");
        resposta = sc.nextLine();

        String respostaSemAcentos = mini.normalizarTexto(resposta);

        while(!respostaSemAcentos.equals("sair")){

            if (respostaSemAcentos.contains("oi") || respostaSemAcentos.contains("ola")) {
                mini.dizerOi();
            } else if (respostaSemAcentos.contains("qual e o seu nome")) {
                mini.qualSeuNome();
            } else if (respostaSemAcentos.contains("como voce esta")) {
                mini.comoEstaVc();
            } else if (respostaSemAcentos.contains("clima")) {
                mini.respostaClima();
            } else if (respostaSemAcentos.contains("esporte")) {
                mini.respostaEsporte();
            } else if (respostaSemAcentos.contains("programacao")) {
                mini.respostaProgramacao();
            } else if (respostaSemAcentos.equals("legal") || respostaSemAcentos.equals("bacana") || respostaSemAcentos.equals("curti")) {
                mini.respostaAfirmartica();
            } else {
                System.out.println("Desculpe, não entendi sua pergunta. Pode reformular?");
            }

            resposta = sc.nextLine();
            respostaSemAcentos = mini.normalizarTexto(resposta);

        }
        System.out.println("Tchau! Até a próxima.");
    }}




