package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzvl extends zzacv implements zzaeg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzvl() {
        super(r0);
        zzvo zzvoVar;
        zzvoVar = zzvo.zzb;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ zzvl(zzvk zzvkVar) {
        super(r1);
        zzvo zzvoVar;
        zzvoVar = zzvo.zzb;
    }

    public final zzvl zza(zzvn zzvnVar) {
        if (this.zzb) {
            zzar();
            this.zzb = false;
        }
        ((zzvo) this.zza).zzg = zzvnVar.zza();
        return this;
    }

    public final zzvl zzb(String str) {
        if (this.zzb) {
            zzar();
            this.zzb = false;
        }
        zzvo.zzh((zzvo) this.zza, str);
        return this;
    }

    public final zzvl zzc(zzaby zzabyVar) {
        if (this.zzb) {
            zzar();
            this.zzb = false;
        }
        ((zzvo) this.zza).zzf = zzabyVar;
        return this;
    }
}
