package com.santander.test;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /**
         *
         * 👨‍💻 if - Cheat Sheet 👩‍💻
         *
         * if (condicao) {
         *     // implementação que será executada caso a condição seja satisfeita
         * } else if (condicao) {
         *     // implementação será executada caso a primeira condição não seja satisfeita mas a segunda sim
         * } else {
         *     // se nenhuma outra condição acima for satisfeita, essa implementação é executada
         * }
         *
         * if (condicao) {
         *     // implementação que será executada caso a condição seja satisfeita
         * } else {
         *     // se a condição não for satisfeita, essa implementação é executada
         * }
         *
         * Operadores lógicos
         * || - se UMA DAS condições do if for satisfeita, a implementação é executada
         * && - se TODAS as condições do if forem satisfeitas, a implementação é executada
         *
         * Operadores de comparação numéricos > , >= , < , <= , == , !=
         *
         * */

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
        int mesesDoseAnterior = Integer.parseInt(JOptionPane.showInputDialog("Há quantos meses você tomou a segunda dose?"));

        final int STATUS_CODE_INAPTO_VACINA = 1;

        // Estou colocando constantes para evitar "números soltos" nos if's
        final int IDADE_MINIMA_PARA_VACINAR = 18, INTERVALO_DE_MESES_PERMITIDO_PARA_VACINAR = 3,
                  PERIODO_CONSULTA_CALENDARIO = 5, IDADE_MAXIMA_MENORIDADE = 17;


        // if braceless - caso a condição seja satisfeita, executa a próxima (e somente a próxima) instrução imediata
        if (idade == 29) JOptionPane.showMessageDialog(null, "Ativado via if braceless!");

        /**
         * inline ou if ternário - faz uma "pergunta" (idade > IDADE_MAXIMA_MENORIDADE?), o primeiro elemento depois da vírgula é atribuído caso a
         * a resposta seja "sim" e o segundo elemento caso seja "não"
          */
        String mensagemMaiorIdade = idade > IDADE_MAXIMA_MENORIDADE ? "Maior de idade." : "Menor de idade.";

        JOptionPane.showMessageDialog(null, mensagemMaiorIdade);

        if (idade < IDADE_MINIMA_PARA_VACINAR ||
                mesesDoseAnterior < INTERVALO_DE_MESES_PERMITIDO_PARA_VACINAR) {

            if (idade < IDADE_MINIMA_PARA_VACINAR &&
                    mesesDoseAnterior < INTERVALO_DE_MESES_PERMITIDO_PARA_VACINAR) {
                JOptionPane.showMessageDialog(null,
                        "Inapto a tomar a vacina, você tem menos de 18 e tomou a segunda dose a menos de 3 meses.");
            } else if (mesesDoseAnterior < INTERVALO_DE_MESES_PERMITIDO_PARA_VACINAR) {
                JOptionPane.showMessageDialog(null,
                        "Inapto a tomar vacina. Você tomou a segunda dose a menos de 3 meses.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Inapto a tomar vacina. Você tem menos de 18 anos.");
            }

            System.exit(STATUS_CODE_INAPTO_VACINA);
        }

        if (mesesDoseAnterior > PERIODO_CONSULTA_CALENDARIO) {
            JOptionPane.showMessageDialog(null, "Apto a tomar dose de reforço.");
        } else {
            JOptionPane.showMessageDialog(null, "Consulte o calendário.");
        }
    }
}
