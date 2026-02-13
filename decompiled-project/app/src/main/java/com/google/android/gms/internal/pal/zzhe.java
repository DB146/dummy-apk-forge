package com.google.android.gms.internal.pal;

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
final class zzhe implements InterfaceC0986b, InterfaceC0987c {

    @VisibleForTesting
    protected final zzhh zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzhe(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzhh zzhhVar = new zzhh(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzhhVar;
        this.zzd = new LinkedBlockingQueue();
        zzhhVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static zzaf zza() {
        zzr zza = zzaf.zza();
        zza.zzD(32768L);
        return (zzaf) zza.zzan();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0986b
    public final void onConnected(Bundle bundle) {
        zzhm zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzhi(this.zzb, this.zzc)).zza());
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

    public final zzaf zzb(int i7) {
        zzaf zzafVar;
        try {
            zzafVar = (zzaf) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzafVar = null;
        }
        return zzafVar == null ? zza() : zzafVar;
    }

    public final void zzc() {
        zzhh zzhhVar = this.zza;
        if (zzhhVar != null) {
            if (zzhhVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzhm zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
