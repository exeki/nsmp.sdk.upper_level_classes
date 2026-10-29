package ru.naumen.core.server.script.api.eventaction;

import java.util.List;

public interface IPushWebEventActionWrapper extends IPushEvenActionWrapper {
    String getPushPresentationType();

    String getCodeTemplate();
}