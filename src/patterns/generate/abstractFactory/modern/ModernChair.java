package patterns.generate.abstractFactory.modern;

import patterns.generate.abstractFactory.model.Chair;

public class ModernChair implements Chair {

    @Override
    public int hasLegs() {
        return 0;
    }

    @Override
    public void sitOn() {

        System.out.println("Сижу на modern chair");
    }
}
