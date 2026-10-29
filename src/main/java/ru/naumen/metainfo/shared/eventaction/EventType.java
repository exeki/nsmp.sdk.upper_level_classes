package ru.naumen.metainfo.shared.eventaction;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.ArrayList;
import java.util.Collection;
import ru.naumen.metainfo.shared.elements.MetaClassLite;

public enum EventType implements IsSerializable {
    add(false),
    edit(false),
    delete(false),
    addComment(false),
    editComment(true),
    addFile(false),
    mail(false) ,
    changeState(true) ,
    onsetTimeOfAttr(false),
    changeResponsible(true) ,
    escalation(false),
    changeMassAttr(true) ,
    bindToMassMaster(true) ,
    bindMassSlave(true) ,
    userEvent(false),
    loginSuccessful(false),
    logout(false) ,
    openEditForm(false),
    alertActivated(false) ,
    alertDeactivated(false) ,
    alertChanged(false) ,
    ndapMessage(false) ,
    insertMention(false),
    arriveMessageOnQueue(false);

    private final boolean hasOldSubject;

    public static Collection<EventType> valuesForClasses( Collection<MetaClassLite> metaClasses) {
        return new ArrayList<>();
    }

    EventType(boolean hasOldSubject) {
        this.hasOldSubject = hasOldSubject;
    }

    public boolean apply( MetaClassLite metaClass) {
        return true;
    }

    public boolean hasOldSubject() {
        return this.hasOldSubject;
    }
}
