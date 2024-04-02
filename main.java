package gildenor;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScrumBoard scrumboard = new ScrumBoard();
        int stop, opcao, i = 0;
        String description;
        System.out.println("Digite 1 para iniciar o programa ou 0 para sair: ");
        stop = sc.nextInt();
        do {
           System.out.println("#########################################"); 
           System.out.println("#" + " Digite [1] para Adcionar Tarefas. #");
           System.out.println("#" + "Digite [2] para Visualizar uma tarefa.  #");
           System.out.println("#" + "Digite [3] para Marcar uma tarefa como completa. #");
           System.out.println("#########################################");
           opcao = sc.nextInt();
           if (opcao == 1) {
            System.out.println("Digite a descrição da tarefa: ");
            description = sc.next();
            Task newTask = new Task(description);
            scrumboard.addTask(newTask);
           } else if (opcao == 2) {
            System.out.println("Tarefas no quadro:");
            for (int j = 0; j < scrumboard.taskboard.size(); j++) {
                System.out.println("[" + j + "] " + scrumboard.taskboard.get(j).getDecription());
           }  }else if(opcao == 3) {
            System.out.println("Índice da tarefa para marcar como completa: ");
                int index = sc.nextInt();
                Task task = scrumboard.taskboard.get(index);
                task.markAsCompleted();
                System.out.println("Tarefa marcada como completa.");
           }

        

            
        System.out.println("Digite 1 para continuar o programa ou 0 para sair:");
        stop = sc.nextInt();
        i++;
        } while (stop != 0);
    }
}
