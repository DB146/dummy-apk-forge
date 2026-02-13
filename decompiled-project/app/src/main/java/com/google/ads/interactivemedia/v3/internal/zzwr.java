package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class zzwr {
    @Deprecated
    public zzwr() {
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            zzacx zzacxVar = new zzacx(stringWriter);
            zzacxVar.zzo(true);
            zzaby.zzV.write(zzacxVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
