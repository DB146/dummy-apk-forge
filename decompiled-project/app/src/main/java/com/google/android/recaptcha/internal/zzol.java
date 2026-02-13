package com.google.android.recaptcha.internal;

import A3.c;
import P1.g;
import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i7, int i10, zzoi zzoiVar, boolean z8, int[] iArr2, int i11, int i12, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i10;
        this.zzi = zzoiVar instanceof zznd;
        boolean z10 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzj = iArr2;
        this.zzk = i11;
        this.zzl = i12;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i7) {
        zzow zzx = zzx(i7);
        int zzu = zzu(i7) & 1048575;
        if (!zzN(obj, i7)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i7, int i10) {
        zzow zzx = zzx(i10);
        if (!zzR(obj, i7, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i10) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
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
            StringBuilder o10 = c.o("Field ", str, " for ", name, " not found. Known fields are ");
            o10.append(arrays);
            throw new RuntimeException(o10.toString());
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i7) {
        if (zzN(obj2, i7)) {
            int zzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i7);
            if (!zzN(obj, i7)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i7) {
        int i10 = this.zzc[i7];
        if (zzR(obj2, i10, i7)) {
            int zzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i7);
            if (!zzR(obj, i10, i7)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i10, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i7, zzov zzovVar) {
        long j = i7 & 1048575;
        if (zzM(i7)) {
            zzps.zzs(obj, j, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i7) {
        int zzr = zzr(i7);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzps.zzq(obj, j, (1 << (zzr >>> 20)) | zzps.zzc(obj, j));
    }

    private final void zzI(Object obj, int i7, int i10) {
        zzps.zzq(obj, zzr(i10) & 1048575, i7);
    }

    private final void zzJ(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzu(i7) & 1048575, obj2);
        zzH(obj, i7);
    }

    private final void zzK(Object obj, int i7, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzI(obj, i7, i10);
    }

    private final boolean zzL(Object obj, Object obj2, int i7) {
        return zzN(obj, i7) == zzN(obj2, i7);
    }

    private static boolean zzM(int i7) {
        return (i7 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i7) {
        int zzr = zzr(i7);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzps.zzc(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i7);
        long j10 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j10)) != 0;
            case 2:
                return zzps.zzd(obj, j10) != 0;
            case 3:
                return zzps.zzd(obj, j10) != 0;
            case 4:
                return zzps.zzc(obj, j10) != 0;
            case 5:
                return zzps.zzd(obj, j10) != 0;
            case 6:
                return zzps.zzc(obj, j10) != 0;
            case 7:
                return zzps.zzw(obj, j10);
            case g.BYTES_FIELD_NUMBER /* 8 */:
                Object zzf = zzps.zzf(obj, j10);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzle) {
                    return !zzle.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j10) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j10));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return zzps.zzc(obj, j10) != 0;
            case 12:
                return zzps.zzc(obj, j10) != 0;
            case 13:
                return zzps.zzc(obj, j10) != 0;
            case 14:
                return zzps.zzd(obj, j10) != 0;
            case 15:
                return zzps.zzc(obj, j10) != 0;
            case 16:
                return zzps.zzd(obj, j10) != 0;
            case 17:
                return zzps.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzN(obj, i7) : (i11 & i12) != 0;
    }

    private static boolean zzP(Object obj, int i7, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i7 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i7, int i10) {
        return zzps.zzc(obj, (long) (zzr(i10) & 1048575)) == i7;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzps.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i7, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i7, (String) obj);
        } else {
            zzpyVar.zzd(i7, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
    }

    public static zzol zzm(Class cls, zzof zzofVar, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        int i7;
        int charAt;
        int charAt2;
        int i10;
        int i11;
        int i12;
        int[] iArr;
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
        int[] iArr2;
        zzou zzouVar;
        String str;
        int objectFieldOffset;
        int i27;
        Class<?> cls2;
        int i28;
        int i29;
        int i30;
        int i31;
        Field zzC;
        int i32;
        char charAt11;
        int i33;
        int i34;
        int i35;
        Field zzC2;
        Field zzC3;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        int i39;
        char charAt15;
        if (!(zzofVar instanceof zzou)) {
            throw null;
        }
        zzou zzouVar2 = (zzou) zzofVar;
        String zzd = zzouVar2.zzd();
        int length = zzd.length();
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
                i39 = i41 + 1;
                charAt15 = zzd.charAt(i41);
                if (charAt15 < 55296) {
                    break;
                }
                i42 |= (charAt15 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            charAt16 = i42 | (charAt15 << i43);
            i41 = i39;
        }
        if (charAt16 == 0) {
            i12 = 0;
            charAt = 0;
            charAt2 = 0;
            i10 = 0;
            i13 = 0;
            i11 = 0;
            iArr = zza;
            i14 = 0;
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
            int i68 = charAt17 + charAt17 + charAt18;
            int[] iArr3 = new int[charAt22 + charAt2 + charAt21];
            i10 = charAt19;
            i11 = charAt22;
            i12 = i68;
            iArr = iArr3;
            i13 = charAt20;
            i14 = charAt17;
            i41 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzouVar2.zze();
        Class<?> cls3 = zzouVar2.zza().getClass();
        int i69 = i11 + charAt2;
        int i70 = charAt + charAt;
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr = new Object[i70];
        int i71 = i11;
        int i72 = i69;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int charAt23 = zzd.charAt(i41);
            if (charAt23 >= c10) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i38 = i77 + 1;
                    charAt14 = zzd.charAt(i77);
                    if (charAt14 < c10) {
                        break;
                    }
                    i76 |= (charAt14 & 8191) << i78;
                    i78 += 13;
                    i77 = i38;
                }
                charAt23 = i76 | (charAt14 << i78);
                i23 = i38;
            } else {
                i23 = i75;
            }
            int i79 = i23 + 1;
            int charAt24 = zzd.charAt(i23);
            if (charAt24 >= c10) {
                int i80 = charAt24 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i37 = i81 + 1;
                    charAt13 = zzd.charAt(i81);
                    i24 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i80 |= (charAt13 & 8191) << i82;
                    i82 += 13;
                    i81 = i37;
                    length = i24;
                }
                charAt24 = i80 | (charAt13 << i82);
                i25 = i37;
            } else {
                i24 = length;
                i25 = i79;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            int i83 = charAt24 & 255;
            int i84 = i13;
            int i85 = charAt24 & 2048;
            int i86 = i10;
            if (i83 >= 51) {
                int i87 = i25 + 1;
                int charAt25 = zzd.charAt(i25);
                if (charAt25 >= 55296) {
                    int i88 = charAt25 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i36 = i89 + 1;
                        charAt12 = zzd.charAt(i89);
                        i26 = charAt23;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i88 |= (charAt12 & 8191) << i90;
                        i90 += 13;
                        i89 = i36;
                        charAt23 = i26;
                    }
                    charAt25 = i88 | (charAt12 << i90);
                    i35 = i36;
                } else {
                    i26 = charAt23;
                    i35 = i87;
                }
                int i91 = i83 - 51;
                int i92 = i35;
                if (i91 == 9 || i91 == 17) {
                    objArr[X.c.a(i73, 3, 1)] = zze[i12];
                    i12++;
                } else if (i91 == 12) {
                    if (zzouVar2.zzc() == 1 || i85 != 0) {
                        objArr[X.c.a(i73, 3, 1)] = zze[i12];
                        i12++;
                    } else {
                        i85 = 0;
                    }
                }
                int i93 = charAt25 + charAt25;
                Object obj = zze[i93];
                if (obj instanceof Field) {
                    zzC2 = (Field) obj;
                } else {
                    zzC2 = zzC(cls3, (String) obj);
                    zze[i93] = zzC2;
                }
                int i94 = i85;
                i31 = (int) unsafe.objectFieldOffset(zzC2);
                int i95 = i93 + 1;
                Object obj2 = zze[i95];
                if (obj2 instanceof Field) {
                    zzC3 = (Field) obj2;
                } else {
                    zzC3 = zzC(cls3, (String) obj2);
                    zze[i95] = zzC3;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzC3);
                cls2 = cls3;
                i28 = i12;
                i85 = i94;
                zzouVar = zzouVar2;
                str = zzd;
                i29 = i92;
                iArr2 = iArr4;
                i27 = objectFieldOffset2;
                i30 = 0;
            } else {
                i26 = charAt23;
                int i96 = i12 + 1;
                Field zzC4 = zzC(cls3, (String) zze[i12]);
                iArr2 = iArr4;
                if (i83 == 9 || i83 == 17) {
                    zzouVar = zzouVar2;
                    objArr[X.c.a(i73, 3, 1)] = zzC4.getType();
                } else {
                    if (i83 == 27) {
                        zzouVar = zzouVar2;
                        i33 = 1;
                        i34 = i12 + 2;
                    } else if (i83 == 49) {
                        i34 = i12 + 2;
                        zzouVar = zzouVar2;
                        i33 = 1;
                    } else {
                        if (i83 == 12 || i83 == 30 || i83 == 44) {
                            zzouVar = zzouVar2;
                            if (zzouVar2.zzc() == 1 || i85 != 0) {
                                i34 = i12 + 2;
                                objArr[X.c.a(i73, 3, 1)] = zze[i96];
                                i96 = i34;
                            } else {
                                str = zzd;
                                i85 = 0;
                            }
                        } else if (i83 == 50) {
                            int i97 = i12 + 2;
                            int i98 = i71 + 1;
                            iArr[i71] = i73;
                            int i99 = i73 / 3;
                            int i100 = i99 + i99;
                            objArr[i100] = zze[i96];
                            if (i85 != 0) {
                                i96 = i12 + 3;
                                objArr[i100 + 1] = zze[i97];
                                str = zzd;
                                i71 = i98;
                            } else {
                                str = zzd;
                                i96 = i97;
                                i71 = i98;
                                i85 = 0;
                            }
                            zzouVar = zzouVar2;
                        } else {
                            zzouVar = zzouVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                        i27 = 1048575;
                        if ((charAt24 & 4096) != 0 || i83 > 17) {
                            cls2 = cls3;
                            i28 = i96;
                            i29 = i25;
                            i30 = 0;
                        } else {
                            i29 = i25 + 1;
                            int charAt26 = str.charAt(i25);
                            if (charAt26 >= 55296) {
                                int i101 = charAt26 & 8191;
                                int i102 = 13;
                                while (true) {
                                    i32 = i29 + 1;
                                    charAt11 = str.charAt(i29);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i101 |= (charAt11 & 8191) << i102;
                                    i102 += 13;
                                    i29 = i32;
                                }
                                charAt26 = i101 | (charAt11 << i102);
                                i29 = i32;
                            }
                            int i103 = (charAt26 / 32) + i14 + i14;
                            Object obj3 = zze[i103];
                            if (obj3 instanceof Field) {
                                zzC = (Field) obj3;
                            } else {
                                zzC = zzC(cls3, (String) obj3);
                                zze[i103] = zzC;
                            }
                            cls2 = cls3;
                            i28 = i96;
                            i30 = charAt26 % 32;
                            i27 = (int) unsafe.objectFieldOffset(zzC);
                        }
                        if (i83 >= 18 || i83 > 49) {
                            i31 = objectFieldOffset;
                        } else {
                            iArr[i72] = objectFieldOffset;
                            i31 = objectFieldOffset;
                            i72++;
                        }
                    }
                    objArr[X.c.a(i73, 3, i33)] = zze[i96];
                    i96 = i34;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i27 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                cls2 = cls3;
                i28 = i96;
                i29 = i25;
                i30 = 0;
                if (i83 >= 18) {
                }
                i31 = objectFieldOffset;
            }
            int i104 = i73 + 1;
            iArr2[i73] = i26;
            int i105 = i73 + 2;
            int i106 = i29;
            iArr2[i104] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i85 != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | i31;
            i73 += 3;
            iArr2[i105] = (i30 << 20) | i27;
            zzd = str;
            cls3 = cls2;
            i13 = i84;
            i12 = i28;
            i10 = i86;
            length = i24;
            iArr4 = iArr2;
            zzouVar2 = zzouVar;
            i41 = i106;
            c10 = 55296;
        }
        return new zzol(iArr4, objArr, i10, i13, zzouVar2.zza(), false, iArr, i11, i69, zzooVar, zznvVar, zzplVar, zzmpVar, zzodVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzps.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzps.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzps.zzf(obj, j)).intValue();
    }

    private final int zzq(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzs(i7, 0);
    }

    private final int zzr(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzs(int i7, int i10) {
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

    private static int zzt(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzu(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzps.zzf(obj, j)).longValue();
    }

    private final zznh zzw(int i7) {
        int i10 = i7 / 3;
        return (zznh) this.zzd[i10 + i10 + 1];
    }

    private final zzow zzx(int i7) {
        Object[] objArr = this.zzd;
        int i10 = i7 / 3;
        int i11 = i10 + i10;
        zzow zzowVar = (zzow) objArr[i11];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i11 + 1]);
        this.zzd[i11] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i7, Object obj2, zzpl zzplVar, Object obj3) {
        int i10 = this.zzc[i7];
        Object zzf = zzps.zzf(obj, zzu(i7) & 1048575);
        if (zzf == null || zzw(i7) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i7) {
        int i10 = i7 / 3;
        return this.zzd[i10 + i10];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r4v33 ?? I:int), method size: 2190
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zza(java.lang.Object):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i7;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int zzc;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzu = zzu(i13);
            int[] iArr = this.zzc;
            int i14 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i15 = iArr[i13];
            long j = i14;
            int i16 = 37;
            switch (zzt) {
                case 0:
                    i7 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j));
                    byte[] bArr = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i7 + zzc;
                    break;
                case 1:
                    i10 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j));
                    i12 = floatToIntBits + i10;
                    break;
                case 2:
                    i7 = i12 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr2 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i7 + zzc;
                    break;
                case 3:
                    i7 = i12 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr3 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i7 + zzc;
                    break;
                case 4:
                    i7 = i12 * 53;
                    zzc = zzps.zzc(obj, j);
                    i12 = i7 + zzc;
                    break;
                case 5:
                    i7 = i12 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr4 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i7 + zzc;
                    break;
                case 6:
                    i7 = i12 * 53;
                    zzc = zzps.zzc(obj, j);
                    i12 = i7 + zzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    floatToIntBits = zznl.zza(zzps.zzw(obj, j));
                    i12 = floatToIntBits + i10;
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    i10 = i12 * 53;
                    floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object zzf = zzps.zzf(obj, j);
                    if (zzf != null) {
                        i16 = zzf.hashCode();
                    }
                    i12 = i11 + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i7 = i12 * 53;
                    zzc = zzps.zzc(obj, j);
                    i12 = i7 + zzc;
                    break;
                case 12:
                    i7 = i12 * 53;
                    zzc = zzps.zzc(obj, j);
                    i12 = i7 + zzc;
                    break;
                case 13:
                    i7 = i12 * 53;
                    zzc = zzps.zzc(obj, j);
                    i12 = i7 + zzc;
                    break;
                case 14:
                    i7 = i12 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr5 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i7 + zzc;
                    break;
                case 15:
                    i7 = i12 * 53;
                    zzc = zzps.zzc(obj, j);
                    i12 = i7 + zzc;
                    break;
                case 16:
                    i7 = i12 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr6 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i7 + zzc;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object zzf2 = zzps.zzf(obj, j);
                    if (zzf2 != null) {
                        i16 = zzf2.hashCode();
                    }
                    i12 = i11 + i16;
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
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        zzc = zzp(obj, j);
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        zzc = zzp(obj, j);
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zznl.zza(zzS(obj, j));
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        zzc = zzp(obj, j);
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        zzc = zzp(obj, j);
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        zzc = zzp(obj, j);
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        zzc = zzp(obj, j);
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i15, i13)) {
                        i7 = i12 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zznd) obj).zzc.hashCode() + (i12 * 53);
        return this.zzh ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0c88, code lost:
    
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0db3, code lost:
    
        if (r0 == r14) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0db5, code lost:
    
        r30.putInt(r12, r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0dbb, code lost:
    
        r10 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0dc0, code lost:
    
        if (r10 >= r9.zzl) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0dc2, code lost:
    
        zzy(r33, r9.zzj[r10], null, r9.zzm, r33);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0dd7, code lost:
    
        if (r6 != 0) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0ddb, code lost:
    
        if (r8 != r36) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0de3, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0dea, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0de6, code lost:
    
        if (r8 > r36) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0de8, code lost:
    
        if (r7 != r6) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0df0, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0408. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:457:0x09c5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:570:0x00ac. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x0cd4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0945 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0c5f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0c76 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x095d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i7, int i10, int i11, zzkt zzktVar) {
        Unsafe unsafe;
        zzol<T> zzolVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        int i15;
        int zzq;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzkt zzktVar2;
        int i21;
        int zzh;
        int i22;
        Object obj3;
        int i23;
        int i24;
        int i25;
        int i26;
        zzkt zzktVar3;
        Unsafe unsafe2;
        int i27;
        boolean z8;
        int i28;
        boolean z10;
        int i29;
        boolean z11;
        boolean z12;
        zzkt zzktVar4;
        int zzl;
        boolean z13;
        int zza2;
        int i30;
        zzkt zzktVar5;
        Object obj4;
        int i31;
        int i32;
        int i33;
        Unsafe unsafe3;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        zzkt zzktVar6;
        Object obj5;
        String str;
        int i39;
        int i40;
        int i41;
        Unsafe unsafe4;
        boolean z14;
        int i42;
        Unsafe unsafe5;
        int zzi;
        int zzl2;
        Unsafe unsafe6;
        int i43;
        int zzf;
        int i44;
        int zzi2;
        Object obj6;
        int i45;
        int i46;
        int zzi3;
        int zzk;
        int zzi4;
        zzol<T> zzolVar2 = this;
        Object obj7 = obj;
        int i47 = i10;
        zzkt zzktVar7 = zzktVar;
        int i48 = 3;
        zzD(obj);
        Unsafe unsafe7 = zzb;
        int i49 = -1;
        int i50 = 1048575;
        int i51 = i7;
        int i52 = 1048575;
        int i53 = -1;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        while (true) {
            if (i51 < i47) {
                int i57 = i51 + 1;
                int i58 = bArr[i51];
                if (i58 < 0) {
                    i57 = zzku.zzj(i58, bArr, i57, zzktVar7);
                    i58 = zzktVar7.zza;
                }
                int i59 = i58;
                int i60 = i59 >>> 3;
                if (i60 > i53) {
                    zzq = (i60 < zzolVar2.zze || i60 > zzolVar2.zzf) ? i49 : zzolVar2.zzs(i60, i54 / i48);
                } else {
                    zzq = zzolVar2.zzq(i60);
                }
                int i61 = zzq;
                Object obj8 = null;
                if (i61 != i49) {
                    int i62 = i59 & 7;
                    int[] iArr = zzolVar2.zzc;
                    int i63 = iArr[i61 + 1];
                    int zzt = zzt(i63);
                    long j = i63 & i50;
                    if (zzt > 17) {
                        int i64 = i57;
                        i17 = -1;
                        i26 = i60;
                        if (zzt != 27) {
                            i30 = i55;
                            i12 = i52;
                            zzktVar5 = zzktVar;
                            i31 = i59;
                            if (zzt > 49) {
                                i32 = i61;
                                i33 = i64;
                                unsafe3 = unsafe7;
                                if (zzt != 50) {
                                    Unsafe unsafe8 = zzb;
                                    long j10 = iArr[i32 + 2] & 1048575;
                                    switch (zzt) {
                                        case 51:
                                            i18 = i31;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            zzktVar7 = zzktVar5;
                                            i34 = i33;
                                            obj2 = obj;
                                            i35 = i32;
                                            i19 = i26;
                                            if (i62 == 1) {
                                                i36 = i34 + 8;
                                                unsafe8.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzku.zzp(bArr, i34))));
                                                unsafe8.putInt(obj2, j10, i19);
                                                i51 = i36;
                                                if (i51 == i34) {
                                                    i14 = i11;
                                                    i57 = i51;
                                                    i54 = i35;
                                                    i55 = i30;
                                                    break;
                                                } else {
                                                    zzolVar2 = this;
                                                    i47 = i10;
                                                    i53 = i19;
                                                    obj7 = obj2;
                                                    i54 = i35;
                                                    i55 = i30;
                                                    i49 = -1;
                                                    i48 = i16;
                                                    i52 = i12;
                                                    unsafe7 = unsafe;
                                                    i50 = 1048575;
                                                    i56 = i18;
                                                }
                                            }
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                        case 52:
                                            i18 = i31;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            zzktVar7 = zzktVar5;
                                            i34 = i33;
                                            obj2 = obj;
                                            i35 = i32;
                                            i19 = i26;
                                            if (i62 == 5) {
                                                i36 = i34 + 4;
                                                unsafe8.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzku.zzb(bArr, i34))));
                                                unsafe8.putInt(obj2, j10, i19);
                                                i51 = i36;
                                                if (i51 == i34) {
                                                }
                                            }
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i18 = i31;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            zzktVar7 = zzktVar5;
                                            i34 = i33;
                                            obj2 = obj;
                                            i35 = i32;
                                            i19 = i26;
                                            if (i62 == 0) {
                                                i36 = zzku.zzl(bArr, i34, zzktVar7);
                                                unsafe8.putObject(obj2, j, Long.valueOf(zzktVar7.zzb));
                                                unsafe8.putInt(obj2, j10, i19);
                                                i51 = i36;
                                                if (i51 == i34) {
                                                }
                                            }
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i18 = i31;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            zzktVar7 = zzktVar5;
                                            i34 = i33;
                                            obj2 = obj;
                                            i35 = i32;
                                            i19 = i26;
                                            if (i62 == 0) {
                                                i36 = zzku.zzi(bArr, i34, zzktVar7);
                                                unsafe8.putObject(obj2, j, Integer.valueOf(zzktVar7.zza));
                                                unsafe8.putInt(obj2, j10, i19);
                                                i51 = i36;
                                                if (i51 == i34) {
                                                }
                                            }
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i18 = i31;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            zzktVar7 = zzktVar5;
                                            i34 = i33;
                                            obj2 = obj;
                                            i35 = i32;
                                            i19 = i26;
                                            if (i62 == 1) {
                                                i36 = i34 + 8;
                                                unsafe8.putObject(obj2, j, Long.valueOf(zzku.zzp(bArr, i34)));
                                                unsafe8.putInt(obj2, j10, i19);
                                                i51 = i36;
                                                if (i51 == i34) {
                                                }
                                            }
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i18 = i31;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            zzktVar7 = zzktVar5;
                                            i34 = i33;
                                            obj2 = obj;
                                            i35 = i32;
                                            i19 = i26;
                                            if (i62 == 5) {
                                                i36 = i34 + 4;
                                                unsafe8.putObject(obj2, j, Integer.valueOf(zzku.zzb(bArr, i34)));
                                                unsafe8.putInt(obj2, j10, i19);
                                                i51 = i36;
                                                if (i51 == i34) {
                                                }
                                            }
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 58:
                                            i18 = i31;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            zzktVar7 = zzktVar5;
                                            i34 = i33;
                                            obj2 = obj;
                                            i35 = i32;
                                            i19 = i26;
                                            if (i62 == 0) {
                                                i36 = zzku.zzl(bArr, i34, zzktVar7);
                                                unsafe8.putObject(obj2, j, Boolean.valueOf(zzktVar7.zzb != 0));
                                                unsafe8.putInt(obj2, j10, i19);
                                                i51 = i36;
                                                if (i51 == i34) {
                                                }
                                            }
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 59:
                                            i18 = i31;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            zzktVar7 = zzktVar5;
                                            i34 = i33;
                                            obj2 = obj;
                                            i35 = i32;
                                            i19 = i26;
                                            if (i62 == 2) {
                                                int zzi5 = zzku.zzi(bArr, i34, zzktVar7);
                                                int i65 = zzktVar7.zza;
                                                if (i65 == 0) {
                                                    unsafe8.putObject(obj2, j, "");
                                                } else {
                                                    int i66 = zzi5 + i65;
                                                    if ((i63 & 536870912) != 0 && !zzpv.zze(bArr, zzi5, i66)) {
                                                        throw new zznn("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe8.putObject(obj2, j, new String(bArr, zzi5, i65, zznl.zza));
                                                    zzi5 = i66;
                                                }
                                                unsafe8.putInt(obj2, j10, i19);
                                                i51 = zzi5;
                                                if (i51 == i34) {
                                                }
                                            }
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 60:
                                            i18 = i31;
                                            if (i62 == 2) {
                                                Object zzB = zzolVar2.zzB(obj, i26, i32);
                                                i16 = 3;
                                                obj2 = obj;
                                                unsafe = unsafe3;
                                                zzktVar7 = zzktVar;
                                                int zzn = zzku.zzn(zzB, zzolVar2.zzx(i32), bArr, i33, i10, zzktVar7);
                                                zzolVar2.zzK(obj2, i26, i32, zzB);
                                                i51 = zzn;
                                                i35 = i32;
                                                i34 = i33;
                                                i18 = i18;
                                                i19 = i26;
                                                if (i51 == i34) {
                                                }
                                            } else {
                                                obj2 = obj;
                                                unsafe = unsafe3;
                                                i16 = 3;
                                                zzktVar7 = zzktVar;
                                                i34 = i33;
                                                i35 = i32;
                                                i19 = i26;
                                                i51 = i34;
                                                if (i51 == i34) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            i18 = i31;
                                            i37 = i26;
                                            i38 = i33;
                                            zzktVar6 = zzktVar5;
                                            obj5 = obj;
                                            if (i62 == 2) {
                                                int zza3 = zzku.zza(bArr, i38, zzktVar6);
                                                unsafe8.putObject(obj5, j, zzktVar6.zzc);
                                                unsafe8.putInt(obj5, j10, i37);
                                                obj2 = obj5;
                                                i35 = i32;
                                                i51 = zza3;
                                                unsafe = unsafe3;
                                                i16 = 3;
                                                i19 = i37;
                                                zzktVar7 = zzktVar6;
                                                i34 = i38;
                                                if (i51 == i34) {
                                                }
                                            }
                                            obj2 = obj5;
                                            i35 = i32;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            i19 = i37;
                                            zzktVar7 = zzktVar6;
                                            i34 = i38;
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 63:
                                            i18 = i31;
                                            i37 = i26;
                                            i38 = i33;
                                            zzktVar6 = zzktVar5;
                                            obj5 = obj;
                                            if (i62 == 0) {
                                                i51 = zzku.zzi(bArr, i38, zzktVar6);
                                                int i67 = zzktVar6.zza;
                                                zznh zzw = zzolVar2.zzw(i32);
                                                if (zzw == null || zzw.zza(i67)) {
                                                    unsafe8.putObject(obj5, j, Integer.valueOf(i67));
                                                    unsafe8.putInt(obj5, j10, i37);
                                                } else {
                                                    zzd(obj).zzj(i18, Long.valueOf(i67));
                                                }
                                                obj2 = obj5;
                                                i35 = i32;
                                                unsafe = unsafe3;
                                                i16 = 3;
                                                i19 = i37;
                                                zzktVar7 = zzktVar6;
                                                i34 = i38;
                                                if (i51 == i34) {
                                                }
                                            }
                                            obj2 = obj5;
                                            i35 = i32;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            i19 = i37;
                                            zzktVar7 = zzktVar6;
                                            i34 = i38;
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 66:
                                            i18 = i31;
                                            i37 = i26;
                                            i38 = i33;
                                            zzktVar6 = zzktVar5;
                                            obj5 = obj;
                                            if (i62 == 0) {
                                                i51 = zzku.zzi(bArr, i38, zzktVar6);
                                                unsafe8.putObject(obj5, j, Integer.valueOf(zzli.zzF(zzktVar6.zza)));
                                                unsafe8.putInt(obj5, j10, i37);
                                                obj2 = obj5;
                                                i35 = i32;
                                                unsafe = unsafe3;
                                                i16 = 3;
                                                i19 = i37;
                                                zzktVar7 = zzktVar6;
                                                i34 = i38;
                                                if (i51 == i34) {
                                                }
                                            }
                                            obj2 = obj5;
                                            i35 = i32;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            i19 = i37;
                                            zzktVar7 = zzktVar6;
                                            i34 = i38;
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 67:
                                            i18 = i31;
                                            i37 = i26;
                                            i38 = i33;
                                            zzktVar6 = zzktVar5;
                                            obj5 = obj;
                                            if (i62 == 0) {
                                                int zzl3 = zzku.zzl(bArr, i38, zzktVar6);
                                                unsafe8.putObject(obj5, j, Long.valueOf(zzli.zzG(zzktVar6.zzb)));
                                                unsafe8.putInt(obj5, j10, i37);
                                                i51 = zzl3;
                                                obj2 = obj5;
                                                i35 = i32;
                                                unsafe = unsafe3;
                                                i16 = 3;
                                                i19 = i37;
                                                zzktVar7 = zzktVar6;
                                                i34 = i38;
                                                if (i51 == i34) {
                                                }
                                            }
                                            obj2 = obj5;
                                            i35 = i32;
                                            unsafe = unsafe3;
                                            i16 = 3;
                                            i19 = i37;
                                            zzktVar7 = zzktVar6;
                                            i34 = i38;
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                        case 68:
                                            if (i62 == 3) {
                                                obj5 = obj;
                                                i37 = i26;
                                                Object zzB2 = zzolVar2.zzB(obj5, i37, i32);
                                                i38 = i33;
                                                i18 = i31;
                                                zzktVar6 = zzktVar;
                                                i51 = zzku.zzm(zzB2, zzolVar2.zzx(i32), bArr, i38, i10, (i31 & (-8)) | 4, zzktVar);
                                                zzolVar2.zzK(obj5, i37, i32, zzB2);
                                                obj2 = obj5;
                                                i35 = i32;
                                                unsafe = unsafe3;
                                                i16 = 3;
                                                i19 = i37;
                                                zzktVar7 = zzktVar6;
                                                i34 = i38;
                                                if (i51 == i34) {
                                                }
                                            } else {
                                                i16 = 3;
                                                i18 = i31;
                                                zzktVar7 = zzktVar5;
                                                unsafe = unsafe3;
                                                i34 = i33;
                                                obj2 = obj;
                                                i35 = i32;
                                                i19 = i26;
                                                i51 = i34;
                                                if (i51 == i34) {
                                                }
                                            }
                                            break;
                                        default:
                                            i18 = i31;
                                            zzktVar7 = zzktVar5;
                                            unsafe = unsafe3;
                                            i34 = i33;
                                            i16 = 3;
                                            obj2 = obj;
                                            i35 = i32;
                                            i19 = i26;
                                            i51 = i34;
                                            if (i51 == i34) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i62 == 2) {
                                        Unsafe unsafe9 = zzb;
                                        Object zzz = zzolVar2.zzz(i32);
                                        Object object = unsafe9.getObject(obj, j);
                                        if (zzod.zza(object)) {
                                            zzoc zzb2 = zzoc.zza().zzb();
                                            zzod.zzb(zzb2, object);
                                            unsafe9.putObject(obj, j, zzb2);
                                        }
                                        throw null;
                                    }
                                    obj4 = obj;
                                    i14 = i11;
                                    unsafe = unsafe3;
                                    i18 = i31;
                                    zzktVar7 = zzktVar5;
                                    i55 = i30;
                                    i16 = 3;
                                    obj2 = obj4;
                                    i57 = i33;
                                    i54 = i32;
                                    i19 = i26;
                                }
                            } else {
                                long j11 = i63;
                                Unsafe unsafe10 = zzb;
                                Unsafe unsafe11 = unsafe7;
                                zznk zznkVar = (zznk) unsafe10.getObject(obj7, j);
                                if (zznkVar.zzc()) {
                                    str = "Protocol message had invalid UTF-8.";
                                } else {
                                    int size = zznkVar.size();
                                    str = "Protocol message had invalid UTF-8.";
                                    zznkVar = zznkVar.zzd(size + size);
                                    unsafe10.putObject(obj7, j, zznkVar);
                                }
                                zznk zznkVar2 = zznkVar;
                                switch (zzt) {
                                    case 18:
                                    case 35:
                                        i39 = i10;
                                        i40 = i61;
                                        i41 = i64;
                                        Unsafe unsafe12 = unsafe11;
                                        if (i62 == 2) {
                                            zzmi zzmiVar = (zzmi) zznkVar2;
                                            int zzi6 = zzku.zzi(bArr, i41, zzktVar5);
                                            int i68 = zzktVar5.zza;
                                            int i69 = zzi6 + i68;
                                            if (i69 > bArr.length) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzmiVar.zzg((i68 / 8) + zzmiVar.size());
                                            while (zzi6 < i69) {
                                                zzmiVar.zzf(Double.longBitsToDouble(zzku.zzp(bArr, zzi6)));
                                                zzi6 += 8;
                                                unsafe12 = unsafe12;
                                            }
                                            unsafe4 = unsafe12;
                                            if (zzi6 != i69) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i51 = zzi6;
                                            z14 = true;
                                            if (i51 != i41) {
                                                unsafe = unsafe4;
                                                i14 = i11;
                                                i54 = i40;
                                                i57 = i51;
                                                i18 = i31;
                                                zzktVar7 = zzktVar5;
                                                i19 = i26;
                                                i55 = i30;
                                                i16 = 3;
                                                obj2 = obj;
                                                break;
                                            } else {
                                                i54 = i40;
                                                zzktVar7 = zzktVar5;
                                                i47 = i39;
                                                i53 = i26;
                                                i49 = -1;
                                                i52 = i12;
                                                i48 = 3;
                                                i50 = 1048575;
                                                obj7 = obj;
                                                unsafe7 = unsafe4;
                                                i56 = i31;
                                                i55 = i30;
                                            }
                                        } else {
                                            unsafe4 = unsafe12;
                                            z14 = true;
                                            if (i62 == 1) {
                                                i42 = i41 + 8;
                                                zzmi zzmiVar2 = (zzmi) zznkVar2;
                                                zzmiVar2.zzf(Double.longBitsToDouble(zzku.zzp(bArr, i41)));
                                                while (i42 < i39) {
                                                    int zzi7 = zzku.zzi(bArr, i42, zzktVar5);
                                                    if (i31 == zzktVar5.zza) {
                                                        zzmiVar2.zzf(Double.longBitsToDouble(zzku.zzp(bArr, zzi7)));
                                                        i42 = zzi7 + 8;
                                                    } else {
                                                        i51 = i42;
                                                        if (i51 != i41) {
                                                        }
                                                    }
                                                }
                                                i51 = i42;
                                                if (i51 != i41) {
                                                }
                                            }
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        i39 = i10;
                                        i40 = i61;
                                        i41 = i64;
                                        unsafe5 = unsafe11;
                                        if (i62 == 2) {
                                            zzmv zzmvVar = (zzmv) zznkVar2;
                                            zzi = zzku.zzi(bArr, i41, zzktVar5);
                                            int i70 = zzktVar5.zza;
                                            int i71 = zzi + i70;
                                            if (i71 > bArr.length) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzmvVar.zzg((i70 / 4) + zzmvVar.size());
                                            while (zzi < i71) {
                                                zzmvVar.zzf(Float.intBitsToFloat(zzku.zzb(bArr, zzi)));
                                                zzi += 4;
                                            }
                                            if (zzi != i71) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            unsafe4 = unsafe5;
                                            z14 = true;
                                            i51 = zzi;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            if (i62 == 5) {
                                                i42 = i41 + 4;
                                                zzmv zzmvVar2 = (zzmv) zznkVar2;
                                                zzmvVar2.zzf(Float.intBitsToFloat(zzku.zzb(bArr, i41)));
                                                while (i42 < i39) {
                                                    int zzi8 = zzku.zzi(bArr, i42, zzktVar5);
                                                    if (i31 == zzktVar5.zza) {
                                                        zzmvVar2.zzf(Float.intBitsToFloat(zzku.zzb(bArr, zzi8)));
                                                        i42 = zzi8 + 4;
                                                    } else {
                                                        unsafe4 = unsafe5;
                                                        z14 = true;
                                                        i51 = i42;
                                                        if (i51 != i41) {
                                                        }
                                                    }
                                                }
                                                unsafe4 = unsafe5;
                                                z14 = true;
                                                i51 = i42;
                                                if (i51 != i41) {
                                                }
                                            }
                                            unsafe4 = unsafe5;
                                            z14 = true;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i39 = i10;
                                        i40 = i61;
                                        i41 = i64;
                                        unsafe5 = unsafe11;
                                        if (i62 == 2) {
                                            zznx zznxVar = (zznx) zznkVar2;
                                            zzi = zzku.zzi(bArr, i41, zzktVar5);
                                            int i72 = zzktVar5.zza + zzi;
                                            while (zzi < i72) {
                                                zzi = zzku.zzl(bArr, zzi, zzktVar5);
                                                zznxVar.zzg(zzktVar5.zzb);
                                            }
                                            if (zzi != i72) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            unsafe4 = unsafe5;
                                            z14 = true;
                                            i51 = zzi;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            if (i62 == 0) {
                                                zznx zznxVar2 = (zznx) zznkVar2;
                                                zzl2 = zzku.zzl(bArr, i41, zzktVar5);
                                                zznxVar2.zzg(zzktVar5.zzb);
                                                while (zzl2 < i39) {
                                                    int zzi9 = zzku.zzi(bArr, zzl2, zzktVar5);
                                                    if (i31 == zzktVar5.zza) {
                                                        zzl2 = zzku.zzl(bArr, zzi9, zzktVar5);
                                                        zznxVar2.zzg(zzktVar5.zzb);
                                                    } else {
                                                        unsafe4 = unsafe5;
                                                        i51 = zzl2;
                                                        z14 = true;
                                                        if (i51 != i41) {
                                                        }
                                                    }
                                                }
                                                unsafe4 = unsafe5;
                                                i51 = zzl2;
                                                z14 = true;
                                                if (i51 != i41) {
                                                }
                                            }
                                            unsafe4 = unsafe5;
                                            z14 = true;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i40 = i61;
                                        i41 = i64;
                                        unsafe6 = unsafe11;
                                        i43 = i10;
                                        if (i62 == 2) {
                                            zzf = zzku.zzf(bArr, i41, zznkVar2, zzktVar5);
                                            i51 = zzf;
                                            unsafe4 = unsafe6;
                                            i39 = i43;
                                            z14 = true;
                                            if (i51 != i41) {
                                            }
                                        } else if (i62 == 0) {
                                            unsafe5 = unsafe6;
                                            i39 = i43;
                                            zzl2 = zzku.zzk(i31, bArr, i41, i10, zznkVar2, zzktVar);
                                            unsafe4 = unsafe5;
                                            i51 = zzl2;
                                            z14 = true;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            i39 = i43;
                                            unsafe4 = unsafe6;
                                            z14 = true;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i40 = i61;
                                        i41 = i64;
                                        unsafe6 = unsafe11;
                                        i43 = i10;
                                        if (i62 == 2) {
                                            zznx zznxVar3 = (zznx) zznkVar2;
                                            zzi2 = zzku.zzi(bArr, i41, zzktVar5);
                                            int i73 = zzktVar5.zza;
                                            int i74 = zzi2 + i73;
                                            if (i74 > bArr.length) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zznxVar3.zzh((i73 / 8) + zznxVar3.size());
                                            while (zzi2 < i74) {
                                                zznxVar3.zzg(zzku.zzp(bArr, zzi2));
                                                zzi2 += 8;
                                            }
                                            if (zzi2 != i74) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i51 = zzi2;
                                            unsafe4 = unsafe6;
                                            i39 = i43;
                                            z14 = true;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            z14 = true;
                                            if (i62 == 1) {
                                                i44 = i41 + 8;
                                                zznx zznxVar4 = (zznx) zznkVar2;
                                                zznxVar4.zzg(zzku.zzp(bArr, i41));
                                                while (i44 < i43) {
                                                    int zzi10 = zzku.zzi(bArr, i44, zzktVar5);
                                                    if (i31 == zzktVar5.zza) {
                                                        zznxVar4.zzg(zzku.zzp(bArr, zzi10));
                                                        i44 = zzi10 + 8;
                                                    } else {
                                                        i51 = i44;
                                                        unsafe4 = unsafe6;
                                                        i39 = i43;
                                                        z14 = true;
                                                        if (i51 != i41) {
                                                        }
                                                    }
                                                }
                                                i51 = i44;
                                                unsafe4 = unsafe6;
                                                i39 = i43;
                                                z14 = true;
                                                if (i51 != i41) {
                                                }
                                            } else {
                                                unsafe4 = unsafe6;
                                                i39 = i43;
                                                i51 = i41;
                                                if (i51 != i41) {
                                                }
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i40 = i61;
                                        i41 = i64;
                                        unsafe6 = unsafe11;
                                        i43 = i10;
                                        if (i62 == 2) {
                                            zzne zzneVar = (zzne) zznkVar2;
                                            zzi2 = zzku.zzi(bArr, i41, zzktVar5);
                                            int i75 = zzktVar5.zza;
                                            int i76 = zzi2 + i75;
                                            if (i76 > bArr.length) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzneVar.zzi((i75 / 4) + zzneVar.size());
                                            while (zzi2 < i76) {
                                                zzneVar.zzh(zzku.zzb(bArr, zzi2));
                                                zzi2 += 4;
                                            }
                                            if (zzi2 != i76) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i51 = zzi2;
                                            unsafe4 = unsafe6;
                                            i39 = i43;
                                            z14 = true;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            if (i62 == 5) {
                                                i44 = i41 + 4;
                                                zzne zzneVar2 = (zzne) zznkVar2;
                                                zzneVar2.zzh(zzku.zzb(bArr, i41));
                                                while (i44 < i43) {
                                                    int zzi11 = zzku.zzi(bArr, i44, zzktVar5);
                                                    if (i31 == zzktVar5.zza) {
                                                        zzneVar2.zzh(zzku.zzb(bArr, zzi11));
                                                        i44 = zzi11 + 4;
                                                    } else {
                                                        i51 = i44;
                                                        unsafe4 = unsafe6;
                                                        i39 = i43;
                                                        z14 = true;
                                                        if (i51 != i41) {
                                                        }
                                                    }
                                                }
                                                i51 = i44;
                                                unsafe4 = unsafe6;
                                                i39 = i43;
                                                z14 = true;
                                                if (i51 != i41) {
                                                }
                                            }
                                            unsafe4 = unsafe6;
                                            i39 = i43;
                                            z14 = true;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                        break;
                                    case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                    case 42:
                                        i40 = i61;
                                        i41 = i64;
                                        unsafe6 = unsafe11;
                                        i43 = i10;
                                        if (i62 == 2) {
                                            zzkv zzkvVar = (zzkv) zznkVar2;
                                            zzi2 = zzku.zzi(bArr, i41, zzktVar5);
                                            int i77 = zzktVar5.zza + zzi2;
                                            while (zzi2 < i77) {
                                                zzi2 = zzku.zzl(bArr, zzi2, zzktVar5);
                                                zzkvVar.zze(zzktVar5.zzb != 0);
                                            }
                                            if (zzi2 != i77) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i51 = zzi2;
                                            unsafe4 = unsafe6;
                                            i39 = i43;
                                            z14 = true;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            if (i62 == 0) {
                                                zzkv zzkvVar2 = (zzkv) zznkVar2;
                                                zzf = zzku.zzl(bArr, i41, zzktVar5);
                                                zzkvVar2.zze(zzktVar5.zzb != 0);
                                                while (zzf < i43) {
                                                    int zzi12 = zzku.zzi(bArr, zzf, zzktVar5);
                                                    if (i31 == zzktVar5.zza) {
                                                        zzf = zzku.zzl(bArr, zzi12, zzktVar5);
                                                        zzkvVar2.zze(zzktVar5.zzb != 0);
                                                    } else {
                                                        i51 = zzf;
                                                        unsafe4 = unsafe6;
                                                        i39 = i43;
                                                        z14 = true;
                                                        if (i51 != i41) {
                                                        }
                                                    }
                                                }
                                                i51 = zzf;
                                                unsafe4 = unsafe6;
                                                i39 = i43;
                                                z14 = true;
                                                if (i51 != i41) {
                                                }
                                            }
                                            unsafe4 = unsafe6;
                                            i39 = i43;
                                            z14 = true;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                        break;
                                    case 26:
                                        i40 = i61;
                                        i41 = i64;
                                        unsafe6 = unsafe11;
                                        i43 = i10;
                                        if (i62 != 2) {
                                            unsafe4 = unsafe6;
                                            i39 = i43;
                                            z14 = true;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        } else if ((j11 & 536870912) == 0) {
                                            i44 = zzku.zzi(bArr, i41, zzktVar5);
                                            int i78 = zzktVar5.zza;
                                            if (i78 < 0) {
                                                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i78 == 0) {
                                                obj6 = "";
                                                zznkVar2.add(obj6);
                                            } else {
                                                obj6 = "";
                                                zznkVar2.add(new String(bArr, i44, i78, zznl.zza));
                                                i44 += i78;
                                            }
                                            while (i44 < i43) {
                                                int zzi13 = zzku.zzi(bArr, i44, zzktVar5);
                                                if (i31 == zzktVar5.zza) {
                                                    i44 = zzku.zzi(bArr, zzi13, zzktVar5);
                                                    int i79 = zzktVar5.zza;
                                                    if (i79 < 0) {
                                                        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i79 == 0) {
                                                        zznkVar2.add(obj6);
                                                    } else {
                                                        zznkVar2.add(new String(bArr, i44, i79, zznl.zza));
                                                        i44 += i79;
                                                    }
                                                } else {
                                                    i51 = i44;
                                                    unsafe4 = unsafe6;
                                                    i39 = i43;
                                                    z14 = true;
                                                    if (i51 != i41) {
                                                    }
                                                }
                                            }
                                            i51 = i44;
                                            unsafe4 = unsafe6;
                                            i39 = i43;
                                            z14 = true;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            zzf = zzku.zzi(bArr, i41, zzktVar5);
                                            int i80 = zzktVar5.zza;
                                            if (i80 < 0) {
                                                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i80 == 0) {
                                                zznkVar2.add("");
                                            } else {
                                                int i81 = zzf + i80;
                                                if (!zzpv.zze(bArr, zzf, i81)) {
                                                    throw new zznn(str);
                                                }
                                                zznkVar2.add(new String(bArr, zzf, i80, zznl.zza));
                                                zzf = i81;
                                            }
                                            while (zzf < i43) {
                                                int zzi14 = zzku.zzi(bArr, zzf, zzktVar5);
                                                if (i31 == zzktVar5.zza) {
                                                    zzf = zzku.zzi(bArr, zzi14, zzktVar5);
                                                    int i82 = zzktVar5.zza;
                                                    if (i82 < 0) {
                                                        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i82 == 0) {
                                                        zznkVar2.add("");
                                                    } else {
                                                        int i83 = zzf + i82;
                                                        if (!zzpv.zze(bArr, zzf, i83)) {
                                                            throw new zznn(str);
                                                        }
                                                        zznkVar2.add(new String(bArr, zzf, i82, zznl.zza));
                                                        zzf = i83;
                                                    }
                                                } else {
                                                    i51 = zzf;
                                                    unsafe4 = unsafe6;
                                                    i39 = i43;
                                                    z14 = true;
                                                    if (i51 != i41) {
                                                    }
                                                }
                                            }
                                            i51 = zzf;
                                            unsafe4 = unsafe6;
                                            i39 = i43;
                                            z14 = true;
                                            if (i51 != i41) {
                                            }
                                        }
                                        break;
                                    case 27:
                                        i45 = i10;
                                        i40 = i61;
                                        i46 = i64;
                                        if (i62 == 2) {
                                            i51 = zzku.zze(zzolVar2.zzx(i40), i31, bArr, i46, i10, zznkVar2, zzktVar);
                                            zzktVar5 = zzktVar;
                                            i31 = i31;
                                            i41 = i46;
                                            unsafe4 = unsafe11;
                                            i39 = i45;
                                            z14 = true;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            zzktVar5 = zzktVar;
                                            unsafe4 = unsafe11;
                                            z14 = true;
                                            int i84 = i46;
                                            i39 = i45;
                                            i41 = i84;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        i45 = i10;
                                        i40 = i61;
                                        i46 = i64;
                                        if (i62 == 2) {
                                            zzi3 = zzku.zzi(bArr, i46, zzktVar5);
                                            int i85 = zzktVar5.zza;
                                            if (i85 < 0) {
                                                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i85 > bArr.length - zzi3) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i85 == 0) {
                                                zznkVar2.add(zzle.zzb);
                                            } else {
                                                zznkVar2.add(zzle.zzk(bArr, zzi3, i85));
                                                zzi3 += i85;
                                            }
                                            while (zzi3 < i45) {
                                                int zzi15 = zzku.zzi(bArr, zzi3, zzktVar5);
                                                if (i31 == zzktVar5.zza) {
                                                    zzi3 = zzku.zzi(bArr, zzi15, zzktVar5);
                                                    int i86 = zzktVar5.zza;
                                                    if (i86 < 0) {
                                                        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i86 > bArr.length - zzi3) {
                                                        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i86 == 0) {
                                                        zznkVar2.add(zzle.zzb);
                                                    } else {
                                                        zznkVar2.add(zzle.zzk(bArr, zzi3, i86));
                                                        zzi3 += i86;
                                                    }
                                                } else {
                                                    i51 = zzi3;
                                                    unsafe4 = unsafe11;
                                                    z14 = true;
                                                    int i87 = i46;
                                                    i39 = i45;
                                                    i41 = i87;
                                                    if (i51 != i41) {
                                                    }
                                                }
                                            }
                                            i51 = zzi3;
                                            unsafe4 = unsafe11;
                                            z14 = true;
                                            int i872 = i46;
                                            i39 = i45;
                                            i41 = i872;
                                            if (i51 != i41) {
                                            }
                                        }
                                        unsafe4 = unsafe11;
                                        z14 = true;
                                        int i842 = i46;
                                        i39 = i45;
                                        i41 = i842;
                                        i51 = i41;
                                        if (i51 != i41) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i45 = i10;
                                        i40 = i61;
                                        i46 = i64;
                                        if (i62 == 2) {
                                            zzk = zzku.zzf(bArr, i46, zznkVar2, zzktVar5);
                                        } else {
                                            if (i62 == 0) {
                                                zzk = zzku.zzk(i31, bArr, i46, i10, zznkVar2, zzktVar);
                                            }
                                            unsafe4 = unsafe11;
                                            z14 = true;
                                            int i8422 = i46;
                                            i39 = i45;
                                            i41 = i8422;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                        i51 = zzk;
                                        zzoy.zzn(obj, i26, zznkVar2, zzolVar2.zzw(i40), null, zzolVar2.zzm);
                                        unsafe4 = unsafe11;
                                        z14 = true;
                                        int i8722 = i46;
                                        i39 = i45;
                                        i41 = i8722;
                                        if (i51 != i41) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i45 = i10;
                                        i40 = i61;
                                        i46 = i64;
                                        if (i62 == 2) {
                                            zzne zzneVar3 = (zzne) zznkVar2;
                                            zzi3 = zzku.zzi(bArr, i46, zzktVar5);
                                            int i88 = zzktVar5.zza + zzi3;
                                            while (zzi3 < i88) {
                                                zzi3 = zzku.zzi(bArr, zzi3, zzktVar5);
                                                zzneVar3.zzh(zzli.zzF(zzktVar5.zza));
                                            }
                                            if (zzi3 != i88) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i51 = zzi3;
                                            unsafe4 = unsafe11;
                                            z14 = true;
                                            int i87222 = i46;
                                            i39 = i45;
                                            i41 = i87222;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            if (i62 == 0) {
                                                zzne zzneVar4 = (zzne) zznkVar2;
                                                zzi4 = zzku.zzi(bArr, i46, zzktVar5);
                                                zzneVar4.zzh(zzli.zzF(zzktVar5.zza));
                                                while (zzi4 < i45) {
                                                    int zzi16 = zzku.zzi(bArr, zzi4, zzktVar5);
                                                    if (i31 == zzktVar5.zza) {
                                                        zzi4 = zzku.zzi(bArr, zzi16, zzktVar5);
                                                        zzneVar4.zzh(zzli.zzF(zzktVar5.zza));
                                                    } else {
                                                        i51 = zzi4;
                                                        unsafe4 = unsafe11;
                                                        z14 = true;
                                                        int i872222 = i46;
                                                        i39 = i45;
                                                        i41 = i872222;
                                                        if (i51 != i41) {
                                                        }
                                                    }
                                                }
                                                i51 = zzi4;
                                                unsafe4 = unsafe11;
                                                z14 = true;
                                                int i8722222 = i46;
                                                i39 = i45;
                                                i41 = i8722222;
                                                if (i51 != i41) {
                                                }
                                            }
                                            unsafe4 = unsafe11;
                                            z14 = true;
                                            int i84222 = i46;
                                            i39 = i45;
                                            i41 = i84222;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i45 = i10;
                                        i40 = i61;
                                        i46 = i64;
                                        if (i62 == 2) {
                                            zznx zznxVar5 = (zznx) zznkVar2;
                                            zzi3 = zzku.zzi(bArr, i46, zzktVar5);
                                            int i89 = zzktVar5.zza + zzi3;
                                            while (zzi3 < i89) {
                                                zzi3 = zzku.zzl(bArr, zzi3, zzktVar5);
                                                zznxVar5.zzg(zzli.zzG(zzktVar5.zzb));
                                            }
                                            if (zzi3 != i89) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i51 = zzi3;
                                            unsafe4 = unsafe11;
                                            z14 = true;
                                            int i87222222 = i46;
                                            i39 = i45;
                                            i41 = i87222222;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            if (i62 == 0) {
                                                zznx zznxVar6 = (zznx) zznkVar2;
                                                zzi4 = zzku.zzl(bArr, i46, zzktVar5);
                                                zznxVar6.zzg(zzli.zzG(zzktVar5.zzb));
                                                while (zzi4 < i45) {
                                                    int zzi17 = zzku.zzi(bArr, zzi4, zzktVar5);
                                                    if (i31 == zzktVar5.zza) {
                                                        zzi4 = zzku.zzl(bArr, zzi17, zzktVar5);
                                                        zznxVar6.zzg(zzli.zzG(zzktVar5.zzb));
                                                    } else {
                                                        i51 = zzi4;
                                                        unsafe4 = unsafe11;
                                                        z14 = true;
                                                        int i872222222 = i46;
                                                        i39 = i45;
                                                        i41 = i872222222;
                                                        if (i51 != i41) {
                                                        }
                                                    }
                                                }
                                                i51 = zzi4;
                                                unsafe4 = unsafe11;
                                                z14 = true;
                                                int i8722222222 = i46;
                                                i39 = i45;
                                                i41 = i8722222222;
                                                if (i51 != i41) {
                                                }
                                            }
                                            unsafe4 = unsafe11;
                                            z14 = true;
                                            int i842222 = i46;
                                            i39 = i45;
                                            i41 = i842222;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                        break;
                                    default:
                                        if (i62 == 3) {
                                            int i90 = (i31 & (-8)) | 4;
                                            zzow zzx = zzolVar2.zzx(i61);
                                            Unsafe unsafe13 = unsafe11;
                                            i40 = i61;
                                            i46 = i64;
                                            zzi4 = zzku.zzc(zzx, bArr, i64, i10, i90, zzktVar);
                                            zznkVar2.add(zzktVar5.zzc);
                                            int i91 = i10;
                                            while (zzi4 < i91) {
                                                int zzi18 = zzku.zzi(bArr, zzi4, zzktVar5);
                                                if (i31 == zzktVar5.zza) {
                                                    zzi4 = zzku.zzc(zzx, bArr, zzi18, i10, i90, zzktVar);
                                                    zznkVar2.add(zzktVar5.zzc);
                                                    i91 = i91;
                                                    unsafe13 = unsafe13;
                                                } else {
                                                    unsafe11 = unsafe13;
                                                    i45 = i91;
                                                    i51 = zzi4;
                                                    unsafe4 = unsafe11;
                                                    z14 = true;
                                                    int i87222222222 = i46;
                                                    i39 = i45;
                                                    i41 = i87222222222;
                                                    if (i51 != i41) {
                                                    }
                                                }
                                            }
                                            unsafe11 = unsafe13;
                                            i45 = i91;
                                            i51 = zzi4;
                                            unsafe4 = unsafe11;
                                            z14 = true;
                                            int i872222222222 = i46;
                                            i39 = i45;
                                            i41 = i872222222222;
                                            if (i51 != i41) {
                                            }
                                        } else {
                                            i40 = i61;
                                            i39 = i10;
                                            i41 = i64;
                                            unsafe4 = unsafe11;
                                            z14 = true;
                                            i51 = i41;
                                            if (i51 != i41) {
                                            }
                                        }
                                        break;
                                }
                            }
                        } else if (i62 == 2) {
                            zznk zznkVar3 = (zznk) unsafe7.getObject(obj7, j);
                            if (!zznkVar3.zzc()) {
                                int size2 = zznkVar3.size();
                                zznkVar3 = zznkVar3.zzd(size2 == 0 ? 10 : size2 + size2);
                                unsafe7.putObject(obj7, j, zznkVar3);
                            }
                            zznk zznkVar4 = zznkVar3;
                            i18 = i59;
                            i51 = zzku.zze(zzolVar2.zzx(i61), i59, bArr, i64, i10, zznkVar4, zzktVar);
                            zzktVar7 = zzktVar;
                            i54 = i61;
                            i53 = i26;
                            i55 = i55;
                            i49 = -1;
                            i52 = i52;
                            i48 = 3;
                            i50 = 1048575;
                            i47 = i10;
                            i56 = i18;
                        } else {
                            i30 = i55;
                            i12 = i52;
                            zzktVar5 = zzktVar;
                            obj4 = obj7;
                            i31 = i59;
                            i32 = i61;
                            i33 = i64;
                            unsafe3 = unsafe7;
                            i14 = i11;
                            unsafe = unsafe3;
                            i18 = i31;
                            zzktVar7 = zzktVar5;
                            i55 = i30;
                            i16 = 3;
                            obj2 = obj4;
                            i57 = i33;
                            i54 = i32;
                            i19 = i26;
                        }
                    } else {
                        int i92 = iArr[i61 + 2];
                        int i93 = 1 << (i92 >>> 20);
                        int i94 = 1048575;
                        int i95 = i92 & 1048575;
                        if (i95 != i52) {
                            if (i52 != 1048575) {
                                unsafe7.putInt(obj7, i52, i55);
                                i94 = 1048575;
                            }
                            i23 = i95;
                            i55 = i95 == i94 ? 0 : unsafe7.getInt(obj7, i95);
                        } else {
                            i23 = i52;
                        }
                        switch (zzt) {
                            case 0:
                                unsafe2 = unsafe7;
                                i27 = i57;
                                i24 = i61;
                                i25 = i59;
                                z8 = true;
                                i17 = -1;
                                i26 = i60;
                                zzktVar3 = zzktVar;
                                if (i62 != 1) {
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i28 = i27 + 8;
                                    i55 |= i93;
                                    zzps.zzo(obj7, j, Double.longBitsToDouble(zzku.zzp(bArr, i27)));
                                    zzktVar7 = zzktVar3;
                                    i53 = i26;
                                    i49 = i17;
                                    i48 = 3;
                                    i50 = 1048575;
                                    i51 = i28;
                                    i56 = i25;
                                    unsafe7 = unsafe2;
                                    i52 = i23;
                                    i54 = i24;
                                    i47 = i10;
                                }
                            case 1:
                                unsafe2 = unsafe7;
                                i27 = i57;
                                i24 = i61;
                                i25 = i59;
                                z8 = true;
                                i17 = -1;
                                i26 = i60;
                                zzktVar3 = zzktVar;
                                if (i62 != 5) {
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i28 = i27 + 4;
                                    i55 |= i93;
                                    zzps.zzp(obj7, j, Float.intBitsToFloat(zzku.zzb(bArr, i27)));
                                    zzktVar7 = zzktVar3;
                                    i53 = i26;
                                    i49 = i17;
                                    i48 = 3;
                                    i50 = 1048575;
                                    i51 = i28;
                                    i56 = i25;
                                    unsafe7 = unsafe2;
                                    i52 = i23;
                                    i54 = i24;
                                    i47 = i10;
                                }
                            case 2:
                            case 3:
                                unsafe2 = unsafe7;
                                i27 = i57;
                                i24 = i61;
                                i25 = i59;
                                z10 = true;
                                i17 = -1;
                                i26 = i60;
                                zzktVar3 = zzktVar;
                                if (i62 != 0) {
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i55 |= i93;
                                    int zzl4 = zzku.zzl(bArr, i27, zzktVar3);
                                    unsafe7 = unsafe2;
                                    i29 = i24;
                                    z11 = true;
                                    unsafe7.putLong(obj, j, zzktVar3.zzb);
                                    i47 = i10;
                                    zzktVar7 = zzktVar3;
                                    i51 = zzl4;
                                    i53 = i26;
                                    i52 = i23;
                                    i49 = i17;
                                    i48 = 3;
                                    i56 = i25;
                                    i54 = i29;
                                    i50 = 1048575;
                                }
                            case 4:
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                unsafe2 = unsafe7;
                                i27 = i57;
                                i24 = i61;
                                i25 = i59;
                                z10 = true;
                                i17 = -1;
                                i26 = i60;
                                zzktVar3 = zzktVar;
                                if (i62 != 0) {
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i55 |= i93;
                                    i28 = zzku.zzi(bArr, i27, zzktVar3);
                                    unsafe2.putInt(obj7, j, zzktVar3.zza);
                                    zzktVar7 = zzktVar3;
                                    i53 = i26;
                                    i49 = i17;
                                    i48 = 3;
                                    i50 = 1048575;
                                    i51 = i28;
                                    i56 = i25;
                                    unsafe7 = unsafe2;
                                    i52 = i23;
                                    i54 = i24;
                                    i47 = i10;
                                }
                            case 5:
                            case 14:
                                unsafe2 = unsafe7;
                                i27 = i57;
                                i24 = i61;
                                i25 = i59;
                                z10 = true;
                                i17 = -1;
                                i26 = i60;
                                if (i62 != 1) {
                                    zzktVar3 = zzktVar;
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i51 = i27 + 8;
                                    i55 |= i93;
                                    unsafe7 = unsafe2;
                                    z12 = true;
                                    i29 = i24;
                                    unsafe7.putLong(obj, j, zzku.zzp(bArr, i27));
                                    i47 = i10;
                                    zzktVar7 = zzktVar;
                                    i53 = i26;
                                    i52 = i23;
                                    i49 = i17;
                                    i48 = 3;
                                    i56 = i25;
                                    i54 = i29;
                                    i50 = 1048575;
                                }
                            case 6:
                            case 13:
                                zzktVar4 = zzktVar;
                                unsafe2 = unsafe7;
                                i27 = i57;
                                i24 = i61;
                                i25 = i59;
                                z10 = true;
                                i17 = -1;
                                i26 = i60;
                                if (i62 != 5) {
                                    zzktVar3 = zzktVar4;
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i51 = i27 + 4;
                                    i55 |= i93;
                                    unsafe2.putInt(obj7, j, zzku.zzb(bArr, i27));
                                    zzktVar7 = zzktVar4;
                                    unsafe7 = unsafe2;
                                    i53 = i26;
                                    i52 = i23;
                                    i49 = i17;
                                    i48 = 3;
                                    i50 = 1048575;
                                    i56 = i25;
                                    i54 = i24;
                                    i47 = i10;
                                }
                            case 7:
                                zzktVar4 = zzktVar;
                                unsafe2 = unsafe7;
                                i27 = i57;
                                i24 = i61;
                                i25 = i59;
                                z10 = true;
                                i17 = -1;
                                i26 = i60;
                                if (i62 != 0) {
                                    zzktVar3 = zzktVar4;
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i55 |= i93;
                                    zzl = zzku.zzl(bArr, i27, zzktVar4);
                                    zzps.zzm(obj7, j, zzktVar4.zzb != 0);
                                    i51 = zzl;
                                    zzktVar7 = zzktVar4;
                                    unsafe7 = unsafe2;
                                    i53 = i26;
                                    i52 = i23;
                                    i49 = i17;
                                    i48 = 3;
                                    i50 = 1048575;
                                    i56 = i25;
                                    i54 = i24;
                                    i47 = i10;
                                }
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                unsafe2 = unsafe7;
                                i27 = i57;
                                i24 = i61;
                                i25 = i59;
                                z10 = true;
                                i17 = -1;
                                i26 = i60;
                                if (i62 != 2) {
                                    zzktVar3 = zzktVar;
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    if (zzM(i63)) {
                                        zzktVar4 = zzktVar;
                                        zzl = zzku.zzi(bArr, i27, zzktVar4);
                                        int i96 = zzktVar4.zza;
                                        if (i96 < 0) {
                                            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        int i97 = i55 | i93;
                                        if (i96 == 0) {
                                            zzktVar4.zzc = "";
                                        } else {
                                            zzktVar4.zzc = zzpv.zzd(bArr, zzl, i96);
                                            zzl += i96;
                                        }
                                        i55 = i97;
                                    } else {
                                        zzktVar4 = zzktVar;
                                        i55 |= i93;
                                        zzl = zzku.zzg(bArr, i27, zzktVar4);
                                    }
                                    unsafe2.putObject(obj7, j, zzktVar4.zzc);
                                    i51 = zzl;
                                    zzktVar7 = zzktVar4;
                                    unsafe7 = unsafe2;
                                    i53 = i26;
                                    i52 = i23;
                                    i49 = i17;
                                    i48 = 3;
                                    i50 = 1048575;
                                    i56 = i25;
                                    i54 = i24;
                                    i47 = i10;
                                }
                            case 9:
                                unsafe2 = unsafe7;
                                i24 = i61;
                                i25 = i59;
                                i17 = -1;
                                i26 = i60;
                                if (i62 != 2) {
                                    zzktVar3 = zzktVar;
                                    i27 = i57;
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i55 |= i93;
                                    Object zzA = zzolVar2.zzA(obj7, i24);
                                    z11 = true;
                                    i29 = i24;
                                    i47 = i10;
                                    zzktVar7 = zzktVar;
                                    int zzn2 = zzku.zzn(zzA, zzolVar2.zzx(i24), bArr, i57, i47, zzktVar7);
                                    zzolVar2.zzJ(obj7, i29, zzA);
                                    i51 = zzn2;
                                    unsafe7 = unsafe2;
                                    i53 = i26;
                                    i52 = i23;
                                    i49 = i17;
                                    i48 = 3;
                                    i56 = i25;
                                    i54 = i29;
                                    i50 = 1048575;
                                }
                            case 10:
                                zzktVar7 = zzktVar;
                                unsafe2 = unsafe7;
                                i24 = i61;
                                i25 = i59;
                                z13 = true;
                                i17 = -1;
                                i26 = i60;
                                if (i62 != 2) {
                                    zzktVar3 = zzktVar7;
                                    i27 = i57;
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i55 |= i93;
                                    zza2 = zzku.zza(bArr, i57, zzktVar7);
                                    unsafe2.putObject(obj7, j, zzktVar7.zzc);
                                    i51 = zza2;
                                    unsafe7 = unsafe2;
                                    i53 = i26;
                                    i52 = i23;
                                    i49 = i17;
                                    i48 = 3;
                                    i50 = 1048575;
                                    i56 = i25;
                                    i54 = i24;
                                    i47 = i10;
                                }
                            case 12:
                                zzktVar7 = zzktVar;
                                unsafe2 = unsafe7;
                                i24 = i61;
                                i25 = i59;
                                z13 = true;
                                i17 = -1;
                                i26 = i60;
                                if (i62 != 0) {
                                    zzktVar3 = zzktVar7;
                                    i27 = i57;
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    zza2 = zzku.zzi(bArr, i57, zzktVar7);
                                    int i98 = zzktVar7.zza;
                                    zznh zzw2 = zzolVar2.zzw(i24);
                                    if ((i63 & Integer.MIN_VALUE) == 0 || zzw2 == null || zzw2.zza(i98)) {
                                        i55 |= i93;
                                        unsafe2.putInt(obj7, j, i98);
                                    } else {
                                        zzd(obj).zzj(i25, Long.valueOf(i98));
                                    }
                                    i51 = zza2;
                                    unsafe7 = unsafe2;
                                    i53 = i26;
                                    i52 = i23;
                                    i49 = i17;
                                    i48 = 3;
                                    i50 = 1048575;
                                    i56 = i25;
                                    i54 = i24;
                                    i47 = i10;
                                }
                            case 15:
                                zzktVar7 = zzktVar;
                                unsafe2 = unsafe7;
                                i24 = i61;
                                i25 = i59;
                                z13 = true;
                                i17 = -1;
                                i26 = i60;
                                if (i62 != 0) {
                                    zzktVar3 = zzktVar7;
                                    i27 = i57;
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i55 |= i93;
                                    zza2 = zzku.zzi(bArr, i57, zzktVar7);
                                    unsafe2.putInt(obj7, j, zzli.zzF(zzktVar7.zza));
                                    i51 = zza2;
                                    unsafe7 = unsafe2;
                                    i53 = i26;
                                    i52 = i23;
                                    i49 = i17;
                                    i48 = 3;
                                    i50 = 1048575;
                                    i56 = i25;
                                    i54 = i24;
                                    i47 = i10;
                                }
                            case 16:
                                i24 = i61;
                                i25 = i59;
                                i17 = -1;
                                i26 = i60;
                                if (i62 != 0) {
                                    unsafe2 = unsafe7;
                                    zzktVar3 = zzktVar;
                                    i27 = i57;
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    i55 |= i93;
                                    int zzl5 = zzku.zzl(bArr, i57, zzktVar);
                                    z12 = true;
                                    i29 = i24;
                                    unsafe7.putLong(obj, j, zzli.zzG(zzktVar.zzb));
                                    i51 = zzl5;
                                    i47 = i10;
                                    zzktVar7 = zzktVar;
                                    i53 = i26;
                                    i52 = i23;
                                    i49 = i17;
                                    i48 = 3;
                                    i56 = i25;
                                    i54 = i29;
                                    i50 = 1048575;
                                }
                            default:
                                i48 = 3;
                                if (i62 != 3) {
                                    i24 = i61;
                                    i25 = i59;
                                    i17 = -1;
                                    i26 = i60;
                                    zzktVar3 = zzktVar;
                                    unsafe2 = unsafe7;
                                    i27 = i57;
                                    i14 = i11;
                                    i57 = i27;
                                    zzktVar7 = zzktVar3;
                                    i18 = i25;
                                    unsafe = unsafe2;
                                    i12 = i23;
                                    i16 = 3;
                                    i54 = i24;
                                    obj2 = obj7;
                                    i19 = i26;
                                    break;
                                } else {
                                    Object zzA2 = zzolVar2.zzA(obj7, i61);
                                    i51 = zzku.zzm(zzA2, zzolVar2.zzx(i61), bArr, i57, i10, (i60 << 3) | 4, zzktVar);
                                    zzolVar2.zzJ(obj7, i61, zzA2);
                                    zzktVar7 = zzktVar;
                                    i55 |= i93;
                                    i54 = i61;
                                    i53 = i60;
                                    i52 = i23;
                                    i49 = -1;
                                    i50 = 1048575;
                                    i47 = i10;
                                    i56 = i59;
                                }
                        }
                    }
                } else {
                    i14 = i11;
                    unsafe = unsafe7;
                    i16 = i48;
                    i12 = i52;
                    i17 = i49;
                    i54 = 0;
                    i18 = i59;
                    obj2 = obj7;
                    i19 = i60;
                }
                if (i18 != i14 || i14 == 0) {
                    if (this.zzh) {
                        zzmo zzmoVar = zzktVar7.zzd;
                        int i99 = zzmo.zzb;
                        int i100 = zzos.zza;
                        if (zzmoVar != zzmo.zza) {
                            zznc zza4 = zzmoVar.zza(this.zzg, i19);
                            if (zza4 == null) {
                                i20 = i18;
                                i21 = 1048575;
                                zzktVar2 = zzktVar7;
                                zzh = zzku.zzh(i18, bArr, i57, i10, zzd(obj), zzktVar);
                            } else {
                                i20 = i18;
                                zzktVar2 = zzktVar7;
                                i21 = 1048575;
                                zzna zznaVar = (zzna) obj2;
                                zznaVar.zzi();
                                zzmt zzmtVar = zznaVar.zzb;
                                zzpw zzpwVar = zza4.zza.zzb;
                                if (zzpwVar == zzpw.zzn) {
                                    zzku.zzi(bArr, i57, zzktVar2);
                                    throw null;
                                }
                                switch (zzpwVar.ordinal()) {
                                    case 0:
                                        i22 = i57 + 8;
                                        obj8 = Double.valueOf(Double.longBitsToDouble(zzku.zzp(bArr, i57)));
                                        i57 = i22;
                                        obj3 = obj8;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    case 1:
                                        i22 = i57 + 4;
                                        obj8 = Float.valueOf(Float.intBitsToFloat(zzku.zzb(bArr, i57)));
                                        i57 = i22;
                                        obj3 = obj8;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    case 2:
                                    case 3:
                                        i57 = zzku.zzl(bArr, i57, zzktVar2);
                                        obj8 = Long.valueOf(zzktVar2.zzb);
                                        obj3 = obj8;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    case 4:
                                    case 12:
                                        i57 = zzku.zzi(bArr, i57, zzktVar2);
                                        obj8 = Integer.valueOf(zzktVar2.zza);
                                        obj3 = obj8;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    case 5:
                                    case 15:
                                        i22 = i57 + 8;
                                        obj8 = Long.valueOf(zzku.zzp(bArr, i57));
                                        i57 = i22;
                                        obj3 = obj8;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    case 6:
                                    case 14:
                                        i22 = i57 + 4;
                                        obj8 = Integer.valueOf(zzku.zzb(bArr, i57));
                                        i57 = i22;
                                        obj3 = obj8;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    case 7:
                                        i57 = zzku.zzl(bArr, i57, zzktVar2);
                                        obj8 = Boolean.valueOf(zzktVar2.zzb != 0);
                                        obj3 = obj8;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    case g.BYTES_FIELD_NUMBER /* 8 */:
                                        i57 = zzku.zzg(bArr, i57, zzktVar2);
                                        obj3 = zzktVar2.zzc;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    case 9:
                                        throw null;
                                    case 10:
                                        throw null;
                                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                        i57 = zzku.zza(bArr, i57, zzktVar2);
                                        obj3 = zzktVar2.zzc;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    case 13:
                                        throw new IllegalStateException("Shouldn't reach here.");
                                    case 16:
                                        i57 = zzku.zzi(bArr, i57, zzktVar2);
                                        obj8 = Integer.valueOf(zzli.zzF(zzktVar2.zza));
                                        obj3 = obj8;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    case 17:
                                        i57 = zzku.zzl(bArr, i57, zzktVar2);
                                        obj8 = Long.valueOf(zzli.zzG(zzktVar2.zzb));
                                        obj3 = obj8;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                    default:
                                        obj3 = obj8;
                                        zzmtVar.zzi(zza4.zza, obj3);
                                        zzh = i57;
                                        break;
                                }
                            }
                            i47 = i10;
                            i56 = i20;
                            zzolVar2 = this;
                            zzktVar7 = zzktVar2;
                            i50 = i21;
                            i49 = i17;
                            i48 = i16;
                            i51 = zzh;
                            i53 = i19;
                            obj7 = obj2;
                            i52 = i12;
                            unsafe7 = unsafe;
                        }
                    }
                    i20 = i18;
                    zzktVar2 = zzktVar7;
                    i21 = 1048575;
                    zzh = zzku.zzh(i20, bArr, i57, i10, zzd(obj), zzktVar);
                    i47 = i10;
                    i56 = i20;
                    zzolVar2 = this;
                    zzktVar7 = zzktVar2;
                    i50 = i21;
                    i49 = i17;
                    i48 = i16;
                    i51 = zzh;
                    i53 = i19;
                    obj7 = obj2;
                    i52 = i12;
                    unsafe7 = unsafe;
                } else {
                    i13 = 1048575;
                    zzolVar = this;
                    i15 = i18;
                    i51 = i57;
                }
            } else {
                unsafe = unsafe7;
                zzolVar = zzolVar2;
                i12 = i52;
                i13 = i50;
                i14 = i11;
                obj2 = obj7;
                i15 = i56;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(f.API_PRIORITY_OTHER);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int zzu = zzu(i7);
                int i10 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i10;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
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
                                ((zznk) zzps.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i7], i7)) {
                        zzx(i7).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i7)) {
                    zzx(i7).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzu = zzu(i7);
            int i10 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i11 = iArr[i7];
            long j = i10;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i7)) {
                        zzps.zzo(obj, j, zzps.zza(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i7)) {
                        zzps.zzp(obj, j, zzps.zzb(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i7)) {
                        zzps.zzm(obj, j, zzps.zzw(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzN(obj2, i7)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i7);
                    break;
                case 10:
                    if (zzN(obj2, i7)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i7)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i7)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i7);
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
                    zznk zznkVar = (zznk) zzps.zzf(obj, j);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j, zznkVar2);
                    break;
                case 50:
                    int i12 = zzoy.zza;
                    zzps.zzs(obj, j, zzod.zzb(zzps.zzf(obj, j), zzps.zzf(obj2, j)));
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
                    if (zzR(obj2, i11, i7)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i11, i7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i7)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i11, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i7);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x01af. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:306:0x0054. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0156  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) {
        Object valueOf;
        int ordinal;
        Object zze;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar = this.zzm;
        Object obj2 = null;
        zzmt zzmtVar = null;
        while (true) {
            try {
                int zzc = zzovVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    int zzu = zzu(zzq);
                    try {
                    } catch (zznm unused) {
                        if (obj2 == null) {
                            obj2 = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                            for (int i7 = this.zzk; i7 < this.zzl; i7++) {
                                zzy(obj, this.zzj[i7], obj2, zzplVar, obj);
                            }
                        }
                    }
                    switch (zzt(zzu)) {
                        case 0:
                            zzps.zzo(obj, zzu & 1048575, zzovVar.zza());
                            zzH(obj, zzq);
                        case 1:
                            zzps.zzp(obj, zzu & 1048575, zzovVar.zzb());
                            zzH(obj, zzq);
                        case 2:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzl());
                            zzH(obj, zzq);
                        case 3:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzo());
                            zzH(obj, zzq);
                        case 4:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzg());
                            zzH(obj, zzq);
                        case 5:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzk());
                            zzH(obj, zzq);
                        case 6:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzf());
                            zzH(obj, zzq);
                        case 7:
                            zzps.zzm(obj, zzu & 1048575, zzovVar.zzN());
                            zzH(obj, zzq);
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                            zzG(obj, zzu, zzovVar);
                            zzH(obj, zzq);
                        case 9:
                            zzoi zzoiVar = (zzoi) zzA(obj, zzq);
                            zzovVar.zzu(zzoiVar, zzx(zzq), zzmoVar);
                            zzJ(obj, zzq, zzoiVar);
                        case 10:
                            zzps.zzs(obj, zzu & 1048575, zzovVar.zzp());
                            zzH(obj, zzq);
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzj());
                            zzH(obj, zzq);
                        case 12:
                            int zze2 = zzovVar.zze();
                            zznh zzw = zzw(zzq);
                            if (zzw != null && !zzw.zza(zze2)) {
                                obj2 = zzoy.zzo(obj, zzc, zze2, obj2, zzplVar);
                            }
                            zzps.zzq(obj, zzu & 1048575, zze2);
                            zzH(obj, zzq);
                            break;
                        case 13:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzh());
                            zzH(obj, zzq);
                        case 14:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzm());
                            zzH(obj, zzq);
                        case 15:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzi());
                            zzH(obj, zzq);
                        case 16:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzn());
                            zzH(obj, zzq);
                        case 17:
                            zzoi zzoiVar2 = (zzoi) zzA(obj, zzq);
                            zzovVar.zzt(zzoiVar2, zzx(zzq), zzmoVar);
                            zzJ(obj, zzq, zzoiVar2);
                        case 18:
                            zzovVar.zzx(zznv.zza(obj, zzu & 1048575));
                        case 19:
                            zzovVar.zzB(zznv.zza(obj, zzu & 1048575));
                        case 20:
                            zzovVar.zzE(zznv.zza(obj, zzu & 1048575));
                        case 21:
                            zzovVar.zzM(zznv.zza(obj, zzu & 1048575));
                        case 22:
                            zzovVar.zzD(zznv.zza(obj, zzu & 1048575));
                        case 23:
                            zzovVar.zzA(zznv.zza(obj, zzu & 1048575));
                        case 24:
                            zzovVar.zzz(zznv.zza(obj, zzu & 1048575));
                        case BlurFactor.DEFAULT_RADIUS /* 25 */:
                            zzovVar.zzv(zznv.zza(obj, zzu & 1048575));
                        case 26:
                            if (zzM(zzu)) {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, zzu & 1048575), true);
                            } else {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, zzu & 1048575), false);
                            }
                        case 27:
                            zzovVar.zzF(zznv.zza(obj, zzu & 1048575), zzx(zzq), zzmoVar);
                        case 28:
                            zzovVar.zzw(zznv.zza(obj, zzu & 1048575));
                        case 29:
                            zzovVar.zzL(zznv.zza(obj, zzu & 1048575));
                        case 30:
                            List zza2 = zznv.zza(obj, zzu & 1048575);
                            zzovVar.zzy(zza2);
                            obj2 = zzoy.zzn(obj, zzc, zza2, zzw(zzq), obj2, zzplVar);
                        case 31:
                            zzovVar.zzG(zznv.zza(obj, zzu & 1048575));
                        case 32:
                            zzovVar.zzH(zznv.zza(obj, zzu & 1048575));
                        case 33:
                            zzovVar.zzI(zznv.zza(obj, zzu & 1048575));
                        case 34:
                            zzovVar.zzJ(zznv.zza(obj, zzu & 1048575));
                        case 35:
                            zzovVar.zzx(zznv.zza(obj, zzu & 1048575));
                        case 36:
                            zzovVar.zzB(zznv.zza(obj, zzu & 1048575));
                        case 37:
                            zzovVar.zzE(zznv.zza(obj, zzu & 1048575));
                        case 38:
                            zzovVar.zzM(zznv.zza(obj, zzu & 1048575));
                        case 39:
                            zzovVar.zzD(zznv.zza(obj, zzu & 1048575));
                        case 40:
                            zzovVar.zzA(zznv.zza(obj, zzu & 1048575));
                        case 41:
                            zzovVar.zzz(zznv.zza(obj, zzu & 1048575));
                        case 42:
                            zzovVar.zzv(zznv.zza(obj, zzu & 1048575));
                        case 43:
                            zzovVar.zzL(zznv.zza(obj, zzu & 1048575));
                        case 44:
                            List zza3 = zznv.zza(obj, zzu & 1048575);
                            zzovVar.zzy(zza3);
                            obj2 = zzoy.zzn(obj, zzc, zza3, zzw(zzq), obj2, zzplVar);
                        case 45:
                            zzovVar.zzG(zznv.zza(obj, zzu & 1048575));
                        case 46:
                            zzovVar.zzH(zznv.zza(obj, zzu & 1048575));
                        case 47:
                            zzovVar.zzI(zznv.zza(obj, zzu & 1048575));
                        case 48:
                            zzovVar.zzJ(zznv.zza(obj, zzu & 1048575));
                        case 49:
                            zzovVar.zzC(zznv.zza(obj, zzu & 1048575), zzx(zzq), zzmoVar);
                        case 50:
                            Object zzz = zzz(zzq);
                            long zzu2 = zzu(zzq) & 1048575;
                            Object zzf = zzps.zzf(obj, zzu2);
                            if (zzf == null) {
                                zzf = zzoc.zza().zzb();
                                zzps.zzs(obj, zzu2, zzf);
                            } else if (zzod.zza(zzf)) {
                                Object zzb2 = zzoc.zza().zzb();
                                zzod.zzb(zzb2, zzf);
                                zzps.zzs(obj, zzu2, zzb2);
                                zzf = zzb2;
                            }
                            throw null;
                            break;
                        case 51:
                            zzps.zzs(obj, zzu & 1048575, Double.valueOf(zzovVar.zza()));
                            zzI(obj, zzc, zzq);
                        case 52:
                            zzps.zzs(obj, zzu & 1048575, Float.valueOf(zzovVar.zzb()));
                            zzI(obj, zzc, zzq);
                        case 53:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzl()));
                            zzI(obj, zzc, zzq);
                        case 54:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzo()));
                            zzI(obj, zzc, zzq);
                        case 55:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                            zzI(obj, zzc, zzq);
                        case 56:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzk()));
                            zzI(obj, zzc, zzq);
                        case 57:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                            zzI(obj, zzc, zzq);
                        case 58:
                            zzps.zzs(obj, zzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                            zzI(obj, zzc, zzq);
                        case 59:
                            zzG(obj, zzu, zzovVar);
                            zzI(obj, zzc, zzq);
                        case 60:
                            zzoi zzoiVar3 = (zzoi) zzB(obj, zzc, zzq);
                            zzovVar.zzu(zzoiVar3, zzx(zzq), zzmoVar);
                            zzK(obj, zzc, zzq, zzoiVar3);
                        case 61:
                            zzps.zzs(obj, zzu & 1048575, zzovVar.zzp());
                            zzI(obj, zzc, zzq);
                        case 62:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                            zzI(obj, zzc, zzq);
                        case 63:
                            int zze3 = zzovVar.zze();
                            zznh zzw2 = zzw(zzq);
                            if (zzw2 != null && !zzw2.zza(zze3)) {
                                obj2 = zzoy.zzo(obj, zzc, zze3, obj2, zzplVar);
                            }
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zze3));
                            zzI(obj, zzc, zzq);
                            break;
                        case 64:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                            zzI(obj, zzc, zzq);
                        case 65:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzm()));
                            zzI(obj, zzc, zzq);
                        case 66:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                            zzI(obj, zzc, zzq);
                        case 67:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzn()));
                            zzI(obj, zzc, zzq);
                        case 68:
                            zzoi zzoiVar4 = (zzoi) zzB(obj, zzc, zzq);
                            zzovVar.zzt(zzoiVar4, zzx(zzq), zzmoVar);
                            zzK(obj, zzc, zzq, zzoiVar4);
                        default:
                            if (obj2 == null) {
                                obj2 = zzplVar.zza(obj);
                            }
                            if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                                for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                                    zzy(obj, this.zzj[i10], obj2, zzplVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i11 = this.zzk; i11 < this.zzl; i11++) {
                        zzy(obj, this.zzj[i11], obj2, zzplVar, obj);
                    }
                } else {
                    zznc zza4 = !this.zzh ? null : zzmoVar.zza(this.zzg, zzc);
                    if (zza4 != null) {
                        if (zzmtVar == null) {
                            zzmtVar = ((zzna) obj).zzi();
                        }
                        zznb zznbVar = zza4.zza;
                        zzpw zzpwVar = zzpw.zzn;
                        zzpw zzpwVar2 = zznbVar.zzb;
                        if (zzpwVar2 == zzpwVar) {
                            zzovVar.zzg();
                            throw null;
                        }
                        switch (zzpwVar2.ordinal()) {
                            case 0:
                                valueOf = Double.valueOf(zzovVar.zza());
                                ordinal = zza4.zza.zzb.ordinal();
                                if ((ordinal != 9 || ordinal == 10) && (zze = zzmtVar.zze(zza4.zza)) != null) {
                                    byte[] bArr = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                }
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 1:
                                valueOf = Float.valueOf(zzovVar.zzb());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                    break;
                                }
                                byte[] bArr2 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 2:
                                valueOf = Long.valueOf(zzovVar.zzl());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 3:
                                valueOf = Long.valueOf(zzovVar.zzo());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 4:
                                valueOf = Integer.valueOf(zzovVar.zzg());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr2222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 5:
                                valueOf = Long.valueOf(zzovVar.zzk());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 6:
                                valueOf = Integer.valueOf(zzovVar.zzf());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr222222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 7:
                                valueOf = Boolean.valueOf(zzovVar.zzN());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr2222222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                valueOf = zzovVar.zzr();
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22222222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 9:
                                Object zze4 = zzmtVar.zze(zza4.zza);
                                if (!(zze4 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzb3 = zzos.zza().zzb(zze4.getClass());
                                if (!((zznd) zze4).zzL()) {
                                    Object zze5 = zzb3.zze();
                                    zzb3.zzg(zze5, zze4);
                                    zzmtVar.zzi(zza4.zza, zze5);
                                    zze4 = zze5;
                                }
                                zzovVar.zzt(zze4, zzb3, zzmoVar);
                                break;
                            case 10:
                                Object zze6 = zzmtVar.zze(zza4.zza);
                                if (!(zze6 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzb4 = zzos.zza().zzb(zze6.getClass());
                                if (!((zznd) zze6).zzL()) {
                                    Object zze7 = zzb4.zze();
                                    zzb4.zzg(zze7, zze6);
                                    zzmtVar.zzi(zza4.zza, zze7);
                                    zze6 = zze7;
                                }
                                zzovVar.zzu(zze6, zzb4, zzmoVar);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                valueOf = zzovVar.zzp();
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr222222222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 12:
                                valueOf = Integer.valueOf(zzovVar.zzj());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr2222222222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 13:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case 14:
                                valueOf = Integer.valueOf(zzovVar.zzh());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22222222222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 15:
                                valueOf = Long.valueOf(zzovVar.zzm());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr222222222222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 16:
                                valueOf = Integer.valueOf(zzovVar.zzi());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr2222222222222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            case 17:
                                valueOf = Long.valueOf(zzovVar.zzn());
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22222222222222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                            default:
                                valueOf = null;
                                ordinal = zza4.zza.zzb.ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr222222222222222 = zznl.zzb;
                                valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                zzmtVar.zzi(zza4.zza, valueOf);
                                break;
                        }
                    } else {
                        if (obj2 == null) {
                            obj2 = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                            for (int i12 = this.zzk; i12 < this.zzl; i12++) {
                                zzy(obj, this.zzj[i12], obj2, zzplVar, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i13 = this.zzk; i13 < this.zzl; i13++) {
                    zzy(obj, this.zzj[i13], obj2, zzplVar, obj);
                }
                if (obj2 != null) {
                    zzplVar.zzj(obj, obj2);
                }
                throw th;
            }
        }
        if (obj2 != null) {
            zzplVar.zzj(obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i7, int i10, zzkt zzktVar) {
        zzc(obj, bArr, i7, i10, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0095. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzpy zzpyVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i7;
        int i10;
        int i11;
        Map.Entry entry2;
        int i12;
        int i13;
        Iterator it2;
        int[] iArr2;
        Map.Entry entry3;
        int i14;
        boolean z8;
        boolean z10;
        boolean z11;
        if (this.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            if (!zzmtVar.zza.isEmpty()) {
                Iterator zzf = zzmtVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i15 = 1048575;
                int i16 = 1048575;
                int i17 = 0;
                i7 = 0;
                while (i7 < iArr.length) {
                    int zzu = zzu(i7);
                    int[] iArr3 = this.zzc;
                    int zzt = zzt(zzu);
                    int i18 = iArr3[i7];
                    if (zzt <= 17) {
                        int i19 = iArr3[i7 + 2];
                        int i20 = i19 & i15;
                        if (i20 != i16) {
                            if (i20 == i15) {
                                i10 = zzt;
                                i17 = 0;
                            } else {
                                i10 = zzt;
                                i17 = unsafe.getInt(obj, i20);
                            }
                            i16 = i20;
                        } else {
                            i10 = zzt;
                        }
                        i11 = i16;
                        entry2 = entry;
                        i12 = i17;
                        i13 = 1 << (i19 >>> 20);
                    } else {
                        i10 = zzt;
                        i11 = i16;
                        entry2 = entry;
                        i12 = i17;
                        i13 = 0;
                    }
                    while (entry2 != null && ((zznb) entry2.getKey()).zza <= i18) {
                        this.zzn.zzb(zzpyVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzu & 1048575;
                    switch (i10) {
                        case 0:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzf(i18, zzps.zza(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 1:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzo(i18, zzps.zzb(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 2:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzt(i18, unsafe.getLong(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 3:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzK(i18, unsafe.getLong(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 4:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzr(i18, unsafe.getInt(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 5:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzm(i18, unsafe.getLong(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 6:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzk(i18, unsafe.getInt(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 7:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzb(i18, zzps.zzw(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzT(i18, unsafe.getObject(obj, j), zzpyVar);
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 9:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzv(i18, unsafe.getObject(obj, j), zzx(i14));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 10:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzd(i18, (zzle) unsafe.getObject(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzI(i18, unsafe.getInt(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 12:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzi(i18, unsafe.getInt(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 13:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzx(i18, unsafe.getInt(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 14:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzz(i18, unsafe.getLong(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 15:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzB(i18, unsafe.getInt(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 16:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i14, i11, i12, i13)) {
                                zzpyVar.zzD(i18, unsafe.getLong(obj, j));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 17:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            if (zzO(obj, i7, i11, i12, i13)) {
                                zzpyVar.zzq(i18, unsafe.getObject(obj, j), zzx(i14));
                            }
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 18:
                            z8 = false;
                            zzoy.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 19:
                            z8 = false;
                            zzoy.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 20:
                            z8 = false;
                            zzoy.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 21:
                            z8 = false;
                            zzoy.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 22:
                            z8 = false;
                            zzoy.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 23:
                            z8 = false;
                            zzoy.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 24:
                            z8 = false;
                            zzoy.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case BlurFactor.DEFAULT_RADIUS /* 25 */:
                            z8 = false;
                            zzoy.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 26:
                            int i21 = this.zzc[i7];
                            List list = (List) unsafe.getObject(obj, j);
                            int i22 = zzoy.zza;
                            if (list != null && !list.isEmpty()) {
                                zzpyVar.zzH(i21, list);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            break;
                        case 27:
                            int i23 = this.zzc[i7];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzow zzx = zzx(i7);
                            int i24 = zzoy.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i25 = 0; i25 < list2.size(); i25++) {
                                    ((zzlo) zzpyVar).zzv(i23, list2.get(i25), zzx);
                                }
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            break;
                        case 28:
                            int i26 = this.zzc[i7];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i27 = zzoy.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzpyVar.zze(i26, list3);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            break;
                        case 29:
                            z10 = false;
                            zzoy.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 30:
                            z10 = false;
                            zzoy.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 31:
                            z10 = false;
                            zzoy.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 32:
                            z10 = false;
                            zzoy.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 33:
                            z10 = false;
                            zzoy.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 34:
                            z10 = false;
                            zzoy.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 35:
                            z11 = true;
                            zzoy.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 36:
                            z11 = true;
                            zzoy.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 37:
                            z11 = true;
                            zzoy.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 38:
                            z11 = true;
                            zzoy.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 39:
                            z11 = true;
                            zzoy.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 40:
                            z11 = true;
                            zzoy.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 41:
                            z11 = true;
                            zzoy.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 42:
                            z11 = true;
                            zzoy.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 43:
                            z11 = true;
                            zzoy.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 44:
                            z11 = true;
                            zzoy.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 45:
                            z11 = true;
                            zzoy.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 46:
                            z11 = true;
                            zzoy.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 47:
                            z11 = true;
                            zzoy.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 48:
                            z11 = true;
                            zzoy.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzpyVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 49:
                            int i28 = this.zzc[i7];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzow zzx2 = zzx(i7);
                            int i29 = zzoy.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i30 = 0; i30 < list4.size(); i30++) {
                                    ((zzlo) zzpyVar).zzq(i28, list4.get(i30), zzx2);
                                }
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 51:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzf(i18, zzn(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 52:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzo(i18, zzo(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 53:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzt(i18, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 54:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzK(i18, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 55:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzr(i18, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 56:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzm(i18, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 57:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzk(i18, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 58:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzb(i18, zzS(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 59:
                            if (zzR(obj, i18, i7)) {
                                zzT(i18, unsafe.getObject(obj, j), zzpyVar);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 60:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzv(i18, unsafe.getObject(obj, j), zzx(i7));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 61:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzd(i18, (zzle) unsafe.getObject(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 62:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzI(i18, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 63:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzi(i18, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 64:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzx(i18, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 65:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzz(i18, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 66:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzB(i18, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 67:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzD(i18, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 68:
                            if (zzR(obj, i18, i7)) {
                                zzpyVar.zzq(i18, unsafe.getObject(obj, j), zzx(i7));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        default:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i14 = i7;
                            i7 = i14 + 3;
                            i16 = i11;
                            i17 = i12;
                            i15 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                    }
                }
                Iterator it3 = it;
                while (entry != null) {
                    this.zzn.zzb(zzpyVar, entry);
                    entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
                }
                ((zznd) obj).zzc.zzl(zzpyVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i152 = 1048575;
        int i162 = 1048575;
        int i172 = 0;
        i7 = 0;
        while (i7 < iArr.length) {
        }
        Iterator it32 = it;
        while (entry != null) {
        }
        ((zznd) obj).zzc.zzl(zzpyVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(Object obj, Object obj2) {
        int i7;
        boolean zzF;
        for (0; i7 < this.zzc.length; i7 + 3) {
            int zzu = zzu(i7);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    i7 = (zzL(obj, obj2, i7) && Double.doubleToLongBits(zzps.zza(obj, j)) == Double.doubleToLongBits(zzps.zza(obj2, j))) ? i7 + 3 : 0;
                    return false;
                case 1:
                    if (zzL(obj, obj2, i7) && Float.floatToIntBits(zzps.zzb(obj, j)) == Float.floatToIntBits(zzps.zzb(obj2, j))) {
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i7) && zzps.zzw(obj, j) == zzps.zzw(obj2, j)) {
                    }
                    return false;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                    }
                    return false;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i7) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i7) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i7) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
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
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    if (zzF) {
                        return false;
                    }
                case 50:
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    if (zzF) {
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
                    long zzr = zzr(i7) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                    }
                    return false;
                default:
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i7;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i12 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i14 = iArr[i12];
            int i15 = iArr2[i14];
            int zzu = zzu(i14);
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
            if ((268435456 & zzu) != 0 && !zzO(obj, i14, i7, i10, i18)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i15, i14) && !zzP(obj, zzu, zzx(i14))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzoc) zzps.zzf(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzps.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzx = zzx(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!zzx.zzl(list.get(i19))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i14, i7, i10, i18) && !zzP(obj, zzu, zzx(i14))) {
                return false;
            }
            i12++;
            i13 = i7;
            i11 = i10;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
