package AdapterPattern;
// Адаптер

class OldSystemAdapter implements NewSystem {
    private OldSystem oldSystem;
    // Адаптер 'OldSystemAdapter' принимает экземпляр 'OldSystem' в качестве параметра.
    public OldSystemAdapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }
    // Адаптер реализует метод 'performNewAction' для совместимости с 'NewSystem'.
    @Override
    public void performNewAction() {
        System.out.println("Адаптер конвертирует и делегирует новое действие старой системе.");
        // Адаптер вызывает метод 'performOldAction' у 'OldSystem'.
        oldSystem.performOldAction();
    }
}