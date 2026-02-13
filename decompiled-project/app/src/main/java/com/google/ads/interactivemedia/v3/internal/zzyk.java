package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import y.S;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyk implements zzyz {
    final /* synthetic */ Constructor zza;

    public zzyk(Constructor constructor) {
        this.zza = constructor;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyz
    public final Object zza() {
        try {
            return this.zza.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw zzacg.zzb(e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException(S.b("Failed to invoke constructor '", zzacg.zzc(this.zza), "' with no args"), e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(S.b("Failed to invoke constructor '", zzacg.zzc(this.zza), "' with no args"), e11.getCause());
        }
    }
}
