package com.google.android.gms.internal.p002firebaseauthapi;

import Q5.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.q;
import o7.v;

/* loaded from: classes.dex */
final class zzaeb extends zzaex<String, v> {
    private final String zzu;
    private final String zzv;

    public zzaeb(String str, String str2) {
        super(4);
        G.e(str, "code cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zzd(this.zzu, this.zzv, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        char c10 = 5;
        char c11 = 3;
        zzahx zzahxVar = this.zzm;
        if (zzahxVar.zzg()) {
            zzahxVar.zzc();
        } else {
            zzahxVar.zzb();
        }
        zzahxVar.zzb();
        if (zzahxVar.zzh()) {
            String zzd = zzahxVar.zzd();
            zzd.getClass();
            char c12 = 65535;
            switch (zzd.hashCode()) {
                case -1874510116:
                    if (zzd.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                        c12 = 0;
                        break;
                    }
                    break;
                case -1452371317:
                    if (zzd.equals("PASSWORD_RESET")) {
                        c12 = 1;
                        break;
                    }
                    break;
                case -1341836234:
                    if (zzd.equals("VERIFY_EMAIL")) {
                        c12 = 2;
                        break;
                    }
                    break;
                case -1099157829:
                    if (zzd.equals("VERIFY_AND_CHANGE_EMAIL")) {
                        c12 = 3;
                        break;
                    }
                    break;
                case 870738373:
                    if (zzd.equals("EMAIL_SIGNIN")) {
                        c12 = 4;
                        break;
                    }
                    break;
                case 970484929:
                    if (zzd.equals("RECOVER_EMAIL")) {
                        c12 = 5;
                        break;
                    }
                    break;
            }
            switch (c12) {
                case 0:
                    c10 = 6;
                    break;
                case 1:
                    c10 = 0;
                    break;
                case 2:
                    c10 = 1;
                    break;
                case 3:
                    break;
                case 4:
                    c10 = 4;
                    break;
                case 5:
                    c10 = 2;
                    break;
                default:
                    c10 = 3;
                    break;
            }
            if (c10 != 4 && c10 != 3) {
                if (zzahxVar.zzf()) {
                    String zzb = zzahxVar.zzb();
                    q V7 = e.V(zzahxVar.zza());
                    G.d(zzb);
                    G.g(V7);
                } else if (zzahxVar.zzg()) {
                    String zzc = zzahxVar.zzc();
                    String zzb2 = zzahxVar.zzb();
                    G.d(zzc);
                    G.d(zzb2);
                } else if (zzahxVar.zze()) {
                    G.d(zzahxVar.zzb());
                }
            }
            c11 = c10;
        }
        if (c11 != 0) {
            zza(new Status(17499, null, null, null));
        } else {
            zzb(this.zzm.zzb());
        }
    }
}
