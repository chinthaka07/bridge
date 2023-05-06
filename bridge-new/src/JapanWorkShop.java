public class JapanWorkShop extends Workshop{
    public JapanWorkShop(Engine engine) {
        super(engine);
    }

    @Override
    void setType() {
        engine.setType("Japan");
    }

    @Override
    void setSpeed() {
        engine.setSpeed(500);
    }
}
