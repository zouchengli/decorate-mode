package site.clzblog.application.decorate.mode;

import site.clzblog.application.decorate.mode.component.GatewayComponent;

public class LogDecorator extends GatewayDecorator {
    public LogDecorator(GatewayComponent gatewayComponent) {
        super(gatewayComponent);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Set up two");
    }
}
