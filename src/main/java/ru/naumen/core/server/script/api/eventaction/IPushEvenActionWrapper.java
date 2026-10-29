package ru.naumen.core.server.script.api.eventaction;

import java.util.List;

public interface IPushEvenActionWrapper {
    boolean isFormatHTML();

    List<String> getRoles();

    List<String> getEmployeeUuids();

    List<String> getOuUuids();

    List<String> getTeamUuids();

    String getMessage();

    String getScriptName();

    String getScriptText();
}
