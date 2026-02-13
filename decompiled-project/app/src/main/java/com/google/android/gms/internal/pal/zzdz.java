package com.google.android.gms.internal.pal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdz implements Runnable {
    final /* synthetic */ zzeb zza;

    public zzdz(zzeb zzebVar) {
        this.zza = zzebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf();
    }
}
