public class ArNums {

    int result;
    int firstNum;
    int secondNum;

    public int arabicNumbers(String string){

        String[] task = string.split(" ");
        firstNum = Integer.parseInt(task[0]);
        secondNum = Integer.parseInt(task[2]);
        if (firstNum <= 10 && secondNum <= 10 && firstNum > 0 && secondNum > 0) {
            switch (task[1]) {
                case ("+"):
                    result = firstNum + secondNum;
                    break;
                case ("-"):
                    result = firstNum - secondNum;
                    break;
                case ("*"):
                    result = firstNum * secondNum;
                    break;
                case ("/"):
                    result = firstNum / secondNum;
                    break;
                default:
                    throw new IllegalArgumentException("Ошибка: введено некорректное действие.");
            }
        } else {
            throw new IllegalArgumentException ("Ошибка: числа должны быть в диапазоне от 1 до 10!");
        }

        return result;
    }
}
