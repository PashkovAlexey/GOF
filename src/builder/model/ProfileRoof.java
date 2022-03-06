package builder.model;

public class ProfileRoof extends Roof {


    @Override
    protected Roof clone() {
        return new ProfileRoof();
    }

}
