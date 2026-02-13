package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import P1.g;
import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzagc<T> implements zzags<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzaht.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzafz zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzafn zzn;
    private final zzahj zzo;
    private final zzaeg zzp;
    private final zzage zzq;
    private final zzafu zzr;

    private zzagc(int[] iArr, Object[] objArr, int i7, int i10, zzafz zzafzVar, boolean z8, boolean z10, int[] iArr2, int i11, int i12, zzage zzageVar, zzafn zzafnVar, zzahj zzahjVar, zzaeg zzaegVar, zzafu zzafuVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i10;
        this.zzi = zzafzVar instanceof zzaet;
        this.zzj = z8;
        boolean z11 = false;
        if (zzaegVar != null && zzaegVar.zzh(zzafzVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzk = iArr2;
        this.zzl = i11;
        this.zzm = i12;
        this.zzq = zzageVar;
        this.zzn = zzafnVar;
        this.zzo = zzahjVar;
        this.zzp = zzaegVar;
        this.zzg = zzafzVar;
        this.zzr = zzafuVar;
    }

    private static long zzA(Object obj, long j) {
        return ((Long) zzaht.zzf(obj, j)).longValue();
    }

    private final zzaex zzB(int i7) {
        int i10 = i7 / 3;
        return (zzaex) this.zzd[i10 + i10 + 1];
    }

    private final zzags zzC(int i7) {
        int i10 = i7 / 3;
        int i11 = i10 + i10;
        zzags zzagsVar = (zzags) this.zzd[i11];
        if (zzagsVar != null) {
            return zzagsVar;
        }
        zzags zzb2 = zzagh.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzb2;
        return zzb2;
    }

    private final Object zzD(Object obj, int i7, Object obj2, zzahj zzahjVar, Object obj3) {
        int i10 = this.zzc[i7];
        Object zzf = zzaht.zzf(obj, zzz(i7) & 1048575);
        if (zzf == null || zzB(i7) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzE(int i7) {
        int i10 = i7 / 3;
        return this.zzd[i10 + i10];
    }

    private final Object zzF(Object obj, int i7) {
        zzags zzC = zzC(i7);
        int zzz = zzz(i7) & 1048575;
        if (!zzT(obj, i7)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzG(Object obj, int i7, int i10) {
        zzags zzC = zzC(i10);
        if (!zzX(obj, i7, i10)) {
            return zzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i10) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzC.zze();
        if (object != null) {
            zzC.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzH(Class cls, String str) {
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

    private static void zzI(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i7) {
        if (zzT(obj2, i7)) {
            int zzz = zzz(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzz;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzags zzC = zzC(i7);
            if (!zzT(obj, i7)) {
                if (zzW(object)) {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzW(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i7) {
        int i10 = this.zzc[i7];
        if (zzX(obj2, i10, i7)) {
            int zzz = zzz(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzz;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzags zzC = zzC(i7);
            if (!zzX(obj, i10, i7)) {
                if (zzW(object)) {
                    Object zze = zzC.zze();
                    zzC.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzN(obj, i10, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzW(object2)) {
                Object zze2 = zzC.zze();
                zzC.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i7, zzagk zzagkVar) {
        if (zzS(i7)) {
            zzaht.zzs(obj, i7 & 1048575, zzagkVar.zzs());
        } else if (this.zzi) {
            zzaht.zzs(obj, i7 & 1048575, zzagkVar.zzr());
        } else {
            zzaht.zzs(obj, i7 & 1048575, zzagkVar.zzp());
        }
    }

    private final void zzM(Object obj, int i7) {
        int zzw = zzw(i7);
        long j = 1048575 & zzw;
        if (j == 1048575) {
            return;
        }
        zzaht.zzq(obj, j, (1 << (zzw >>> 20)) | zzaht.zzc(obj, j));
    }

    private final void zzN(Object obj, int i7, int i10) {
        zzaht.zzq(obj, zzw(i10) & 1048575, i7);
    }

    private final void zzO(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzz(i7) & 1048575, obj2);
        zzM(obj, i7);
    }

    private final void zzP(Object obj, int i7, int i10, Object obj2) {
        zzb.putObject(obj, zzz(i10) & 1048575, obj2);
        zzN(obj, i7, i10);
    }

    private final void zzQ(zzaib zzaibVar, int i7, Object obj, int i10) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzR(Object obj, Object obj2, int i7) {
        return zzT(obj, i7) == zzT(obj2, i7);
    }

    private static boolean zzS(int i7) {
        return (i7 & 536870912) != 0;
    }

    private final boolean zzT(Object obj, int i7) {
        int zzw = zzw(i7);
        long j = zzw & 1048575;
        if (j != 1048575) {
            return (zzaht.zzc(obj, j) & (1 << (zzw >>> 20))) != 0;
        }
        int zzz = zzz(i7);
        long j10 = zzz & 1048575;
        switch (zzy(zzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzaht.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzaht.zzb(obj, j10)) != 0;
            case 2:
                return zzaht.zzd(obj, j10) != 0;
            case 3:
                return zzaht.zzd(obj, j10) != 0;
            case 4:
                return zzaht.zzc(obj, j10) != 0;
            case 5:
                return zzaht.zzd(obj, j10) != 0;
            case 6:
                return zzaht.zzc(obj, j10) != 0;
            case 7:
                return zzaht.zzw(obj, j10);
            case g.BYTES_FIELD_NUMBER /* 8 */:
                Object zzf = zzaht.zzf(obj, j10);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzadr) {
                    return !zzadr.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzaht.zzf(obj, j10) != null;
            case 10:
                return !zzadr.zzb.equals(zzaht.zzf(obj, j10));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return zzaht.zzc(obj, j10) != 0;
            case 12:
                return zzaht.zzc(obj, j10) != 0;
            case 13:
                return zzaht.zzc(obj, j10) != 0;
            case 14:
                return zzaht.zzd(obj, j10) != 0;
            case 15:
                return zzaht.zzc(obj, j10) != 0;
            case 16:
                return zzaht.zzd(obj, j10) != 0;
            case 17:
                return zzaht.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzT(obj, i7) : (i11 & i12) != 0;
    }

    private static boolean zzV(Object obj, int i7, zzags zzagsVar) {
        return zzagsVar.zzl(zzaht.zzf(obj, i7 & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaet) {
            return ((zzaet) obj).zzaQ();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i7, int i10) {
        return zzaht.zzc(obj, (long) (zzw(i10) & 1048575)) == i7;
    }

    private static boolean zzY(Object obj, long j) {
        return ((Boolean) zzaht.zzf(obj, j)).booleanValue();
    }

    private static final void zzZ(int i7, Object obj, zzaib zzaibVar) {
        if (obj instanceof String) {
            zzaibVar.zzF(i7, (String) obj);
        } else {
            zzaibVar.zzd(i7, (zzadr) obj);
        }
    }

    public static zzahk zzd(Object obj) {
        zzaet zzaetVar = (zzaet) obj;
        zzahk zzahkVar = zzaetVar.zzc;
        if (zzahkVar != zzahk.zzc()) {
            return zzahkVar;
        }
        zzahk zzf = zzahk.zzf();
        zzaetVar.zzc = zzf;
        return zzf;
    }

    public static zzagc zzm(Class cls, zzafw zzafwVar, zzage zzageVar, zzafn zzafnVar, zzahj zzahjVar, zzaeg zzaegVar, zzafu zzafuVar) {
        int i7;
        int charAt;
        int charAt2;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt3;
        int i15;
        char charAt4;
        int i16;
        char charAt5;
        int i17;
        char charAt6;
        int i18;
        char charAt7;
        int i19;
        char charAt8;
        int i20;
        char charAt9;
        int i21;
        char charAt10;
        int i22;
        int i23;
        int i24;
        int i25;
        zzagj zzagjVar;
        int i26;
        int i27;
        Class<?> cls2;
        int i28;
        int i29;
        int i30;
        int i31;
        Field zzH;
        int i32;
        char charAt11;
        int i33;
        int i34;
        Field zzH2;
        Field zzH3;
        int i35;
        char charAt12;
        int i36;
        char charAt13;
        int i37;
        char charAt14;
        int i38;
        char charAt15;
        if (!(zzafwVar instanceof zzagj)) {
            throw null;
        }
        zzagj zzagjVar2 = (zzagj) zzafwVar;
        int zzc = zzagjVar2.zzc();
        String zzd = zzagjVar2.zzd();
        int length = zzd.length();
        int i39 = 0;
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
            i11 = 0;
            charAt = 0;
            charAt2 = 0;
            i13 = 0;
            i12 = 0;
            iArr = zza;
            i10 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt17 = zzd.charAt(i41);
            if (charAt17 >= 55296) {
                int i45 = charAt17 & 8191;
                int i46 = 13;
                while (true) {
                    i21 = i44 + 1;
                    charAt10 = zzd.charAt(i44);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i45 |= (charAt10 & 8191) << i46;
                    i46 += 13;
                    i44 = i21;
                }
                charAt17 = i45 | (charAt10 << i46);
                i44 = i21;
            }
            int i47 = i44 + 1;
            int charAt18 = zzd.charAt(i44);
            if (charAt18 >= 55296) {
                int i48 = charAt18 & 8191;
                int i49 = 13;
                while (true) {
                    i20 = i47 + 1;
                    charAt9 = zzd.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i20;
                }
                charAt18 = i48 | (charAt9 << i49);
                i47 = i20;
            }
            int i50 = i47 + 1;
            int charAt19 = zzd.charAt(i47);
            if (charAt19 >= 55296) {
                int i51 = charAt19 & 8191;
                int i52 = 13;
                while (true) {
                    i19 = i50 + 1;
                    charAt8 = zzd.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i19;
                }
                charAt19 = i51 | (charAt8 << i52);
                i50 = i19;
            }
            int i53 = i50 + 1;
            int charAt20 = zzd.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i18 = i53 + 1;
                    charAt7 = zzd.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i18;
                }
                charAt20 = i54 | (charAt7 << i55);
                i53 = i18;
            }
            int i56 = i53 + 1;
            charAt = zzd.charAt(i53);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i17 = i56 + 1;
                    charAt6 = zzd.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i17;
                }
                charAt = i57 | (charAt6 << i58);
                i56 = i17;
            }
            int i59 = i56 + 1;
            charAt2 = zzd.charAt(i56);
            if (charAt2 >= 55296) {
                int i60 = charAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i16 = i59 + 1;
                    charAt5 = zzd.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i16;
                }
                charAt2 = i60 | (charAt5 << i61);
                i59 = i16;
            }
            int i62 = i59 + 1;
            int charAt21 = zzd.charAt(i59);
            if (charAt21 >= 55296) {
                int i63 = charAt21 & 8191;
                int i64 = 13;
                while (true) {
                    i15 = i62 + 1;
                    charAt4 = zzd.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i15;
                }
                charAt21 = i63 | (charAt4 << i64);
                i62 = i15;
            }
            int i65 = i62 + 1;
            int charAt22 = zzd.charAt(i62);
            if (charAt22 >= 55296) {
                int i66 = charAt22 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i14 = i67 + 1;
                    charAt3 = zzd.charAt(i67);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i66 |= (charAt3 & 8191) << i68;
                    i68 += 13;
                    i67 = i14;
                }
                charAt22 = i66 | (charAt3 << i68);
                i65 = i14;
            }
            int i69 = charAt22 + charAt2 + charAt21;
            int i70 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[i69];
            i39 = charAt17;
            iArr = iArr2;
            i10 = charAt19;
            i11 = i70;
            i12 = charAt22;
            i41 = i65;
            i13 = charAt20;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzagjVar2.zze();
        Class<?> cls3 = zzagjVar2.zza().getClass();
        int i71 = i12 + charAt2;
        int i72 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i72];
        int i73 = i12;
        int i74 = i71;
        int i75 = 0;
        int i76 = 0;
        while (true) {
            boolean z8 = zzc == 2;
            if (i41 >= length) {
                return new zzagc(iArr3, objArr, i10, i13, zzagjVar2.zza(), z8, false, iArr, i12, i71, zzageVar, zzafnVar, zzahjVar, zzaegVar, zzafuVar);
            }
            int i77 = i41 + 1;
            int charAt23 = zzd.charAt(i41);
            int i78 = zzc;
            if (charAt23 >= 55296) {
                int i79 = charAt23 & 8191;
                int i80 = i77;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    charAt14 = zzd.charAt(i80);
                    i22 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i79 |= (charAt14 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                    length = i22;
                }
                charAt23 = i79 | (charAt14 << i81);
                i23 = i37;
            } else {
                i22 = length;
                i23 = i77;
            }
            int i82 = i23 + 1;
            int charAt24 = zzd.charAt(i23);
            if (charAt24 >= 55296) {
                int i83 = charAt24 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i36 = i84 + 1;
                    charAt13 = zzd.charAt(i84);
                    i24 = i13;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i83 |= (charAt13 & 8191) << i85;
                    i85 += 13;
                    i84 = i36;
                    i13 = i24;
                }
                charAt24 = i83 | (charAt13 << i85);
                i25 = i36;
            } else {
                i24 = i13;
                i25 = i82;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i76] = i75;
                i76++;
            }
            int i86 = charAt24 & 255;
            int i87 = i10;
            if (i86 >= 51) {
                int i88 = i25 + 1;
                int charAt25 = zzd.charAt(i25);
                if (charAt25 >= 55296) {
                    int i89 = charAt25 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i35 = i90 + 1;
                        charAt12 = zzd.charAt(i90);
                        zzagjVar = zzagjVar2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i89 |= (charAt12 & 8191) << i91;
                        i91 += 13;
                        i90 = i35;
                        zzagjVar2 = zzagjVar;
                    }
                    charAt25 = i89 | (charAt12 << i91);
                    i34 = i35;
                } else {
                    zzagjVar = zzagjVar2;
                    i34 = i88;
                }
                int i92 = i86 - 51;
                int i93 = i34;
                if (i92 == 9 || i92 == 17) {
                    objArr[X.c.a(i75, 3, 1)] = zze[i11];
                    i11++;
                } else if (i92 == 12 && !z8) {
                    objArr[X.c.a(i75, 3, 1)] = zze[i11];
                    i11++;
                }
                int i94 = charAt25 + charAt25;
                Object obj = zze[i94];
                if (obj instanceof Field) {
                    zzH2 = (Field) obj;
                } else {
                    zzH2 = zzH(cls3, (String) obj);
                    zze[i94] = zzH2;
                }
                int i95 = charAt23;
                i31 = (int) unsafe.objectFieldOffset(zzH2);
                int i96 = i94 + 1;
                Object obj2 = zze[i96];
                if (obj2 instanceof Field) {
                    zzH3 = (Field) obj2;
                } else {
                    zzH3 = zzH(cls3, (String) obj2);
                    zze[i96] = zzH3;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzH3);
                cls2 = cls3;
                i30 = i11;
                i41 = i93;
                i27 = objectFieldOffset;
                i26 = i95;
                i29 = 0;
            } else {
                zzagjVar = zzagjVar2;
                int i97 = charAt23;
                int i98 = i11 + 1;
                Field zzH4 = zzH(cls3, (String) zze[i11]);
                i26 = i97;
                if (i86 == 9 || i86 == 17) {
                    objArr[X.c.a(i75, 3, 1)] = zzH4.getType();
                } else {
                    if (i86 == 27 || i86 == 49) {
                        i33 = i11 + 2;
                        objArr[X.c.a(i75, 3, 1)] = zze[i98];
                    } else if (i86 == 12 || i86 == 30 || i86 == 44) {
                        if (!z8) {
                            i33 = i11 + 2;
                            objArr[X.c.a(i75, 3, 1)] = zze[i98];
                        }
                    } else if (i86 == 50) {
                        int i99 = i73 + 1;
                        iArr[i73] = i75;
                        int i100 = i75 / 3;
                        int i101 = i11 + 2;
                        int i102 = i100 + i100;
                        objArr[i102] = zze[i98];
                        if ((charAt24 & 2048) != 0) {
                            i98 = i11 + 3;
                            objArr[i102 + 1] = zze[i101];
                            i73 = i99;
                        } else {
                            i98 = i101;
                            i73 = i99;
                        }
                    }
                    i98 = i33;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzH4);
                i27 = 1048575;
                if ((charAt24 & 4096) != 4096 || i86 > 17) {
                    cls2 = cls3;
                    i28 = i25;
                    i29 = 0;
                } else {
                    i28 = i25 + 1;
                    int charAt26 = zzd.charAt(i25);
                    if (charAt26 >= 55296) {
                        int i103 = charAt26 & 8191;
                        int i104 = 13;
                        while (true) {
                            i32 = i28 + 1;
                            charAt11 = zzd.charAt(i28);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i103 |= (charAt11 & 8191) << i104;
                            i104 += 13;
                            i28 = i32;
                        }
                        charAt26 = i103 | (charAt11 << i104);
                        i28 = i32;
                    }
                    int i105 = (charAt26 / 32) + i39 + i39;
                    Object obj3 = zze[i105];
                    if (obj3 instanceof Field) {
                        zzH = (Field) obj3;
                    } else {
                        zzH = zzH(cls3, (String) obj3);
                        zze[i105] = zzH;
                    }
                    cls2 = cls3;
                    i29 = charAt26 % 32;
                    i27 = (int) unsafe.objectFieldOffset(zzH);
                }
                if (i86 >= 18 && i86 <= 49) {
                    iArr[i74] = objectFieldOffset2;
                    i74++;
                }
                int i106 = i28;
                i30 = i98;
                i31 = objectFieldOffset2;
                i41 = i106;
            }
            int i107 = i75 + 1;
            iArr3[i75] = i26;
            int i108 = i75 + 2;
            String str = zzd;
            iArr3[i107] = i31 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i86 << 20);
            i75 += 3;
            iArr3[i108] = (i29 << 20) | i27;
            i11 = i30;
            cls3 = cls2;
            i10 = i87;
            zzc = i78;
            zzd = str;
            length = i22;
            i13 = i24;
            zzagjVar2 = zzagjVar;
        }
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzaht.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzaht.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003e. Please report as an issue. */
    private final int zzp(Object obj) {
        int i7;
        int zzn;
        int zzy;
        int zzt;
        boolean z8;
        int zzc;
        int zzy2;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < this.zzc.length) {
            int zzz = zzz(i12);
            int[] iArr = this.zzc;
            int i15 = iArr[i12];
            int zzy3 = zzy(zzz);
            if (zzy3 <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i10;
                int i18 = i16 >>> 20;
                if (i17 != i11) {
                    i14 = unsafe.getInt(obj, i17);
                    i11 = i17;
                }
                i7 = 1 << i18;
            } else {
                i7 = 0;
            }
            long j = zzz & i10;
            switch (zzy3) {
                case 0:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, 8, i13);
                        break;
                    }
                case 1:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, 4, i13);
                        break;
                    }
                case 2:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, zzaea.zzy(unsafe.getLong(obj, j)), i13);
                        break;
                    }
                case 3:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, zzaea.zzy(unsafe.getLong(obj, j)), i13);
                        break;
                    }
                case 4:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, zzaea.zzu(unsafe.getInt(obj, j)), i13);
                        break;
                    }
                case 5:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, 8, i13);
                        break;
                    }
                case 6:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, 4, i13);
                        break;
                    }
                case 7:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, 1, i13);
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzadr)) {
                            i13 = X.c.r(i15 << 3, zzaea.zzw((String) object), i13);
                            break;
                        } else {
                            int i19 = zzaea.zzb;
                            int zzd = ((zzadr) object).zzd();
                            i13 = X.c.r(i15 << 3, zzaea.zzx(zzd) + zzd, i13);
                            break;
                        }
                    }
                case 9:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        zzn = zzagu.zzn(i15, unsafe.getObject(obj, j), zzC(i12));
                        i13 += zzn;
                        break;
                    }
                case 10:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        zzadr zzadrVar = (zzadr) unsafe.getObject(obj, j);
                        int i20 = zzaea.zzb;
                        int zzd2 = zzadrVar.zzd();
                        i13 = X.c.r(i15 << 3, zzaea.zzx(zzd2) + zzd2, i13);
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, zzaea.zzx(unsafe.getInt(obj, j)), i13);
                        break;
                    }
                case 12:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, zzaea.zzu(unsafe.getInt(obj, j)), i13);
                        break;
                    }
                case 13:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, 4, i13);
                        break;
                    }
                case 14:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = X.c.r(i15 << 3, 8, i13);
                        break;
                    }
                case 15:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        int i21 = unsafe.getInt(obj, j);
                        i13 = X.c.r((i21 >> 31) ^ (i21 + i21), zzaea.zzx(i15 << 3), i13);
                        break;
                    }
                case 16:
                    if ((i7 & i14) == 0) {
                        break;
                    } else {
                        long j10 = unsafe.getLong(obj, j);
                        zzy = zzaea.zzy((j10 >> 63) ^ (j10 + j10)) + zzaea.zzx(i15 << 3);
                        i13 += zzy;
                        break;
                    }
                case 17:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        zzy = zzaea.zzt(i15, (zzafz) unsafe.getObject(obj, j), zzC(i12));
                        i13 += zzy;
                        break;
                    }
                case 18:
                    zzn = zzagu.zzg(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzn;
                    break;
                case 19:
                    zzn = zzagu.zze(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzn;
                    break;
                case 20:
                    zzn = zzagu.zzl(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzn;
                    break;
                case 21:
                    zzn = zzagu.zzw(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzn;
                    break;
                case 22:
                    zzn = zzagu.zzj(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzn;
                    break;
                case 23:
                    zzn = zzagu.zzg(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzn;
                    break;
                case 24:
                    zzn = zzagu.zze(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzn;
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    zzn = zzagu.zza(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzn;
                    break;
                case 26:
                    zzt = zzagu.zzt(i15, (List) unsafe.getObject(obj, j));
                    i13 += zzt;
                    break;
                case 27:
                    zzt = zzagu.zzo(i15, (List) unsafe.getObject(obj, j), zzC(i12));
                    i13 += zzt;
                    break;
                case 28:
                    zzt = zzagu.zzb(i15, (List) unsafe.getObject(obj, j));
                    i13 += zzt;
                    break;
                case 29:
                    zzt = zzagu.zzu(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzt;
                    break;
                case 30:
                    z8 = false;
                    zzc = zzagu.zzc(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzc;
                    break;
                case 31:
                    z8 = false;
                    zzc = zzagu.zze(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzc;
                    break;
                case 32:
                    z8 = false;
                    zzc = zzagu.zzg(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzc;
                    break;
                case 33:
                    z8 = false;
                    zzc = zzagu.zzp(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzc;
                    break;
                case 34:
                    z8 = false;
                    zzc = zzagu.zzr(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzc;
                    break;
                case 35:
                    int zzh = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzh), zzh, i13);
                    }
                    break;
                case 36:
                    int zzf = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzf), zzf, i13);
                    }
                    break;
                case 37:
                    int zzm = zzagu.zzm((List) unsafe.getObject(obj, j));
                    if (zzm > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzm), zzm, i13);
                    }
                    break;
                case 38:
                    int zzx = zzagu.zzx((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzx), zzx, i13);
                    }
                    break;
                case 39:
                    int zzk = zzagu.zzk((List) unsafe.getObject(obj, j));
                    if (zzk > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzk), zzk, i13);
                    }
                    break;
                case 40:
                    int zzh2 = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh2 > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzh2), zzh2, i13);
                    }
                    break;
                case 41:
                    int zzf2 = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzf2 > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzf2), zzf2, i13);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i22 = zzagu.zza;
                    int size = list.size();
                    if (size > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(size), size, i13);
                    }
                    break;
                case 43:
                    int zzv = zzagu.zzv((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzv), zzv, i13);
                    }
                    break;
                case 44:
                    int zzd3 = zzagu.zzd((List) unsafe.getObject(obj, j));
                    if (zzd3 > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzd3), zzd3, i13);
                    }
                    break;
                case 45:
                    int zzf3 = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzf3 > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzf3), zzf3, i13);
                    }
                    break;
                case 46:
                    int zzh3 = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh3 > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzh3), zzh3, i13);
                    }
                    break;
                case 47:
                    int zzq = zzagu.zzq((List) unsafe.getObject(obj, j));
                    if (zzq > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzq), zzq, i13);
                    }
                    break;
                case 48:
                    int zzs = zzagu.zzs((List) unsafe.getObject(obj, j));
                    if (zzs > 0) {
                        i13 = X.c.s(i15 << 3, zzaea.zzx(zzs), zzs, i13);
                    }
                    break;
                case 49:
                    zzt = zzagu.zzi(i15, (List) unsafe.getObject(obj, j), zzC(i12));
                    i13 += zzt;
                    break;
                case 50:
                    zzafu.zza(i15, unsafe.getObject(obj, j), zzE(i12));
                    break;
                case 51:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, 8, i13);
                    }
                    break;
                case 52:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, 4, i13);
                    }
                    break;
                case 53:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, zzaea.zzy(zzA(obj, j)), i13);
                    }
                    break;
                case 54:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, zzaea.zzy(zzA(obj, j)), i13);
                    }
                    break;
                case 55:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, zzaea.zzu(zzq(obj, j)), i13);
                    }
                    break;
                case 56:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, 8, i13);
                    }
                    break;
                case 57:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, 4, i13);
                    }
                    break;
                case 58:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, 1, i13);
                    }
                    break;
                case 59:
                    if (zzX(obj, i15, i12)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzadr) {
                            int i23 = zzaea.zzb;
                            int zzd4 = ((zzadr) object2).zzd();
                            i13 = X.c.r(i15 << 3, zzaea.zzx(zzd4) + zzd4, i13);
                        } else {
                            i13 = X.c.r(i15 << 3, zzaea.zzw((String) object2), i13);
                        }
                    }
                    break;
                case 60:
                    if (zzX(obj, i15, i12)) {
                        zzt = zzagu.zzn(i15, unsafe.getObject(obj, j), zzC(i12));
                        i13 += zzt;
                    }
                    break;
                case 61:
                    if (zzX(obj, i15, i12)) {
                        zzadr zzadrVar2 = (zzadr) unsafe.getObject(obj, j);
                        int i24 = zzaea.zzb;
                        int zzd5 = zzadrVar2.zzd();
                        i13 = X.c.r(i15 << 3, zzaea.zzx(zzd5) + zzd5, i13);
                    }
                    break;
                case 62:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, zzaea.zzx(zzq(obj, j)), i13);
                    }
                    break;
                case 63:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, zzaea.zzu(zzq(obj, j)), i13);
                    }
                    break;
                case 64:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, 4, i13);
                    }
                    break;
                case 65:
                    if (zzX(obj, i15, i12)) {
                        i13 = X.c.r(i15 << 3, 8, i13);
                    }
                    break;
                case 66:
                    if (zzX(obj, i15, i12)) {
                        int zzq2 = zzq(obj, j);
                        i13 = X.c.r((zzq2 >> 31) ^ (zzq2 + zzq2), zzaea.zzx(i15 << 3), i13);
                    }
                    break;
                case 67:
                    if (zzX(obj, i15, i12)) {
                        long zzA = zzA(obj, j);
                        zzy2 = zzaea.zzy((zzA >> 63) ^ (zzA + zzA)) + zzaea.zzx(i15 << 3);
                        i13 += zzy2;
                    }
                    break;
                case 68:
                    if (zzX(obj, i15, i12)) {
                        zzy2 = zzaea.zzt(i15, (zzafz) unsafe.getObject(obj, j), zzC(i12));
                        i13 += zzy2;
                    }
                    break;
            }
            i12 += 3;
            i10 = 1048575;
        }
        zzahj zzahjVar = this.zzo;
        int zza2 = i13 + zzahjVar.zza(zzahjVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private static int zzq(Object obj, long j) {
        return ((Integer) zzaht.zzf(obj, j)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i7, int i10, int i11, long j, zzade zzadeVar) {
        Unsafe unsafe = zzb;
        Object zzE = zzE(i11);
        Object object = unsafe.getObject(obj, j);
        if (zzafu.zzb(object)) {
            zzaft zzb2 = zzaft.zza().zzb();
            zzafu.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j, int i16, zzade zzadeVar) {
        Unsafe unsafe = zzb;
        long j10 = this.zzc[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzadf.zzp(bArr, i7))));
                    int i17 = i7 + 8;
                    unsafe.putInt(obj, j10, i12);
                    return i17;
                }
                break;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzadf.zzb(bArr, i7))));
                    int i18 = i7 + 4;
                    unsafe.putInt(obj, j10, i12);
                    return i18;
                }
                break;
            case 53:
            case 54:
                if (i13 == 0) {
                    int zzm = zzadf.zzm(bArr, i7, zzadeVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzadeVar.zzb));
                    unsafe.putInt(obj, j10, i12);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i13 == 0) {
                    int zzj = zzadf.zzj(bArr, i7, zzadeVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzadeVar.zza));
                    unsafe.putInt(obj, j10, i12);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzadf.zzp(bArr, i7)));
                    int i19 = i7 + 8;
                    unsafe.putInt(obj, j10, i12);
                    return i19;
                }
                break;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzadf.zzb(bArr, i7)));
                    int i20 = i7 + 4;
                    unsafe.putInt(obj, j10, i12);
                    return i20;
                }
                break;
            case 58:
                if (i13 == 0) {
                    int zzm2 = zzadf.zzm(bArr, i7, zzadeVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzadeVar.zzb != 0));
                    unsafe.putInt(obj, j10, i12);
                    return zzm2;
                }
                break;
            case 59:
                if (i13 == 2) {
                    int zzj2 = zzadf.zzj(bArr, i7, zzadeVar);
                    int i21 = zzadeVar.zza;
                    if (i21 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i14 & 536870912) != 0 && !zzahy.zzi(bArr, zzj2, zzj2 + i21)) {
                            throw zzafc.zzd();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i21, zzafa.zzb));
                        zzj2 += i21;
                    }
                    unsafe.putInt(obj, j10, i12);
                    return zzj2;
                }
                break;
            case 60:
                if (i13 == 2) {
                    Object zzG = zzG(obj, i12, i16);
                    int zzo = zzadf.zzo(zzG, zzC(i16), bArr, i7, i10, zzadeVar);
                    zzP(obj, i12, i16, zzG);
                    return zzo;
                }
                break;
            case 61:
                if (i13 == 2) {
                    int zza2 = zzadf.zza(bArr, i7, zzadeVar);
                    unsafe.putObject(obj, j, zzadeVar.zzc);
                    unsafe.putInt(obj, j10, i12);
                    return zza2;
                }
                break;
            case 63:
                if (i13 == 0) {
                    int zzj3 = zzadf.zzj(bArr, i7, zzadeVar);
                    int i22 = zzadeVar.zza;
                    zzaex zzB = zzB(i16);
                    if (zzB == null || zzB.zza(i22)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i22));
                        unsafe.putInt(obj, j10, i12);
                    } else {
                        zzd(obj).zzj(i11, Long.valueOf(i22));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i13 == 0) {
                    int zzj4 = zzadf.zzj(bArr, i7, zzadeVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzadv.zzs(zzadeVar.zza)));
                    unsafe.putInt(obj, j10, i12);
                    return zzj4;
                }
                break;
            case 67:
                if (i13 == 0) {
                    int zzm3 = zzadf.zzm(bArr, i7, zzadeVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzadv.zzt(zzadeVar.zzb)));
                    unsafe.putInt(obj, j10, i12);
                    return zzm3;
                }
                break;
            case 68:
                if (i13 == 3) {
                    Object zzG2 = zzG(obj, i12, i16);
                    int zzn = zzadf.zzn(zzG2, zzC(i16), bArr, i7, i10, (i11 & (-8)) | 4, zzadeVar);
                    zzP(obj, i12, i16, zzG2);
                    return zzn;
                }
                break;
        }
        return i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0037. Please report as an issue. */
    private final int zzt(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, long j, int i15, long j10, zzade zzadeVar) {
        int i16;
        int i17;
        int i18;
        int i19;
        int zzj;
        int i20 = i7;
        Unsafe unsafe = zzb;
        zzaez zzaezVar = (zzaez) unsafe.getObject(obj, j10);
        if (!zzaezVar.zzc()) {
            int size = zzaezVar.size();
            zzaezVar = zzaezVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j10, zzaezVar);
        }
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    zzaec zzaecVar = (zzaec) zzaezVar;
                    int zzj2 = zzadf.zzj(bArr, i20, zzadeVar);
                    int i21 = zzadeVar.zza + zzj2;
                    while (zzj2 < i21) {
                        zzaecVar.zze(Double.longBitsToDouble(zzadf.zzp(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i21) {
                        return zzj2;
                    }
                    throw zzafc.zzi();
                }
                if (i13 == 1) {
                    zzaec zzaecVar2 = (zzaec) zzaezVar;
                    zzaecVar2.zze(Double.longBitsToDouble(zzadf.zzp(bArr, i7)));
                    while (true) {
                        i16 = i20 + 8;
                        if (i16 < i10) {
                            i20 = zzadf.zzj(bArr, i16, zzadeVar);
                            if (i11 == zzadeVar.zza) {
                                zzaecVar2.zze(Double.longBitsToDouble(zzadf.zzp(bArr, i20)));
                            }
                        }
                    }
                    return i16;
                }
                return i20;
            case 19:
            case 36:
                if (i13 == 2) {
                    zzaem zzaemVar = (zzaem) zzaezVar;
                    int zzj3 = zzadf.zzj(bArr, i20, zzadeVar);
                    int i22 = zzadeVar.zza + zzj3;
                    while (zzj3 < i22) {
                        zzaemVar.zze(Float.intBitsToFloat(zzadf.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i22) {
                        return zzj3;
                    }
                    throw zzafc.zzi();
                }
                if (i13 == 5) {
                    zzaem zzaemVar2 = (zzaem) zzaezVar;
                    zzaemVar2.zze(Float.intBitsToFloat(zzadf.zzb(bArr, i7)));
                    while (true) {
                        i17 = i20 + 4;
                        if (i17 < i10) {
                            i20 = zzadf.zzj(bArr, i17, zzadeVar);
                            if (i11 == zzadeVar.zza) {
                                zzaemVar2.zze(Float.intBitsToFloat(zzadf.zzb(bArr, i20)));
                            }
                        }
                    }
                    return i17;
                }
                return i20;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    zzafo zzafoVar = (zzafo) zzaezVar;
                    int zzj4 = zzadf.zzj(bArr, i20, zzadeVar);
                    int i23 = zzadeVar.zza + zzj4;
                    while (zzj4 < i23) {
                        zzj4 = zzadf.zzm(bArr, zzj4, zzadeVar);
                        zzafoVar.zzf(zzadeVar.zzb);
                    }
                    if (zzj4 == i23) {
                        return zzj4;
                    }
                    throw zzafc.zzi();
                }
                if (i13 == 0) {
                    zzafo zzafoVar2 = (zzafo) zzaezVar;
                    int zzm = zzadf.zzm(bArr, i20, zzadeVar);
                    zzafoVar2.zzf(zzadeVar.zzb);
                    while (zzm < i10) {
                        int zzj5 = zzadf.zzj(bArr, zzm, zzadeVar);
                        if (i11 != zzadeVar.zza) {
                            return zzm;
                        }
                        zzm = zzadf.zzm(bArr, zzj5, zzadeVar);
                        zzafoVar2.zzf(zzadeVar.zzb);
                    }
                    return zzm;
                }
                return i20;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return zzadf.zzf(bArr, i20, zzaezVar, zzadeVar);
                }
                if (i13 == 0) {
                    return zzadf.zzl(i11, bArr, i7, i10, zzaezVar, zzadeVar);
                }
                return i20;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    zzafo zzafoVar3 = (zzafo) zzaezVar;
                    int zzj6 = zzadf.zzj(bArr, i20, zzadeVar);
                    int i24 = zzadeVar.zza + zzj6;
                    while (zzj6 < i24) {
                        zzafoVar3.zzf(zzadf.zzp(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i24) {
                        return zzj6;
                    }
                    throw zzafc.zzi();
                }
                if (i13 == 1) {
                    zzafo zzafoVar4 = (zzafo) zzaezVar;
                    zzafoVar4.zzf(zzadf.zzp(bArr, i7));
                    while (true) {
                        i18 = i20 + 8;
                        if (i18 < i10) {
                            i20 = zzadf.zzj(bArr, i18, zzadeVar);
                            if (i11 == zzadeVar.zza) {
                                zzafoVar4.zzf(zzadf.zzp(bArr, i20));
                            }
                        }
                    }
                    return i18;
                }
                return i20;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    zzaeu zzaeuVar = (zzaeu) zzaezVar;
                    int zzj7 = zzadf.zzj(bArr, i20, zzadeVar);
                    int i25 = zzadeVar.zza + zzj7;
                    while (zzj7 < i25) {
                        zzaeuVar.zzg(zzadf.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i25) {
                        return zzj7;
                    }
                    throw zzafc.zzi();
                }
                if (i13 == 5) {
                    zzaeu zzaeuVar2 = (zzaeu) zzaezVar;
                    zzaeuVar2.zzg(zzadf.zzb(bArr, i7));
                    while (true) {
                        i19 = i20 + 4;
                        if (i19 < i10) {
                            i20 = zzadf.zzj(bArr, i19, zzadeVar);
                            if (i11 == zzadeVar.zza) {
                                zzaeuVar2.zzg(zzadf.zzb(bArr, i20));
                            }
                        }
                    }
                    return i19;
                }
                return i20;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
            case 42:
                if (i13 == 2) {
                    zzadg zzadgVar = (zzadg) zzaezVar;
                    zzj = zzadf.zzj(bArr, i20, zzadeVar);
                    int i26 = zzadeVar.zza + zzj;
                    while (zzj < i26) {
                        zzj = zzadf.zzm(bArr, zzj, zzadeVar);
                        zzadgVar.zze(zzadeVar.zzb != 0);
                    }
                    if (zzj != i26) {
                        throw zzafc.zzi();
                    }
                    return zzj;
                }
                if (i13 == 0) {
                    zzadg zzadgVar2 = (zzadg) zzaezVar;
                    int zzm2 = zzadf.zzm(bArr, i20, zzadeVar);
                    zzadgVar2.zze(zzadeVar.zzb != 0);
                    while (zzm2 < i10) {
                        int zzj8 = zzadf.zzj(bArr, zzm2, zzadeVar);
                        if (i11 != zzadeVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzadf.zzm(bArr, zzj8, zzadeVar);
                        zzadgVar2.zze(zzadeVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i20;
            case 26:
                if (i13 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj9 = zzadf.zzj(bArr, i20, zzadeVar);
                        int i27 = zzadeVar.zza;
                        if (i27 < 0) {
                            throw zzafc.zzf();
                        }
                        if (i27 == 0) {
                            zzaezVar.add("");
                        } else {
                            zzaezVar.add(new String(bArr, zzj9, i27, zzafa.zzb));
                            zzj9 += i27;
                        }
                        while (zzj9 < i10) {
                            int zzj10 = zzadf.zzj(bArr, zzj9, zzadeVar);
                            if (i11 != zzadeVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzadf.zzj(bArr, zzj10, zzadeVar);
                            int i28 = zzadeVar.zza;
                            if (i28 < 0) {
                                throw zzafc.zzf();
                            }
                            if (i28 == 0) {
                                zzaezVar.add("");
                            } else {
                                zzaezVar.add(new String(bArr, zzj9, i28, zzafa.zzb));
                                zzj9 += i28;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzadf.zzj(bArr, i20, zzadeVar);
                    int i29 = zzadeVar.zza;
                    if (i29 < 0) {
                        throw zzafc.zzf();
                    }
                    if (i29 == 0) {
                        zzaezVar.add("");
                    } else {
                        int i30 = zzj11 + i29;
                        if (!zzahy.zzi(bArr, zzj11, i30)) {
                            throw zzafc.zzd();
                        }
                        zzaezVar.add(new String(bArr, zzj11, i29, zzafa.zzb));
                        zzj11 = i30;
                    }
                    while (zzj11 < i10) {
                        int zzj12 = zzadf.zzj(bArr, zzj11, zzadeVar);
                        if (i11 != zzadeVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzadf.zzj(bArr, zzj12, zzadeVar);
                        int i31 = zzadeVar.zza;
                        if (i31 < 0) {
                            throw zzafc.zzf();
                        }
                        if (i31 == 0) {
                            zzaezVar.add("");
                        } else {
                            int i32 = zzj11 + i31;
                            if (!zzahy.zzi(bArr, zzj11, i32)) {
                                throw zzafc.zzd();
                            }
                            zzaezVar.add(new String(bArr, zzj11, i31, zzafa.zzb));
                            zzj11 = i32;
                        }
                    }
                    return zzj11;
                }
                return i20;
            case 27:
                if (i13 == 2) {
                    return zzadf.zze(zzC(i14), i11, bArr, i7, i10, zzaezVar, zzadeVar);
                }
                return i20;
            case 28:
                if (i13 == 2) {
                    int zzj13 = zzadf.zzj(bArr, i20, zzadeVar);
                    int i33 = zzadeVar.zza;
                    if (i33 < 0) {
                        throw zzafc.zzf();
                    }
                    if (i33 > bArr.length - zzj13) {
                        throw zzafc.zzi();
                    }
                    if (i33 == 0) {
                        zzaezVar.add(zzadr.zzb);
                    } else {
                        zzaezVar.add(zzadr.zzs(bArr, zzj13, i33));
                        zzj13 += i33;
                    }
                    while (zzj13 < i10) {
                        int zzj14 = zzadf.zzj(bArr, zzj13, zzadeVar);
                        if (i11 != zzadeVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzadf.zzj(bArr, zzj14, zzadeVar);
                        int i34 = zzadeVar.zza;
                        if (i34 < 0) {
                            throw zzafc.zzf();
                        }
                        if (i34 > bArr.length - zzj13) {
                            throw zzafc.zzi();
                        }
                        if (i34 == 0) {
                            zzaezVar.add(zzadr.zzb);
                        } else {
                            zzaezVar.add(zzadr.zzs(bArr, zzj13, i34));
                            zzj13 += i34;
                        }
                    }
                    return zzj13;
                }
                return i20;
            case 30:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        zzj = zzadf.zzl(i11, bArr, i7, i10, zzaezVar, zzadeVar);
                    }
                    return i20;
                }
                zzj = zzadf.zzf(bArr, i20, zzaezVar, zzadeVar);
                zzagu.zzB(obj, i12, zzaezVar, zzB(i14), null, this.zzo);
                return zzj;
            case 33:
            case 47:
                if (i13 == 2) {
                    zzaeu zzaeuVar3 = (zzaeu) zzaezVar;
                    int zzj15 = zzadf.zzj(bArr, i20, zzadeVar);
                    int i35 = zzadeVar.zza + zzj15;
                    while (zzj15 < i35) {
                        zzj15 = zzadf.zzj(bArr, zzj15, zzadeVar);
                        zzaeuVar3.zzg(zzadv.zzs(zzadeVar.zza));
                    }
                    if (zzj15 == i35) {
                        return zzj15;
                    }
                    throw zzafc.zzi();
                }
                if (i13 == 0) {
                    zzaeu zzaeuVar4 = (zzaeu) zzaezVar;
                    int zzj16 = zzadf.zzj(bArr, i20, zzadeVar);
                    zzaeuVar4.zzg(zzadv.zzs(zzadeVar.zza));
                    while (zzj16 < i10) {
                        int zzj17 = zzadf.zzj(bArr, zzj16, zzadeVar);
                        if (i11 != zzadeVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzadf.zzj(bArr, zzj17, zzadeVar);
                        zzaeuVar4.zzg(zzadv.zzs(zzadeVar.zza));
                    }
                    return zzj16;
                }
                return i20;
            case 34:
            case 48:
                if (i13 == 2) {
                    zzafo zzafoVar5 = (zzafo) zzaezVar;
                    int zzj18 = zzadf.zzj(bArr, i20, zzadeVar);
                    int i36 = zzadeVar.zza + zzj18;
                    while (zzj18 < i36) {
                        zzj18 = zzadf.zzm(bArr, zzj18, zzadeVar);
                        zzafoVar5.zzf(zzadv.zzt(zzadeVar.zzb));
                    }
                    if (zzj18 == i36) {
                        return zzj18;
                    }
                    throw zzafc.zzi();
                }
                if (i13 == 0) {
                    zzafo zzafoVar6 = (zzafo) zzaezVar;
                    int zzm3 = zzadf.zzm(bArr, i20, zzadeVar);
                    zzafoVar6.zzf(zzadv.zzt(zzadeVar.zzb));
                    while (zzm3 < i10) {
                        int zzj19 = zzadf.zzj(bArr, zzm3, zzadeVar);
                        if (i11 != zzadeVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzadf.zzm(bArr, zzj19, zzadeVar);
                        zzafoVar6.zzf(zzadv.zzt(zzadeVar.zzb));
                    }
                    return zzm3;
                }
                return i20;
            default:
                if (i13 == 3) {
                    zzags zzC = zzC(i14);
                    int i37 = (i11 & (-8)) | 4;
                    int zzc = zzadf.zzc(zzC, bArr, i7, i10, i37, zzadeVar);
                    zzaezVar.add(zzadeVar.zzc);
                    while (zzc < i10) {
                        int zzj20 = zzadf.zzj(bArr, zzc, zzadeVar);
                        if (i11 != zzadeVar.zza) {
                            return zzc;
                        }
                        zzc = zzadf.zzc(zzC, bArr, zzj20, i10, i37, zzadeVar);
                        zzaezVar.add(zzadeVar.zzc);
                    }
                    return zzc;
                }
                return i20;
        }
    }

    private final int zzu(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzx(i7, 0);
    }

    private final int zzv(int i7, int i10) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzx(i7, i10);
    }

    private final int zzw(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzx(int i7, int i10) {
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

    private static int zzy(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzz(int i7) {
        return this.zzc[i7 + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003b. Please report as an issue. */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final int zza(Object obj) {
        int zzn;
        int zzx;
        int zzy;
        int zzt;
        if (!this.zzj) {
            return zzp(obj);
        }
        Unsafe unsafe = zzb;
        int i7 = 0;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzz = zzz(i10);
            int zzy2 = zzy(zzz);
            int i11 = this.zzc[i10];
            int i12 = zzz & 1048575;
            if (zzy2 >= zzael.zzJ.zza() && zzy2 <= zzael.zzW.zza()) {
                int i13 = this.zzc[i10 + 2];
            }
            long j = i12;
            switch (zzy2) {
                case 0:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, zzaea.zzy(zzaht.zzd(obj, j)), i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, zzaea.zzy(zzaht.zzd(obj, j)), i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, zzaea.zzu(zzaht.zzc(obj, j)), i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzT(obj, i10)) {
                        Object zzf = zzaht.zzf(obj, j);
                        if (zzf instanceof zzadr) {
                            int i14 = i11 << 3;
                            int i15 = zzaea.zzb;
                            int zzd = ((zzadr) zzf).zzd();
                            i7 = X.c.r(i14, zzaea.zzx(zzd) + zzd, i7);
                            break;
                        } else {
                            i7 = X.c.r(i11 << 3, zzaea.zzw((String) zzf), i7);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzT(obj, i10)) {
                        zzn = zzagu.zzn(i11, zzaht.zzf(obj, j), zzC(i10));
                        i7 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzT(obj, i10)) {
                        zzadr zzadrVar = (zzadr) zzaht.zzf(obj, j);
                        int i16 = i11 << 3;
                        int i17 = zzaea.zzb;
                        int zzd2 = zzadrVar.zzd();
                        i7 = X.c.r(i16, zzaea.zzx(zzd2) + zzd2, i7);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, zzaea.zzx(zzaht.zzc(obj, j)), i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, zzaea.zzu(zzaht.zzc(obj, j)), i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj, i10)) {
                        i7 = X.c.r(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj, i10)) {
                        int zzc = zzaht.zzc(obj, j);
                        i7 = X.c.r((zzc >> 31) ^ (zzc + zzc), zzaea.zzx(i11 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj, i10)) {
                        long zzd3 = zzaht.zzd(obj, j);
                        zzx = zzaea.zzx(i11 << 3);
                        zzy = zzaea.zzy((zzd3 >> 63) ^ (zzd3 + zzd3));
                        zzt = zzy + zzx;
                        i7 += zzt;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzT(obj, i10)) {
                        zzt = zzaea.zzt(i11, (zzafz) zzaht.zzf(obj, j), zzC(i10));
                        i7 += zzt;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzn = zzagu.zzg(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 19:
                    zzn = zzagu.zze(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 20:
                    zzn = zzagu.zzl(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 21:
                    zzn = zzagu.zzw(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 22:
                    zzn = zzagu.zzj(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 23:
                    zzn = zzagu.zzg(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 24:
                    zzn = zzagu.zze(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    zzn = zzagu.zza(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 26:
                    zzn = zzagu.zzt(i11, (List) zzaht.zzf(obj, j));
                    i7 += zzn;
                    break;
                case 27:
                    zzn = zzagu.zzo(i11, (List) zzaht.zzf(obj, j), zzC(i10));
                    i7 += zzn;
                    break;
                case 28:
                    zzn = zzagu.zzb(i11, (List) zzaht.zzf(obj, j));
                    i7 += zzn;
                    break;
                case 29:
                    zzn = zzagu.zzu(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 30:
                    zzn = zzagu.zzc(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 31:
                    zzn = zzagu.zze(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 32:
                    zzn = zzagu.zzg(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 33:
                    zzn = zzagu.zzp(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 34:
                    zzn = zzagu.zzr(i11, (List) zzaht.zzf(obj, j), false);
                    i7 += zzn;
                    break;
                case 35:
                    int zzh = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzh), zzh, i7);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzf2 = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzf2 > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzf2), zzf2, i7);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzm = zzagu.zzm((List) unsafe.getObject(obj, j));
                    if (zzm > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzm), zzm, i7);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzx2 = zzagu.zzx((List) unsafe.getObject(obj, j));
                    if (zzx2 > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzx2), zzx2, i7);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzk = zzagu.zzk((List) unsafe.getObject(obj, j));
                    if (zzk > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzk), zzk, i7);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzh2 = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh2 > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzh2), zzh2, i7);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzf3 = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzf3 > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzf3), zzf3, i7);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    int i18 = zzagu.zza;
                    int size = list.size();
                    if (size > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(size), size, i7);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzv = zzagu.zzv((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzv), zzv, i7);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zzd4 = zzagu.zzd((List) unsafe.getObject(obj, j));
                    if (zzd4 > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzd4), zzd4, i7);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzf4 = zzagu.zzf((List) unsafe.getObject(obj, j));
                    if (zzf4 > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzf4), zzf4, i7);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzh3 = zzagu.zzh((List) unsafe.getObject(obj, j));
                    if (zzh3 > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzh3), zzh3, i7);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzq = zzagu.zzq((List) unsafe.getObject(obj, j));
                    if (zzq > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzq), zzq, i7);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzs = zzagu.zzs((List) unsafe.getObject(obj, j));
                    if (zzs > 0) {
                        i7 = X.c.s(i11 << 3, zzaea.zzx(zzs), zzs, i7);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzn = zzagu.zzi(i11, (List) zzaht.zzf(obj, j), zzC(i10));
                    i7 += zzn;
                    break;
                case 50:
                    zzafu.zza(i11, zzaht.zzf(obj, j), zzE(i10));
                    break;
                case 51:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, zzaea.zzy(zzA(obj, j)), i7);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, zzaea.zzy(zzA(obj, j)), i7);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, zzaea.zzu(zzq(obj, j)), i7);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i11, i10)) {
                        Object zzf5 = zzaht.zzf(obj, j);
                        if (zzf5 instanceof zzadr) {
                            int i19 = i11 << 3;
                            int i20 = zzaea.zzb;
                            int zzd5 = ((zzadr) zzf5).zzd();
                            i7 = X.c.r(i19, zzaea.zzx(zzd5) + zzd5, i7);
                            break;
                        } else {
                            i7 = X.c.r(i11 << 3, zzaea.zzw((String) zzf5), i7);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzX(obj, i11, i10)) {
                        zzn = zzagu.zzn(i11, zzaht.zzf(obj, j), zzC(i10));
                        i7 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i11, i10)) {
                        zzadr zzadrVar2 = (zzadr) zzaht.zzf(obj, j);
                        int i21 = i11 << 3;
                        int i22 = zzaea.zzb;
                        int zzd6 = zzadrVar2.zzd();
                        i7 = X.c.r(i21, zzaea.zzx(zzd6) + zzd6, i7);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, zzaea.zzx(zzq(obj, j)), i7);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, zzaea.zzu(zzq(obj, j)), i7);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i11, i10)) {
                        i7 = X.c.r(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i11, i10)) {
                        int zzq2 = zzq(obj, j);
                        i7 = X.c.r((zzq2 >> 31) ^ (zzq2 + zzq2), zzaea.zzx(i11 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i11, i10)) {
                        long zzA = zzA(obj, j);
                        zzx = zzaea.zzx(i11 << 3);
                        zzy = zzaea.zzy((zzA >> 63) ^ (zzA + zzA));
                        zzt = zzy + zzx;
                        i7 += zzt;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i11, i10)) {
                        zzt = zzaea.zzt(i11, (zzafz) zzaht.zzf(obj, j), zzC(i10));
                        i7 += zzt;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzahj zzahjVar = this.zzo;
        return i7 + zzahjVar.zza(zzahjVar.zzd(obj));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final int zzb(Object obj) {
        int i7;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int zzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzz = zzz(i12);
            int i13 = this.zzc[i12];
            long j = 1048575 & zzz;
            int i14 = 37;
            switch (zzy(zzz)) {
                case 0:
                    i7 = i11 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzaht.zza(obj, j));
                    byte[] bArr = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    floatToIntBits = Float.floatToIntBits(zzaht.zzb(obj, j));
                    i11 = floatToIntBits + i10;
                    break;
                case 2:
                    i7 = i11 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr2 = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 3:
                    i7 = i11 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr3 = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 4:
                    i7 = i11 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 5:
                    i7 = i11 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr4 = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 6:
                    i7 = i11 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    floatToIntBits = zzafa.zza(zzaht.zzw(obj, j));
                    i11 = floatToIntBits + i10;
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    i10 = i11 * 53;
                    floatToIntBits = ((String) zzaht.zzf(obj, j)).hashCode();
                    i11 = floatToIntBits + i10;
                    break;
                case 9:
                    Object zzf = zzaht.zzf(obj, j);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    floatToIntBits = zzaht.zzf(obj, j).hashCode();
                    i11 = floatToIntBits + i10;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i7 = i11 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 12:
                    i7 = i11 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 13:
                    i7 = i11 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 14:
                    i7 = i11 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr5 = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 15:
                    i7 = i11 * 53;
                    zzc = zzaht.zzc(obj, j);
                    i11 = i7 + zzc;
                    break;
                case 16:
                    i7 = i11 * 53;
                    doubleToLongBits = zzaht.zzd(obj, j);
                    byte[] bArr6 = zzafa.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i11 = i7 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzaht.zzf(obj, j);
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
                    floatToIntBits = zzaht.zzf(obj, j).hashCode();
                    i11 = floatToIntBits + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    floatToIntBits = zzaht.zzf(obj, j).hashCode();
                    i11 = floatToIntBits + i10;
                    break;
                case 51:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr8 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr9 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzq(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr10 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzq(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzafa.zza(zzY(obj, j));
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = ((String) zzaht.zzf(obj, j)).hashCode();
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzX(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzaht.zzf(obj, j).hashCode();
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzaht.zzf(obj, j).hashCode();
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzq(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzq(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzq(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr11 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzq(obj, j);
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i13, i12)) {
                        i7 = i11 * 53;
                        doubleToLongBits = zzA(obj, j);
                        byte[] bArr12 = zzafa.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i11 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i13, i12)) {
                        i10 = i11 * 53;
                        floatToIntBits = zzaht.zzf(obj, j).hashCode();
                        i11 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzo.zzd(obj).hashCode() + (i11 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzp.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0432, code lost:
    
        if (r7 == r1) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0434, code lost:
    
        r26.putInt(r13, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x043a, code lost:
    
        r7 = r10.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x043f, code lost:
    
        if (r7 >= r10.zzm) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0441, code lost:
    
        zzD(r30, r10.zzk[r7], null, r10.zzo, r30);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0454, code lost:
    
        if (r8 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0458, code lost:
    
        if (r6 != r33) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x045f, code lost:
    
        throw com.google.ads.interactivemedia.v3.internal.zzafc.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0466, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0462, code lost:
    
        if (r6 > r33) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0464, code lost:
    
        if (r9 != r8) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x046b, code lost:
    
        throw com.google.ads.interactivemedia.v3.internal.zzafc.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:105:0x0094. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i7, int i10, int i11, zzade zzadeVar) {
        int i12;
        Unsafe unsafe;
        Object obj2;
        zzagc<T> zzagcVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Object obj3;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Unsafe unsafe2;
        int i29;
        int i30;
        int i31;
        int i32;
        zzagc<T> zzagcVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i33 = i10;
        zzade zzadeVar2 = zzadeVar;
        zzI(obj);
        Unsafe unsafe3 = zzb;
        int i34 = -1;
        int i35 = 1048575;
        int i36 = i7;
        int i37 = 1048575;
        int i38 = -1;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        while (true) {
            if (i36 < i33) {
                int i42 = i36 + 1;
                byte b2 = bArr2[i36];
                if (b2 < 0) {
                    i18 = zzadf.zzk(b2, bArr2, i42, zzadeVar2);
                    i17 = zzadeVar2.zza;
                } else {
                    i17 = b2;
                    i18 = i42;
                }
                int i43 = i17 >>> 3;
                int zzv = i43 > i38 ? zzagcVar2.zzv(i43, i39 / 3) : zzagcVar2.zzu(i43);
                if (zzv == i34) {
                    i12 = i11;
                    i19 = i43;
                    i20 = i18;
                    unsafe = unsafe3;
                    i21 = i34;
                    i22 = 0;
                    i14 = i17;
                } else {
                    int i44 = i17 & 7;
                    int[] iArr = zzagcVar2.zzc;
                    int i45 = iArr[zzv + 1];
                    int zzy = zzy(i45);
                    int i46 = i17;
                    Unsafe unsafe4 = unsafe3;
                    long j = i45 & i35;
                    if (zzy <= 17) {
                        int i47 = iArr[zzv + 2];
                        int i48 = 1 << (i47 >>> 20);
                        int i49 = i47 & 1048575;
                        if (i49 != i37) {
                            if (i37 != 1048575) {
                                long j10 = i37;
                                unsafe2 = unsafe4;
                                unsafe2.putInt(obj4, j10, i41);
                            } else {
                                unsafe2 = unsafe4;
                            }
                            i41 = unsafe2.getInt(obj4, i49);
                            i24 = i49;
                            unsafe3 = unsafe2;
                        } else {
                            unsafe3 = unsafe4;
                            i24 = i37;
                        }
                        int i50 = i41;
                        switch (zzy) {
                            case 0:
                                i19 = i43;
                                i28 = i18;
                                i25 = i24;
                                i27 = i46;
                                i26 = zzv;
                                if (i44 != 1) {
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    zzaht.zzo(obj4, j, Double.longBitsToDouble(zzadf.zzp(bArr2, i28)));
                                    i36 = i28 + 8;
                                    int i51 = i50 | i48;
                                    i33 = i10;
                                    i40 = i27;
                                    i39 = i26;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i51;
                                    i38 = i19;
                                    break;
                                }
                            case 1:
                                i19 = i43;
                                i28 = i18;
                                i25 = i24;
                                i27 = i46;
                                i26 = zzv;
                                if (i44 != 5) {
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    zzaht.zzp(obj4, j, Float.intBitsToFloat(zzadf.zzb(bArr2, i28)));
                                    i36 = i28 + 4;
                                    int i512 = i50 | i48;
                                    i33 = i10;
                                    i40 = i27;
                                    i39 = i26;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i512;
                                    i38 = i19;
                                    break;
                                }
                            case 2:
                            case 3:
                                i19 = i43;
                                i28 = i18;
                                i25 = i24;
                                i27 = i46;
                                i26 = zzv;
                                if (i44 == 0) {
                                    int zzm = zzadf.zzm(bArr2, i28, zzadeVar2);
                                    unsafe3.putLong(obj, j, zzadeVar2.zzb);
                                    int i52 = i50 | i48;
                                    i38 = i19;
                                    i40 = i27;
                                    i39 = i26;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i52;
                                    i36 = zzm;
                                    i33 = i10;
                                    break;
                                }
                                i22 = i26;
                                unsafe = unsafe3;
                                i20 = i28;
                                i21 = -1;
                                i12 = i11;
                                i14 = i27;
                                i41 = i50;
                                i37 = i25;
                                break;
                            case 4:
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                i19 = i43;
                                i28 = i18;
                                i25 = i24;
                                i27 = i46;
                                i26 = zzv;
                                if (i44 != 0) {
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    i36 = zzadf.zzj(bArr2, i28, zzadeVar2);
                                    unsafe3.putInt(obj4, j, zzadeVar2.zza);
                                    int i5122 = i50 | i48;
                                    i33 = i10;
                                    i40 = i27;
                                    i39 = i26;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i5122;
                                    i38 = i19;
                                    break;
                                }
                            case 5:
                            case 14:
                                i19 = i43;
                                i25 = i24;
                                i27 = i46;
                                i26 = zzv;
                                if (i44 != 1) {
                                    i28 = i18;
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    i28 = i18;
                                    unsafe3.putLong(obj, j, zzadf.zzp(bArr2, i18));
                                    i36 = i28 + 8;
                                    int i51222 = i50 | i48;
                                    i33 = i10;
                                    i40 = i27;
                                    i39 = i26;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i51222;
                                    i38 = i19;
                                    break;
                                }
                            case 6:
                            case 13:
                                i19 = i43;
                                i25 = i24;
                                i27 = i46;
                                i26 = zzv;
                                if (i44 != 5) {
                                    i28 = i18;
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    unsafe3.putInt(obj4, j, zzadf.zzb(bArr2, i18));
                                    i36 = i18 + 4;
                                    int i512222 = i50 | i48;
                                    i33 = i10;
                                    i40 = i27;
                                    i39 = i26;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i512222;
                                    i38 = i19;
                                    break;
                                }
                            case 7:
                                i19 = i43;
                                i25 = i24;
                                i27 = i46;
                                i26 = zzv;
                                if (i44 != 0) {
                                    i28 = i18;
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    int zzm2 = zzadf.zzm(bArr2, i18, zzadeVar2);
                                    zzaht.zzm(obj4, j, zzadeVar2.zzb != 0);
                                    int i53 = i50 | i48;
                                    i33 = i10;
                                    i40 = i27;
                                    i39 = i26;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i53;
                                    i36 = zzm2;
                                    i38 = i19;
                                    break;
                                }
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                i19 = i43;
                                i25 = i24;
                                i27 = i46;
                                i26 = zzv;
                                if (i44 != 2) {
                                    i28 = i18;
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    i36 = (i45 & 536870912) == 0 ? zzadf.zzg(bArr2, i18, zzadeVar2) : zzadf.zzh(bArr2, i18, zzadeVar2);
                                    unsafe3.putObject(obj4, j, zzadeVar2.zzc);
                                    int i5122222 = i50 | i48;
                                    i33 = i10;
                                    i40 = i27;
                                    i39 = i26;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i5122222;
                                    i38 = i19;
                                    break;
                                }
                            case 9:
                                i19 = i43;
                                i25 = i24;
                                i27 = i46;
                                i26 = zzv;
                                if (i44 != 2) {
                                    i28 = i18;
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    Object zzF = zzagcVar2.zzF(obj4, i26);
                                    i36 = zzadf.zzo(zzF, zzagcVar2.zzC(i26), bArr, i18, i10, zzadeVar);
                                    zzagcVar2.zzO(obj4, i26, zzF);
                                    int i51222222 = i50 | i48;
                                    i33 = i10;
                                    i40 = i27;
                                    i39 = i26;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i51222222;
                                    i38 = i19;
                                    break;
                                }
                            case 10:
                                i19 = i43;
                                i25 = i24;
                                i27 = i46;
                                i26 = zzv;
                                if (i44 != 2) {
                                    i28 = i18;
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    i36 = zzadf.zza(bArr2, i18, zzadeVar2);
                                    unsafe3.putObject(obj4, j, zzadeVar2.zzc);
                                    int i512222222 = i50 | i48;
                                    i33 = i10;
                                    i40 = i27;
                                    i39 = i26;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i512222222;
                                    i38 = i19;
                                    break;
                                }
                            case 12:
                                i19 = i43;
                                i25 = i24;
                                i26 = zzv;
                                if (i44 != 0) {
                                    i27 = i46;
                                    i28 = i18;
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    i36 = zzadf.zzj(bArr2, i18, zzadeVar2);
                                    int i54 = zzadeVar2.zza;
                                    zzaex zzB = zzagcVar2.zzB(i26);
                                    if (zzB != null && !zzB.zza(i54)) {
                                        zzd(obj).zzj(i46, Long.valueOf(i54));
                                        i38 = i19;
                                        i33 = i10;
                                        i40 = i46;
                                        i41 = i50;
                                        i39 = i26;
                                        i37 = i25;
                                        i35 = 1048575;
                                        i34 = -1;
                                        break;
                                    } else {
                                        i27 = i46;
                                        unsafe3.putInt(obj4, j, i54);
                                        int i5122222222 = i50 | i48;
                                        i33 = i10;
                                        i40 = i27;
                                        i39 = i26;
                                        i37 = i25;
                                        i35 = 1048575;
                                        i34 = -1;
                                        i41 = i5122222222;
                                        i38 = i19;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                i19 = i43;
                                i25 = i24;
                                i26 = zzv;
                                if (i44 != 0) {
                                    i28 = i18;
                                    i27 = i46;
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    i36 = zzadf.zzj(bArr2, i18, zzadeVar2);
                                    unsafe3.putInt(obj4, j, zzadv.zzs(zzadeVar2.zza));
                                    i41 = i50 | i48;
                                    i38 = i19;
                                    i33 = i10;
                                    i39 = i26;
                                    i40 = i46;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    break;
                                }
                            case 16:
                                i19 = i43;
                                i25 = i24;
                                i26 = zzv;
                                if (i44 != 0) {
                                    i28 = i18;
                                    i27 = i46;
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    int zzm3 = zzadf.zzm(bArr2, i18, zzadeVar2);
                                    unsafe3.putLong(obj, j, zzadv.zzt(zzadeVar2.zzb));
                                    int i55 = i50 | i48;
                                    i38 = i19;
                                    i33 = i10;
                                    i39 = i26;
                                    i40 = i46;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    i41 = i55;
                                    i36 = zzm3;
                                    break;
                                }
                            default:
                                if (i44 != 3) {
                                    i19 = i43;
                                    i25 = i24;
                                    i26 = zzv;
                                    i28 = i18;
                                    i27 = i46;
                                    i22 = i26;
                                    unsafe = unsafe3;
                                    i20 = i28;
                                    i21 = -1;
                                    i12 = i11;
                                    i14 = i27;
                                    i41 = i50;
                                    i37 = i25;
                                    break;
                                } else {
                                    Object zzF2 = zzagcVar2.zzF(obj4, zzv);
                                    i19 = i43;
                                    i25 = i24;
                                    i26 = zzv;
                                    i36 = zzadf.zzn(zzF2, zzagcVar2.zzC(zzv), bArr, i18, i10, (i43 << 3) | 4, zzadeVar);
                                    zzagcVar2.zzO(obj4, i26, zzF2);
                                    i41 = i50 | i48;
                                    i38 = i19;
                                    i33 = i10;
                                    i39 = i26;
                                    i40 = i46;
                                    i37 = i25;
                                    i35 = 1048575;
                                    i34 = -1;
                                    break;
                                }
                        }
                    } else {
                        i19 = i43;
                        int i56 = i18;
                        unsafe3 = unsafe4;
                        if (zzy != 27) {
                            i29 = i41;
                            if (zzy <= 49) {
                                i31 = i37;
                                i32 = i46;
                                i22 = zzv;
                                unsafe = unsafe3;
                                i21 = -1;
                                i36 = zzt(obj, bArr, i56, i10, i46, i19, i44, zzv, i45, zzy, j, zzadeVar);
                                if (i36 != i56) {
                                    zzagcVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i38 = i19;
                                    i33 = i10;
                                    zzadeVar2 = zzadeVar;
                                    i34 = i21;
                                    i41 = i29;
                                    i40 = i32;
                                    i39 = i22;
                                    i37 = i31;
                                    unsafe3 = unsafe;
                                    i35 = 1048575;
                                } else {
                                    i12 = i11;
                                    i20 = i36;
                                    i41 = i29;
                                    i14 = i32;
                                    i37 = i31;
                                }
                            } else {
                                i30 = i56;
                                i31 = i37;
                                unsafe = unsafe3;
                                i32 = i46;
                                i21 = -1;
                                i22 = zzv;
                                if (zzy != 50) {
                                    i36 = zzs(obj, bArr, i30, i10, i32, i19, i44, i45, zzy, j, i22, zzadeVar);
                                    if (i36 != i30) {
                                        zzagcVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i38 = i19;
                                        i33 = i10;
                                        zzadeVar2 = zzadeVar;
                                        i34 = i21;
                                        i41 = i29;
                                        i40 = i32;
                                        i39 = i22;
                                        i37 = i31;
                                        unsafe3 = unsafe;
                                        i35 = 1048575;
                                    } else {
                                        i12 = i11;
                                        i20 = i36;
                                        i41 = i29;
                                        i14 = i32;
                                        i37 = i31;
                                    }
                                } else if (i44 == 2) {
                                    i36 = zzr(obj, bArr, i30, i10, i22, j, zzadeVar);
                                    if (i36 != i30) {
                                        zzagcVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i38 = i19;
                                        i33 = i10;
                                        zzadeVar2 = zzadeVar;
                                        i34 = i21;
                                        i41 = i29;
                                        i40 = i32;
                                        i39 = i22;
                                        i37 = i31;
                                        unsafe3 = unsafe;
                                        i35 = 1048575;
                                    } else {
                                        i12 = i11;
                                        i20 = i36;
                                        i41 = i29;
                                        i14 = i32;
                                        i37 = i31;
                                    }
                                }
                            }
                        } else if (i44 == 2) {
                            zzaez zzaezVar = (zzaez) unsafe3.getObject(obj4, j);
                            if (!zzaezVar.zzc()) {
                                int size = zzaezVar.size();
                                zzaezVar = zzaezVar.zzd(size == 0 ? 10 : size + size);
                                unsafe3.putObject(obj4, j, zzaezVar);
                            }
                            i36 = zzadf.zze(zzagcVar2.zzC(zzv), i46, bArr, i56, i10, zzaezVar, zzadeVar);
                            i38 = i19;
                            i33 = i10;
                            i39 = zzv;
                            i40 = i46;
                            i41 = i41;
                            i35 = 1048575;
                            i34 = -1;
                        } else {
                            i29 = i41;
                            i30 = i56;
                            i31 = i37;
                            i22 = zzv;
                            unsafe = unsafe3;
                            i32 = i46;
                            i21 = -1;
                        }
                        i12 = i11;
                        i20 = i30;
                        i41 = i29;
                        i14 = i32;
                        i37 = i31;
                    }
                }
                if (i14 != i12 || i12 == 0) {
                    if (this.zzh) {
                        zzadeVar2 = zzadeVar;
                        zzaef zzaefVar = zzadeVar2.zzd;
                        if (zzaefVar != zzaef.zza) {
                            i23 = i19;
                            if (zzaefVar.zzc(this.zzg, i23) != null) {
                                throw null;
                            }
                            i36 = zzadf.zzi(i14, bArr, i20, i10, zzd(obj), zzadeVar);
                            obj3 = obj;
                            i40 = i14;
                            zzagcVar2 = this;
                            i38 = i23;
                            obj4 = obj3;
                            i34 = i21;
                            i39 = i22;
                            unsafe3 = unsafe;
                            i35 = 1048575;
                            bArr2 = bArr;
                            i33 = i10;
                        } else {
                            obj3 = obj;
                            i23 = i19;
                        }
                    } else {
                        obj3 = obj;
                        i23 = i19;
                        zzadeVar2 = zzadeVar;
                    }
                    i36 = zzadf.zzi(i14, bArr, i20, i10, zzd(obj), zzadeVar);
                    i40 = i14;
                    zzagcVar2 = this;
                    i38 = i23;
                    obj4 = obj3;
                    i34 = i21;
                    i39 = i22;
                    unsafe3 = unsafe;
                    i35 = 1048575;
                    bArr2 = bArr;
                    i33 = i10;
                } else {
                    zzagcVar = this;
                    obj2 = obj;
                    i15 = i41;
                    i16 = 1048575;
                    i13 = i20;
                }
            } else {
                i12 = i11;
                int i57 = i41;
                unsafe = unsafe3;
                obj2 = obj4;
                zzagcVar = zzagcVar2;
                i13 = i36;
                i14 = i40;
                i15 = i57;
                i16 = 1048575;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final Object zze() {
        return ((zzaet) this.zzg).zzaA();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzaet) {
                zzaet zzaetVar = (zzaet) obj;
                zzaetVar.zzaN(f.API_PRIORITY_OTHER);
                zzaetVar.zza = 0;
                zzaetVar.zzaL();
            }
            int length = this.zzc.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int zzz = zzz(i7);
                int i10 = 1048575 & zzz;
                int zzy = zzy(zzz);
                long j = i10;
                if (zzy != 9) {
                    if (zzy != 60 && zzy != 68) {
                        switch (zzy) {
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
                                this.zzn.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzaft) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzX(obj, this.zzc[i7], i7)) {
                        zzC(i7).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzT(obj, i7)) {
                    zzC(i7).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzo.zzm(obj);
            if (this.zzh) {
                this.zzp.zze(obj);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzz = zzz(i7);
            int i10 = this.zzc[i7];
            long j = 1048575 & zzz;
            switch (zzy(zzz)) {
                case 0:
                    if (zzT(obj2, i7)) {
                        zzaht.zzo(obj, j, zzaht.zza(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj2, i7)) {
                        zzaht.zzp(obj, j, zzaht.zzb(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj2, i7)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj2, i7)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj2, i7)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj2, i7)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj2, i7)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj2, i7)) {
                        zzaht.zzm(obj, j, zzaht.zzw(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzT(obj2, i7)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i7);
                    break;
                case 10:
                    if (zzT(obj2, i7)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzT(obj2, i7)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj2, i7)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj2, i7)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj2, i7)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj2, i7)) {
                        zzaht.zzq(obj, j, zzaht.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj2, i7)) {
                        zzaht.zzr(obj, j, zzaht.zzd(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i7);
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
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i11 = zzagu.zza;
                    zzaht.zzs(obj, j, zzafu.zzc(zzaht.zzf(obj, j), zzaht.zzf(obj2, j)));
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
                    if (zzX(obj2, i10, i7)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzN(obj, i10, i7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzX(obj2, i10, i7)) {
                        zzaht.zzs(obj, j, zzaht.zzf(obj2, j));
                        zzN(obj, i10, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i7);
                    break;
            }
        }
        zzagu.zzD(this.zzo, obj, obj2);
        if (this.zzh) {
            this.zzp.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00c9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0662 A[LOOP:2: B:36:0x065e->B:38:0x0662, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0631 A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:16:0x00db, B:44:0x062c, B:46:0x0631, B:47:0x0636), top: B:15:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x063c A[SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzagk zzagkVar, zzaef zzaefVar) {
        Object obj2;
        zzahj zzahjVar;
        Object obj3;
        int i7;
        zzahj zzahjVar2;
        Object obj4;
        zzaeg zzaegVar;
        zzaef zzaefVar2;
        Object obj5;
        Object obj6 = obj;
        zzaef zzaefVar3 = zzaefVar;
        zzaefVar.getClass();
        zzI(obj);
        zzahj zzahjVar3 = this.zzo;
        zzaeg zzaegVar2 = this.zzp;
        Object obj7 = null;
        zzaek zzaekVar = null;
        while (true) {
            try {
                int zzc = zzagkVar.zzc();
                int zzu = zzu(zzc);
                if (zzu >= 0) {
                    zzahjVar = zzahjVar3;
                    obj3 = obj6;
                    try {
                        int zzz = zzz(zzu);
                        try {
                        } catch (zzafb unused) {
                            obj2 = obj7;
                            zzaegVar = zzaegVar2;
                            zzaefVar2 = zzaefVar3;
                        }
                        switch (zzy(zzz)) {
                            case 0:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzo(obj3, zzz & 1048575, zzagkVar.zza());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 1:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzp(obj3, zzz & 1048575, zzagkVar.zzb());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 2:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzr(obj3, zzz & 1048575, zzagkVar.zzl());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 3:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzr(obj3, zzz & 1048575, zzagkVar.zzo());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 4:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzq(obj3, zzz & 1048575, zzagkVar.zzg());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 5:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzr(obj3, zzz & 1048575, zzagkVar.zzk());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 6:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzq(obj3, zzz & 1048575, zzagkVar.zzf());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 7:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzm(obj3, zzz & 1048575, zzagkVar.zzN());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzL(obj3, zzz, zzagkVar);
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 9:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzafz zzafzVar = (zzafz) zzF(obj3, zzu);
                                zzagkVar.zzu(zzafzVar, zzC(zzu), zzaefVar2);
                                zzO(obj3, zzu, zzafzVar);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 10:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzs(obj3, zzz & 1048575, zzagkVar.zzp());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzq(obj3, zzz & 1048575, zzagkVar.zzj());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 12:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                int zze = zzagkVar.zze();
                                zzaex zzB = zzB(zzu);
                                if (zzB != null && !zzB.zza(zze)) {
                                    obj7 = zzagu.zzC(obj3, zzc, zze, obj5, zzahjVar);
                                    obj6 = obj3;
                                    zzaegVar2 = zzaegVar;
                                    zzaefVar3 = zzaefVar2;
                                    zzahjVar3 = zzahjVar;
                                    break;
                                }
                                zzaht.zzq(obj3, zzz & 1048575, zze);
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 13:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzq(obj3, zzz & 1048575, zzagkVar.zzh());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 14:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzr(obj3, zzz & 1048575, zzagkVar.zzm());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 15:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzq(obj3, zzz & 1048575, zzagkVar.zzi());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 16:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzaht.zzr(obj3, zzz & 1048575, zzagkVar.zzn());
                                zzM(obj3, zzu);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 17:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzafz zzafzVar2 = (zzafz) zzF(obj3, zzu);
                                zzagkVar.zzt(zzafzVar2, zzC(zzu), zzaefVar2);
                                zzO(obj3, zzu, zzafzVar2);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 18:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzx(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 19:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzB(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 20:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzE(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 21:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzM(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 22:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzD(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 23:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzA(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 24:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzz(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzv(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 26:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                if (zzS(zzz)) {
                                    ((zzadw) zzagkVar).zzK(this.zzn.zza(obj3, zzz & 1048575), true);
                                } else {
                                    ((zzadw) zzagkVar).zzK(this.zzn.zza(obj3, zzz & 1048575), false);
                                }
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 27:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzF(this.zzn.zza(obj3, zzz & 1048575), zzC(zzu), zzaefVar2);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 28:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzw(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 29:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzL(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 30:
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                List zza2 = this.zzn.zza(obj3, zzz & 1048575);
                                zzagkVar.zzy(zza2);
                                obj7 = zzagu.zzB(obj, zzc, zza2, zzB(zzu), obj7, zzahjVar);
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 31:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzG(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 32:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzH(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 33:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzI(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 34:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzJ(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 35:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzx(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 36:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzB(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 37:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzE(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 38:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzM(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 39:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzD(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 40:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzA(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 41:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzz(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 42:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzv(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 43:
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                zzagkVar.zzL(this.zzn.zza(obj3, zzz & 1048575));
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 44:
                                List zza3 = this.zzn.zza(obj3, zzz & 1048575);
                                zzagkVar.zzy(zza3);
                                obj2 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                try {
                                    obj7 = zzagu.zzB(obj, zzc, zza3, zzB(zzu), obj2, zzahjVar);
                                } catch (zzafb unused2) {
                                    obj7 = obj2;
                                    zzahjVar.zzr(zzagkVar);
                                    if (obj7 == null) {
                                    }
                                    if (!zzahjVar.zzq(obj7, zzagkVar)) {
                                    }
                                    obj6 = obj3;
                                    zzaegVar2 = zzaegVar;
                                    zzaefVar3 = zzaefVar2;
                                    zzahjVar3 = zzahjVar;
                                } catch (Throwable th) {
                                    th = th;
                                    obj7 = obj2;
                                    while (i7 < this.zzm) {
                                    }
                                    if (obj7 != null) {
                                    }
                                    throw th;
                                }
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 45:
                                zzagkVar.zzG(this.zzn.zza(obj3, zzz & 1048575));
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 46:
                                zzagkVar.zzH(this.zzn.zza(obj3, zzz & 1048575));
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 47:
                                zzagkVar.zzI(this.zzn.zza(obj3, zzz & 1048575));
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 48:
                                zzagkVar.zzJ(this.zzn.zza(obj3, zzz & 1048575));
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 49:
                                zzagkVar.zzC(this.zzn.zza(obj3, zzz & 1048575), zzC(zzu), zzaefVar3);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 50:
                                Object zzE = zzE(zzu);
                                long zzz2 = zzz(zzu) & 1048575;
                                Object zzf = zzaht.zzf(obj3, zzz2);
                                if (zzf == null) {
                                    zzf = zzaft.zza().zzb();
                                    zzaht.zzs(obj3, zzz2, zzf);
                                } else if (zzafu.zzb(zzf)) {
                                    Object zzb2 = zzaft.zza().zzb();
                                    zzafu.zzc(zzb2, zzf);
                                    zzaht.zzs(obj3, zzz2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzaht.zzs(obj3, zzz & 1048575, Double.valueOf(zzagkVar.zza()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 52:
                                zzaht.zzs(obj3, zzz & 1048575, Float.valueOf(zzagkVar.zzb()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 53:
                                zzaht.zzs(obj3, zzz & 1048575, Long.valueOf(zzagkVar.zzl()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 54:
                                zzaht.zzs(obj3, zzz & 1048575, Long.valueOf(zzagkVar.zzo()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 55:
                                zzaht.zzs(obj3, zzz & 1048575, Integer.valueOf(zzagkVar.zzg()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 56:
                                zzaht.zzs(obj3, zzz & 1048575, Long.valueOf(zzagkVar.zzk()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 57:
                                zzaht.zzs(obj3, zzz & 1048575, Integer.valueOf(zzagkVar.zzf()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 58:
                                zzaht.zzs(obj3, zzz & 1048575, Boolean.valueOf(zzagkVar.zzN()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 59:
                                zzL(obj3, zzz, zzagkVar);
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 60:
                                zzafz zzafzVar3 = (zzafz) zzG(obj3, zzc, zzu);
                                zzagkVar.zzu(zzafzVar3, zzC(zzu), zzaefVar3);
                                zzP(obj3, zzc, zzu, zzafzVar3);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 61:
                                zzaht.zzs(obj3, zzz & 1048575, zzagkVar.zzp());
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 62:
                                zzaht.zzs(obj3, zzz & 1048575, Integer.valueOf(zzagkVar.zzj()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 63:
                                int zze2 = zzagkVar.zze();
                                zzaex zzB2 = zzB(zzu);
                                if (zzB2 != null && !zzB2.zza(zze2)) {
                                    obj7 = zzagu.zzC(obj3, zzc, zze2, obj7, zzahjVar);
                                    obj6 = obj3;
                                    zzahjVar3 = zzahjVar;
                                    break;
                                }
                                zzaht.zzs(obj3, zzz & 1048575, Integer.valueOf(zze2));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 64:
                                zzaht.zzs(obj3, zzz & 1048575, Integer.valueOf(zzagkVar.zzh()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 65:
                                zzaht.zzs(obj3, zzz & 1048575, Long.valueOf(zzagkVar.zzm()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 66:
                                zzaht.zzs(obj3, zzz & 1048575, Integer.valueOf(zzagkVar.zzi()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 67:
                                zzaht.zzs(obj3, zzz & 1048575, Long.valueOf(zzagkVar.zzn()));
                                zzN(obj3, zzc, zzu);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            case 68:
                                zzafz zzafzVar4 = (zzafz) zzG(obj3, zzc, zzu);
                                zzagkVar.zzt(zzafzVar4, zzC(zzu), zzaefVar3);
                                zzP(obj3, zzc, zzu, zzafzVar4);
                                obj5 = obj7;
                                zzaegVar = zzaegVar2;
                                zzaefVar2 = zzaefVar3;
                                obj6 = obj3;
                                zzaegVar2 = zzaegVar;
                                obj7 = obj5;
                                zzaefVar3 = zzaefVar2;
                                zzahjVar3 = zzahjVar;
                                break;
                            default:
                                if (obj7 == null) {
                                    obj7 = zzahjVar.zzc(obj3);
                                }
                                try {
                                    try {
                                        if (!zzahjVar.zzq(obj7, zzagkVar)) {
                                            for (int i10 = this.zzl; i10 < this.zzm; i10++) {
                                                obj7 = zzD(obj, this.zzk[i10], obj7, zzahjVar, obj);
                                            }
                                            if (obj7 != null) {
                                                zzahjVar.zzn(obj3, obj7);
                                                return;
                                            }
                                            return;
                                        }
                                        obj6 = obj3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        for (i7 = this.zzl; i7 < this.zzm; i7++) {
                                            obj7 = zzD(obj, this.zzk[i7], obj7, zzahjVar, obj);
                                        }
                                        if (obj7 != null) {
                                            zzahjVar.zzn(obj3, obj7);
                                        }
                                        throw th;
                                    }
                                } catch (zzafb unused3) {
                                    zzaegVar = zzaegVar2;
                                    zzaefVar2 = zzaefVar3;
                                    zzahjVar.zzr(zzagkVar);
                                    if (obj7 == null) {
                                        obj7 = zzahjVar.zzc(obj3);
                                    }
                                    if (!zzahjVar.zzq(obj7, zzagkVar)) {
                                        for (int i11 = this.zzl; i11 < this.zzm; i11++) {
                                            obj7 = zzD(obj, this.zzk[i11], obj7, zzahjVar, obj);
                                        }
                                        if (obj7 != null) {
                                            zzahjVar.zzn(obj3, obj7);
                                            return;
                                        }
                                        return;
                                    }
                                    obj6 = obj3;
                                    zzaegVar2 = zzaegVar;
                                    zzaefVar3 = zzaefVar2;
                                    zzahjVar3 = zzahjVar;
                                }
                                zzahjVar3 = zzahjVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = obj7;
                        obj7 = obj2;
                        while (i7 < this.zzm) {
                        }
                        if (obj7 != null) {
                        }
                        throw th;
                    }
                } else {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i12 = this.zzl; i12 < this.zzm; i12++) {
                            obj7 = zzD(obj, this.zzk[i12], obj7, zzahjVar3, obj);
                        }
                        if (obj7 != null) {
                            zzahjVar3.zzn(obj6, obj7);
                            return;
                        }
                        return;
                    }
                    try {
                        Object zzc2 = !this.zzh ? null : zzaegVar2.zzc(zzaefVar3, this.zzg, zzc);
                        if (zzc2 != null) {
                            zzaek zzb3 = zzaekVar == null ? zzaegVar2.zzb(obj6) : zzaekVar;
                            zzahjVar2 = zzahjVar3;
                            obj4 = obj6;
                            try {
                                obj7 = zzaegVar2.zzd(obj, zzagkVar, zzc2, zzaefVar, zzb3, obj7, zzahjVar2);
                                zzaekVar = zzb3;
                            } catch (Throwable th4) {
                                th = th4;
                                obj3 = obj4;
                                zzahjVar = zzahjVar2;
                                obj2 = obj7;
                                obj7 = obj2;
                                while (i7 < this.zzm) {
                                }
                                if (obj7 != null) {
                                }
                                throw th;
                            }
                        } else {
                            zzahjVar2 = zzahjVar3;
                            obj4 = obj6;
                            zzahjVar2.zzr(zzagkVar);
                            if (obj7 == null) {
                                obj7 = zzahjVar2.zzc(obj4);
                            }
                            try {
                                if (!zzahjVar2.zzq(obj7, zzagkVar)) {
                                    int i13 = this.zzl;
                                    while (i13 < this.zzm) {
                                        zzahj zzahjVar4 = zzahjVar2;
                                        obj7 = zzD(obj, this.zzk[i13], obj7, zzahjVar4, obj);
                                        i13++;
                                        obj4 = obj4;
                                        zzahjVar2 = zzahjVar4;
                                    }
                                    Object obj8 = obj4;
                                    zzahj zzahjVar5 = zzahjVar2;
                                    if (obj7 != null) {
                                        zzahjVar5.zzn(obj8, obj7);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj3 = obj4;
                                zzahjVar = zzahjVar2;
                                while (i7 < this.zzm) {
                                }
                                if (obj7 != null) {
                                }
                                throw th;
                            }
                        }
                        obj6 = obj4;
                        zzahjVar3 = zzahjVar2;
                    } catch (Throwable th6) {
                        th = th6;
                        zzahjVar = zzahjVar3;
                        obj3 = obj6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                obj2 = obj7;
                zzahjVar = zzahjVar3;
                obj3 = obj6;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e7, code lost:
    
        if (r0 != r24) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02e9, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0301, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0331, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0350, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, byte[] bArr, int i7, int i10, zzade zzadeVar) {
        byte b2;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe;
        int i14;
        int i15;
        Unsafe unsafe2;
        int i16;
        Unsafe unsafe3;
        zzagc<T> zzagcVar;
        int i17;
        Unsafe unsafe4;
        int i18;
        int i19;
        int i20;
        zzagc<T> zzagcVar2 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i21 = i10;
        zzade zzadeVar2 = zzadeVar;
        if (!zzagcVar2.zzj) {
            zzc(obj, bArr, i7, i10, 0, zzadeVar);
            return;
        }
        zzI(obj);
        Unsafe unsafe5 = zzb;
        int i22 = -1;
        int i23 = 1048575;
        int i24 = i7;
        int i25 = 1048575;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        while (i24 < i21) {
            int i29 = i24 + 1;
            byte b10 = bArr2[i24];
            if (b10 < 0) {
                i11 = zzadf.zzk(b10, bArr2, i29, zzadeVar2);
                b2 = zzadeVar2.zza;
            } else {
                b2 = b10;
                i11 = i29;
            }
            int i30 = b2 >>> 3;
            int zzv = i30 > i26 ? zzagcVar2.zzv(i30, i27 / 3) : zzagcVar2.zzu(i30);
            if (zzv == i22) {
                i12 = i11;
                i13 = i30;
                unsafe = unsafe5;
                i14 = i22;
                i15 = 0;
            } else {
                int i31 = b2 & 7;
                int[] iArr = zzagcVar2.zzc;
                int i32 = iArr[zzv + 1];
                int zzy = zzy(i32);
                Unsafe unsafe6 = unsafe5;
                long j = i32 & i23;
                if (zzy <= 17) {
                    int i33 = iArr[zzv + 2];
                    int i34 = 1 << (i33 >>> 20);
                    int i35 = i33 & 1048575;
                    if (i35 != i25) {
                        if (i25 != 1048575) {
                            long j10 = i25;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj2, j10, i28);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i35 != 1048575) {
                            i28 = unsafe4.getInt(obj2, i35);
                        }
                        unsafe2 = unsafe4;
                        i25 = i35;
                    } else {
                        unsafe2 = unsafe6;
                    }
                    switch (zzy) {
                        case 0:
                            zzagcVar = this;
                            i13 = i30;
                            i17 = 1048575;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 != 1) {
                                i12 = i11;
                                unsafe = unsafe3;
                                i25 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzaht.zzo(obj2, j, Double.longBitsToDouble(zzadf.zzp(bArr2, i11)));
                                i24 = i11 + 8;
                                i28 |= i34;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i23 = i17;
                                i25 = i16;
                                i26 = i13;
                                i22 = -1;
                                zzagcVar2 = zzagcVar;
                                i21 = i10;
                                break;
                            }
                        case 1:
                            zzagcVar = this;
                            i13 = i30;
                            i17 = 1048575;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 != 5) {
                                i12 = i11;
                                unsafe = unsafe3;
                                i25 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzaht.zzp(obj2, j, Float.intBitsToFloat(zzadf.zzb(bArr2, i11)));
                                i24 = i11 + 4;
                                i28 |= i34;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i23 = i17;
                                i25 = i16;
                                i26 = i13;
                                i22 = -1;
                                zzagcVar2 = zzagcVar;
                                i21 = i10;
                                break;
                            }
                        case 2:
                        case 3:
                            zzagcVar = this;
                            i13 = i30;
                            i17 = 1048575;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 != 0) {
                                i12 = i11;
                                unsafe = unsafe3;
                                i25 = i16;
                                i14 = -1;
                                break;
                            } else {
                                int zzm = zzadf.zzm(bArr2, i11, zzadeVar2);
                                unsafe3.putLong(obj, j, zzadeVar2.zzb);
                                i28 |= i34;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i24 = zzm;
                                i23 = i17;
                                i25 = i16;
                                i26 = i13;
                                i22 = -1;
                                zzagcVar2 = zzagcVar;
                                i21 = i10;
                                break;
                            }
                        case 4:
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            zzagcVar = this;
                            i13 = i30;
                            i17 = 1048575;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 != 0) {
                                i12 = i11;
                                unsafe = unsafe3;
                                i25 = i16;
                                i14 = -1;
                                break;
                            } else {
                                i24 = zzadf.zzj(bArr2, i11, zzadeVar2);
                                unsafe3.putInt(obj2, j, zzadeVar2.zza);
                                i28 |= i34;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i23 = i17;
                                i25 = i16;
                                i26 = i13;
                                i22 = -1;
                                zzagcVar2 = zzagcVar;
                                i21 = i10;
                                break;
                            }
                        case 5:
                        case 14:
                            zzagcVar = this;
                            i13 = i30;
                            i17 = 1048575;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 != 1) {
                                i12 = i11;
                                unsafe = unsafe3;
                                i25 = i16;
                                i14 = -1;
                                break;
                            } else {
                                unsafe3.putLong(obj, j, zzadf.zzp(bArr2, i11));
                                i24 = i11 + 8;
                                i28 |= i34;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i23 = i17;
                                i25 = i16;
                                i26 = i13;
                                i22 = -1;
                                zzagcVar2 = zzagcVar;
                                i21 = i10;
                                break;
                            }
                        case 6:
                        case 13:
                            zzagcVar = this;
                            i13 = i30;
                            i17 = 1048575;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 != 5) {
                                i12 = i11;
                                unsafe = unsafe3;
                                i25 = i16;
                                i14 = -1;
                                break;
                            } else {
                                unsafe3.putInt(obj2, j, zzadf.zzb(bArr2, i11));
                                i24 = i11 + 4;
                                i28 |= i34;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i23 = i17;
                                i25 = i16;
                                i26 = i13;
                                i22 = -1;
                                zzagcVar2 = zzagcVar;
                                i21 = i10;
                                break;
                            }
                        case 7:
                            zzagcVar = this;
                            i13 = i30;
                            i17 = 1048575;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 != 0) {
                                i12 = i11;
                                unsafe = unsafe3;
                                i25 = i16;
                                i14 = -1;
                                break;
                            } else {
                                i24 = zzadf.zzm(bArr2, i11, zzadeVar2);
                                zzaht.zzm(obj2, j, zzadeVar2.zzb != 0);
                                i28 |= i34;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i23 = i17;
                                i25 = i16;
                                i26 = i13;
                                i22 = -1;
                                zzagcVar2 = zzagcVar;
                                i21 = i10;
                                break;
                            }
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                            zzagcVar = this;
                            i13 = i30;
                            i17 = 1048575;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 != 2) {
                                i12 = i11;
                                unsafe = unsafe3;
                                i25 = i16;
                                i14 = -1;
                                break;
                            } else {
                                i24 = (i32 & 536870912) == 0 ? zzadf.zzg(bArr2, i11, zzadeVar2) : zzadf.zzh(bArr2, i11, zzadeVar2);
                                unsafe3.putObject(obj2, j, zzadeVar2.zzc);
                                i28 |= i34;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i23 = i17;
                                i25 = i16;
                                i26 = i13;
                                i22 = -1;
                                zzagcVar2 = zzagcVar;
                                i21 = i10;
                                break;
                            }
                        case 9:
                            i13 = i30;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 != 2) {
                                i12 = i11;
                                unsafe = unsafe3;
                                i25 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzagcVar = this;
                                i17 = 1048575;
                                Object zzF = zzagcVar.zzF(obj2, i15);
                                i24 = zzadf.zzo(zzF, zzagcVar.zzC(i15), bArr, i11, i10, zzadeVar);
                                zzagcVar.zzO(obj2, i15, zzF);
                                i28 |= i34;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i23 = i17;
                                i25 = i16;
                                i26 = i13;
                                i22 = -1;
                                zzagcVar2 = zzagcVar;
                                i21 = i10;
                                break;
                            }
                        case 10:
                            i13 = i30;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 == 2) {
                                i24 = zzadf.zza(bArr2, i11, zzadeVar2);
                                unsafe3.putObject(obj2, j, zzadeVar2.zzc);
                                i28 |= i34;
                                i21 = i10;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i25 = i16;
                                i26 = i13;
                                i23 = 1048575;
                                i22 = -1;
                                zzagcVar2 = this;
                                break;
                            }
                            i12 = i11;
                            unsafe = unsafe3;
                            i25 = i16;
                            i14 = -1;
                            break;
                        case 12:
                            i13 = i30;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 == 0) {
                                i24 = zzadf.zzj(bArr2, i11, zzadeVar2);
                                unsafe3.putInt(obj2, j, zzadeVar2.zza);
                                i28 |= i34;
                                i21 = i10;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i25 = i16;
                                i26 = i13;
                                i23 = 1048575;
                                i22 = -1;
                                zzagcVar2 = this;
                                break;
                            }
                            i12 = i11;
                            unsafe = unsafe3;
                            i25 = i16;
                            i14 = -1;
                            break;
                        case 15:
                            i13 = i30;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            if (i31 == 0) {
                                i24 = zzadf.zzj(bArr2, i11, zzadeVar2);
                                unsafe3.putInt(obj2, j, zzadv.zzs(zzadeVar2.zza));
                                i28 |= i34;
                                i21 = i10;
                                unsafe5 = unsafe3;
                                i27 = i15;
                                i25 = i16;
                                i26 = i13;
                                i23 = 1048575;
                                i22 = -1;
                                zzagcVar2 = this;
                                break;
                            }
                            i12 = i11;
                            unsafe = unsafe3;
                            i25 = i16;
                            i14 = -1;
                            break;
                        case 16:
                            if (i31 != 0) {
                                i13 = i30;
                                i15 = zzv;
                                i16 = i25;
                                unsafe3 = unsafe2;
                                i12 = i11;
                                unsafe = unsafe3;
                                i25 = i16;
                                i14 = -1;
                                break;
                            } else {
                                int zzm2 = zzadf.zzm(bArr2, i11, zzadeVar2);
                                unsafe2.putLong(obj, j, zzadv.zzt(zzadeVar2.zzb));
                                i28 |= i34;
                                unsafe5 = unsafe2;
                                i24 = zzm2;
                                i27 = zzv;
                                i25 = i25;
                                i26 = i30;
                                i23 = 1048575;
                                i22 = -1;
                                zzagcVar2 = this;
                                i21 = i10;
                                break;
                            }
                        default:
                            i13 = i30;
                            i15 = zzv;
                            i16 = i25;
                            unsafe3 = unsafe2;
                            i12 = i11;
                            unsafe = unsafe3;
                            i25 = i16;
                            i14 = -1;
                            break;
                    }
                } else {
                    i13 = i30;
                    int i36 = i25;
                    zzagc<T> zzagcVar3 = zzagcVar2;
                    i15 = zzv;
                    if (zzy != 27) {
                        if (zzy <= 49) {
                            int i37 = i11;
                            i19 = i28;
                            i20 = i36;
                            unsafe = unsafe6;
                            i14 = -1;
                            i24 = zzt(obj, bArr, i11, i10, b2, i13, i31, i15, i32, zzy, j, zzadeVar);
                        } else {
                            i18 = i11;
                            i19 = i28;
                            unsafe = unsafe6;
                            i20 = i36;
                            i14 = -1;
                            if (zzy != 50) {
                                i24 = zzs(obj, bArr, i18, i10, b2, i13, i31, i32, zzy, j, i15, zzadeVar);
                            } else if (i31 == 2) {
                                i24 = zzr(obj, bArr, i18, i10, i15, j, zzadeVar);
                            }
                        }
                        zzagcVar2 = this;
                    } else if (i31 == 2) {
                        zzaez zzaezVar = (zzaez) unsafe6.getObject(obj2, j);
                        if (!zzaezVar.zzc()) {
                            int size = zzaezVar.size();
                            zzaezVar = zzaezVar.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, zzaezVar);
                        }
                        i24 = zzadf.zze(zzagcVar3.zzC(i15), b2, bArr, i11, i10, zzaezVar, zzadeVar);
                        i21 = i10;
                        unsafe5 = unsafe6;
                        i28 = i28;
                        i27 = i15;
                        i23 = 1048575;
                        i25 = i36;
                        i26 = i13;
                        zzagcVar2 = zzagcVar3;
                        i22 = -1;
                    } else {
                        i18 = i11;
                        i19 = i28;
                        unsafe = unsafe6;
                        i20 = i36;
                        i14 = -1;
                    }
                    i12 = i18;
                    i28 = i19;
                    i25 = i20;
                }
                unsafe5 = unsafe;
                i23 = 1048575;
                zzagcVar2 = this;
            }
            i24 = zzadf.zzi(b2, bArr, i12, i10, zzd(obj), zzadeVar);
            obj2 = obj;
            bArr2 = bArr;
            i21 = i10;
            zzadeVar2 = zzadeVar;
            i27 = i15;
            i22 = i14;
            i26 = i13;
            unsafe5 = unsafe;
            i23 = 1048575;
            zzagcVar2 = this;
        }
        int i38 = i28;
        Unsafe unsafe7 = unsafe5;
        if (i25 != i23) {
            unsafe7.putInt(obj, i25, i38);
        }
        if (i24 != i10) {
            throw zzafc.zzg();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:274:0x0496. Please report as an issue. */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final void zzj(Object obj, zzaib zzaibVar) {
        int i7;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 1048575;
        if (this.zzj) {
            if (this.zzh) {
                this.zzp.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i14 = 0; i14 < length; i14 += 3) {
                int zzz = zzz(i14);
                int i15 = this.zzc[i14];
                switch (zzy(zzz)) {
                    case 0:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzf(i15, zzaht.zza(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzo(i15, zzaht.zzb(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzt(i15, zzaht.zzd(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzJ(i15, zzaht.zzd(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzr(i15, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzm(i15, zzaht.zzd(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzk(i15, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzb(i15, zzaht.zzw(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case g.BYTES_FIELD_NUMBER /* 8 */:
                        if (zzT(obj, i14)) {
                            zzZ(i15, zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzv(i15, zzaht.zzf(obj, zzz & 1048575), zzC(i14));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzd(i15, (zzadr) zzaht.zzf(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzH(i15, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzi(i15, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzw(i15, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzy(i15, zzaht.zzd(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzA(i15, zzaht.zzc(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzC(i15, zzaht.zzd(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzT(obj, i14)) {
                            zzaibVar.zzq(i15, zzaht.zzf(obj, zzz & 1048575), zzC(i14));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzagu.zzH(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 19:
                        zzagu.zzL(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 20:
                        zzagu.zzO(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 21:
                        zzagu.zzW(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 22:
                        zzagu.zzN(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 23:
                        zzagu.zzK(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 24:
                        zzagu.zzJ(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case BlurFactor.DEFAULT_RADIUS /* 25 */:
                        zzagu.zzF(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 26:
                        zzagu.zzU(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                        break;
                    case 27:
                        zzagu.zzP(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, zzC(i14));
                        break;
                    case 28:
                        zzagu.zzG(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                        break;
                    case 29:
                        zzagu.zzV(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 30:
                        zzagu.zzI(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 31:
                        zzagu.zzQ(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 32:
                        zzagu.zzR(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 33:
                        zzagu.zzS(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 34:
                        zzagu.zzT(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, false);
                        break;
                    case 35:
                        zzagu.zzH(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 36:
                        zzagu.zzL(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 37:
                        zzagu.zzO(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 38:
                        zzagu.zzW(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 39:
                        zzagu.zzN(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 40:
                        zzagu.zzK(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 41:
                        zzagu.zzJ(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 42:
                        zzagu.zzF(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 43:
                        zzagu.zzV(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 44:
                        zzagu.zzI(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 45:
                        zzagu.zzQ(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 46:
                        zzagu.zzR(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 47:
                        zzagu.zzS(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 48:
                        zzagu.zzT(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, true);
                        break;
                    case 49:
                        zzagu.zzM(i15, (List) zzaht.zzf(obj, zzz & 1048575), zzaibVar, zzC(i14));
                        break;
                    case 50:
                        zzQ(zzaibVar, i15, zzaht.zzf(obj, zzz & 1048575), i14);
                        break;
                    case 51:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzf(i15, zzn(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzo(i15, zzo(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzt(i15, zzA(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzJ(i15, zzA(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzr(i15, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzm(i15, zzA(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzk(i15, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzb(i15, zzY(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzX(obj, i15, i14)) {
                            zzZ(i15, zzaht.zzf(obj, zzz & 1048575), zzaibVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzv(i15, zzaht.zzf(obj, zzz & 1048575), zzC(i14));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzd(i15, (zzadr) zzaht.zzf(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzH(i15, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzi(i15, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzw(i15, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzy(i15, zzA(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzA(i15, zzq(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzC(i15, zzA(obj, zzz & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzX(obj, i15, i14)) {
                            zzaibVar.zzq(i15, zzaht.zzf(obj, zzz & 1048575), zzC(i14));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzahj zzahjVar = this.zzo;
            zzahjVar.zzp(zzahjVar.zzd(obj), zzaibVar);
            return;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe = zzb;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i16 < length2) {
            int zzz2 = zzz(i16);
            int[] iArr = this.zzc;
            int i19 = iArr[i16];
            int zzy = zzy(zzz2);
            if (zzy <= 17) {
                int i20 = iArr[i16 + 2];
                int i21 = i20 & i13;
                if (i21 != i18) {
                    i17 = unsafe.getInt(obj, i21);
                    i18 = i21;
                }
                i7 = 1 << (i20 >>> 20);
            } else {
                i7 = i12;
            }
            long j = zzz2 & i13;
            switch (zzy) {
                case 0:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzf(i19, zzaht.zza(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzo(i19, zzaht.zzb(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzt(i19, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzJ(i19, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzr(i19, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzm(i19, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzk(i19, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzb(i19, zzaht.zzw(obj, j));
                        break;
                    } else {
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzZ(i19, unsafe.getObject(obj, j), zzaibVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzv(i19, unsafe.getObject(obj, j), zzC(i16));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzd(i19, (zzadr) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzH(i19, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzi(i19, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzw(i19, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzy(i19, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzA(i19, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzC(i19, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i10 = 0;
                    if ((i17 & i7) != 0) {
                        zzaibVar.zzq(i19, unsafe.getObject(obj, j), zzC(i16));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i10 = 0;
                    zzagu.zzH(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 19:
                    i10 = 0;
                    zzagu.zzL(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 20:
                    i10 = 0;
                    zzagu.zzO(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 21:
                    i10 = 0;
                    zzagu.zzW(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 22:
                    i10 = 0;
                    zzagu.zzN(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 23:
                    i10 = 0;
                    zzagu.zzK(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 24:
                    i10 = 0;
                    zzagu.zzJ(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    i10 = 0;
                    zzagu.zzF(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    break;
                case 26:
                    zzagu.zzU(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar);
                    i10 = 0;
                    break;
                case 27:
                    zzagu.zzP(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, zzC(i16));
                    i10 = 0;
                    break;
                case 28:
                    zzagu.zzG(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar);
                    i10 = 0;
                    break;
                case 29:
                    i11 = 0;
                    zzagu.zzV(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i10 = i11;
                    break;
                case 30:
                    i11 = 0;
                    zzagu.zzI(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i10 = i11;
                    break;
                case 31:
                    i11 = 0;
                    zzagu.zzQ(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i10 = i11;
                    break;
                case 32:
                    i11 = 0;
                    zzagu.zzR(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i10 = i11;
                    break;
                case 33:
                    i11 = 0;
                    zzagu.zzS(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i10 = i11;
                    break;
                case 34:
                    i11 = 0;
                    zzagu.zzT(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, false);
                    i10 = i11;
                    break;
                case 35:
                    zzagu.zzH(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 36:
                    zzagu.zzL(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 37:
                    zzagu.zzO(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 38:
                    zzagu.zzW(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 39:
                    zzagu.zzN(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 40:
                    zzagu.zzK(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 41:
                    zzagu.zzJ(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 42:
                    zzagu.zzF(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 43:
                    zzagu.zzV(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 44:
                    zzagu.zzI(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 45:
                    zzagu.zzQ(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 46:
                    zzagu.zzR(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 47:
                    zzagu.zzS(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 48:
                    zzagu.zzT(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, true);
                    i10 = 0;
                    break;
                case 49:
                    zzagu.zzM(this.zzc[i16], (List) unsafe.getObject(obj, j), zzaibVar, zzC(i16));
                    i10 = 0;
                    break;
                case 50:
                    zzQ(zzaibVar, i19, unsafe.getObject(obj, j), i16);
                    i10 = 0;
                    break;
                case 51:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzf(i19, zzn(obj, j));
                    }
                    i10 = 0;
                    break;
                case 52:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzo(i19, zzo(obj, j));
                    }
                    i10 = 0;
                    break;
                case 53:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzt(i19, zzA(obj, j));
                    }
                    i10 = 0;
                    break;
                case 54:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzJ(i19, zzA(obj, j));
                    }
                    i10 = 0;
                    break;
                case 55:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzr(i19, zzq(obj, j));
                    }
                    i10 = 0;
                    break;
                case 56:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzm(i19, zzA(obj, j));
                    }
                    i10 = 0;
                    break;
                case 57:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzk(i19, zzq(obj, j));
                    }
                    i10 = 0;
                    break;
                case 58:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzb(i19, zzY(obj, j));
                    }
                    i10 = 0;
                    break;
                case 59:
                    if (zzX(obj, i19, i16)) {
                        zzZ(i19, unsafe.getObject(obj, j), zzaibVar);
                    }
                    i10 = 0;
                    break;
                case 60:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzv(i19, unsafe.getObject(obj, j), zzC(i16));
                    }
                    i10 = 0;
                    break;
                case 61:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzd(i19, (zzadr) unsafe.getObject(obj, j));
                    }
                    i10 = 0;
                    break;
                case 62:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzH(i19, zzq(obj, j));
                    }
                    i10 = 0;
                    break;
                case 63:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzi(i19, zzq(obj, j));
                    }
                    i10 = 0;
                    break;
                case 64:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzw(i19, zzq(obj, j));
                    }
                    i10 = 0;
                    break;
                case 65:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzy(i19, zzA(obj, j));
                    }
                    i10 = 0;
                    break;
                case 66:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzA(i19, zzq(obj, j));
                    }
                    i10 = 0;
                    break;
                case 67:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzC(i19, zzA(obj, j));
                    }
                    i10 = 0;
                    break;
                case 68:
                    if (zzX(obj, i19, i16)) {
                        zzaibVar.zzq(i19, unsafe.getObject(obj, j), zzC(i16));
                    }
                    i10 = 0;
                    break;
                default:
                    i10 = 0;
                    break;
            }
            i16 += 3;
            i12 = i10;
            i13 = 1048575;
        }
        zzahj zzahjVar2 = this.zzo;
        zzahjVar2.zzp(zzahjVar2.zzd(obj), zzaibVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(Object obj, Object obj2) {
        int i7;
        boolean zzX;
        int length = this.zzc.length;
        for (0; i7 < length; i7 + 3) {
            int zzz = zzz(i7);
            long j = zzz & 1048575;
            switch (zzy(zzz)) {
                case 0:
                    i7 = (zzR(obj, obj2, i7) && Double.doubleToLongBits(zzaht.zza(obj, j)) == Double.doubleToLongBits(zzaht.zza(obj2, j))) ? i7 + 3 : 0;
                    return false;
                case 1:
                    if (zzR(obj, obj2, i7) && Float.floatToIntBits(zzaht.zzb(obj, j)) == Float.floatToIntBits(zzaht.zzb(obj2, j))) {
                    }
                    return false;
                case 2:
                    if (zzR(obj, obj2, i7) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                    }
                    return false;
                case 3:
                    if (zzR(obj, obj2, i7) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                    }
                    return false;
                case 4:
                    if (zzR(obj, obj2, i7) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                    }
                    return false;
                case 5:
                    if (zzR(obj, obj2, i7) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                    }
                    return false;
                case 6:
                    if (zzR(obj, obj2, i7) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                    }
                    return false;
                case 7:
                    if (zzR(obj, obj2, i7) && zzaht.zzw(obj, j) == zzaht.zzw(obj2, j)) {
                    }
                    return false;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzR(obj, obj2, i7) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                    }
                    return false;
                case 9:
                    if (zzR(obj, obj2, i7) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                    }
                    return false;
                case 10:
                    if (zzR(obj, obj2, i7) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                    }
                    return false;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzR(obj, obj2, i7) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                    }
                    return false;
                case 12:
                    if (zzR(obj, obj2, i7) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                    }
                    return false;
                case 13:
                    if (zzR(obj, obj2, i7) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                    }
                    return false;
                case 14:
                    if (zzR(obj, obj2, i7) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                    }
                    return false;
                case 15:
                    if (zzR(obj, obj2, i7) && zzaht.zzc(obj, j) == zzaht.zzc(obj2, j)) {
                    }
                    return false;
                case 16:
                    if (zzR(obj, obj2, i7) && zzaht.zzd(obj, j) == zzaht.zzd(obj2, j)) {
                    }
                    return false;
                case 17:
                    if (zzR(obj, obj2, i7) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
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
                    zzX = zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j));
                    if (zzX) {
                        return false;
                    }
                case 50:
                    zzX = zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j));
                    if (zzX) {
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
                    long zzw = zzw(i7) & 1048575;
                    if (zzaht.zzc(obj, zzw) == zzaht.zzc(obj2, zzw) && zzagu.zzX(zzaht.zzf(obj, j), zzaht.zzf(obj2, j))) {
                    }
                    return false;
                default:
            }
        }
        if (!this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        this.zzp.zza(obj2);
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzags
    public final boolean zzl(Object obj) {
        int i7;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i12 < this.zzl) {
            int i14 = this.zzk[i12];
            int i15 = this.zzc[i14];
            int zzz = zzz(i14);
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
            if ((268435456 & zzz) != 0 && !zzU(obj, i14, i7, i10, i18)) {
                return false;
            }
            int zzy = zzy(zzz);
            if (zzy != 9 && zzy != 17) {
                if (zzy != 27) {
                    if (zzy == 60 || zzy == 68) {
                        if (zzX(obj, i15, i14) && !zzV(obj, zzz, zzC(i14))) {
                            return false;
                        }
                    } else if (zzy != 49) {
                        if (zzy == 50 && !((zzaft) zzaht.zzf(obj, zzz & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzaht.zzf(obj, zzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzags zzC = zzC(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!zzC.zzl(list.get(i19))) {
                            return false;
                        }
                    }
                }
            } else if (zzU(obj, i14, i7, i10, i18) && !zzV(obj, zzz, zzC(i14))) {
                return false;
            }
            i12++;
            i13 = i7;
            i11 = i10;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        throw null;
    }
}
