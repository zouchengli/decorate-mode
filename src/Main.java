import site.clzblog.application.decorate.mode.factory.GatewayFactory;

public class Main {

    public static void main(String[] args) {
        GatewayFactory.getGatewayComponent().service();
    }
}
