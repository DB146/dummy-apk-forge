package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzau<K, V> extends zzan<K, V> {
    private static final zzan<Object, Object> zza = new zzau(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzau(Object obj, Object[] objArr, int i7) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static <K, V> zzau<K, V> zza(int i7, Object[] objArr, zzaq<K, V> zzaqVar) {
        int i10;
        short[] sArr;
        char c10;
        char c11;
        int i11 = i7;
        Object[] objArr2 = objArr;
        if (i11 == 0) {
            return (zzau) zza;
        }
        Object obj = null;
        int i12 = 1;
        if (i11 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzag.zza(obj2, obj3);
            return new zzau<>(null, objArr2, 1);
        }
        zzw.zzb(i11, objArr2.length >> 1);
        int max = Math.max(i11, 2);
        if (max < 751619276) {
            i10 = Integer.highestOneBit(max - 1) << 1;
            while (i10 * 0.7d < max) {
                i10 <<= 1;
            }
        } else {
            i10 = 1073741824;
            zzw.zza(max < 1073741824, "collection too large");
        }
        if (i11 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzag.zza(obj4, obj5);
            c10 = 1;
            c11 = 2;
        } else {
            int i13 = i10 - 1;
            char c12 = 65535;
            if (i10 <= 128) {
                byte[] bArr = new byte[i10];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i14 * 2;
                    int i17 = i15 * 2;
                    Object obj6 = objArr2[i16];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i16 ^ i12];
                    Objects.requireNonNull(obj7);
                    zzag.zza(obj6, obj7);
                    int zza2 = zzaf.zza(obj6.hashCode());
                    while (true) {
                        int i18 = zza2 & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i17;
                            if (i15 < i14) {
                                objArr2[i17] = obj6;
                                objArr2[i17 ^ 1] = obj7;
                            }
                            i15++;
                        } else {
                            if (obj6.equals(objArr2[i19])) {
                                int i20 = i19 ^ 1;
                                Object obj8 = objArr2[i20];
                                Objects.requireNonNull(obj8);
                                obj = new zzap(obj6, obj7, obj8);
                                objArr2[i20] = obj7;
                                break;
                            }
                            zza2 = i18 + 1;
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 == i11) {
                    obj = bArr;
                    c11 = 2;
                    c10 = 1;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i15), obj};
                    c11 = 2;
                    c10 = 1;
                }
            } else {
                if (i10 <= 32768) {
                    sArr = new short[i10];
                    Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i22 * 2;
                        int i24 = i21 * 2;
                        Object obj9 = objArr2[i23];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr2[i23 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzag.zza(obj9, obj10);
                        int zza3 = zzaf.zza(obj9.hashCode());
                        while (true) {
                            int i25 = zza3 & i13;
                            int i26 = sArr[i25] & 65535;
                            if (i26 == 65535) {
                                sArr[i25] = (short) i24;
                                if (i21 < i22) {
                                    objArr2[i24] = obj9;
                                    objArr2[i24 ^ 1] = obj10;
                                }
                                i21++;
                            } else {
                                if (obj9.equals(objArr2[i26])) {
                                    int i27 = i26 ^ 1;
                                    Object obj11 = objArr2[i27];
                                    Objects.requireNonNull(obj11);
                                    obj = new zzap(obj9, obj10, obj11);
                                    objArr2[i27] = obj10;
                                    break;
                                }
                                zza3 = i25 + 1;
                            }
                        }
                    }
                    if (i21 != i11) {
                        c11 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i21), obj};
                        c10 = 1;
                    }
                } else {
                    sArr = new int[i10];
                    Arrays.fill((int[]) sArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i11) {
                        int i30 = i28 * 2;
                        int i31 = i29 * 2;
                        Object obj12 = objArr2[i30];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i30 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzag.zza(obj12, obj13);
                        int zza4 = zzaf.zza(obj12.hashCode());
                        while (true) {
                            int i32 = zza4 & i13;
                            ?? r15 = sArr[i32];
                            if (r15 == c12) {
                                sArr[i32] = i31;
                                if (i29 < i28) {
                                    objArr2[i31] = obj12;
                                    objArr2[i31 ^ 1] = obj13;
                                }
                                i29++;
                            } else {
                                if (obj12.equals(objArr2[r15])) {
                                    int i33 = r15 ^ 1;
                                    Object obj14 = objArr2[i33];
                                    Objects.requireNonNull(obj14);
                                    obj = new zzap(obj12, obj13, obj14);
                                    objArr2[i33] = obj13;
                                    break;
                                }
                                zza4 = i32 + 1;
                                c12 = 65535;
                            }
                        }
                        i28++;
                        c12 = 65535;
                    }
                    if (i29 != i11) {
                        c10 = 1;
                        c11 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i29), obj};
                    }
                }
                obj = sArr;
                c11 = 2;
                c10 = 1;
            }
        }
        boolean z8 = obj instanceof Object[];
        Object obj15 = obj;
        if (z8) {
            Object[] objArr3 = (Object[]) obj;
            zzap zzapVar = (zzap) objArr3[c11];
            if (zzaqVar == null) {
                throw zzapVar.zza();
            }
            zzaqVar.zza = zzapVar;
            Object obj16 = objArr3[0];
            int intValue = ((Integer) objArr3[c10]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue << 1);
            obj15 = obj16;
            i11 = intValue;
        }
        return new zzau<>(obj15, objArr2, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v10;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i7 = this.zzd;
        if (obj != null) {
            if (i7 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    v10 = (V) objArr[1];
                    Objects.requireNonNull(v10);
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int zza2 = zzaf.zza(obj.hashCode());
                    while (true) {
                        int i10 = zza2 & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            v10 = (V) objArr[i11 ^ 1];
                            break;
                        }
                        zza2 = i10 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int zza3 = zzaf.zza(obj.hashCode());
                    while (true) {
                        int i12 = zza3 & length2;
                        int i13 = sArr[i12] & 65535;
                        if (i13 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            v10 = (V) objArr[i13 ^ 1];
                            break;
                        }
                        zza3 = i12 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int zza4 = zzaf.zza(obj.hashCode());
                    while (true) {
                        int i14 = zza4 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            v10 = (V) objArr[i15 ^ 1];
                            break;
                        }
                        zza4 = i14 + 1;
                    }
                }
            }
            if (v10 != null) {
                return null;
            }
            return v10;
        }
        v10 = null;
        if (v10 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final zzai<V> zza() {
        return new zzay(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final zzas<Map.Entry<K, V>> zzb() {
        return new zzat(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final zzas<K> zzc() {
        return new zzav(this, new zzay(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final boolean zzd() {
        return false;
    }
}
