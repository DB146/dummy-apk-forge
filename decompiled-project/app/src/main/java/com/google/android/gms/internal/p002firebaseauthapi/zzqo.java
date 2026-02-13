package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzqo extends RuntimeException {
    public zzqo(String str) {
        super(str);
    }

    public zzqo(String str, Throwable th) {
        super(str, th);
    }

    private zzqo(Throwable th) {
        super(th);
    }

    public static <T> T zza(zzqn<T> zzqnVar) {
        try {
            return zzqnVar.zza();
        } catch (Exception e2) {
            throw new zzqo(e2);
        }
    }
}
