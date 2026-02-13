package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import Y6.i;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public final class zzaet extends zzafl implements zzagf {
    private zzaen zza;
    private zzaeq zzb;
    private zzafq zzc;
    private final zzaeu zzd;
    private final i zze;
    private String zzf;
    private zzaew zzg;

    public zzaet(i iVar, zzaeu zzaeuVar) {
        this(iVar, zzaeuVar, null, null, null);
    }

    private zzaet(i iVar, zzaeu zzaeuVar, zzafq zzafqVar, zzaen zzaenVar, zzaeq zzaeqVar) {
        this.zze = iVar;
        iVar.b();
        this.zzf = iVar.f12043c.f12054a;
        G.g(zzaeuVar);
        this.zzd = zzaeuVar;
        zza(null, null, null);
        zzagd.zza(this.zzf, this);
    }

    private final void zza(zzafq zzafqVar, zzaen zzaenVar, zzaeq zzaeqVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String zza = zzaga.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza)) {
            zza = zzagd.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + zza);
        }
        if (this.zzc == null) {
            this.zzc = new zzafq(zza, zzb());
        }
        String zza2 = zzaga.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzagd.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + zza2);
        }
        if (this.zza == null) {
            this.zza = new zzaen(zza2, zzb());
        }
        String zza3 = zzaga.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzagd.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + zza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzaeq(zza3, zzb());
        }
    }

    private final zzaew zzb() {
        if (this.zzg == null) {
            this.zzg = new zzaew(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagf
    public final void zza() {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagk zzagkVar, zzafn<zzagn> zzafnVar) {
        G.g(zzagkVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/createAuthUri", this.zzf), zzagkVar, zzafnVar, zzagn.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagm zzagmVar, zzafn<Void> zzafnVar) {
        G.g(zzagmVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/deleteAccount", this.zzf), zzagmVar, zzafnVar, Void.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagp zzagpVar, zzafn<zzago> zzafnVar) {
        G.g(zzagpVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/emailLinkSignin", this.zzf), zzagpVar, zzafnVar, zzago.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagr zzagrVar, zzafn<zzagq> zzafnVar) {
        G.g(zzagrVar);
        G.g(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzagrVar, zzafnVar, zzagq.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzagt zzagtVar, zzafn<zzags> zzafnVar) {
        G.g(zzagtVar);
        G.g(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzagtVar, zzafnVar, zzags.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaha zzahaVar, zzafn<zzahd> zzafnVar) {
        G.g(zzahaVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/getAccountInfo", this.zzf), zzahaVar, zzafnVar, zzahd.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahb zzahbVar, zzafn<zzahn> zzafnVar) {
        G.g(zzahbVar);
        G.g(zzafnVar);
        zzafq zzafqVar = this.zzc;
        zzafm.zza(zzafqVar.zza("/token", this.zzf), zzahbVar, zzafnVar, zzahn.class, zzafqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahe zzaheVar, zzafn<zzahh> zzafnVar) {
        G.g(zzaheVar);
        G.g(zzafnVar);
        if (zzaheVar.zzb() != null) {
            zzb().zzb(zzaheVar.zzb().f21274v);
        }
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/getOobConfirmationCode", this.zzf), zzaheVar, zzafnVar, zzahh.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahg zzahgVar, zzafn<zzahj> zzafnVar) {
        G.g(zzahgVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/getRecaptchaParam", this.zzf), zzafnVar, zzahj.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahl zzahlVar, zzafn<zzahk> zzafnVar) {
        G.g(zzahlVar);
        G.g(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        String str = zzaeqVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzahlVar.zzb() + "&version=" + zzahlVar.zzc();
        if (!zzae.zzc(zzahlVar.zzd())) {
            str = c.i(str, "&tenantId=", zzahlVar.zzd());
        }
        zzafm.zza(str, zzafnVar, zzahk.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahu zzahuVar, zzafn<zzahx> zzafnVar) {
        G.g(zzahuVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/resetPassword", this.zzf), zzahuVar, zzafnVar, zzahx.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzahw zzahwVar, zzafn<zzahy> zzafnVar) {
        G.g(zzahwVar);
        G.g(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts:revokeToken", this.zzf), zzahwVar, zzafnVar, zzahy.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaib zzaibVar, zzafn<zzaia> zzafnVar) {
        G.g(zzaibVar);
        G.g(zzafnVar);
        if (!TextUtils.isEmpty(zzaibVar.zzc())) {
            zzb().zzb(zzaibVar.zzc());
        }
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/sendVerificationCode", this.zzf), zzaibVar, zzafnVar, zzaia.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaid zzaidVar, zzafn<zzaic> zzafnVar) {
        G.g(zzaidVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/setAccountInfo", this.zzf), zzaidVar, zzafnVar, zzaic.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaie zzaieVar, zzafn<zzaih> zzafnVar) {
        G.g(zzaieVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/signupNewUser", this.zzf), zzaieVar, zzafnVar, zzaih.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaig zzaigVar, zzafn<zzaij> zzafnVar) {
        G.g(zzaigVar);
        G.g(zzafnVar);
        if (zzaigVar instanceof zzaik) {
            zzaik zzaikVar = (zzaik) zzaigVar;
            if (!TextUtils.isEmpty(zzaikVar.zzb())) {
                zzb().zzb(zzaikVar.zzb());
            }
        }
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzaigVar, zzafnVar, zzaij.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaii zzaiiVar, zzafn<zzail> zzafnVar) {
        G.g(zzaiiVar);
        G.g(zzafnVar);
        if (!TextUtils.isEmpty(zzaiiVar.zzb())) {
            zzb().zzb(zzaiiVar.zzb());
        }
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaSignIn:start", this.zzf), zzaiiVar, zzafnVar, zzail.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzait zzaitVar, zzafn<zzaiv> zzafnVar) {
        G.g(zzaitVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyAssertion", this.zzf), zzaitVar, zzafnVar, zzaiv.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaiu zzaiuVar, zzafn<zzaix> zzafnVar) {
        G.g(zzaiuVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyCustomToken", this.zzf), zzaiuVar, zzafnVar, zzaix.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaiw zzaiwVar, zzafn<zzaiz> zzafnVar) {
        G.g(zzaiwVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyPassword", this.zzf), zzaiwVar, zzafnVar, zzaiz.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaiy zzaiyVar, zzafn<zzajb> zzafnVar) {
        G.g(zzaiyVar);
        G.g(zzafnVar);
        zzaen zzaenVar = this.zza;
        zzafm.zza(zzaenVar.zza("/verifyPhoneNumber", this.zzf), zzaiyVar, zzafnVar, zzajb.class, zzaenVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(zzaja zzajaVar, zzafn<zzajd> zzafnVar) {
        G.g(zzajaVar);
        G.g(zzafnVar);
        zzaeq zzaeqVar = this.zzb;
        zzaeq.zza(zzaeqVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzajaVar, zzafnVar, zzajd.class, zzaeqVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafl
    public final void zza(String str, zzafn<Void> zzafnVar) {
        G.g(zzafnVar);
        zzb().zza(str);
        zzafnVar.zza((zzafn<Void>) null);
    }
}
