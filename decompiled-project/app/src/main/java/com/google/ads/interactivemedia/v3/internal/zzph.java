package com.google.ads.interactivemedia.v3.internal;

import F5.b;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.InterfaceC0986b;
import com.google.android.gms.common.internal.InterfaceC0987c;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzph implements InterfaceC0986b, InterfaceC0987c {

    @VisibleForTesting
    protected final zzpt zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzoy zzf;
    private final long zzg;
    private final int zzh;

    public zzph(Context context, int i7, int i10, String str, String str2, String str3, zzoy zzoyVar) {
        this.zzb = str;
        this.zzh = i10;
        this.zzc = str2;
        this.zzf = zzoyVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzpt zzptVar = new zzpt(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzptVar;
        this.zzd = new LinkedBlockingQueue();
        zzptVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static zzqf zza() {
        return new zzqf(null, 1);
    }

    private final void zze(int i7, long j, Exception exc) {
        this.zzf.zzc(i7, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0986b
    public final void onConnected(Bundle bundle) {
        zzpy zzd = zzd();
        if (zzd != null) {
            try {
                zzqf zzf = zzd.zzf(new zzqd(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0987c
    public final void onConnectionFailed(b bVar) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0986b
    public final void onConnectionSuspended(int i7) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzqf zzb(int i7) {
        zzqf zzqfVar;
        try {
            zzqfVar = (zzqf) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            zze(2009, this.zzg, e2);
            zzqfVar = null;
        }
        zze(3004, this.zzg, null);
        if (zzqfVar != null) {
            if (zzqfVar.zzc == 7) {
                zzoy.zzg(3);
            } else {
                zzoy.zzg(2);
            }
        }
        return zzqfVar == null ? zza() : zzqfVar;
    }

    public final void zzc() {
        zzpt zzptVar = this.zza;
        if (zzptVar != null) {
            if (zzptVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzpy zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
