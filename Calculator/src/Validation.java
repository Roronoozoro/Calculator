public class Validation {

    public boolean numbersCheck(String inputText){
        String[] task = inputText.split(" ");

        if (task.length != 3) {
            throw new IllegalArgumentException("формат математической операции не удовлетворяет заданию - два операнда и один оператор ");
        }

        boolean check = rimCheck(task,0);
        boolean check2 = rimCheck(task, 2);

        if (check && check2) {
            return true;
        } else if (check || check2) {
            throw new IllegalArgumentException("Оба числа должны быть или арабскими, или римскими!");
        } else {
            return false;
        }
    }

    public boolean rimCheck(String[] task,int j){

        boolean test = false;
        switch (task[j]){
            case ("I"):
                test = true;
                break;
            case ("II"):
                test = true;
                break;
            case ("III"):
                test = true;
                break;
            case ("IV"):
                test = true;
                break;
            case ("V"):
                test = true;
                break;
            case ("VI"):
                test = true;
                break;
            case ("VII"):
                test = true;
                break;
            case ("VIII"):
                test = true;
                break;
            case ("IX"):
                test = true;
                break;
            case ("X"):
                test = true;
                break;
        }

        return test;
    }

}
