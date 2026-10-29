package ru.naumen.metainfo.shared.eventaction;

import ru.naumen.core.shared.HasTitleCode;

public enum ActionType implements HasTitleCode {
    IntegrationEventAction("."),
    NotificationEventAction("."),
    ScriptEventAction("."),
    ChangeTrackingEventAction("."),
    PushEventAction("."),
    PushMobileEventAction("."),
    PushPortalEventAction(".");

    private final String titleCode;

    ActionType(String titleCode) {
        this.titleCode = titleCode;
    }

    @Override // ru.naumen.core.shared.HasTitleCode
    public String getTitleCode() {
        return "";
    }
}
