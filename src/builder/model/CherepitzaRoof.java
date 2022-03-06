package builder.model;

public class CherepitzaRoof extends Roof {

    @Override
    protected Roof clone() {
        return new CherepitzaRoof();
    }

}
