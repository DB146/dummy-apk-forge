package com.google.android.gms.internal.pal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdr implements Runnable {
    final /* synthetic */ zzdu zza;

    public zzdr(zzdu zzduVar) {
        this.zza = zzduVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzv();
    }
}
