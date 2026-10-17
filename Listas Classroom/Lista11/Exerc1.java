/*Exercício 1: Gerenciamento de Lista Dinâmica de Tarefas (ArrayList)
Enunciado: Crie um programa que gerencie uma lista de tarefas utilizando ArrayList<String>. O programa deve permitir:
Adicionar 5 tarefas iniciais informadas pelo usuário.
Remover uma tarefa específica pelo seu índice ou nome.
Verificar se uma tarefa específica existe na lista (contains()).
Exibir a lista ordenada alfabeticamente utilizando Collections.sort().
Conceitos: Interface List, manipulação dinâmica de tamanho, busca e ordenação de listas.
 */
package Lista11;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.println("Digite a tarefa: ");
        }
    }
}
