package ru.naumen.metainfo.shared.eventaction;

import com.google.gwt.user.client.rpc.IsSerializable;
import ru.naumen.core.shared.HasClone;

import java.io.Serializable;

public abstract class Action implements IsSerializable, Serializable, HasClone {
    private ActionType actionType;

    @Override // ru.naumen.core.shared.HasClone
    public abstract Action clone();

    public abstract String getScript();

    public abstract boolean isNotification();

    public ActionType getActionType() {
        return null;
    }

    public void setActionType(ActionType actionType) {
    }
}
