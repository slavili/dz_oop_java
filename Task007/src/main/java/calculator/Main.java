package calculator;

import java.util.List;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {

        //ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory calculableFactory = new LoggerFactory();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();




    }
}
