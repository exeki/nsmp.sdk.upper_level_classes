package ru.naumen.metainfo.shared.eventaction;

import java.util.List;

public interface HasRecipients {
    List<String> getRecipients();

    List<String> getRoles();

    Boolean isExcludeAuthor();
}
