package ru.naumen.core.server.script.api.eventaction;

import java.util.List;

public class EventActionApi implements IEventActionApi{
    @Override
    public List<IEvenActionWrapper> getEventActions() {
        return List.of();
    }

    @Override
    public List<INotificationEventActionWrapper> getNotificationEventActions() {
        return List.of();
    }

    @Override
    public List<IPushWebEventActionWrapper> getPushWebEventActions() {
        return List.of();
    }

    @Override
    public List<IPushMobileEventActionWrapper> getPushMobileEventActions() {
        return List.of();
    }

    @Override
    public List<IPushPortalEventActionWrapper> getPushPortalEventActions() {
        return List.of();
    }

    @Override
    public IEvenActionWrapper getEventAction(String paramString) {
        return null;
    }
}
