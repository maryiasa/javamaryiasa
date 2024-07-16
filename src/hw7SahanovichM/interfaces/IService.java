package hw7SahanovichM.interfaces;

public interface IService {

    default String wheelReplacement() {
        return "Wheels have been replaced";
    }

    void oilChange();
}
