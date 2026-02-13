package com.google.android.gms.internal.p002firebaseauthapi;

import O5.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import n7.B;
import n7.C1713d;
import n7.F;

/* loaded from: classes.dex */
public final class zzaam {
    private final zzafl zza;

    public zzaam(zzafl zzaflVar) {
        G.g(zzaflVar);
        this.zza = zzaflVar;
    }

    public static /* synthetic */ void zza(zzaam zzaamVar, zzaeg zzaegVar, zzahn zzahnVar, zzahc zzahcVar, zzaid zzaidVar, zzafk zzafkVar) {
        G.g(zzaegVar);
        G.g(zzahnVar);
        G.g(zzahcVar);
        G.g(zzaidVar);
        G.g(zzafkVar);
        zzaamVar.zza.zza(zzaidVar, new zzaar(zzaamVar, zzaidVar, zzahcVar, zzaegVar, zzahnVar, zzafkVar));
    }

    public static /* synthetic */ void zza(zzaam zzaamVar, zzaeg zzaegVar, zzahn zzahnVar, zzaid zzaidVar, zzafk zzafkVar) {
        G.g(zzaegVar);
        G.g(zzahnVar);
        G.g(zzaidVar);
        G.g(zzafkVar);
        zzaamVar.zza.zza(new zzaha(zzahnVar.zzc()), new zzaas(zzaamVar, zzafkVar, zzaegVar, zzahnVar, zzaidVar));
    }

    public static /* synthetic */ void zza(zzaam zzaamVar, zzaeg zzaegVar, zzaie zzaieVar, zzafk zzafkVar) {
        G.g(zzaegVar);
        G.g(zzaieVar);
        G.g(zzafkVar);
        zzaamVar.zza.zza(zzaieVar, new zzabb(zzaamVar, zzaegVar, zzafkVar));
    }

