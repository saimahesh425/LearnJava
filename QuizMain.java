public class QuizMain{
    public static void main (String args[]){
        QuestionService service = new QuestionService();
        service.playQuizz();
        service.printScore();
    }
}