package exceptions;

public class HumanCantStop extends Exception {
    public HumanCantStop(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ошибка: Невозможно остановить стоящего! " + super.getMessage();
    }
}
