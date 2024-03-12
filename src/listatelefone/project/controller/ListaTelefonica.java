package listatelefone.project.controller;

import javax.swing.*;
import java.util.ArrayList;

public class ListaTelefonica {

    private static final ArrayList<String> listaTelefones = new ArrayList<>();

    public static void verListaTelefones() {
        StringBuilder sb = new StringBuilder("Lista de Telefones:\n");
        for (String telefone : listaTelefones) {
            sb.append(telefone).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static void inserirNovoNumero() {
        String novoNumero = JOptionPane.showInputDialog("Digite o novo número de telefone:");
        if (novoNumero != null && !novoNumero.isEmpty()) {
            listaTelefones.add(novoNumero);
            JOptionPane.showMessageDialog(null, "Número adicionado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido. Tente novamente.");
        }
    }

    public static ArrayList<String> getListaTelefones() {
        return listaTelefones;
    }
}
