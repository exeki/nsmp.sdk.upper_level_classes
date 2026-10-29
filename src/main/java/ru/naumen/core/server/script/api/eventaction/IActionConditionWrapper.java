package ru.naumen.core.server.script.api.eventaction;

public interface IActionConditionWrapper {
    String getTitle();

    boolean isSyncCondition();

    String getScriptName();

    String getScriptText();
}
