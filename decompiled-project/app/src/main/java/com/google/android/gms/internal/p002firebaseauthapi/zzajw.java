package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzajw extends zzajx {
    protected final byte[] zzb;

    public zzajw(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzajp) || zzb() != ((zzajp) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzajw)) {
            return obj.equals(this);
        }
        zzajw zzajwVar = (zzajw) obj;
        int zza = zza();
        int zza2 = zzajwVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzajwVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public byte zza(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final zzajp zza(int i7, int i10) {
        int zza = zzajp.zza(0, i10, zzb());
        return zza == 0 ? zzajp.zza : new zzajt(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final void zza(zzajm zzajmVar) {
        zzajmVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public void zza(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zzb, 0, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajx
    public final boolean zza(zzajp zzajpVar, int i7, int i10) {
        if (i10 > zzajpVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i10 + zzb());
        }
        if (i10 > zzajpVar.zzb()) {
            throw new IllegalArgumentException(c.e(i10, zzajpVar.zzb(), "Ran off end of other: 0, ", ", "));
        }
        if (!(zzajpVar instanceof zzajw)) {
            return zzajpVar.zza(0, i10).equals(zza(0, i10));
        }
        zzajw zzajwVar = (zzajw) zzajpVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzajwVar.zzb;
        int zze = zze() + i10;
        int zze2 = zze();
        int zze3 = zzajwVar.zze();
        while (zze2 < zze) {
            if (bArr[zze2] != bArr2[zze3]) {
                return false;
            }
            zze2++;
            zze3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public byte zzb(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final int zzb(int i7, int i10, int i11) {
        return zzalb.zza(i7, this.zzb, zze(), i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final zzakb zzc() {
        return zzakb.zza(this.zzb, zze(), zzb(), true);
    }

    public int zze() {
        return 0;
    }
}
