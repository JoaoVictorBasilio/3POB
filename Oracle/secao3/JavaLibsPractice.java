package secao3;

import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual é o seu nome?");
        String city = JOptionPane.showInputDialog("Em qual cidade você mora?");
        String profession = JOptionPane.showInputDialog("Qual é a sua profissão dos sonhos?");
        String animal = JOptionPane.showInputDialog("Qual é o seu animal favorito?");
        String adjective = JOptionPane.showInputDialog("Escolha um adjetivo para descrever sua aventura:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade?"));
        int companions = Integer.parseInt(JOptionPane.showInputDialog("Quantos companheiros participarão da aventura?"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura em metros?"));
        double budget = Double.parseDouble(JOptionPane.showInputDialog("Qual será o orçamento da viagem?"));
        String dream = JOptionPane.showInputDialog("Qual é o seu maior sonho?");

        int futureAge = age + 10;
        int totalTravelers = companions + 1;
        double estimatedCost = budget * 1.15;
        double heightInCentimeters = height * 100;

        String story = "Era uma vez " + name + ", que morava em " + city + ".\n"
            + "Embora trabalhasse como " + profession + ", " + name + " sonhava com uma aventura "
            + adjective + ".\n"
            + "Certo dia, partiu com seu animal favorito, um " + animal + ", acompanhado por "
            + totalTravelers + " viajantes.\n"
            + "A viagem custaria aproximadamente R$ " + String.format("%.2f", estimatedCost) + ".\n"
            + "Com seus " + heightInCentimeters + " centímetros de altura, " + name
            + " parecia pronto para qualquer desafio.\n"
            + "Dez anos depois, aos " + futureAge + " anos, alguém perguntou:"
            + " \"Qual é o seu maior sonho?\"\n"
            + name + " respondeu: \"" + dream + "\"";

        JOptionPane.showMessageDialog(null, story, "A aventura de " + name,
            JOptionPane.INFORMATION_MESSAGE);
    }   
}