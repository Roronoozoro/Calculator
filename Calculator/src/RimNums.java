import java.util.HashMap;
import java.util.Map;

public class RimNums {

    int firstNum;
    int secondNum;

    public String rimNumbers(String string) {

        String res = "";
        String[] task = string.split(" ");

        Map<Integer, String> hashMap = getMap();

        firstNum = numDeterminate(task,0);
        secondNum = numDeterminate(task,2);

        switch (task[1]) {
            case ("+"):
                firstNum = firstNum + secondNum;
                if (firstNum % 10 == 0) {
                    res = hashMap.get(firstNum);

                } else {
                    secondNum = firstNum % 10;
                    firstNum = firstNum - secondNum;
                    res += hashMap.get(firstNum);
                    res += hashMap.get(secondNum);

                }
                break;

            case ("-"):
                firstNum = firstNum - secondNum;
                res = hashMap.get(firstNum);
                if(firstNum<=0){
                    throw new ArithmeticException("в римской системе нет отрицательных чисел или результат равен нулю !");
                }
                break;

            case ("*"):
                firstNum = firstNum * secondNum;
                if (firstNum % 10 == 0) {
                    res = hashMap.get(firstNum);

                } else {
                    secondNum = firstNum % 10;
                    firstNum = firstNum - secondNum;
                    res += hashMap.get(firstNum);
                    res += hashMap.get(secondNum);

                }
                break;

            case ("/"):
                firstNum = firstNum / secondNum;
                res = hashMap.get(firstNum);
                break;
            default:
                throw new IllegalArgumentException("Ошибка: введены некоректные данные.");
        }

        return res;
    }


    public int numDeterminate(String[] task,int j){

        int result = 0;

        for (Map.Entry<Integer, String> e : getMap().entrySet()) {
            if (e.getValue().equals(task[j])) {
                result = e.getKey();
                break;
            }
        }

        return result;
    }

    public Map<Integer, String> getMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "I");
        hashMap.put(2, "II");
        hashMap.put(3, "III");
        hashMap.put(4, "IV");
        hashMap.put(5, "V");
        hashMap.put(6, "VI");
        hashMap.put(7, "VII");
        hashMap.put(8, "VIII");
        hashMap.put(9, "IX");
        hashMap.put(10, "X");
        hashMap.put(20, "XX");
        hashMap.put(30, "XXX");
        hashMap.put(40, "XL");
        hashMap.put(50, "L");
        hashMap.put(60, "LX");
        hashMap.put(70, "LXX");
        hashMap.put(80, "LXXX");
        hashMap.put(90, "XC");
        hashMap.put(100, "C");

        return hashMap;
    }

}
