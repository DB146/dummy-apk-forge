package com.google.android.gms.internal.pal;

import B0.AbstractC0187l;
import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzei extends zzfg {
    private static final zzfh zzi = new zzfh();
    private final Context zzj;
    private final zzi zzk;

    public zzei(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10, Context context, zzi zziVar) {
        super(zzduVar, "hhtrMjcGMTQSGdrv1+l2gakNTe0Pfchc8VT5kRHtsehlafuJ8JEE4iewNV4y5I/U", "o5W1eROpLyVNcsDGW3Y0lGc2x/V+mDPvMXouv3gbW6M=", zzrVar, i7, 27);
        this.zzj = context;
        this.zzk = zziVar;
    }

    public static String zzc(zzi zziVar) {
        if (zziVar == null || !zziVar.zzg() || zzdx.zzg(zziVar.zze().zzd())) {
            return null;
        }
        return zziVar.zze().zzd();
    }

    private final String zzd() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaf zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzah()) {
                return null;
            }
            return zzc.zzf();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        Boolean valueOf;
        int i7;
        zzbk zzbkVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            try {
                zzbk zzbkVar2 = (zzbk) zza.get();
                if (zzbkVar2 != null) {
                    if (!zzdx.zzg(zzbkVar2.zza)) {
                        if (!zzbkVar2.zza.equals("E")) {
                            if (zzbkVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                            }
                            zzbkVar = (zzbk) zza.get();
                        }
                    }
                }
                boolean z8 = true;
                if (zzdx.zzg(zzc(this.zzk))) {
                    zzi zziVar = this.zzk;
                    if (zzdx.zzg(zzc(zziVar))) {
                        valueOf = Boolean.valueOf(zziVar != null && zziVar.zzf() && zziVar.zzd().zzd() == 4);
                    } else {
                        valueOf = Boolean.FALSE;
                    }
                    i7 = (valueOf.booleanValue() && this.zzb.zzp()) ? 4 : 3;
                } else {
                    i7 = 5;
                }
                if (i7 != 3) {
                    z8 = false;
                }
                Boolean valueOf2 = Boolean.valueOf(z8);
                Boolean bool = (Boolean) zzfv.zzc().zzb(zzgk.zzbY);
                String zzb = ((Boolean) zzfv.zzc().zzb(zzgk.zzbX)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zzb.zzp() && zzdx.zzg(zzb)) {
                    zzb = zzd();
                }
                zzbk zzbkVar3 = new zzbk((String) this.zzf.invoke(null, this.zzj, valueOf2, zzb));
                if (zzdx.zzg(zzbkVar3.zza) || zzbkVar3.zza.equals("E")) {
                    int i10 = i7 - 1;
                    if (i10 == 3) {
                        String zzd = zzd();
                        if (!zzdx.zzg(zzd)) {
                            zzbkVar3.zza = zzd;
                        }
                    } else if (i10 == 4) {
                        zzbkVar3.zza = this.zzk.zze().zzd();
                    }
                }
                zza.set(zzbkVar3);
                zzbkVar = (zzbk) zza.get();
            } finally {
            }
        }
        synchronized (this.zze) {
            if (zzbkVar != null) {
                try {
                    this.zze.zzx(zzbkVar.zza);
                    this.zze.zzY(zzbkVar.zzb);
                    this.zze.zzaa(zzbkVar.zzc);
                    this.zze.zzi(zzbkVar.zzd);
                    this.zze.zzw(zzbkVar.zze);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.pal.zzfi] */
    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzi2 = zzdx.zzi((String) zzfv.zzc().zzb(zzgk.zzbZ));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzi2)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzdx.zzi((String) zzfv.zzc().zzb(zzgk.zzca)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzjr zzj = zzjr.zzj();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.pal.zzfi
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzjr zzjrVar = zzjr.this;
                    if (list == null) {
                        zzjrVar.zzi(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ApkChecksum c10 = AbstractC0187l.c(list.get(i7));
                            type = c10.getType();
                            if (type == 8) {
                                value = c10.getValue();
                                zzjrVar.zzi(zzdx.zzc(value));
                                return;
                            }
                        }
                        zzjrVar.zzi(null);
                    } catch (Throwable unused) {
                        zzjrVar.zzi(null);
                    }
                }
            });
            return (String) zzj.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
