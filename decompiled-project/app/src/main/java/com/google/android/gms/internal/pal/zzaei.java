package com.google.android.gms.internal.pal;

import A3.c;
import P1.g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaei<T> implements zzaer<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzafs.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzaef zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzadt zzn;
    private final zzafi zzo;
    private final zzacn zzp;
    private final zzaek zzq;
    private final zzaea zzr;

    private zzaei(int[] iArr, Object[] objArr, int i7, int i10, zzaef zzaefVar, boolean z8, boolean z10, int[] iArr2, int i11, int i12, zzaek zzaekVar, zzadt zzadtVar, zzafi zzafiVar, zzacn zzacnVar, zzaea zzaeaVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i10;
        this.zzi = zzaefVar instanceof zzacz;
        this.zzj = z8;
        boolean z11 = false;
        if (zzacnVar != null && zzacnVar.zzh(zzaefVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzk = iArr2;
        this.zzl = i11;
        this.zzm = i12;
        this.zzq = zzaekVar;
        this.zzn = zzadtVar;
        this.zzo = zzafiVar;
        this.zzp = zzacnVar;
        this.zzg = zzaefVar;
        this.zzr = zzaeaVar;
    }

    private final int zzA(int i7, int i10) {
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

    private static int zzB(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzC(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzD(Object obj, long j) {
        return ((Long) zzafs.zzf(obj, j)).longValue();
    }

    private final zzadd zzE(int i7) {
        int i10 = i7 / 3;
        return (zzadd) this.zzd[i10 + i10 + 1];
    }

    private final zzaer zzF(int i7) {
        int i10 = i7 / 3;
        int i11 = i10 + i10;
        zzaer zzaerVar = (zzaer) this.zzd[i11];
        if (zzaerVar != null) {
            return zzaerVar;
        }
        zzaer zzb2 = zzaen.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i7, Object obj2, zzafi zzafiVar) {
        int i10 = this.zzc[i7];
        Object zzf = zzafs.zzf(obj, zzC(i7) & 1048575);
        if (zzf == null || zzE(i7) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzH(int i7) {
        int i10 = i7 / 3;
        return this.zzd[i10 + i10];
    }

    private static Field zzI(Class cls, String str) {
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

    private final void zzJ(Object obj, Object obj2, int i7) {
        long zzC = zzC(i7) & 1048575;
        if (zzS(obj2, i7)) {
            Object zzf = zzafs.zzf(obj, zzC);
            Object zzf2 = zzafs.zzf(obj2, zzC);
            if (zzf != null && zzf2 != null) {
                zzafs.zzs(obj, zzC, zzadg.zzg(zzf, zzf2));
                zzM(obj, i7);
            } else if (zzf2 != null) {
                zzafs.zzs(obj, zzC, zzf2);
                zzM(obj, i7);
            }
        }
    }

    private final void zzK(Object obj, Object obj2, int i7) {
        int zzC = zzC(i7);
        int i10 = this.zzc[i7];
        long j = zzC & 1048575;
        if (zzV(obj2, i10, i7)) {
            Object zzf = zzV(obj, i10, i7) ? zzafs.zzf(obj, j) : null;
            Object zzf2 = zzafs.zzf(obj2, j);
            if (zzf != null && zzf2 != null) {
                zzafs.zzs(obj, j, zzadg.zzg(zzf, zzf2));
                zzN(obj, i10, i7);
            } else if (zzf2 != null) {
                zzafs.zzs(obj, j, zzf2);
                zzN(obj, i10, i7);
            }
        }
    }

    private final void zzL(Object obj, int i7, zzaeq zzaeqVar) {
        if (zzR(i7)) {
            zzafs.zzs(obj, i7 & 1048575, zzaeqVar.zzu());
        } else if (this.zzi) {
            zzafs.zzs(obj, i7 & 1048575, zzaeqVar.zzt());
        } else {
            zzafs.zzs(obj, i7 & 1048575, zzaeqVar.zzp());
        }
    }

    private final void zzM(Object obj, int i7) {
        int zzz = zzz(i7);
        long j = 1048575 & zzz;
        if (j == 1048575) {
            return;
        }
        zzafs.zzq(obj, j, (1 << (zzz >>> 20)) | zzafs.zzc(obj, j));
    }

    private final void zzN(Object obj, int i7, int i10) {
        zzafs.zzq(obj, zzz(i10) & 1048575, i7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003e. Please report as an issue. */
    private final void zzO(Object obj, zzaga zzagaVar) {
        int i7;
        boolean z8;
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int zzC = zzC(i12);
            int[] iArr = this.zzc;
            int i14 = iArr[i12];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & i10;
                if (i16 != i11) {
                    i13 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i7 = 1 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            long j = zzC & i10;
            switch (zzB) {
                case 0:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzf(i14, zzafs.zza(obj, j));
                        break;
                    }
                case 1:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzo(i14, zzafs.zzb(obj, j));
                        break;
                    }
                case 2:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzt(i14, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzJ(i14, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzr(i14, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzm(i14, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzk(i14, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzb(i14, zzafs.zzw(obj, j));
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzX(i14, unsafe.getObject(obj, j), zzagaVar);
                        break;
                    }
                case 9:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzv(i14, unsafe.getObject(obj, j), zzF(i12));
                        break;
                    }
                case 10:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzd(i14, (zzaby) unsafe.getObject(obj, j));
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzH(i14, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzi(i14, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzw(i14, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzy(i14, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzA(i14, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzC(i14, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i13 & i7) == 0) {
                        break;
                    } else {
                        zzagaVar.zzq(i14, unsafe.getObject(obj, j), zzF(i12));
                        break;
                    }
                case 18:
                    zzaet.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 19:
                    zzaet.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 20:
                    zzaet.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 21:
                    zzaet.zzY(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 22:
                    zzaet.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 23:
                    zzaet.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 24:
                    zzaet.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    zzaet.zzH(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 26:
                    zzaet.zzW(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar);
                    break;
                case 27:
                    zzaet.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, zzF(i12));
                    break;
                case 28:
                    zzaet.zzI(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar);
                    break;
                case 29:
                    z8 = false;
                    zzaet.zzX(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 30:
                    z8 = false;
                    zzaet.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 31:
                    z8 = false;
                    zzaet.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 32:
                    z8 = false;
                    zzaet.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 33:
                    z8 = false;
                    zzaet.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 34:
                    z8 = false;
                    zzaet.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, false);
                    break;
                case 35:
                    zzaet.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 36:
                    zzaet.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 37:
                    zzaet.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 38:
                    zzaet.zzY(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 39:
                    zzaet.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 40:
                    zzaet.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 41:
                    zzaet.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 42:
                    zzaet.zzH(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 43:
                    zzaet.zzX(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 44:
                    zzaet.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 45:
                    zzaet.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 46:
                    zzaet.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 47:
                    zzaet.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 48:
                    zzaet.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, true);
                    break;
                case 49:
                    zzaet.zzO(this.zzc[i12], (List) unsafe.getObject(obj, j), zzagaVar, zzF(i12));
                    break;
                case 50:
                    zzP(zzagaVar, i14, unsafe.getObject(obj, j), i12);
                    break;
                case 51:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzf(i14, zzo(obj, j));
                    }
                    break;
                case 52:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzo(i14, zzp(obj, j));
                    }
                    break;
                case 53:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzt(i14, zzD(obj, j));
                    }
                    break;
                case 54:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzJ(i14, zzD(obj, j));
                    }
                    break;
                case 55:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzr(i14, zzs(obj, j));
                    }
                    break;
                case 56:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzm(i14, zzD(obj, j));
                    }
                    break;
                case 57:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzk(i14, zzs(obj, j));
                    }
                    break;
                case 58:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzb(i14, zzW(obj, j));
                    }
                    break;
                case 59:
                    if (zzV(obj, i14, i12)) {
                        zzX(i14, unsafe.getObject(obj, j), zzagaVar);
                    }
                    break;
                case 60:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzv(i14, unsafe.getObject(obj, j), zzF(i12));
                    }
                    break;
                case 61:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzd(i14, (zzaby) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzH(i14, zzs(obj, j));
                    }
                    break;
                case 63:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzi(i14, zzs(obj, j));
                    }
                    break;
                case 64:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzw(i14, zzs(obj, j));
                    }
                    break;
                case 65:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzy(i14, zzD(obj, j));
                    }
                    break;
                case 66:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzA(i14, zzs(obj, j));
                    }
                    break;
                case 67:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzC(i14, zzD(obj, j));
                    }
                    break;
                case 68:
                    if (zzV(obj, i14, i12)) {
                        zzagaVar.zzq(i14, unsafe.getObject(obj, j), zzF(i12));
                    }
                    break;
            }
            i12 += 3;
            i10 = 1048575;
        }
        zzafi zzafiVar = this.zzo;
        zzafiVar.zzp(zzafiVar.zzd(obj), zzagaVar);
    }

    private final void zzP(zzaga zzagaVar, int i7, Object obj, int i10) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzQ(Object obj, Object obj2, int i7) {
        return zzS(obj, i7) == zzS(obj2, i7);
    }

    private static boolean zzR(int i7) {
        return (i7 & 536870912) != 0;
    }

    private final boolean zzS(Object obj, int i7) {
        int zzz = zzz(i7);
        long j = zzz & 1048575;
        if (j != 1048575) {
            return (zzafs.zzc(obj, j) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i7);
        long j10 = zzC & 1048575;
        switch (zzB(zzC)) {
            case 0:
                return Double.doubleToRawLongBits(zzafs.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzafs.zzb(obj, j10)) != 0;
            case 2:
                return zzafs.zzd(obj, j10) != 0;
            case 3:
                return zzafs.zzd(obj, j10) != 0;
            case 4:
                return zzafs.zzc(obj, j10) != 0;
            case 5:
                return zzafs.zzd(obj, j10) != 0;
            case 6:
                return zzafs.zzc(obj, j10) != 0;
            case 7:
                return zzafs.zzw(obj, j10);
            case g.BYTES_FIELD_NUMBER /* 8 */:
                Object zzf = zzafs.zzf(obj, j10);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzaby) {
                    return !zzaby.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzafs.zzf(obj, j10) != null;
            case 10:
                return !zzaby.zzb.equals(zzafs.zzf(obj, j10));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return zzafs.zzc(obj, j10) != 0;
            case 12:
                return zzafs.zzc(obj, j10) != 0;
            case 13:
                return zzafs.zzc(obj, j10) != 0;
            case 14:
                return zzafs.zzd(obj, j10) != 0;
            case 15:
                return zzafs.zzc(obj, j10) != 0;
            case 16:
                return zzafs.zzd(obj, j10) != 0;
            case 17:
                return zzafs.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzT(Object obj, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzS(obj, i7) : (i11 & i12) != 0;
    }

    private static boolean zzU(Object obj, int i7, zzaer zzaerVar) {
        return zzaerVar.zzl(zzafs.zzf(obj, i7 & 1048575));
    }

    private final boolean zzV(Object obj, int i7, int i10) {
        return zzafs.zzc(obj, (long) (zzz(i10) & 1048575)) == i7;
    }

    private static boolean zzW(Object obj, long j) {
        return ((Boolean) zzafs.zzf(obj, j)).booleanValue();
    }

    private static final void zzX(int i7, Object obj, zzaga zzagaVar) {
        if (obj instanceof String) {
            zzagaVar.zzF(i7, (String) obj);
        } else {
            zzagaVar.zzd(i7, (zzaby) obj);
        }
    }

    public static zzafj zzd(Object obj) {
        zzacz zzaczVar = (zzacz) obj;
        zzafj zzafjVar = zzaczVar.zzc;
        if (zzafjVar != zzafj.zzc()) {
            return zzafjVar;
        }
        zzafj zze = zzafj.zze();
        zzaczVar.zzc = zze;
        return zze;
    }

    public static zzaei zzm(Class cls, zzaec zzaecVar, zzaek zzaekVar, zzadt zzadtVar, zzafi zzafiVar, zzacn zzacnVar, zzaea zzaeaVar) {
        if (zzaecVar instanceof zzaep) {
            return zzn((zzaep) zzaecVar, zzaekVar, zzadtVar, zzafiVar, zzacnVar, zzaeaVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaei zzn(zzaep zzaepVar, zzaek zzaekVar, zzadt zzadtVar, zzafi zzafiVar, zzacn zzacnVar, zzaea zzaeaVar) {
        int i7;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        char charAt11;
        int i22;
        int i23;
        int i24;
        int[] iArr2;
        int i25;
        int i26;
        boolean z8;
        Object[] objArr;
        int objectFieldOffset;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Field zzI;
        char charAt12;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field zzI2;
        Object obj2;
        Field zzI3;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        int i37;
        char charAt15;
        int i38;
        char charAt16;
        boolean z10 = zzaepVar.zzc() == 2;
        String zzd = zzaepVar.zzd();
        int length = zzd.length();
        char c10 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i7 = i39 + 1;
                if (zzd.charAt(i39) < 55296) {
                    break;
                }
                i39 = i7;
            }
        } else {
            i7 = 1;
        }
        int i40 = i7 + 1;
        int charAt17 = zzd.charAt(i7);
        if (charAt17 >= 55296) {
            int i41 = charAt17 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                charAt16 = zzd.charAt(i40);
                if (charAt16 < 55296) {
                    break;
                }
                i41 |= (charAt16 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            charAt17 = i41 | (charAt16 << i42);
            i40 = i38;
        }
        if (charAt17 == 0) {
            charAt = 0;
            i13 = 0;
            charAt2 = 0;
            i12 = 0;
            charAt3 = 0;
            i10 = 0;
            iArr = zza;
            i11 = 0;
        } else {
            int i43 = i40 + 1;
            int charAt18 = zzd.charAt(i40);
            if (charAt18 >= 55296) {
                int i44 = charAt18 & 8191;
                int i45 = 13;
                while (true) {
                    i21 = i43 + 1;
                    charAt11 = zzd.charAt(i43);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i44 |= (charAt11 & 8191) << i45;
                    i45 += 13;
                    i43 = i21;
                }
                charAt18 = i44 | (charAt11 << i45);
                i43 = i21;
            }
            int i46 = i43 + 1;
            int charAt19 = zzd.charAt(i43);
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i20 = i46 + 1;
                    charAt10 = zzd.charAt(i46);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i47 |= (charAt10 & 8191) << i48;
                    i48 += 13;
                    i46 = i20;
                }
                charAt19 = i47 | (charAt10 << i48);
                i46 = i20;
            }
            int i49 = i46 + 1;
            charAt = zzd.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i19 = i49 + 1;
                    charAt9 = zzd.charAt(i49);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i50 |= (charAt9 & 8191) << i51;
                    i51 += 13;
                    i49 = i19;
                }
                charAt = i50 | (charAt9 << i51);
                i49 = i19;
            }
            int i52 = i49 + 1;
            int charAt20 = zzd.charAt(i49);
            if (charAt20 >= 55296) {
                int i53 = charAt20 & 8191;
                int i54 = 13;
                while (true) {
                    i18 = i52 + 1;
                    charAt8 = zzd.charAt(i52);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i53 |= (charAt8 & 8191) << i54;
                    i54 += 13;
                    i52 = i18;
                }
                charAt20 = i53 | (charAt8 << i54);
                i52 = i18;
            }
            int i55 = i52 + 1;
            charAt2 = zzd.charAt(i52);
            if (charAt2 >= 55296) {
                int i56 = charAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i17 = i55 + 1;
                    charAt7 = zzd.charAt(i55);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i56 |= (charAt7 & 8191) << i57;
                    i57 += 13;
                    i55 = i17;
                }
                charAt2 = i56 | (charAt7 << i57);
                i55 = i17;
            }
            int i58 = i55 + 1;
            int charAt21 = zzd.charAt(i55);
            if (charAt21 >= 55296) {
                int i59 = charAt21 & 8191;
                int i60 = 13;
                while (true) {
                    i16 = i58 + 1;
                    charAt6 = zzd.charAt(i58);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i59 |= (charAt6 & 8191) << i60;
                    i60 += 13;
                    i58 = i16;
                }
                charAt21 = i59 | (charAt6 << i60);
                i58 = i16;
            }
            int i61 = i58 + 1;
            int charAt22 = zzd.charAt(i58);
            if (charAt22 >= 55296) {
                int i62 = charAt22 & 8191;
                int i63 = 13;
                while (true) {
                    i15 = i61 + 1;
                    charAt5 = zzd.charAt(i61);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i62 |= (charAt5 & 8191) << i63;
                    i63 += 13;
                    i61 = i15;
                }
                charAt22 = i62 | (charAt5 << i63);
                i61 = i15;
            }
            int i64 = i61 + 1;
            charAt3 = zzd.charAt(i61);
            if (charAt3 >= 55296) {
                int i65 = charAt3 & 8191;
                int i66 = 13;
                while (true) {
                    i14 = i64 + 1;
                    charAt4 = zzd.charAt(i64);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i65 |= (charAt4 & 8191) << i66;
                    i66 += 13;
                    i64 = i14;
                }
                charAt3 = i65 | (charAt4 << i66);
                i64 = i14;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i10 = charAt18 + charAt18 + charAt19;
            i11 = charAt18;
            i40 = i64;
            int i67 = charAt21;
            i12 = charAt20;
            i13 = i67;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzaepVar.zze();
        Class<?> cls = zzaepVar.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i68 = charAt3 + i13;
        int i69 = charAt3;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i40 < length) {
            int i73 = i40 + 1;
            int charAt23 = zzd.charAt(i40);
            if (charAt23 >= c10) {
                int i74 = charAt23 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i37 = i75 + 1;
                    charAt15 = zzd.charAt(i75);
                    if (charAt15 < c10) {
                        break;
                    }
                    i74 |= (charAt15 & 8191) << i76;
                    i76 += 13;
                    i75 = i37;
                }
                charAt23 = i74 | (charAt15 << i76);
                i22 = i37;
            } else {
                i22 = i73;
            }
            int i77 = i22 + 1;
            int charAt24 = zzd.charAt(i22);
            if (charAt24 >= c10) {
                int i78 = charAt24 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i36 = i79 + 1;
                    charAt14 = zzd.charAt(i79);
                    i23 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i78 |= (charAt14 & 8191) << i80;
                    i80 += 13;
                    i79 = i36;
                    length = i23;
                }
                charAt24 = i78 | (charAt14 << i80);
                i24 = i36;
            } else {
                i23 = length;
                i24 = i77;
            }
            int i81 = charAt24 & 255;
            int i82 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            if (i81 >= 51) {
                int i83 = i24 + 1;
                int charAt25 = zzd.charAt(i24);
                if (charAt25 >= 55296) {
                    int i84 = charAt25 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i35 = i85 + 1;
                        charAt13 = zzd.charAt(i85);
                        i26 = i12;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i84 |= (charAt13 & 8191) << i86;
                        i86 += 13;
                        i85 = i35;
                        i12 = i26;
                    }
                    charAt25 = i84 | (charAt13 << i86);
                    i33 = i35;
                } else {
                    i26 = i12;
                    i33 = i83;
                }
                int i87 = i81 - 51;
                int i88 = i33;
                if (i87 == 9 || i87 == 17) {
                    int i89 = i71 / 3;
                    i34 = i10 + 1;
                    objArr2[i89 + i89 + 1] = zze[i10];
                } else {
                    if (i87 == 12 && !z10) {
                        int i90 = i71 / 3;
                        i34 = i10 + 1;
                        objArr2[i90 + i90 + 1] = zze[i10];
                    }
                    int i91 = charAt25 + charAt25;
                    obj = zze[i91];
                    if (obj instanceof Field) {
                        zzI2 = zzI(cls, (String) obj);
                        zze[i91] = zzI2;
                    } else {
                        zzI2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i25 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzI2);
                    int i92 = i91 + 1;
                    obj2 = zze[i92];
                    if (obj2 instanceof Field) {
                        zzI3 = zzI(cls, (String) obj2);
                        zze[i92] = zzI3;
                    } else {
                        zzI3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(zzI3);
                    z8 = z10;
                    objArr = objArr2;
                    i30 = i10;
                    i27 = i88;
                    i29 = objectFieldOffset3;
                    i31 = objectFieldOffset2;
                    i28 = 0;
                }
                i10 = i34;
                int i912 = charAt25 + charAt25;
                obj = zze[i912];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i25 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzI2);
                int i922 = i912 + 1;
                obj2 = zze[i922];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(zzI3);
                z8 = z10;
                objArr = objArr2;
                i30 = i10;
                i27 = i88;
                i29 = objectFieldOffset32;
                i31 = objectFieldOffset22;
                i28 = 0;
            } else {
                iArr2 = iArr3;
                i25 = charAt;
                i26 = i12;
                int i93 = i10 + 1;
                Field zzI4 = zzI(cls, (String) zze[i10]);
                if (i81 == 9 || i81 == 17) {
                    z8 = z10;
                    objArr2[X.c.a(i71, 3, 1)] = zzI4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        z8 = z10;
                        int i94 = i71 / 3;
                        i32 = i10 + 2;
                        objArr2[i94 + i94 + 1] = zze[i93];
                    } else {
                        if (i81 == 12 || i81 == 30 || i81 == 44) {
                            if (!z10) {
                                int i95 = i71 / 3;
                                i32 = i10 + 2;
                                z8 = z10;
                                objArr2[i95 + i95 + 1] = zze[i93];
                            }
                        } else if (i81 == 50) {
                            int i96 = i69 + 1;
                            iArr[i69] = i71;
                            int i97 = i71 / 3;
                            int i98 = i97 + i97;
                            int i99 = i10 + 2;
                            objArr2[i98] = zze[i93];
                            if ((charAt24 & 2048) != 0) {
                                i93 = i10 + 3;
                                objArr2[i98 + 1] = zze[i99];
                                z8 = z10;
                                i69 = i96;
                            } else {
                                i69 = i96;
                                i93 = i99;
                                z8 = z10;
                            }
                        }
                        z8 = z10;
                    }
                    objArr = objArr2;
                    i93 = i32;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                    if ((charAt24 & 4096) == 4096 || i81 > 17) {
                        i27 = i24;
                        i28 = 0;
                        i29 = 1048575;
                    } else {
                        int i100 = i24 + 1;
                        int charAt26 = zzd.charAt(i24);
                        if (charAt26 >= 55296) {
                            int i101 = charAt26 & 8191;
                            int i102 = 13;
                            while (true) {
                                i27 = i100 + 1;
                                charAt12 = zzd.charAt(i100);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i101 |= (charAt12 & 8191) << i102;
                                i102 += 13;
                                i100 = i27;
                            }
                            charAt26 = i101 | (charAt12 << i102);
                        } else {
                            i27 = i100;
                        }
                        int i103 = (charAt26 / 32) + i11 + i11;
                        Object obj3 = zze[i103];
                        if (obj3 instanceof Field) {
                            zzI = (Field) obj3;
                        } else {
                            zzI = zzI(cls, (String) obj3);
                            zze[i103] = zzI;
                        }
                        i28 = charAt26 % 32;
                        i29 = (int) unsafe.objectFieldOffset(zzI);
                    }
                    if (i81 >= 18 && i81 <= 49) {
                        iArr[i70] = objectFieldOffset;
                        i70++;
                    }
                    i30 = i93;
                    i31 = objectFieldOffset;
                }
                objArr = objArr2;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                if ((charAt24 & 4096) == 4096) {
                }
                i27 = i24;
                i28 = 0;
                i29 = 1048575;
                if (i81 >= 18) {
                    iArr[i70] = objectFieldOffset;
                    i70++;
                }
                i30 = i93;
                i31 = objectFieldOffset;
            }
            int i104 = i71 + 1;
            iArr2[i71] = charAt23;
            int i105 = i71 + 2;
            iArr2[i104] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i81 << 20) | i31;
            i71 += 3;
            iArr2[i105] = (i28 << 20) | i29;
            i10 = i30;
            objArr2 = objArr;
            charAt = i25;
            charAt3 = i82;
            i40 = i27;
            length = i23;
            z10 = z8;
            iArr3 = iArr2;
            i12 = i26;
            c10 = 55296;
        }
        return new zzaei(iArr3, objArr2, charAt, i12, zzaepVar.zza(), z10, false, iArr, charAt3, i68, zzaekVar, zzadtVar, zzafiVar, zzacnVar, zzaeaVar, null);
    }

    private static double zzo(Object obj, long j) {
        return ((Double) zzafs.zzf(obj, j)).doubleValue();
    }

    private static float zzp(Object obj, long j) {
        return ((Float) zzafs.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003e. Please report as an issue. */
    private final int zzq(Object obj) {
        int i7;
        int zzA;
        int zzB;
        int i10;
        int zzA2;
        int zzv;
        int zzo;
        int zzu;
        boolean z8;
        int zzd;
        int zzA3;
        int zzB2;
        int i11;
        int zzA4;
        int zzv2;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < this.zzc.length) {
            int zzC = zzC(i14);
            int[] iArr = this.zzc;
            int i17 = iArr[i14];
            int zzB3 = zzB(zzC);
            if (zzB3 <= 17) {
                int i18 = iArr[i14 + 2];
                int i19 = i18 & i12;
                i7 = 1 << (i18 >>> 20);
                if (i19 != i13) {
                    i16 = unsafe.getInt(obj, i19);
                    i13 = i19;
                }
            } else {
                i7 = 0;
            }
            long j = zzC & i12;
            switch (zzB3) {
                case 0:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        i15 = X.c.w(i17 << 3, 8, i15);
                        break;
                    }
                case 1:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        i15 = X.c.w(i17 << 3, 4, i15);
                        break;
                    }
                case 2:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        long j10 = unsafe.getLong(obj, j);
                        zzA = zzach.zzA(i17 << 3);
                        zzB = zzach.zzB(j10);
                        i10 = zzB + zzA;
                        i15 += i10;
                        break;
                    }
                case 3:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j);
                        zzA = zzach.zzA(i17 << 3);
                        zzB = zzach.zzB(j11);
                        i10 = zzB + zzA;
                        i15 += i10;
                        break;
                    }
                case 4:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        int i20 = unsafe.getInt(obj, j);
                        zzA2 = zzach.zzA(i17 << 3);
                        zzv = zzach.zzv(i20);
                        i10 = zzv + zzA2;
                        i15 += i10;
                        break;
                    }
                case 5:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        i15 = X.c.w(i17 << 3, 8, i15);
                        break;
                    }
                case 6:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        i15 = X.c.w(i17 << 3, 4, i15);
                        break;
                    }
                case 7:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        i15 = X.c.w(i17 << 3, 1, i15);
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzaby)) {
                            zzA2 = zzach.zzA(i17 << 3);
                            zzv = zzach.zzy((String) object);
                            i10 = zzv + zzA2;
                            i15 += i10;
                            break;
                        } else {
                            int zzA5 = zzach.zzA(i17 << 3);
                            int zzd2 = ((zzaby) object).zzd();
                            i15 = X.c.v(zzd2, zzd2, zzA5, i15);
                            break;
                        }
                    }
                case 9:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        zzo = zzaet.zzo(i17, unsafe.getObject(obj, j), zzF(i14));
                        i15 += zzo;
                        break;
                    }
                case 10:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        zzaby zzabyVar = (zzaby) unsafe.getObject(obj, j);
                        int zzA6 = zzach.zzA(i17 << 3);
                        int zzd3 = zzabyVar.zzd();
                        i15 = X.c.v(zzd3, zzd3, zzA6, i15);
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        i15 = X.c.w(unsafe.getInt(obj, j), zzach.zzA(i17 << 3), i15);
                        break;
                    }
                case 12:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        int i21 = unsafe.getInt(obj, j);
                        zzA2 = zzach.zzA(i17 << 3);
                        zzv = zzach.zzv(i21);
                        i10 = zzv + zzA2;
                        i15 += i10;
                        break;
                    }
                case 13:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        i15 = X.c.w(i17 << 3, 4, i15);
                        break;
                    }
                case 14:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        i15 = X.c.w(i17 << 3, 8, i15);
                        break;
                    }
                case 15:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        int i22 = unsafe.getInt(obj, j);
                        i15 = X.c.w((i22 >> 31) ^ (i22 + i22), zzach.zzA(i17 << 3), i15);
                        break;
                    }
                case 16:
                    if ((i7 & i16) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j);
                        i10 = zzach.zzB((j12 >> 63) ^ (j12 + j12)) + zzach.zzA(i17 << 3);
                        i15 += i10;
                        break;
                    }
                case 17:
                    if ((i16 & i7) == 0) {
                        break;
                    } else {
                        i10 = zzach.zzu(i17, (zzaef) unsafe.getObject(obj, j), zzF(i14));
                        i15 += i10;
                        break;
                    }
                case 18:
                    zzo = zzaet.zzh(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzo;
                    break;
                case 19:
                    zzo = zzaet.zzf(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzo;
                    break;
                case 20:
                    zzo = zzaet.zzm(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzo;
                    break;
                case 21:
                    zzo = zzaet.zzx(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzo;
                    break;
                case 22:
                    zzo = zzaet.zzk(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzo;
                    break;
                case 23:
                    zzo = zzaet.zzh(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzo;
                    break;
                case 24:
                    zzo = zzaet.zzf(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzo;
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    zzo = zzaet.zza(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzo;
                    break;
                case 26:
                    zzu = zzaet.zzu(i17, (List) unsafe.getObject(obj, j));
                    i15 += zzu;
                    break;
                case 27:
                    zzu = zzaet.zzp(i17, (List) unsafe.getObject(obj, j), zzF(i14));
                    i15 += zzu;
                    break;
                case 28:
                    zzu = zzaet.zzc(i17, (List) unsafe.getObject(obj, j));
                    i15 += zzu;
                    break;
                case 29:
                    zzu = zzaet.zzv(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzu;
                    break;
                case 30:
                    z8 = false;
                    zzd = zzaet.zzd(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzd;
                    break;
                case 31:
                    z8 = false;
                    zzd = zzaet.zzf(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzd;
                    break;
                case 32:
                    z8 = false;
                    zzd = zzaet.zzh(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzd;
                    break;
                case 33:
                    z8 = false;
                    zzd = zzaet.zzq(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzd;
                    break;
                case 34:
                    z8 = false;
                    zzd = zzaet.zzs(i17, (List) unsafe.getObject(obj, j), false);
                    i15 += zzd;
                    break;
                case 35:
                    int zzi = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        i15 = X.c.v(zzi, zzach.zzz(i17), zzi, i15);
                    }
                    break;
                case 36:
                    int zzg = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzg > 0) {
                        i15 = X.c.v(zzg, zzach.zzz(i17), zzg, i15);
                    }
                    break;
                case 37:
                    int zzn = zzaet.zzn((List) unsafe.getObject(obj, j));
                    if (zzn > 0) {
                        i15 = X.c.v(zzn, zzach.zzz(i17), zzn, i15);
                    }
                    break;
                case 38:
                    int zzy = zzaet.zzy((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        i15 = X.c.v(zzy, zzach.zzz(i17), zzy, i15);
                    }
                    break;
                case 39:
                    int zzl = zzaet.zzl((List) unsafe.getObject(obj, j));
                    if (zzl > 0) {
                        i15 = X.c.v(zzl, zzach.zzz(i17), zzl, i15);
                    }
                    break;
                case 40:
                    int zzi2 = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi2 > 0) {
                        i15 = X.c.v(zzi2, zzach.zzz(i17), zzi2, i15);
                    }
                    break;
                case 41:
                    int zzg2 = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzg2 > 0) {
                        i15 = X.c.v(zzg2, zzach.zzz(i17), zzg2, i15);
                    }
                    break;
                case 42:
                    int zzb2 = zzaet.zzb((List) unsafe.getObject(obj, j));
                    if (zzb2 > 0) {
                        i15 = X.c.v(zzb2, zzach.zzz(i17), zzb2, i15);
                    }
                    break;
                case 43:
                    int zzw = zzaet.zzw((List) unsafe.getObject(obj, j));
                    if (zzw > 0) {
                        i15 = X.c.v(zzw, zzach.zzz(i17), zzw, i15);
                    }
                    break;
                case 44:
                    int zze = zzaet.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        i15 = X.c.v(zze, zzach.zzz(i17), zze, i15);
                    }
                    break;
                case 45:
                    int zzg3 = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzg3 > 0) {
                        i15 = X.c.v(zzg3, zzach.zzz(i17), zzg3, i15);
                    }
                    break;
                case 46:
                    int zzi3 = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi3 > 0) {
                        i15 = X.c.v(zzi3, zzach.zzz(i17), zzi3, i15);
                    }
                    break;
                case 47:
                    int zzr = zzaet.zzr((List) unsafe.getObject(obj, j));
                    if (zzr > 0) {
                        i15 = X.c.v(zzr, zzach.zzz(i17), zzr, i15);
                    }
                    break;
                case 48:
                    int zzt = zzaet.zzt((List) unsafe.getObject(obj, j));
                    if (zzt > 0) {
                        i15 = X.c.v(zzt, zzach.zzz(i17), zzt, i15);
                    }
                    break;
                case 49:
                    zzu = zzaet.zzj(i17, (List) unsafe.getObject(obj, j), zzF(i14));
                    i15 += zzu;
                    break;
                case 50:
                    zzaea.zza(i17, unsafe.getObject(obj, j), zzH(i14));
                    break;
                case 51:
                    if (zzV(obj, i17, i14)) {
                        i15 = X.c.w(i17 << 3, 8, i15);
                    }
                    break;
                case 52:
                    if (zzV(obj, i17, i14)) {
                        i15 = X.c.w(i17 << 3, 4, i15);
                    }
                    break;
                case 53:
                    if (zzV(obj, i17, i14)) {
                        long zzD = zzD(obj, j);
                        zzA3 = zzach.zzA(i17 << 3);
                        zzB2 = zzach.zzB(zzD);
                        i11 = zzB2 + zzA3;
                        i15 += i11;
                    }
                    break;
                case 54:
                    if (zzV(obj, i17, i14)) {
                        long zzD2 = zzD(obj, j);
                        zzA3 = zzach.zzA(i17 << 3);
                        zzB2 = zzach.zzB(zzD2);
                        i11 = zzB2 + zzA3;
                        i15 += i11;
                    }
                    break;
                case 55:
                    if (zzV(obj, i17, i14)) {
                        int zzs = zzs(obj, j);
                        zzA4 = zzach.zzA(i17 << 3);
                        zzv2 = zzach.zzv(zzs);
                        i11 = zzv2 + zzA4;
                        i15 += i11;
                    }
                    break;
                case 56:
                    if (zzV(obj, i17, i14)) {
                        i15 = X.c.w(i17 << 3, 8, i15);
                    }
                    break;
                case 57:
                    if (zzV(obj, i17, i14)) {
                        i15 = X.c.w(i17 << 3, 4, i15);
                    }
                    break;
                case 58:
                    if (zzV(obj, i17, i14)) {
                        i15 = X.c.w(i17 << 3, 1, i15);
                    }
                    break;
                case 59:
                    if (zzV(obj, i17, i14)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzaby) {
                            int zzA7 = zzach.zzA(i17 << 3);
                            int zzd4 = ((zzaby) object2).zzd();
                            i15 = X.c.v(zzd4, zzd4, zzA7, i15);
                        } else {
                            zzA4 = zzach.zzA(i17 << 3);
                            zzv2 = zzach.zzy((String) object2);
                            i11 = zzv2 + zzA4;
                            i15 += i11;
                        }
                    }
                    break;
                case 60:
                    if (zzV(obj, i17, i14)) {
                        zzu = zzaet.zzo(i17, unsafe.getObject(obj, j), zzF(i14));
                        i15 += zzu;
                    }
                    break;
                case 61:
                    if (zzV(obj, i17, i14)) {
                        zzaby zzabyVar2 = (zzaby) unsafe.getObject(obj, j);
                        int zzA8 = zzach.zzA(i17 << 3);
                        int zzd5 = zzabyVar2.zzd();
                        i15 = X.c.v(zzd5, zzd5, zzA8, i15);
                    }
                    break;
                case 62:
                    if (zzV(obj, i17, i14)) {
                        i15 = X.c.w(zzs(obj, j), zzach.zzA(i17 << 3), i15);
                    }
                    break;
                case 63:
                    if (zzV(obj, i17, i14)) {
                        int zzs2 = zzs(obj, j);
                        zzA4 = zzach.zzA(i17 << 3);
                        zzv2 = zzach.zzv(zzs2);
                        i11 = zzv2 + zzA4;
                        i15 += i11;
                    }
                    break;
                case 64:
                    if (zzV(obj, i17, i14)) {
                        i15 = X.c.w(i17 << 3, 4, i15);
                    }
                    break;
                case 65:
                    if (zzV(obj, i17, i14)) {
                        i15 = X.c.w(i17 << 3, 8, i15);
                    }
                    break;
                case 66:
                    if (zzV(obj, i17, i14)) {
                        int zzs3 = zzs(obj, j);
                        i15 = X.c.w((zzs3 >> 31) ^ (zzs3 + zzs3), zzach.zzA(i17 << 3), i15);
                    }
                    break;
                case 67:
                    if (zzV(obj, i17, i14)) {
                        long zzD3 = zzD(obj, j);
                        i11 = zzach.zzB((zzD3 >> 63) ^ (zzD3 + zzD3)) + zzach.zzA(i17 << 3);
                        i15 += i11;
                    }
                    break;
                case 68:
                    if (zzV(obj, i17, i14)) {
                        i11 = zzach.zzu(i17, (zzaef) unsafe.getObject(obj, j), zzF(i14));
                        i15 += i11;
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
        zzafi zzafiVar = this.zzo;
        int zza2 = i15 + zzafiVar.zza(zzafiVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzp.zza(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0037. Please report as an issue. */
    private final int zzr(Object obj) {
        int zzA;
        int zzB;
        int zzA2;
        int zzv;
        int zzo;
        int zzu;
        Unsafe unsafe = zzb;
        int i7 = 0;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzC = zzC(i10);
            int zzB2 = zzB(zzC);
            int i11 = this.zzc[i10];
            long j = zzC & 1048575;
            if (zzB2 >= zzacs.zzJ.zza() && zzB2 <= zzacs.zzW.zza()) {
                int i12 = this.zzc[i10 + 2];
            }
            switch (zzB2) {
                case 0:
                    if (zzS(obj, i10)) {
                        i7 = X.c.w(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzS(obj, i10)) {
                        i7 = X.c.w(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzS(obj, i10)) {
                        long zzd = zzafs.zzd(obj, j);
                        zzA = zzach.zzA(i11 << 3);
                        zzB = zzach.zzB(zzd);
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzS(obj, i10)) {
                        long zzd2 = zzafs.zzd(obj, j);
                        zzA = zzach.zzA(i11 << 3);
                        zzB = zzach.zzB(zzd2);
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzS(obj, i10)) {
                        int zzc = zzafs.zzc(obj, j);
                        zzA2 = zzach.zzA(i11 << 3);
                        zzv = zzach.zzv(zzc);
                        zzu = zzv + zzA2;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzS(obj, i10)) {
                        i7 = X.c.w(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzS(obj, i10)) {
                        i7 = X.c.w(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzS(obj, i10)) {
                        i7 = X.c.w(i11 << 3, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzS(obj, i10)) {
                        Object zzf = zzafs.zzf(obj, j);
                        if (zzf instanceof zzaby) {
                            int zzA3 = zzach.zzA(i11 << 3);
                            int zzd3 = ((zzaby) zzf).zzd();
                            i7 = X.c.v(zzd3, zzd3, zzA3, i7);
                            break;
                        } else {
                            zzA2 = zzach.zzA(i11 << 3);
                            zzv = zzach.zzy((String) zzf);
                            zzu = zzv + zzA2;
                            i7 += zzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzS(obj, i10)) {
                        zzo = zzaet.zzo(i11, zzafs.zzf(obj, j), zzF(i10));
                        i7 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzS(obj, i10)) {
                        zzaby zzabyVar = (zzaby) zzafs.zzf(obj, j);
                        int zzA4 = zzach.zzA(i11 << 3);
                        int zzd4 = zzabyVar.zzd();
                        i7 = X.c.v(zzd4, zzd4, zzA4, i7);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzS(obj, i10)) {
                        i7 = X.c.w(zzafs.zzc(obj, j), zzach.zzA(i11 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzS(obj, i10)) {
                        int zzc2 = zzafs.zzc(obj, j);
                        zzA2 = zzach.zzA(i11 << 3);
                        zzv = zzach.zzv(zzc2);
                        zzu = zzv + zzA2;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzS(obj, i10)) {
                        i7 = X.c.w(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzS(obj, i10)) {
                        i7 = X.c.w(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzS(obj, i10)) {
                        int zzc3 = zzafs.zzc(obj, j);
                        i7 = X.c.w((zzc3 >> 31) ^ (zzc3 + zzc3), zzach.zzA(i11 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzS(obj, i10)) {
                        long zzd5 = zzafs.zzd(obj, j);
                        zzA = zzach.zzA(i11 << 3);
                        zzB = zzach.zzB((zzd5 >> 63) ^ (zzd5 + zzd5));
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzS(obj, i10)) {
                        zzu = zzach.zzu(i11, (zzaef) zzafs.zzf(obj, j), zzF(i10));
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzaet.zzh(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 19:
                    zzo = zzaet.zzf(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 20:
                    zzo = zzaet.zzm(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 21:
                    zzo = zzaet.zzx(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 22:
                    zzo = zzaet.zzk(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 23:
                    zzo = zzaet.zzh(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 24:
                    zzo = zzaet.zzf(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    zzo = zzaet.zza(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 26:
                    zzo = zzaet.zzu(i11, (List) zzafs.zzf(obj, j));
                    i7 += zzo;
                    break;
                case 27:
                    zzo = zzaet.zzp(i11, (List) zzafs.zzf(obj, j), zzF(i10));
                    i7 += zzo;
                    break;
                case 28:
                    zzo = zzaet.zzc(i11, (List) zzafs.zzf(obj, j));
                    i7 += zzo;
                    break;
                case 29:
                    zzo = zzaet.zzv(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 30:
                    zzo = zzaet.zzd(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 31:
                    zzo = zzaet.zzf(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 32:
                    zzo = zzaet.zzh(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 33:
                    zzo = zzaet.zzq(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 34:
                    zzo = zzaet.zzs(i11, (List) zzafs.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 35:
                    int zzi = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        i7 = X.c.v(zzi, zzach.zzz(i11), zzi, i7);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzg = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzg > 0) {
                        i7 = X.c.v(zzg, zzach.zzz(i11), zzg, i7);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzn = zzaet.zzn((List) unsafe.getObject(obj, j));
                    if (zzn > 0) {
                        i7 = X.c.v(zzn, zzach.zzz(i11), zzn, i7);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzy = zzaet.zzy((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        i7 = X.c.v(zzy, zzach.zzz(i11), zzy, i7);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzl = zzaet.zzl((List) unsafe.getObject(obj, j));
                    if (zzl > 0) {
                        i7 = X.c.v(zzl, zzach.zzz(i11), zzl, i7);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzi2 = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi2 > 0) {
                        i7 = X.c.v(zzi2, zzach.zzz(i11), zzi2, i7);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzg2 = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzg2 > 0) {
                        i7 = X.c.v(zzg2, zzach.zzz(i11), zzg2, i7);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzb2 = zzaet.zzb((List) unsafe.getObject(obj, j));
                    if (zzb2 > 0) {
                        i7 = X.c.v(zzb2, zzach.zzz(i11), zzb2, i7);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzw = zzaet.zzw((List) unsafe.getObject(obj, j));
                    if (zzw > 0) {
                        i7 = X.c.v(zzw, zzach.zzz(i11), zzw, i7);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zze = zzaet.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        i7 = X.c.v(zze, zzach.zzz(i11), zze, i7);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzg3 = zzaet.zzg((List) unsafe.getObject(obj, j));
                    if (zzg3 > 0) {
                        i7 = X.c.v(zzg3, zzach.zzz(i11), zzg3, i7);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzi3 = zzaet.zzi((List) unsafe.getObject(obj, j));
                    if (zzi3 > 0) {
                        i7 = X.c.v(zzi3, zzach.zzz(i11), zzi3, i7);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzr = zzaet.zzr((List) unsafe.getObject(obj, j));
                    if (zzr > 0) {
                        i7 = X.c.v(zzr, zzach.zzz(i11), zzr, i7);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzt = zzaet.zzt((List) unsafe.getObject(obj, j));
                    if (zzt > 0) {
                        i7 = X.c.v(zzt, zzach.zzz(i11), zzt, i7);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzaet.zzj(i11, (List) zzafs.zzf(obj, j), zzF(i10));
                    i7 += zzo;
                    break;
                case 50:
                    zzaea.zza(i11, zzafs.zzf(obj, j), zzH(i10));
                    break;
                case 51:
                    if (zzV(obj, i11, i10)) {
                        i7 = X.c.w(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzV(obj, i11, i10)) {
                        i7 = X.c.w(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzV(obj, i11, i10)) {
                        long zzD = zzD(obj, j);
                        zzA = zzach.zzA(i11 << 3);
                        zzB = zzach.zzB(zzD);
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzV(obj, i11, i10)) {
                        long zzD2 = zzD(obj, j);
                        zzA = zzach.zzA(i11 << 3);
                        zzB = zzach.zzB(zzD2);
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzV(obj, i11, i10)) {
                        int zzs = zzs(obj, j);
                        zzA2 = zzach.zzA(i11 << 3);
                        zzv = zzach.zzv(zzs);
                        zzu = zzv + zzA2;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzV(obj, i11, i10)) {
                        i7 = X.c.w(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzV(obj, i11, i10)) {
                        i7 = X.c.w(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzV(obj, i11, i10)) {
                        i7 = X.c.w(i11 << 3, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzV(obj, i11, i10)) {
                        Object zzf2 = zzafs.zzf(obj, j);
                        if (zzf2 instanceof zzaby) {
                            int zzA5 = zzach.zzA(i11 << 3);
                            int zzd6 = ((zzaby) zzf2).zzd();
                            i7 = X.c.v(zzd6, zzd6, zzA5, i7);
                            break;
                        } else {
                            zzA2 = zzach.zzA(i11 << 3);
                            zzv = zzach.zzy((String) zzf2);
                            zzu = zzv + zzA2;
                            i7 += zzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzV(obj, i11, i10)) {
                        zzo = zzaet.zzo(i11, zzafs.zzf(obj, j), zzF(i10));
                        i7 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzV(obj, i11, i10)) {
                        zzaby zzabyVar2 = (zzaby) zzafs.zzf(obj, j);
                        int zzA6 = zzach.zzA(i11 << 3);
                        int zzd7 = zzabyVar2.zzd();
                        i7 = X.c.v(zzd7, zzd7, zzA6, i7);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzV(obj, i11, i10)) {
                        i7 = X.c.w(zzs(obj, j), zzach.zzA(i11 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzV(obj, i11, i10)) {
                        int zzs2 = zzs(obj, j);
                        zzA2 = zzach.zzA(i11 << 3);
                        zzv = zzach.zzv(zzs2);
                        zzu = zzv + zzA2;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzV(obj, i11, i10)) {
                        i7 = X.c.w(i11 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzV(obj, i11, i10)) {
                        i7 = X.c.w(i11 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzV(obj, i11, i10)) {
                        int zzs3 = zzs(obj, j);
                        i7 = X.c.w((zzs3 >> 31) ^ (zzs3 + zzs3), zzach.zzA(i11 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzV(obj, i11, i10)) {
                        long zzD3 = zzD(obj, j);
                        zzA = zzach.zzA(i11 << 3);
                        zzB = zzach.zzB((zzD3 >> 63) ^ (zzD3 + zzD3));
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzV(obj, i11, i10)) {
                        zzu = zzach.zzu(i11, (zzaef) zzafs.zzf(obj, j), zzF(i10));
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzafi zzafiVar = this.zzo;
        return i7 + zzafiVar.zza(zzafiVar.zzd(obj));
    }

    private static int zzs(Object obj, long j) {
        return ((Integer) zzafs.zzf(obj, j)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i7, int i10, int i11, long j, zzabl zzablVar) {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i11);
        Object object = unsafe.getObject(obj, j);
        if (zzaea.zzb(object)) {
            zzadz zzb2 = zzadz.zza().zzb();
            zzaea.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j, int i16, zzabl zzablVar) {
        Unsafe unsafe = zzb;
        long j10 = this.zzc[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzabm.zzn(bArr, i7))));
                    unsafe.putInt(obj, j10, i12);
                    return i7 + 8;
                }
                return i7;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzabm.zzb(bArr, i7))));
                    unsafe.putInt(obj, j10, i12);
                    return i7 + 4;
                }
                return i7;
            case 53:
            case 54:
                if (i13 == 0) {
                    int zzm = zzabm.zzm(bArr, i7, zzablVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzablVar.zzb));
                    unsafe.putInt(obj, j10, i12);
                    return zzm;
                }
                return i7;
            case 55:
            case 62:
                if (i13 == 0) {
                    int zzj = zzabm.zzj(bArr, i7, zzablVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzablVar.zza));
                    unsafe.putInt(obj, j10, i12);
                    return zzj;
                }
                return i7;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzabm.zzn(bArr, i7)));
                    unsafe.putInt(obj, j10, i12);
                    return i7 + 8;
                }
                return i7;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzabm.zzb(bArr, i7)));
                    unsafe.putInt(obj, j10, i12);
                    return i7 + 4;
                }
                return i7;
            case 58:
                if (i13 == 0) {
                    int zzm2 = zzabm.zzm(bArr, i7, zzablVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzablVar.zzb != 0));
                    unsafe.putInt(obj, j10, i12);
                    return zzm2;
                }
                return i7;
            case 59:
                if (i13 == 2) {
                    int zzj2 = zzabm.zzj(bArr, i7, zzablVar);
                    int i17 = zzablVar.zza;
                    if (i17 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i14 & 536870912) != 0 && !zzafx.zzf(bArr, zzj2, zzj2 + i17)) {
                            throw zzadi.zzd();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i17, zzadg.zzb));
                        zzj2 += i17;
                    }
                    unsafe.putInt(obj, j10, i12);
                    return zzj2;
                }
                return i7;
            case 60:
                if (i13 == 2) {
                    int zzd = zzabm.zzd(zzF(i16), bArr, i7, i10, zzablVar);
                    Object object = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzablVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzadg.zzg(object, zzablVar.zzc));
                    }
                    unsafe.putInt(obj, j10, i12);
                    return zzd;
                }
                return i7;
            case 61:
                if (i13 == 2) {
                    int zza2 = zzabm.zza(bArr, i7, zzablVar);
                    unsafe.putObject(obj, j, zzablVar.zzc);
                    unsafe.putInt(obj, j10, i12);
                    return zza2;
                }
                return i7;
            case 63:
                if (i13 == 0) {
                    int zzj3 = zzabm.zzj(bArr, i7, zzablVar);
                    int i18 = zzablVar.zza;
                    zzadd zzE = zzE(i16);
                    if (zzE == null || zzE.zza(i18)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i18));
                        unsafe.putInt(obj, j10, i12);
                    } else {
                        zzd(obj).zzh(i11, Long.valueOf(i18));
                    }
                    return zzj3;
                }
                return i7;
            case 66:
                if (i13 == 0) {
                    int zzj4 = zzabm.zzj(bArr, i7, zzablVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzacc.zzs(zzablVar.zza)));
                    unsafe.putInt(obj, j10, i12);
                    return zzj4;
                }
                return i7;
            case 67:
                if (i13 == 0) {
                    int zzm3 = zzabm.zzm(bArr, i7, zzablVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzacc.zzt(zzablVar.zzb)));
                    unsafe.putInt(obj, j10, i12);
                    return zzm3;
                }
                return i7;
            case 68:
                if (i13 == 3) {
                    int zzc = zzabm.zzc(zzF(i16), bArr, i7, i10, (i11 & (-8)) | 4, zzablVar);
                    Object object2 = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzablVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzadg.zzg(object2, zzablVar.zzc));
                    }
                    unsafe.putInt(obj, j10, i12);
                    return zzc;
                }
                return i7;
            default:
                return i7;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0081. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzv(Object obj, byte[] bArr, int i7, int i10, zzabl zzablVar) {
        byte b2;
        int i11;
        int i12;
        int i13;
        int i14;
        Unsafe unsafe;
        int i15;
        int i16;
        int i17;
        int i18;
        int zzm;
        int zzd;
        int i19;
        int i20;
        int i21;
        zzaei<T> zzaeiVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i22 = i10;
        zzabl zzablVar2 = zzablVar;
        Unsafe unsafe2 = zzb;
        int i23 = 1048575;
        int i24 = -1;
        int i25 = i7;
        int i26 = -1;
        int i27 = 1048575;
        int i28 = 0;
        int i29 = 0;
        while (i25 < i22) {
            int i30 = i25 + 1;
            byte b10 = bArr2[i25];
            if (b10 < 0) {
                i11 = zzabm.zzk(b10, bArr2, i30, zzablVar2);
                b2 = zzablVar2.zza;
            } else {
                b2 = b10;
                i11 = i30;
            }
            int i31 = b2 >>> 3;
            int i32 = b2 & 7;
            int zzy = i31 > i26 ? zzaeiVar.zzy(i31, i28 / 3) : zzaeiVar.zzx(i31);
            if (zzy == i24) {
                i12 = i11;
                i13 = i31;
                i14 = i24;
                unsafe = unsafe2;
                i15 = 0;
            } else {
                int[] iArr = zzaeiVar.zzc;
                int i33 = iArr[zzy + 1];
                int zzB = zzB(i33);
                long j = i33 & i23;
                if (zzB <= 17) {
                    int i34 = iArr[zzy + 2];
                    int i35 = 1 << (i34 >>> 20);
                    int i36 = i34 & 1048575;
                    if (i36 != i27) {
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj2, i27, i29);
                        }
                        if (i36 != 1048575) {
                            i29 = unsafe2.getInt(obj2, i36);
                        }
                        i27 = i36;
                    }
                    switch (zzB) {
                        case 0:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i17 = i11;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 1) {
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzafs.zzo(obj2, j, Double.longBitsToDouble(zzabm.zzn(bArr2, i17)));
                                i25 = i17 + 8;
                                i29 |= i35;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 1:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i17 = i11;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 5) {
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzafs.zzp(obj2, j, Float.intBitsToFloat(zzabm.zzb(bArr2, i17)));
                                i25 = i17 + 4;
                                i29 |= i35;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i17 = i11;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 0) {
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzm = zzabm.zzm(bArr2, i17, zzablVar2);
                                unsafe2.putLong(obj, j, zzablVar2.zzb);
                                i29 |= i35;
                                i25 = zzm;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 4:
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i17 = i11;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 0) {
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                i25 = zzabm.zzj(bArr2, i17, zzablVar2);
                                unsafe2.putInt(obj2, j, zzablVar2.zza);
                                i29 |= i35;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 1) {
                                i17 = i11;
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                i17 = i11;
                                unsafe2.putLong(obj, j, zzabm.zzn(bArr2, i11));
                                i25 = i17 + 8;
                                i29 |= i35;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 5) {
                                i17 = i11;
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j, zzabm.zzb(bArr2, i11));
                                i25 = i11 + 4;
                                i29 |= i35;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 7:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 0) {
                                i17 = i11;
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                i25 = zzabm.zzm(bArr2, i11, zzablVar2);
                                zzafs.zzm(obj2, j, zzablVar2.zzb != 0);
                                i29 |= i35;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 2) {
                                i17 = i11;
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                i25 = (536870912 & i33) == 0 ? zzabm.zzg(bArr2, i11, zzablVar2) : zzabm.zzh(bArr2, i11, zzablVar2);
                                unsafe2.putObject(obj2, j, zzablVar2.zzc);
                                i29 |= i35;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 9:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 2) {
                                i17 = i11;
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzd = zzabm.zzd(zzaeiVar.zzF(i16), bArr2, i11, i22, zzablVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzablVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzadg.zzg(object, zzablVar2.zzc));
                                }
                                i29 |= i35;
                                i25 = zzd;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 10:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 2) {
                                i17 = i11;
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzd = zzabm.zza(bArr2, i11, zzablVar2);
                                unsafe2.putObject(obj2, j, zzablVar2.zzc);
                                i29 |= i35;
                                i25 = zzd;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 12:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 0) {
                                i17 = i11;
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzd = zzabm.zzj(bArr2, i11, zzablVar2);
                                unsafe2.putInt(obj2, j, zzablVar2.zza);
                                i29 |= i35;
                                i25 = zzd;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 15:
                            zzablVar2 = zzablVar;
                            i16 = zzy;
                            i18 = 1048575;
                            i13 = i31;
                            if (i32 != 0) {
                                i17 = i11;
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzd = zzabm.zzj(bArr2, i11, zzablVar2);
                                unsafe2.putInt(obj2, j, zzacc.zzs(zzablVar2.zza));
                                i29 |= i35;
                                i25 = zzd;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        case 16:
                            if (i32 != 0) {
                                i13 = i31;
                                i16 = zzy;
                                i17 = i11;
                                i12 = i17;
                                unsafe = unsafe2;
                                i15 = i16;
                                i14 = -1;
                                break;
                            } else {
                                zzablVar2 = zzablVar;
                                zzm = zzabm.zzm(bArr2, i11, zzablVar2);
                                i16 = zzy;
                                i13 = i31;
                                i18 = 1048575;
                                unsafe2.putLong(obj, j, zzacc.zzt(zzablVar2.zzb));
                                i29 |= i35;
                                i25 = zzm;
                                i28 = i16;
                                i26 = i13;
                                i23 = i18;
                                i24 = -1;
                                break;
                            }
                        default:
                            i13 = i31;
                            i16 = zzy;
                            i17 = i11;
                            i12 = i17;
                            unsafe = unsafe2;
                            i15 = i16;
                            i14 = -1;
                            break;
                    }
                } else {
                    zzablVar2 = zzablVar;
                    i16 = zzy;
                    int i37 = i11;
                    i18 = 1048575;
                    i13 = i31;
                    if (zzB == 27) {
                        if (i32 == 2) {
                            zzadf zzadfVar = (zzadf) unsafe2.getObject(obj2, j);
                            if (!zzadfVar.zzc()) {
                                int size = zzadfVar.size();
                                zzadfVar = zzadfVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzadfVar);
                            }
                            i25 = zzabm.zze(zzaeiVar.zzF(i16), b2, bArr, i37, i10, zzadfVar, zzablVar);
                            i29 = i29;
                            i28 = i16;
                            i26 = i13;
                            i23 = i18;
                            i24 = -1;
                        } else {
                            i19 = i37;
                            i20 = i29;
                            i21 = i27;
                            unsafe = unsafe2;
                            i15 = i16;
                            i14 = -1;
                        }
                    } else if (zzB <= 49) {
                        i20 = i29;
                        i21 = i27;
                        i14 = -1;
                        unsafe = unsafe2;
                        i15 = i16;
                        i25 = zzw(obj, bArr, i37, i10, b2, i13, i32, i16, i33, zzB, j, zzablVar);
                        if (i25 != i37) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i22 = i10;
                            zzablVar2 = zzablVar;
                            i27 = i21;
                            i24 = i14;
                            i26 = i13;
                            i29 = i20;
                            i28 = i15;
                            unsafe2 = unsafe;
                            i23 = 1048575;
                            zzaeiVar = this;
                        } else {
                            i12 = i25;
                            i27 = i21;
                            i29 = i20;
                        }
                    } else {
                        i19 = i37;
                        i20 = i29;
                        i21 = i27;
                        unsafe = unsafe2;
                        i15 = i16;
                        i14 = -1;
                        if (zzB != 50) {
                            i25 = zzu(obj, bArr, i19, i10, b2, i13, i32, i33, zzB, j, i15, zzablVar);
                            if (i25 != i19) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i22 = i10;
                                zzablVar2 = zzablVar;
                                i27 = i21;
                                i24 = i14;
                                i26 = i13;
                                i29 = i20;
                                i28 = i15;
                                unsafe2 = unsafe;
                                i23 = 1048575;
                                zzaeiVar = this;
                            } else {
                                i12 = i25;
                                i27 = i21;
                                i29 = i20;
                            }
                        } else if (i32 == 2) {
                            i25 = zzt(obj, bArr, i19, i10, i15, j, zzablVar);
                            if (i25 != i19) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i22 = i10;
                                zzablVar2 = zzablVar;
                                i27 = i21;
                                i24 = i14;
                                i26 = i13;
                                i29 = i20;
                                i28 = i15;
                                unsafe2 = unsafe;
                                i23 = 1048575;
                                zzaeiVar = this;
                            } else {
                                i12 = i25;
                                i27 = i21;
                                i29 = i20;
                            }
                        }
                    }
                    i12 = i19;
                    i27 = i21;
                    i29 = i20;
                }
            }
            i25 = zzabm.zzi(b2, bArr, i12, i10, zzd(obj), zzablVar);
            zzaeiVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i22 = i10;
            zzablVar2 = zzablVar;
            i24 = i14;
            i26 = i13;
            i28 = i15;
            unsafe2 = unsafe;
            i23 = 1048575;
        }
        int i38 = i29;
        int i39 = i27;
        Unsafe unsafe3 = unsafe2;
        if (i39 != i23) {
            unsafe3.putInt(obj, i39, i38);
        }
        if (i25 == i10) {
            return i25;
        }
        throw zzadi.zzg();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0037. Please report as an issue. */
    private final int zzw(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, long j, int i15, long j10, zzabl zzablVar) {
        int i16;
        int i17;
        int i18;
        int i19;
        int zzj;
        int i20 = i7;
        Unsafe unsafe = zzb;
        zzadf zzadfVar = (zzadf) unsafe.getObject(obj, j10);
        if (!zzadfVar.zzc()) {
            int size = zzadfVar.size();
            zzadfVar = zzadfVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j10, zzadfVar);
        }
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    zzacj zzacjVar = (zzacj) zzadfVar;
                    int zzj2 = zzabm.zzj(bArr, i20, zzablVar);
                    int i21 = zzablVar.zza + zzj2;
                    while (zzj2 < i21) {
                        zzacjVar.zze(Double.longBitsToDouble(zzabm.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i21) {
                        return zzj2;
                    }
                    throw zzadi.zzi();
                }
                if (i13 == 1) {
                    zzacj zzacjVar2 = (zzacj) zzadfVar;
                    zzacjVar2.zze(Double.longBitsToDouble(zzabm.zzn(bArr, i7)));
                    while (true) {
                        i16 = i20 + 8;
                        if (i16 < i10) {
                            i20 = zzabm.zzj(bArr, i16, zzablVar);
                            if (i11 == zzablVar.zza) {
                                zzacjVar2.zze(Double.longBitsToDouble(zzabm.zzn(bArr, i20)));
                            }
                        }
                    }
                    return i16;
                }
                return i20;
            case 19:
            case 36:
                if (i13 == 2) {
                    zzact zzactVar = (zzact) zzadfVar;
                    int zzj3 = zzabm.zzj(bArr, i20, zzablVar);
                    int i22 = zzablVar.zza + zzj3;
                    while (zzj3 < i22) {
                        zzactVar.zze(Float.intBitsToFloat(zzabm.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i22) {
                        return zzj3;
                    }
                    throw zzadi.zzi();
                }
                if (i13 == 5) {
                    zzact zzactVar2 = (zzact) zzadfVar;
                    zzactVar2.zze(Float.intBitsToFloat(zzabm.zzb(bArr, i7)));
                    while (true) {
                        i17 = i20 + 4;
                        if (i17 < i10) {
                            i20 = zzabm.zzj(bArr, i17, zzablVar);
                            if (i11 == zzablVar.zza) {
                                zzactVar2.zze(Float.intBitsToFloat(zzabm.zzb(bArr, i20)));
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
                    zzadu zzaduVar = (zzadu) zzadfVar;
                    int zzj4 = zzabm.zzj(bArr, i20, zzablVar);
                    int i23 = zzablVar.zza + zzj4;
                    while (zzj4 < i23) {
                        zzj4 = zzabm.zzm(bArr, zzj4, zzablVar);
                        zzaduVar.zzf(zzablVar.zzb);
                    }
                    if (zzj4 == i23) {
                        return zzj4;
                    }
                    throw zzadi.zzi();
                }
                if (i13 == 0) {
                    zzadu zzaduVar2 = (zzadu) zzadfVar;
                    int zzm = zzabm.zzm(bArr, i20, zzablVar);
                    zzaduVar2.zzf(zzablVar.zzb);
                    while (zzm < i10) {
                        int zzj5 = zzabm.zzj(bArr, zzm, zzablVar);
                        if (i11 != zzablVar.zza) {
                            return zzm;
                        }
                        zzm = zzabm.zzm(bArr, zzj5, zzablVar);
                        zzaduVar2.zzf(zzablVar.zzb);
                    }
                    return zzm;
                }
                return i20;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return zzabm.zzf(bArr, i20, zzadfVar, zzablVar);
                }
                if (i13 == 0) {
                    return zzabm.zzl(i11, bArr, i7, i10, zzadfVar, zzablVar);
                }
                return i20;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    zzadu zzaduVar3 = (zzadu) zzadfVar;
                    int zzj6 = zzabm.zzj(bArr, i20, zzablVar);
                    int i24 = zzablVar.zza + zzj6;
                    while (zzj6 < i24) {
                        zzaduVar3.zzf(zzabm.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i24) {
                        return zzj6;
                    }
                    throw zzadi.zzi();
                }
                if (i13 == 1) {
                    zzadu zzaduVar4 = (zzadu) zzadfVar;
                    zzaduVar4.zzf(zzabm.zzn(bArr, i7));
                    while (true) {
                        i18 = i20 + 8;
                        if (i18 < i10) {
                            i20 = zzabm.zzj(bArr, i18, zzablVar);
                            if (i11 == zzablVar.zza) {
                                zzaduVar4.zzf(zzabm.zzn(bArr, i20));
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
                    zzada zzadaVar = (zzada) zzadfVar;
                    int zzj7 = zzabm.zzj(bArr, i20, zzablVar);
                    int i25 = zzablVar.zza + zzj7;
                    while (zzj7 < i25) {
                        zzadaVar.zzg(zzabm.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i25) {
                        return zzj7;
                    }
                    throw zzadi.zzi();
                }
                if (i13 == 5) {
                    zzada zzadaVar2 = (zzada) zzadfVar;
                    zzadaVar2.zzg(zzabm.zzb(bArr, i7));
                    while (true) {
                        i19 = i20 + 4;
                        if (i19 < i10) {
                            i20 = zzabm.zzj(bArr, i19, zzablVar);
                            if (i11 == zzablVar.zza) {
                                zzadaVar2.zzg(zzabm.zzb(bArr, i20));
                            }
                        }
                    }
                    return i19;
                }
                return i20;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
            case 42:
                if (i13 == 2) {
                    zzabn zzabnVar = (zzabn) zzadfVar;
                    zzj = zzabm.zzj(bArr, i20, zzablVar);
                    int i26 = zzablVar.zza + zzj;
                    while (zzj < i26) {
                        zzj = zzabm.zzm(bArr, zzj, zzablVar);
                        zzabnVar.zze(zzablVar.zzb != 0);
                    }
                    if (zzj != i26) {
                        throw zzadi.zzi();
                    }
                    return zzj;
                }
                if (i13 == 0) {
                    zzabn zzabnVar2 = (zzabn) zzadfVar;
                    int zzm2 = zzabm.zzm(bArr, i20, zzablVar);
                    zzabnVar2.zze(zzablVar.zzb != 0);
                    while (zzm2 < i10) {
                        int zzj8 = zzabm.zzj(bArr, zzm2, zzablVar);
                        if (i11 != zzablVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzabm.zzm(bArr, zzj8, zzablVar);
                        zzabnVar2.zze(zzablVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i20;
            case 26:
                if (i13 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj9 = zzabm.zzj(bArr, i20, zzablVar);
                        int i27 = zzablVar.zza;
                        if (i27 < 0) {
                            throw zzadi.zzf();
                        }
                        if (i27 == 0) {
                            zzadfVar.add("");
                        } else {
                            zzadfVar.add(new String(bArr, zzj9, i27, zzadg.zzb));
                            zzj9 += i27;
                        }
                        while (zzj9 < i10) {
                            int zzj10 = zzabm.zzj(bArr, zzj9, zzablVar);
                            if (i11 != zzablVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzabm.zzj(bArr, zzj10, zzablVar);
                            int i28 = zzablVar.zza;
                            if (i28 < 0) {
                                throw zzadi.zzf();
                            }
                            if (i28 == 0) {
                                zzadfVar.add("");
                            } else {
                                zzadfVar.add(new String(bArr, zzj9, i28, zzadg.zzb));
                                zzj9 += i28;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzabm.zzj(bArr, i20, zzablVar);
                    int i29 = zzablVar.zza;
                    if (i29 < 0) {
                        throw zzadi.zzf();
                    }
                    if (i29 == 0) {
                        zzadfVar.add("");
                    } else {
                        int i30 = zzj11 + i29;
                        if (!zzafx.zzf(bArr, zzj11, i30)) {
                            throw zzadi.zzd();
                        }
                        zzadfVar.add(new String(bArr, zzj11, i29, zzadg.zzb));
                        zzj11 = i30;
                    }
                    while (zzj11 < i10) {
                        int zzj12 = zzabm.zzj(bArr, zzj11, zzablVar);
                        if (i11 != zzablVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzabm.zzj(bArr, zzj12, zzablVar);
                        int i31 = zzablVar.zza;
                        if (i31 < 0) {
                            throw zzadi.zzf();
                        }
                        if (i31 == 0) {
                            zzadfVar.add("");
                        } else {
                            int i32 = zzj11 + i31;
                            if (!zzafx.zzf(bArr, zzj11, i32)) {
                                throw zzadi.zzd();
                            }
                            zzadfVar.add(new String(bArr, zzj11, i31, zzadg.zzb));
                            zzj11 = i32;
                        }
                    }
                    return zzj11;
                }
                return i20;
            case 27:
                if (i13 == 2) {
                    return zzabm.zze(zzF(i14), i11, bArr, i7, i10, zzadfVar, zzablVar);
                }
                return i20;
            case 28:
                if (i13 == 2) {
                    int zzj13 = zzabm.zzj(bArr, i20, zzablVar);
                    int i33 = zzablVar.zza;
                    if (i33 < 0) {
                        throw zzadi.zzf();
                    }
                    if (i33 > bArr.length - zzj13) {
                        throw zzadi.zzi();
                    }
                    if (i33 == 0) {
                        zzadfVar.add(zzaby.zzb);
                    } else {
                        zzadfVar.add(zzaby.zzo(bArr, zzj13, i33));
                        zzj13 += i33;
                    }
                    while (zzj13 < i10) {
                        int zzj14 = zzabm.zzj(bArr, zzj13, zzablVar);
                        if (i11 != zzablVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzabm.zzj(bArr, zzj14, zzablVar);
                        int i34 = zzablVar.zza;
                        if (i34 < 0) {
                            throw zzadi.zzf();
                        }
                        if (i34 > bArr.length - zzj13) {
                            throw zzadi.zzi();
                        }
                        if (i34 == 0) {
                            zzadfVar.add(zzaby.zzb);
                        } else {
                            zzadfVar.add(zzaby.zzo(bArr, zzj13, i34));
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
                        zzj = zzabm.zzl(i11, bArr, i7, i10, zzadfVar, zzablVar);
                    }
                    return i20;
                }
                zzj = zzabm.zzf(bArr, i20, zzadfVar, zzablVar);
                zzacz zzaczVar = (zzacz) obj;
                zzafj zzafjVar = zzaczVar.zzc;
                if (zzafjVar == zzafj.zzc()) {
                    zzafjVar = null;
                }
                Object zzC = zzaet.zzC(i12, zzadfVar, zzE(i14), zzafjVar, this.zzo);
                if (zzC != null) {
                    zzaczVar.zzc = (zzafj) zzC;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i13 == 2) {
                    zzada zzadaVar3 = (zzada) zzadfVar;
                    int zzj15 = zzabm.zzj(bArr, i20, zzablVar);
                    int i35 = zzablVar.zza + zzj15;
                    while (zzj15 < i35) {
                        zzj15 = zzabm.zzj(bArr, zzj15, zzablVar);
                        zzadaVar3.zzg(zzacc.zzs(zzablVar.zza));
                    }
                    if (zzj15 == i35) {
                        return zzj15;
                    }
                    throw zzadi.zzi();
                }
                if (i13 == 0) {
                    zzada zzadaVar4 = (zzada) zzadfVar;
                    int zzj16 = zzabm.zzj(bArr, i20, zzablVar);
                    zzadaVar4.zzg(zzacc.zzs(zzablVar.zza));
                    while (zzj16 < i10) {
                        int zzj17 = zzabm.zzj(bArr, zzj16, zzablVar);
                        if (i11 != zzablVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzabm.zzj(bArr, zzj17, zzablVar);
                        zzadaVar4.zzg(zzacc.zzs(zzablVar.zza));
                    }
                    return zzj16;
                }
                return i20;
            case 34:
            case 48:
                if (i13 == 2) {
                    zzadu zzaduVar5 = (zzadu) zzadfVar;
                    int zzj18 = zzabm.zzj(bArr, i20, zzablVar);
                    int i36 = zzablVar.zza + zzj18;
                    while (zzj18 < i36) {
                        zzj18 = zzabm.zzm(bArr, zzj18, zzablVar);
                        zzaduVar5.zzf(zzacc.zzt(zzablVar.zzb));
                    }
                    if (zzj18 == i36) {
                        return zzj18;
                    }
                    throw zzadi.zzi();
                }
                if (i13 == 0) {
                    zzadu zzaduVar6 = (zzadu) zzadfVar;
                    int zzm3 = zzabm.zzm(bArr, i20, zzablVar);
                    zzaduVar6.zzf(zzacc.zzt(zzablVar.zzb));
                    while (zzm3 < i10) {
                        int zzj19 = zzabm.zzj(bArr, zzm3, zzablVar);
                        if (i11 != zzablVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzabm.zzm(bArr, zzj19, zzablVar);
                        zzaduVar6.zzf(zzacc.zzt(zzablVar.zzb));
                    }
                    return zzm3;
                }
                return i20;
            default:
                if (i13 == 3) {
                    zzaer zzF = zzF(i14);
                    int i37 = (i11 & (-8)) | 4;
                    int zzc = zzabm.zzc(zzF, bArr, i7, i10, i37, zzablVar);
                    zzadfVar.add(zzablVar.zzc);
                    while (zzc < i10) {
                        int zzj20 = zzabm.zzj(bArr, zzc, zzablVar);
                        if (i11 != zzablVar.zza) {
                            return zzc;
                        }
                        zzc = zzabm.zzc(zzF, bArr, zzj20, i10, i37, zzablVar);
                        zzadfVar.add(zzablVar.zzc);
                    }
                    return zzc;
                }
                return i20;
        }
    }

    private final int zzx(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzA(i7, 0);
    }

    private final int zzy(int i7, int i10) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzA(i7, i10);
    }

    private final int zzz(int i7) {
        return this.zzc[i7 + 2];
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final int zza(Object obj) {
        return this.zzj ? zzr(obj) : zzq(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.pal.zzaer
    public final int zzb(Object obj) {
        int i7;
        int zzc;
        int i10;
        int zzc2;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzC = zzC(i12);
            int i13 = this.zzc[i12];
            long j = 1048575 & zzC;
            int i14 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i7 = i11 * 53;
                    zzc = zzadg.zzc(Double.doubleToLongBits(zzafs.zza(obj, j)));
                    i11 = zzc + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    zzc = Float.floatToIntBits(zzafs.zzb(obj, j));
                    i11 = zzc + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    zzc = zzadg.zzc(zzafs.zzd(obj, j));
                    i11 = zzc + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    zzc = zzadg.zzc(zzafs.zzd(obj, j));
                    i11 = zzc + i7;
                    break;
                case 4:
                    i10 = i11 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i11 = i10 + zzc2;
                    break;
                case 5:
                    i7 = i11 * 53;
                    zzc = zzadg.zzc(zzafs.zzd(obj, j));
                    i11 = zzc + i7;
                    break;
                case 6:
                    i10 = i11 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i11 = i10 + zzc2;
                    break;
                case 7:
                    i7 = i11 * 53;
                    zzc = zzadg.zza(zzafs.zzw(obj, j));
                    i11 = zzc + i7;
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    i7 = i11 * 53;
                    zzc = ((String) zzafs.zzf(obj, j)).hashCode();
                    i11 = zzc + i7;
                    break;
                case 9:
                    Object zzf = zzafs.zzf(obj, j);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i7 = i11 * 53;
                    zzc = zzafs.zzf(obj, j).hashCode();
                    i11 = zzc + i7;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i10 = i11 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i11 = i10 + zzc2;
                    break;
                case 12:
                    i10 = i11 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i11 = i10 + zzc2;
                    break;
                case 13:
                    i10 = i11 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i11 = i10 + zzc2;
                    break;
                case 14:
                    i7 = i11 * 53;
                    zzc = zzadg.zzc(zzafs.zzd(obj, j));
                    i11 = zzc + i7;
                    break;
                case 15:
                    i10 = i11 * 53;
                    zzc2 = zzafs.zzc(obj, j);
                    i11 = i10 + zzc2;
                    break;
                case 16:
                    i7 = i11 * 53;
                    zzc = zzadg.zzc(zzafs.zzd(obj, j));
                    i11 = zzc + i7;
                    break;
                case 17:
                    Object zzf2 = zzafs.zzf(obj, j);
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
                    i7 = i11 * 53;
                    zzc = zzafs.zzf(obj, j).hashCode();
                    i11 = zzc + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    zzc = zzafs.zzf(obj, j).hashCode();
                    i11 = zzc + i7;
                    break;
                case 51:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzadg.zzc(Double.doubleToLongBits(zzo(obj, j)));
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = Float.floatToIntBits(zzp(obj, j));
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzadg.zzc(zzD(obj, j));
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzadg.zzc(zzD(obj, j));
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzV(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc2 = zzs(obj, j);
                        i11 = i10 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzadg.zzc(zzD(obj, j));
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzV(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc2 = zzs(obj, j);
                        i11 = i10 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzadg.zza(zzW(obj, j));
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = ((String) zzafs.zzf(obj, j)).hashCode();
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzafs.zzf(obj, j).hashCode();
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzafs.zzf(obj, j).hashCode();
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzV(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc2 = zzs(obj, j);
                        i11 = i10 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzV(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc2 = zzs(obj, j);
                        i11 = i10 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzV(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc2 = zzs(obj, j);
                        i11 = i10 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzadg.zzc(zzD(obj, j));
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzV(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc2 = zzs(obj, j);
                        i11 = i10 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzadg.zzc(zzD(obj, j));
                        i11 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzV(obj, i13, i12)) {
                        i7 = i11 * 53;
                        zzc = zzafs.zzf(obj, j).hashCode();
                        i11 = zzc + i7;
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

    /* JADX WARN: Code restructure failed: missing block: B:31:0x047d, code lost:
    
        if (r7 == r3) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x047f, code lost:
    
        r25.putInt(r13, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0485, code lost:
    
        r3 = r10.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0489, code lost:
    
        if (r3 >= r10.zzm) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x048b, code lost:
    
        r10.zzG(r13, r10.zzk[r3], r2, r10.zzo);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0497, code lost:
    
        if (r8 != 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x049b, code lost:
    
        if (r0 != r33) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x04a2, code lost:
    
        throw com.google.android.gms.internal.pal.zzadi.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04a9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x04a5, code lost:
    
        if (r0 > r33) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04a7, code lost:
    
        if (r1 != r8) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04ae, code lost:
    
        throw com.google.android.gms.internal.pal.zzadi.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x0088. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i7, int i10, int i11, zzabl zzablVar) {
        int i12;
        Unsafe unsafe;
        Object obj2;
        zzaei<T> zzaeiVar;
        Object obj3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Object obj4;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int zzm;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        zzaei<T> zzaeiVar2 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i32 = i10;
        zzabl zzablVar2 = zzablVar;
        Unsafe unsafe2 = zzb;
        int i33 = -1;
        int i34 = i7;
        int i35 = -1;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 1048575;
        while (true) {
            if (i34 < i32) {
                int i40 = i34 + 1;
                byte b2 = bArr2[i34];
                if (b2 < 0) {
                    int zzk = zzabm.zzk(b2, bArr2, i40, zzablVar2);
                    i14 = zzablVar2.zza;
                    i40 = zzk;
                } else {
                    i14 = b2;
                }
                int i41 = i14 >>> 3;
                int i42 = i14 & 7;
                int zzy = i41 > i35 ? zzaeiVar2.zzy(i41, i37 / 3) : zzaeiVar2.zzx(i41);
                if (zzy == i33) {
                    i15 = i41;
                    i16 = i40;
                    i17 = i33;
                    unsafe = unsafe2;
                    i18 = 0;
                    i12 = i11;
                    i19 = i14;
                } else {
                    int[] iArr = zzaeiVar2.zzc;
                    int i43 = iArr[zzy + 1];
                    int zzB = zzB(i43);
                    int i44 = i40;
                    long j = i43 & 1048575;
                    int i45 = i14;
                    if (zzB <= 17) {
                        int i46 = iArr[zzy + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        if (i48 != i39) {
                            i21 = zzy;
                            if (i39 != 1048575) {
                                unsafe2.putInt(obj5, i39, i38);
                            }
                            i39 = i48;
                            i38 = unsafe2.getInt(obj5, i48);
                        } else {
                            i21 = zzy;
                        }
                        switch (zzB) {
                            case 0:
                                i24 = i41;
                                i22 = i39;
                                i25 = i21;
                                i26 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 == 1) {
                                    zzafs.zzo(obj5, j, Double.longBitsToDouble(zzabm.zzn(bArr2, i26)));
                                    i34 = i26 + 8;
                                    i38 |= i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i25;
                                    i39 = i22;
                                    i33 = -1;
                                    i32 = i10;
                                    break;
                                }
                                i16 = i26;
                                i15 = i24;
                                unsafe = unsafe2;
                                i18 = i25;
                                i17 = -1;
                                i12 = i11;
                                i19 = i23;
                                i39 = i22;
                                break;
                            case 1:
                                i24 = i41;
                                i22 = i39;
                                i25 = i21;
                                i26 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 == 5) {
                                    zzafs.zzp(obj5, j, Float.intBitsToFloat(zzabm.zzb(bArr2, i26)));
                                    i34 = i26 + 4;
                                    i38 |= i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i25;
                                    i39 = i22;
                                    i33 = -1;
                                    i32 = i10;
                                    break;
                                }
                                i16 = i26;
                                i15 = i24;
                                unsafe = unsafe2;
                                i18 = i25;
                                i17 = -1;
                                i12 = i11;
                                i19 = i23;
                                i39 = i22;
                                break;
                            case 2:
                            case 3:
                                i24 = i41;
                                i22 = i39;
                                i25 = i21;
                                i26 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 == 0) {
                                    zzm = zzabm.zzm(bArr2, i26, zzablVar2);
                                    unsafe2.putLong(obj, j, zzablVar2.zzb);
                                    i38 |= i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i34 = zzm;
                                    i37 = i25;
                                    i39 = i22;
                                    i33 = -1;
                                    i32 = i10;
                                    break;
                                }
                                i16 = i26;
                                i15 = i24;
                                unsafe = unsafe2;
                                i18 = i25;
                                i17 = -1;
                                i12 = i11;
                                i19 = i23;
                                i39 = i22;
                                break;
                            case 4:
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                i24 = i41;
                                i22 = i39;
                                i25 = i21;
                                i26 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 == 0) {
                                    i34 = zzabm.zzj(bArr2, i26, zzablVar2);
                                    unsafe2.putInt(obj5, j, zzablVar2.zza);
                                    i38 |= i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i25;
                                    i39 = i22;
                                    i33 = -1;
                                    i32 = i10;
                                    break;
                                }
                                i16 = i26;
                                i15 = i24;
                                unsafe = unsafe2;
                                i18 = i25;
                                i17 = -1;
                                i12 = i11;
                                i19 = i23;
                                i39 = i22;
                                break;
                            case 5:
                            case 14:
                                i22 = i39;
                                i25 = i21;
                                i27 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 == 1) {
                                    i24 = i41;
                                    unsafe2.putLong(obj, j, zzabm.zzn(bArr2, i27));
                                    i34 = i27 + 8;
                                    i38 |= i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i25;
                                    i39 = i22;
                                    i33 = -1;
                                    i32 = i10;
                                    break;
                                }
                                i24 = i41;
                                i26 = i27;
                                i16 = i26;
                                i15 = i24;
                                unsafe = unsafe2;
                                i18 = i25;
                                i17 = -1;
                                i12 = i11;
                                i19 = i23;
                                i39 = i22;
                                break;
                            case 6:
                            case 13:
                                i22 = i39;
                                i25 = i21;
                                i27 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 == 5) {
                                    unsafe2.putInt(obj5, j, zzabm.zzb(bArr2, i27));
                                    i38 |= i47;
                                    i35 = i41;
                                    i34 = i27 + 4;
                                    i36 = i23;
                                    i37 = i25;
                                    i39 = i22;
                                    i33 = -1;
                                    i32 = i10;
                                    break;
                                }
                                i24 = i41;
                                i26 = i27;
                                i16 = i26;
                                i15 = i24;
                                unsafe = unsafe2;
                                i18 = i25;
                                i17 = -1;
                                i12 = i11;
                                i19 = i23;
                                i39 = i22;
                                break;
                            case 7:
                                i28 = i10;
                                i22 = i39;
                                i25 = i21;
                                i27 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 != 0) {
                                    i24 = i41;
                                    i26 = i27;
                                    i16 = i26;
                                    i15 = i24;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i17 = -1;
                                    i12 = i11;
                                    i19 = i23;
                                    i39 = i22;
                                    break;
                                } else {
                                    int zzm2 = zzabm.zzm(bArr2, i27, zzablVar2);
                                    zzafs.zzm(obj5, j, zzablVar2.zzb != 0);
                                    i38 |= i47;
                                    i35 = i41;
                                    i37 = i25;
                                    i33 = -1;
                                    i34 = zzm2;
                                    i32 = i28;
                                    i36 = i23;
                                    i39 = i22;
                                    break;
                                }
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                i28 = i10;
                                i22 = i39;
                                i25 = i21;
                                i27 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 != 2) {
                                    i24 = i41;
                                    i26 = i27;
                                    i16 = i26;
                                    i15 = i24;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i17 = -1;
                                    i12 = i11;
                                    i19 = i23;
                                    i39 = i22;
                                    break;
                                } else {
                                    int zzg = (536870912 & i43) == 0 ? zzabm.zzg(bArr2, i27, zzablVar2) : zzabm.zzh(bArr2, i27, zzablVar2);
                                    unsafe2.putObject(obj5, j, zzablVar2.zzc);
                                    i38 |= i47;
                                    i35 = i41;
                                    i34 = zzg;
                                    i37 = i25;
                                    i33 = -1;
                                    i32 = i28;
                                    i36 = i23;
                                    i39 = i22;
                                    break;
                                }
                            case 9:
                                i24 = i41;
                                i22 = i39;
                                i25 = i21;
                                i27 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 != 2) {
                                    i26 = i27;
                                    i16 = i26;
                                    i15 = i24;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i17 = -1;
                                    i12 = i11;
                                    i19 = i23;
                                    i39 = i22;
                                    break;
                                } else {
                                    i28 = i10;
                                    i34 = zzabm.zzd(zzaeiVar2.zzF(i25), bArr2, i27, i28, zzablVar2);
                                    if ((i38 & i47) == 0) {
                                        unsafe2.putObject(obj5, j, zzablVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j, zzadg.zzg(unsafe2.getObject(obj5, j), zzablVar2.zzc));
                                    }
                                    i38 |= i47;
                                    i35 = i24;
                                    i37 = i25;
                                    i33 = -1;
                                    i32 = i28;
                                    i36 = i23;
                                    i39 = i22;
                                    break;
                                }
                            case 10:
                                i24 = i41;
                                i22 = i39;
                                i25 = i21;
                                i27 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 == 2) {
                                    i34 = zzabm.zza(bArr2, i27, zzablVar2);
                                    unsafe2.putObject(obj5, j, zzablVar2.zzc);
                                    i38 |= i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i25;
                                    i39 = i22;
                                    i33 = -1;
                                    i32 = i10;
                                    break;
                                }
                                i26 = i27;
                                i16 = i26;
                                i15 = i24;
                                unsafe = unsafe2;
                                i18 = i25;
                                i17 = -1;
                                i12 = i11;
                                i19 = i23;
                                i39 = i22;
                                break;
                            case 12:
                                i24 = i41;
                                i22 = i39;
                                i25 = i21;
                                i27 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 == 0) {
                                    i34 = zzabm.zzj(bArr2, i27, zzablVar2);
                                    int i49 = zzablVar2.zza;
                                    zzadd zzE = zzaeiVar2.zzE(i25);
                                    if (zzE == null || zzE.zza(i49)) {
                                        unsafe2.putInt(obj5, j, i49);
                                        i38 |= i47;
                                        i36 = i23;
                                        i35 = i24;
                                        i37 = i25;
                                        i39 = i22;
                                        i33 = -1;
                                        i32 = i10;
                                        break;
                                    } else {
                                        zzd(obj).zzh(i23, Long.valueOf(i49));
                                        i36 = i23;
                                        i35 = i24;
                                        i37 = i25;
                                        i39 = i22;
                                        i33 = -1;
                                        i32 = i10;
                                    }
                                }
                                i26 = i27;
                                i16 = i26;
                                i15 = i24;
                                unsafe = unsafe2;
                                i18 = i25;
                                i17 = -1;
                                i12 = i11;
                                i19 = i23;
                                i39 = i22;
                                break;
                            case 15:
                                i24 = i41;
                                i22 = i39;
                                i25 = i21;
                                i27 = i44;
                                i23 = i45;
                                bArr2 = bArr;
                                if (i42 == 0) {
                                    i34 = zzabm.zzj(bArr2, i27, zzablVar2);
                                    unsafe2.putInt(obj5, j, zzacc.zzs(zzablVar2.zza));
                                    i38 |= i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i25;
                                    i39 = i22;
                                    i33 = -1;
                                    i32 = i10;
                                    break;
                                }
                                i26 = i27;
                                i16 = i26;
                                i15 = i24;
                                unsafe = unsafe2;
                                i18 = i25;
                                i17 = -1;
                                i12 = i11;
                                i19 = i23;
                                i39 = i22;
                                break;
                            case 16:
                                i24 = i41;
                                i22 = i39;
                                int i50 = i21;
                                i27 = i44;
                                i23 = i45;
                                if (i42 != 0) {
                                    i25 = i50;
                                    i26 = i27;
                                    i16 = i26;
                                    i15 = i24;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i17 = -1;
                                    i12 = i11;
                                    i19 = i23;
                                    i39 = i22;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    zzm = zzabm.zzm(bArr2, i27, zzablVar2);
                                    i25 = i50;
                                    unsafe2.putLong(obj, j, zzacc.zzt(zzablVar2.zzb));
                                    i38 |= i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i34 = zzm;
                                    i37 = i25;
                                    i39 = i22;
                                    i33 = -1;
                                    i32 = i10;
                                    break;
                                }
                            default:
                                if (i42 != 3) {
                                    i22 = i39;
                                    i23 = i45;
                                    i24 = i41;
                                    i25 = i21;
                                    i26 = i44;
                                    i16 = i26;
                                    i15 = i24;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i17 = -1;
                                    i12 = i11;
                                    i19 = i23;
                                    i39 = i22;
                                    break;
                                } else {
                                    int i51 = i21;
                                    int i52 = i39;
                                    i34 = zzabm.zzc(zzaeiVar2.zzF(i51), bArr, i44, i10, (i41 << 3) | 4, zzablVar);
                                    if ((i38 & i47) == 0) {
                                        unsafe2.putObject(obj5, j, zzablVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j, zzadg.zzg(unsafe2.getObject(obj5, j), zzablVar2.zzc));
                                    }
                                    i38 |= i47;
                                    bArr2 = bArr;
                                    i32 = i10;
                                    i36 = i45;
                                    i35 = i41;
                                    i37 = i51;
                                    i39 = i52;
                                    i33 = -1;
                                    break;
                                }
                        }
                    } else {
                        int i53 = i39;
                        bArr2 = bArr;
                        if (zzB != 27) {
                            i29 = i38;
                            if (zzB <= 49) {
                                i31 = i45;
                                i17 = -1;
                                unsafe = unsafe2;
                                i15 = i41;
                                i18 = zzy;
                                i34 = zzw(obj, bArr, i44, i10, i45, i41, i42, zzy, i43, zzB, j, zzablVar);
                                if (i34 != i44) {
                                    zzaeiVar2 = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i32 = i10;
                                    zzablVar2 = zzablVar;
                                    i35 = i15;
                                    i39 = i53;
                                    i33 = i17;
                                    i38 = i29;
                                    i36 = i31;
                                    unsafe2 = unsafe;
                                    i37 = i18;
                                } else {
                                    i12 = i11;
                                    i16 = i34;
                                    i39 = i53;
                                    i38 = i29;
                                    i19 = i31;
                                }
                            } else {
                                i15 = i41;
                                i30 = i44;
                                i31 = i45;
                                unsafe = unsafe2;
                                i18 = zzy;
                                i17 = -1;
                                if (zzB != 50) {
                                    i34 = zzu(obj, bArr, i30, i10, i31, i15, i42, i43, zzB, j, i18, zzablVar);
                                    if (i34 != i30) {
                                        zzaeiVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i32 = i10;
                                        zzablVar2 = zzablVar;
                                        i35 = i15;
                                        i39 = i53;
                                        i33 = i17;
                                        i38 = i29;
                                        i36 = i31;
                                        unsafe2 = unsafe;
                                        i37 = i18;
                                    } else {
                                        i12 = i11;
                                        i16 = i34;
                                        i39 = i53;
                                        i38 = i29;
                                        i19 = i31;
                                    }
                                } else if (i42 == 2) {
                                    i34 = zzt(obj, bArr, i30, i10, i18, j, zzablVar);
                                    if (i34 != i30) {
                                        zzaeiVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i32 = i10;
                                        zzablVar2 = zzablVar;
                                        i35 = i15;
                                        i39 = i53;
                                        i33 = i17;
                                        i38 = i29;
                                        i36 = i31;
                                        unsafe2 = unsafe;
                                        i37 = i18;
                                    } else {
                                        i12 = i11;
                                        i16 = i34;
                                        i39 = i53;
                                        i38 = i29;
                                        i19 = i31;
                                    }
                                }
                            }
                        } else if (i42 == 2) {
                            zzadf zzadfVar = (zzadf) unsafe2.getObject(obj5, j);
                            if (!zzadfVar.zzc()) {
                                int size = zzadfVar.size();
                                zzadfVar = zzadfVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj5, j, zzadfVar);
                            }
                            i36 = i45;
                            i34 = zzabm.zze(zzaeiVar2.zzF(zzy), i36, bArr, i44, i10, zzadfVar, zzablVar);
                            i35 = i41;
                            i37 = zzy;
                            i39 = i53;
                            i38 = i38;
                            i33 = -1;
                            i32 = i10;
                        } else {
                            i29 = i38;
                            i15 = i41;
                            i30 = i44;
                            i31 = i45;
                            unsafe = unsafe2;
                            i18 = zzy;
                            i17 = -1;
                        }
                        i12 = i11;
                        i16 = i30;
                        i39 = i53;
                        i38 = i29;
                        i19 = i31;
                    }
                }
                if (i19 != i12 || i12 == 0) {
                    if (this.zzh) {
                        zzablVar2 = zzablVar;
                        if (zzablVar2.zzd != zzacm.zza()) {
                            i20 = i15;
                            if (zzablVar2.zzd.zzb(this.zzg, i20) != null) {
                                throw null;
                            }
                            i34 = zzabm.zzi(i19, bArr, i16, i10, zzd(obj), zzablVar);
                            obj4 = obj;
                            i36 = i19;
                            zzaeiVar2 = this;
                            i35 = i20;
                            obj5 = obj4;
                            i33 = i17;
                            unsafe2 = unsafe;
                            i37 = i18;
                            bArr2 = bArr;
                            i32 = i10;
                        } else {
                            obj4 = obj;
                        }
                    } else {
                        obj4 = obj;
                        zzablVar2 = zzablVar;
                    }
                    i20 = i15;
                    i34 = zzabm.zzi(i19, bArr, i16, i10, zzd(obj), zzablVar);
                    i36 = i19;
                    zzaeiVar2 = this;
                    i35 = i20;
                    obj5 = obj4;
                    i33 = i17;
                    unsafe2 = unsafe;
                    i37 = i18;
                    bArr2 = bArr;
                    i32 = i10;
                } else {
                    i13 = 1048575;
                    zzaeiVar = this;
                    obj2 = obj;
                    i34 = i16;
                    i36 = i19;
                    obj3 = null;
                }
            } else {
                i12 = i11;
                unsafe = unsafe2;
                obj2 = obj5;
                zzaeiVar = zzaeiVar2;
                obj3 = null;
                i13 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final Object zze() {
        return ((zzacz) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzf(Object obj) {
        int i7;
        int i10 = this.zzl;
        while (true) {
            i7 = this.zzm;
            if (i10 >= i7) {
                break;
            }
            long zzC = zzC(this.zzk[i10]) & 1048575;
            Object zzf = zzafs.zzf(obj, zzC);
            if (zzf != null) {
                ((zzadz) zzf).zzc();
                zzafs.zzs(obj, zzC, zzf);
            }
            i10++;
        }
        int length = this.zzk.length;
        while (i7 < length) {
            this.zzn.zzb(obj, this.zzk[i7]);
            i7++;
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzC = zzC(i7);
            long j = 1048575 & zzC;
            int i10 = this.zzc[i7];
            switch (zzB(zzC)) {
                case 0:
                    if (zzS(obj2, i7)) {
                        zzafs.zzo(obj, j, zzafs.zza(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzS(obj2, i7)) {
                        zzafs.zzp(obj, j, zzafs.zzb(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzS(obj2, i7)) {
                        zzafs.zzr(obj, j, zzafs.zzd(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzS(obj2, i7)) {
                        zzafs.zzr(obj, j, zzafs.zzd(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzS(obj2, i7)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzS(obj2, i7)) {
                        zzafs.zzr(obj, j, zzafs.zzd(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzS(obj2, i7)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzS(obj2, i7)) {
                        zzafs.zzm(obj, j, zzafs.zzw(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzS(obj2, i7)) {
                        zzafs.zzs(obj, j, zzafs.zzf(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i7);
                    break;
                case 10:
                    if (zzS(obj2, i7)) {
                        zzafs.zzs(obj, j, zzafs.zzf(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzS(obj2, i7)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzS(obj2, i7)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzS(obj2, i7)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzS(obj2, i7)) {
                        zzafs.zzr(obj, j, zzafs.zzd(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzS(obj2, i7)) {
                        zzafs.zzq(obj, j, zzafs.zzc(obj2, j));
                        zzM(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzS(obj2, i7)) {
                        zzafs.zzr(obj, j, zzafs.zzd(obj2, j));
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
                    zzaet.zzaa(this.zzr, obj, obj2, j);
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
                    if (zzV(obj2, i10, i7)) {
                        zzafs.zzs(obj, j, zzafs.zzf(obj2, j));
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
                    if (zzV(obj2, i10, i7)) {
                        zzafs.zzs(obj, j, zzafs.zzf(obj2, j));
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
        zzaet.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzaet.zzE(this.zzp, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0086. Please report as an issue. */
    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzh(Object obj, zzaeq zzaeqVar, zzacm zzacmVar) {
        zzacmVar.getClass();
        zzafi zzafiVar = this.zzo;
        zzacn zzacnVar = this.zzp;
        zzacr zzacrVar = null;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = zzaeqVar.zzc();
                int zzx = zzx(zzc);
                if (zzx >= 0) {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzafs.zzo(obj, zzC & 1048575, zzaeqVar.zza());
                                zzM(obj, zzx);
                                break;
                            case 1:
                                zzafs.zzp(obj, zzC & 1048575, zzaeqVar.zzb());
                                zzM(obj, zzx);
                                break;
                            case 2:
                                zzafs.zzr(obj, zzC & 1048575, zzaeqVar.zzl());
                                zzM(obj, zzx);
                                break;
                            case 3:
                                zzafs.zzr(obj, zzC & 1048575, zzaeqVar.zzo());
                                zzM(obj, zzx);
                                break;
                            case 4:
                                zzafs.zzq(obj, zzC & 1048575, zzaeqVar.zzg());
                                zzM(obj, zzx);
                                break;
                            case 5:
                                zzafs.zzr(obj, zzC & 1048575, zzaeqVar.zzk());
                                zzM(obj, zzx);
                                break;
                            case 6:
                                zzafs.zzq(obj, zzC & 1048575, zzaeqVar.zzf());
                                zzM(obj, zzx);
                                break;
                            case 7:
                                zzafs.zzm(obj, zzC & 1048575, zzaeqVar.zzN());
                                zzM(obj, zzx);
                                break;
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                zzL(obj, zzC, zzaeqVar);
                                zzM(obj, zzx);
                                break;
                            case 9:
                                if (zzS(obj, zzx)) {
                                    long j = zzC & 1048575;
                                    zzafs.zzs(obj, j, zzadg.zzg(zzafs.zzf(obj, j), zzaeqVar.zzs(zzF(zzx), zzacmVar)));
                                    break;
                                } else {
                                    zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzs(zzF(zzx), zzacmVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 10:
                                zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzp());
                                zzM(obj, zzx);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                zzafs.zzq(obj, zzC & 1048575, zzaeqVar.zzj());
                                zzM(obj, zzx);
                                break;
                            case 12:
                                int zze = zzaeqVar.zze();
                                zzadd zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj2 = zzaet.zzD(zzc, zze, obj2, zzafiVar);
                                    break;
                                }
                                zzafs.zzq(obj, zzC & 1048575, zze);
                                zzM(obj, zzx);
                                break;
                            case 13:
                                zzafs.zzq(obj, zzC & 1048575, zzaeqVar.zzh());
                                zzM(obj, zzx);
                                break;
                            case 14:
                                zzafs.zzr(obj, zzC & 1048575, zzaeqVar.zzm());
                                zzM(obj, zzx);
                                break;
                            case 15:
                                zzafs.zzq(obj, zzC & 1048575, zzaeqVar.zzi());
                                zzM(obj, zzx);
                                break;
                            case 16:
                                zzafs.zzr(obj, zzC & 1048575, zzaeqVar.zzn());
                                zzM(obj, zzx);
                                break;
                            case 17:
                                if (zzS(obj, zzx)) {
                                    long j10 = zzC & 1048575;
                                    zzafs.zzs(obj, j10, zzadg.zzg(zzafs.zzf(obj, j10), zzaeqVar.zzr(zzF(zzx), zzacmVar)));
                                    break;
                                } else {
                                    zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzr(zzF(zzx), zzacmVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 18:
                                zzaeqVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 19:
                                zzaeqVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 20:
                                zzaeqVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 21:
                                zzaeqVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 22:
                                zzaeqVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 23:
                                zzaeqVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 24:
                                zzaeqVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                zzaeqVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 26:
                                if (zzR(zzC)) {
                                    ((zzacd) zzaeqVar).zzK(this.zzn.zza(obj, zzC & 1048575), true);
                                    break;
                                } else {
                                    ((zzacd) zzaeqVar).zzK(this.zzn.zza(obj, zzC & 1048575), false);
                                    break;
                                }
                            case 27:
                                zzaeqVar.zzF(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzacmVar);
                                break;
                            case 28:
                                zzaeqVar.zzw(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 29:
                                zzaeqVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 30:
                                List zza2 = this.zzn.zza(obj, zzC & 1048575);
                                zzaeqVar.zzy(zza2);
                                obj2 = zzaet.zzC(zzc, zza2, zzE(zzx), obj2, zzafiVar);
                                break;
                            case 31:
                                zzaeqVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 32:
                                zzaeqVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 33:
                                zzaeqVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 34:
                                zzaeqVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 35:
                                zzaeqVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 36:
                                zzaeqVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 37:
                                zzaeqVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 38:
                                zzaeqVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 39:
                                zzaeqVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 40:
                                zzaeqVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 41:
                                zzaeqVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 42:
                                zzaeqVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 43:
                                zzaeqVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 44:
                                List zza3 = this.zzn.zza(obj, zzC & 1048575);
                                zzaeqVar.zzy(zza3);
                                obj2 = zzaet.zzC(zzc, zza3, zzE(zzx), obj2, zzafiVar);
                                break;
                            case 45:
                                zzaeqVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 46:
                                zzaeqVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 47:
                                zzaeqVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 48:
                                zzaeqVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 49:
                                zzaeqVar.zzC(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzacmVar);
                                break;
                            case 50:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzf = zzafs.zzf(obj, zzC2);
                                if (zzf == null) {
                                    zzf = zzadz.zza().zzb();
                                    zzafs.zzs(obj, zzC2, zzf);
                                } else if (zzaea.zzb(zzf)) {
                                    Object zzb2 = zzadz.zza().zzb();
                                    zzaea.zzc(zzb2, zzf);
                                    zzafs.zzs(obj, zzC2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzafs.zzs(obj, zzC & 1048575, Double.valueOf(zzaeqVar.zza()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 52:
                                zzafs.zzs(obj, zzC & 1048575, Float.valueOf(zzaeqVar.zzb()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 53:
                                zzafs.zzs(obj, zzC & 1048575, Long.valueOf(zzaeqVar.zzl()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 54:
                                zzafs.zzs(obj, zzC & 1048575, Long.valueOf(zzaeqVar.zzo()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 55:
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zzaeqVar.zzg()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 56:
                                zzafs.zzs(obj, zzC & 1048575, Long.valueOf(zzaeqVar.zzk()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 57:
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zzaeqVar.zzf()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 58:
                                zzafs.zzs(obj, zzC & 1048575, Boolean.valueOf(zzaeqVar.zzN()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 59:
                                zzL(obj, zzC, zzaeqVar);
                                zzN(obj, zzc, zzx);
                                break;
                            case 60:
                                if (zzV(obj, zzc, zzx)) {
                                    long j11 = zzC & 1048575;
                                    zzafs.zzs(obj, j11, zzadg.zzg(zzafs.zzf(obj, j11), zzaeqVar.zzs(zzF(zzx), zzacmVar)));
                                } else {
                                    zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzs(zzF(zzx), zzacmVar));
                                    zzM(obj, zzx);
                                }
                                zzN(obj, zzc, zzx);
                                break;
                            case 61:
                                zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzp());
                                zzN(obj, zzc, zzx);
                                break;
                            case 62:
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zzaeqVar.zzj()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 63:
                                int zze2 = zzaeqVar.zze();
                                zzadd zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj2 = zzaet.zzD(zzc, zze2, obj2, zzafiVar);
                                    break;
                                }
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(obj, zzc, zzx);
                                break;
                            case 64:
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zzaeqVar.zzh()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 65:
                                zzafs.zzs(obj, zzC & 1048575, Long.valueOf(zzaeqVar.zzm()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 66:
                                zzafs.zzs(obj, zzC & 1048575, Integer.valueOf(zzaeqVar.zzi()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 67:
                                zzafs.zzs(obj, zzC & 1048575, Long.valueOf(zzaeqVar.zzn()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 68:
                                zzafs.zzs(obj, zzC & 1048575, zzaeqVar.zzr(zzF(zzx), zzacmVar));
                                zzN(obj, zzc, zzx);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = zzafiVar.zzf();
                                }
                                if (!zzafiVar.zzq(obj2, zzaeqVar)) {
                                    for (int i7 = this.zzl; i7 < this.zzm; i7++) {
                                        obj2 = zzG(obj, this.zzk[i7], obj2, zzafiVar);
                                    }
                                    if (obj2 != null) {
                                        zzafiVar.zzn(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzadh unused) {
                        zzafiVar.zzr(zzaeqVar);
                        if (obj2 == null) {
                            obj2 = zzafiVar.zzc(obj);
                        }
                        if (!zzafiVar.zzq(obj2, zzaeqVar)) {
                            for (int i10 = this.zzl; i10 < this.zzm; i10++) {
                                obj2 = zzG(obj, this.zzk[i10], obj2, zzafiVar);
                            }
                            if (obj2 != null) {
                                zzafiVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i11 = this.zzl; i11 < this.zzm; i11++) {
                            obj2 = zzG(obj, this.zzk[i11], obj2, zzafiVar);
                        }
                        if (obj2 != null) {
                            zzafiVar.zzn(obj, obj2);
                            return;
                        }
                        return;
                    }
                    Object zzc2 = !this.zzh ? null : zzacnVar.zzc(zzacmVar, this.zzg, zzc);
                    if (zzc2 != null) {
                        if (zzacrVar == null) {
                            zzacrVar = zzacnVar.zzb(obj);
                        }
                        zzacr zzacrVar2 = zzacrVar;
                        obj2 = zzacnVar.zzd(zzaeqVar, zzc2, zzacmVar, zzacrVar2, obj2, zzafiVar);
                        zzacrVar = zzacrVar2;
                    } else {
                        zzafiVar.zzr(zzaeqVar);
                        if (obj2 == null) {
                            obj2 = zzafiVar.zzc(obj);
                        }
                        if (!zzafiVar.zzq(obj2, zzaeqVar)) {
                            for (int i12 = this.zzl; i12 < this.zzm; i12++) {
                                obj2 = zzG(obj, this.zzk[i12], obj2, zzafiVar);
                            }
                            if (obj2 != null) {
                                zzafiVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i13 = this.zzl; i13 < this.zzm; i13++) {
                    obj2 = zzG(obj, this.zzk[i13], obj2, zzafiVar);
                }
                if (obj2 != null) {
                    zzafiVar.zzn(obj, obj2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzi(Object obj, byte[] bArr, int i7, int i10, zzabl zzablVar) {
        if (this.zzj) {
            zzv(obj, bArr, i7, i10, zzablVar);
        } else {
            zzc(obj, bArr, i7, i10, 0, zzablVar);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzj(Object obj, zzaga zzagaVar) {
        if (!this.zzj) {
            zzO(obj, zzagaVar);
            return;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int zzC = zzC(i7);
            int i10 = this.zzc[i7];
            switch (zzB(zzC)) {
                case 0:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzf(i10, zzafs.zza(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzo(i10, zzafs.zzb(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzt(i10, zzafs.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzJ(i10, zzafs.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzr(i10, zzafs.zzc(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzm(i10, zzafs.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzk(i10, zzafs.zzc(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzb(i10, zzafs.zzw(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzS(obj, i7)) {
                        zzX(i10, zzafs.zzf(obj, zzC & 1048575), zzagaVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzv(i10, zzafs.zzf(obj, zzC & 1048575), zzF(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzd(i10, (zzaby) zzafs.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzH(i10, zzafs.zzc(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzi(i10, zzafs.zzc(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzw(i10, zzafs.zzc(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzy(i10, zzafs.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzA(i10, zzafs.zzc(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzC(i10, zzafs.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzS(obj, i7)) {
                        zzagaVar.zzq(i10, zzafs.zzf(obj, zzC & 1048575), zzF(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzaet.zzJ(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 19:
                    zzaet.zzN(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 20:
                    zzaet.zzQ(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 21:
                    zzaet.zzY(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 22:
                    zzaet.zzP(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 23:
                    zzaet.zzM(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 24:
                    zzaet.zzL(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    zzaet.zzH(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 26:
                    zzaet.zzW(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar);
                    break;
                case 27:
                    zzaet.zzR(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, zzF(i7));
                    break;
                case 28:
                    zzaet.zzI(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar);
                    break;
                case 29:
                    zzaet.zzX(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 30:
                    zzaet.zzK(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 31:
                    zzaet.zzS(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 32:
                    zzaet.zzT(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 33:
                    zzaet.zzU(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 34:
                    zzaet.zzV(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, false);
                    break;
                case 35:
                    zzaet.zzJ(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 36:
                    zzaet.zzN(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 37:
                    zzaet.zzQ(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 38:
                    zzaet.zzY(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 39:
                    zzaet.zzP(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 40:
                    zzaet.zzM(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 41:
                    zzaet.zzL(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 42:
                    zzaet.zzH(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 43:
                    zzaet.zzX(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 44:
                    zzaet.zzK(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 45:
                    zzaet.zzS(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 46:
                    zzaet.zzT(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 47:
                    zzaet.zzU(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 48:
                    zzaet.zzV(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, true);
                    break;
                case 49:
                    zzaet.zzO(i10, (List) zzafs.zzf(obj, zzC & 1048575), zzagaVar, zzF(i7));
                    break;
                case 50:
                    zzP(zzagaVar, i10, zzafs.zzf(obj, zzC & 1048575), i7);
                    break;
                case 51:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzf(i10, zzo(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzo(i10, zzp(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzt(i10, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzJ(i10, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzr(i10, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzm(i10, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzk(i10, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzb(i10, zzW(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzV(obj, i10, i7)) {
                        zzX(i10, zzafs.zzf(obj, zzC & 1048575), zzagaVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzv(i10, zzafs.zzf(obj, zzC & 1048575), zzF(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzd(i10, (zzaby) zzafs.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzH(i10, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzi(i10, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzw(i10, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzy(i10, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzA(i10, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzC(i10, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzV(obj, i10, i7)) {
                        zzagaVar.zzq(i10, zzafs.zzf(obj, zzC & 1048575), zzF(i7));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzafi zzafiVar = this.zzo;
        zzafiVar.zzp(zzafiVar.zzd(obj), zzagaVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.pal.zzaer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(Object obj, Object obj2) {
        int i7;
        boolean zzZ;
        int length = this.zzc.length;
        for (0; i7 < length; i7 + 3) {
            int zzC = zzC(i7);
            long j = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    i7 = (zzQ(obj, obj2, i7) && Double.doubleToLongBits(zzafs.zza(obj, j)) == Double.doubleToLongBits(zzafs.zza(obj2, j))) ? i7 + 3 : 0;
                    return false;
                case 1:
                    if (zzQ(obj, obj2, i7) && Float.floatToIntBits(zzafs.zzb(obj, j)) == Float.floatToIntBits(zzafs.zzb(obj2, j))) {
                    }
                    return false;
                case 2:
                    if (zzQ(obj, obj2, i7) && zzafs.zzd(obj, j) == zzafs.zzd(obj2, j)) {
                    }
                    return false;
                case 3:
                    if (zzQ(obj, obj2, i7) && zzafs.zzd(obj, j) == zzafs.zzd(obj2, j)) {
                    }
                    return false;
                case 4:
                    if (zzQ(obj, obj2, i7) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                    }
                    return false;
                case 5:
                    if (zzQ(obj, obj2, i7) && zzafs.zzd(obj, j) == zzafs.zzd(obj2, j)) {
                    }
                    return false;
                case 6:
                    if (zzQ(obj, obj2, i7) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                    }
                    return false;
                case 7:
                    if (zzQ(obj, obj2, i7) && zzafs.zzw(obj, j) == zzafs.zzw(obj2, j)) {
                    }
                    return false;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzQ(obj, obj2, i7) && zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j))) {
                    }
                    return false;
                case 9:
                    if (zzQ(obj, obj2, i7) && zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j))) {
                    }
                    return false;
                case 10:
                    if (zzQ(obj, obj2, i7) && zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j))) {
                    }
                    return false;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzQ(obj, obj2, i7) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                    }
                    return false;
                case 12:
                    if (zzQ(obj, obj2, i7) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                    }
                    return false;
                case 13:
                    if (zzQ(obj, obj2, i7) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                    }
                    return false;
                case 14:
                    if (zzQ(obj, obj2, i7) && zzafs.zzd(obj, j) == zzafs.zzd(obj2, j)) {
                    }
                    return false;
                case 15:
                    if (zzQ(obj, obj2, i7) && zzafs.zzc(obj, j) == zzafs.zzc(obj2, j)) {
                    }
                    return false;
                case 16:
                    if (zzQ(obj, obj2, i7) && zzafs.zzd(obj, j) == zzafs.zzd(obj2, j)) {
                    }
                    return false;
                case 17:
                    if (zzQ(obj, obj2, i7) && zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j))) {
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
                    zzZ = zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j));
                    if (zzZ) {
                        return false;
                    }
                case 50:
                    zzZ = zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j));
                    if (zzZ) {
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
                    long zzz = zzz(i7) & 1048575;
                    if (zzafs.zzc(obj, zzz) == zzafs.zzc(obj2, zzz) && zzaet.zzZ(zzafs.zzf(obj, j), zzafs.zzf(obj2, j))) {
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

    @Override // com.google.android.gms.internal.pal.zzaer
    public final boolean zzl(Object obj) {
        int i7;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.zzl) {
            int i14 = this.zzk[i13];
            int i15 = this.zzc[i14];
            int zzC = zzC(i14);
            int i16 = this.zzc[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = zzb.getInt(obj, i17);
                }
                i10 = i12;
                i7 = i17;
            } else {
                i7 = i11;
                i10 = i12;
            }
            if ((268435456 & zzC) != 0 && !zzT(obj, i14, i7, i10, i18)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzV(obj, i15, i14) && !zzU(obj, zzC, zzF(i14))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzadz) zzafs.zzf(obj, zzC & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzafs.zzf(obj, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzaer zzF = zzF(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!zzF.zzl(list.get(i19))) {
                            return false;
                        }
                    }
                }
            } else if (zzT(obj, i14, i7, i10, i18) && !zzU(obj, zzC, zzF(i14))) {
                return false;
            }
            i13++;
            i11 = i7;
            i12 = i10;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        throw null;
    }
}
