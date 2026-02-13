package com.google.android.gms.internal.auth;

import P1.g;
import X.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i7, int i10, zzfx zzfxVar, int i11, boolean z8, int[] iArr2, int i12, int i13, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i10;
        this.zzh = iArr2;
        this.zzi = i12;
        this.zzj = i13;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i7, int i10) {
        zzhj.zzn(obj, zzl(i10) & 1048575, i7);
    }

    private final void zzB(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzo(i7) & 1048575, obj2);
        zzz(obj, i7);
    }

    private final void zzC(Object obj, int i7, int i10, Object obj2) {
        zzb.putObject(obj, zzo(i10) & 1048575, obj2);
        zzA(obj, i7, i10);
    }

    private final boolean zzD(Object obj, Object obj2, int i7) {
        return zzE(obj, i7) == zzE(obj2, i7);
    }

    private final boolean zzE(Object obj, int i7) {
        int zzl = zzl(i7);
        long j = zzl & 1048575;
        if (j != 1048575) {
            return (zzhj.zzc(obj, j) & (1 << (zzl >>> 20))) != 0;
        }
        int zzo = zzo(i7);
        long j10 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j10)) != 0;
            case 2:
                return zzhj.zzd(obj, j10) != 0;
            case 3:
                return zzhj.zzd(obj, j10) != 0;
            case 4:
                return zzhj.zzc(obj, j10) != 0;
            case 5:
                return zzhj.zzd(obj, j10) != 0;
            case 6:
                return zzhj.zzc(obj, j10) != 0;
            case 7:
                return zzhj.zzt(obj, j10);
            case g.BYTES_FIELD_NUMBER /* 8 */:
                Object zzf = zzhj.zzf(obj, j10);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzef) {
                    return !zzef.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j10) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j10));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return zzhj.zzc(obj, j10) != 0;
            case 12:
                return zzhj.zzc(obj, j10) != 0;
            case 13:
                return zzhj.zzc(obj, j10) != 0;
            case 14:
                return zzhj.zzd(obj, j10) != 0;
            case 15:
                return zzhj.zzc(obj, j10) != 0;
            case 16:
                return zzhj.zzd(obj, j10) != 0;
            case 17:
                return zzhj.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzE(obj, i7) : (i11 & i12) != 0;
    }

    private static boolean zzG(Object obj, int i7, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i7 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i7, int i10) {
        return zzhj.zzc(obj, (long) (zzl(i10) & 1048575)) == i7;
    }

    public static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzd = zzha.zzd();
        zzevVar.zzc = zzd;
        return zzd;
    }

    public static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i7;
        int charAt;
        int charAt2;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char charAt3;
        int i16;
        char charAt4;
        int i17;
        char charAt5;
        int i18;
        char charAt6;
        int i19;
        char charAt7;
        int i20;
        char charAt8;
        int i21;
        char charAt9;
        int i22;
        char charAt10;
        int i23;
        int i24;
        int i25;
        int i26;
        zzgh zzghVar;
        int i27;
        String str;
        int i28;
        int i29;
        int i30;
        int i31;
        Field zzv;
        int i32;
        char charAt11;
        int i33;
        int i34;
        Field zzv2;
        Field zzv3;
        int i35;
        char charAt12;
        int i36;
        char charAt13;
        int i37;
        char charAt14;
        int i38;
        char charAt15;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar2 = (zzgh) zzfuVar;
        String zzd = zzghVar2.zzd();
        int length = zzd.length();
        int i39 = 0;
        char c10 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i7 = i40 + 1;
                if (zzd.charAt(i40) < 55296) {
                    break;
                }
                i40 = i7;
            }
        } else {
            i7 = 1;
        }
        int i41 = i7 + 1;
        int charAt16 = zzd.charAt(i7);
        if (charAt16 >= 55296) {
            int i42 = charAt16 & 8191;
            int i43 = 13;
            while (true) {
                i38 = i41 + 1;
                charAt15 = zzd.charAt(i41);
                if (charAt15 < 55296) {
                    break;
                }
                i42 |= (charAt15 & 8191) << i43;
                i43 += 13;
                i41 = i38;
            }
            charAt16 = i42 | (charAt15 << i43);
            i41 = i38;
        }
        if (charAt16 == 0) {
            charAt = 0;
            charAt2 = 0;
            i11 = 0;
            i14 = 0;
            i10 = 0;
            i12 = 0;
            iArr = zza;
            i13 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt17 = zzd.charAt(i41);
            if (charAt17 >= 55296) {
                int i45 = charAt17 & 8191;
                int i46 = 13;
                while (true) {
                    i22 = i44 + 1;
                    charAt10 = zzd.charAt(i44);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i45 |= (charAt10 & 8191) << i46;
                    i46 += 13;
                    i44 = i22;
                }
                charAt17 = i45 | (charAt10 << i46);
                i44 = i22;
            }
            int i47 = i44 + 1;
            int charAt18 = zzd.charAt(i44);
            if (charAt18 >= 55296) {
                int i48 = charAt18 & 8191;
                int i49 = 13;
                while (true) {
                    i21 = i47 + 1;
                    charAt9 = zzd.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i21;
                }
                charAt18 = i48 | (charAt9 << i49);
                i47 = i21;
            }
            int i50 = i47 + 1;
            int charAt19 = zzd.charAt(i47);
            if (charAt19 >= 55296) {
                int i51 = charAt19 & 8191;
                int i52 = 13;
                while (true) {
                    i20 = i50 + 1;
                    charAt8 = zzd.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i20;
                }
                charAt19 = i51 | (charAt8 << i52);
                i50 = i20;
            }
            int i53 = i50 + 1;
            int charAt20 = zzd.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i19 = i53 + 1;
                    charAt7 = zzd.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i19;
                }
                charAt20 = i54 | (charAt7 << i55);
                i53 = i19;
            }
            int i56 = i53 + 1;
            charAt = zzd.charAt(i53);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i18 = i56 + 1;
                    charAt6 = zzd.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i18;
                }
                charAt = i57 | (charAt6 << i58);
                i56 = i18;
            }
            int i59 = i56 + 1;
            charAt2 = zzd.charAt(i56);
            if (charAt2 >= 55296) {
                int i60 = charAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i17 = i59 + 1;
                    charAt5 = zzd.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i17;
                }
                charAt2 = i60 | (charAt5 << i61);
                i59 = i17;
            }
            int i62 = i59 + 1;
            int charAt21 = zzd.charAt(i59);
            if (charAt21 >= 55296) {
                int i63 = charAt21 & 8191;
                int i64 = 13;
                while (true) {
                    i16 = i62 + 1;
                    charAt4 = zzd.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i16;
                }
                charAt21 = i63 | (charAt4 << i64);
                i62 = i16;
            }
            int i65 = i62 + 1;
            int charAt22 = zzd.charAt(i62);
            if (charAt22 >= 55296) {
                int i66 = charAt22 & 8191;
                int i67 = 13;
                while (true) {
                    i15 = i65 + 1;
                    charAt3 = zzd.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i66 |= (charAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i15;
                }
                charAt22 = i66 | (charAt3 << i67);
                i65 = i15;
            }
            i10 = charAt17 + charAt17 + charAt18;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i11 = charAt19;
            i12 = charAt22;
            i13 = charAt17;
            i14 = charAt20;
            i41 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzghVar2.zze();
        Class<?> cls2 = zzghVar2.zza().getClass();
        int i68 = i12 + charAt2;
        int i69 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[i69];
        int i70 = 0;
        int i71 = i12;
        int i72 = i68;
        while (i41 < length) {
            int i73 = i41 + 1;
            int charAt23 = zzd.charAt(i41);
            if (charAt23 >= c10) {
                int i74 = charAt23 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i37 = i75 + 1;
                    charAt14 = zzd.charAt(i75);
                    if (charAt14 < c10) {
                        break;
                    }
                    i74 |= (charAt14 & 8191) << i76;
                    i76 += 13;
                    i75 = i37;
                }
                charAt23 = i74 | (charAt14 << i76);
                i23 = i37;
            } else {
                i23 = i73;
            }
            int i77 = i23 + 1;
            int charAt24 = zzd.charAt(i23);
            if (charAt24 >= c10) {
                int i78 = charAt24 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i36 = i79 + 1;
                    charAt13 = zzd.charAt(i79);
                    if (charAt13 < c10) {
                        break;
                    }
                    i78 |= (charAt13 & 8191) << i80;
                    i80 += 13;
                    i79 = i36;
                }
                charAt24 = i78 | (charAt13 << i80);
                i24 = i36;
            } else {
                i24 = i77;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i70] = i39;
                i70++;
            }
            int i81 = charAt24 & 255;
            int i82 = length;
            if (i81 >= 51) {
                int i83 = i24 + 1;
                int charAt25 = zzd.charAt(i24);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i84 = 13;
                    int i85 = charAt25 & 8191;
                    int i86 = i83;
                    while (true) {
                        i35 = i86 + 1;
                        charAt12 = zzd.charAt(i86);
                        if (charAt12 < c11) {
                            break;
                        }
                        i85 |= (charAt12 & 8191) << i84;
                        i84 += 13;
                        i86 = i35;
                        c11 = 55296;
                    }
                    charAt25 = i85 | (charAt12 << i84);
                    i34 = i35;
                } else {
                    i34 = i83;
                }
                int i87 = i34;
                int i88 = i81 - 51;
                i26 = i14;
                if (i88 == 9 || i88 == 17) {
                    objArr[c.a(i39, 3, 1)] = zze[i10];
                    i10++;
                } else if (i88 == 12 && (zzghVar2.zzc() == 1 || (charAt24 & 2048) != 0)) {
                    objArr[c.a(i39, 3, 1)] = zze[i10];
                    i10++;
                }
                int i89 = charAt25 + charAt25;
                Object obj = zze[i89];
                if (obj instanceof Field) {
                    zzv2 = (Field) obj;
                } else {
                    zzv2 = zzv(cls2, (String) obj);
                    zze[i89] = zzv2;
                }
                i25 = i11;
                i31 = (int) unsafe.objectFieldOffset(zzv2);
                int i90 = i89 + 1;
                Object obj2 = zze[i90];
                if (obj2 instanceof Field) {
                    zzv3 = (Field) obj2;
                } else {
                    zzv3 = zzv(cls2, (String) obj2);
                    zze[i90] = zzv3;
                }
                zzghVar = zzghVar2;
                str = zzd;
                i30 = i10;
                i28 = i87;
                i27 = (int) unsafe.objectFieldOffset(zzv3);
                i29 = 0;
            } else {
                i25 = i11;
                i26 = i14;
                int i91 = i10 + 1;
                Field zzv4 = zzv(cls2, (String) zze[i10]);
                if (i81 == 9 || i81 == 17) {
                    zzghVar = zzghVar2;
                    objArr[c.a(i39, 3, 1)] = zzv4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        zzghVar = zzghVar2;
                        i33 = i10 + 2;
                        objArr[c.a(i39, 3, 1)] = zze[i91];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        zzghVar = zzghVar2;
                        if (zzghVar2.zzc() == 1 || (charAt24 & 2048) != 0) {
                            i33 = i10 + 2;
                            objArr[c.a(i39, 3, 1)] = zze[i91];
                        }
                    } else {
                        if (i81 == 50) {
                            int i92 = i71 + 1;
                            iArr[i71] = i39;
                            int i93 = i39 / 3;
                            int i94 = i10 + 2;
                            int i95 = i93 + i93;
                            objArr[i95] = zze[i91];
                            if ((charAt24 & 2048) != 0) {
                                i91 = i10 + 3;
                                objArr[i95 + 1] = zze[i94];
                                zzghVar = zzghVar2;
                                i71 = i92;
                            } else {
                                i71 = i92;
                                i91 = i94;
                            }
                        }
                        zzghVar = zzghVar2;
                    }
                    i91 = i33;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzv4);
                i27 = 1048575;
                if ((charAt24 & 4096) == 0 || i81 > 17) {
                    str = zzd;
                    i28 = i24;
                    i29 = 0;
                } else {
                    i28 = i24 + 1;
                    int charAt26 = zzd.charAt(i24);
                    if (charAt26 >= 55296) {
                        int i96 = charAt26 & 8191;
                        int i97 = 13;
                        while (true) {
                            i32 = i28 + 1;
                            charAt11 = zzd.charAt(i28);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i96 |= (charAt11 & 8191) << i97;
                            i97 += 13;
                            i28 = i32;
                        }
                        charAt26 = i96 | (charAt11 << i97);
                        i28 = i32;
                    }
                    int i98 = (charAt26 / 32) + i13 + i13;
                    Object obj3 = zze[i98];
                    str = zzd;
                    if (obj3 instanceof Field) {
                        zzv = (Field) obj3;
                    } else {
                        zzv = zzv(cls2, (String) obj3);
                        zze[i98] = zzv;
                    }
                    i29 = charAt26 % 32;
                    i27 = (int) unsafe.objectFieldOffset(zzv);
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i72] = objectFieldOffset;
                    i72++;
                }
                i30 = i91;
                i31 = objectFieldOffset;
            }
            int i99 = i39 + 1;
            iArr2[i39] = charAt23;
            int i100 = i39 + 2;
            int i101 = i30;
            iArr2[i99] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i81 << 20) | i31;
            i39 += 3;
            iArr2[i100] = (i29 << 20) | i27;
            i41 = i28;
            i10 = i101;
            length = i82;
            zzghVar2 = zzghVar;
            zzd = str;
            i14 = i26;
            i11 = i25;
            c10 = 55296;
        }
        zzgh zzghVar3 = zzghVar2;
        return new zzga(iArr2, objArr, i11, i14, zzghVar3.zza(), zzghVar3.zzc(), false, iArr, i12, i68, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j) {
        return ((Integer) zzhj.zzf(obj, j)).intValue();
    }

    private final int zzl(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzm(int i7, int i10) {
        int length = (this.zzc.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.zzc[i12];
            if (i7 == i13) {
                return i12;
            }
            if (i7 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzo(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzhj.zzf(obj, j)).longValue();
    }

    private final zzey zzq(int i7) {
        int i10 = i7 / 3;
        return (zzey) this.zzd[i10 + i10 + 1];
    }

    private final zzgi zzr(int i7) {
        int i10 = i7 / 3;
        int i11 = i10 + i10;
        zzgi zzgiVar = (zzgi) this.zzd[i11];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzb2 = zzgf.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzb2;
        return zzb2;
    }

    private final Object zzs(int i7) {
        int i10 = i7 / 3;
        return this.zzd[i10 + i10];
    }

    private final Object zzt(Object obj, int i7) {
        zzgi zzr = zzr(i7);
        int zzo = zzo(i7) & 1048575;
        if (!zzE(obj, i7)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private final Object zzu(Object obj, int i7, int i10) {
        zzgi zzr = zzr(i10);
        if (!zzI(obj, i7, i10)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i10) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder o10 = A3.c.o("Field ", str, " for ", name, " not found. Known fields are ");
            o10.append(arrays);
            throw new RuntimeException(o10.toString());
        }
    }

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i7) {
        if (zzE(obj2, i7)) {
            int zzo = zzo(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i7);
            if (!zzE(obj, i7)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j, zzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzz(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i7) {
        int i10 = this.zzc[i7];
        if (zzI(obj2, i10, i7)) {
            int zzo = zzo(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i7);
            if (!zzI(obj, i10, i7)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j, zzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzA(obj, i10, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i7) {
        int zzl = zzl(i7);
        long j = 1048575 & zzl;
        if (j == 1048575) {
            return;
        }
        zzhj.zzn(obj, j, (1 << (zzl >>> 20)) | zzhj.zzc(obj, j));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i7;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzo = zzo(i12);
            int i13 = this.zzc[i12];
            long j = 1048575 & zzo;
            int i14 = 37;
            switch (zzn(zzo)) {
                case 0:
                    i7 = i11 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j));
                    byte[] bArr = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j));
                    i11 = floatToIntBits + i10;
                    break;
                case 2:
                    i7 = i11 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr2 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 3:
                    i7 = i11 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr3 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 4:
                    i7 = i11 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 5:
                    i7 = i11 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr4 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 6:
                    i7 = i11 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    floatToIntBits = zzfa.zza(zzhj.zzt(obj, j));
                    i11 = floatToIntBits + i10;
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    i10 = i11 * 53;
                    floatToIntBits = ((String) zzhj.zzf(obj, j)).hashCode();
                    i11 = floatToIntBits + i10;
                    break;
                case 9:
                    Object zzf = zzhj.zzf(obj, j);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i11 = floatToIntBits + i10;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i7 = i11 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 12:
                    i7 = i11 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 13:
                    i7 = i11 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 14:
                    i7 = i11 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr5 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 15:
                    i7 = i11 * 53;
                    zzc = zzhj.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 16:
                    i7 = i11 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr6 = zzfa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzhj.zzf(obj, j);
                    if (zzf2 != null) {
                        i14 = zzf2.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i11 = floatToIntBits + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i11 = floatToIntBits + i10;
                    break;
                case 51:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j)).floatValue());
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzk(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzk(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j)).booleanValue());
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = ((String) zzhj.zzf(obj, j)).hashCode();
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzk(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzk(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzk(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzk(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzI(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzfa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzl.zzb(obj).hashCode() + (i11 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:283:0x07e3, code lost:
    
        r39 = r17;
        r12 = r8;
        r10 = true;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0e27, code lost:
    
        if (r11 == r9) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0e29, code lost:
    
        r37.putInt(r7, r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e2f, code lost:
    
        r2 = r41.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0e35, code lost:
    
        if (r2 >= r41.zzj) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0e37, code lost:
    
        r4 = r41.zzh[r2];
        r5 = r41.zzc[r4];
        r5 = com.google.android.gms.internal.auth.zzhj.zzf(r7, zzo(r4) & r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0e49, code lost:
    
        if (r5 != null) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0e54, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0e51, code lost:
    
        if (zzq(r4) != null) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0e56, code lost:
    
        r5 = (com.google.android.gms.internal.auth.zzfr) r5;
        r0 = (com.google.android.gms.internal.auth.zzfq) zzs(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0e5e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0e5f, code lost:
    
        if (r12 != 0) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0e61, code lost:
    
        if (r8 != r0) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e68, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0e6d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0e69, code lost:
    
        if (r8 > r0) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0e6b, code lost:
    
        if (r3 != r12) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0e72, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:158:0x05a2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0b9e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:529:0x00b5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0dc3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0ddd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0056 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(Object obj, byte[] bArr, int i7, int i10, int i11, zzdt zzdtVar) {
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int zzm;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Unsafe unsafe2;
        int i26;
        int i27;
        int i28;
        zzdt zzdtVar2;
        boolean z8;
        int i29;
        int i30;
        boolean z10;
        int zzh;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        Object obj2;
        int i45;
        int i46;
        zzdt zzdtVar3;
        int i47;
        int i48;
        boolean z11;
        int i49;
        int i50;
        zzdt zzdtVar4;
        int i51;
        Object obj3;
        int i52;
        int zzj;
        int i53;
        int i54;
        int i55;
        boolean z12;
        int i56;
        int i57;
        int i58;
        int i59;
        char c10;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        zzga<T> zzgaVar = this;
        Object obj4 = obj;
        int i65 = i10;
        zzdt zzdtVar5 = zzdtVar;
        int i66 = 3;
        zzw(obj);
        Unsafe unsafe3 = zzb;
        int i67 = 0;
        int i68 = -1;
        int i69 = 1048575;
        int i70 = i7;
        int i71 = 1048575;
        int i72 = -1;
        int i73 = 0;
        int i74 = 0;
        int i75 = 0;
        while (true) {
            if (i70 < i65) {
                int i76 = i70 + 1;
                int i77 = bArr[i70];
                if (i77 < 0) {
                    i76 = zzdu.zzi(i77, bArr, i76, zzdtVar5);
                    i77 = zzdtVar5.zza;
                }
                i75 = i77;
                int i78 = i75 >>> 3;
                if (i78 > i72) {
                    zzm = (i78 < zzgaVar.zze || i78 > zzgaVar.zzf) ? i68 : zzgaVar.zzm(i78, i73 / i66);
                } else if (i78 < zzgaVar.zze || i78 > zzgaVar.zzf) {
                    i73 = i68;
                    if (i73 != i68) {
                        unsafe = unsafe3;
                        i17 = i66;
                        i18 = i71;
                        i19 = i68;
                        i73 = i67;
                        i20 = i73;
                        i16 = i75;
                        i21 = i11;
                        i22 = i78;
                    } else {
                        int i79 = i75 & 7;
                        int[] iArr = zzgaVar.zzc;
                        int i80 = iArr[i73 + 1];
                        int zzn = zzn(i80);
                        long j = i80 & i69;
                        if (zzn <= 17) {
                            int i81 = iArr[i73 + 2];
                            int i82 = 1 << (i81 >>> 20);
                            int i83 = 1048575;
                            int i84 = i81 & 1048575;
                            if (i84 != i71) {
                                if (i71 != 1048575) {
                                    unsafe3.putInt(obj4, i71, i74);
                                    i83 = 1048575;
                                }
                                i25 = i84;
                                i24 = i84 == i83 ? 0 : unsafe3.getInt(obj4, i84);
                            } else {
                                i24 = i74;
                                i25 = i71;
                            }
                            switch (zzn) {
                                case 0:
                                    unsafe2 = unsafe3;
                                    i26 = i76;
                                    i27 = i78;
                                    i28 = i75;
                                    z8 = true;
                                    i19 = -1;
                                    i20 = 0;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 1) {
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        zzhj.zzl(obj4, j, Double.longBitsToDouble(zzdu.zzn(bArr, i26)));
                                        i29 = i26 + 8;
                                        i72 = i27;
                                        i75 = i28;
                                        i68 = i19;
                                        i67 = i20;
                                        i66 = 3;
                                        i69 = 1048575;
                                        i65 = i10;
                                        zzdt zzdtVar6 = zzdtVar2;
                                        i70 = i29;
                                        unsafe3 = unsafe2;
                                        i71 = i25;
                                        i74 = i24 | i82;
                                        zzdtVar5 = zzdtVar6;
                                        break;
                                    }
                                case 1:
                                    unsafe2 = unsafe3;
                                    i26 = i76;
                                    i27 = i78;
                                    i28 = i75;
                                    z8 = true;
                                    i19 = -1;
                                    i20 = 0;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 5) {
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        zzhj.zzm(obj4, j, Float.intBitsToFloat(zzdu.zzb(bArr, i26)));
                                        i29 = i26 + 4;
                                        i72 = i27;
                                        i75 = i28;
                                        i68 = i19;
                                        i67 = i20;
                                        i66 = 3;
                                        i69 = 1048575;
                                        i65 = i10;
                                        zzdt zzdtVar62 = zzdtVar2;
                                        i70 = i29;
                                        unsafe3 = unsafe2;
                                        i71 = i25;
                                        i74 = i24 | i82;
                                        zzdtVar5 = zzdtVar62;
                                        break;
                                    }
                                case 2:
                                case 3:
                                    unsafe2 = unsafe3;
                                    i26 = i76;
                                    i28 = i75;
                                    i19 = -1;
                                    i20 = 0;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 0) {
                                        i27 = i78;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        int zzk = zzdu.zzk(bArr, i26, zzdtVar2);
                                        unsafe2.putLong(obj, j, zzdtVar2.zzb);
                                        i30 = i24 | i82;
                                        i65 = i10;
                                        zzdtVar5 = zzdtVar2;
                                        i70 = zzk;
                                        i75 = i28;
                                        i72 = i78;
                                        i68 = -1;
                                        i67 = 0;
                                        i66 = 3;
                                        i69 = 1048575;
                                        int i85 = i25;
                                        i74 = i30;
                                        unsafe3 = unsafe2;
                                        i71 = i85;
                                        break;
                                    }
                                case 4:
                                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                    unsafe2 = unsafe3;
                                    i26 = i76;
                                    i28 = i75;
                                    z10 = true;
                                    i19 = -1;
                                    i20 = 0;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 0) {
                                        i27 = i78;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        zzh = zzdu.zzh(bArr, i26, zzdtVar2);
                                        unsafe2.putInt(obj4, j, zzdtVar2.zza);
                                        i31 = i24 | i82;
                                        i75 = i28;
                                        i72 = i78;
                                        zzdtVar5 = zzdtVar2;
                                        i68 = -1;
                                        i67 = 0;
                                        i69 = 1048575;
                                        i65 = i10;
                                        i70 = zzh;
                                        unsafe3 = unsafe2;
                                        i71 = i25;
                                        i74 = i31;
                                        i66 = 3;
                                        break;
                                    }
                                case 5:
                                case 14:
                                    unsafe2 = unsafe3;
                                    z10 = true;
                                    i19 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 1) {
                                        i26 = i76;
                                        i20 = 0;
                                        i27 = i78;
                                        i28 = i75;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        unsafe2.putLong(obj, j, zzdu.zzn(bArr, i76));
                                        i65 = i10;
                                        zzdtVar5 = zzdtVar2;
                                        i67 = 0;
                                        i66 = 3;
                                        i69 = 1048575;
                                        i70 = i76 + 8;
                                        unsafe3 = unsafe2;
                                        i71 = i25;
                                        i74 = i24 | i82;
                                        i72 = i78;
                                        i68 = -1;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    unsafe2 = unsafe3;
                                    i32 = i78;
                                    i33 = 3;
                                    i19 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 5) {
                                        i26 = i76;
                                        i27 = i32;
                                        i28 = i75;
                                        i20 = 0;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj4, j, zzdu.zzb(bArr, i76));
                                        i34 = i76 + 4;
                                        i35 = i24 | i82;
                                        i66 = i33;
                                        i72 = i32;
                                        zzdtVar5 = zzdtVar2;
                                        i68 = i19;
                                        i69 = 1048575;
                                        i67 = 0;
                                        i65 = i10;
                                        i70 = i34;
                                        unsafe3 = unsafe2;
                                        i71 = i25;
                                        i74 = i35;
                                        break;
                                    }
                                case 7:
                                    unsafe2 = unsafe3;
                                    i32 = i78;
                                    i33 = 3;
                                    i19 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 0) {
                                        i20 = 0;
                                        i26 = i76;
                                        i27 = i32;
                                        i28 = i75;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        i34 = zzdu.zzk(bArr, i76, zzdtVar2);
                                        zzhj.zzk(obj4, j, zzdtVar2.zzb != 0);
                                        i35 = i24 | i82;
                                        i66 = i33;
                                        i72 = i32;
                                        zzdtVar5 = zzdtVar2;
                                        i68 = i19;
                                        i69 = 1048575;
                                        i67 = 0;
                                        i65 = i10;
                                        i70 = i34;
                                        unsafe3 = unsafe2;
                                        i71 = i25;
                                        i74 = i35;
                                        break;
                                    }
                                case g.BYTES_FIELD_NUMBER /* 8 */:
                                    unsafe2 = unsafe3;
                                    i28 = i75;
                                    i19 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 2) {
                                        i26 = i76;
                                        i27 = i78;
                                        i20 = 0;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        if ((i80 & 536870912) != 0) {
                                            i34 = zzdu.zzh(bArr, i76, zzdtVar2);
                                            int i86 = zzdtVar2.zza;
                                            if (i86 < 0) {
                                                throw zzfb.zzc();
                                            }
                                            if (i86 == 0) {
                                                zzdtVar2.zzc = "";
                                                i75 = i28;
                                                i36 = 0;
                                                i37 = 3;
                                            } else {
                                                int i87 = zzhn.zza;
                                                int length = bArr.length;
                                                if ((((length - i34) - i86) | i34 | i86) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i34), Integer.valueOf(i86)));
                                                }
                                                int i88 = i34 + i86;
                                                char[] cArr = new char[i86];
                                                int i89 = 0;
                                                while (i34 < i88) {
                                                    byte b2 = bArr[i34];
                                                    if (zzhk.zzd(b2)) {
                                                        i34++;
                                                        cArr[i89] = (char) b2;
                                                        i89++;
                                                    } else {
                                                        while (i34 < i88) {
                                                            int i90 = i34 + 1;
                                                            byte b10 = bArr[i34];
                                                            if (zzhk.zzd(b10)) {
                                                                cArr[i89] = (char) b10;
                                                                i89++;
                                                                i34 = i90;
                                                                while (i34 < i88) {
                                                                    byte b11 = bArr[i34];
                                                                    if (zzhk.zzd(b11)) {
                                                                        i34++;
                                                                        cArr[i89] = (char) b11;
                                                                        i89++;
                                                                    }
                                                                }
                                                            } else {
                                                                int i91 = i28;
                                                                if (b10 < -32) {
                                                                    if (i90 >= i88) {
                                                                        throw zzfb.zzb();
                                                                    }
                                                                    i34 += 2;
                                                                    i38 = i89 + 1;
                                                                    zzhk.zzc(b10, bArr[i90], cArr, i89);
                                                                } else if (b10 < -16) {
                                                                    if (i90 >= i88 - 1) {
                                                                        throw zzfb.zzb();
                                                                    }
                                                                    int i92 = i34 + 2;
                                                                    i34 += 3;
                                                                    i38 = i89 + 1;
                                                                    zzhk.zzb(b10, bArr[i90], bArr[i92], cArr, i89);
                                                                } else {
                                                                    if (i90 >= i88 - 2) {
                                                                        throw zzfb.zzb();
                                                                    }
                                                                    byte b12 = bArr[i90];
                                                                    int i93 = i34 + 3;
                                                                    byte b13 = bArr[i34 + 2];
                                                                    i34 += 4;
                                                                    zzhk.zza(b10, b12, b13, bArr[i93], cArr, i89);
                                                                    i89 += 2;
                                                                    i28 = i91;
                                                                }
                                                                i28 = i91;
                                                                i89 = i38;
                                                            }
                                                        }
                                                        i75 = i28;
                                                        i37 = 3;
                                                        i36 = 0;
                                                        zzdtVar2.zzc = new String(cArr, 0, i89);
                                                        i34 = i88;
                                                    }
                                                }
                                                while (i34 < i88) {
                                                }
                                                i75 = i28;
                                                i37 = 3;
                                                i36 = 0;
                                                zzdtVar2.zzc = new String(cArr, 0, i89);
                                                i34 = i88;
                                            }
                                        } else {
                                            i75 = i28;
                                            i36 = 0;
                                            i37 = 3;
                                            i34 = zzdu.zzh(bArr, i76, zzdtVar2);
                                            int i94 = zzdtVar2.zza;
                                            if (i94 < 0) {
                                                throw zzfb.zzc();
                                            }
                                            if (i94 == 0) {
                                                zzdtVar2.zzc = "";
                                            } else {
                                                zzdtVar2.zzc = new String(bArr, i34, i94, zzfa.zzb);
                                                i34 += i94;
                                            }
                                        }
                                        unsafe2.putObject(obj4, j, zzdtVar2.zzc);
                                        i35 = i24 | i82;
                                        i67 = i36;
                                        i66 = i37;
                                        i72 = i78;
                                        zzdtVar5 = zzdtVar2;
                                        i68 = -1;
                                        i69 = 1048575;
                                        i65 = i10;
                                        i70 = i34;
                                        unsafe3 = unsafe2;
                                        i71 = i25;
                                        i74 = i35;
                                        break;
                                    }
                                    break;
                                case 9:
                                    unsafe2 = unsafe3;
                                    i39 = i78;
                                    i40 = i75;
                                    z10 = true;
                                    i19 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 2) {
                                        i26 = i76;
                                        i27 = i39;
                                        i28 = i40;
                                        i20 = 0;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        Object zzt = zzgaVar.zzt(obj4, i73);
                                        i65 = i10;
                                        int zzm2 = zzdu.zzm(zzt, zzgaVar.zzr(i73), bArr, i76, i65, zzdtVar);
                                        zzgaVar.zzB(obj4, i73, zzt);
                                        zzdtVar5 = zzdtVar2;
                                        i72 = i39;
                                        i75 = i40;
                                        i68 = -1;
                                        i66 = 3;
                                        i67 = 0;
                                        i70 = zzm2;
                                        unsafe3 = unsafe2;
                                        i71 = i25;
                                        i74 = i24 | i82;
                                        i69 = 1048575;
                                        break;
                                    }
                                case 10:
                                    unsafe2 = unsafe3;
                                    i39 = i78;
                                    i40 = i75;
                                    z10 = true;
                                    i19 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 2) {
                                        i26 = i76;
                                        i27 = i39;
                                        i28 = i40;
                                        i20 = 0;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        int zza2 = zzdu.zza(bArr, i76, zzdtVar2);
                                        unsafe2.putObject(obj4, j, zzdtVar2.zzc);
                                        i72 = i39;
                                        i75 = i40;
                                        zzdtVar5 = zzdtVar2;
                                        unsafe3 = unsafe2;
                                        i71 = i25;
                                        i68 = -1;
                                        i69 = 1048575;
                                        i67 = 0;
                                        i65 = i10;
                                        i70 = zza2;
                                        i74 = i24 | i82;
                                        i66 = 3;
                                        break;
                                    }
                                case 12:
                                    unsafe2 = unsafe3;
                                    i39 = i78;
                                    i40 = i75;
                                    z10 = true;
                                    i19 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 0) {
                                        i26 = i76;
                                        i27 = i39;
                                        i28 = i40;
                                        i20 = 0;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        zzh = zzdu.zzh(bArr, i76, zzdtVar2);
                                        int i95 = zzdtVar2.zza;
                                        zzey zzq = zzgaVar.zzq(i73);
                                        if ((Integer.MIN_VALUE & i80) != 0 && zzq != null && !zzq.zza()) {
                                            zzc(obj).zzh(i40, Long.valueOf(i95));
                                            i72 = i39;
                                            i75 = i40;
                                            zzdtVar5 = zzdtVar2;
                                            i68 = -1;
                                            i66 = 3;
                                            i69 = 1048575;
                                            i67 = 0;
                                            i65 = i10;
                                            i70 = zzh;
                                            unsafe3 = unsafe2;
                                            i71 = i25;
                                            i74 = i24;
                                            break;
                                        } else {
                                            unsafe2.putInt(obj4, j, i95);
                                            i31 = i24 | i82;
                                            i72 = i39;
                                            i75 = i40;
                                            zzdtVar5 = zzdtVar2;
                                            i68 = -1;
                                            i69 = 1048575;
                                            i67 = 0;
                                            i65 = i10;
                                            i70 = zzh;
                                            unsafe3 = unsafe2;
                                            i71 = i25;
                                            i74 = i31;
                                            i66 = 3;
                                            break;
                                        }
                                    }
                                    break;
                                case 15:
                                    unsafe2 = unsafe3;
                                    i19 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 0) {
                                        i20 = 0;
                                        i26 = i76;
                                        i27 = i78;
                                        i28 = i75;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        int zzh2 = zzdu.zzh(bArr, i76, zzdtVar2);
                                        unsafe2.putInt(obj4, j, zzej.zzb(zzdtVar2.zza));
                                        i72 = i78;
                                        i75 = i75;
                                        zzdtVar5 = zzdtVar2;
                                        i68 = -1;
                                        i66 = 3;
                                        i69 = 1048575;
                                        i65 = i10;
                                        i70 = zzh2;
                                        unsafe3 = unsafe2;
                                        i71 = i25;
                                        i74 = i24 | i82;
                                        i67 = 0;
                                        break;
                                    }
                                case 16:
                                    int i96 = i73;
                                    i19 = -1;
                                    zzdtVar2 = zzdtVar;
                                    if (i79 != 0) {
                                        unsafe2 = unsafe3;
                                        i73 = i96;
                                        i26 = i76;
                                        i27 = i78;
                                        i28 = i75;
                                        i20 = 0;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        int zzk2 = zzdu.zzk(bArr, i76, zzdtVar2);
                                        unsafe2 = unsafe3;
                                        i73 = i96;
                                        unsafe3.putLong(obj, j, zzej.zzc(zzdtVar2.zzb));
                                        i30 = i24 | i82;
                                        i65 = i10;
                                        zzdtVar5 = zzdtVar2;
                                        i70 = zzk2;
                                        i72 = i78;
                                        i68 = -1;
                                        i66 = 3;
                                        i69 = 1048575;
                                        i67 = 0;
                                        int i852 = i25;
                                        i74 = i30;
                                        unsafe3 = unsafe2;
                                        i71 = i852;
                                        break;
                                    }
                                default:
                                    i66 = 3;
                                    if (i79 != 3) {
                                        i19 = -1;
                                        unsafe2 = unsafe3;
                                        i26 = i76;
                                        i27 = i78;
                                        i28 = i75;
                                        i20 = 0;
                                        zzdtVar2 = zzdtVar;
                                        i21 = i11;
                                        i16 = i28;
                                        unsafe = unsafe2;
                                        i18 = i25;
                                        i74 = i24;
                                        i17 = 3;
                                        i22 = i27;
                                        i76 = i26;
                                        break;
                                    } else {
                                        Object zzt2 = zzgaVar.zzt(obj4, i73);
                                        int i97 = i73;
                                        i70 = zzdu.zzl(zzt2, zzgaVar.zzr(i73), bArr, i76, i10, (i78 << 3) | 4, zzdtVar);
                                        zzgaVar.zzB(obj4, i97, zzt2);
                                        i69 = 1048575;
                                        i72 = i78;
                                        i73 = i97;
                                        i71 = i25;
                                        i68 = -1;
                                        i67 = 0;
                                        i65 = i10;
                                        zzdtVar5 = zzdtVar;
                                        i74 = i24 | i82;
                                        break;
                                    }
                            }
                        } else {
                            i19 = -1;
                            i20 = 0;
                            int i98 = i78;
                            zzdt zzdtVar7 = zzdtVar5;
                            Unsafe unsafe4 = unsafe3;
                            int i99 = i76;
                            if (zzn != 27) {
                                i18 = i71;
                                int i100 = i73;
                                if (zzn > 49) {
                                    i41 = i99;
                                    unsafe = unsafe4;
                                    i42 = i100;
                                    i43 = i98;
                                    i44 = i75;
                                    zzdt zzdtVar8 = zzdtVar7;
                                    if (zzn != 50) {
                                        obj4 = obj;
                                        Unsafe unsafe5 = zzb;
                                        long j10 = iArr[i42 + 2] & 1048575;
                                        switch (zzn) {
                                            case 51:
                                                i60 = i42;
                                                i16 = i44;
                                                i61 = i41;
                                                i22 = i43;
                                                i17 = 3;
                                                i21 = i11;
                                                if (i79 == 1) {
                                                    unsafe5.putObject(obj4, j, Double.valueOf(Double.longBitsToDouble(zzdu.zzn(bArr, i61))));
                                                    i62 = i61 + 8;
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    i70 = i62;
                                                    if (i70 != i61) {
                                                        i76 = i70;
                                                        i73 = i60;
                                                        break;
                                                    } else {
                                                        zzgaVar = this;
                                                        zzdtVar5 = zzdtVar8;
                                                        i72 = i22;
                                                        i73 = i60;
                                                        i68 = -1;
                                                        i67 = 0;
                                                        i71 = i18;
                                                        unsafe3 = unsafe;
                                                        i69 = 1048575;
                                                        i65 = i10;
                                                        i75 = i16;
                                                        i66 = i17;
                                                        break;
                                                    }
                                                }
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                            case 52:
                                                i60 = i42;
                                                i16 = i44;
                                                i61 = i41;
                                                i22 = i43;
                                                i17 = 3;
                                                i21 = i11;
                                                if (i79 == 5) {
                                                    unsafe5.putObject(obj4, j, Float.valueOf(Float.intBitsToFloat(zzdu.zzb(bArr, i61))));
                                                    i62 = i61 + 4;
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    i70 = i62;
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i60 = i42;
                                                i16 = i44;
                                                i61 = i41;
                                                i22 = i43;
                                                i17 = 3;
                                                i21 = i11;
                                                if (i79 == 0) {
                                                    i70 = zzdu.zzk(bArr, i61, zzdtVar8);
                                                    unsafe5.putObject(obj4, j, Long.valueOf(zzdtVar8.zzb));
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i60 = i42;
                                                i16 = i44;
                                                i61 = i41;
                                                i22 = i43;
                                                i17 = 3;
                                                i21 = i11;
                                                if (i79 == 0) {
                                                    i70 = zzdu.zzh(bArr, i61, zzdtVar8);
                                                    unsafe5.putObject(obj4, j, Integer.valueOf(zzdtVar8.zza));
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i60 = i42;
                                                i16 = i44;
                                                i61 = i41;
                                                i22 = i43;
                                                i17 = 3;
                                                i21 = i11;
                                                if (i79 == 1) {
                                                    unsafe5.putObject(obj4, j, Long.valueOf(zzdu.zzn(bArr, i61)));
                                                    i70 = i61 + 8;
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i60 = i42;
                                                i16 = i44;
                                                i61 = i41;
                                                i22 = i43;
                                                i17 = 3;
                                                i21 = i11;
                                                if (i79 == 5) {
                                                    unsafe5.putObject(obj4, j, Integer.valueOf(zzdu.zzb(bArr, i61)));
                                                    i63 = i61 + 4;
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    i70 = i63;
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 58:
                                                i60 = i42;
                                                i16 = i44;
                                                i61 = i41;
                                                i22 = i43;
                                                i17 = 3;
                                                i21 = i11;
                                                if (i79 == 0) {
                                                    i63 = zzdu.zzk(bArr, i61, zzdtVar8);
                                                    unsafe5.putObject(obj4, j, Boolean.valueOf(zzdtVar8.zzb != 0));
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    i70 = i63;
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 59:
                                                i60 = i42;
                                                i16 = i44;
                                                i61 = i41;
                                                i22 = i43;
                                                i17 = 3;
                                                i21 = i11;
                                                if (i79 == 2) {
                                                    int zzh3 = zzdu.zzh(bArr, i61, zzdtVar8);
                                                    int i101 = zzdtVar8.zza;
                                                    if (i101 == 0) {
                                                        unsafe5.putObject(obj4, j, "");
                                                    } else {
                                                        if ((i80 & 536870912) != 0 && !zzhn.zzc(bArr, zzh3, zzh3 + i101)) {
                                                            throw zzfb.zzb();
                                                        }
                                                        unsafe5.putObject(obj4, j, new String(bArr, zzh3, i101, zzfa.zzb));
                                                        zzh3 += i101;
                                                    }
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    i70 = zzh3;
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 60:
                                                i64 = i41;
                                                i22 = i43;
                                                if (i79 == 2) {
                                                    Object zzu = zzgaVar.zzu(obj4, i22, i42);
                                                    zzgi zzr = zzgaVar.zzr(i42);
                                                    i17 = 3;
                                                    i61 = i64;
                                                    int zzm3 = zzdu.zzm(zzu, zzr, bArr, i61, i10, zzdtVar);
                                                    zzgaVar.zzC(obj4, i22, i42, zzu);
                                                    i21 = i11;
                                                    zzdtVar8 = zzdtVar;
                                                    i70 = zzm3;
                                                    i60 = i42;
                                                    i16 = i44;
                                                    if (i70 != i61) {
                                                    }
                                                } else {
                                                    i17 = 3;
                                                    zzdtVar8 = zzdtVar;
                                                    i60 = i42;
                                                    i61 = i64;
                                                    i16 = i44;
                                                    i21 = i11;
                                                    i70 = i61;
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                i64 = i41;
                                                i22 = i43;
                                                if (i79 == 2) {
                                                    int zza3 = zzdu.zza(bArr, i64, zzdtVar8);
                                                    unsafe5.putObject(obj4, j, zzdtVar8.zzc);
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    i60 = i42;
                                                    i70 = zza3;
                                                    i17 = 3;
                                                    i61 = i64;
                                                    i16 = i44;
                                                    i21 = i11;
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i60 = i42;
                                                i17 = 3;
                                                i61 = i64;
                                                i16 = i44;
                                                i21 = i11;
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 63:
                                                i64 = i41;
                                                i22 = i43;
                                                if (i79 == 0) {
                                                    i70 = zzdu.zzh(bArr, i64, zzdtVar8);
                                                    int i102 = zzdtVar8.zza;
                                                    zzey zzq2 = zzgaVar.zzq(i42);
                                                    if (zzq2 == null || zzq2.zza()) {
                                                        unsafe5.putObject(obj4, j, Integer.valueOf(i102));
                                                        unsafe5.putInt(obj4, j10, i22);
                                                    } else {
                                                        zzc(obj).zzh(i44, Long.valueOf(i102));
                                                    }
                                                    i60 = i42;
                                                    i17 = 3;
                                                    i61 = i64;
                                                    i16 = i44;
                                                    i21 = i11;
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i60 = i42;
                                                i17 = 3;
                                                i61 = i64;
                                                i16 = i44;
                                                i21 = i11;
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 66:
                                                i64 = i41;
                                                i22 = i43;
                                                if (i79 == 0) {
                                                    i70 = zzdu.zzh(bArr, i64, zzdtVar8);
                                                    unsafe5.putObject(obj4, j, Integer.valueOf(zzej.zzb(zzdtVar8.zza)));
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    i60 = i42;
                                                    i17 = 3;
                                                    i61 = i64;
                                                    i16 = i44;
                                                    i21 = i11;
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i60 = i42;
                                                i17 = 3;
                                                i61 = i64;
                                                i16 = i44;
                                                i21 = i11;
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 67:
                                                i64 = i41;
                                                i22 = i43;
                                                if (i79 == 0) {
                                                    int zzk3 = zzdu.zzk(bArr, i64, zzdtVar8);
                                                    unsafe5.putObject(obj4, j, Long.valueOf(zzej.zzc(zzdtVar8.zzb)));
                                                    unsafe5.putInt(obj4, j10, i22);
                                                    i70 = zzk3;
                                                    i60 = i42;
                                                    i17 = 3;
                                                    i61 = i64;
                                                    i16 = i44;
                                                    i21 = i11;
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                i60 = i42;
                                                i17 = 3;
                                                i61 = i64;
                                                i16 = i44;
                                                i21 = i11;
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                            case 68:
                                                if (i79 == 3) {
                                                    Object zzu2 = zzgaVar.zzu(obj4, i43, i42);
                                                    i64 = i41;
                                                    i70 = zzdu.zzl(zzu2, zzgaVar.zzr(i42), bArr, i41, i10, (i44 & (-8)) | 4, zzdtVar);
                                                    zzgaVar.zzC(obj4, i43, i42, zzu2);
                                                    i22 = i43;
                                                    i60 = i42;
                                                    i17 = 3;
                                                    i61 = i64;
                                                    i16 = i44;
                                                    i21 = i11;
                                                    if (i70 != i61) {
                                                    }
                                                }
                                                break;
                                            default:
                                                i60 = i42;
                                                i16 = i44;
                                                i61 = i41;
                                                i22 = i43;
                                                i17 = 3;
                                                i21 = i11;
                                                i70 = i61;
                                                if (i70 != i61) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i79 == 2) {
                                            Unsafe unsafe6 = zzb;
                                            Object zzs = zzgaVar.zzs(i42);
                                            Object object = unsafe6.getObject(obj, j);
                                            if (!((zzfr) object).zze()) {
                                                zzfr zzb2 = zzfr.zza().zzb();
                                                zzfs.zza(zzb2, object);
                                                unsafe6.putObject(obj, j, zzb2);
                                            }
                                            throw null;
                                        }
                                        obj4 = obj;
                                        i73 = i42;
                                        i16 = i44;
                                        i76 = i41;
                                    }
                                } else {
                                    long j11 = i80;
                                    Unsafe unsafe7 = zzb;
                                    zzez zzezVar = (zzez) unsafe7.getObject(obj4, j);
                                    if (zzezVar.zzc()) {
                                        obj2 = "";
                                    } else {
                                        int size = zzezVar.size();
                                        obj2 = "";
                                        zzezVar = zzezVar.zzd(size != 0 ? size + size : 10);
                                        unsafe7.putObject(obj4, j, zzezVar);
                                    }
                                    zzez zzezVar2 = zzezVar;
                                    switch (zzn) {
                                        case 18:
                                        case 35:
                                            i45 = i75;
                                            i46 = i100;
                                            zzdtVar3 = zzdtVar7;
                                            i47 = i10;
                                            i43 = i98;
                                            i48 = i99;
                                            unsafe = unsafe4;
                                            z11 = true;
                                            if (i79 == 2) {
                                                zzek zzekVar = (zzek) zzezVar2;
                                                i23 = zzdu.zzh(bArr, i48, zzdtVar3);
                                                int i103 = zzdtVar3.zza + i23;
                                                while (i23 < i103) {
                                                    zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, i23)));
                                                    i23 += 8;
                                                }
                                                if (i23 != i103) {
                                                    throw zzfb.zzf();
                                                }
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                    i76 = i23;
                                                    i16 = i45;
                                                    i73 = i46;
                                                    break;
                                                } else {
                                                    i75 = i45;
                                                    i65 = i47;
                                                    zzdtVar5 = zzdtVar3;
                                                    i73 = i46;
                                                    i68 = -1;
                                                    i67 = 0;
                                                    i71 = i18;
                                                    i72 = i43;
                                                    i66 = 3;
                                                    i69 = 1048575;
                                                    i70 = i23;
                                                    unsafe3 = unsafe;
                                                    break;
                                                }
                                            } else {
                                                if (i79 == 1) {
                                                    zzek zzekVar2 = (zzek) zzezVar2;
                                                    zzekVar2.zze(Double.longBitsToDouble(zzdu.zzn(bArr, i48)));
                                                    i49 = i48 + 8;
                                                    while (i49 < i47) {
                                                        int zzh4 = zzdu.zzh(bArr, i49, zzdtVar3);
                                                        if (i45 == zzdtVar3.zza) {
                                                            zzekVar2.zze(Double.longBitsToDouble(zzdu.zzn(bArr, zzh4)));
                                                            i49 = zzh4 + 8;
                                                        } else {
                                                            i23 = i49;
                                                            obj4 = obj;
                                                            if (i23 != i48) {
                                                            }
                                                        }
                                                    }
                                                    i23 = i49;
                                                    obj4 = obj;
                                                    if (i23 != i48) {
                                                    }
                                                }
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                        case 19:
                                        case 36:
                                            i45 = i75;
                                            i46 = i100;
                                            zzdtVar3 = zzdtVar7;
                                            i47 = i10;
                                            i43 = i98;
                                            i48 = i99;
                                            unsafe = unsafe4;
                                            z11 = true;
                                            if (i79 == 2) {
                                                zzer zzerVar = (zzer) zzezVar2;
                                                i23 = zzdu.zzh(bArr, i48, zzdtVar3);
                                                int i104 = zzdtVar3.zza + i23;
                                                while (i23 < i104) {
                                                    zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr, i23)));
                                                    i23 += 4;
                                                }
                                                if (i23 != i104) {
                                                    throw zzfb.zzf();
                                                }
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            } else {
                                                if (i79 == 5) {
                                                    zzer zzerVar2 = (zzer) zzezVar2;
                                                    zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr, i48)));
                                                    i49 = i48 + 4;
                                                    while (i49 < i47) {
                                                        int zzh5 = zzdu.zzh(bArr, i49, zzdtVar3);
                                                        if (i45 == zzdtVar3.zza) {
                                                            zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr, zzh5)));
                                                            i49 = zzh5 + 4;
                                                        } else {
                                                            i23 = i49;
                                                            obj4 = obj;
                                                            if (i23 != i48) {
                                                            }
                                                        }
                                                    }
                                                    i23 = i49;
                                                    obj4 = obj;
                                                    if (i23 != i48) {
                                                    }
                                                }
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i45 = i75;
                                            i46 = i100;
                                            zzdtVar3 = zzdtVar7;
                                            i47 = i10;
                                            i43 = i98;
                                            i48 = i99;
                                            unsafe = unsafe4;
                                            z11 = true;
                                            if (i79 == 2) {
                                                zzfm zzfmVar = (zzfm) zzezVar2;
                                                i23 = zzdu.zzh(bArr, i48, zzdtVar3);
                                                int i105 = zzdtVar3.zza + i23;
                                                while (i23 < i105) {
                                                    i23 = zzdu.zzk(bArr, i23, zzdtVar3);
                                                    zzfmVar.zze(zzdtVar3.zzb);
                                                }
                                                if (i23 != i105) {
                                                    throw zzfb.zzf();
                                                }
                                            } else {
                                                if (i79 == 0) {
                                                    zzfm zzfmVar2 = (zzfm) zzezVar2;
                                                    i23 = zzdu.zzk(bArr, i48, zzdtVar3);
                                                    zzfmVar2.zze(zzdtVar3.zzb);
                                                    while (i23 < i47) {
                                                        int zzh6 = zzdu.zzh(bArr, i23, zzdtVar3);
                                                        if (i45 == zzdtVar3.zza) {
                                                            i23 = zzdu.zzk(bArr, zzh6, zzdtVar3);
                                                            zzfmVar2.zze(zzdtVar3.zzb);
                                                        }
                                                    }
                                                }
                                                i23 = i48;
                                            }
                                            obj4 = obj;
                                            if (i23 != i48) {
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i45 = i75;
                                            i50 = i100;
                                            zzdtVar4 = zzdtVar7;
                                            i51 = i10;
                                            i43 = i98;
                                            i48 = i99;
                                            unsafe = unsafe4;
                                            z11 = true;
                                            if (i79 == 2) {
                                                i23 = zzdu.zzf(bArr, i48, zzezVar2, zzdtVar4);
                                                i47 = i51;
                                                zzdtVar3 = zzdtVar4;
                                                i46 = i50;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            } else {
                                                if (i79 == 0) {
                                                    i47 = i51;
                                                    zzdtVar3 = zzdtVar4;
                                                    i46 = i50;
                                                    i23 = zzdu.zzj(i45, bArr, i48, i10, zzezVar2, zzdtVar);
                                                    i45 = i45;
                                                    obj4 = obj;
                                                    if (i23 != i48) {
                                                    }
                                                }
                                                i47 = i51;
                                                zzdtVar3 = zzdtVar4;
                                                i46 = i50;
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i45 = i75;
                                            i50 = i100;
                                            zzdtVar4 = zzdtVar7;
                                            i51 = i10;
                                            i43 = i98;
                                            i48 = i99;
                                            unsafe = unsafe4;
                                            z11 = true;
                                            if (i79 == 2) {
                                                zzfm zzfmVar3 = (zzfm) zzezVar2;
                                                i23 = zzdu.zzh(bArr, i48, zzdtVar4);
                                                int i106 = zzdtVar4.zza + i23;
                                                while (i23 < i106) {
                                                    zzfmVar3.zze(zzdu.zzn(bArr, i23));
                                                    i23 += 8;
                                                }
                                                if (i23 != i106) {
                                                    throw zzfb.zzf();
                                                }
                                            } else {
                                                if (i79 == 1) {
                                                    zzfm zzfmVar4 = (zzfm) zzezVar2;
                                                    zzfmVar4.zze(zzdu.zzn(bArr, i48));
                                                    i23 = i48 + 8;
                                                    while (i23 < i51) {
                                                        int zzh7 = zzdu.zzh(bArr, i23, zzdtVar4);
                                                        if (i45 == zzdtVar4.zza) {
                                                            zzfmVar4.zze(zzdu.zzn(bArr, zzh7));
                                                            i23 = zzh7 + 8;
                                                        }
                                                    }
                                                }
                                                i47 = i51;
                                                zzdtVar3 = zzdtVar4;
                                                i46 = i50;
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            i47 = i51;
                                            zzdtVar3 = zzdtVar4;
                                            i46 = i50;
                                            obj4 = obj;
                                            if (i23 != i48) {
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i45 = i75;
                                            i50 = i100;
                                            zzdtVar4 = zzdtVar7;
                                            i51 = i10;
                                            i43 = i98;
                                            i48 = i99;
                                            unsafe = unsafe4;
                                            z11 = true;
                                            if (i79 == 2) {
                                                zzew zzewVar = (zzew) zzezVar2;
                                                i23 = zzdu.zzh(bArr, i48, zzdtVar4);
                                                int i107 = zzdtVar4.zza + i23;
                                                while (i23 < i107) {
                                                    zzewVar.zze(zzdu.zzb(bArr, i23));
                                                    i23 += 4;
                                                }
                                                if (i23 != i107) {
                                                    throw zzfb.zzf();
                                                }
                                            } else {
                                                if (i79 == 5) {
                                                    zzew zzewVar2 = (zzew) zzezVar2;
                                                    zzewVar2.zze(zzdu.zzb(bArr, i48));
                                                    i23 = i48 + 4;
                                                    while (i23 < i51) {
                                                        int zzh8 = zzdu.zzh(bArr, i23, zzdtVar4);
                                                        if (i45 == zzdtVar4.zza) {
                                                            zzewVar2.zze(zzdu.zzb(bArr, zzh8));
                                                            i23 = zzh8 + 4;
                                                        }
                                                    }
                                                }
                                                i47 = i51;
                                                zzdtVar3 = zzdtVar4;
                                                i46 = i50;
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            i47 = i51;
                                            zzdtVar3 = zzdtVar4;
                                            i46 = i50;
                                            obj4 = obj;
                                            if (i23 != i48) {
                                            }
                                            break;
                                        case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                        case 42:
                                            i45 = i75;
                                            i50 = i100;
                                            zzdtVar4 = zzdtVar7;
                                            i51 = i10;
                                            i43 = i98;
                                            i48 = i99;
                                            unsafe = unsafe4;
                                            z11 = true;
                                            if (i79 == 2) {
                                                zzdv zzdvVar = (zzdv) zzezVar2;
                                                i23 = zzdu.zzh(bArr, i48, zzdtVar4);
                                                int i108 = zzdtVar4.zza + i23;
                                                while (i23 < i108) {
                                                    i23 = zzdu.zzk(bArr, i23, zzdtVar4);
                                                    zzdvVar.zze(zzdtVar4.zzb != 0);
                                                }
                                                if (i23 != i108) {
                                                    throw zzfb.zzf();
                                                }
                                            } else {
                                                if (i79 == 0) {
                                                    zzdv zzdvVar2 = (zzdv) zzezVar2;
                                                    i23 = zzdu.zzk(bArr, i48, zzdtVar4);
                                                    zzdvVar2.zze(zzdtVar4.zzb != 0);
                                                    while (i23 < i51) {
                                                        int zzh9 = zzdu.zzh(bArr, i23, zzdtVar4);
                                                        if (i45 == zzdtVar4.zza) {
                                                            i23 = zzdu.zzk(bArr, zzh9, zzdtVar4);
                                                            zzdvVar2.zze(zzdtVar4.zzb != 0);
                                                        }
                                                    }
                                                }
                                                i47 = i51;
                                                zzdtVar3 = zzdtVar4;
                                                i46 = i50;
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            i47 = i51;
                                            zzdtVar3 = zzdtVar4;
                                            i46 = i50;
                                            obj4 = obj;
                                            if (i23 != i48) {
                                            }
                                            break;
                                        case 26:
                                            i45 = i75;
                                            i50 = i100;
                                            zzdtVar4 = zzdtVar7;
                                            i51 = i10;
                                            i43 = i98;
                                            i48 = i99;
                                            unsafe = unsafe4;
                                            z11 = true;
                                            if (i79 == 2) {
                                                if ((j11 & 536870912) == 0) {
                                                    i23 = zzdu.zzh(bArr, i48, zzdtVar4);
                                                    int i109 = zzdtVar4.zza;
                                                    if (i109 < 0) {
                                                        throw zzfb.zzc();
                                                    }
                                                    if (i109 == 0) {
                                                        obj3 = obj2;
                                                        zzezVar2.add(obj3);
                                                    } else {
                                                        obj3 = obj2;
                                                        zzezVar2.add(new String(bArr, i23, i109, zzfa.zzb));
                                                        i23 += i109;
                                                    }
                                                    while (i23 < i51) {
                                                        int zzh10 = zzdu.zzh(bArr, i23, zzdtVar4);
                                                        if (i45 == zzdtVar4.zza) {
                                                            i23 = zzdu.zzh(bArr, zzh10, zzdtVar4);
                                                            int i110 = zzdtVar4.zza;
                                                            if (i110 < 0) {
                                                                throw zzfb.zzc();
                                                            }
                                                            if (i110 == 0) {
                                                                zzezVar2.add(obj3);
                                                            } else {
                                                                zzezVar2.add(new String(bArr, i23, i110, zzfa.zzb));
                                                                i23 += i110;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Object obj5 = obj2;
                                                    i23 = zzdu.zzh(bArr, i48, zzdtVar4);
                                                    int i111 = zzdtVar4.zza;
                                                    if (i111 < 0) {
                                                        throw zzfb.zzc();
                                                    }
                                                    if (i111 == 0) {
                                                        zzezVar2.add(obj5);
                                                    } else {
                                                        int i112 = i23 + i111;
                                                        if (!zzhn.zzc(bArr, i23, i112)) {
                                                            throw zzfb.zzb();
                                                        }
                                                        zzezVar2.add(new String(bArr, i23, i111, zzfa.zzb));
                                                        i23 = i112;
                                                    }
                                                    while (i23 < i51) {
                                                        int zzh11 = zzdu.zzh(bArr, i23, zzdtVar4);
                                                        if (i45 == zzdtVar4.zza) {
                                                            i23 = zzdu.zzh(bArr, zzh11, zzdtVar4);
                                                            int i113 = zzdtVar4.zza;
                                                            if (i113 < 0) {
                                                                throw zzfb.zzc();
                                                            }
                                                            if (i113 == 0) {
                                                                zzezVar2.add(obj5);
                                                            } else {
                                                                int i114 = i23 + i113;
                                                                if (!zzhn.zzc(bArr, i23, i114)) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                zzezVar2.add(new String(bArr, i23, i113, zzfa.zzb));
                                                                i23 = i114;
                                                            }
                                                        }
                                                    }
                                                }
                                                i47 = i51;
                                                zzdtVar3 = zzdtVar4;
                                                i46 = i50;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            i47 = i51;
                                            zzdtVar3 = zzdtVar4;
                                            i46 = i50;
                                            i23 = i48;
                                            obj4 = obj;
                                            if (i23 != i48) {
                                            }
                                            break;
                                        case 27:
                                            i45 = i75;
                                            i52 = i99;
                                            unsafe = unsafe4;
                                            if (i79 == 2) {
                                                i43 = i98;
                                                int zze = zzdu.zze(zzgaVar.zzr(i100), i45, bArr, i52, i10, zzezVar2, zzdtVar);
                                                i48 = i52;
                                                z11 = true;
                                                zzdtVar3 = zzdtVar7;
                                                i46 = i100;
                                                i23 = zze;
                                                i47 = i10;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            } else {
                                                i43 = i98;
                                                zzdtVar3 = zzdtVar7;
                                                z11 = true;
                                                int i115 = i52;
                                                i46 = i100;
                                                i47 = i10;
                                                i48 = i115;
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            int i116 = i75;
                                            i52 = i99;
                                            unsafe = unsafe4;
                                            if (i79 == 2) {
                                                int zzh12 = zzdu.zzh(bArr, i52, zzdtVar7);
                                                int i117 = zzdtVar7.zza;
                                                if (i117 < 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i117 > bArr.length - zzh12) {
                                                    throw zzfb.zzf();
                                                }
                                                if (i117 == 0) {
                                                    zzezVar2.add(zzef.zzb);
                                                } else {
                                                    zzezVar2.add(zzef.zzk(bArr, zzh12, i117));
                                                    zzh12 += i117;
                                                }
                                                while (true) {
                                                    if (zzh12 >= i10) {
                                                        i45 = i116;
                                                        break;
                                                    } else {
                                                        int zzh13 = zzdu.zzh(bArr, zzh12, zzdtVar7);
                                                        i45 = i116;
                                                        if (i45 != zzdtVar7.zza) {
                                                            break;
                                                        } else {
                                                            zzh12 = zzdu.zzh(bArr, zzh13, zzdtVar7);
                                                            int i118 = zzdtVar7.zza;
                                                            if (i118 < 0) {
                                                                throw zzfb.zzc();
                                                            }
                                                            if (i118 > bArr.length - zzh12) {
                                                                throw zzfb.zzf();
                                                            }
                                                            if (i118 == 0) {
                                                                zzezVar2.add(zzef.zzb);
                                                            } else {
                                                                zzezVar2.add(zzef.zzk(bArr, zzh12, i118));
                                                                zzh12 += i118;
                                                            }
                                                            i116 = i45;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i43 = i98;
                                                i45 = i116;
                                                zzdtVar3 = zzdtVar7;
                                                z11 = true;
                                                int i1152 = i52;
                                                i46 = i100;
                                                i47 = i10;
                                                i48 = i1152;
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            int i119 = i75;
                                            i52 = i99;
                                            unsafe = unsafe4;
                                            if (i79 == 2) {
                                                zzj = zzdu.zzf(bArr, i52, zzezVar2, zzdtVar7);
                                            } else if (i79 == 0) {
                                                zzj = zzdu.zzj(i119, bArr, i52, i10, zzezVar2, zzdtVar);
                                            } else {
                                                i43 = i98;
                                                i45 = i119;
                                                zzdtVar3 = zzdtVar7;
                                                z11 = true;
                                                int i11522 = i52;
                                                i46 = i100;
                                                i47 = i10;
                                                i48 = i11522;
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            zzey zzq3 = zzgaVar.zzq(i100);
                                            zzgz zzgzVar = zzgaVar.zzl;
                                            int i120 = zzgk.zza;
                                            if (zzq3 == null) {
                                                i53 = zzj;
                                                i54 = i119;
                                                i55 = i98;
                                                z12 = true;
                                            } else if (zzezVar2 != null) {
                                                int size2 = zzezVar2.size();
                                                Object obj6 = null;
                                                int i121 = 0;
                                                int i122 = 0;
                                                while (i121 < size2) {
                                                    Integer num = (Integer) zzezVar2.get(i121);
                                                    int i123 = zzj;
                                                    int intValue = num.intValue();
                                                    if (zzq3.zza()) {
                                                        if (i121 != i122) {
                                                            zzezVar2.set(i122, num);
                                                        }
                                                        i122++;
                                                        i56 = i119;
                                                        i58 = 1;
                                                        i57 = i98;
                                                    } else {
                                                        i56 = i119;
                                                        i57 = i98;
                                                        obj6 = zzgk.zzc(obj, i57, intValue, obj6, zzgzVar);
                                                        i58 = 1;
                                                    }
                                                    i121 += i58;
                                                    zzj = i123;
                                                    i98 = i57;
                                                    i119 = i56;
                                                }
                                                i53 = zzj;
                                                i54 = i119;
                                                i55 = i98;
                                                z12 = true;
                                                if (i122 != size2) {
                                                    zzezVar2.subList(i122, size2).clear();
                                                }
                                            } else {
                                                i53 = zzj;
                                                i54 = i119;
                                                i55 = i98;
                                                z12 = true;
                                                Iterator it = zzezVar2.iterator();
                                                Object obj7 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzq3.zza()) {
                                                        obj7 = zzgk.zzc(obj, i55, intValue2, obj7, zzgzVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i43 = i55;
                                            i45 = i54;
                                            zzdtVar3 = zzdtVar7;
                                            z11 = z12;
                                            i23 = i53;
                                            int i124 = i52;
                                            i46 = i100;
                                            i47 = i10;
                                            i48 = i124;
                                            obj4 = obj;
                                            if (i23 != i48) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i59 = i75;
                                            i52 = i99;
                                            unsafe = unsafe4;
                                            c10 = 2;
                                            if (i79 == 2) {
                                                zzew zzewVar3 = (zzew) zzezVar2;
                                                i23 = zzdu.zzh(bArr, i52, zzdtVar7);
                                                int i125 = zzdtVar7.zza + i23;
                                                while (i23 < i125) {
                                                    i23 = zzdu.zzh(bArr, i23, zzdtVar7);
                                                    zzewVar3.zze(zzej.zzb(zzdtVar7.zza));
                                                }
                                                if (i23 != i125) {
                                                    throw zzfb.zzf();
                                                }
                                            } else {
                                                if (i79 == 0) {
                                                    zzew zzewVar4 = (zzew) zzezVar2;
                                                    i23 = zzdu.zzh(bArr, i52, zzdtVar7);
                                                    zzewVar4.zze(zzej.zzb(zzdtVar7.zza));
                                                    while (i23 < i10) {
                                                        int zzh14 = zzdu.zzh(bArr, i23, zzdtVar7);
                                                        if (i59 == zzdtVar7.zza) {
                                                            i23 = zzdu.zzh(bArr, zzh14, zzdtVar7);
                                                            zzewVar4.zze(zzej.zzb(zzdtVar7.zza));
                                                        }
                                                    }
                                                }
                                                i45 = i59;
                                                i43 = i98;
                                                zzdtVar3 = zzdtVar7;
                                                z11 = true;
                                                int i115222 = i52;
                                                i46 = i100;
                                                i47 = i10;
                                                i48 = i115222;
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            i45 = i59;
                                            i43 = i98;
                                            zzdtVar3 = zzdtVar7;
                                            z11 = true;
                                            int i1242 = i52;
                                            i46 = i100;
                                            i47 = i10;
                                            i48 = i1242;
                                            obj4 = obj;
                                            if (i23 != i48) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            i59 = i75;
                                            i52 = i99;
                                            unsafe = unsafe4;
                                            c10 = 2;
                                            if (i79 == 2) {
                                                zzfm zzfmVar5 = (zzfm) zzezVar2;
                                                i23 = zzdu.zzh(bArr, i52, zzdtVar7);
                                                int i126 = zzdtVar7.zza + i23;
                                                while (i23 < i126) {
                                                    i23 = zzdu.zzk(bArr, i23, zzdtVar7);
                                                    zzfmVar5.zze(zzej.zzc(zzdtVar7.zzb));
                                                }
                                                if (i23 != i126) {
                                                    throw zzfb.zzf();
                                                }
                                            } else {
                                                if (i79 == 0) {
                                                    zzfm zzfmVar6 = (zzfm) zzezVar2;
                                                    i23 = zzdu.zzk(bArr, i52, zzdtVar7);
                                                    zzfmVar6.zze(zzej.zzc(zzdtVar7.zzb));
                                                    while (i23 < i10) {
                                                        int zzh15 = zzdu.zzh(bArr, i23, zzdtVar7);
                                                        if (i59 == zzdtVar7.zza) {
                                                            i23 = zzdu.zzk(bArr, zzh15, zzdtVar7);
                                                            zzfmVar6.zze(zzej.zzc(zzdtVar7.zzb));
                                                        }
                                                    }
                                                }
                                                i45 = i59;
                                                i43 = i98;
                                                zzdtVar3 = zzdtVar7;
                                                z11 = true;
                                                int i1152222 = i52;
                                                i46 = i100;
                                                i47 = i10;
                                                i48 = i1152222;
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            i45 = i59;
                                            i43 = i98;
                                            zzdtVar3 = zzdtVar7;
                                            z11 = true;
                                            int i12422 = i52;
                                            i46 = i100;
                                            i47 = i10;
                                            i48 = i12422;
                                            obj4 = obj;
                                            if (i23 != i48) {
                                            }
                                            break;
                                        default:
                                            if (i79 == 3) {
                                                zzgi zzr2 = zzgaVar.zzr(i100);
                                                int i127 = (i75 & (-8)) | 4;
                                                unsafe = unsafe4;
                                                i52 = i99;
                                                i23 = zzdu.zzc(zzr2, bArr, i99, i10, i127, zzdtVar);
                                                zzezVar2.add(zzdtVar7.zzc);
                                                while (i23 < i10) {
                                                    int zzh16 = zzdu.zzh(bArr, i23, zzdtVar7);
                                                    if (i75 == zzdtVar7.zza) {
                                                        i23 = zzdu.zzc(zzr2, bArr, zzh16, i10, i127, zzdtVar);
                                                        zzezVar2.add(zzdtVar7.zzc);
                                                    } else {
                                                        i45 = i75;
                                                        zzdtVar3 = zzdtVar7;
                                                        i43 = i98;
                                                        z11 = true;
                                                        int i124222 = i52;
                                                        i46 = i100;
                                                        i47 = i10;
                                                        i48 = i124222;
                                                        obj4 = obj;
                                                        if (i23 != i48) {
                                                        }
                                                    }
                                                }
                                                i45 = i75;
                                                zzdtVar3 = zzdtVar7;
                                                i43 = i98;
                                                z11 = true;
                                                int i1242222 = i52;
                                                i46 = i100;
                                                i47 = i10;
                                                i48 = i1242222;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            } else {
                                                unsafe = unsafe4;
                                                i45 = i75;
                                                i46 = i100;
                                                zzdtVar3 = zzdtVar7;
                                                i47 = i10;
                                                i43 = i98;
                                                i48 = i99;
                                                z11 = true;
                                                i23 = i48;
                                                obj4 = obj;
                                                if (i23 != i48) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            } else if (i79 == 2) {
                                zzez zzezVar3 = (zzez) unsafe4.getObject(obj4, j);
                                if (!zzezVar3.zzc()) {
                                    int size3 = zzezVar3.size();
                                    zzezVar3 = zzezVar3.zzd(size3 != 0 ? size3 + size3 : 10);
                                    unsafe4.putObject(obj4, j, zzezVar3);
                                }
                                i70 = zzdu.zze(zzgaVar.zzr(i73), i75, bArr, i99, i10, zzezVar3, zzdtVar);
                                zzdtVar5 = zzdtVar;
                                unsafe3 = unsafe4;
                                i73 = i73;
                                i69 = 1048575;
                                i72 = i98;
                                i68 = -1;
                                i67 = 0;
                                i71 = i71;
                                i66 = 3;
                                i75 = i75;
                                i65 = i10;
                            } else {
                                i18 = i71;
                                i41 = i99;
                                unsafe = unsafe4;
                                i42 = i73;
                                i43 = i98;
                                i44 = i75;
                                i73 = i42;
                                i16 = i44;
                                i76 = i41;
                            }
                            i22 = i43;
                            i17 = 3;
                            i21 = i11;
                        }
                    }
                    if (i16 == i21 || i21 == 0) {
                        zzdtVar5 = zzdtVar;
                        i23 = zzdu.zzg(i16, bArr, i76, i10, zzc(obj), zzdtVar5);
                        i65 = i10;
                        i75 = i16;
                        i69 = 1048575;
                        i72 = i22;
                        i66 = i17;
                        i68 = i19;
                        i67 = i20;
                        i71 = i18;
                        zzgaVar = this;
                        i70 = i23;
                        unsafe3 = unsafe;
                    } else {
                        i12 = i10;
                        i70 = i76;
                        i14 = i21;
                        i15 = i74;
                        i71 = i18;
                        i13 = 1048575;
                    }
                } else {
                    zzm = zzgaVar.zzm(i78, i67);
                }
                i73 = zzm;
                if (i73 != i68) {
                }
                if (i16 == i21) {
                }
                zzdtVar5 = zzdtVar;
                i23 = zzdu.zzg(i16, bArr, i76, i10, zzc(obj), zzdtVar5);
                i65 = i10;
                i75 = i16;
                i69 = 1048575;
                i72 = i22;
                i66 = i17;
                i68 = i19;
                i67 = i20;
                i71 = i18;
                zzgaVar = this;
                i70 = i23;
                unsafe3 = unsafe;
            } else {
                unsafe = unsafe3;
                i12 = i65;
                i13 = i69;
                i14 = i11;
                i15 = i74;
                i16 = i75;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(f.API_PRIORITY_OTHER);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int zzo = zzo(i7);
                int i10 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j = i10;
                if (zzn != 9) {
                    if (zzn != 60 && zzn != 68) {
                        switch (zzn) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzk.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzI(obj, this.zzc[i7], i7)) {
                        zzr(i7).zze(zzb.getObject(obj, j));
                    }
                }
                if (zzE(obj, i7)) {
                    zzr(i7).zze(zzb.getObject(obj, j));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzo = zzo(i7);
            int i10 = this.zzc[i7];
            long j = 1048575 & zzo;
            switch (zzn(zzo)) {
                case 0:
                    if (zzE(obj2, i7)) {
                        zzhj.zzl(obj, j, zzhj.zza(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i7)) {
                        zzhj.zzm(obj, j, zzhj.zzb(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzE(obj2, i7)) {
                        zzhj.zzk(obj, j, zzhj.zzt(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzE(obj2, i7)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzx(obj, obj2, i7);
                    break;
                case 10:
                    if (zzE(obj2, i7)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzE(obj2, i7)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzE(obj2, i7)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzx(obj, obj2, i7);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzk.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i11 = zzgk.zza;
                    zzhj.zzp(obj, j, zzfs.zza(zzhj.zzf(obj, j), zzhj.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzI(obj2, i10, i7)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzA(obj, i10, i7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzy(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i10, i7)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzA(obj, i10, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzy(obj, obj2, i7);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i7, int i10, zzdt zzdtVar) {
        zzb(obj, bArr, i7, i10, 0, zzdtVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzh(Object obj, Object obj2) {
        int i7;
        boolean zzf;
        int length = this.zzc.length;
        for (0; i7 < length; i7 + 3) {
            int zzo = zzo(i7);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    i7 = (zzD(obj, obj2, i7) && Double.doubleToLongBits(zzhj.zza(obj, j)) == Double.doubleToLongBits(zzhj.zza(obj2, j))) ? i7 + 3 : 0;
                    return false;
                case 1:
                    if (zzD(obj, obj2, i7) && Float.floatToIntBits(zzhj.zzb(obj, j)) == Float.floatToIntBits(zzhj.zzb(obj2, j))) {
                    }
                    return false;
                case 2:
                    if (zzD(obj, obj2, i7) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                    }
                    return false;
                case 3:
                    if (zzD(obj, obj2, i7) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                    }
                    return false;
                case 4:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                    }
                    return false;
                case 5:
                    if (zzD(obj, obj2, i7) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                    }
                    return false;
                case 6:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                    }
                    return false;
                case 7:
                    if (zzD(obj, obj2, i7) && zzhj.zzt(obj, j) == zzhj.zzt(obj2, j)) {
                    }
                    return false;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzD(obj, obj2, i7) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                    }
                    return false;
                case 9:
                    if (zzD(obj, obj2, i7) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                    }
                    return false;
                case 10:
                    if (zzD(obj, obj2, i7) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                    }
                    return false;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                    }
                    return false;
                case 12:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                    }
                    return false;
                case 13:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                    }
                    return false;
                case 14:
                    if (zzD(obj, obj2, i7) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                    }
                    return false;
                case 15:
                    if (zzD(obj, obj2, i7) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                    }
                    return false;
                case 16:
                    if (zzD(obj, obj2, i7) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                    }
                    return false;
                case 17:
                    if (zzD(obj, obj2, i7) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j));
                    if (zzf) {
                        return false;
                    }
                case 50:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j));
                    if (zzf) {
                    }
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzl = zzl(i7) & 1048575;
                    if (zzhj.zzc(obj, zzl) == zzhj.zzc(obj2, zzl) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                    }
                    return false;
                default:
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i7;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i12 < this.zzi) {
            int i14 = this.zzh[i12];
            int i15 = this.zzc[i14];
            int zzo = zzo(i14);
            int i16 = this.zzc[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i13) {
                if (i17 != 1048575) {
                    i11 = zzb.getInt(obj, i17);
                }
                i10 = i11;
                i7 = i17;
            } else {
                i7 = i13;
                i10 = i11;
            }
            if ((268435456 & zzo) != 0 && !zzF(obj, i14, i7, i10, i18)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzI(obj, i15, i14) && !zzG(obj, zzo, zzr(i14))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn == 50 && !((zzfr) zzhj.zzf(obj, zzo & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhj.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgi zzr = zzr(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!zzr.zzi(list.get(i19))) {
                            return false;
                        }
                    }
                }
            } else if (zzF(obj, i14, i7, i10, i18) && !zzG(obj, zzo, zzr(i14))) {
                return false;
            }
            i12++;
            i13 = i7;
            i11 = i10;
        }
        return true;
    }
}
