package ru.naumen.core.server.script.api.eventaction;

import ru.naumen.core.server.script.ScriptApi;

import java.util.List;

public interface IEventActionApi extends ScriptApi {
    List<IEvenActionWrapper> getEventActions();

    List<INotificationEventActionWrapper> getNotificationEventActions();

    List<IPushWebEventActionWrapper> getPushWebEventActions();

    List<IPushMobileEventActionWrapper> getPushMobileEventActions();

    List<IPushPortalEventActionWrapper> getPushPortalEventActions();

    IEvenActionWrapper getEventAction(String paramString);
}