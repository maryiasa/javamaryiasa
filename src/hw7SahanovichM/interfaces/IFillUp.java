package hw7SahanovichM.interfaces;

import hw7SahanovichM.model.transport.Engine;

public interface IFillUp {

    default String openTank() {
        return "Tank is opened";
    }

    void fillUp(Engine engine);
}
