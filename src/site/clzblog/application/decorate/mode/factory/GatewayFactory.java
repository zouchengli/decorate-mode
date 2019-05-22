package site.clzblog.application.decorate.mode.factory;

import site.clzblog.application.decorate.mode.LimitDecorator;
import site.clzblog.application.decorate.mode.LogDecorator;
import site.clzblog.application.decorate.mode.component.GatewayComponent;
import site.clzblog.application.decorate.mode.component.basic.BasicGatewayComponent;

public class GatewayFactory {
    public static GatewayComponent getGatewayComponent() {
        return new LimitDecorator(new LogDecorator(new BasicGatewayComponent()));
    }
}
