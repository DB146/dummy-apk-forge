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

@VisibleForTesting
/* loaded from: classes.dex */
final class zzpf implements InterfaceC0986b, InterfaceC0987c {

    @VisibleForTesting
    protected final zzpt zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzpf(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzpt zzptVar = new zzpt(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzptVar;
        this.zzd = new LinkedBlockingQueue();
        zzptVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static zzbc zza() {
        zzaf zza = zzbc.zza();
        zza.zzD(32768L);
        return (zzbc) zza.zzak();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0986b
    public final void onConnected(Bundle bundle) {
        zzpy zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzpu(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zza());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                zzc();
                this.zze.quit();
                throw th;
            }
            zzc();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0987c
    public final void onConnectionFailed(b bVar) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0986b
    public final void onConnectionSuspended(int i7) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzbc zzb(int i7) {
        zzbc zzbcVar;
        try {
            zzbcVar = (zzbc) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzbcVar = null;
        }
        return zzbcVar == null ? zza() : zzbcVar;
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
