package hw7SahanovichM.interfaces;


public interface IControl {

    default String turnOnIgnition() {
        return "Ignition is turned on";
    }

    default String turnOffIgnition() {
        return "Ignition is turned off";
    }

    void hitTheBrakes();

    void turnOnLeftTurnSignal();

    void turnOffLeftTurnSignal();

}
