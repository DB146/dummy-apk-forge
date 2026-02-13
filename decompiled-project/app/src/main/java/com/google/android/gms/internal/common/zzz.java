package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzz extends zzm {
    final CharSequence zzb;
    final zzr zzc;
    final boolean zzd;
    int zze = 0;
    int zzf;

    public zzz(zzaa zzaaVar, CharSequence charSequence) {
        zzr zzrVar;
        boolean z8;
        zzrVar = zzaaVar.zza;
        this.zzc = zzrVar;
        z8 = zzaaVar.zzb;
        this.zzd = z8;
        this.zzf = f.API_PRIORITY_OTHER;
        this.zzb = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r3 = r5.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r3 != 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r1 = r5.zzb.length();
        r5.zze = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r1 <= r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r5.zzb.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return r5.zzb.subSequence(r0, r1).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r5.zzf = r3 - 1;
     */
    @Override // com.google.android.gms.internal.common.zzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i7 = this.zze;
        while (true) {
            int i10 = this.zze;
            if (i10 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i10);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zze = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zze = zzc;
            }
            if (zzc == i7) {
                int i11 = zzc + 1;
                this.zze = i11;
                if (i11 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i7 < zzd) {
                    this.zzb.charAt(i7);
                }
                if (i7 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                if (!this.zzd || i7 != zzd) {
                    break;
                }
                i7 = this.zze;
            }
        }
    }

    public abstract int zzc(int i7);

    public abstract int zzd(int i7);
}
