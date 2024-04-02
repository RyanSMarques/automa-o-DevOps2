package gildenor;

public class Task{
    private String Decription;
    private boolean Completed;

//construtor
    public Task(String descricao) {
        this.Decription = descricao;
        this.Completed = false;
        System.out.println("Nova tarefa adicionada: " + descricao);
    }
//getters
    public String getDecription() {
        return Decription;
    }
    public void markAsCompleted() {
        this.Completed = true;
    }
//setters
    public void setCompleted(boolean completed) {
        Completed = completed;
    }
    public void setDecription(String decription) {
        Decription = decription;
    }

    
}