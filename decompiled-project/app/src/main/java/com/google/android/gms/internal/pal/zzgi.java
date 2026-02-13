package com.google.android.gms.internal.pal;

import F5.h;
import O5.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.util.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzgi implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;

    @VisibleForTesting
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzgl.zza(new zzis() { // from class: com.google.android.gms.internal.pal.zzgg
                @Override // com.google.android.gms.internal.pal.zzis
                public final Object zza() {
                    return zzgi.this.zzd();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(final zzgc zzgcVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzgcVar.zzk();
            }
        }
        if (zzgcVar.zzd() != 2) {
            return (zzgcVar.zzd() == 1 && this.zzh.has(zzgcVar.zzl())) ? zzgcVar.zza(this.zzh) : zzgl.zza(new zzis() { // from class: com.google.android.gms.internal.pal.zzgf
                @Override // com.google.android.gms.internal.pal.zzis
                public final Object zza() {
                    return zzgi.this.zzc(zzgcVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzgcVar.zzk() : zzgcVar.zzb(bundle);
    }

    public final /* synthetic */ Object zzc(zzgc zzgcVar) {
        return zzgcVar.zzc(this.zze);
    }

    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", "{}");
    }

    public final void zze(Context context) {
        Context context2;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzd) {
                    return;
                }
                if (!this.zza) {
                    this.zza = true;
                }
                Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                this.zzg = applicationContext;
                try {
                    this.zzf = c.a(applicationContext).g(128, this.zzg.getPackageName()).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    int i7 = h.f4105e;
                    try {
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        context2 = null;
                    }
                    if (context2 != null || (context2 = context.getApplicationContext()) != null) {
                        context = context2;
                    }
                    zzfv.zzb();
                    SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                    this.zze = sharedPreferences;
                    if (sharedPreferences != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzgr.zzc(new zzgh(this));
                    zzf();
                    this.zzd = true;
                    this.zza = false;
                    this.zzc.open();
                } catch (Throwable th) {
                    this.zza = false;
                    this.zzc.open();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
