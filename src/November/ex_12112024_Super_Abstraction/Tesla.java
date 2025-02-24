package November.ex_12112024_Super_Abstraction;

public class Tesla extends Engine {

    void drive(){
        startengine();
        stopengine();
    }
    @Override
    void startengine() {
        System.out.println("Starting Tesla electric engine..");
    }

    @Override
    void stopengine() {
        System.out.println("Stoping Tesla electric engine..");
    }
}
