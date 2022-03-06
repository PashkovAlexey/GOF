package builder.model;

import builder.Builder;

import java.util.ArrayList;
import java.util.List;

public class CarcasBuilder implements Builder {

    private List<Wall> walls = null;
    private Background background = null;
    private Roof roof = null;

    @Override
    public void reset() {
        walls = null;
        background = null;
        roof = null;

    }

    @Override
    public void buildRoof() {
        roof = new ProfileRoof();

    }

    @Override
    public void buildWalls() {
        walls = new ArrayList<>();
        walls.add(new WoodWall());
        walls.add(new WoodWall());
        walls.add(new WoodWall());
        walls.add(new WoodWall());


    }

    @Override
    public void buildBackground() {
        background = new Background();

    }

    @Override
    public House getResult() {
        return new House(roof, background, walls);
    }
}
