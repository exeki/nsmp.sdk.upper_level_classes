package ru.naumen.core.server.script.api.eventaction;

import java.util.ArrayList;
import java.util.List;
import ru.naumen.core.server.script.storage.ScriptStorageService;
import ru.naumen.metainfo.shared.eventaction.EventAction;
import ru.naumen.metainfo.shared.eventaction.EventActionWithRecipients;

public class NotificationEventActionWrapper extends PushEventActionWrapper implements INotificationEventActionWrapper {

    NotificationEventActionWrapper(EventAction eventAction, EventActionWithRecipients action, ScriptStorageService scriptStorageService) {
        super(eventAction, action, scriptStorageService);
    }


    public boolean isFormatHTML() {
        return false;
    }

    public List<String> getEmails() {
        return new ArrayList<>();

    }


    public String getCodeTemplate() {
        return "";
    }


    public String getTheme() {
        return "";
    }


    public String getSender() {
        return "";
    }
}

