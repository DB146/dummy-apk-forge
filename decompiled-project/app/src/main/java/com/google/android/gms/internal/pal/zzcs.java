package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import r5.C1942a;

/* loaded from: classes.dex */
public final class zzcs extends zzct {
    private static final String zzv = "zzcs";
    private C1942a zzw;

    public zzcs(Context context) {
        super(context, "");
    }

    public static zzcs zzl(Context context) {
        zzct.zzt(context, true);
        return new zzcs(context);
    }

    @Override // com.google.android.gms.internal.pal.zzct, com.google.android.gms.internal.pal.zzcr
    public final zzr zzh(Context context, View view, Activity activity) {
        return null;
    }

    @Override // com.google.android.gms.internal.pal.zzct, com.google.android.gms.internal.pal.zzcr
    public final zzr zzj(Context context, View view, Activity activity) {
        return null;
    }

    public final String zzm(String str, String str2) {
        byte[] zze = zzbn.zze(str, str2, true);
        return zze != null ? zzbj.zza(zze, true) : Integer.toString(7);
    }

    @Override // com.google.android.gms.internal.pal.zzct
    public final List zzn(zzdu zzduVar, Context context, zzr zzrVar, zzi zziVar) {
        ArrayList arrayList = new ArrayList();
        if (zzduVar.zzk() == null) {
            return arrayList;
        }
        arrayList.add(new zzem(zzduVar, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", zzrVar, zzduVar.zza(), 24));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.pal.zzct
    public final void zzo(zzdu zzduVar, Context context, zzr zzrVar, zzi zziVar) {
        if (!zzduVar.zzb) {
            zzct.zzu(zzn(zzduVar, context, zzrVar, zziVar));
            return;
        }
        C1942a c1942a = this.zzw;
        if (c1942a != null) {
            String str = c1942a.f23785a;
            if (!TextUtils.isEmpty(str)) {
                zzrVar.zzs(zzdx.zzd(str));
                zzrVar.zzac(6);
                zzrVar.zzr(this.zzw.f23786b);
            }
            this.zzw = null;
        }
    }

    public final void zzp(C1942a c1942a) {
        this.zzw = c1942a;
    }
}
