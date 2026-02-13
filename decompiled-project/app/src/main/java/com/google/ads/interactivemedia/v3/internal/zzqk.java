package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzqk {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzql zzc;
    private final zzoy zzd;
    private final zzot zze;
    private zzpz zzf;
    private final Object zzg = new Object();

    public zzqk(Context context, zzql zzqlVar, zzoy zzoyVar, zzot zzotVar) {
        this.zzb = context;
        this.zzc = zzqlVar;
        this.zzd = zzoyVar;
        this.zze = zzotVar;
    }

    private final synchronized Class zzd(zzqa zzqaVar) {
        try {
            String zzk = zzqaVar.zza().zzk();
            HashMap hashMap = zza;
            Class cls = (Class) hashMap.get(zzk);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzqaVar.zzc())) {
                    throw new zzqj(2026, "VM did not pass signature verification");
                }
                try {
                    File zzb = zzqaVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzqaVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    throw new zzqj(2008, e);
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    throw new zzqj(2008, e);
                } catch (SecurityException e11) {
                    e = e11;
                    throw new zzqj(2008, e);
                }
            } catch (GeneralSecurityException e12) {
                throw new zzqj(2026, e12);
            }
        } finally {
        }
    }

    public final zzpb zza() {
        zzpz zzpzVar;
        synchronized (this.zzg) {
            zzpzVar = this.zzf;
        }
        return zzpzVar;
    }

    public final zzqa zzb() {
        synchronized (this.zzg) {
            try {
                zzpz zzpzVar = this.zzf;
                if (zzpzVar == null) {
                    return null;
                }
                return zzpzVar.zzf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzqa zzqaVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzpz zzpzVar = new zzpz(zzd(zzqaVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzqaVar.zze(), null, new Bundle(), 2), zzqaVar, this.zzc, this.zzd);
                if (!zzpzVar.zzh()) {
                    throw new zzqj(4000, "init failed");
                }
                int zze = zzpzVar.zze();
                if (zze != 0) {
                    throw new zzqj(4001, "ci: " + zze);
                }
                synchronized (this.zzg) {
                    zzpz zzpzVar2 = this.zzf;
                    if (zzpzVar2 != null) {
                        try {
                            zzpzVar2.zzg();
                        } catch (zzqj e2) {
                            this.zzd.zzc(e2.zza(), -1L, e2);
                        }
                    }
                    this.zzf = zzpzVar;
                }
                this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e10) {
                throw new zzqj(2004, e10);
            }
        } catch (zzqj e11) {
            this.zzd.zzc(e11.zza(), System.currentTimeMillis() - currentTimeMillis, e11);
            return false;
        } catch (Exception e12) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        }
    }
}
