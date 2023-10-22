package AdapterPattern;

public class AdapterPattern {
    public static void main(String[] args) {
        // Создаем экземпляр 'OldSystem'.
        OldSystem oldSystem = new OldSystem();
        // Создаем экземпляр 'OldSystemAdapter', который адаптирует 'OldSystem' к интерфейсу 'NewSystem'
        NewSystem newSystem = new OldSystemAdapter(oldSystem);
        // Используем адаптированный 'newSystem' для выполнения действия.
        newSystem.performNewAction();
    }
}