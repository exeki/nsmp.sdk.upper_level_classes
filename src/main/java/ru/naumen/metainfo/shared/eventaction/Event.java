package ru.naumen.metainfo.shared.eventaction;

import com.google.gwt.user.client.rpc.IsSerializable;
import ru.naumen.core.shared.HasClone;

import java.io.Serializable;

public class Event implements IsSerializable, Serializable, HasClone, CoreEvent {
    private EventType eventType;

    @Override // ru.naumen.core.shared.HasClone
    public Event clone() {
        return null;
    }

    public EventType getEventType() {
        return null;
    }

    public void setEventType(EventType eventType) {
    }

    public String toString() {
        return "";
    }
}
