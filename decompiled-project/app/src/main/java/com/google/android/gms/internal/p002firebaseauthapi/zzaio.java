package com.google.android.gms.internal.p002firebaseauthapi;

import M5.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaio {
    private List<String> zza;

    public zzaio() {
        this(null);
    }

    public zzaio(int i7, List<String> list) {
        if (list == null || list.isEmpty()) {
            this.zza = Collections.emptyList();
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, e.a(list.get(i10)));
        }
        this.zza = Collections.unmodifiableList(list);
    }

    private zzaio(List<String> list) {
        this.zza = new ArrayList();
    }

    public static zzaio zza() {
        return new zzaio(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }
}
