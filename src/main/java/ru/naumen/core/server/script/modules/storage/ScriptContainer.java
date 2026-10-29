package ru.naumen.core.server.script.modules.storage;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;

public class ScriptContainer implements IsSerializable, Serializable {


    public static ScriptContainer create(String body, String checksum) {
        return null;
    }

    public String getBody() {
        return "";
    }

    public String getChecksum() {
        return "";
    }

    public void setBody(String body) {
    }

    public void setChecksum(String checksum) {

    }

    public String toString() {
        return "";
    }
}
