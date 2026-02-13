package com.google.android.gms.internal.measurement;

import a.AbstractC0672a;
import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjx implements zzju {
    private static zzjx zza;
    private final Context zzb;
    private final ContentObserver zzc;
    private boolean zzd;

    private zzjx() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }

    private zzjx(Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new zzjv(this, null);
    }

    public static zzjx zza(Context context) {
        zzjx zzjxVar;
        synchronized (zzjx.class) {
            try {
                if (zza == null) {
                    zza = AbstractC0672a.e(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzjx(context) : new zzjx();
                }
                zzjx zzjxVar2 = zza;
                if (zzjxVar2 != null && zzjxVar2.zzc != null && !zzjxVar2.zzd) {
                    try {
                        context.getContentResolver().registerContentObserver(zzjg.zza, true, zza.zzc);
                        zzjx zzjxVar3 = zza;
                        zzjxVar3.getClass();
                        zzjxVar3.zzd = true;
                    } catch (SecurityException e2) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e2);
                    }
                }
                zzjxVar = zza;
                zzjxVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzjxVar;
    }

    public static synchronized void zzc() {
        Context context;
        synchronized (zzjx.class) {
            try {
                zzjx zzjxVar = zza;
                if (zzjxVar != null && (context = zzjxVar.zzb) != null && zzjxVar.zzc != null && zzjxVar.zzd) {
                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                }
                zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzju
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final String zze(final String str) {
        Context context = this.zzb;
        if (context != null && !zzjm.zzb(context)) {
            try {
                return (String) zzju.zzg(new zzjt() { // from class: com.google.android.gms.internal.measurement.zzjw
                    @Override // com.google.android.gms.internal.measurement.zzjt
                    public final /* synthetic */ Object zza() {
                        return zzjx.this.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e2) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e2);
            }
        }
        return null;
    }

    public final String zzd(String str) {
        Context context = this.zzb;
        context.getClass();
        return zzjf.zza(context.getContentResolver(), str, null);
    }
}
