package listatelefone.project.view;

import listatelefone.project.controller.ListaTelefonica;

import javax.swing.*;

public class Frame {

    public static void main(String[] args) {

        while (true) {
            String opcao = JOptionPane.showInputDialog("Selecione uma opção:\n1 - Ver lista de telefones\n2 - Inserir novo número\n3 - Sair");

            if (opcao == null || opcao.equals("3")) {
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                break;
            }

            switch (opcao) {
                case "1":
                    ListaTelefonica.verListaTelefones();
                    break;
                case "2":
                    ListaTelefonica.inserirNovoNumero();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }


}
