package ru.naumen.core.server.script.api.eventaction;

import java.util.ArrayList;
import java.util.List;

import ru.naumen.core.server.script.api.metainfo.ITagWrapper;
import ru.naumen.metainfo.shared.IClassFqn;
import ru.naumen.metainfo.shared.eventaction.EventAction;

public class EventActionWrapper implements IEvenActionWrapper {
    private final EventAction eventAction;

    EventActionWrapper(EventAction eventAction) {
        this.eventAction = eventAction;
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public String getTitle() {
        return "";
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public String getCode() {
        return "";
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public String getDescription() {
        return "";
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public List<IClassFqn> getObjects() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public String getEvent() {
        return "";
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public String getEventCode() {
        return "";
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public String getAction() {
        return "";
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public String getActionCode() {
        return "";
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public List<ITagWrapper> getTags() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public boolean isEnabled() {
        return false;
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public List<IActionConditionWrapper> getConditions(boolean syncVerification) {
        return new ArrayList<>();
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public List<IActionConditionWrapper> getConditions() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IEvenActionWrapper
    public void execute(Object subject) {}

    private String getEventActionUUID() {
        return "";
    }
}
