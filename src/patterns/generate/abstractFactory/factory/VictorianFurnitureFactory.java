package patterns.generate.abstractFactory.factory;

import patterns.generate.abstractFactory.model.Chair;
import patterns.generate.abstractFactory.model.Sofa;
import patterns.generate.abstractFactory.model.Table;
import patterns.generate.abstractFactory.model.victorian.VictorianChair;
import patterns.generate.abstractFactory.model.victorian.VictorianSofa;
import patterns.generate.abstractFactory.model.victorian.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {


    @Override
    public Chair createChair() {
        System.out.println("Викторианский стул создан");
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Викторианский стол создан");
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Викторианский диван создан");
        return new VictorianSofa();
    }
}
