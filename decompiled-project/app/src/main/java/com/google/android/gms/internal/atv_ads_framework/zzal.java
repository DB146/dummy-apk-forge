package com.google.android.gms.internal.atv_ads_framework;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzal extends zzae {
    static final zzae zza = new zzal(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzal(Object obj, Object[] objArr, int i7) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    public static zzal zzf(int i7, Object[] objArr, zzad zzadVar) {
        int i10;
        short[] sArr;
        Object[] objArr2;
        int i11 = i7;
        Object[] objArr3 = objArr;
        if (i11 == 0) {
            return (zzal) zza;
        }
        Object obj = null;
        if (i11 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            zzw.zza(obj2, obj3);
            return new zzal(null, objArr3, 1);
        }
        zzn.zzb(i11, objArr3.length >> 1, "index");
        char c10 = 2;
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
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            zzw.zza(obj4, obj5);
        } else {
            int i12 = i10 - 1;
            char c11 = 65535;
            if (i10 <= 128) {
                byte[] bArr = new byte[i10];
                Arrays.fill(bArr, (byte) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    int i15 = i13 + i13;
                    int i16 = i14 + i14;
                    Object obj6 = objArr3[i16];
                    obj6.getClass();
                    Object obj7 = objArr3[i16 ^ 1];
                    obj7.getClass();
                    zzw.zza(obj6, obj7);
                    int zza2 = zzx.zza(obj6.hashCode());
                    while (true) {
                        int i17 = zza2 & i12;
                        int i18 = bArr[i17] & 255;
                        if (i18 == 255) {
                            bArr[i17] = (byte) i15;
                            if (i13 < i14) {
                                objArr3[i15] = obj6;
                                objArr3[i15 ^ 1] = obj7;
                            }
                            i13++;
                        } else {
                            if (obj6.equals(objArr3[i18])) {
                                int i19 = i18 ^ 1;
                                Object obj8 = objArr3[i19];
                                obj8.getClass();
                                zzac zzacVar = new zzac(obj6, obj7, obj8);
                                objArr3[i19] = obj7;
                                obj = zzacVar;
                                break;
                            }
                            zza2 = i17 + 1;
                        }
                    }
                }
                if (i13 == i11) {
                    obj = bArr;
                    c10 = 2;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i13), obj};
                    c10 = 2;
                }
            } else if (i10 <= 32768) {
                sArr = new short[i10];
                Arrays.fill(sArr, (short) -1);
                int i20 = 0;
                for (int i21 = 0; i21 < i11; i21++) {
                    int i22 = i20 + i20;
                    int i23 = i21 + i21;
                    Object obj9 = objArr3[i23];
                    obj9.getClass();
                    Object obj10 = objArr3[i23 ^ 1];
                    obj10.getClass();
                    zzw.zza(obj9, obj10);
                    int zza3 = zzx.zza(obj9.hashCode());
                    while (true) {
                        int i24 = zza3 & i12;
                        char c12 = (char) sArr[i24];
                        if (c12 == 65535) {
                            sArr[i24] = (short) i22;
                            if (i20 < i21) {
                                objArr3[i22] = obj9;
                                objArr3[i22 ^ 1] = obj10;
                            }
                            i20++;
                        } else {
                            if (obj9.equals(objArr3[c12])) {
                                int i25 = c12 ^ 1;
                                Object obj11 = objArr3[i25];
                                obj11.getClass();
                                zzac zzacVar2 = new zzac(obj9, obj10, obj11);
                                objArr3[i25] = obj10;
                                obj = zzacVar2;
                                break;
                            }
                            zza3 = i24 + 1;
                        }
                    }
                }
                if (i20 != i11) {
                    c10 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i20), obj};
                    obj = objArr2;
                }
                obj = sArr;
                c10 = 2;
            } else {
                sArr = new int[i10];
                Arrays.fill((int[]) sArr, -1);
                int i26 = 0;
                int i27 = 0;
                while (i26 < i11) {
                    int i28 = i27 + i27;
                    int i29 = i26 + i26;
                    Object obj12 = objArr3[i29];
                    obj12.getClass();
                    Object obj13 = objArr3[i29 ^ 1];
                    obj13.getClass();
                    zzw.zza(obj12, obj13);
                    int zza4 = zzx.zza(obj12.hashCode());
                    while (true) {
                        int i30 = zza4 & i12;
                        ?? r15 = sArr[i30];
                        if (r15 == c11) {
                            sArr[i30] = i28;
                            if (i27 < i26) {
                                objArr3[i28] = obj12;
                                objArr3[i28 ^ 1] = obj13;
                            }
                            i27++;
                        } else {
                            if (obj12.equals(objArr3[r15])) {
                                int i31 = r15 ^ 1;
                                Object obj14 = objArr3[i31];
                                obj14.getClass();
                                zzac zzacVar3 = new zzac(obj12, obj13, obj14);
                                objArr3[i31] = obj13;
                                obj = zzacVar3;
                                break;
                            }
                            zza4 = i30 + 1;
                            c11 = 65535;
                        }
                    }
                    i26++;
                    c11 = 65535;
                }
                if (i27 != i11) {
                    c10 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i27), obj};
                    obj = objArr2;
                }
                obj = sArr;
                c10 = 2;
            }
        }
        boolean z8 = obj instanceof Object[];
        Object obj15 = obj;
        if (z8) {
            Object[] objArr4 = (Object[]) obj;
            zzadVar.zzc = (zzac) objArr4[c10];
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i11 = intValue;
        }
        return new zzal(obj15, objArr3, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.atv_ads_framework.zzae, java.util.Map
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
                    int zza2 = zzx.zza(obj.hashCode());
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
                    int zza3 = zzx.zza(obj.hashCode());
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
                    int zza4 = zzx.zza(obj.hashCode());
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

    @Override // com.google.android.gms.internal.atv_ads_framework.zzae
    public final zzy zza() {
        return new zzak(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzae
    public final zzaf zzc() {
        return new zzai(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzae
    public final zzaf zzd() {
        return new zzaj(this, new zzak(this.zzb, 0, this.zzd));
    }
}
