package ru.naumen.metainfo.shared.eventaction;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;
import ru.naumen.core.shared.HasClone;
import ru.naumen.core.shared.ITitled;
import ru.naumen.metainfo.shared.elements.HasCodeIdentityBase;
import ru.naumen.metainfo.shared.permissioncheck.HasAdminPermissionCategory;
import ru.naumen.metainfo.shared.sets.HasSettingsSet;

public abstract class ActionCondition extends HasCodeIdentityBase implements IsSerializable, Serializable, ITitled, HasSettingsSet, HasClone, HasAdminPermissionCategory {
    private ActionConditionType type;
    private String code;
    private String title;
    private String settingsSet;
    private boolean syncVerification = false;

    @Override // ru.naumen.core.shared.HasClone
    public abstract ActionCondition clone();

    @Override // ru.naumen.core.shared.HasCode, ru.naumen.metainfo.shared.CoreHasCode
    public String getCode() {
        return "";
    }

    @Override // ru.naumen.core.shared.ITitled, ru.naumen.metainfo.shared.CoreTitled
    public String getTitle() {
        return "";
    }

    public boolean isSyncVerification() {
        return this.syncVerification;
    }

    public ActionConditionType getType() {
        return null;
    }

    public void setCode(String code) {
    }

    public void setTitle(String title) {
    }

    public void setSyncVerification(boolean syncVerification) {
    }

    public void setType(ActionConditionType type) {
    }

    @Override // ru.naumen.metainfo.shared.elements.HasCodeIdentityBase, ru.naumen.metainfo.shared.segment.MetainfoSegment
    public String getSegmentID() {
        return "";
    }

    @Override // ru.naumen.metainfo.shared.elements.HasCodeIdentityBase, ru.naumen.metainfo.shared.segment.MetainfoSegment
    public String getSegmentType() {
        return "";
    }

    @Override // ru.naumen.metainfo.shared.elements.HasCodeIdentityBase, ru.naumen.metainfo.shared.segment.MetainfoSegment
    public boolean isDetachableSegment() {
        return true;
    }

    @Override // ru.naumen.metainfo.shared.sets.HasSettingsSet
    public String getSettingsSet() {
        return "";
    }

    public void setSettingsSet( String settingsSet) {
    }

    public String getElementType() {
        return "";
    }

    public String getAdminPermissionCategory() {
        return "";
    }
}
