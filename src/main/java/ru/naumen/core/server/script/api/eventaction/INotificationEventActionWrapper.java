package ru.naumen.core.server.script.api.eventaction;

import java.util.List;

public interface INotificationEventActionWrapper extends IPushEvenActionWrapper {
    List<String> getEmails();

    String getCodeTemplate();

    String getTheme();

    String getSender();
}
