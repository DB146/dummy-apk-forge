package com.google.ads.interactivemedia.v3.internal;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
enum zzvg implements zzvf {
    INSTANCE;

    private static final Set zzb = new CopyOnWriteArraySet();

    @Override // com.google.ads.interactivemedia.v3.internal.zzvf
    public final void zza(Class cls) {
        Iterator it = zzb.iterator();
        while (it.hasNext()) {
            if (cls.equals(((WeakReference) it.next()).get())) {
                return;
            }
        }
        zzvi.zzb(cls);
        Set set = zzb;
        if (set.size() > 1000) {
            set.clear();
        }
        set.add(new WeakReference(cls));
    }
}
