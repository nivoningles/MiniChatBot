import java.text.Normalizer;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MIniChatBot {

    Random rand = new Random();

    public void dizerOi(){

        int numeroAleatorio = rand.nextInt(2);
        if(numeroAleatorio == 0){
            System.out.println("Fala meu chegado! Como posso ajudar?");
        } else if (numeroAleatorio == 1) {
            System.out.println("Olá! Como posso ajudar?");
        }

    }public void qualSeuNome(){

        int numeroAleatorio = rand.nextInt(2);
        if(numeroAleatorio == 0){
            System.out.println("Meu nome é MiniChatbot, obrigado por perguntar!");
        } else if (numeroAleatorio == 1) {
            System.out.println("Eu sou o MiniChatbot, seu assistente virtual!");
        }

    }
    public void comoEstaVc(){

        int numeroAleatorio = rand.nextInt(2);
        if(numeroAleatorio == 0){
            System.out.println("Estou bem pra caralho, muito obrigado meu parceiro(a)!");
        } else if (numeroAleatorio == 1) {
            System.out.println("Estou funcionando perfeitamente, obrigado!");
        }

    }
    public void respostaClima(){

        int numeroAleatorio = rand.nextInt(2);
        if(numeroAleatorio == 0){
            System.out.println("Sei lá sobre o clima irmão, só dar um Google ai!");
        } else if (numeroAleatorio == 1) {
            System.out.println("Vi que está interessado em no clima, aqui está um site onde você consegue encontrar mais sobre isso\nhttps://www.climatempo.com.br/");
        }

    }public void respostaEsporte(){

        int numeroAleatorio = rand.nextInt(2);
        if(numeroAleatorio == 0){
            System.out.println("Esporte eu to forá, prefiro ser sedentário!");
        } else if (numeroAleatorio == 1) {
            System.out.println("Eu amo esportes! Fornece milhares de beneficios para saúde, aqui está um site que fala mais a respeito deste assunto\nhttps://www.desenvolvimentosocial.sp.gov.br/beneficios-do-esporte-para-a-saude-mental/");
        }

    }public void respostaProgramacao(){

        int numeroAleatorio = rand.nextInt(2);
        if(numeroAleatorio == 0){
            System.out.println("Prepara o rabo pq programação é fodido");
        } else if (numeroAleatorio == 1) {
            System.out.println("Eu sou programação pura, vivo e respiro dela, com certeza é minha matéria preferida e sei muito a respeito, aqui está um link onde pode encontrar mais sobre\nhttps://www.hostinger.com.br/tutoriais/11-sites-aprender-como-programar-de-graca");
        }


    }public void respostaAfirmartica(){

        int numeroAleatorio = rand.nextInt(2);
        if(numeroAleatorio == 0){
            System.out.println("Pow, tmj parcerinho!");
        } else if (numeroAleatorio == 1) {
            System.out.println("Fico feliz com isso!");
        }


    }public static String normalizarTexto(String texto){

        String respostaMinuscula = texto.toLowerCase();
        String respostaSemAcentos = Normalizer.normalize(respostaMinuscula, Normalizer.Form.NFD);
        return respostaSemAcentos.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

    }




}
