package site.clzblog.application.decorate.mode;

import site.clzblog.application.decorate.mode.component.GatewayComponent;

public class GatewayDecorator extends GatewayComponent {
    private GatewayComponent gatewayComponent;

    GatewayDecorator(GatewayComponent gatewayComponent) {
        this.gatewayComponent = gatewayComponent;
    }

    @Override
    public void service() {
        if (gatewayComponent != null) gatewayComponent.service();
    }
}
