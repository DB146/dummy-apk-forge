package com.google.ads.interactivemedia.v3.internal;

import M5.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import h3.o;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzqb {

    @VisibleForTesting
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzqb(Context context, int i7) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzqc.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzqc.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i7;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        return o.l(this.zzd - 1, "FBAMTD");
    }

    private final String zzf() {
        return o.l(this.zzd - 1, "LATMTD");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzmm zzmmVar, zzqh zzqhVar) {
        boolean z8;
        zzmp zzb;
        zzmp zzb2;
        String zzk = zzmmVar.zzc().zzk();
        byte[] zzx = zzmmVar.zze().zzx();
        byte[] zzx2 = zzmmVar.zzd().zzx();
        if (!TextUtils.isEmpty(zzk) && zzx2 != null && zzx2.length != 0) {
            zzqc.zzd(this.zza);
            this.zza.mkdirs();
            zzqc.zzc(zzk, this.zza).mkdirs();
            File zzb3 = zzqc.zzb(zzk, "pcam.jar", this.zza);
            if ((zzx == null || zzx.length <= 0 || zzqc.zze(zzb3, zzx)) && zzqc.zze(zzqc.zzb(zzk, "pcbc", this.zza), zzx2)) {
                File zzb4 = zzqc.zzb(zzmmVar.zzc().zzk(), "pcam.jar", this.zza);
                if (zzb4.exists() && zzqhVar != null && !zzqhVar.zza(zzb4)) {
                    return false;
                }
                String zzk2 = zzmmVar.zzc().zzk();
                if (!TextUtils.isEmpty(zzk2)) {
                    File zzb5 = zzqc.zzb(zzk2, "pcam.jar", this.zza);
                    File zzb6 = zzqc.zzb(zzk2, "pcbc", this.zza);
                    File zzb7 = zzqc.zzb(zzk2, "pcam.jar", zzd());
                    File zzb8 = zzqc.zzb(zzk2, "pcbc", zzd());
                    if ((!zzb5.exists() || zzb5.renameTo(zzb7)) && zzb6.exists() && zzb6.renameTo(zzb8)) {
                        zzmo zzd = zzmp.zzd();
                        zzd.zze(zzmmVar.zzc().zzk());
                        zzd.zza(zzmmVar.zzc().zzi());
                        zzd.zzb(zzmmVar.zzc().zza());
                        zzd.zzd(zzmmVar.zzc().zzc());
                        zzd.zzc(zzmmVar.zzc().zzb());
                        zzmp zzmpVar = (zzmp) zzd.zzak();
                        zzmp zzb9 = zzb(1);
                        SharedPreferences.Editor edit = this.zzc.edit();
                        if (zzb9 != null && !zzmpVar.zzk().equals(zzb9.zzk())) {
                            edit.putString(zze(), c.a(zzb9.zzav()));
                        }
                        edit.putString(zzf(), c.a(zzmpVar.zzav()));
                        if (edit.commit()) {
                            z8 = true;
                            HashSet hashSet = new HashSet();
                            zzb = zzb(1);
                            if (zzb != null) {
                                hashSet.add(zzb.zzk());
                            }
                            zzb2 = zzb(2);
                            if (zzb2 != null) {
                                hashSet.add(zzb2.zzk());
                            }
                            for (File file : zzd().listFiles()) {
                                String name = file.getName();
                                if (!hashSet.contains(name)) {
                                    zzqc.zzd(zzqc.zzc(name, zzd()));
                                }
                            }
                            return z8;
                        }
                    }
                }
                z8 = false;
                HashSet hashSet2 = new HashSet();
                zzb = zzb(1);
                if (zzb != null) {
                }
                zzb2 = zzb(2);
                if (zzb2 != null) {
                }
                while (r4 < r1) {
                }
                return z8;
            }
        }
        return false;
    }

    @VisibleForTesting
    public final zzmp zzb(int i7) {
        String string = i7 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] i10 = c.i(string);
            zzmp zzg = zzmp.zzg(zzadr.zzs(i10, 0, i10.length));
            String zzk = zzg.zzk();
            File zzb = zzqc.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzqc.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzqc.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzg;
                }
            }
        } catch (zzafc unused) {
        }
        return null;
    }

    public final zzqa zzc(int i7) {
        zzmp zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzqc.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzqc.zzb(zzk, "pcam", zzd());
        }
        return new zzqa(zzb, zzb2, zzqc.zzb(zzk, "pcbc", zzd()), zzqc.zzb(zzk, "pcopt", zzd()));
    }
}
