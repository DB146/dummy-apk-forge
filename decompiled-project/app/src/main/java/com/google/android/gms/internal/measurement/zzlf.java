package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzlf extends zzle {
    protected final byte[] zza;

    public zzlf(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlg) || zzc() != ((zzlg) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzlf)) {
            return obj.equals(this);
        }
        zzlf zzlfVar = (zzlf) obj;
        int zzi = zzi();
        int zzi2 = zzlfVar.zzi();
        if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzlfVar.zzc()) {
            int zzc2 = zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 18 + String.valueOf(zzc2).length());
            sb2.append("Length too large: ");
            sb2.append(zzc);
            sb2.append(zzc2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (zzc > zzlfVar.zzc()) {
            int zzc3 = zzlfVar.zzc();
            StringBuilder sb3 = new StringBuilder(String.valueOf(zzc).length() + 27 + String.valueOf(zzc3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(zzc);
            sb3.append(", ");
            sb3.append(zzc3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlfVar.zza;
        zzlfVar.zzd();
        int i7 = 0;
        int i10 = 0;
        while (i7 < zzc) {
            if (bArr[i7] != bArr2[i10]) {
                return false;
            }
            i7++;
            i10++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final zzlg zze(int i7, int i10) {
        int zzj = zzlg.zzj(0, i10, zzc());
        return zzj == 0 ? zzlg.zzb : new zzlb(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final void zzf(zzky zzkyVar) {
        ((zzlj) zzkyVar).zzv(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final int zzg(int i7, int i10, int i11) {
        return zzmo.zzc(i7, this.zza, 0, i11);
    }
}
