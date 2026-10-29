package ru.naumen.metainfo.shared.eventaction;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ru.naumen.core.shared.HasClone;
import ru.naumen.core.shared.IHasI18nDescription;
import ru.naumen.core.shared.IHasI18nTitle;
import ru.naumen.metainfo.shared.AttributeFqn;
import ru.naumen.metainfo.shared.ClassFqn;
import ru.naumen.metainfo.shared.elements.HasCodeIdentityBase;
import ru.naumen.metainfo.shared.elements.MetaClassLite;
import ru.naumen.metainfo.shared.permissioncheck.HasAdminPermissionCategory;
import ru.naumen.metainfo.shared.sets.HasSettingsSet;
import ru.naumen.metainfo.shared.tags.HasTags;
import ru.naumen.metainfo.shared.ui.LocalizedString;

public class EventAction extends HasCodeIdentityBase implements IsSerializable, Serializable, IHasI18nTitle, IHasI18nDescription, HasClone, HasTags, HasSettingsSet, HasAdminPermissionCategory, CoreEventAction {
    private String code;
    private ArrayList<LocalizedString> title;
    private ArrayList<LocalizedString> description;
    private Boolean skipIfUserHasActiveSession;
    private ArrayList<ClassFqn> linkedClasses;
    private Set<AttributeFqn> attributes;
    private Event event;
    private Action action;
    private String jmsQueue;
    private List<String> tags;
    private String settingsSet;
    private transient String sourceQueue;
    private List<MetaClassLite> linkedMetaClasses;
    private Set<AttributeFqn> contextAttributes;
    private boolean on = false;
    private boolean isSlow = false;
    private ArrayList<ActionCondition> conditions = new ArrayList<>();
    private TxType txType = TxType.NEW_TX;

    @Override
    public String getSegmentID() {
        return "";
    }

    @Override
    public String getSegmentType() {
        return "";
    }

    @Override
    public boolean isDetachableSegment() {
        return false;
    }

    public enum TxType implements IsSerializable {
        CURRENT_TX("sync"),
        NEW_TX("async");

        private final String displayName;

        TxType(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return this.displayName;
        }
    }

    public EventAction() {
    }

    public EventAction(Event event, Action action) {
        this.event = event;
        this.action = action;
    }

    public void addCondition(ActionCondition actionCondition) {
        this.conditions.add(actionCondition);
    }

    @Override // ru.naumen.core.shared.HasClone
    public EventAction clone() {
        return null;
    }

    public void deleteCondition(ActionCondition actionCondition) {
        getConditions().remove(actionCondition);
    }

    public Action getAction() {
        return this.action;
    }

    public String getJmsQueue() {
        return this.jmsQueue;
    }

    public List<MetaClassLite> getLinkedMetaClasses() {
        return this.linkedMetaClasses;
    }

    @Override // ru.naumen.core.shared.HasCode, ru.naumen.metainfo.shared.CoreHasCode
    public String getCode() {
        return this.code;
    }

    public ActionCondition getCondition(String code) {
        return null;
    }

    public List<ActionCondition> getConditions(boolean syncVerification) {
        return new ArrayList<>();
    }

    public boolean hasSyncConditions() {
        return false;
    }

    public List<ActionCondition> getConditions() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.core.shared.IHasI18nDescription
    public ArrayList<LocalizedString> getDescription() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.metainfo.shared.eventaction.CoreEventAction
    public Event getEvent() {
        return null;
    }

    public String getId() {
        return "";
    }

    public List<ClassFqn> getLinkedClasses() {
        return new ArrayList<>();
    }

    public Set<AttributeFqn> getAttributes() {
        return new HashSet<>();
    }

    @Deprecated
    public String getMetaClassLinks() {
        return null;
    }

    public String getSourceQueue() {
        return this.sourceQueue;
    }

    @Override
    public List<String> getTags() {
        return new ArrayList<>();
    }

    @Override // ru.naumen.core.shared.IHasI18nTitle
    public ArrayList<LocalizedString> getTitle() {
        return new ArrayList<>();
    }

    public TxType getTxType() {
        return null;
    }

    public List<Object> getUsagePlaces() {
        return new ArrayList<>();
    }

    public boolean isOn() {
        return this.on;
    }

    public boolean isSlow() {
        return this.isSlow;
    }

    public Set<AttributeFqn> getContextAttributes() {
        return new HashSet<>();
    }

    public void setAction(Action action) {
    }

    public void setJmsQueue( String jmsQueue) {

    }

    public void setLinkedMetaClasses(List<MetaClassLite> linkedMetaClasses) {
    }

    public void setCode(String code) {
    }

    public void setEvent(Event event) {
    }

    public void setId(String id) {
    }

    public void setLinkedClasses(ArrayList<ClassFqn> linkedClasses) {
    }

    public void setAttributes(Set<AttributeFqn> attributes) {
    }

    @Deprecated
    public void setMetaClassLinks(String metaClassLinks) {
    }

    public void setOn(boolean on) {
    }

    public void setSlow(boolean isSlow) {
    }

    public void setSourceQueue(String sourceQueue) {
    }

    public void setTxType(TxType txType) {
    }

    public void setUsagePlaces(List<Object> usagePlaces) {
    }

    public void setContextAttributes(Set<AttributeFqn> contextAttributes) {
    }

    @Override // ru.naumen.metainfo.shared.permissioncheck.HasAdminPermissionCategory
    public String getAdminPermissionCategory() {
        return "";
    }

    @Override // ru.naumen.metainfo.shared.sets.HasSettingsSet
    public String getSettingsSet() {
        return "";
    }

    @Override // ru.naumen.metainfo.shared.sets.HasSettingsSet
    public void setSettingsSet( String settingsSet) {
    }

    public String getElementCode() {
        return "";
    }

    public String getElementType() {
        return "";
    }

    public Boolean getSkipIfUserHasActiveSession() {
        return false;
    }

    public void setSkipIfUserHasActiveSession(Boolean skipIfUserHasActiveSession) {
    }
}
