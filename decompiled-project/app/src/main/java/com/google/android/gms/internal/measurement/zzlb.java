package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzlb extends zzlf {
    private final int zzc;

    public zzlb(byte[] bArr, int i7, int i10) {
        super(bArr);
        zzlg.zzj(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
    public final byte zza(int i7) {
        int i10 = this.zzc;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return ((zzlf) this).zza[i7];
        }
        if (i7 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 11);
            sb2.append("Index < 0: ");
            sb2.append(i7);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 18 + String.valueOf(i10).length());
        sb3.append("Index > length: ");
        sb3.append(i7);
        sb3.append(", ");
        sb3.append(i10);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
    public final byte zzb(int i7) {
        return ((zzlf) this).zza[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzlf, com.google.android.gms.internal.measurement.zzlg
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final int zzd() {
        return 0;
    }
}
