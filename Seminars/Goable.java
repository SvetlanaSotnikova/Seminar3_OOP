@FunctionalInterface
public interface Goable {

    void run(); // есть по умолчанию public abstract static

    default double acceleration() {
        return 9.8;
    }
}