    public static void zza(zzaam zzaamVar, zzaiv zzaivVar, zzaeg zzaegVar, zzafk zzafkVar) {
        if (!zzaivVar.zzo()) {
            zzaamVar.zza(new zzahn(zzaivVar.zzi(), zzaivVar.zze(), Long.valueOf(zzaivVar.zza()), "Bearer"), zzaivVar.zzh(), zzaivVar.zzg(), Boolean.valueOf(zzaivVar.zzn()), zzaivVar.zzb(), zzaegVar, zzafkVar);
            return;
        }
        zzaegVar.zza(new zzaak(zzaivVar.zzm() ? new Status(17012, null, null, null) : b.K(zzaivVar.zzd()), zzaivVar.zzb(), zzaivVar.zzc(), zzaivVar.zzj()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagp zzagpVar, zzaeg zzaegVar) {
        G.g(zzagpVar);
        G.g(zzaegVar);
        this.zza.zza(zzagpVar, new zzaap(this, zzaegVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahn zzahnVar, String str, String str2, Boolean bool, F f4, zzaeg zzaegVar, zzafk zzafkVar) {
        G.g(zzahnVar);
        G.g(zzafkVar);
        G.g(zzaegVar);
        this.zza.zza(new zzaha(zzahnVar.zzc()), new zzaau(this, zzafkVar, str2, str, bool, f4, zzaegVar, zzahnVar));
    }

    private final void zza(String str, zzafn<zzahn> zzafnVar) {
        G.g(zzafnVar);
        G.d(str);
        zzahn zzb = zzahn.zzb(str);
        if (zzb.zzg()) {
            zzafnVar.zza((zzafn<zzahn>) zzb);
        } else {
            this.zza.zza(new zzahb(zzb.zzd()), new zzacf(this, zzafnVar));
        }
    }

    private final void zzd(zzahe zzaheVar, zzaeg zzaegVar) {
        G.g(zzaheVar);
        G.g(zzaegVar);
        this.zza.zza(zzaheVar, new zzaca(this, zzaegVar));
    }

    public final void zza(zzagr zzagrVar, String str, zzaeg zzaegVar) {
        G.g(zzagrVar);
        G.g(zzaegVar);
        zza(str, new zzabn(this, zzagrVar, zzaegVar));
    }

    public final void zza(zzagt zzagtVar, zzaeg zzaegVar) {
        G.g(zzagtVar);
        G.g(zzaegVar);
        this.zza.zza(zzagtVar, new zzabp(this, zzaegVar));
    }

    public final void zza(zzahe zzaheVar, zzaeg zzaegVar) {
        G.d(zzaheVar.zzd());
        G.g(zzaegVar);
        zzd(zzaheVar, zzaegVar);
    }

    public final void zza(zzahg zzahgVar, zzaeg zzaegVar) {
        G.g(zzahgVar);
        G.g(zzaegVar);
        this.zza.zza(zzahgVar, new zzabu(this, zzaegVar));
    }

    public final void zza(zzahl zzahlVar, zzaeg zzaegVar) {
        G.g(zzahlVar);
        G.g(zzaegVar);
        this.zza.zza(zzahlVar, new zzabr(this, zzaegVar));
    }

    public final void zza(zzahu zzahuVar, zzaeg zzaegVar) {
        G.d(zzahuVar.zzb());
        G.g(zzaegVar);
        this.zza.zza(zzahuVar, new zzaax(this, zzaegVar));
    }

    public final void zza(zzahw zzahwVar, zzaeg zzaegVar) {
        this.zza.zza(zzahwVar, new zzacc(this, zzaegVar));
    }

    public final void zza(zzaib zzaibVar, zzaeg zzaegVar) {
        G.d(zzaibVar.zzd());
        G.g(zzaegVar);
        this.zza.zza(zzaibVar, new zzaba(this, zzaegVar));
    }

    public final void zza(zzaig zzaigVar, zzaeg zzaegVar) {
        G.g(zzaigVar);
        G.g(zzaegVar);
        this.zza.zza(zzaigVar, new zzabo(this, zzaigVar, zzaegVar));
    }

    public final void zza(zzaii zzaiiVar, zzaeg zzaegVar) {
        G.g(zzaiiVar);
        G.g(zzaegVar);
        this.zza.zza(zzaiiVar, new zzabs(this, zzaegVar));
    }

    public final void zza(zzait zzaitVar, zzaeg zzaegVar) {
        G.g(zzaitVar);
        G.g(zzaegVar);
        zzaitVar.zzb(true);
        this.zza.zza(zzaitVar, new zzabl(this, zzaegVar));
    }

    public final void zza(zzaiu zzaiuVar, zzaeg zzaegVar) {
        G.g(zzaiuVar);
        G.g(zzaegVar);
        this.zza.zza(zzaiuVar, new zzaay(this, zzaegVar));
    }

    public final void zza(zzaiy zzaiyVar, zzaeg zzaegVar) {
        G.g(zzaiyVar);
        G.g(zzaegVar);
        this.zza.zza(zzaiyVar, new zzaaz(this, zzaegVar));
    }

    public final void zza(String str, zzaeg zzaegVar) {
        G.d(str);
        G.g(zzaegVar);
        zza(str, new zzabv(this, zzaegVar));
    }

    public final void zza(String str, zzait zzaitVar, zzaeg zzaegVar) {
        G.d(str);
        G.g(zzaitVar);
        G.g(zzaegVar);
        zza(str, new zzabg(this, zzaitVar, zzaegVar));
    }

    public final void zza(String str, zzaiy zzaiyVar, zzaeg zzaegVar) {
        G.d(str);
        G.g(zzaiyVar);
        G.g(zzaegVar);
        zza(str, new zzabe(this, zzaiyVar, zzaegVar));
    }

    public final void zza(String str, String str2, zzaeg zzaegVar) {
        G.d(str);
        G.g(zzaegVar);
        zzaid zzaidVar = new zzaid();
        zzaidVar.zze(str);
        zzaidVar.zzh(str2);
        this.zza.zza(zzaidVar, new zzacg(this, zzaegVar));
    }

    public final void zza(String str, String str2, String str3, zzaeg zzaegVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaegVar);
        zza(str, new zzabj(this, str2, str3, zzaegVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaeg zzaegVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaegVar);
        this.zza.zza(new zzaie(str, str2, null, str3, str4, null), new zzaao(this, zzaegVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaeg zzaegVar) {
        G.d(str);
        G.d(str2);
        G.d(str3);
        G.g(zzaegVar);
        zza(str3, new zzabc(this, str, str2, str4, str5, zzaegVar));
    }

    public final void zza(String str, B b2, zzaeg zzaegVar) {
        G.d(str);
        G.g(b2);
        G.g(zzaegVar);
        zza(str, new zzacb(this, b2, zzaegVar));
    }

    public final void zza(C1713d c1713d, String str, zzaeg zzaegVar) {
        G.g(c1713d);
        G.g(zzaegVar);
        if (c1713d.f21285e) {
            zza(c1713d.f21284d, new zzaaq(this, c1713d, str, zzaegVar));
        } else {
            zza(new zzagp(c1713d, null, str), zzaegVar);
        }
    }

    public final void zzb(zzahe zzaheVar, zzaeg zzaegVar) {
        G.d(zzaheVar.zzc());
        G.g(zzaegVar);
        this.zza.zza(zzaheVar, new zzaaw(this, zzaegVar));
    }

    public final void zzb(String str, zzaeg zzaegVar) {
        G.d(str);
        G.g(zzaegVar);
        this.zza.zza(new zzahb(str), new zzaal(this, zzaegVar));
    }

    public final void zzb(String str, String str2, zzaeg zzaegVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaegVar);
        zza(str, new zzace(this, str2, zzaegVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaeg zzaegVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaegVar);
        this.zza.zza(new zzaiw(str, str2, str3, str4), new zzaan(this, zzaegVar));
    }

    public final void zzc(zzahe zzaheVar, zzaeg zzaegVar) {
        zzd(zzaheVar, zzaegVar);
    }

    public final void zzc(String str, zzaeg zzaegVar) {
        G.d(str);
        G.g(zzaegVar);
        zza(str, new zzabt(this, zzaegVar));
    }

    public final void zzc(String str, String str2, zzaeg zzaegVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaegVar);
        zza(str, new zzacd(this, str2, zzaegVar));
    }

    public final void zzd(String str, zzaeg zzaegVar) {
        G.g(zzaegVar);
        this.zza.zza(str, new zzabx(this, zzaegVar));
    }

    public final void zzd(String str, String str2, zzaeg zzaegVar) {
        G.d(str);
        G.g(zzaegVar);
        this.zza.zza(new zzahu(str, null, str2), new zzaav(this, zzaegVar));
    }

    public final void zze(String str, zzaeg zzaegVar) {
        G.g(zzaegVar);
        this.zza.zza(new zzaie(str), new zzabz(this, zzaegVar));
    }

    public final void zze(String str, String str2, zzaeg zzaegVar) {
        G.d(str);
        G.g(zzaegVar);
        this.zza.zza(new zzagk(str, str2), new zzaat(this, zzaegVar));
    }

    public final void zzf(String str, zzaeg zzaegVar) {
        G.d(str);
        G.g(zzaegVar);
        zza(str, new zzabi(this, zzaegVar));
    }

    public final void zzf(String str, String str2, zzaeg zzaegVar) {
        G.d(str);
        G.d(str2);
        G.g(zzaegVar);
        zza(str2, new zzabh(this, str, zzaegVar));
    }
}
