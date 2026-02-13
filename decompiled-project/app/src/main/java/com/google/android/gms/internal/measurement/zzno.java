package com.google.android.gms.internal.measurement;

import P1.g;
import X.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import h3.o;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzno<T> implements zznw<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzoo.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznl zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoh zzl;
    private final zzlr zzm;

    private zzno(int[] iArr, Object[] objArr, int i7, int i10, zznl zznlVar, boolean z8, int[] iArr2, int i11, int i12, zznq zznqVar, zzmx zzmxVar, zzoh zzohVar, zzlr zzlrVar, zzng zzngVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i10;
        boolean z10 = false;
        if (zzlrVar != null && (zznlVar instanceof zzmb)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzi = iArr2;
        this.zzj = i11;
        this.zzk = i12;
        this.zzl = zzohVar;
        this.zzm = zzlrVar;
        this.zzg = zznlVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzme) {
            return ((zzme) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (!zzA(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzC(Object obj, long j) {
        return ((Double) zzoo.zzn(obj, j)).doubleValue();
    }

    private static float zzD(Object obj, long j) {
        return ((Float) zzoo.zzn(obj, j)).floatValue();
    }

    private static int zzE(Object obj, long j) {
        return ((Integer) zzoo.zzn(obj, j)).intValue();
    }

    private static long zzF(Object obj, long j) {
        return ((Long) zzoo.zzn(obj, j)).longValue();
    }

    private static boolean zzG(Object obj, long j) {
        return ((Boolean) zzoo.zzn(obj, j)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i7) {
        return zzJ(obj, i7) == zzJ(obj2, i7);
    }

    private final boolean zzI(Object obj, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzJ(obj, i7) : (i11 & i12) != 0;
    }

    private final boolean zzJ(Object obj, int i7) {
        int zzy = zzy(i7);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (zzoo.zzd(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzx = zzx(i7);
        long j10 = zzx & 1048575;
        switch (zzz(zzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzoo.zzl(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzoo.zzj(obj, j10)) != 0;
            case 2:
                return zzoo.zzf(obj, j10) != 0;
            case 3:
                return zzoo.zzf(obj, j10) != 0;
            case 4:
                return zzoo.zzd(obj, j10) != 0;
            case 5:
                return zzoo.zzf(obj, j10) != 0;
            case 6:
                return zzoo.zzd(obj, j10) != 0;
            case 7:
                return zzoo.zzh(obj, j10);
            case g.BYTES_FIELD_NUMBER /* 8 */:
                Object zzn = zzoo.zzn(obj, j10);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                }
                if (zzn instanceof zzlg) {
                    return !zzlg.zzb.equals(zzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzoo.zzn(obj, j10) != null;
            case 10:
                return !zzlg.zzb.equals(zzoo.zzn(obj, j10));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return zzoo.zzd(obj, j10) != 0;
            case 12:
                return zzoo.zzd(obj, j10) != 0;
            case 13:
                return zzoo.zzd(obj, j10) != 0;
            case 14:
                return zzoo.zzf(obj, j10) != 0;
            case 15:
                return zzoo.zzd(obj, j10) != 0;
            case 16:
                return zzoo.zzf(obj, j10) != 0;
            case 17:
                return zzoo.zzn(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzK(Object obj, int i7) {
        int zzy = zzy(i7);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzoo.zze(obj, j, (1 << (zzy >>> 20)) | zzoo.zzd(obj, j));
    }

    private final boolean zzL(Object obj, int i7, int i10) {
        return zzoo.zzd(obj, (long) (zzy(i10) & 1048575)) == i7;
    }

    private final void zzM(Object obj, int i7, int i10) {
        zzoo.zze(obj, zzy(i10) & 1048575, i7);
    }

    private final int zzN(int i7, int i10) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
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

    private static final int zzO(byte[] bArr, int i7, int i10, zzos zzosVar, Class cls, zzkv zzkvVar) {
        int i11;
        zzos zzosVar2 = zzos.zza;
        switch (zzosVar.ordinal()) {
            case 0:
                i11 = i7 + 8;
                zzkvVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkw.zze(bArr, i7)));
                break;
            case 1:
                i11 = i7 + 4;
                zzkvVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkw.zzd(bArr, i7)));
                break;
            case 2:
            case 3:
                int zzc = zzkw.zzc(bArr, i7, zzkvVar);
                zzkvVar.zzc = Long.valueOf(zzkvVar.zzb);
                return zzc;
            case 4:
            case 12:
            case 13:
                int zza2 = zzkw.zza(bArr, i7, zzkvVar);
                zzkvVar.zzc = Integer.valueOf(zzkvVar.zza);
                return zza2;
            case 5:
            case 15:
                i11 = i7 + 8;
                zzkvVar.zzc = Long.valueOf(zzkw.zze(bArr, i7));
                break;
            case 6:
            case 14:
                i11 = i7 + 4;
                zzkvVar.zzc = Integer.valueOf(zzkw.zzd(bArr, i7));
                break;
            case 7:
                int zzc2 = zzkw.zzc(bArr, i7, zzkvVar);
                zzkvVar.zzc = Boolean.valueOf(zzkvVar.zzb != 0);
                return zzc2;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                return zzkw.zzf(bArr, i7, zzkvVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzkw.zzh(zznt.zza().zzb(cls), bArr, i7, i10, zzkvVar);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return zzkw.zzg(bArr, i7, zzkvVar);
            case 16:
                int zza3 = zzkw.zza(bArr, i7, zzkvVar);
                zzkvVar.zzc = Integer.valueOf(zzli.zzb(zzkvVar.zza));
                return zza3;
            case 17:
                int zzc3 = zzkw.zzc(bArr, i7, zzkvVar);
                zzkvVar.zzc = Long.valueOf(zzli.zzc(zzkvVar.zzb));
                return zzc3;
        }
        return i11;
    }

    private static final void zzP(int i7, Object obj, zzou zzouVar) {
        if (obj instanceof String) {
            zzouVar.zzm(i7, (String) obj);
        } else {
            zzouVar.zzn(i7, (zzlg) obj);
        }
    }

    public static zzoi zzg(Object obj) {
        zzme zzmeVar = (zzme) obj;
        zzoi zzoiVar = zzmeVar.zzc;
        if (zzoiVar != zzoi.zza()) {
            return zzoiVar;
        }
        zzoi zzb2 = zzoi.zzb();
        zzmeVar.zzc = zzb2;
        return zzb2;
    }

    public static zzno zzl(Class cls, zzni zzniVar, zznq zznqVar, zzmx zzmxVar, zzoh zzohVar, zzlr zzlrVar, zzng zzngVar) {
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
        zznv zznvVar;
        String str;
        int objectFieldOffset;
        int i27;
        Class<?> cls2;
        int i28;
        int i29;
        int i30;
        int i31;
        Field zzm;
        int i32;
        char charAt11;
        int i33;
        int i34;
        int i35;
        Field zzm2;
        Field zzm3;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        int i39;
        char charAt15;
        if (!(zzniVar instanceof zznv)) {
            throw null;
        }
        zznv zznvVar2 = (zznv) zzniVar;
        String zzd = zznvVar2.zzd();
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
        Object[] zze = zznvVar2.zze();
        Class<?> cls3 = zznvVar2.zzb().getClass();
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
                    objArr[c.a(i73, 3, 1)] = zze[i12];
                    i12++;
                } else if (i91 == 12) {
                    if (zznvVar2.zzc() == 1 || i85 != 0) {
                        objArr[c.a(i73, 3, 1)] = zze[i12];
                        i12++;
                    } else {
                        i85 = 0;
                    }
                }
                int i93 = charAt25 + charAt25;
                Object obj = zze[i93];
                if (obj instanceof Field) {
                    zzm2 = (Field) obj;
                } else {
                    zzm2 = zzm(cls3, (String) obj);
                    zze[i93] = zzm2;
                }
                int i94 = i85;
                i31 = (int) unsafe.objectFieldOffset(zzm2);
                int i95 = i93 + 1;
                Object obj2 = zze[i95];
                if (obj2 instanceof Field) {
                    zzm3 = (Field) obj2;
                } else {
                    zzm3 = zzm(cls3, (String) obj2);
                    zze[i95] = zzm3;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzm3);
                cls2 = cls3;
                i28 = i12;
                i85 = i94;
                zznvVar = zznvVar2;
                str = zzd;
                i29 = i92;
                iArr2 = iArr4;
                i27 = objectFieldOffset2;
                i30 = 0;
            } else {
                i26 = charAt23;
                int i96 = i12 + 1;
                Field zzm4 = zzm(cls3, (String) zze[i12]);
                iArr2 = iArr4;
                if (i83 == 9 || i83 == 17) {
                    zznvVar = zznvVar2;
                    objArr[c.a(i73, 3, 1)] = zzm4.getType();
                } else {
                    if (i83 == 27) {
                        zznvVar = zznvVar2;
                        i33 = 1;
                        i34 = i12 + 2;
                    } else if (i83 == 49) {
                        i34 = i12 + 2;
                        zznvVar = zznvVar2;
                        i33 = 1;
                    } else {
                        if (i83 == 12 || i83 == 30 || i83 == 44) {
                            zznvVar = zznvVar2;
                            if (zznvVar2.zzc() == 1 || i85 != 0) {
                                i34 = i12 + 2;
                                objArr[c.a(i73, 3, 1)] = zze[i96];
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
                            zznvVar = zznvVar2;
                        } else {
                            zznvVar = zznvVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
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
                                zzm = (Field) obj3;
                            } else {
                                zzm = zzm(cls3, (String) obj3);
                                zze[i103] = zzm;
                            }
                            cls2 = cls3;
                            i28 = i96;
                            i30 = charAt26 % 32;
                            i27 = (int) unsafe.objectFieldOffset(zzm);
                        }
                        if (i83 >= 18 || i83 > 49) {
                            i31 = objectFieldOffset;
                        } else {
                            iArr[i72] = objectFieldOffset;
                            i31 = objectFieldOffset;
                            i72++;
                        }
                    }
                    objArr[c.a(i73, 3, i33)] = zze[i96];
                    i96 = i34;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
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
            zznvVar2 = zznvVar;
            i41 = i106;
            c10 = 55296;
        }
        return new zzno(iArr4, objArr, i10, i13, zznvVar2.zzb(), false, iArr, i11, i69, zznqVar, zzmxVar, zzohVar, zzlrVar, zzngVar);
    }

    private static Field zzm(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            o.v(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(o.p(sb2, " not found. Known fields are ", arrays), e2);
        }
    }

    private final void zzn(Object obj, Object obj2, int i7) {
        if (zzJ(obj2, i7)) {
            int zzx = zzx(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i10 = this.zzc[i7];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i10);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            zznw zzp = zzp(i7);
            if (!zzJ(obj, i7)) {
                if (zzA(object)) {
                    Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzK(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i7) {
        int[] iArr = this.zzc;
        int i10 = iArr[i7];
        if (zzL(obj2, i10, i7)) {
            int zzx = zzx(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i11 = iArr[i7];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            zznw zzp = zzp(i7);
            if (!zzL(obj, i10, i7)) {
                if (zzA(object)) {
                    Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i10, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final zznw zzp(int i7) {
        Object[] objArr = this.zzd;
        int i10 = i7 / 3;
        int i11 = i10 + i10;
        zznw zznwVar = (zznw) objArr[i11];
        if (zznwVar != null) {
            return zznwVar;
        }
        zznw zzb2 = zznt.zza().zzb((Class) objArr[i11 + 1]);
        objArr[i11] = zzb2;
        return zzb2;
    }

    private final Object zzq(int i7) {
        int i10 = i7 / 3;
        return this.zzd[i10 + i10];
    }

    private final zzmj zzr(int i7) {
        int i10 = i7 / 3;
        return (zzmj) this.zzd[i10 + i10 + 1];
    }

    private final Object zzs(Object obj, int i7) {
        zznw zzp = zzp(i7);
        int zzx = zzx(i7) & 1048575;
        if (!zzJ(obj, i7)) {
            return zzp.zza();
        }
        Object object = zzb.getObject(obj, zzx);
        if (zzA(object)) {
            return object;
        }
        Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzt(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzx(i7) & 1048575, obj2);
        zzK(obj, i7);
    }

    private final Object zzu(Object obj, int i7, int i10) {
        zznw zzp = zzp(i10);
        if (!zzL(obj, i7, i10)) {
            return zzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i10) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzv(Object obj, int i7, int i10, Object obj2) {
        zzb.putObject(obj, zzx(i10) & 1048575, obj2);
        zzM(obj, i7, i10);
    }

    private static boolean zzw(Object obj, int i7, zznw zznwVar) {
        return zznwVar.zzk(zzoo.zzn(obj, i7 & 1048575));
    }

    private final int zzx(int i7) {
        return this.zzc[i7 + 1];
    }

    private final int zzy(int i7) {
        return this.zzc[i7 + 2];
    }

    private static int zzz(int i7) {
        return (i7 >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final Object zza() {
        return ((zzme) this.zzg).zzch();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(Object obj, Object obj2) {
        int i7;
        boolean zzB;
        for (0; i7 < this.zzc.length; i7 + 3) {
            int zzx = zzx(i7);
            long j = zzx & 1048575;
            switch (zzz(zzx)) {
                case 0:
                    i7 = (zzH(obj, obj2, i7) && Double.doubleToLongBits(zzoo.zzl(obj, j)) == Double.doubleToLongBits(zzoo.zzl(obj2, j))) ? i7 + 3 : 0;
                    return false;
                case 1:
                    if (zzH(obj, obj2, i7) && Float.floatToIntBits(zzoo.zzj(obj, j)) == Float.floatToIntBits(zzoo.zzj(obj2, j))) {
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i7) && zzoo.zzf(obj, j) == zzoo.zzf(obj2, j)) {
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i7) && zzoo.zzf(obj, j) == zzoo.zzf(obj2, j)) {
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i7) && zzoo.zzd(obj, j) == zzoo.zzd(obj2, j)) {
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i7) && zzoo.zzf(obj, j) == zzoo.zzf(obj2, j)) {
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i7) && zzoo.zzd(obj, j) == zzoo.zzd(obj2, j)) {
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i7) && zzoo.zzh(obj, j) == zzoo.zzh(obj2, j)) {
                    }
                    return false;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzH(obj, obj2, i7) && zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j))) {
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i7) && zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j))) {
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i7) && zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j))) {
                    }
                    return false;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzH(obj, obj2, i7) && zzoo.zzd(obj, j) == zzoo.zzd(obj2, j)) {
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i7) && zzoo.zzd(obj, j) == zzoo.zzd(obj2, j)) {
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i7) && zzoo.zzd(obj, j) == zzoo.zzd(obj2, j)) {
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i7) && zzoo.zzf(obj, j) == zzoo.zzf(obj2, j)) {
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i7) && zzoo.zzd(obj, j) == zzoo.zzd(obj2, j)) {
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i7) && zzoo.zzf(obj, j) == zzoo.zzf(obj2, j)) {
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i7) && zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j))) {
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
                    zzB = zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j));
                    if (zzB) {
                        return false;
                    }
                case 50:
                    zzB = zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j));
                    if (zzB) {
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
                    long zzy = zzy(i7) & 1048575;
                    if (zzoo.zzd(obj, zzy) == zzoo.zzd(obj2, zzy) && zzny.zzB(zzoo.zzn(obj, j), zzoo.zzn(obj2, j))) {
                    }
                    return false;
                default:
            }
        }
        if (!((zzme) obj).zzc.equals(((zzme) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmb) obj).zzb.equals(((zzmb) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zznw
    public final int zzc(Object obj) {
        int i7;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int zzd;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int hashCode = ((zzme) obj).zzc.hashCode() + (i13 * 53);
                return this.zzh ? (hashCode * 53) + ((zzmb) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzx = zzx(i12);
            int i14 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i15 = iArr[i12];
            long j = i14;
            int i16 = 37;
            switch (zzz) {
                case 0:
                    i7 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzoo.zzl(obj, j));
                    byte[] bArr = zzmo.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzd;
                    break;
                case 1:
                    i10 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(zzoo.zzj(obj, j));
                    i13 = floatToIntBits + i10;
                    break;
                case 2:
                    i7 = i13 * 53;
                    doubleToLongBits = zzoo.zzf(obj, j);
                    byte[] bArr2 = zzmo.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzd;
                    break;
                case 3:
                    i7 = i13 * 53;
                    doubleToLongBits = zzoo.zzf(obj, j);
                    byte[] bArr3 = zzmo.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzd;
                    break;
                case 4:
                    i7 = i13 * 53;
                    zzd = zzoo.zzd(obj, j);
                    i13 = i7 + zzd;
                    break;
                case 5:
                    i7 = i13 * 53;
                    doubleToLongBits = zzoo.zzf(obj, j);
                    byte[] bArr4 = zzmo.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzd;
                    break;
                case 6:
                    i7 = i13 * 53;
                    zzd = zzoo.zzd(obj, j);
                    i13 = i7 + zzd;
                    break;
                case 7:
                    i10 = i13 * 53;
                    floatToIntBits = zzmo.zzb(zzoo.zzh(obj, j));
                    i13 = floatToIntBits + i10;
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    i10 = i13 * 53;
                    floatToIntBits = ((String) zzoo.zzn(obj, j)).hashCode();
                    i13 = floatToIntBits + i10;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object zzn = zzoo.zzn(obj, j);
                    if (zzn != null) {
                        i16 = zzn.hashCode();
                    }
                    i13 = i11 + i16;
                    break;
                case 10:
                    i10 = i13 * 53;
                    floatToIntBits = zzoo.zzn(obj, j).hashCode();
                    i13 = floatToIntBits + i10;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i7 = i13 * 53;
                    zzd = zzoo.zzd(obj, j);
                    i13 = i7 + zzd;
                    break;
                case 12:
                    i7 = i13 * 53;
                    zzd = zzoo.zzd(obj, j);
                    i13 = i7 + zzd;
                    break;
                case 13:
                    i7 = i13 * 53;
                    zzd = zzoo.zzd(obj, j);
                    i13 = i7 + zzd;
                    break;
                case 14:
                    i7 = i13 * 53;
                    doubleToLongBits = zzoo.zzf(obj, j);
                    byte[] bArr5 = zzmo.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzd;
                    break;
                case 15:
                    i7 = i13 * 53;
                    zzd = zzoo.zzd(obj, j);
                    i13 = i7 + zzd;
                    break;
                case 16:
                    i7 = i13 * 53;
                    doubleToLongBits = zzoo.zzf(obj, j);
                    byte[] bArr6 = zzmo.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i7 + zzd;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object zzn2 = zzoo.zzn(obj, j);
                    if (zzn2 != null) {
                        i16 = zzn2.hashCode();
                    }
                    i13 = i11 + i16;
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
                    i10 = i13 * 53;
                    floatToIntBits = zzoo.zzn(obj, j).hashCode();
                    i13 = floatToIntBits + i10;
                    break;
                case 50:
                    i10 = i13 * 53;
                    floatToIntBits = zzoo.zzn(obj, j).hashCode();
                    i13 = floatToIntBits + i10;
                    break;
                case 51:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzC(obj, j));
                        byte[] bArr7 = zzmo.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzd;
                        break;
                    }
                case 52:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(zzD(obj, j));
                        i13 = floatToIntBits + i10;
                        break;
                    }
                case 53:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr8 = zzmo.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzd;
                        break;
                    }
                case 54:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr9 = zzmo.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzd;
                        break;
                    }
                case 55:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzd = zzE(obj, j);
                        i13 = i7 + zzd;
                        break;
                    }
                case 56:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr10 = zzmo.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzd;
                        break;
                    }
                case 57:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzd = zzE(obj, j);
                        i13 = i7 + zzd;
                        break;
                    }
                case 58:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzmo.zzb(zzG(obj, j));
                        i13 = floatToIntBits + i10;
                        break;
                    }
                case 59:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = ((String) zzoo.zzn(obj, j)).hashCode();
                        i13 = floatToIntBits + i10;
                        break;
                    }
                case 60:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzoo.zzn(obj, j).hashCode();
                        i13 = floatToIntBits + i10;
                        break;
                    }
                case 61:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzoo.zzn(obj, j).hashCode();
                        i13 = floatToIntBits + i10;
                        break;
                    }
                case 62:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzd = zzE(obj, j);
                        i13 = i7 + zzd;
                        break;
                    }
                case 63:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzd = zzE(obj, j);
                        i13 = i7 + zzd;
                        break;
                    }
                case 64:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzd = zzE(obj, j);
                        i13 = i7 + zzd;
                        break;
                    }
                case 65:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr11 = zzmo.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzd;
                        break;
                    }
                case 66:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        zzd = zzE(obj, j);
                        i13 = i7 + zzd;
                        break;
                    }
                case 67:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i7 = i13 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr12 = zzmo.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i7 + zzd;
                        break;
                    }
                case 68:
                    if (!zzL(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        floatToIntBits = zzoo.zzn(obj, j).hashCode();
                        i13 = floatToIntBits + i10;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzd(Object obj, Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i7 >= iArr.length) {
                zzny.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzny.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzx = zzx(i7);
            int i10 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i11 = iArr[i7];
            long j = i10;
            switch (zzz) {
                case 0:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zzm(obj, j, zzoo.zzl(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 1:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zzk(obj, j, zzoo.zzj(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 2:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zzg(obj, j, zzoo.zzf(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 3:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zzg(obj, j, zzoo.zzf(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 4:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zze(obj, j, zzoo.zzd(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 5:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zzg(obj, j, zzoo.zzf(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 6:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zze(obj, j, zzoo.zzd(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 7:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zzi(obj, j, zzoo.zzh(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zzo(obj, j, zzoo.zzn(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 9:
                    zzn(obj, obj2, i7);
                    break;
                case 10:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zzo(obj, j, zzoo.zzn(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zze(obj, j, zzoo.zzd(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 12:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zze(obj, j, zzoo.zzd(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 13:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zze(obj, j, zzoo.zzd(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 14:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zzg(obj, j, zzoo.zzf(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 15:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zze(obj, j, zzoo.zzd(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 16:
                    if (!zzJ(obj2, i7)) {
                        break;
                    } else {
                        zzoo.zzg(obj, j, zzoo.zzf(obj2, j));
                        zzK(obj, i7);
                        break;
                    }
                case 17:
                    zzn(obj, obj2, i7);
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
                    zzmn zzmnVar = (zzmn) zzoo.zzn(obj, j);
                    zzmn zzmnVar2 = (zzmn) zzoo.zzn(obj2, j);
                    int size = zzmnVar.size();
                    int size2 = zzmnVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmnVar.zza()) {
                            zzmnVar = zzmnVar.zzg(size2 + size);
                        }
                        zzmnVar.addAll(zzmnVar2);
                    }
                    if (size > 0) {
                        zzmnVar2 = zzmnVar;
                    }
                    zzoo.zzo(obj, j, zzmnVar2);
                    break;
                case 50:
                    int i12 = zzny.zza;
                    zzoo.zzo(obj, j, zzng.zza(zzoo.zzn(obj, j), zzoo.zzn(obj2, j)));
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
                    if (!zzL(obj2, i11, i7)) {
                        break;
                    } else {
                        zzoo.zzo(obj, j, zzoo.zzn(obj2, j));
                        zzM(obj, i11, i7);
                        break;
                    }
                case 60:
                    zzo(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzL(obj2, i11, i7)) {
                        break;
                    } else {
                        zzoo.zzo(obj, j, zzoo.zzn(obj2, j));
                        zzM(obj, i11, i7);
                        break;
                    }
                case 68:
                    zzo(obj, obj2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r2v44 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), method size: 2196
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.measurement.zznw
    public final int zze(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzno.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0065. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.measurement.zznw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzou zzouVar) {
        Map.Entry entry;
        int[] iArr;
        int i7;
        Map.Entry entry2;
        int i10;
        int i11;
        int i12;
        int i13;
        Map.Entry entry3;
        int[] iArr2;
        ?? r92 = 1;
        if (this.zzh) {
            zzlv zzlvVar = ((zzmb) obj).zzb;
            if (!zzlvVar.zza.isEmpty()) {
                entry = (Map.Entry) zzlvVar.zzc().next();
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i14 = 1048575;
                int i15 = 1048575;
                int i16 = 0;
                i7 = 0;
                while (i7 < iArr.length) {
                    int zzx = zzx(i7);
                    int zzz = zzz(zzx);
                    int i17 = iArr[i7];
                    if (zzz <= 17) {
                        int i18 = iArr[i7 + 2];
                        int i19 = i18 & i14;
                        if (i19 != i15) {
                            i16 = i19 == i14 ? 0 : unsafe.getInt(obj, i19);
                            i15 = i19;
                        }
                        i11 = i16;
                        i12 = r92 << (i18 >>> 20);
                        i10 = i15;
                    } else {
                        i10 = i15;
                        i11 = i16;
                        i12 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = zzx & i14;
                    switch (zzz) {
                        case 0:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzf(i17, zzoo.zzl(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zze(i17, zzoo.zzj(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzc(i17, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzh(i17, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzi(i17, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzj(i17, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzk(i17, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzl(i17, zzoo.zzh(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzP(i17, unsafe.getObject(obj, j), zzouVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzr(i17, unsafe.getObject(obj, j), zzp(i13));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzn(i17, (zzlg) unsafe.getObject(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzo(i17, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzg(i17, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzb(i17, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzd(i17, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzp(i17, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzI(obj, i13, i10, i11, i12)) {
                                zzouVar.zzq(i17, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            i13 = i7;
                            if (zzI(obj, i7, i10, i11, i12)) {
                                zzouVar.zzs(i17, unsafe.getObject(obj, j), zzp(i13));
                            }
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 18:
                            zzny.zza(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 19:
                            zzny.zzb(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 20:
                            zzny.zzc(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 21:
                            zzny.zzd(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 22:
                            zzny.zzh(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 23:
                            zzny.zzf(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 24:
                            zzny.zzk(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case BlurFactor.DEFAULT_RADIUS /* 25 */:
                            zzny.zzn(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 26:
                            int i20 = iArr[i7];
                            List list = (List) unsafe.getObject(obj, j);
                            int i21 = zzny.zza;
                            if (list != null && !list.isEmpty()) {
                                zzouVar.zzF(i20, list);
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 27:
                            int i22 = iArr[i7];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zznw zzp = zzp(i7);
                            int i23 = zzny.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i24 = 0; i24 < list2.size(); i24 += r92) {
                                    ((zzlm) zzouVar).zzr(i22, list2.get(i24), zzp);
                                }
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 28:
                            int i25 = iArr[i7];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i26 = zzny.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzouVar.zzG(i25, list3);
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 29:
                            zzny.zzi(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 30:
                            zzny.zzm(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 31:
                            zzny.zzl(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 32:
                            zzny.zzg(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 33:
                            zzny.zzj(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 34:
                            zzny.zze(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, false);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 35:
                            zzny.zza(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 36:
                            zzny.zzb(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 37:
                            zzny.zzc(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 38:
                            zzny.zzd(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 39:
                            zzny.zzh(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 40:
                            zzny.zzf(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 41:
                            zzny.zzk(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 42:
                            zzny.zzn(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 43:
                            zzny.zzi(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 44:
                            zzny.zzm(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 45:
                            zzny.zzl(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 46:
                            zzny.zzg(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 47:
                            zzny.zzj(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 48:
                            zzny.zze(iArr[i7], (List) unsafe.getObject(obj, j), zzouVar, r92);
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 49:
                            int i27 = iArr[i7];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zznw zzp2 = zzp(i7);
                            int i28 = zzny.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i29 = 0; i29 < list4.size(); i29 += r92) {
                                    ((zzlm) zzouVar).zzs(i27, list4.get(i29), zzp2);
                                }
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zzouVar.zzM(i17, ((zzne) zzq(i7)).zze(), (zznf) object);
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 51:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzf(i17, zzC(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 52:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zze(i17, zzD(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 53:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzc(i17, zzF(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 54:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzh(i17, zzF(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 55:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzi(i17, zzE(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 56:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzj(i17, zzF(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 57:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzk(i17, zzE(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 58:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzl(i17, zzG(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 59:
                            if (zzL(obj, i17, i7)) {
                                zzP(i17, unsafe.getObject(obj, j), zzouVar);
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 60:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzr(i17, unsafe.getObject(obj, j), zzp(i7));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 61:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzn(i17, (zzlg) unsafe.getObject(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 62:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzo(i17, zzE(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 63:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzg(i17, zzE(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 64:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzb(i17, zzE(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 65:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzd(i17, zzF(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 66:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzp(i17, zzE(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 67:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzq(i17, zzF(obj, j));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        case 68:
                            if (zzL(obj, i17, i7)) {
                                zzouVar.zzs(i17, unsafe.getObject(obj, j), zzp(i7));
                            }
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                        default:
                            i13 = i7;
                            entry3 = entry;
                            iArr2 = iArr;
                            break;
                    }
                    i7 = i13 + 3;
                    i15 = i10;
                    i16 = i11;
                    entry = entry3;
                    iArr = iArr2;
                    r92 = 1;
                    i14 = 1048575;
                }
                entry2 = entry;
                if (entry2 != null) {
                    ((zzme) obj).zzc.zzg(zzouVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i142 = 1048575;
        int i152 = 1048575;
        int i162 = 0;
        i7 = 0;
        while (i7 < iArr.length) {
        }
        entry2 = entry;
        if (entry2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0b0e, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0da2, code lost:
    
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e07, code lost:
    
        if (r3 == 1048575) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0e09, code lost:
    
        r0.putInt(r8, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0e0d, code lost:
    
        r0 = r14.zzj;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0e13, code lost:
    
        if (r0 >= r14.zzk) goto L697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0e15, code lost:
    
        r4 = r14.zzi;
        r5 = r14.zzl;
        r6 = r14.zzc;
        r4 = r4[r0];
        r6 = r6[r4];
        r7 = com.google.android.gms.internal.measurement.zzoo.zzn(r8, r14.zzx(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0e2c, code lost:
    
        if (r7 == null) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0e2e, code lost:
    
        r10 = r14.zzr(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0e32, code lost:
    
        if (r10 == null) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e34, code lost:
    
        r4 = ((com.google.android.gms.internal.measurement.zzne) r14.zzq(r4)).zze();
        r7 = ((com.google.android.gms.internal.measurement.zznf) r7).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0e4c, code lost:
    
        if (r7.hasNext() == false) goto L700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0e4e, code lost:
    
        r12 = (java.util.Map.Entry) r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0e62, code lost:
    
        if (r10.zza(((java.lang.Integer) r12.getValue()).intValue()) != false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0e64, code lost:
    
        if (r3 != 0) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0e66, code lost:
    
        r3 = r5.zza(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e6a, code lost:
    
        r13 = com.google.android.gms.internal.measurement.zzne.zzc(r4, r12.getKey(), r12.getValue());
        r15 = com.google.android.gms.internal.measurement.zzlg.zzb;
        r15 = new byte[r13];
        r16 = com.google.android.gms.internal.measurement.zzll.zzb;
        r16 = r5;
        r9 = new com.google.android.gms.internal.measurement.zzlj(r15, 0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0e84, code lost:
    
        com.google.android.gms.internal.measurement.zzne.zzb(r9, r4, r12.getKey(), r12.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0e8f, code lost:
    
        r3.zzk((r6 << 3) | 2, com.google.android.gms.internal.measurement.zzld.zza(r9, r15));
        r7.remove();
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0ea9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0eaf, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0eb0, code lost:
    
        r0 = r0 + 1;
        r3 = (com.google.android.gms.internal.measurement.zzoi) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0eba, code lost:
    
        if (r3 == 0) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0ebc, code lost:
    
        ((com.google.android.gms.internal.measurement.zzme) r8).zzc = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0ec1, code lost:
    
        if (r1 != 0) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0ec5, code lost:
    
        if (r2 != r40) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0ecf, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmq(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0ed8, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0ed0, code lost:
    
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0ed4, code lost:
    
        if (r2 > r40) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0ed6, code lost:
    
        if (r11 != r1) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0ede, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmq(r3);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:163:0x0b31. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:245:0x03b0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:632:0x00c9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0d98  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x09a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x09bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:749:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0dad  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v174 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.android.gms.internal.measurement.zzoi] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v72, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzh(Object obj, byte[] bArr, int i7, int i10, int i11, zzkv zzkvVar) {
        zzno<T> zznoVar;
        int i12;
        String str;
        int i13;
        Object obj2;
        Unsafe unsafe;
        int i14;
        int i15;
        int i16;
        int zzN;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Unsafe unsafe2;
        int i23;
        int i24;
        Unsafe unsafe3;
        Object obj3;
        zzno<T> zznoVar2;
        int i25;
        int i26;
        int i27;
        int i28;
        Unsafe unsafe4;
        int i29;
        int i30;
        int zzm;
        int i31;
        int zza2;
        Object obj4;
        int i32;
        int zzl;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int zzg;
        int i41;
        Unsafe unsafe5;
        int i42;
        String str2;
        Object obj5;
        int i43;
        Unsafe unsafe6;
        int i44;
        zznf zznfVar;
        int i45;
        Object obj6;
        zzno<T> zznoVar3 = this;
        Object obj7 = obj;
        int i46 = i10;
        int i47 = i11;
        int i48 = 3;
        zzB(obj);
        Unsafe unsafe7 = zzb;
        int i49 = 0;
        int i50 = -1;
        int i51 = i7;
        int i52 = -1;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 1048575;
        while (true) {
            if (i51 < i46) {
                int i57 = i51 + 1;
                int i58 = bArr[i51];
                if (i58 < 0) {
                    int zzb2 = zzkw.zzb(i58, bArr, i57, zzkvVar);
                    i55 = zzkvVar.zza;
                    i57 = zzb2;
                } else {
                    i55 = i58;
                }
                int i59 = i55 >>> 3;
                if (i59 > i52) {
                    zzN = (i59 < zznoVar3.zze || i59 > zznoVar3.zzf) ? i50 : zznoVar3.zzN(i59, i53 / i48);
                } else if (i59 < zznoVar3.zze || i59 > zznoVar3.zzf) {
                    i16 = i50;
                    if (i16 != i50) {
                        zznoVar = zznoVar3;
                        i17 = i59;
                        i18 = i57;
                        i19 = i50;
                        i12 = i47;
                        str = "Failed to parse the message.";
                        i13 = i54;
                        i15 = i55;
                        i20 = i56;
                        i21 = i49;
                        Unsafe unsafe8 = unsafe7;
                        obj2 = obj7;
                        unsafe = unsafe8;
                    } else {
                        int i60 = i55 & 7;
                        int[] iArr = zznoVar3.zzc;
                        int i61 = iArr[i16 + 1];
                        int zzz = zzz(i61);
                        long j = i61 & 1048575;
                        str = "Failed to parse the message.";
                        if (zzz <= 17) {
                            int i62 = iArr[i16 + 2];
                            int i63 = 1 << (i62 >>> 20);
                            int i64 = i62 & 1048575;
                            int i65 = i56;
                            if (i64 != i65) {
                                if (i65 != 1048575) {
                                    unsafe7.putInt(obj7, i65, i54);
                                }
                                i56 = i64;
                                i54 = i64 == 1048575 ? 0 : unsafe7.getInt(obj7, i64);
                            } else {
                                i56 = i65;
                            }
                            switch (zzz) {
                                case 0:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 1) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i51 = i57 + 8;
                                        i54 |= i63;
                                        zzoo.zzm(obj7, j, Double.longBitsToDouble(zzkw.zze(bArr, i57)));
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case 1:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 5) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i51 = i57 + 4;
                                        i54 |= i63;
                                        zzoo.zzk(obj7, j, Float.intBitsToFloat(zzkw.zzd(bArr, i57)));
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case 2:
                                case 3:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 0) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i54 |= i63;
                                        int zzc = zzkw.zzc(bArr, i57, zzkvVar);
                                        unsafe2.putLong(obj, j, zzkvVar.zzb);
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i51 = zzc;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case 4:
                                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 0) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i54 |= i63;
                                        i51 = zzkw.zza(bArr, i57, zzkvVar);
                                        unsafe2.putInt(obj7, j, zzkvVar.zza);
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case 5:
                                case 14:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 1) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i54 |= i63;
                                        unsafe2.putLong(obj, j, zzkw.zze(bArr, i57));
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i51 = i57 + 8;
                                        i50 = -1;
                                        i49 = 0;
                                        i46 = i10;
                                        i47 = i11;
                                        i55 = i23;
                                        i48 = 3;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 5) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i51 = i57 + 4;
                                        i54 |= i63;
                                        unsafe2.putInt(obj7, j, zzkw.zzd(bArr, i57));
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case 7:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 0) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i54 |= i63;
                                        i51 = zzkw.zzc(bArr, i57, zzkvVar);
                                        zzoo.zzi(obj7, j, zzkvVar.zzb != 0);
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case g.BYTES_FIELD_NUMBER /* 8 */:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 2) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        if ((i61 & 536870912) != 0) {
                                            i54 |= i63;
                                            i51 = zzkw.zzf(bArr, i57, zzkvVar);
                                        } else {
                                            i51 = zzkw.zza(bArr, i57, zzkvVar);
                                            int i66 = zzkvVar.zza;
                                            if (i66 < 0) {
                                                throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i67 = i54 | i63;
                                            if (i66 == 0) {
                                                zzkvVar.zzc = "";
                                            } else {
                                                zzkvVar.zzc = new String(bArr, i51, i66, zzmo.zza);
                                                i51 += i66;
                                            }
                                            i54 = i67;
                                        }
                                        unsafe2.putObject(obj7, j, zzkvVar.zzc);
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case 9:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 2) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i54 |= i63;
                                        Object zzs = zznoVar3.zzs(obj7, i24);
                                        i51 = zzkw.zzj(zzs, zznoVar3.zzp(i24), bArr, i57, i10, zzkvVar);
                                        zznoVar3.zzt(obj7, i24, zzs);
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case 10:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 2) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i54 |= i63;
                                        int zzg2 = zzkw.zzg(bArr, i57, zzkvVar);
                                        unsafe2.putObject(obj7, j, zzkvVar.zzc);
                                        i51 = zzg2;
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case 12:
                                    i22 = i59;
                                    unsafe2 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 0) {
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i51 = zzkw.zza(bArr, i57, zzkvVar);
                                        int i68 = zzkvVar.zza;
                                        zzmj zzr = zznoVar3.zzr(i24);
                                        if ((i61 & Integer.MIN_VALUE) == 0 || zzr == null || zzr.zza(i68)) {
                                            i54 |= i63;
                                            unsafe2.putInt(obj7, j, i68);
                                        } else {
                                            zzg(obj).zzk(i23, Long.valueOf(i68));
                                        }
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case 15:
                                    i22 = i59;
                                    unsafe3 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 0) {
                                        unsafe2 = unsafe3;
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i54 |= i63;
                                        i51 = zzkw.zza(bArr, i57, zzkvVar);
                                        unsafe2 = unsafe3;
                                        unsafe2.putInt(obj7, j, zzli.zzb(zzkvVar.zza));
                                        i53 = i24;
                                        unsafe7 = unsafe2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = i19;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                case 16:
                                    i22 = i59;
                                    unsafe3 = unsafe7;
                                    i23 = i55;
                                    i19 = -1;
                                    i24 = i16;
                                    if (i60 != 0) {
                                        unsafe2 = unsafe3;
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i54 |= i63;
                                        int zzc2 = zzkw.zzc(bArr, i57, zzkvVar);
                                        unsafe3.putLong(obj, j, zzli.zzc(zzkvVar.zzb));
                                        i53 = i24;
                                        i51 = zzc2;
                                        i52 = i22;
                                        i55 = i23;
                                        i50 = -1;
                                        unsafe7 = unsafe3;
                                        i49 = 0;
                                        i48 = 3;
                                        i46 = i10;
                                        i47 = i11;
                                        break;
                                    }
                                default:
                                    if (i60 != 3) {
                                        i22 = i59;
                                        i23 = i55;
                                        i19 = -1;
                                        unsafe2 = unsafe7;
                                        i24 = i16;
                                        i18 = i57;
                                        i13 = i54;
                                        i20 = i56;
                                        i21 = i24;
                                        obj2 = obj7;
                                        unsafe = unsafe2;
                                        i17 = i22;
                                        i15 = i23;
                                        zznoVar = zznoVar3;
                                        i12 = i11;
                                        break;
                                    } else {
                                        i54 |= i63;
                                        Object zzs2 = zznoVar3.zzs(obj7, i16);
                                        int i69 = i16;
                                        i51 = zzkw.zzk(zzs2, zznoVar3.zzp(i16), bArr, i57, i10, (i59 << 3) | 4, zzkvVar);
                                        zznoVar3.zzt(obj7, i69, zzs2);
                                        i46 = i10;
                                        i52 = i59;
                                        i53 = i69;
                                        i50 = -1;
                                        unsafe7 = unsafe7;
                                        i49 = 0;
                                        i48 = 3;
                                        i47 = i11;
                                        break;
                                    }
                            }
                        } else {
                            int i70 = i55;
                            i19 = -1;
                            int i71 = i54;
                            i20 = i56;
                            Unsafe unsafe9 = unsafe7;
                            int i72 = i16;
                            if (zzz != 27) {
                                Unsafe unsafe10 = unsafe9;
                                i13 = i71;
                                if (zzz > 49) {
                                    i37 = i70;
                                    i46 = i10;
                                    zzno<T> zznoVar4 = zznoVar3;
                                    int i73 = i72;
                                    int i74 = i59;
                                    i38 = i57;
                                    if (zzz != 50) {
                                        unsafe = unsafe10;
                                        long j10 = iArr[i73 + 2] & 1048575;
                                        switch (zzz) {
                                            case 51:
                                                zznoVar = this;
                                                i21 = i73;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                obj2 = obj;
                                                if (i60 == 1) {
                                                    i39 = i38 + 8;
                                                    unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzkw.zze(bArr, i38))));
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i51 = i39;
                                                    if (i51 == i38) {
                                                        i12 = i11;
                                                        i18 = i51;
                                                        break;
                                                    } else {
                                                        i52 = i17;
                                                        i55 = i15;
                                                        zznoVar3 = zznoVar;
                                                        i53 = i21;
                                                        i56 = i20;
                                                        i50 = -1;
                                                        i54 = i13;
                                                        i49 = 0;
                                                        i48 = 3;
                                                        i46 = i10;
                                                        i47 = i11;
                                                        Object obj8 = obj2;
                                                        unsafe7 = unsafe;
                                                        obj7 = obj8;
                                                        break;
                                                    }
                                                }
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                            case 52:
                                                zznoVar = this;
                                                i21 = i73;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                obj2 = obj;
                                                if (i60 == 5) {
                                                    i39 = i38 + 4;
                                                    unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzkw.zzd(bArr, i38))));
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i51 = i39;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                zznoVar = this;
                                                i21 = i73;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                obj2 = obj;
                                                if (i60 == 0) {
                                                    i39 = zzkw.zzc(bArr, i38, zzkvVar);
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzkvVar.zzb));
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i51 = i39;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                zznoVar = this;
                                                i21 = i73;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                obj2 = obj;
                                                if (i60 == 0) {
                                                    i39 = zzkw.zza(bArr, i38, zzkvVar);
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzkvVar.zza));
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i51 = i39;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                zznoVar = this;
                                                i21 = i73;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                obj2 = obj;
                                                if (i60 == 1) {
                                                    i39 = i38 + 8;
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzkw.zze(bArr, i38)));
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i51 = i39;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                zznoVar = this;
                                                i21 = i73;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                obj2 = obj;
                                                if (i60 == 5) {
                                                    i39 = i38 + 4;
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzkw.zzd(bArr, i38)));
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i51 = i39;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 58:
                                                zznoVar = this;
                                                i21 = i73;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                obj2 = obj;
                                                if (i60 == 0) {
                                                    i39 = zzkw.zzc(bArr, i38, zzkvVar);
                                                    unsafe.putObject(obj2, j, Boolean.valueOf(zzkvVar.zzb != 0));
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i51 = i39;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 59:
                                                zznoVar = this;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                i40 = i73;
                                                obj2 = obj;
                                                if (i60 == 2) {
                                                    i39 = zzkw.zza(bArr, i38, zzkvVar);
                                                    int i75 = zzkvVar.zza;
                                                    if (i75 == 0) {
                                                        unsafe.putObject(obj2, j, "");
                                                        i21 = i40;
                                                    } else {
                                                        i21 = i40;
                                                        int i76 = i39 + i75;
                                                        if ((i61 & 536870912) != 0 && !zzor.zza(bArr, i39, i76)) {
                                                            throw new zzmq("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe.putObject(obj2, j, new String(bArr, i39, i75, zzmo.zza));
                                                        i39 = i76;
                                                    }
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i51 = i39;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i21 = i40;
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 60:
                                                zznoVar = this;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                i40 = i73;
                                                obj2 = obj;
                                                if (i60 == 2) {
                                                    Object zzu = zznoVar.zzu(obj2, i17, i40);
                                                    i51 = zzkw.zzj(zzu, zznoVar.zzp(i40), bArr, i38, i10, zzkvVar);
                                                    zznoVar.zzv(obj2, i17, i40, zzu);
                                                    i21 = i40;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i21 = i40;
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 61:
                                                zznoVar = this;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                i40 = i73;
                                                obj2 = obj;
                                                if (i60 == 2) {
                                                    zzg = zzkw.zzg(bArr, i38, zzkvVar);
                                                    unsafe.putObject(obj2, j, zzkvVar.zzc);
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i51 = zzg;
                                                    i21 = i40;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i21 = i40;
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 63:
                                                zznoVar = this;
                                                str = str;
                                                i41 = i37;
                                                i17 = i74;
                                                i40 = i73;
                                                obj2 = obj;
                                                if (i60 == 0) {
                                                    zzg = zzkw.zza(bArr, i38, zzkvVar);
                                                    int i77 = zzkvVar.zza;
                                                    zzmj zzr2 = zznoVar.zzr(i40);
                                                    if (zzr2 == null || zzr2.zza(i77)) {
                                                        i15 = i41;
                                                        unsafe.putObject(obj2, j, Integer.valueOf(i77));
                                                        unsafe.putInt(obj2, j10, i17);
                                                    } else {
                                                        i15 = i41;
                                                        zzg(obj).zzk(i15, Long.valueOf(i77));
                                                    }
                                                    i51 = zzg;
                                                    i21 = i40;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i15 = i41;
                                                i21 = i40;
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 66:
                                                zznoVar = this;
                                                str = str;
                                                i41 = i37;
                                                i17 = i74;
                                                i40 = i73;
                                                obj2 = obj;
                                                if (i60 == 0) {
                                                    zzg = zzkw.zza(bArr, i38, zzkvVar);
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzli.zzb(zzkvVar.zza)));
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i15 = i41;
                                                    i51 = zzg;
                                                    i21 = i40;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i15 = i41;
                                                i21 = i40;
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 67:
                                                zznoVar = this;
                                                str = str;
                                                i41 = i37;
                                                i17 = i74;
                                                i40 = i73;
                                                obj2 = obj;
                                                if (i60 == 0) {
                                                    zzg = zzkw.zzc(bArr, i38, zzkvVar);
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzli.zzc(zzkvVar.zzb)));
                                                    unsafe.putInt(obj2, j10, i17);
                                                    i15 = i41;
                                                    i51 = zzg;
                                                    i21 = i40;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                i15 = i41;
                                                i21 = i40;
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                            case 68:
                                                if (i60 == 3) {
                                                    int i78 = (i37 & (-8)) | 4;
                                                    zznoVar = this;
                                                    Object zzu2 = zznoVar.zzu(obj, i74, i73);
                                                    str = str;
                                                    i17 = i74;
                                                    i40 = i73;
                                                    i51 = zzkw.zzk(zzu2, zznoVar.zzp(i73), bArr, i38, i10, i78, zzkvVar);
                                                    zznoVar.zzv(obj, i17, i40, zzu2);
                                                    i15 = i37;
                                                    obj2 = obj;
                                                    i21 = i40;
                                                    if (i51 == i38) {
                                                    }
                                                } else {
                                                    zznoVar = this;
                                                    str = str;
                                                    i17 = i74;
                                                    i15 = i37;
                                                    i21 = i73;
                                                    obj2 = obj;
                                                    i51 = i38;
                                                    if (i51 == i38) {
                                                    }
                                                }
                                                break;
                                            default:
                                                zznoVar = this;
                                                i21 = i73;
                                                str = str;
                                                i15 = i37;
                                                i17 = i74;
                                                obj2 = obj;
                                                i51 = i38;
                                                if (i51 == i38) {
                                                }
                                                break;
                                        }
                                    } else if (i60 == 2) {
                                        Object zzq = zznoVar4.zzq(i73);
                                        Unsafe unsafe11 = unsafe10;
                                        Object object = unsafe11.getObject(obj7, j);
                                        if (!((zznf) object).zze()) {
                                            zznf zzc3 = zznf.zza().zzc();
                                            zzng.zza(zzc3, object);
                                            unsafe11.putObject(obj7, j, zzc3);
                                            object = zzc3;
                                        }
                                        zznd zze = ((zzne) zzq).zze();
                                        zznf zznfVar2 = (zznf) object;
                                        int zza3 = zzkw.zza(bArr, i38, zzkvVar);
                                        int i79 = zzkvVar.zza;
                                        if (i79 >= 0 && i79 <= i46 - zza3) {
                                            int i80 = zza3 + i79;
                                            Object obj9 = zze.zzb;
                                            Object obj10 = zze.zzd;
                                            Object obj11 = obj10;
                                            while (zza3 < i80) {
                                                Object obj12 = obj9;
                                                int i81 = i80;
                                                int i82 = zza3 + 1;
                                                byte b2 = bArr[zza3];
                                                if (b2 < 0) {
                                                    i82 = zzkw.zzb(b2, bArr, i82, zzkvVar);
                                                    b2 = zzkvVar.zza;
                                                }
                                                int i83 = b2 >>> 3;
                                                zznf zznfVar3 = zznfVar2;
                                                int i84 = b2 & 7;
                                                int i85 = i73;
                                                if (i83 != 1) {
                                                    if (i83 == 2) {
                                                        zzos zzosVar = zze.zzc;
                                                        if (i84 == zzosVar.zzb()) {
                                                            unsafe6 = unsafe11;
                                                            obj6 = obj12;
                                                            obj5 = obj10;
                                                            zznfVar = zznfVar3;
                                                            i43 = i74;
                                                            i45 = i85;
                                                            zza3 = zzO(bArr, i82, i10, zzosVar, obj10.getClass(), zzkvVar);
                                                            i80 = i81;
                                                            obj11 = zzkvVar.zzc;
                                                            i73 = i45;
                                                            zznfVar2 = zznfVar;
                                                            obj9 = obj6;
                                                            unsafe11 = unsafe6;
                                                            obj10 = obj5;
                                                            i74 = i43;
                                                        }
                                                    }
                                                    obj5 = obj10;
                                                    i43 = i74;
                                                    unsafe6 = unsafe11;
                                                    i44 = i81;
                                                    zznfVar = zznfVar3;
                                                    i45 = i85;
                                                    obj6 = obj12;
                                                } else {
                                                    obj5 = obj10;
                                                    i43 = i74;
                                                    unsafe6 = unsafe11;
                                                    i44 = i81;
                                                    zznfVar = zznfVar3;
                                                    i45 = i85;
                                                    obj6 = obj12;
                                                    zzos zzosVar2 = zze.zza;
                                                    if (i84 == zzosVar2.zzb()) {
                                                        zza3 = zzO(bArr, i82, i10, zzosVar2, null, zzkvVar);
                                                        obj9 = zzkvVar.zzc;
                                                        i80 = i44;
                                                        i73 = i45;
                                                        zznfVar2 = zznfVar;
                                                        unsafe11 = unsafe6;
                                                        obj10 = obj5;
                                                        i74 = i43;
                                                    }
                                                }
                                                zza3 = zzkw.zzp(b2, bArr, i82, i46, zzkvVar);
                                                i80 = i44;
                                                i73 = i45;
                                                zznfVar2 = zznfVar;
                                                obj9 = obj6;
                                                unsafe11 = unsafe6;
                                                obj10 = obj5;
                                                i74 = i43;
                                            }
                                            int i86 = i80;
                                            zznf zznfVar4 = zznfVar2;
                                            i42 = i74;
                                            unsafe5 = unsafe11;
                                            Object obj13 = obj9;
                                            int i87 = i73;
                                            if (zza3 != i86) {
                                                throw new zzmq(str);
                                            }
                                            zznfVar4.put(obj13, obj11);
                                            if (i86 != i38) {
                                                zznoVar3 = this;
                                                i47 = i11;
                                                i51 = i86;
                                                i53 = i87;
                                                i55 = i37;
                                                i56 = i20;
                                                unsafe7 = unsafe5;
                                                i50 = -1;
                                                i54 = i13;
                                                i52 = i42;
                                                i49 = 0;
                                                i48 = 3;
                                                obj7 = obj;
                                            } else {
                                                zznoVar = this;
                                                i12 = i11;
                                                i18 = i86;
                                                i21 = i87;
                                            }
                                        }
                                    } else {
                                        unsafe5 = unsafe10;
                                        i42 = i74;
                                        str2 = str;
                                        i72 = i73;
                                        zznoVar = this;
                                        i12 = i11;
                                        i21 = i72;
                                        str = str2;
                                        i18 = i38;
                                    }
                                } else {
                                    int i88 = i59;
                                    long j11 = i61;
                                    zzmn zzmnVar = (zzmn) unsafe10.getObject(obj7, j);
                                    if (zzmnVar.zza()) {
                                        obj3 = "";
                                    } else {
                                        int size = zzmnVar.size();
                                        obj3 = "";
                                        zzmnVar = zzmnVar.zzg(size + size);
                                        unsafe10.putObject(obj7, j, zzmnVar);
                                    }
                                    zzmn zzmnVar2 = zzmnVar;
                                    switch (zzz) {
                                        case 18:
                                        case 35:
                                            i46 = i10;
                                            zznoVar2 = zznoVar3;
                                            i25 = i57;
                                            i26 = i72;
                                            i27 = i88;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zzln zzlnVar = (zzln) zzmnVar2;
                                                i51 = zzkw.zza(bArr, i25, zzkvVar);
                                                int i89 = zzkvVar.zza;
                                                int i90 = i51 + i89;
                                                if (i90 > bArr.length) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzlnVar.zzh((i89 / 8) + zzlnVar.size());
                                                while (i51 < i90) {
                                                    zzlnVar.zzf(Double.longBitsToDouble(zzkw.zze(bArr, i51)));
                                                    i51 += 8;
                                                }
                                                if (i51 != i90) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i51 == i25) {
                                                    i21 = i26;
                                                    i18 = i51;
                                                    i17 = i27;
                                                    zznoVar = zznoVar2;
                                                    i15 = i28;
                                                    i12 = i11;
                                                    obj2 = obj7;
                                                    unsafe = unsafe4;
                                                    break;
                                                } else {
                                                    i53 = i26;
                                                    i52 = i27;
                                                    zznoVar3 = zznoVar2;
                                                    i55 = i28;
                                                    i56 = i20;
                                                    i50 = -1;
                                                    i54 = i13;
                                                    i49 = 0;
                                                    i48 = 3;
                                                    unsafe7 = unsafe4;
                                                    i47 = i11;
                                                    break;
                                                }
                                            } else {
                                                if (i60 == 1) {
                                                    i29 = i25 + 8;
                                                    zzln zzlnVar2 = (zzln) zzmnVar2;
                                                    zzlnVar2.zzf(Double.longBitsToDouble(zzkw.zze(bArr, i25)));
                                                    while (i29 < i46) {
                                                        int zza4 = zzkw.zza(bArr, i29, zzkvVar);
                                                        if (i28 == zzkvVar.zza) {
                                                            zzlnVar2.zzf(Double.longBitsToDouble(zzkw.zze(bArr, zza4)));
                                                            i29 = zza4 + 8;
                                                        } else {
                                                            i51 = i29;
                                                            if (i51 == i25) {
                                                            }
                                                        }
                                                    }
                                                    i51 = i29;
                                                    if (i51 == i25) {
                                                    }
                                                }
                                                i51 = i25;
                                                if (i51 == i25) {
                                                }
                                            }
                                        case 19:
                                        case 36:
                                            i46 = i10;
                                            zznoVar2 = zznoVar3;
                                            i25 = i57;
                                            i26 = i72;
                                            i27 = i88;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zzlx zzlxVar = (zzlx) zzmnVar2;
                                                i51 = zzkw.zza(bArr, i25, zzkvVar);
                                                int i91 = zzkvVar.zza;
                                                int i92 = i51 + i91;
                                                if (i92 > bArr.length) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzlxVar.zzh((i91 / 4) + zzlxVar.size());
                                                while (i51 < i92) {
                                                    zzlxVar.zzf(Float.intBitsToFloat(zzkw.zzd(bArr, i51)));
                                                    i51 += 4;
                                                }
                                                if (i51 != i92) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i51 == i25) {
                                                }
                                            } else {
                                                if (i60 == 5) {
                                                    i29 = i25 + 4;
                                                    zzlx zzlxVar2 = (zzlx) zzmnVar2;
                                                    zzlxVar2.zzf(Float.intBitsToFloat(zzkw.zzd(bArr, i25)));
                                                    while (i29 < i46) {
                                                        int zza5 = zzkw.zza(bArr, i29, zzkvVar);
                                                        if (i28 == zzkvVar.zza) {
                                                            zzlxVar2.zzf(Float.intBitsToFloat(zzkw.zzd(bArr, zza5)));
                                                            i29 = zza5 + 4;
                                                        } else {
                                                            i51 = i29;
                                                            if (i51 == i25) {
                                                            }
                                                        }
                                                    }
                                                    i51 = i29;
                                                    if (i51 == i25) {
                                                    }
                                                }
                                                i51 = i25;
                                                if (i51 == i25) {
                                                }
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i46 = i10;
                                            zznoVar2 = zznoVar3;
                                            i25 = i57;
                                            i26 = i72;
                                            i27 = i88;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zzmz zzmzVar = (zzmz) zzmnVar2;
                                                i51 = zzkw.zza(bArr, i25, zzkvVar);
                                                int i93 = zzkvVar.zza + i51;
                                                while (i51 < i93) {
                                                    i51 = zzkw.zzc(bArr, i51, zzkvVar);
                                                    zzmzVar.zzf(zzkvVar.zzb);
                                                }
                                                if (i51 != i93) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    zzmz zzmzVar2 = (zzmz) zzmnVar2;
                                                    i51 = zzkw.zzc(bArr, i25, zzkvVar);
                                                    zzmzVar2.zzf(zzkvVar.zzb);
                                                    while (i51 < i46) {
                                                        int zza6 = zzkw.zza(bArr, i51, zzkvVar);
                                                        if (i28 == zzkvVar.zza) {
                                                            i51 = zzkw.zzc(bArr, zza6, zzkvVar);
                                                            zzmzVar2.zzf(zzkvVar.zzb);
                                                        }
                                                    }
                                                }
                                                i51 = i25;
                                            }
                                            if (i51 == i25) {
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i46 = i10;
                                            zznoVar2 = zznoVar3;
                                            i25 = i57;
                                            i30 = i72;
                                            i27 = i88;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zzm = zzkw.zzm(bArr, i25, zzmnVar2, zzkvVar);
                                                i51 = zzm;
                                                i26 = i30;
                                                if (i51 == i25) {
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    i26 = i30;
                                                    i51 = zzkw.zzl(i28, bArr, i25, i10, zzmnVar2, zzkvVar);
                                                    if (i51 == i25) {
                                                    }
                                                }
                                                i26 = i30;
                                                i51 = i25;
                                                if (i51 == i25) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i46 = i10;
                                            zznoVar2 = zznoVar3;
                                            i25 = i57;
                                            int i94 = i72;
                                            i27 = i88;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zzmz zzmzVar3 = (zzmz) zzmnVar2;
                                                zzm = zzkw.zza(bArr, i25, zzkvVar);
                                                int i95 = zzkvVar.zza;
                                                int i96 = zzm + i95;
                                                if (i96 > bArr.length) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzmzVar3.zzh((i95 / 8) + zzmzVar3.size());
                                                while (zzm < i96) {
                                                    zzmzVar3.zzf(zzkw.zze(bArr, zzm));
                                                    zzm += 8;
                                                    i94 = i94;
                                                }
                                                i30 = i94;
                                                if (zzm != i96) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i51 = zzm;
                                                i26 = i30;
                                                if (i51 == i25) {
                                                }
                                            } else {
                                                i30 = i94;
                                                if (i60 == 1) {
                                                    int i97 = i25 + 8;
                                                    zzmz zzmzVar4 = (zzmz) zzmnVar2;
                                                    zzmzVar4.zzf(zzkw.zze(bArr, i25));
                                                    while (i97 < i46) {
                                                        int zza7 = zzkw.zza(bArr, i97, zzkvVar);
                                                        if (i28 == zzkvVar.zza) {
                                                            zzmzVar4.zzf(zzkw.zze(bArr, zza7));
                                                            i97 = zza7 + 8;
                                                        } else {
                                                            i51 = i97;
                                                            i26 = i30;
                                                            if (i51 == i25) {
                                                            }
                                                        }
                                                    }
                                                    i51 = i97;
                                                    i26 = i30;
                                                    if (i51 == i25) {
                                                    }
                                                }
                                                i26 = i30;
                                                i51 = i25;
                                                if (i51 == i25) {
                                                }
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i46 = i10;
                                            zznoVar2 = zznoVar3;
                                            i25 = i57;
                                            i31 = i72;
                                            i27 = i88;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zzmf zzmfVar = (zzmf) zzmnVar2;
                                                zza2 = zzkw.zza(bArr, i25, zzkvVar);
                                                int i98 = zzkvVar.zza;
                                                int i99 = zza2 + i98;
                                                if (i99 > bArr.length) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzmfVar.zzi((i98 / 4) + zzmfVar.size());
                                                while (zza2 < i99) {
                                                    zzmfVar.zzh(zzkw.zzd(bArr, zza2));
                                                    zza2 += 4;
                                                }
                                                if (zza2 != i99) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i51 = zza2;
                                                i26 = i31;
                                                if (i51 == i25) {
                                                }
                                            } else {
                                                if (i60 == 5) {
                                                    int i100 = i25 + 4;
                                                    zzmf zzmfVar2 = (zzmf) zzmnVar2;
                                                    zzmfVar2.zzh(zzkw.zzd(bArr, i25));
                                                    while (i100 < i46) {
                                                        int zza8 = zzkw.zza(bArr, i100, zzkvVar);
                                                        if (i28 == zzkvVar.zza) {
                                                            zzmfVar2.zzh(zzkw.zzd(bArr, zza8));
                                                            i100 = zza8 + 4;
                                                        } else {
                                                            i51 = i100;
                                                            i26 = i31;
                                                            if (i51 == i25) {
                                                            }
                                                        }
                                                    }
                                                    i51 = i100;
                                                    i26 = i31;
                                                    if (i51 == i25) {
                                                    }
                                                }
                                                i26 = i31;
                                                i51 = i25;
                                                if (i51 == i25) {
                                                }
                                            }
                                            break;
                                        case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                        case 42:
                                            i46 = i10;
                                            zznoVar2 = zznoVar3;
                                            i25 = i57;
                                            i31 = i72;
                                            i27 = i88;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zzkx zzkxVar = (zzkx) zzmnVar2;
                                                zza2 = zzkw.zza(bArr, i25, zzkvVar);
                                                int i101 = zzkvVar.zza + zza2;
                                                while (zza2 < i101) {
                                                    zza2 = zzkw.zzc(bArr, zza2, zzkvVar);
                                                    zzkxVar.zzf(zzkvVar.zzb != 0);
                                                }
                                                if (zza2 != i101) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    zzkx zzkxVar2 = (zzkx) zzmnVar2;
                                                    zza2 = zzkw.zzc(bArr, i25, zzkvVar);
                                                    zzkxVar2.zzf(zzkvVar.zzb != 0);
                                                    while (zza2 < i46) {
                                                        int zza9 = zzkw.zza(bArr, zza2, zzkvVar);
                                                        if (i28 == zzkvVar.zza) {
                                                            zza2 = zzkw.zzc(bArr, zza9, zzkvVar);
                                                            zzkxVar2.zzf(zzkvVar.zzb != 0);
                                                        }
                                                    }
                                                }
                                                i26 = i31;
                                                i51 = i25;
                                                if (i51 == i25) {
                                                }
                                            }
                                            i51 = zza2;
                                            i26 = i31;
                                            if (i51 == i25) {
                                            }
                                            break;
                                        case 26:
                                            i25 = i57;
                                            i31 = i72;
                                            i27 = i88;
                                            i46 = i10;
                                            zznoVar2 = zznoVar3;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                if ((536870912 & j11) == 0) {
                                                    i51 = zzkw.zza(bArr, i25, zzkvVar);
                                                    int i102 = zzkvVar.zza;
                                                    if (i102 < 0) {
                                                        throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i102 == 0) {
                                                        obj4 = obj3;
                                                        zzmnVar2.add(obj4);
                                                    } else {
                                                        obj4 = obj3;
                                                        zzmnVar2.add(new String(bArr, i51, i102, zzmo.zza));
                                                        i51 += i102;
                                                    }
                                                    while (i51 < i46) {
                                                        int zza10 = zzkw.zza(bArr, i51, zzkvVar);
                                                        if (i28 == zzkvVar.zza) {
                                                            i51 = zzkw.zza(bArr, zza10, zzkvVar);
                                                            int i103 = zzkvVar.zza;
                                                            if (i103 < 0) {
                                                                throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i103 == 0) {
                                                                zzmnVar2.add(obj4);
                                                            } else {
                                                                zzmnVar2.add(new String(bArr, i51, i103, zzmo.zza));
                                                                i51 += i103;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Object obj14 = obj3;
                                                    i51 = zzkw.zza(bArr, i25, zzkvVar);
                                                    int i104 = zzkvVar.zza;
                                                    if (i104 < 0) {
                                                        throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i104 == 0) {
                                                        zzmnVar2.add(obj14);
                                                    } else {
                                                        int i105 = i51 + i104;
                                                        if (!zzor.zza(bArr, i51, i105)) {
                                                            throw new zzmq("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzmnVar2.add(new String(bArr, i51, i104, zzmo.zza));
                                                        i51 = i105;
                                                    }
                                                    while (i51 < i46) {
                                                        int zza11 = zzkw.zza(bArr, i51, zzkvVar);
                                                        if (i28 == zzkvVar.zza) {
                                                            i51 = zzkw.zza(bArr, zza11, zzkvVar);
                                                            int i106 = zzkvVar.zza;
                                                            if (i106 < 0) {
                                                                throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i106 == 0) {
                                                                zzmnVar2.add(obj14);
                                                            } else {
                                                                int i107 = i51 + i106;
                                                                if (!zzor.zza(bArr, i51, i107)) {
                                                                    throw new zzmq("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzmnVar2.add(new String(bArr, i51, i106, zzmo.zza));
                                                                i51 = i107;
                                                            }
                                                        }
                                                    }
                                                }
                                                i26 = i31;
                                                if (i51 == i25) {
                                                }
                                            }
                                            i26 = i31;
                                            i51 = i25;
                                            if (i51 == i25) {
                                            }
                                            break;
                                        case 27:
                                            i46 = i10;
                                            i25 = i57;
                                            i32 = i88;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zznoVar2 = this;
                                                i51 = zzkw.zzn(zznoVar2.zzp(i72), i28, bArr, i25, i10, zzmnVar2, zzkvVar);
                                                i27 = i32;
                                                i26 = i72;
                                                if (i51 == i25) {
                                                }
                                            }
                                            zznoVar2 = this;
                                            i26 = i72;
                                            i27 = i32;
                                            i51 = i25;
                                            if (i51 == i25) {
                                            }
                                            break;
                                        case 28:
                                            i46 = i10;
                                            i25 = i57;
                                            i32 = i88;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                int zza12 = zzkw.zza(bArr, i25, zzkvVar);
                                                int i108 = zzkvVar.zza;
                                                if (i108 < 0) {
                                                    throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i108 > bArr.length - zza12) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i108 == 0) {
                                                    zzmnVar2.add(zzlg.zzb);
                                                } else {
                                                    zzmnVar2.add(zzlg.zzh(bArr, zza12, i108));
                                                    zza12 += i108;
                                                }
                                                while (zza12 < i46) {
                                                    int zza13 = zzkw.zza(bArr, zza12, zzkvVar);
                                                    if (i28 == zzkvVar.zza) {
                                                        zza12 = zzkw.zza(bArr, zza13, zzkvVar);
                                                        int i109 = zzkvVar.zza;
                                                        if (i109 < 0) {
                                                            throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i109 > bArr.length - zza12) {
                                                            throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i109 == 0) {
                                                            zzmnVar2.add(zzlg.zzb);
                                                        } else {
                                                            zzmnVar2.add(zzlg.zzh(bArr, zza12, i109));
                                                            zza12 += i109;
                                                        }
                                                    } else {
                                                        zznoVar2 = this;
                                                        i26 = i72;
                                                        i27 = i32;
                                                        i51 = zza12;
                                                        if (i51 == i25) {
                                                        }
                                                    }
                                                }
                                                zznoVar2 = this;
                                                i26 = i72;
                                                i27 = i32;
                                                i51 = zza12;
                                                if (i51 == i25) {
                                                }
                                            }
                                            zznoVar2 = this;
                                            i26 = i72;
                                            i27 = i32;
                                            i51 = i25;
                                            if (i51 == i25) {
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i46 = i10;
                                            i25 = i57;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zzl = zzkw.zzm(bArr, i25, zzmnVar2, zzkvVar);
                                            } else if (i60 == 0) {
                                                zzl = zzkw.zzl(i28, bArr, i25, i10, zzmnVar2, zzkvVar);
                                            } else {
                                                zznoVar2 = this;
                                                i26 = i72;
                                                i27 = i88;
                                                i51 = i25;
                                                if (i51 == i25) {
                                                }
                                            }
                                            zzmj zzr3 = zznoVar3.zzr(i72);
                                            zzoh zzohVar = zznoVar3.zzl;
                                            int i110 = zzny.zza;
                                            if (zzr3 == null) {
                                                i33 = zzl;
                                                i34 = i88;
                                            } else if (zzmnVar2 != null) {
                                                int size2 = zzmnVar2.size();
                                                Object obj15 = null;
                                                int i111 = 0;
                                                int i112 = 0;
                                                while (i112 < size2) {
                                                    int i113 = zzl;
                                                    Integer num = (Integer) zzmnVar2.get(i112);
                                                    int intValue = num.intValue();
                                                    if (zzr3.zza(intValue)) {
                                                        if (i112 != i111) {
                                                            zzmnVar2.set(i111, num);
                                                        }
                                                        i111++;
                                                        i36 = 1;
                                                        i35 = i88;
                                                    } else {
                                                        i35 = i88;
                                                        obj15 = zzny.zzE(obj7, i35, intValue, obj15, zzohVar);
                                                        i36 = 1;
                                                    }
                                                    i112 += i36;
                                                    i88 = i35;
                                                    zzl = i113;
                                                }
                                                i33 = zzl;
                                                i34 = i88;
                                                if (i111 != size2) {
                                                    zzmnVar2.subList(i111, size2).clear();
                                                }
                                            } else {
                                                i33 = zzl;
                                                i34 = i88;
                                                Iterator it = zzmnVar2.iterator();
                                                Object obj16 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzr3.zza(intValue2)) {
                                                        obj16 = zzny.zzE(obj7, i34, intValue2, obj16, zzohVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            zznoVar2 = this;
                                            i26 = i72;
                                            i27 = i34;
                                            i51 = i33;
                                            if (i51 == i25) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i46 = i10;
                                            i25 = i57;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zzmf zzmfVar3 = (zzmf) zzmnVar2;
                                                i51 = zzkw.zza(bArr, i25, zzkvVar);
                                                int i114 = zzkvVar.zza + i51;
                                                while (i51 < i114) {
                                                    i51 = zzkw.zza(bArr, i51, zzkvVar);
                                                    zzmfVar3.zzh(zzli.zzb(zzkvVar.zza));
                                                }
                                                if (i51 != i114) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    zzmf zzmfVar4 = (zzmf) zzmnVar2;
                                                    i51 = zzkw.zza(bArr, i25, zzkvVar);
                                                    zzmfVar4.zzh(zzli.zzb(zzkvVar.zza));
                                                    while (i51 < i46) {
                                                        int zza14 = zzkw.zza(bArr, i51, zzkvVar);
                                                        if (i28 == zzkvVar.zza) {
                                                            i51 = zzkw.zza(bArr, zza14, zzkvVar);
                                                            zzmfVar4.zzh(zzli.zzb(zzkvVar.zza));
                                                        }
                                                    }
                                                }
                                                zznoVar2 = zznoVar3;
                                                i26 = i72;
                                                i27 = i88;
                                                i51 = i25;
                                                if (i51 == i25) {
                                                }
                                            }
                                            zznoVar2 = zznoVar3;
                                            i26 = i72;
                                            i27 = i88;
                                            if (i51 == i25) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            i46 = i10;
                                            i25 = i57;
                                            i28 = i70;
                                            unsafe4 = unsafe10;
                                            if (i60 == 2) {
                                                zzmz zzmzVar5 = (zzmz) zzmnVar2;
                                                i51 = zzkw.zza(bArr, i25, zzkvVar);
                                                int i115 = zzkvVar.zza + i51;
                                                while (i51 < i115) {
                                                    i51 = zzkw.zzc(bArr, i51, zzkvVar);
                                                    zzmzVar5.zzf(zzli.zzc(zzkvVar.zzb));
                                                }
                                                if (i51 != i115) {
                                                    throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    zzmz zzmzVar6 = (zzmz) zzmnVar2;
                                                    i51 = zzkw.zzc(bArr, i25, zzkvVar);
                                                    zzmzVar6.zzf(zzli.zzc(zzkvVar.zzb));
                                                    while (i51 < i46) {
                                                        int zza15 = zzkw.zza(bArr, i51, zzkvVar);
                                                        if (i28 == zzkvVar.zza) {
                                                            i51 = zzkw.zzc(bArr, zza15, zzkvVar);
                                                            zzmzVar6.zzf(zzli.zzc(zzkvVar.zzb));
                                                        }
                                                    }
                                                }
                                                zznoVar2 = zznoVar3;
                                                i26 = i72;
                                                i27 = i88;
                                                i51 = i25;
                                                if (i51 == i25) {
                                                }
                                            }
                                            zznoVar2 = zznoVar3;
                                            i26 = i72;
                                            i27 = i88;
                                            if (i51 == i25) {
                                            }
                                            break;
                                        default:
                                            if (i60 == 3) {
                                                int i116 = (i70 & (-8)) | 4;
                                                zznw zzp = zznoVar3.zzp(i72);
                                                i25 = i57;
                                                i51 = zzkw.zzi(zzp, bArr, i57, i10, i116, zzkvVar);
                                                zzmnVar2.add(zzkvVar.zzc);
                                                int i117 = i10;
                                                while (true) {
                                                    if (i51 < i117) {
                                                        int zza16 = zzkw.zza(bArr, i51, zzkvVar);
                                                        int i118 = i70;
                                                        if (i118 == zzkvVar.zza) {
                                                            i51 = zzkw.zzi(zzp, bArr, zza16, i10, i116, zzkvVar);
                                                            zzmnVar2.add(zzkvVar.zzc);
                                                            i117 = i117;
                                                            i116 = i116;
                                                            unsafe10 = unsafe10;
                                                            i70 = i118;
                                                        } else {
                                                            i46 = i117;
                                                            unsafe4 = unsafe10;
                                                            i28 = i118;
                                                        }
                                                    } else {
                                                        i46 = i117;
                                                        Unsafe unsafe12 = unsafe10;
                                                        i28 = i70;
                                                        unsafe4 = unsafe12;
                                                    }
                                                }
                                                zznoVar2 = zznoVar3;
                                                i26 = i72;
                                                i27 = i88;
                                                if (i51 == i25) {
                                                }
                                            } else {
                                                i46 = i10;
                                                i25 = i57;
                                                i28 = i70;
                                                unsafe4 = unsafe10;
                                                zznoVar2 = zznoVar3;
                                                i26 = i72;
                                                i27 = i88;
                                                i51 = i25;
                                                if (i51 == i25) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            } else if (i60 == 2) {
                                zzmn zzmnVar3 = (zzmn) unsafe9.getObject(obj7, j);
                                if (!zzmnVar3.zza()) {
                                    int size3 = zzmnVar3.size();
                                    zzmnVar3 = zzmnVar3.zzg(size3 == 0 ? 10 : size3 + size3);
                                    unsafe9.putObject(obj7, j, zzmnVar3);
                                }
                                i51 = zzkw.zzn(zznoVar3.zzp(i72), i70, bArr, i57, i10, zzmnVar3, zzkvVar);
                                i55 = i70;
                                i52 = i59;
                                i53 = i72;
                                unsafe7 = unsafe9;
                                i56 = i20;
                                i50 = -1;
                                i49 = 0;
                                i48 = 3;
                                i47 = i11;
                                i54 = i71;
                                i46 = i10;
                            } else {
                                i37 = i70;
                                unsafe5 = unsafe9;
                                i38 = i57;
                                i13 = i71;
                                i42 = i59;
                                str2 = str;
                                zznoVar = this;
                                i12 = i11;
                                i21 = i72;
                                str = str2;
                                i18 = i38;
                            }
                            i15 = i37;
                            unsafe = unsafe5;
                            i17 = i42;
                            obj2 = obj;
                        }
                    }
                    if (i15 == i12 || i12 == 0) {
                        if (zznoVar.zzh) {
                            zzlq zzlqVar = zzkvVar.zzd;
                            int i119 = zzlq.zzb;
                            int i120 = zznt.zza;
                            if (zzlqVar != zzlq.zza) {
                                if (zzlqVar.zzb(zznoVar.zzg, i17) != null) {
                                    throw null;
                                }
                                i51 = zzkw.zzo(i15, bArr, i18, i10, zzg(obj), zzkvVar);
                                i52 = i17;
                                i55 = i15;
                                i53 = i21;
                                i56 = i20;
                                i50 = i19;
                                i54 = i13;
                                i49 = 0;
                                i46 = i10;
                                i47 = i12;
                                zznoVar3 = zznoVar;
                                i48 = 3;
                                Object obj82 = obj2;
                                unsafe7 = unsafe;
                                obj7 = obj82;
                            }
                        }
                        i51 = zzkw.zzo(i15, bArr, i18, i10, zzg(obj), zzkvVar);
                        i52 = i17;
                        i55 = i15;
                        i53 = i21;
                        i56 = i20;
                        i50 = i19;
                        i54 = i13;
                        i49 = 0;
                        i46 = i10;
                        i47 = i12;
                        zznoVar3 = zznoVar;
                        i48 = 3;
                        Object obj822 = obj2;
                        unsafe7 = unsafe;
                        obj7 = obj822;
                    } else {
                        i51 = i18;
                        i14 = i20;
                    }
                } else {
                    zzN = zznoVar3.zzN(i59, i49);
                }
                i16 = zzN;
                if (i16 != i50) {
                }
                if (i15 == i12) {
                }
                if (zznoVar.zzh) {
                }
                i51 = zzkw.zzo(i15, bArr, i18, i10, zzg(obj), zzkvVar);
                i52 = i17;
                i55 = i15;
                i53 = i21;
                i56 = i20;
                i50 = i19;
                i54 = i13;
                i49 = 0;
                i46 = i10;
                i47 = i12;
                zznoVar3 = zznoVar;
                i48 = 3;
                Object obj8222 = obj2;
                unsafe7 = unsafe;
                obj7 = obj8222;
            } else {
                zznoVar = zznoVar3;
                i12 = i47;
                str = "Failed to parse the message.";
                i13 = i54;
                Unsafe unsafe13 = unsafe7;
                obj2 = obj7;
                unsafe = unsafe13;
                i14 = i56;
                i15 = i55;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzi(Object obj, byte[] bArr, int i7, int i10, zzkv zzkvVar) {
        zzh(obj, bArr, i7, i10, 0, zzkvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzj(Object obj) {
        if (zzA(obj)) {
            if (obj instanceof zzme) {
                zzme zzmeVar = (zzme) obj;
                zzmeVar.zzcm(f.API_PRIORITY_OTHER);
                zzmeVar.zza = 0;
                zzmeVar.zzcg();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int zzx = zzx(i7);
                int i10 = 1048575 & zzx;
                int zzz = zzz(zzx);
                long j = i10;
                if (zzz != 9) {
                    if (zzz != 60 && zzz != 68) {
                        switch (zzz) {
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
                                ((zzmn) zzoo.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zznf) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzL(obj, iArr[i7], i7)) {
                        zzp(i7).zzj(zzb.getObject(obj, j));
                    }
                }
                if (zzJ(obj, i7)) {
                    zzp(i7).zzj(zzb.getObject(obj, j));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final boolean zzk(Object obj) {
        int i7;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i12 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i14 = iArr[i12];
            int i15 = iArr2[i14];
            int zzx = zzx(i14);
            int i16 = iArr2[i14 + 2];
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
            if ((268435456 & zzx) != 0 && !zzI(obj, i14, i7, i10, i18)) {
                return false;
            }
            int zzz = zzz(zzx);
            if (zzz != 9 && zzz != 17) {
                if (zzz != 27) {
                    if (zzz == 60 || zzz == 68) {
                        if (zzL(obj, i15, i14) && !zzw(obj, zzx, zzp(i14))) {
                            return false;
                        }
                    } else if (zzz != 49) {
                        if (zzz != 50) {
                            continue;
                        } else {
                            zznf zznfVar = (zznf) zzoo.zzn(obj, zzx & 1048575);
                            if (!zznfVar.isEmpty() && ((zzne) zzq(i14)).zze().zzc.zza() == zzot.MESSAGE) {
                                zznw zznwVar = null;
                                for (Object obj2 : zznfVar.values()) {
                                    if (zznwVar == null) {
                                        zznwVar = zznt.zza().zzb(obj2.getClass());
                                    }
                                    if (!zznwVar.zzk(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzoo.zzn(obj, zzx & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zznw zzp = zzp(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!zzp.zzk(list.get(i19))) {
                            return false;
                        }
                    }
                }
            } else if (zzI(obj, i14, i7, i10, i18) && !zzw(obj, zzx, zzp(i14))) {
                return false;
            }
            i12++;
            i13 = i7;
            i11 = i10;
        }
        return !this.zzh || ((zzmb) obj).zzb.zze();
    }
}
