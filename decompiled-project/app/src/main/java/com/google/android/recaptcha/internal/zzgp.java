package com.google.android.recaptcha.internal;

import Eb.n;
import Eb.o;
import ac.AbstractC0796a;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        String d02;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        int i10 = 0;
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        if (zza2 instanceof int[]) {
            int[] iArr = (int[]) zza2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "[");
            int length = iArr.length;
            int i11 = 0;
            while (i10 < length) {
                int i12 = iArr[i10];
                i11++;
                if (i11 > 1) {
                    sb2.append((CharSequence) ",");
                }
                sb2.append((CharSequence) String.valueOf(i12));
                i10++;
            }
            sb2.append((CharSequence) "]");
            d02 = sb2.toString();
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, AbstractC0796a.f12815a);
            } else if (zza2 instanceof long[]) {
                long[] jArr = (long[]) zza2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length2 = jArr.length;
                int i13 = 0;
                while (i10 < length2) {
                    long j = jArr[i10];
                    i13++;
                    if (i13 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf(j));
                    i10++;
                }
                sb3.append((CharSequence) "]");
                d02 = sb3.toString();
            } else if (zza2 instanceof short[]) {
                short[] sArr = (short[]) zza2;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length3 = sArr.length;
                int i14 = 0;
                while (i10 < length3) {
                    short s3 = sArr[i10];
                    i14++;
                    if (i14 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf((int) s3));
                    i10++;
                }
                sb4.append((CharSequence) "]");
                d02 = sb4.toString();
            } else if (zza2 instanceof float[]) {
                float[] fArr = (float[]) zza2;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length4 = fArr.length;
                int i15 = 0;
                while (i10 < length4) {
                    float f4 = fArr[i10];
                    i15++;
                    if (i15 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(f4));
                    i10++;
                }
                sb5.append((CharSequence) "]");
                d02 = sb5.toString();
            } else if (zza2 instanceof double[]) {
                double[] dArr = (double[]) zza2;
                StringBuilder sb6 = new StringBuilder();
                sb6.append((CharSequence) "[");
                int length5 = dArr.length;
                int i16 = 0;
                while (i10 < length5) {
                    double d10 = dArr[i10];
                    i16++;
                    if (i16 > 1) {
                        sb6.append((CharSequence) ",");
                    }
                    sb6.append((CharSequence) String.valueOf(d10));
                    i10++;
                }
                sb6.append((CharSequence) "]");
                d02 = sb6.toString();
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                d02 = n.b0(56, (Object[]) zza2);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                d02 = o.d0((Iterable) zza2, ",", "[", "]", null, 56);
            }
            d02 = str;
        }
        zzgdVar.zzc().zze(i7, d02);
    }
}
