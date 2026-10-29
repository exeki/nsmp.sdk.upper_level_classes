package ru.naumen.metainfo.shared.eventaction;

import java.util.ArrayList;
import java.util.List;
import ru.naumen.core.shared.ScriptInfo;
import ru.naumen.metainfo.shared.elements.HasMutableScript;
import ru.naumen.metainfo.shared.ui.LocalizedString;

public abstract class EventActionWithRecipients extends Action implements HasMutableScript, HasRecipients {
    protected ArrayList<LocalizedString> message;
    protected String script;
    protected ArrayList<String> recipients;
    protected boolean excludeAuthor;
    protected ArrayList<String> roles ;
    protected boolean html;

    protected abstract EventActionWithRecipients newInstance();

    @Override // ru.naumen.metainfo.shared.eventaction.HasRecipients
    public List<String> getRecipients() {
        return new ArrayList<>();
    }

    public List<LocalizedString> getMessage() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.metainfo.shared.eventaction.HasRecipients
    public List<String> getRoles() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.metainfo.shared.eventaction.Action, ru.naumen.metainfo.shared.elements.HasScript
    public String getScript() {
        return null;
    }

    @Override // ru.naumen.metainfo.shared.elements.HasScript
    public ScriptInfo getScriptInfo() {
        return null;
    }

    public List<LocalizedString> getSubject() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.metainfo.shared.eventaction.HasRecipients
    public Boolean isExcludeAuthor() {
        return false;
    }

    public boolean isHtml() {
        return false;
    }

    @Override // ru.naumen.metainfo.shared.eventaction.Action
    public boolean isNotification() {
        return true;
    }

    public void setExcludeAuthor(Boolean excludeAuthor) {
    }

    public void setRecipients(List<String> recipients) {
    }

    public void setMessage(List<LocalizedString> message) {
    }

    public void setRoles(List<String> roles) {
    }

    @Override // ru.naumen.metainfo.shared.elements.HasMutableScript
    public void setScript(String script) {
    }

    public void setHtml(boolean html) {
    }

    @Override // ru.naumen.metainfo.shared.eventaction.Action, ru.naumen.core.shared.HasClone
    public final Action clone() {
        return null;
    }

    protected void fill(EventActionWithRecipients clone) {

    }
}
