package com.google.android.gms.internal.p002firebaseauthapi;

import I5.a;
import Y6.i;
import android.content.Context;
import com.google.android.gms.common.internal.G;
import java.util.concurrent.ScheduledExecutorService;
import n7.B;
import n7.p;
import n7.r;

/* loaded from: classes.dex */
public final class zzaef {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzaam zzb;
    private final zzafu zzc;

    public zzaef(i iVar, ScheduledExecutorService scheduledExecutorService) {
        G.g(iVar);
        iVar.b();
        Context context = iVar.f12041a;
        G.g(context);
        this.zzb = new zzaam(new zzaet(iVar, zzaeu.zza()));
        this.zzc = new zzafu(context, scheduledExecutorService);
    }

    private static boolean zza(long j, boolean z8) {
        if (j > 0 && z8) {
            return true;
        }
        zza.f("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zza(zzaah zzaahVar, zzaed zzaedVar) {
        G.g(zzaahVar);
        G.g(zzaedVar);
        String str = zzaahVar.zzb().f21304d;
        zzaeg zzaegVar = new zzaeg(zzaedVar, zza);
        if (this.zzc.zzc(str)) {
            if (!zzaahVar.zzh()) {
                this.zzc.zzb(zzaegVar, str);
                return;
            }
            this.zzc.zzb(str);
        }
        long zza2 = zzaahVar.zza();
        boolean zzi = zzaahVar.zzi();
        zzaii zza3 = zzaii.zza(zzaahVar.zze(), zzaahVar.zzb().f21301a, zzaahVar.zzb().f21304d, zzaahVar.zzd(), zzaahVar.zzg(), zzaahVar.zzf(), zzaahVar.zzc());
        if (zza(zza2, zzi)) {
            zza3.zza(new zzage(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzaegVar, zza2, zzi);
        this.zzb.zza(zza3, this.zzc.zza(zzaegVar, str));
    }

    public final void zza(zzaai zzaaiVar, zzaed zzaedVar) {
        G.g(zzaedVar);
        G.g(zzaaiVar);
        r zza2 = zzaaiVar.zza();
        G.g(zza2);
        this.zzb.zza(zzafo.zza(zza2), new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzagp zzagpVar, zzaed zzaedVar) {
        G.g(zzaedVar);
        G.g(zzagpVar.zzb());
        this.zzb.zza(zzagpVar.zzb(), zzagpVar.zzc(), new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahe zzaheVar, zzaed zzaedVar) {
        G.g(zzaheVar);
        G.d(zzaheVar.zzd());
        G.g(zzaedVar);
        this.zzb.zza(zzaheVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahg zzahgVar, zzaed zzaedVar) {
        G.g(zzahgVar);
        this.zzb.zza(zzahgVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahl zzahlVar, zzaed zzaedVar) {
        G.g(zzahlVar);
        this.zzb.zza(zzahlVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahr zzahrVar, zzaed zzaedVar) {
        G.g(zzaedVar);
        G.g(zzahrVar);
        String zzb = zzahrVar.zzb();
        G.d(zzb);
        this.zzb.zza(zzb, zzahrVar.zza(), new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahu zzahuVar, zzaed zzaedVar) {
        G.g(zzahuVar);
        G.d(zzahuVar.zzb());
        G.g(zzaedVar);
        this.zzb.zza(zzahuVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzahw zzahwVar, zzaed zzaedVar) {
        G.g(zzahwVar);
        this.zzb.zza(zzahwVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzaib zzaibVar, zzaed zzaedVar) {
        G.g(zzaedVar);
        G.g(zzaibVar);
        String zzd = zzaibVar.zzd();
        zzaeg zzaegVar = new zzaeg(zzaedVar, zza);
        if (this.zzc.zzc(zzd)) {
            if (!zzaibVar.zze()) {
                this.zzc.zzb(zzaegVar, zzd);
                return;
            }
            this.zzc.zzb(zzd);
        }
        long zzb = zzaibVar.zzb();
        boolean zzf = zzaibVar.zzf();
        if (zza(zzb, zzf)) {
            zzaibVar.zza(new zzage(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzaegVar, zzb, zzf);
        this.zzb.zza(zzaibVar, this.zzc.zza(zzaegVar, zzd));
    }

    public final void zza(zzaif zzaifVar, zzaed zzaedVar) {
        G.g(zzaifVar);
        G.g(zzaedVar);
        this.zzb.zzd(zzaifVar.zza(), new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzaim zzaimVar, zzaed zzaedVar) {
        G.g(zzaedVar);
        this.zzb.zza(zzaimVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzait zzaitVar, zzaed zzaedVar) {
        G.g(zzaitVar);
        G.g(zzaedVar);
        this.zzb.zza(zzaitVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(zzaiu zzaiuVar, zzaed zzaedVar) {
        G.g(zzaiuVar);
        G.g(zzaedVar);
        this.zzb.zza(zzaiuVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, zzaed zzaedVar) {
        G.d(str);
        G.g(zzaedVar);
        this.zzb.zza(str, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, zzait zzaitVar, zzaed zzaedVar) {
        G.d(str);
        G.g(zzaitVar);
        G.g(zzaedVar);
        this.zzb.zza(str, zzaitVar, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, String str2, zzaed zzaedVar) {
        G.d(str);
        G.g(zzaedVar);
        this.zzb.zza(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j, boolean z8, boolean z10, String str4, String str5, String str6, boolean z11, zzaed zzaedVar) {
        G.e(str, "idToken should not be empty.");
        G.g(zzaedVar);
        zzaeg zzaegVar = new zzaeg(zzaedVar, zza);
        if (this.zzc.zzc(str2)) {
            if (!z8) {
                this.zzc.zzb(zzaegVar, str2);
                return;
            }
            this.zzc.zzb(str2);
        }
        zzaik zza2 = zzaik.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j, z11)) {
            zza2.zza(new zzage(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzaegVar, j, z11);
        this.zzb.zza(zza2, this.zzc.zza(zzaegVar, str2));
    }

    public final void zza(String str, String str2, String str3, zzaed zzaedVar) {
        G.e(str, "cachedTokenState should not be empty.");
        G.e(str2, "uid should not be empty.");
        G.g(zzaedVar);
        this.zzb.zza(str, str2, str3, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaed zzaedVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaedVar);
        this.zzb.zza(str, str2, str3, str4, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaed zzaedVar) {
        G.d(str);
        G.d(str2);
        G.d(str3);
        G.g(zzaedVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, B b2, zzaed zzaedVar) {
        G.d(str);
        G.g(b2);
        G.g(zzaedVar);
        this.zzb.zza(str, b2, new zzaeg(zzaedVar, zza));
    }

    public final void zza(String str, p pVar, String str2, zzaed zzaedVar) {
        G.d(str);
        G.g(pVar);
        throw null;
    }

    public final void zza(p pVar, String str, String str2, String str3, zzaed zzaedVar) {
        G.g(pVar);
        throw null;
    }

    public final void zzb(zzahe zzaheVar, zzaed zzaedVar) {
        G.g(zzaheVar);
        G.d(zzaheVar.zzc());
        G.g(zzaedVar);
        this.zzb.zzb(zzaheVar, new zzaeg(zzaedVar, zza));
    }

    public final void zzb(String str, zzaed zzaedVar) {
        G.d(str);
        G.g(zzaedVar);
        this.zzb.zzb(str, new zzaeg(zzaedVar, zza));
    }

    public final void zzb(String str, String str2, zzaed zzaedVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaedVar);
        this.zzb.zzb(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaed zzaedVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaedVar);
        this.zzb.zzb(str, str2, str3, str4, new zzaeg(zzaedVar, zza));
    }

    public final void zzc(zzahe zzaheVar, zzaed zzaedVar) {
        G.g(zzaheVar);
        this.zzb.zzc(zzaheVar, new zzaeg(zzaedVar, zza));
    }

    public final void zzc(String str, zzaed zzaedVar) {
        G.d(str);
        G.g(zzaedVar);
        this.zzb.zzc(str, new zzaeg(zzaedVar, zza));
    }

    public final void zzc(String str, String str2, zzaed zzaedVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaedVar);
        this.zzb.zzc(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zzd(String str, zzaed zzaedVar) {
        G.g(zzaedVar);
        this.zzb.zze(str, new zzaeg(zzaedVar, zza));
    }

    public final void zzd(String str, String str2, zzaed zzaedVar) {
        G.d(str);
        G.g(zzaedVar);
        this.zzb.zzd(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zze(String str, zzaed zzaedVar) {
        G.d(str);
        G.g(zzaedVar);
        this.zzb.zzf(str, new zzaeg(zzaedVar, zza));
    }

    public final void zze(String str, String str2, zzaed zzaedVar) {
        G.d(str);
        this.zzb.zze(str, str2, new zzaeg(zzaedVar, zza));
    }

    public final void zzf(String str, String str2, zzaed zzaedVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaedVar);
        this.zzb.zzf(str, str2, new zzaeg(zzaedVar, zza));
    }
}
