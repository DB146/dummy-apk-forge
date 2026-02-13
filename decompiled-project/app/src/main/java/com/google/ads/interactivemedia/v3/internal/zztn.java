package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zztn extends zzsr {
    static final zzsr zza = new zztn(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zztn(Object obj, Object[] objArr, int i7) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zztn zzj(int i7, Object[] objArr, zzsq zzsqVar) {
        short[] sArr;
        char c10;
        char c11;
        Object[] objArr2;
        int i10 = i7;
        Object[] objArr3 = objArr;
        if (i10 == 0) {
            return (zztn) zza;
        }
        Object obj = null;
        int i11 = 1;
        if (i10 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            zzrv.zzb(obj2, obj3);
            return new zztn(null, objArr3, 1);
        }
        zzrm.zzb(i10, objArr3.length >> 1, "index");
        int zzj = zzst.zzj(i7);
        if (i10 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            zzrv.zzb(obj4, obj5);
            c10 = 1;
            c11 = 2;
        } else {
            int i12 = zzj - 1;
            char c12 = 65535;
            if (zzj <= 128) {
                byte[] bArr = new byte[zzj];
                Arrays.fill(bArr, (byte) -1);
                int i13 = 0;
                int i14 = 0;
                while (i13 < i10) {
                    int i15 = i14 + i14;
                    int i16 = i13 + i13;
                    Object obj6 = objArr3[i16];
                    obj6.getClass();
                    Object obj7 = objArr3[i16 ^ i11];
                    obj7.getClass();
                    zzrv.zzb(obj6, obj7);
                    int zzb = zzsi.zzb(obj6.hashCode());
                    while (true) {
                        int i17 = zzb & i12;
                        int i18 = bArr[i17] & 255;
                        if (i18 == 255) {
                            bArr[i17] = (byte) i15;
                            if (i14 < i13) {
                                objArr3[i15] = obj6;
                                objArr3[i15 ^ 1] = obj7;
                            }
                            i14++;
                        } else {
                            if (obj6.equals(objArr3[i18])) {
                                int i19 = i18 ^ 1;
                                Object obj8 = objArr3[i19];
                                obj8.getClass();
                                zzsp zzspVar = new zzsp(obj6, obj7, obj8);
                                objArr3[i19] = obj7;
                                obj = zzspVar;
                                break;
                            }
                            zzb = i17 + 1;
                        }
                    }
                    i13++;
                    i11 = 1;
                }
                if (i14 == i10) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i14), obj};
                    c11 = 2;
                    c10 = 1;
                }
            } else {
                if (zzj <= 32768) {
                    sArr = new short[zzj];
                    Arrays.fill(sArr, (short) -1);
                    int i20 = 0;
                    for (int i21 = 0; i21 < i10; i21++) {
                        int i22 = i20 + i20;
                        int i23 = i21 + i21;
                        Object obj9 = objArr3[i23];
                        obj9.getClass();
                        Object obj10 = objArr3[i23 ^ 1];
                        obj10.getClass();
                        zzrv.zzb(obj9, obj10);
                        int zzb2 = zzsi.zzb(obj9.hashCode());
                        while (true) {
                            int i24 = zzb2 & i12;
                            char c13 = (char) sArr[i24];
                            if (c13 == 65535) {
                                sArr[i24] = (short) i22;
                                if (i20 < i21) {
                                    objArr3[i22] = obj9;
                                    objArr3[i22 ^ 1] = obj10;
                                }
                                i20++;
                            } else {
                                if (obj9.equals(objArr3[c13])) {
                                    int i25 = c13 ^ 1;
                                    Object obj11 = objArr3[i25];
                                    obj11.getClass();
                                    zzsp zzspVar2 = new zzsp(obj9, obj10, obj11);
                                    objArr3[i25] = obj10;
                                    obj = zzspVar2;
                                    break;
                                }
                                zzb2 = i24 + 1;
                            }
                        }
                    }
                    if (i20 != i10) {
                        Integer valueOf = Integer.valueOf(i20);
                        c10 = 1;
                        c11 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i26 = 1;
                    sArr = new int[zzj];
                    Arrays.fill((int[]) sArr, -1);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < i10) {
                        int i29 = i28 + i28;
                        int i30 = i27 + i27;
                        Object obj12 = objArr3[i30];
                        obj12.getClass();
                        Object obj13 = objArr3[i30 ^ i26];
                        obj13.getClass();
                        zzrv.zzb(obj12, obj13);
                        int zzb3 = zzsi.zzb(obj12.hashCode());
                        while (true) {
                            int i31 = zzb3 & i12;
                            ?? r15 = sArr[i31];
                            if (r15 == c12) {
                                sArr[i31] = i29;
                                if (i28 < i27) {
                                    objArr3[i29] = obj12;
                                    objArr3[i29 ^ 1] = obj13;
                                }
                                i28++;
                            } else {
                                if (obj12.equals(objArr3[r15])) {
                                    int i32 = r15 ^ 1;
                                    Object obj14 = objArr3[i32];
                                    obj14.getClass();
                                    zzsp zzspVar3 = new zzsp(obj12, obj13, obj14);
                                    objArr3[i32] = obj13;
                                    obj = zzspVar3;
                                    break;
                                }
                                zzb3 = i31 + 1;
                                c12 = 65535;
                            }
                        }
                        i27++;
                        i26 = 1;
                        c12 = 65535;
                    }
                    if (i28 != i10) {
                        c10 = 1;
                        c11 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i28), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c10 = 1;
            }
            c11 = 2;
            c10 = 1;
        }
        boolean z8 = obj instanceof Object[];
        Object obj15 = obj;
        if (z8) {
            Object[] objArr4 = (Object[]) obj;
            zzsp zzspVar4 = (zzsp) objArr4[c11];
            if (zzsqVar == null) {
                throw zzspVar4.zza();
            }
            zzsqVar.zzc = zzspVar4;
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[c10]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i10 = intValue;
        }
        return new zztn(obj15, objArr3, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
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
                    int zzb = zzsi.zzb(obj.hashCode());
                    while (true) {
                        int i10 = zzb & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            obj2 = objArr[i11 ^ 1];
                            break;
                        }
                        zzb = i10 + 1;
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int zzb2 = zzsi.zzb(obj.hashCode());
                    while (true) {
                        int i12 = zzb2 & length2;
                        char c10 = (char) sArr[i12];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                            break;
                        }
                        zzb2 = i12 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int zzb3 = zzsi.zzb(obj.hashCode());
                    while (true) {
                        int i13 = zzb3 & length3;
                        int i14 = iArr[i13];
                        if (i14 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            obj2 = objArr[i14 ^ 1];
                            break;
                        }
                        zzb3 = i13 + 1;
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

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzsk zza() {
        return new zztm(this.zzb, 1, this.zzd);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzst zze() {
        return new zztk(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final zzst zzf() {
        return new zztl(this, new zztm(this.zzb, 0, this.zzd));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    public final boolean zzi() {
        return false;
    }
}
