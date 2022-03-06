package builder.model;

import builder.Builder;

public class Prorab {


    public House makeHouse(String type){
        Builder builder = null;
        if ("кирпичный".equals(type)){
            builder = new KirpichBuilder();
        } else if ("каркасный".equals(type)) {
            builder = new CarcasBuilder();
        }
        if (builder != null) {
            builder.reset();
            builder.buildBackground();
            builder.buildWalls();
            builder.buildRoof();
            return builder.getResult();
        } else {
            return null;
        }
    }


}
