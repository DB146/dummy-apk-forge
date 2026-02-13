package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjj extends zzjc {
    static final zzjc zza = new zzjj(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzjj(Object obj, Object[] objArr, int i7) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzjj zzk(int i7, Object[] objArr, zzjb zzjbVar) {
        int i10;
        short[] sArr;
        char c10;
        char c11;
        byte[] bArr;
        int i11 = i7;
        Object[] objArr2 = objArr;
        if (i11 == 0) {
            return (zzjj) zza;
        }
        Object obj = null;
        int i12 = 1;
        if (i11 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            zziu.zza(obj2, obj3);
            return new zzjj(null, objArr2, 1);
        }
        zzip.zzb(i11, objArr2.length >> 1, "index");
        int max = Math.max(i11, 2);
        if (max < 751619276) {
            i10 = Integer.highestOneBit(max - 1);
            do {
                i10 += i10;
            } while (i10 * 0.7d < max);
        } else {
            i10 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i11 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            zziu.zza(obj4, obj5);
            c10 = 1;
            c11 = 2;
        } else {
            int i13 = i10 - 1;
            char c12 = 65535;
            if (i10 <= 128) {
                byte[] bArr2 = new byte[i10];
                Arrays.fill(bArr2, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i14 + i14;
                    int i17 = i15 + i15;
                    Object obj6 = objArr2[i16];
                    obj6.getClass();
                    Object obj7 = objArr2[i16 ^ i12];
                    obj7.getClass();
                    zziu.zza(obj6, obj7);
                    int zza2 = zziv.zza(obj6.hashCode());
                    while (true) {
                        int i18 = zza2 & i13;
                        int i19 = bArr2[i18] & 255;
                        if (i19 == 255) {
                            bArr2[i18] = (byte) i17;
                            if (i15 < i14) {
                                objArr2[i17] = obj6;
                                objArr2[i17 ^ 1] = obj7;
                            }
                            i15++;
                        } else {
                            if (obj6.equals(objArr2[i19])) {
                                int i20 = i19 ^ 1;
                                Object obj8 = objArr2[i20];
                                obj8.getClass();
                                zzja zzjaVar = new zzja(obj6, obj7, obj8);
                                objArr2[i20] = obj7;
                                obj = zzjaVar;
                                break;
                            }
                            zza2 = i18 + 1;
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 == i11) {
                    bArr = bArr2;
                } else {
                    bArr = new Object[]{bArr2, Integer.valueOf(i15), obj};
                    c11 = 2;
                    c10 = 1;
                    obj = bArr;
                }
            } else if (i10 <= 32768) {
                sArr = new short[i10];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i11; i22++) {
                    int i23 = i22 + i22;
                    int i24 = i21 + i21;
                    Object obj9 = objArr2[i23];
                    obj9.getClass();
                    Object obj10 = objArr2[i23 ^ 1];
                    obj10.getClass();
                    zziu.zza(obj9, obj10);
                    int zza3 = zziv.zza(obj9.hashCode());
                    while (true) {
                        int i25 = zza3 & i13;
                        char c13 = (char) sArr[i25];
                        if (c13 == 65535) {
                            sArr[i25] = (short) i24;
                            if (i21 < i22) {
                                objArr2[i24] = obj9;
                                objArr2[i24 ^ 1] = obj10;
                            }
                            i21++;
                        } else {
                            if (obj9.equals(objArr2[c13])) {
                                int i26 = c13 ^ 1;
                                Object obj11 = objArr2[i26];
                                obj11.getClass();
                                zzja zzjaVar2 = new zzja(obj9, obj10, obj11);
                                objArr2[i26] = obj10;
                                obj = zzjaVar2;
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
                bArr = sArr;
            } else {
                int i27 = 1;
                sArr = new int[i10];
                Arrays.fill((int[]) sArr, -1);
                int i28 = 0;
                int i29 = 0;
                while (i28 < i11) {
                    int i30 = i28 + i28;
                    int i31 = i29 + i29;
                    Object obj12 = objArr2[i30];
                    obj12.getClass();
                    Object obj13 = objArr2[i30 ^ i27];
                    obj13.getClass();
                    zziu.zza(obj12, obj13);
                    int zza4 = zziv.zza(obj12.hashCode());
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
                                obj14.getClass();
                                zzja zzjaVar3 = new zzja(obj12, obj13, obj14);
                                objArr2[i33] = obj13;
                                obj = zzjaVar3;
                                break;
                            }
                            zza4 = i32 + 1;
                            c12 = 65535;
                        }
                    }
                    i28++;
                    i27 = 1;
                    c12 = 65535;
                }
                if (i29 != i11) {
                    c10 = 1;
                    c11 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i29), obj};
                }
                bArr = sArr;
            }
            c11 = 2;
            c10 = 1;
            obj = bArr;
        }
        boolean z8 = obj instanceof Object[];
        Object obj15 = obj;
        if (z8) {
            Object[] objArr3 = (Object[]) obj;
            zzja zzjaVar4 = (zzja) objArr3[c11];
            if (zzjbVar == null) {
                throw zzjaVar4.zza();
            }
            zzjbVar.zzc = zzjaVar4;
            Object obj16 = objArr3[0];
            int intValue = ((Integer) objArr3[c10]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj15 = obj16;
            i11 = intValue;
        }
        return new zzjj(obj15, objArr2, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.pal.zzjc, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.zzc;
        Object[] objArr = this.zzb;
        int i7 = this.zzd;
        if (obj != null) {
            if (i7 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int zza2 = zziv.zza(obj.hashCode());
                    while (true) {
                        int i10 = zza2 & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            obj2 = objArr[i11 ^ 1];
                            break;
                        }
                        zza2 = i10 + 1;
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int zza3 = zziv.zza(obj.hashCode());
                    while (true) {
                        int i12 = zza3 & length2;
                        char c10 = (char) sArr[i12];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                            break;
                        }
                        zza3 = i12 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int zza4 = zziv.zza(obj.hashCode());
                    while (true) {
                        int i13 = zza4 & length3;
                        int i14 = iArr[i13];
                        if (i14 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            obj2 = objArr[i14 ^ 1];
                            break;
                        }
                        zza4 = i13 + 1;
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.pal.zzjc
    public final zziw zza() {
        return new zzji(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.pal.zzjc
    public final zzjd zzg() {
        return new zzjg(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.pal.zzjc
    public final zzjd zzh() {
        return new zzjh(this, new zzji(this.zzb, 0, this.zzd));
    }
}
