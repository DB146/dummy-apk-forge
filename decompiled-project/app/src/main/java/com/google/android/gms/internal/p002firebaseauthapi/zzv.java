package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzv {
    private final zzf zza;
    private final zzab zzb;
    private final int zzc;

    private zzv(zzab zzabVar) {
        this(zzabVar, false, zzj.zza, f.API_PRIORITY_OTHER);
    }

    private zzv(zzab zzabVar, boolean z8, zzf zzfVar, int i7) {
        this.zzb = zzabVar;
        this.zza = zzfVar;
        this.zzc = f.API_PRIORITY_OTHER;
    }

    public static zzv zza(char c10) {
        final zzh zzhVar = new zzh(c10);
        zzw.zza(zzhVar);
        return new zzv(new zzab() { // from class: com.google.android.gms.internal.firebase-auth-api.zzy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
            public final Iterator zza(zzv zzvVar, CharSequence charSequence) {
                return new zzaa(zzvVar, charSequence, zzf.this);
            }
        });
    }

    public static zzv zza(String str) {
        final zzl zza = zzr.zza(str);
        if (zza.zza("").zzc()) {
            throw new IllegalArgumentException(zzr.zza("The pattern may not match the empty string: %s", zza));
        }
        return new zzv(new zzab() { // from class: com.google.android.gms.internal.firebase-auth-api.zzx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
            public final Iterator zza(zzv zzvVar, CharSequence charSequence) {
                return new zzz(zzvVar, charSequence, zzl.this.zza(charSequence));
            }
        });
    }

    public final List<String> zza(CharSequence charSequence) {
        zzw.zza(charSequence);
        Iterator<String> zza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
