package ru.naumen.core.server.script.api.eventaction;

import java.util.ArrayList;
import java.util.List;
import ru.naumen.core.server.script.storage.ScriptStorageService;
import ru.naumen.metainfo.shared.eventaction.EventAction;
import ru.naumen.metainfo.shared.eventaction.EventActionWithRecipients;

/* JADX INFO: loaded from: sdng-4.20.0.17-server.jar:ru/naumen/core/server/script/api/eventaction/PushEventActionWrapper.class */
public abstract class PushEventActionWrapper extends EventActionWrapper implements IPushEvenActionWrapper {
    protected final EventActionWithRecipients action;
    private final ScriptStorageService scriptStorageService;

    PushEventActionWrapper(EventAction eventAction, EventActionWithRecipients action, ScriptStorageService scriptStorageService) {
        super(eventAction);

        this.action = action;
        this.scriptStorageService = scriptStorageService;
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IPushEvenActionWrapper
    public List<String> getRoles() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IPushEvenActionWrapper
    public List<String> getEmployeeUuids() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IPushEvenActionWrapper
    public List<String> getOuUuids() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IPushEvenActionWrapper
    public List<String> getTeamUuids() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IPushEvenActionWrapper
    public String getMessage() {
        return "";
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IPushEvenActionWrapper
    public String getScriptName() {
        return "";
    }

    @Override // ru.naumen.core.server.script.api.eventaction.IPushEvenActionWrapper
    public String getScriptText() {
        return "";
    }
}
