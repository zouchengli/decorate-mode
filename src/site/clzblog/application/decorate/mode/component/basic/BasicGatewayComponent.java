package site.clzblog.application.decorate.mode.component.basic;

import site.clzblog.application.decorate.mode.component.GatewayComponent;

public class BasicGatewayComponent extends GatewayComponent {
    @Override
    public void service() {
        System.out.println("Set up one");
    }
}
