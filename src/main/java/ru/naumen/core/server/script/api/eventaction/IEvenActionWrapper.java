package ru.naumen.core.server.script.api.eventaction;

import java.util.List;

import ru.naumen.core.server.script.api.eventaction.IActionConditionWrapper;
import ru.naumen.core.server.script.api.metainfo.ITagWrapper;
import ru.naumen.metainfo.shared.IClassFqn;

public interface IEvenActionWrapper {
    String getTitle();

    String getCode();

    String getDescription();

    List<IClassFqn> getObjects();

    String getEvent();

    String getEventCode();

    String getAction();

    String getActionCode();

    List<ITagWrapper> getTags();

    boolean isEnabled();

    List<IActionConditionWrapper> getConditions(boolean syncVerification);

    List<IActionConditionWrapper> getConditions();

    void execute(Object subject);
}
