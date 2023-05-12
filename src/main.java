import javax.swing.*;
import java.util.*;
import java.io.*;

public class main {

    public static void main(String[] args) {

        String nomeCliente = JOptionPane.showInputDialog(null, "Digite o nome do cliente:");
        String nomeBanco = JOptionPane.showInputDialog("Digite o nome do Banco");
        Banco b = new Banco();

        ArrayList <Conta> contas = new ArrayList<>();

        try {
            Scanner leitor = new Scanner(new File("C:/Users/12116310/Desktop/BANCO.txt"));
            while (leitor.hasNextLine()) {
                String dadosConta = leitor.nextLine();
                String[] dado = dadosConta.split(",");
                Conta c = new Conta();
                c.setNumero(Integer.parseInt( dado[0]));
                c.setAgencia(Integer.parseInt( dado[1]));
                c.setSaldo(Integer.parseInt( dado[3]));

                b.contas.add(c);


                //Quebrar o nome usando split


            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }




        System.out.println("Lista de clientes:");

            System.out.println();
        }
    }




