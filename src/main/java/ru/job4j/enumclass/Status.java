package ru.job4j.enumclass;

public enum Status {
    ACCEPTED("Принят") {
        @Override
        public String getMessage() {
            return "Авто прият на СТО";
        }
    },
    IN_WORK("В работе") {
        @Override
        public String getMessage() {
            return "Авто в работе";
        }
    },
    WAITING("Ожидание") {
        @Override
        public String getMessage() {
            return "Авто ожидает запчасти";
        }
    },
    FINISHED("Работы звершены") {
        @Override
        public String getMessage() {
            return "Все работы завершены";
        }
    };

    private final String info;

    Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public abstract String getMessage();
}
