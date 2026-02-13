package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzaid {
    private int zza = 0;

    public final int zza() {
        return this.zza;
    }

    public final zzaid zzb(Object obj, Object obj2, Comparator comparator) {
        if (this.zza != 0 || obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.zza = -1;
            return this;
        }
        if (obj2 == null) {
            this.zza = 1;
            return this;
        }
        if (obj.getClass().isArray()) {
            int i7 = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (this.zza == 0 && jArr != jArr2) {
                    int length = jArr.length;
                    int length2 = jArr2.length;
                    if (length != length2) {
                        this.zza = length >= length2 ? 1 : -1;
                    } else {
                        while (i7 < jArr.length && this.zza == 0) {
                            this.zza = (jArr[i7] > jArr2[i7] ? 1 : (jArr[i7] == jArr2[i7] ? 0 : -1));
                            i7++;
                        }
                    }
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (this.zza == 0 && iArr != iArr2) {
                    int length3 = iArr.length;
                    int length4 = iArr2.length;
                    if (length3 != length4) {
                        this.zza = length3 >= length4 ? 1 : -1;
                    } else {
                        for (int i10 = 0; i10 < iArr.length && this.zza == 0; i10++) {
                            int i11 = iArr[i10];
                            int i12 = iArr2[i10];
                            this.zza = i11 == i12 ? 0 : i11 < i12 ? -1 : 1;
                        }
                    }
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (this.zza == 0 && sArr != sArr2) {
                    int length5 = sArr.length;
                    int length6 = sArr2.length;
                    if (length5 != length6) {
                        this.zza = length5 >= length6 ? 1 : -1;
                    } else {
                        while (i7 < sArr.length && this.zza == 0) {
                            this.zza = sArr[i7] - sArr2[i7];
                            i7++;
                        }
                    }
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (this.zza == 0 && cArr != cArr2) {
                    int length7 = cArr.length;
                    int length8 = cArr2.length;
                    if (length7 != length8) {
                        this.zza = length7 >= length8 ? 1 : -1;
                    } else {
                        while (i7 < cArr.length && this.zza == 0) {
                            this.zza = cArr[i7] - cArr2[i7];
                            i7++;
                        }
                    }
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (this.zza == 0 && bArr != bArr2) {
                    int length9 = bArr.length;
                    int length10 = bArr2.length;
                    if (length9 != length10) {
                        this.zza = length9 >= length10 ? 1 : -1;
                    } else {
                        while (i7 < bArr.length && this.zza == 0) {
                            this.zza = bArr[i7] - bArr2[i7];
                            i7++;
                        }
                    }
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (this.zza == 0 && dArr != dArr2) {
                    int length11 = dArr.length;
                    int length12 = dArr2.length;
                    if (length11 != length12) {
                        this.zza = length11 >= length12 ? 1 : -1;
                    } else {
                        while (i7 < dArr.length && this.zza == 0) {
                            this.zza = Double.compare(dArr[i7], dArr2[i7]);
                            i7++;
                        }
                    }
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (this.zza == 0 && fArr != fArr2) {
                    int length13 = fArr.length;
                    int length14 = fArr2.length;
                    if (length13 != length14) {
                        this.zza = length13 >= length14 ? 1 : -1;
                    } else {
                        while (i7 < fArr.length && this.zza == 0) {
                            this.zza = Float.compare(fArr[i7], fArr2[i7]);
                            i7++;
                        }
                    }
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (this.zza == 0 && zArr != zArr2) {
                    int length15 = zArr.length;
                    int length16 = zArr2.length;
                    if (length15 != length16) {
                        this.zza = length15 >= length16 ? 1 : -1;
                    } else {
                        while (i7 < zArr.length && this.zza == 0) {
                            boolean z8 = zArr[i7];
                            if (z8 != zArr2[i7]) {
                                if (z8) {
                                    this.zza = 1;
                                } else {
                                    this.zza = -1;
                                }
                            }
                            i7++;
                        }
                    }
                }
            } else {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (this.zza == 0 && objArr != objArr2) {
                    int length17 = objArr.length;
                    int length18 = objArr2.length;
                    if (length17 != length18) {
                        this.zza = length17 >= length18 ? 1 : -1;
                    } else {
                        while (i7 < objArr.length && this.zza == 0) {
                            zzb(objArr[i7], objArr2[i7], null);
                            i7++;
                        }
                    }
                }
            }
        } else {
            this.zza = ((Comparable) obj).compareTo(obj2);
        }
        return this;
    }
}
