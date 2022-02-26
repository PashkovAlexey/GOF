package patterns.generate.abstractFactory.factory;

import patterns.generate.abstractFactory.model.Chair;
import patterns.generate.abstractFactory.model.Sofa;
import patterns.generate.abstractFactory.model.Table;
import patterns.generate.abstractFactory.modern.ModernChair;
import patterns.generate.abstractFactory.modern.ModernSofa;
import patterns.generate.abstractFactory.modern.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {


    @Override
    public Chair createChair() {
        System.out.println("Модерн стул создан");
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Модерн стол создан");
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Модерн диван создан");
        return new ModernSofa();
    }
}
