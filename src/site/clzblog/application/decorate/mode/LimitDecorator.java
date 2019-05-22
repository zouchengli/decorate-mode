package site.clzblog.application.decorate.mode;

import site.clzblog.application.decorate.mode.component.GatewayComponent;

public class LimitDecorator extends GatewayDecorator {
    public LimitDecorator(GatewayComponent gatewayComponent) {
        super(gatewayComponent);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Set up three");
    }
}
