package com.google.android.gms.internal.p002firebaseauthapi;

import Y6.i;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* loaded from: classes.dex */
public final class zzafr {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzafr(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        String str;
        String str2;
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        i iVar = this.zza.f15828a;
        iVar.b();
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", iVar.f12043c.f12054a);
        FirebaseAuth firebaseAuth = this.zza;
        synchronized (firebaseAuth.f15834h) {
            str = firebaseAuth.f15835i;
        }
        if (!TextUtils.isEmpty(str)) {
            FirebaseAuth firebaseAuth2 = this.zza;
            synchronized (firebaseAuth2.f15834h) {
                str2 = firebaseAuth2.f15835i;
            }
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", str2);
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzaeu.zza().zzb());
        i iVar2 = this.zza.f15828a;
        iVar2.b();
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", iVar2.f12042b);
        this.zza.getClass();
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", (String) null);
        this.zzb.startActivity(intent);
    }
}
