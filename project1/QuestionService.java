import java.util.Scanner;
public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection =  new String[5];
    public QuestionService(){
        questions[0] = new Question(1, "what is learning","Java","Cpp","Python","C", "Java");
        questions[1] = new Question(2, "what is easy to learn","Java","Cpp","Python","C", "Python");
        questions[2] = new Question(3, "what is easy for coding","Java","Cpp","Python","C", "Python");
        questions[3] = new Question(4, "what is used for graphics","Java","Cpp","Python","C", "Cpp");
        questions[4] = new Question(5, "what is the name given to programming language after coffee","Java","Cpp","Python","C", "Java");
    }

    public void playQuizz(){
        int i =0;
        for(Question q : questions){
            System.out.println("Question No : " + q.getQuestion());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }
        for(String sel : selection){
            System.out.println("Answers is " + sel);
        }
    }

    public void printScore(){
        
        int score = 0;
        for(int i =0;i<questions.length;i++){
            Question que =  questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer  = selection[i];
            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println(score);
    }

}
