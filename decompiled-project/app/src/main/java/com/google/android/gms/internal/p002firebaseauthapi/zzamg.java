package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import P1.g;
import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzamg<T> implements zzamv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanp.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzamc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzamk zzn;
    private final zzalm zzo;
    private final zzano<?, ?> zzp;
    private final zzakm<?> zzq;
    private final zzalz zzr;

    private zzamg(int[] iArr, Object[] objArr, int i7, int i10, zzamc zzamcVar, boolean z8, int[] iArr2, int i11, int i12, zzamk zzamkVar, zzalm zzalmVar, zzano<?, ?> zzanoVar, zzakm<?> zzakmVar, zzalz zzalzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i10;
        this.zzi = zzamcVar instanceof zzaky;
        this.zzh = zzakmVar != null && zzakmVar.zza(zzamcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i11;
        this.zzm = i12;
        this.zzn = zzamkVar;
        this.zzo = zzalmVar;
        this.zzp = zzanoVar;
        this.zzq = zzakmVar;
        this.zzg = zzamcVar;
        this.zzr = zzalzVar;
    }

    private static <T> double zza(T t5, long j) {
        return ((Double) zzanp.zze(t5, j)).doubleValue();
    }

    private final int zza(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zza(i7, 0);
    }

    private final int zza(int i7, int i10) {
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

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private static int zza(byte[] bArr, int i7, int i10, zzanw zzanwVar, Class<?> cls, zzajk zzajkVar) {
        switch (zzamj.zza[zzanwVar.ordinal()]) {
            case 1:
                int zzd = zzajl.zzd(bArr, i7, zzajkVar);
                zzajkVar.zzc = Boolean.valueOf(zzajkVar.zzb != 0);
                return zzd;
            case 2:
                return zzajl.zza(bArr, i7, zzajkVar);
            case 3:
                zzajkVar.zzc = Double.valueOf(zzajl.zza(bArr, i7));
                return i7 + 8;
            case 4:
            case 5:
                zzajkVar.zzc = Integer.valueOf(zzajl.zzc(bArr, i7));
                return i7 + 4;
            case 6:
            case 7:
                zzajkVar.zzc = Long.valueOf(zzajl.zzd(bArr, i7));
                return i7 + 8;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                zzajkVar.zzc = Float.valueOf(zzajl.zzb(bArr, i7));
                return i7 + 4;
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                int zzc = zzajl.zzc(bArr, i7, zzajkVar);
                zzajkVar.zzc = Integer.valueOf(zzajkVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzajl.zzd(bArr, i7, zzajkVar);
                zzajkVar.zzc = Long.valueOf(zzajkVar.zzb);
                return zzd2;
            case 14:
                return zzajl.zza(zzamr.zza().zza((Class) cls), bArr, i7, i10, zzajkVar);
            case 15:
                int zzc2 = zzajl.zzc(bArr, i7, zzajkVar);
                zzajkVar.zzc = Integer.valueOf(zzakb.zze(zzajkVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzajl.zzd(bArr, i7, zzajkVar);
                zzajkVar.zzc = Long.valueOf(zzakb.zza(zzajkVar.zzb));
                return zzd3;
            case 17:
                return zzajl.zzb(bArr, i7, zzajkVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> zzamg<T> zza(Class<T> cls, zzama zzamaVar, zzamk zzamkVar, zzalm zzalmVar, zzano<?, ?> zzanoVar, zzakm<?> zzakmVar, zzalz zzalzVar) {
        int i7;
        int charAt;
        int charAt2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
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
        zzamt zzamtVar;
        int i27;
        int objectFieldOffset;
        int i28;
        String str;
        int i29;
        int i30;
        int i31;
        Field zza2;
        int i32;
        char charAt11;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field zza3;
        Object obj2;
        Field zza4;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        int i39;
        char charAt15;
        if (!(zzamaVar instanceof zzamt)) {
            throw new NoSuchMethodError();
        }
        zzamt zzamtVar2 = (zzamt) zzamaVar;
        String zzd = zzamtVar2.zzd();
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
            i14 = 0;
            charAt = 0;
            charAt2 = 0;
            i13 = 0;
            i12 = 0;
            i11 = 0;
            iArr = zza;
            i10 = 0;
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
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            int i68 = (charAt17 << 1) + charAt18;
            i10 = charAt17;
            i11 = charAt22;
            i41 = i65;
            i12 = charAt20;
            i13 = charAt19;
            i14 = i68;
            iArr = iArr2;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzamtVar2.zze();
        Class<?> cls2 = zzamtVar2.zza().getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[charAt << 1];
        int i69 = i11 + charAt2;
        int i70 = i11;
        int i71 = i69;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int charAt23 = zzd.charAt(i41);
            if (charAt23 >= c10) {
                int i75 = charAt23 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    charAt14 = zzd.charAt(i76);
                    if (charAt14 < c10) {
                        break;
                    }
                    i75 |= (charAt14 & 8191) << i77;
                    i77 += 13;
                    i76 = i38;
                }
                charAt23 = i75 | (charAt14 << i77);
                i23 = i38;
            } else {
                i23 = i74;
            }
            int i78 = i23 + 1;
            int charAt24 = zzd.charAt(i23);
            if (charAt24 >= c10) {
                int i79 = charAt24 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    charAt13 = zzd.charAt(i80);
                    i24 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i79 |= (charAt13 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                    length = i24;
                }
                charAt24 = i79 | (charAt13 << i81);
                i25 = i37;
            } else {
                i24 = length;
                i25 = i78;
            }
            int i82 = charAt24 & 255;
            int i83 = i12;
            if ((charAt24 & 1024) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            int i84 = i13;
            if (i82 >= 51) {
                int i85 = i25 + 1;
                int charAt25 = zzd.charAt(i25);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i86 = charAt25 & 8191;
                    int i87 = 13;
                    while (true) {
                        i36 = i85 + 1;
                        charAt12 = zzd.charAt(i85);
                        if (charAt12 < c11) {
                            break;
                        }
                        i86 |= (charAt12 & 8191) << i87;
                        i87 += 13;
                        i85 = i36;
                        c11 = 55296;
                    }
                    charAt25 = i86 | (charAt12 << i87);
                    i85 = i36;
                }
                int i88 = i82 - 51;
                int i89 = i85;
                if (i88 == 9 || i88 == 17) {
                    i34 = 1;
                    i35 = i14 + 1;
                    objArr[((i72 / 3) << 1) + 1] = zze[i14];
                } else if (i88 != 12 || (!zzamtVar2.zzb().equals(zzamo.PROTO2) && (charAt24 & 2048) == 0)) {
                    i34 = 1;
                    int i90 = charAt25 << i34;
                    obj = zze[i90];
                    if (obj instanceof Field) {
                        zza3 = zza(cls2, (String) obj);
                        zze[i90] = zza3;
                    } else {
                        zza3 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza3);
                    int i91 = i90 + 1;
                    obj2 = zze[i91];
                    int i92 = i14;
                    if (obj2 instanceof Field) {
                        zza4 = zza(cls2, (String) obj2);
                        zze[i91] = zza4;
                    } else {
                        zza4 = (Field) obj2;
                    }
                    i29 = (int) unsafe.objectFieldOffset(zza4);
                    str = zzd;
                    objectFieldOffset = objectFieldOffset2;
                    i28 = i92;
                    i31 = 0;
                    zzamtVar = zzamtVar2;
                    i26 = charAt23;
                    i30 = i89;
                } else {
                    i34 = 1;
                    i35 = i14 + 1;
                    objArr[((i72 / 3) << 1) + 1] = zze[i14];
                }
                i14 = i35;
                int i902 = charAt25 << i34;
                obj = zze[i902];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zza3);
                int i912 = i902 + 1;
                obj2 = zze[i912];
                int i922 = i14;
                if (obj2 instanceof Field) {
                }
                i29 = (int) unsafe.objectFieldOffset(zza4);
                str = zzd;
                objectFieldOffset = objectFieldOffset22;
                i28 = i922;
                i31 = 0;
                zzamtVar = zzamtVar2;
                i26 = charAt23;
                i30 = i89;
            } else {
                int i93 = i14 + 1;
                Field zza5 = zza(cls2, (String) zze[i14]);
                i26 = charAt23;
                if (i82 == 9 || i82 == 17) {
                    zzamtVar = zzamtVar2;
                    objArr[((i72 / 3) << 1) + 1] = zza5.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        zzamtVar = zzamtVar2;
                        i33 = i14 + 2;
                        objArr[((i72 / 3) << 1) + 1] = zze[i93];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        zzamtVar = zzamtVar2;
                        if (zzamtVar2.zzb() == zzamo.PROTO2 || (charAt24 & 2048) != 0) {
                            i33 = i14 + 2;
                            objArr[((i72 / 3) << 1) + 1] = zze[i93];
                        }
                    } else if (i82 == 50) {
                        int i94 = i70 + 1;
                        iArr[i70] = i72;
                        int i95 = (i72 / 3) << 1;
                        int i96 = i14 + 2;
                        objArr[i95] = zze[i93];
                        if ((charAt24 & 2048) != 0) {
                            i93 = i14 + 3;
                            objArr[i95 + 1] = zze[i96];
                            zzamtVar = zzamtVar2;
                            i70 = i94;
                        } else {
                            i70 = i94;
                            zzamtVar = zzamtVar2;
                            i27 = i96;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                            if ((charAt24 & 4096) != 0 || i82 > 17) {
                                i28 = i27;
                                str = zzd;
                                i29 = 1048575;
                                i30 = i25;
                                i31 = 0;
                            } else {
                                i30 = i25 + 1;
                                int charAt26 = zzd.charAt(i25);
                                if (charAt26 >= 55296) {
                                    int i97 = charAt26 & 8191;
                                    int i98 = 13;
                                    while (true) {
                                        i32 = i30 + 1;
                                        charAt11 = zzd.charAt(i30);
                                        if (charAt11 < 55296) {
                                            break;
                                        }
                                        i97 |= (charAt11 & 8191) << i98;
                                        i98 += 13;
                                        i30 = i32;
                                    }
                                    charAt26 = i97 | (charAt11 << i98);
                                    i30 = i32;
                                }
                                int i99 = (charAt26 / 32) + (i10 << 1);
                                Object obj3 = zze[i99];
                                if (obj3 instanceof Field) {
                                    zza2 = (Field) obj3;
                                } else {
                                    zza2 = zza(cls2, (String) obj3);
                                    zze[i99] = zza2;
                                }
                                i28 = i27;
                                str = zzd;
                                i31 = charAt26 % 32;
                                i29 = (int) unsafe.objectFieldOffset(zza2);
                            }
                            if (i82 >= 18 && i82 <= 49) {
                                iArr[i71] = objectFieldOffset;
                                i71++;
                            }
                        }
                    } else {
                        zzamtVar = zzamtVar2;
                    }
                    i27 = i33;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i28 = i27;
                    str = zzd;
                    i29 = 1048575;
                    i30 = i25;
                    i31 = 0;
                    if (i82 >= 18) {
                        iArr[i71] = objectFieldOffset;
                        i71++;
                    }
                }
                i27 = i93;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                if ((charAt24 & 4096) != 0) {
                }
                i28 = i27;
                str = zzd;
                i29 = 1048575;
                i30 = i25;
                i31 = 0;
                if (i82 >= 18) {
                }
            }
            int i100 = i72 + 1;
            iArr3[i72] = i26;
            int i101 = i72 + 2;
            Class<?> cls3 = cls2;
            int i102 = i30;
            iArr3[i100] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | objectFieldOffset;
            i72 += 3;
            iArr3[i101] = (i31 << 20) | i29;
            zzd = str;
            i12 = i83;
            i14 = i28;
            zzamtVar2 = zzamtVar;
            length = i24;
            i13 = i84;
            cls2 = cls3;
            i41 = i102;
            c10 = 55296;
        }
        return new zzamg<>(iArr3, objArr, i13, i12, zzamtVar2.zza(), false, iArr, i11, i69, zzamkVar, zzalmVar, zzanoVar, zzakmVar, zzalzVar);
    }

    private final <K, V, UT, UB> UB zza(int i7, int i10, Map<K, V> map, zzald zzaldVar, UB ub2, zzano<UT, UB> zzanoVar, Object obj) {
        zzalx<?, ?> zza2 = this.zzr.zza(zzf(i7));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzaldVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzanoVar.zzc(obj);
                }
                zzaju zzc = zzajp.zzc(zzalu.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzalu.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzanoVar.zza((zzano<UT, UB>) ub2, i10, zzc.zza());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t5, int i7) {
        zzamv zze = zze(i7);
        long zzc = zzc(i7) & 1048575;
        if (!zzc((zzamg<T>) t5, i7)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t5, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t5, int i7, int i10) {
        zzamv zze = zze(i10);
        if (!zzc((zzamg<T>) t5, i7, i10)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t5, zzc(i10) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    private final <UT, UB> UB zza(Object obj, int i7, UB ub2, zzano<UT, UB> zzanoVar, Object obj2) {
        zzald zzd;
        int i10 = this.zzc[i7];
        Object zze = zzanp.zze(obj, zzc(i7) & 1048575);
        return (zze == null || (zzd = zzd(i7)) == null) ? ub2 : (UB) zza(i7, i10, this.zzr.zze(zze), zzd, (zzald) ub2, (zzano<UT, zzald>) zzanoVar, obj2);
    }

    private static Field zza(Class<?> cls, String str) {
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
            StringBuilder o10 = c.o("Field ", str, " for ", name, " not found. Known fields are ");
            o10.append(arrays);
            throw new RuntimeException(o10.toString(), e2);
        }
    }

    private static void zza(int i7, Object obj, zzaof zzaofVar) {
        if (obj instanceof String) {
            zzaofVar.zza(i7, (String) obj);
        } else {
            zzaofVar.zza(i7, (zzajp) obj);
        }
    }

    private static <UT, UB> void zza(zzano<UT, UB> zzanoVar, T t5, zzaof zzaofVar) {
        zzanoVar.zzb((zzano<UT, UB>) zzanoVar.zzd(t5), zzaofVar);
    }

    private final <K, V> void zza(zzaof zzaofVar, int i7, Object obj, int i10) {
        if (obj != null) {
            zzaofVar.zza(i7, this.zzr.zza(zzf(i10)), this.zzr.zzd(obj));
        }
    }

    private final void zza(T t5, int i7, int i10, Object obj) {
        zzb.putObject(t5, zzc(i10) & 1048575, obj);
        zzb((zzamg<T>) t5, i7, i10);
    }

    private final void zza(Object obj, int i7, zzams zzamsVar) {
        if (zzg(i7)) {
            zzanp.zza(obj, i7 & 1048575, zzamsVar.zzr());
        } else if (this.zzi) {
            zzanp.zza(obj, i7 & 1048575, zzamsVar.zzq());
        } else {
            zzanp.zza(obj, i7 & 1048575, zzamsVar.zzp());
        }
    }

    private final void zza(T t5, int i7, Object obj) {
        zzb.putObject(t5, zzc(i7) & 1048575, obj);
        zzb((zzamg<T>) t5, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t5, T t10, int i7) {
        if (zzc((zzamg<T>) t10, i7)) {
            long zzc = zzc(i7) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + String.valueOf(t10));
            }
            zzamv zze = zze(i7);
            if (!zzc((zzamg<T>) t5, i7)) {
                if (zzg(object)) {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t5, zzc, zza2);
                } else {
                    unsafe.putObject(t5, zzc, object);
                }
                zzb((zzamg<T>) t5, i7);
                return;
            }
            Object object2 = unsafe.getObject(t5, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t5, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final boolean zza(T t5, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzc((zzamg<T>) t5, i7) : (i11 & i12) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i7, zzamv zzamvVar) {
        return zzamvVar.zze(zzanp.zze(obj, i7 & 1048575));
    }

    private static <T> float zzb(T t5, long j) {
        return ((Float) zzanp.zze(t5, j)).floatValue();
    }

    private final int zzb(int i7) {
        return this.zzc[i7 + 2];
    }

    private final void zzb(T t5, int i7) {
        int zzb2 = zzb(i7);
        long j = 1048575 & zzb2;
        if (j == 1048575) {
            return;
        }
        zzanp.zza((Object) t5, j, (1 << (zzb2 >>> 20)) | zzanp.zzc(t5, j));
    }

    private final void zzb(T t5, int i7, int i10) {
        zzanp.zza((Object) t5, zzb(i10) & 1048575, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t5, T t10, int i7) {
        int i10 = this.zzc[i7];
        if (zzc((zzamg<T>) t10, i10, i7)) {
            long zzc = zzc(i7) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + String.valueOf(t10));
            }
            zzamv zze = zze(i7);
            if (!zzc((zzamg<T>) t5, i10, i7)) {
                if (zzg(object)) {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t5, zzc, zza2);
                } else {
                    unsafe.putObject(t5, zzc, object);
                }
                zzb((zzamg<T>) t5, i10, i7);
                return;
            }
            Object object2 = unsafe.getObject(t5, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t5, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final int zzc(int i7) {
        return this.zzc[i7 + 1];
    }

    private static <T> int zzc(T t5, long j) {
        return ((Integer) zzanp.zze(t5, j)).intValue();
    }

    public static zzann zzc(Object obj) {
        zzaky zzakyVar = (zzaky) obj;
        zzann zzannVar = zzakyVar.zzb;
        if (zzannVar != zzann.zzc()) {
            return zzannVar;
        }
        zzann zzd = zzann.zzd();
        zzakyVar.zzb = zzd;
        return zzd;
    }

    private final boolean zzc(T t5, int i7) {
        int zzb2 = zzb(i7);
        long j = zzb2 & 1048575;
        if (j != 1048575) {
            return (zzanp.zzc(t5, j) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i7);
        long j10 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzanp.zza(t5, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanp.zzb(t5, j10)) != 0;
            case 2:
                return zzanp.zzd(t5, j10) != 0;
            case 3:
                return zzanp.zzd(t5, j10) != 0;
            case 4:
                return zzanp.zzc(t5, j10) != 0;
            case 5:
                return zzanp.zzd(t5, j10) != 0;
            case 6:
                return zzanp.zzc(t5, j10) != 0;
            case 7:
                return zzanp.zzh(t5, j10);
            case g.BYTES_FIELD_NUMBER /* 8 */:
                Object zze = zzanp.zze(t5, j10);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzajp) {
                    return !zzajp.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzanp.zze(t5, j10) != null;
            case 10:
                return !zzajp.zza.equals(zzanp.zze(t5, j10));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return zzanp.zzc(t5, j10) != 0;
            case 12:
                return zzanp.zzc(t5, j10) != 0;
            case 13:
                return zzanp.zzc(t5, j10) != 0;
            case 14:
                return zzanp.zzd(t5, j10) != 0;
            case 15:
                return zzanp.zzc(t5, j10) != 0;
            case 16:
                return zzanp.zzd(t5, j10) != 0;
            case 17:
                return zzanp.zze(t5, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzc(T t5, int i7, int i10) {
        return zzanp.zzc(t5, (long) (zzb(i10) & 1048575)) == i7;
    }

    private final boolean zzc(T t5, T t10, int i7) {
        return zzc((zzamg<T>) t5, i7) == zzc((zzamg<T>) t10, i7);
    }

    private static <T> long zzd(T t5, long j) {
        return ((Long) zzanp.zze(t5, j)).longValue();
    }

    private final zzald zzd(int i7) {
        return (zzald) this.zzd[((i7 / 3) << 1) + 1];
    }

    private final zzamv zze(int i7) {
        int i10 = (i7 / 3) << 1;
        zzamv zzamvVar = (zzamv) this.zzd[i10];
        if (zzamvVar != null) {
            return zzamvVar;
        }
        zzamv<T> zza2 = zzamr.zza().zza((Class) this.zzd[i10 + 1]);
        this.zzd[i10] = zza2;
        return zza2;
    }

    private static <T> boolean zze(T t5, long j) {
        return ((Boolean) zzanp.zze(t5, j)).booleanValue();
    }

    private final Object zzf(int i7) {
        return this.zzd[(i7 / 3) << 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(int i7) {
        return (i7 & 536870912) != 0;
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaky) {
            return ((zzaky) obj).zzu();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0058. Please report as an issue. */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zza(T t5) {
        int i7;
        int i10;
        int i11;
        int zza2;
        int zza3;
        int zza4;
        int zze;
        boolean z8;
        int zzc;
        int zzd;
        int zzi;
        int zzj;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < this.zzc.length) {
            int zzc2 = zzc(i15);
            int i17 = (267386880 & zzc2) >>> 20;
            int[] iArr = this.zzc;
            int i18 = iArr[i15];
            int i19 = iArr[i15 + 2];
            int i20 = i19 & i12;
            if (i17 <= 17) {
                if (i20 != i13) {
                    i14 = i20 == i12 ? 0 : unsafe.getInt(t5, i20);
                    i13 = i20;
                }
                i7 = i13;
                i10 = i14;
                i11 = 1 << (i19 >>> 20);
            } else {
                i7 = i13;
                i10 = i14;
                i11 = 0;
            }
            long j = zzc2 & i12;
            if (i17 >= zzaks.zza.zza()) {
                zzaks.zzb.zza();
            }
            switch (i17) {
                case 0:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza2 = zzakg.zza(i18, 0.0d);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza2 = zzakg.zza(i18, 0.0f);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza2 = zzakg.zzb(i18, unsafe.getLong(t5, j));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza2 = zzakg.zze(i18, unsafe.getLong(t5, j));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza2 = zzakg.zzd(i18, unsafe.getInt(t5, j));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza2 = zzakg.zza(i18, 0L);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza2 = zzakg.zzc(i18, 0);
                        i16 += zza2;
                        break;
                    }
                    break;
                case 7:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza3 = zzakg.zza(i18, true);
                        i16 += zza3;
                    }
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        Object object = unsafe.getObject(t5, j);
                        zza3 = object instanceof zzajp ? zzakg.zza(i18, (zzajp) object) : zzakg.zza(i18, (String) object);
                        i16 += zza3;
                    }
                    break;
                case 9:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza4 = zzamx.zza(i18, unsafe.getObject(t5, j), (zzamv<?>) zze(i15));
                        i16 += zza4;
                    }
                    break;
                case 10:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza3 = zzakg.zza(i18, (zzajp) unsafe.getObject(t5, j));
                        i16 += zza3;
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza3 = zzakg.zzg(i18, unsafe.getInt(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 12:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza3 = zzakg.zzb(i18, unsafe.getInt(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 13:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zze = zzakg.zze(i18, 0);
                        i16 += zze;
                    }
                    break;
                case 14:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza3 = zzakg.zzc(i18, 0L);
                        i16 += zza3;
                    }
                    break;
                case 15:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza3 = zzakg.zzf(i18, unsafe.getInt(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 16:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza3 = zzakg.zzd(i18, unsafe.getLong(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 17:
                    if (zza((zzamg<T>) t5, i15, i7, i10, i11)) {
                        zza3 = zzakg.zza(i18, (zzamc) unsafe.getObject(t5, j), zze(i15));
                        i16 += zza3;
                    }
                    break;
                case 18:
                    zza4 = zzamx.zzd(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zza4;
                    break;
                case 19:
                    z8 = false;
                    zzc = zzamx.zzc(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 20:
                    z8 = false;
                    zzc = zzamx.zzf(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 21:
                    z8 = false;
                    zzc = zzamx.zzj(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 22:
                    z8 = false;
                    zzc = zzamx.zze(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 23:
                    z8 = false;
                    zzc = zzamx.zzd(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 24:
                    z8 = false;
                    zzc = zzamx.zzc(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    z8 = false;
                    zzc = zzamx.zza(i18, (List<?>) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 26:
                    zza4 = zzamx.zzb(i18, (List) unsafe.getObject(t5, j));
                    i16 += zza4;
                    break;
                case 27:
                    zza4 = zzamx.zzb(i18, (List<?>) unsafe.getObject(t5, j), (zzamv<?>) zze(i15));
                    i16 += zza4;
                    break;
                case 28:
                    zza4 = zzamx.zza(i18, (List<zzajp>) unsafe.getObject(t5, j));
                    i16 += zza4;
                    break;
                case 29:
                    zza4 = zzamx.zzi(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zza4;
                    break;
                case 30:
                    z8 = false;
                    zzc = zzamx.zzb(i18, (List<Integer>) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 31:
                    z8 = false;
                    zzc = zzamx.zzc(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 32:
                    z8 = false;
                    zzc = zzamx.zzd(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 33:
                    z8 = false;
                    zzc = zzamx.zzg(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 34:
                    z8 = false;
                    zzc = zzamx.zzh(i18, (List) unsafe.getObject(t5, j), false);
                    i16 += zzc;
                    break;
                case 35:
                    zzd = zzamx.zzd((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 36:
                    zzd = zzamx.zzc((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 37:
                    zzd = zzamx.zzf((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 38:
                    zzd = zzamx.zzj((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 39:
                    zzd = zzamx.zze((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 40:
                    zzd = zzamx.zzd((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 41:
                    zzd = zzamx.zzc((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 42:
                    zzd = zzamx.zza((List<?>) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 43:
                    zzd = zzamx.zzi((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 44:
                    zzd = zzamx.zzb((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 45:
                    zzd = zzamx.zzc((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 46:
                    zzd = zzamx.zzd((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 47:
                    zzd = zzamx.zzg((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 48:
                    zzd = zzamx.zzh((List) unsafe.getObject(t5, j));
                    if (zzd > 0) {
                        zzi = zzakg.zzi(i18);
                        zzj = zzakg.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 49:
                    zza4 = zzamx.zza(i18, (List<zzamc>) unsafe.getObject(t5, j), (zzamv<?>) zze(i15));
                    i16 += zza4;
                    break;
                case 50:
                    zza4 = this.zzr.zza(i18, unsafe.getObject(t5, j), zzf(i15));
                    i16 += zza4;
                    break;
                case 51:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zza(i18, 0.0d);
                        i16 += zza3;
                    }
                    break;
                case 52:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zza(i18, 0.0f);
                        i16 += zza3;
                    }
                    break;
                case 53:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zzb(i18, zzd(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 54:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zze(i18, zzd(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 55:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zzd(i18, zzc(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 56:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zza(i18, 0L);
                        i16 += zza3;
                    }
                    break;
                case 57:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zze = zzakg.zzc(i18, 0);
                        i16 += zze;
                    }
                    break;
                case 58:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zza(i18, true);
                        i16 += zza3;
                    }
                    break;
                case 59:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        Object object2 = unsafe.getObject(t5, j);
                        zza3 = object2 instanceof zzajp ? zzakg.zza(i18, (zzajp) object2) : zzakg.zza(i18, (String) object2);
                        i16 += zza3;
                    }
                    break;
                case 60:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza4 = zzamx.zza(i18, unsafe.getObject(t5, j), (zzamv<?>) zze(i15));
                        i16 += zza4;
                    }
                    break;
                case 61:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zza(i18, (zzajp) unsafe.getObject(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 62:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zzg(i18, zzc(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 63:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zzb(i18, zzc(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 64:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zze = zzakg.zze(i18, 0);
                        i16 += zze;
                    }
                    break;
                case 65:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zzc(i18, 0L);
                        i16 += zza3;
                    }
                    break;
                case 66:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zzf(i18, zzc(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 67:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zzd(i18, zzd(t5, j));
                        i16 += zza3;
                    }
                    break;
                case 68:
                    if (zzc((zzamg<T>) t5, i18, i15)) {
                        zza3 = zzakg.zza(i18, (zzamc) unsafe.getObject(t5, j), zze(i15));
                        i16 += zza3;
                    }
                    break;
            }
            i15 += 3;
            i13 = i7;
            i14 = i10;
            i12 = 1048575;
        }
        int i21 = 0;
        zzano<?, ?> zzanoVar = this.zzp;
        int zza5 = i16 + zzanoVar.zza((zzano<?, ?>) zzanoVar.zzd(t5));
        if (!this.zzh) {
            return zza5;
        }
        zzakr<?> zza6 = this.zzq.zza(t5);
        int zza7 = zza6.zza.zza();
        for (int i22 = 0; i22 < zza7; i22++) {
            Map.Entry<?, Object> zza8 = zza6.zza.zza(i22);
            i21 += zzakr.zza((zzakt<?>) zza8.getKey(), zza8.getValue());
        }
        for (Map.Entry<?, Object> entry : zza6.zza.zzb()) {
            i21 += zzakr.zza((zzakt<?>) entry.getKey(), entry.getValue());
        }
        return zza5 + i21;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x09fc, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzalf.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d2a, code lost:
    
        if (r13 == r11) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d2c, code lost:
    
        r30.putInt(r15, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d32, code lost:
    
        r11 = r7.zzl;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d39, code lost:
    
        if (r11 >= r7.zzm) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d3b, code lost:
    
        r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzann) zza((java.lang.Object) r35, r7.zzk[r11], (int) r3, (com.google.android.gms.internal.p002firebaseauthapi.zzano<UT, int>) r7.zzp, (java.lang.Object) r35);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d51, code lost:
    
        if (r3 == null) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d53, code lost:
    
        r7.zzp.zzb((java.lang.Object) r15, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0d58, code lost:
    
        if (r10 != 0) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0d5a, code lost:
    
        if (r6 != r8) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d61, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzalf.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0d66, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d62, code lost:
    
        if (r6 > r8) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0d64, code lost:
    
        if (r9 != r10) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d6b, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzalf.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:203:0x039c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0a1c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:565:0x00a8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x08c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x08b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0d03 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x08c4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v56, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(T t5, byte[] bArr, int i7, int i10, int i11, zzajk zzajkVar) {
        int i12;
        Unsafe unsafe;
        int i13;
        zzamg<T> zzamgVar;
        int i14;
        int i15;
        int i16;
        int zza2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        zzajk zzajkVar2;
        zzajk zzajkVar3;
        Unsafe unsafe2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        zzajk zzajkVar4;
        Unsafe unsafe3;
        int i30;
        int i31;
        int i32;
        int i33;
        Unsafe unsafe4;
        zzajk zzajkVar5;
        zzajk zzajkVar6;
        int i34;
        int i35;
        int i36;
        Unsafe unsafe5;
        char c10;
        int zza3;
        int i37;
        Object obj;
        Unsafe unsafe6;
        char c11;
        int i38;
        int zza4;
        int i39;
        int i40;
        char c12;
        int zzc;
        int zzc2;
        Object obj2;
        int i41;
        int i42;
        Unsafe unsafe7;
        int i43;
        int zzd;
        int i44;
        int i45;
        int i46;
        zzamg<T> zzamgVar2 = this;
        T t10 = t5;
        byte[] bArr2 = bArr;
        int i47 = i10;
        zzajk zzajkVar7 = zzajkVar;
        zzf(t5);
        Unsafe unsafe8 = zzb;
        int i48 = -1;
        int i49 = i7;
        int i50 = -1;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int i54 = 1048575;
        while (true) {
            if (i49 < i47) {
                int i55 = i49 + 1;
                int i56 = bArr2[i49];
                if (i56 < 0) {
                    i16 = zzajl.zza(i56, bArr2, i55, zzajkVar7);
                    i56 = zzajkVar7.zza;
                } else {
                    i16 = i55;
                }
                int i57 = i56 >>> 3;
                int i58 = i56 & 7;
                if (i57 > i50) {
                    zza2 = (i57 < zzamgVar2.zze || i57 > zzamgVar2.zzf) ? i48 : zzamgVar2.zza(i57, i51 / 3);
                } else {
                    zza2 = zzamgVar2.zza(i57);
                }
                i51 = zza2;
                if (i51 == i48) {
                    i17 = i56;
                    i18 = i48;
                    unsafe = unsafe8;
                    i19 = i57;
                    i20 = i16;
                    i21 = i53;
                    i22 = i54;
                    i23 = 0;
                    i24 = i11;
                    zzajkVar2 = zzajkVar7;
                } else {
                    int[] iArr = zzamgVar2.zzc;
                    int i59 = iArr[i51 + 1];
                    int i60 = (i59 & 267386880) >>> 20;
                    int i61 = i56;
                    long j = i59 & 1048575;
                    if (i60 <= 17) {
                        int i62 = iArr[i51 + 2];
                        int i63 = 1 << (i62 >>> 20);
                        int i64 = i62 & 1048575;
                        if (i64 != i54) {
                            if (i54 != 1048575) {
                                unsafe8.putInt(t10, i54, i53);
                            }
                            i22 = i64;
                            i21 = i64 == 1048575 ? 0 : unsafe8.getInt(t10, i64);
                        } else {
                            i21 = i53;
                            i22 = i54;
                        }
                        switch (i60) {
                            case 0:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 1) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i65 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i65;
                                    break;
                                } else {
                                    zzanp.zza(t10, j, zzajl.zza(bArr2, i16));
                                    i49 = i16 + 8;
                                    i27 = i21 | i63;
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i26;
                                    unsafe8 = unsafe2;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i27;
                                    i48 = i18;
                                    break;
                                }
                            case 1:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 5) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i652 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i652;
                                    break;
                                } else {
                                    zzanp.zza((Object) t10, j, zzajl.zzb(bArr2, i16));
                                    i49 = i16 + 4;
                                    i27 = i21 | i63;
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i26;
                                    unsafe8 = unsafe2;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i27;
                                    i48 = i18;
                                    break;
                                }
                            case 2:
                            case 3:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 0) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i6522 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i6522;
                                    break;
                                } else {
                                    int zzd2 = zzajl.zzd(bArr2, i16, zzajkVar3);
                                    unsafe2.putLong(t5, j, zzajkVar3.zzb);
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    unsafe8 = unsafe2;
                                    i48 = -1;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i21 | i63;
                                    i49 = zzd2;
                                    i52 = i26;
                                    break;
                                }
                            case 4:
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 0) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i65222 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i65222;
                                    break;
                                } else {
                                    i49 = zzajl.zzc(bArr2, i16, zzajkVar3);
                                    unsafe2.putInt(t10, j, zzajkVar3.zza);
                                    i27 = i21 | i63;
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i26;
                                    unsafe8 = unsafe2;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i27;
                                    i48 = i18;
                                    break;
                                }
                            case 5:
                            case 14:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 1) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i652222 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i652222;
                                    break;
                                } else {
                                    unsafe2.putLong(t5, j, zzajl.zzd(bArr2, i16));
                                    i49 = i16 + 8;
                                    i27 = i21 | i63;
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i26;
                                    unsafe8 = unsafe2;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i27;
                                    i48 = i18;
                                    break;
                                }
                            case 6:
                            case 13:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 5) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i6522222 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i6522222;
                                    break;
                                } else {
                                    unsafe2.putInt(t10, j, zzajl.zzc(bArr2, i16));
                                    i49 = i16 + 4;
                                    i27 = i21 | i63;
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i26;
                                    unsafe8 = unsafe2;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i27;
                                    i48 = i18;
                                    break;
                                }
                            case 7:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 0) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i65222222 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i65222222;
                                    break;
                                } else {
                                    i49 = zzajl.zzd(bArr2, i16, zzajkVar3);
                                    zzanp.zzc(t10, j, zzajkVar3.zzb != 0);
                                    i27 = i21 | i63;
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i26;
                                    unsafe8 = unsafe2;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i27;
                                    i48 = i18;
                                    break;
                                }
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 2) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i652222222 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i652222222;
                                    break;
                                } else {
                                    if (zzg(i59)) {
                                        i49 = zzajl.zzb(bArr2, i16, zzajkVar3);
                                    } else {
                                        i49 = zzajl.zzc(bArr2, i16, zzajkVar3);
                                        int i66 = zzajkVar3.zza;
                                        if (i66 < 0) {
                                            throw zzalf.zzf();
                                        }
                                        if (i66 == 0) {
                                            zzajkVar3.zzc = "";
                                        } else {
                                            zzajkVar3.zzc = new String(bArr2, i49, i66, zzalb.zza);
                                            i49 += i66;
                                        }
                                    }
                                    unsafe2.putObject(t10, j, zzajkVar3.zzc);
                                    i27 = i21 | i63;
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i26;
                                    unsafe8 = unsafe2;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i27;
                                    i48 = i18;
                                    break;
                                }
                            case 9:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 2) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i6522222222 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i6522222222;
                                    break;
                                } else {
                                    Object zza5 = zzamgVar2.zza((zzamg<T>) t10, i51);
                                    i47 = i10;
                                    i49 = zzajl.zza(zza5, zzamgVar2.zze(i51), bArr, i16, i47, zzajkVar);
                                    zzamgVar2.zza((zzamg<T>) t10, i51, zza5);
                                    i27 = i21 | i63;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i26;
                                    unsafe8 = unsafe2;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i27;
                                    i48 = i18;
                                    break;
                                }
                            case 10:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 2) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i65222222222 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i65222222222;
                                    break;
                                } else {
                                    i49 = zzajl.zza(bArr2, i16, zzajkVar3);
                                    unsafe2.putObject(t10, j, zzajkVar3.zzc);
                                    i27 = i21 | i63;
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i26;
                                    unsafe8 = unsafe2;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i27;
                                    i48 = i18;
                                    break;
                                }
                            case 12:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 0) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i652222222222 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i652222222222;
                                    break;
                                } else {
                                    i49 = zzajl.zzc(bArr2, i16, zzajkVar3);
                                    int i67 = zzajkVar3.zza;
                                    zzald zzd3 = zzamgVar2.zzd(i51);
                                    if ((i59 & Integer.MIN_VALUE) != 0 && zzd3 != null && !zzd3.zza(i67)) {
                                        zzc(t5).zza(i26, Long.valueOf(i67));
                                        i47 = i10;
                                        zzajkVar7 = zzajkVar3;
                                        i52 = i26;
                                        unsafe8 = unsafe2;
                                        i48 = -1;
                                        i50 = i25;
                                        i53 = i21;
                                        i54 = i22;
                                        break;
                                    } else {
                                        unsafe2.putInt(t10, j, i67);
                                        i27 = i21 | i63;
                                        i47 = i10;
                                        zzajkVar7 = zzajkVar3;
                                        i52 = i26;
                                        unsafe8 = unsafe2;
                                        i50 = i25;
                                        i54 = i22;
                                        i53 = i27;
                                        i48 = i18;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                if (i58 != 0) {
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i6522222222222 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i6522222222222;
                                    break;
                                } else {
                                    i49 = zzajl.zzc(bArr2, i16, zzajkVar3);
                                    unsafe2.putInt(t10, j, zzakb.zze(zzajkVar3.zza));
                                    i27 = i21 | i63;
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i26;
                                    unsafe8 = unsafe2;
                                    i50 = i25;
                                    i54 = i22;
                                    i53 = i27;
                                    i48 = i18;
                                    break;
                                }
                            case 16:
                                zzajkVar3 = zzajkVar;
                                if (i58 != 0) {
                                    unsafe2 = unsafe8;
                                    i51 = i51;
                                    i25 = i57;
                                    i26 = i61;
                                    i18 = -1;
                                    i20 = i16;
                                    unsafe = unsafe2;
                                    i19 = i25;
                                    i24 = i11;
                                    i23 = i51;
                                    int i65222222222222 = i26;
                                    zzajkVar2 = zzajkVar3;
                                    i17 = i65222222222222;
                                    break;
                                } else {
                                    int zzd4 = zzajl.zzd(bArr2, i16, zzajkVar3);
                                    i51 = i51;
                                    unsafe8.putLong(t5, j, zzakb.zza(zzajkVar3.zzb));
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar3;
                                    i52 = i61;
                                    unsafe8 = unsafe8;
                                    i48 = -1;
                                    i50 = i57;
                                    i54 = i22;
                                    i53 = i21 | i63;
                                    i49 = zzd4;
                                    break;
                                }
                            case 17:
                                if (i58 == 3) {
                                    Object zza6 = zzamgVar2.zza((zzamg<T>) t10, i51);
                                    int zza7 = zzajl.zza(zza6, zzamgVar2.zze(i51), bArr, i16, i10, (i57 << 3) | 4, zzajkVar);
                                    zzamgVar2.zza((zzamg<T>) t10, i51, zza6);
                                    i53 = i21 | i63;
                                    i49 = zza7;
                                    i51 = i51;
                                    i50 = i57;
                                    i52 = i61;
                                    i54 = i22;
                                    i48 = -1;
                                    i47 = i10;
                                    zzajkVar7 = zzajkVar;
                                    break;
                                }
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                i20 = i16;
                                unsafe = unsafe2;
                                i19 = i25;
                                i24 = i11;
                                i23 = i51;
                                int i652222222222222 = i26;
                                zzajkVar2 = zzajkVar3;
                                i17 = i652222222222222;
                                break;
                            default:
                                unsafe2 = unsafe8;
                                i25 = i57;
                                i26 = i61;
                                i18 = -1;
                                zzajkVar3 = zzajkVar;
                                i20 = i16;
                                unsafe = unsafe2;
                                i19 = i25;
                                i24 = i11;
                                i23 = i51;
                                int i6522222222222222 = i26;
                                zzajkVar2 = zzajkVar3;
                                i17 = i6522222222222222;
                                break;
                        }
                    } else {
                        zzajk zzajkVar8 = zzajkVar7;
                        Unsafe unsafe9 = unsafe8;
                        int i68 = i61;
                        i18 = -1;
                        if (i60 != 27) {
                            i21 = i53;
                            i22 = i54;
                            if (i60 > 49) {
                                int i69 = i16;
                                int i70 = i51;
                                int i71 = i68;
                                zzajkVar4 = zzajkVar8;
                                if (i60 != 50) {
                                    unsafe = unsafe9;
                                    t10 = t5;
                                    Unsafe unsafe10 = zzb;
                                    long j10 = iArr[i70 + 2] & 1048575;
                                    switch (i60) {
                                        case 51:
                                            i24 = i11;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            i19 = i57;
                                            i23 = i70;
                                            if (i58 == 1) {
                                                unsafe10.putObject(t10, j, Double.valueOf(zzajl.zza(bArr2, i69)));
                                                i43 = i69 + 8;
                                                unsafe10.putInt(t10, j10, i19);
                                                i49 = i43;
                                                if (i49 != i69) {
                                                    int i72 = i19;
                                                    int i73 = i17;
                                                    bArr2 = bArr;
                                                    i47 = i10;
                                                    zzajkVar7 = zzajkVar;
                                                    i50 = i72;
                                                    i48 = -1;
                                                    i51 = i23;
                                                    i53 = i21;
                                                    i54 = i22;
                                                    unsafe8 = unsafe;
                                                    i52 = i73;
                                                    zzamgVar2 = this;
                                                    break;
                                                } else {
                                                    i20 = i49;
                                                    break;
                                                }
                                            }
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                        case 52:
                                            i24 = i11;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            i19 = i57;
                                            i23 = i70;
                                            if (i58 == 5) {
                                                unsafe10.putObject(t10, j, Float.valueOf(zzajl.zzb(bArr2, i69)));
                                                i43 = i69 + 4;
                                                unsafe10.putInt(t10, j10, i19);
                                                i49 = i43;
                                                if (i49 != i69) {
                                                }
                                            }
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i24 = i11;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            i19 = i57;
                                            i23 = i70;
                                            if (i58 == 0) {
                                                zzd = zzajl.zzd(bArr2, i69, zzajkVar2);
                                                unsafe10.putObject(t10, j, Long.valueOf(zzajkVar2.zzb));
                                                unsafe10.putInt(t10, j10, i19);
                                                i49 = zzd;
                                                if (i49 != i69) {
                                                }
                                            }
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i24 = i11;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            i19 = i57;
                                            i23 = i70;
                                            if (i58 == 0) {
                                                zzd = zzajl.zzc(bArr2, i69, zzajkVar2);
                                                unsafe10.putObject(t10, j, Integer.valueOf(zzajkVar2.zza));
                                                unsafe10.putInt(t10, j10, i19);
                                                i49 = zzd;
                                                if (i49 != i69) {
                                                }
                                            }
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i24 = i11;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            i19 = i57;
                                            i23 = i70;
                                            if (i58 == 1) {
                                                unsafe10.putObject(t10, j, Long.valueOf(zzajl.zzd(bArr2, i69)));
                                                i43 = i69 + 8;
                                                unsafe10.putInt(t10, j10, i19);
                                                i49 = i43;
                                                if (i49 != i69) {
                                                }
                                            }
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i24 = i11;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            i19 = i57;
                                            i23 = i70;
                                            if (i58 == 5) {
                                                unsafe10.putObject(t10, j, Integer.valueOf(zzajl.zzc(bArr2, i69)));
                                                i43 = i69 + 4;
                                                unsafe10.putInt(t10, j10, i19);
                                                i49 = i43;
                                                if (i49 != i69) {
                                                }
                                            }
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                        case 58:
                                            i24 = i11;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            i19 = i57;
                                            i23 = i70;
                                            if (i58 == 0) {
                                                zzd = zzajl.zzd(bArr2, i69, zzajkVar2);
                                                unsafe10.putObject(t10, j, Boolean.valueOf(zzajkVar2.zzb != 0));
                                                unsafe10.putInt(t10, j10, i19);
                                                i49 = zzd;
                                                if (i49 != i69) {
                                                }
                                            }
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                        case 59:
                                            i24 = i11;
                                            i17 = i71;
                                            i19 = i57;
                                            i23 = i70;
                                            zzajkVar2 = zzajkVar4;
                                            if (i58 == 2) {
                                                zzd = zzajl.zzc(bArr2, i69, zzajkVar2);
                                                int i74 = zzajkVar2.zza;
                                                if (i74 == 0) {
                                                    unsafe10.putObject(t10, j, "");
                                                } else {
                                                    if ((536870912 & i59) != 0 && !zzant.zzc(bArr2, zzd, zzd + i74)) {
                                                        throw zzalf.zzd();
                                                    }
                                                    unsafe10.putObject(t10, j, new String(bArr2, zzd, i74, zzalb.zza));
                                                    zzd += i74;
                                                }
                                                unsafe10.putInt(t10, j10, i19);
                                                i49 = zzd;
                                                if (i49 != i69) {
                                                }
                                            }
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                        case 60:
                                            i24 = i11;
                                            i44 = i70;
                                            i45 = i57;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            if (i58 == 2) {
                                                Object zza8 = zza((zzamg<T>) t10, i45, i44);
                                                i49 = zzajl.zza(zza8, zze(i44), bArr, i69, i10, zzajkVar);
                                                zza((zzamg<T>) t10, i45, i44, zza8);
                                                i19 = i45;
                                                i23 = i44;
                                                if (i49 != i69) {
                                                }
                                            } else {
                                                i23 = i44;
                                                i19 = i45;
                                                i49 = i69;
                                                if (i49 != i69) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            i24 = i11;
                                            i45 = i57;
                                            i17 = i71;
                                            i44 = i70;
                                            zzajkVar2 = zzajkVar4;
                                            if (i58 == 2) {
                                                int zza9 = zzajl.zza(bArr2, i69, zzajkVar2);
                                                unsafe10.putObject(t10, j, zzajkVar2.zzc);
                                                unsafe10.putInt(t10, j10, i45);
                                                i49 = zza9;
                                                i23 = i44;
                                                i19 = i45;
                                                if (i49 != i69) {
                                                }
                                            }
                                            i23 = i44;
                                            i19 = i45;
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                        case 63:
                                            i24 = i11;
                                            i46 = i70;
                                            i45 = i57;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            if (i58 == 0) {
                                                int zzc3 = zzajl.zzc(bArr2, i69, zzajkVar2);
                                                int i75 = zzajkVar2.zza;
                                                zzald zzd5 = zzd(i46);
                                                if (zzd5 == null || zzd5.zza(i75)) {
                                                    unsafe10.putObject(t10, j, Integer.valueOf(i75));
                                                    unsafe10.putInt(t10, j10, i45);
                                                } else {
                                                    zzc(t5).zza(i17, Long.valueOf(i75));
                                                }
                                                i49 = zzc3;
                                                i19 = i45;
                                                i23 = i46;
                                                if (i49 != i69) {
                                                }
                                            } else {
                                                i19 = i45;
                                                i23 = i46;
                                                i49 = i69;
                                                if (i49 != i69) {
                                                }
                                            }
                                            break;
                                        case 66:
                                            i24 = i11;
                                            i46 = i70;
                                            i45 = i57;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            if (i58 == 0) {
                                                int zzc4 = zzajl.zzc(bArr2, i69, zzajkVar2);
                                                unsafe10.putObject(t10, j, Integer.valueOf(zzakb.zze(zzajkVar2.zza)));
                                                unsafe10.putInt(t10, j10, i45);
                                                i49 = zzc4;
                                                i19 = i45;
                                                i23 = i46;
                                                if (i49 != i69) {
                                                }
                                            }
                                            i19 = i45;
                                            i23 = i46;
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                        case 67:
                                            i24 = i11;
                                            i45 = i57;
                                            i17 = i71;
                                            zzajkVar2 = zzajkVar4;
                                            i44 = i70;
                                            if (i58 == 0) {
                                                int zzd6 = zzajl.zzd(bArr2, i69, zzajkVar2);
                                                i46 = i44;
                                                unsafe10.putObject(t10, j, Long.valueOf(zzakb.zza(zzajkVar2.zzb)));
                                                unsafe10.putInt(t10, j10, i45);
                                                i49 = zzd6;
                                                i19 = i45;
                                                i23 = i46;
                                                if (i49 != i69) {
                                                }
                                            }
                                            i23 = i44;
                                            i19 = i45;
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                        case 68:
                                            if (i58 == 3) {
                                                Object zza10 = zza((zzamg<T>) t10, i57, i70);
                                                int zza11 = zzajl.zza(zza10, zze(i70), bArr, i69, i10, (i71 & (-8)) | 4, zzajkVar);
                                                zza((zzamg<T>) t10, i57, i70, zza10);
                                                i24 = i11;
                                                zzajkVar2 = zzajkVar;
                                                i23 = i70;
                                                i17 = i71;
                                                i19 = i57;
                                                i49 = zza11;
                                                if (i49 != i69) {
                                                }
                                            } else {
                                                i24 = i11;
                                                i19 = i57;
                                                i17 = i71;
                                                i23 = i70;
                                                zzajkVar2 = zzajkVar;
                                                i49 = i69;
                                                if (i49 != i69) {
                                                }
                                            }
                                            break;
                                        default:
                                            i24 = i11;
                                            i19 = i57;
                                            i17 = i71;
                                            i23 = i70;
                                            zzajkVar2 = zzajkVar4;
                                            i49 = i69;
                                            if (i49 != i69) {
                                            }
                                            break;
                                    }
                                } else if (i58 == 2) {
                                    Unsafe unsafe11 = zzb;
                                    Object zzf = zzamgVar2.zzf(i70);
                                    t10 = t5;
                                    Object object = unsafe11.getObject(t10, j);
                                    if (zzamgVar2.zzr.zzf(object)) {
                                        Object zzb2 = zzamgVar2.zzr.zzb(zzf);
                                        zzamgVar2.zzr.zza(zzb2, object);
                                        unsafe11.putObject(t10, j, zzb2);
                                        object = zzb2;
                                    }
                                    zzalx<?, ?> zza12 = zzamgVar2.zzr.zza(zzf);
                                    Map<?, ?> zze = zzamgVar2.zzr.zze(object);
                                    int zzc5 = zzajl.zzc(bArr2, i69, zzajkVar4);
                                    int i76 = zzajkVar4.zza;
                                    if (i76 >= 0 && i76 <= i10 - zzc5) {
                                        int i77 = zzc5 + i76;
                                        Object obj3 = zza12.zzb;
                                        Object obj4 = zza12.zzd;
                                        Object obj5 = obj3;
                                        while (zzc5 < i77) {
                                            int i78 = zzc5 + 1;
                                            byte b2 = bArr2[zzc5];
                                            if (b2 < 0) {
                                                i78 = zzajl.zza(b2, bArr2, i78, zzajkVar4);
                                                b2 = zzajkVar4.zza;
                                            }
                                            Unsafe unsafe12 = unsafe9;
                                            int i79 = b2 >>> 3;
                                            int i80 = i70;
                                            int i81 = b2 & 7;
                                            Object obj6 = obj4;
                                            if (i79 == 1) {
                                                obj2 = obj5;
                                                i41 = i71;
                                                i42 = i80;
                                                unsafe7 = unsafe12;
                                                if (i81 == zza12.zza.zza()) {
                                                    zzc5 = zza(bArr, i78, i10, zza12.zza, (Class<?>) null, zzajkVar);
                                                    obj5 = zzajkVar4.zzc;
                                                    obj4 = obj6;
                                                    i70 = i42;
                                                    i71 = i41;
                                                    unsafe9 = unsafe7;
                                                }
                                            } else if (i79 != 2) {
                                                obj4 = obj6;
                                                obj2 = obj5;
                                                i41 = i71;
                                                i42 = i80;
                                                unsafe7 = unsafe12;
                                                zzc5 = zzajl.zza(b2, bArr2, i78, i10, zzajkVar4);
                                                obj5 = obj2;
                                                i70 = i42;
                                                i71 = i41;
                                                unsafe9 = unsafe7;
                                            } else if (i81 == zza12.zzc.zza()) {
                                                i41 = i71;
                                                unsafe7 = unsafe12;
                                                i42 = i80;
                                                obj2 = obj5;
                                                zzc5 = zza(bArr, i78, i10, zza12.zzc, zza12.zzd.getClass(), zzajkVar);
                                                obj4 = zzajkVar4.zzc;
                                                obj5 = obj2;
                                                i70 = i42;
                                                i71 = i41;
                                                unsafe9 = unsafe7;
                                            } else {
                                                obj2 = obj5;
                                                i41 = i71;
                                                i42 = i80;
                                                unsafe7 = unsafe12;
                                            }
                                            obj4 = obj6;
                                            zzc5 = zzajl.zza(b2, bArr2, i78, i10, zzajkVar4);
                                            obj5 = obj2;
                                            i70 = i42;
                                            i71 = i41;
                                            unsafe9 = unsafe7;
                                        }
                                        unsafe = unsafe9;
                                        Object obj7 = obj5;
                                        i68 = i71;
                                        i28 = i70;
                                        if (zzc5 != i77) {
                                            throw zzalf.zzg();
                                        }
                                        zze.put(obj7, obj4);
                                        if (i77 == i69) {
                                            i24 = i11;
                                            i20 = i77;
                                            i19 = i57;
                                            i17 = i68;
                                            i23 = i28;
                                            zzajkVar2 = zzajkVar4;
                                        } else {
                                            zzamgVar2 = this;
                                            i49 = i77;
                                            zzajkVar7 = zzajkVar4;
                                            i51 = i28;
                                            i47 = i10;
                                            i48 = -1;
                                            i50 = i57;
                                            i52 = i68;
                                            i53 = i21;
                                            i54 = i22;
                                            unsafe8 = unsafe;
                                        }
                                    }
                                } else {
                                    unsafe = unsafe9;
                                    i68 = i71;
                                    i29 = i69;
                                    t10 = t5;
                                    i28 = i70;
                                }
                            } else {
                                long j11 = i59;
                                Unsafe unsafe13 = zzb;
                                zzalc zzalcVar = (zzalc) unsafe13.getObject(t10, j);
                                if (zzalcVar.zzc()) {
                                    unsafe3 = unsafe9;
                                } else {
                                    unsafe3 = unsafe9;
                                    zzalc zza13 = zzalcVar.zza(zzalcVar.size() << 1);
                                    unsafe13.putObject(t10, j, zza13);
                                    zzalcVar = zza13;
                                }
                                switch (i60) {
                                    case 18:
                                    case 35:
                                        i30 = i10;
                                        i31 = i16;
                                        i32 = i51;
                                        i33 = i68;
                                        unsafe4 = unsafe3;
                                        zzajkVar5 = zzajkVar8;
                                        if (i58 == 2) {
                                            zzaki zzakiVar = (zzaki) zzalcVar;
                                            i49 = zzajl.zzc(bArr2, i31, zzajkVar5);
                                            int i82 = zzajkVar5.zza;
                                            int i83 = i49 + i82;
                                            if (i83 > bArr2.length) {
                                                throw zzalf.zzj();
                                            }
                                            zzakiVar.zzc((i82 / 8) + zzakiVar.size());
                                            while (i49 < i83) {
                                                zzakiVar.zza(zzajl.zza(bArr2, i49));
                                                i49 += 8;
                                            }
                                            if (i49 != i83) {
                                                throw zzalf.zzj();
                                            }
                                        } else {
                                            if (i58 == 1) {
                                                zzaki zzakiVar2 = (zzaki) zzalcVar;
                                                zzakiVar2.zza(zzajl.zza(bArr2, i31));
                                                i49 = i31 + 8;
                                                while (i49 < i30) {
                                                    int zzc6 = zzajl.zzc(bArr2, i49, zzajkVar5);
                                                    if (i33 == zzajkVar5.zza) {
                                                        zzakiVar2.zza(zzajl.zza(bArr2, zzc6));
                                                        i49 = zzc6 + 8;
                                                    }
                                                }
                                            }
                                            i49 = i31;
                                        }
                                        if (i49 == i31) {
                                            t10 = t5;
                                            i47 = i30;
                                            zzajkVar7 = zzajkVar5;
                                            i52 = i33;
                                            i48 = -1;
                                            i53 = i21;
                                            i54 = i22;
                                            i51 = i32;
                                            unsafe8 = unsafe4;
                                            i50 = i57;
                                            break;
                                        } else {
                                            t10 = t5;
                                            i24 = i11;
                                            unsafe = unsafe4;
                                            i17 = i33;
                                            i19 = i57;
                                            i23 = i32;
                                            zzajkVar2 = zzajkVar5;
                                            i20 = i49;
                                            break;
                                        }
                                    case 19:
                                    case 36:
                                        i30 = i10;
                                        i31 = i16;
                                        i32 = i51;
                                        i33 = i68;
                                        unsafe4 = unsafe3;
                                        zzajkVar5 = zzajkVar8;
                                        if (i58 == 2) {
                                            zzakx zzakxVar = (zzakx) zzalcVar;
                                            i49 = zzajl.zzc(bArr2, i31, zzajkVar5);
                                            int i84 = zzajkVar5.zza;
                                            int i85 = i49 + i84;
                                            if (i85 > bArr2.length) {
                                                throw zzalf.zzj();
                                            }
                                            zzakxVar.zzc((i84 / 4) + zzakxVar.size());
                                            while (i49 < i85) {
                                                zzakxVar.zza(zzajl.zzb(bArr2, i49));
                                                i49 += 4;
                                            }
                                            if (i49 != i85) {
                                                throw zzalf.zzj();
                                            }
                                        } else {
                                            if (i58 == 5) {
                                                zzakx zzakxVar2 = (zzakx) zzalcVar;
                                                zzakxVar2.zza(zzajl.zzb(bArr2, i31));
                                                i49 = i31 + 4;
                                                while (i49 < i30) {
                                                    int zzc7 = zzajl.zzc(bArr2, i49, zzajkVar5);
                                                    if (i33 == zzajkVar5.zza) {
                                                        zzakxVar2.zza(zzajl.zzb(bArr2, zzc7));
                                                        i49 = zzc7 + 4;
                                                    }
                                                }
                                            }
                                            i49 = i31;
                                        }
                                        if (i49 == i31) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i30 = i10;
                                        i31 = i16;
                                        i32 = i51;
                                        i33 = i68;
                                        unsafe4 = unsafe3;
                                        zzajkVar5 = zzajkVar8;
                                        if (i58 == 2) {
                                            zzalr zzalrVar = (zzalr) zzalcVar;
                                            i49 = zzajl.zzc(bArr2, i31, zzajkVar5);
                                            int i86 = zzajkVar5.zza + i49;
                                            while (i49 < i86) {
                                                i49 = zzajl.zzd(bArr2, i49, zzajkVar5);
                                                zzalrVar.zza(zzajkVar5.zzb);
                                            }
                                            if (i49 != i86) {
                                                throw zzalf.zzj();
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                zzalr zzalrVar2 = (zzalr) zzalcVar;
                                                i49 = zzajl.zzd(bArr2, i31, zzajkVar5);
                                                zzalrVar2.zza(zzajkVar5.zzb);
                                                while (i49 < i30) {
                                                    int zzc8 = zzajl.zzc(bArr2, i49, zzajkVar5);
                                                    if (i33 == zzajkVar5.zza) {
                                                        i49 = zzajl.zzd(bArr2, zzc8, zzajkVar5);
                                                        zzalrVar2.zza(zzajkVar5.zzb);
                                                    }
                                                }
                                            }
                                            i49 = i31;
                                        }
                                        if (i49 == i31) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        zzajkVar6 = zzajkVar8;
                                        i34 = i10;
                                        i31 = i16;
                                        i35 = i51;
                                        i36 = i68;
                                        unsafe5 = unsafe3;
                                        c10 = 65535;
                                        if (i58 == 2) {
                                            zza3 = zzajl.zza(bArr2, i31, (zzalc<?>) zzalcVar, zzajkVar6);
                                            i33 = i36;
                                            zzajkVar5 = zzajkVar6;
                                            i30 = i34;
                                            i49 = zza3;
                                            unsafe4 = unsafe5;
                                            i32 = i35;
                                            if (i49 == i31) {
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                i33 = i36;
                                                zzajkVar5 = zzajkVar6;
                                                unsafe4 = unsafe5;
                                                i30 = i34;
                                                i49 = zzajl.zza(i36, bArr, i31, i10, (zzalc<?>) zzalcVar, zzajkVar);
                                                i32 = i35;
                                                if (i49 == i31) {
                                                }
                                            }
                                            i33 = i36;
                                            zzajkVar5 = zzajkVar6;
                                            unsafe4 = unsafe5;
                                            i30 = i34;
                                            i32 = i35;
                                            i49 = i31;
                                            if (i49 == i31) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        zzajkVar6 = zzajkVar8;
                                        i34 = i10;
                                        i31 = i16;
                                        i35 = i51;
                                        i36 = i68;
                                        unsafe5 = unsafe3;
                                        c10 = 65535;
                                        if (i58 == 2) {
                                            zzalr zzalrVar3 = (zzalr) zzalcVar;
                                            zza3 = zzajl.zzc(bArr2, i31, zzajkVar6);
                                            int i87 = zzajkVar6.zza;
                                            int i88 = zza3 + i87;
                                            if (i88 > bArr2.length) {
                                                throw zzalf.zzj();
                                            }
                                            zzalrVar3.zzc((i87 / 8) + zzalrVar3.size());
                                            while (zza3 < i88) {
                                                zzalrVar3.zza(zzajl.zzd(bArr2, zza3));
                                                zza3 += 8;
                                            }
                                            if (zza3 != i88) {
                                                throw zzalf.zzj();
                                            }
                                            i33 = i36;
                                            zzajkVar5 = zzajkVar6;
                                            i30 = i34;
                                            i49 = zza3;
                                            unsafe4 = unsafe5;
                                            i32 = i35;
                                            if (i49 == i31) {
                                            }
                                        } else {
                                            if (i58 == 1) {
                                                zzalr zzalrVar4 = (zzalr) zzalcVar;
                                                zzalrVar4.zza(zzajl.zzd(bArr2, i31));
                                                i37 = i31 + 8;
                                                while (i37 < i34) {
                                                    int zzc9 = zzajl.zzc(bArr2, i37, zzajkVar6);
                                                    if (i36 == zzajkVar6.zza) {
                                                        zzalrVar4.zza(zzajl.zzd(bArr2, zzc9));
                                                        i37 = zzc9 + 8;
                                                    } else {
                                                        i33 = i36;
                                                        unsafe4 = unsafe5;
                                                        i30 = i34;
                                                        i32 = i35;
                                                        i49 = i37;
                                                        zzajkVar5 = zzajkVar6;
                                                        if (i49 == i31) {
                                                        }
                                                    }
                                                }
                                                i33 = i36;
                                                unsafe4 = unsafe5;
                                                i30 = i34;
                                                i32 = i35;
                                                i49 = i37;
                                                zzajkVar5 = zzajkVar6;
                                                if (i49 == i31) {
                                                }
                                            }
                                            i33 = i36;
                                            zzajkVar5 = zzajkVar6;
                                            unsafe4 = unsafe5;
                                            i30 = i34;
                                            i32 = i35;
                                            i49 = i31;
                                            if (i49 == i31) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        zzajkVar6 = zzajkVar8;
                                        i34 = i10;
                                        i31 = i16;
                                        i35 = i51;
                                        i36 = i68;
                                        unsafe5 = unsafe3;
                                        c10 = 65535;
                                        if (i58 == 2) {
                                            zzakz zzakzVar = (zzakz) zzalcVar;
                                            zza3 = zzajl.zzc(bArr2, i31, zzajkVar6);
                                            int i89 = zzajkVar6.zza;
                                            int i90 = zza3 + i89;
                                            if (i90 > bArr2.length) {
                                                throw zzalf.zzj();
                                            }
                                            zzakzVar.zzd((i89 / 4) + zzakzVar.size());
                                            while (zza3 < i90) {
                                                zzakzVar.zzc(zzajl.zzc(bArr2, zza3));
                                                zza3 += 4;
                                            }
                                            if (zza3 != i90) {
                                                throw zzalf.zzj();
                                            }
                                            i33 = i36;
                                            zzajkVar5 = zzajkVar6;
                                            i30 = i34;
                                            i49 = zza3;
                                            unsafe4 = unsafe5;
                                            i32 = i35;
                                            if (i49 == i31) {
                                            }
                                        } else {
                                            if (i58 == 5) {
                                                zzakz zzakzVar2 = (zzakz) zzalcVar;
                                                zzakzVar2.zzc(zzajl.zzc(bArr2, i31));
                                                i37 = i31 + 4;
                                                while (i37 < i34) {
                                                    int zzc10 = zzajl.zzc(bArr2, i37, zzajkVar6);
                                                    if (i36 == zzajkVar6.zza) {
                                                        zzakzVar2.zzc(zzajl.zzc(bArr2, zzc10));
                                                        i37 = zzc10 + 4;
                                                    } else {
                                                        i33 = i36;
                                                        unsafe4 = unsafe5;
                                                        i30 = i34;
                                                        i32 = i35;
                                                        i49 = i37;
                                                        zzajkVar5 = zzajkVar6;
                                                        if (i49 == i31) {
                                                        }
                                                    }
                                                }
                                                i33 = i36;
                                                unsafe4 = unsafe5;
                                                i30 = i34;
                                                i32 = i35;
                                                i49 = i37;
                                                zzajkVar5 = zzajkVar6;
                                                if (i49 == i31) {
                                                }
                                            }
                                            i33 = i36;
                                            zzajkVar5 = zzajkVar6;
                                            unsafe4 = unsafe5;
                                            i30 = i34;
                                            i32 = i35;
                                            i49 = i31;
                                            if (i49 == i31) {
                                            }
                                        }
                                        break;
                                    case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                    case 42:
                                        zzajkVar6 = zzajkVar8;
                                        i34 = i10;
                                        i31 = i16;
                                        i35 = i51;
                                        i36 = i68;
                                        unsafe5 = unsafe3;
                                        c10 = 65535;
                                        if (i58 == 2) {
                                            zzajn zzajnVar = (zzajn) zzalcVar;
                                            zza3 = zzajl.zzc(bArr2, i31, zzajkVar6);
                                            int i91 = zzajkVar6.zza + zza3;
                                            while (zza3 < i91) {
                                                zza3 = zzajl.zzd(bArr2, zza3, zzajkVar6);
                                                zzajnVar.zza(zzajkVar6.zzb != 0);
                                            }
                                            if (zza3 != i91) {
                                                throw zzalf.zzj();
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                zzajn zzajnVar2 = (zzajn) zzalcVar;
                                                zza3 = zzajl.zzd(bArr2, i31, zzajkVar6);
                                                zzajnVar2.zza(zzajkVar6.zzb != 0);
                                                while (zza3 < i34) {
                                                    int zzc11 = zzajl.zzc(bArr2, zza3, zzajkVar6);
                                                    if (i36 == zzajkVar6.zza) {
                                                        zza3 = zzajl.zzd(bArr2, zzc11, zzajkVar6);
                                                        zzajnVar2.zza(zzajkVar6.zzb != 0);
                                                    }
                                                }
                                            }
                                            i33 = i36;
                                            zzajkVar5 = zzajkVar6;
                                            unsafe4 = unsafe5;
                                            i30 = i34;
                                            i32 = i35;
                                            i49 = i31;
                                            if (i49 == i31) {
                                            }
                                        }
                                        i33 = i36;
                                        zzajkVar5 = zzajkVar6;
                                        i30 = i34;
                                        i49 = zza3;
                                        unsafe4 = unsafe5;
                                        i32 = i35;
                                        if (i49 == i31) {
                                        }
                                        break;
                                    case 26:
                                        zzajkVar6 = zzajkVar8;
                                        i34 = i10;
                                        i31 = i16;
                                        i35 = i51;
                                        i36 = i68;
                                        unsafe5 = unsafe3;
                                        c10 = 65535;
                                        if (i58 == 2) {
                                            if ((j11 & 536870912) == 0) {
                                                zza3 = zzajl.zzc(bArr2, i31, zzajkVar6);
                                                int i92 = zzajkVar6.zza;
                                                if (i92 < 0) {
                                                    throw zzalf.zzf();
                                                }
                                                if (i92 == 0) {
                                                    obj = "";
                                                    zzalcVar.add(obj);
                                                } else {
                                                    obj = "";
                                                    zzalcVar.add(new String(bArr2, zza3, i92, zzalb.zza));
                                                    zza3 += i92;
                                                }
                                                while (zza3 < i34) {
                                                    int zzc12 = zzajl.zzc(bArr2, zza3, zzajkVar6);
                                                    if (i36 == zzajkVar6.zza) {
                                                        zza3 = zzajl.zzc(bArr2, zzc12, zzajkVar6);
                                                        int i93 = zzajkVar6.zza;
                                                        if (i93 < 0) {
                                                            throw zzalf.zzf();
                                                        }
                                                        if (i93 == 0) {
                                                            zzalcVar.add(obj);
                                                        } else {
                                                            zzalcVar.add(new String(bArr2, zza3, i93, zzalb.zza));
                                                            zza3 += i93;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zza3 = zzajl.zzc(bArr2, i31, zzajkVar6);
                                                int i94 = zzajkVar6.zza;
                                                if (i94 < 0) {
                                                    throw zzalf.zzf();
                                                }
                                                if (i94 == 0) {
                                                    zzalcVar.add("");
                                                } else {
                                                    int i95 = zza3 + i94;
                                                    if (!zzant.zzc(bArr2, zza3, i95)) {
                                                        throw zzalf.zzd();
                                                    }
                                                    zzalcVar.add(new String(bArr2, zza3, i94, zzalb.zza));
                                                    zza3 = i95;
                                                }
                                                while (zza3 < i34) {
                                                    int zzc13 = zzajl.zzc(bArr2, zza3, zzajkVar6);
                                                    if (i36 == zzajkVar6.zza) {
                                                        zza3 = zzajl.zzc(bArr2, zzc13, zzajkVar6);
                                                        int i96 = zzajkVar6.zza;
                                                        if (i96 < 0) {
                                                            throw zzalf.zzf();
                                                        }
                                                        if (i96 == 0) {
                                                            zzalcVar.add("");
                                                        } else {
                                                            int i97 = zza3 + i96;
                                                            if (!zzant.zzc(bArr2, zza3, i97)) {
                                                                throw zzalf.zzd();
                                                            }
                                                            zzalcVar.add(new String(bArr2, zza3, i96, zzalb.zza));
                                                            zza3 = i97;
                                                        }
                                                    }
                                                }
                                            }
                                            i33 = i36;
                                            zzajkVar5 = zzajkVar6;
                                            i30 = i34;
                                            i49 = zza3;
                                            unsafe4 = unsafe5;
                                            i32 = i35;
                                            if (i49 == i31) {
                                            }
                                        }
                                        i33 = i36;
                                        zzajkVar5 = zzajkVar6;
                                        unsafe4 = unsafe5;
                                        i30 = i34;
                                        i32 = i35;
                                        i49 = i31;
                                        if (i49 == i31) {
                                        }
                                        break;
                                    case 27:
                                        i30 = i10;
                                        i31 = i16;
                                        i35 = i51;
                                        i33 = i68;
                                        unsafe6 = unsafe3;
                                        c11 = 65535;
                                        zzajkVar5 = zzajkVar8;
                                        if (i58 == 2) {
                                            c10 = 65535;
                                            i34 = i30;
                                            unsafe5 = unsafe6;
                                            zzajkVar6 = zzajkVar5;
                                            i36 = i33;
                                            zza3 = zzajl.zzb(zzamgVar2.zze(i35), i33, bArr, i31, i10, zzalcVar, zzajkVar);
                                            i33 = i36;
                                            zzajkVar5 = zzajkVar6;
                                            i30 = i34;
                                            i49 = zza3;
                                            unsafe4 = unsafe5;
                                            i32 = i35;
                                            if (i49 == i31) {
                                            }
                                        }
                                        i32 = i35;
                                        unsafe4 = unsafe6;
                                        i49 = i31;
                                        if (i49 == i31) {
                                        }
                                        break;
                                    case 28:
                                        i30 = i10;
                                        i31 = i16;
                                        i35 = i51;
                                        i33 = i68;
                                        unsafe6 = unsafe3;
                                        c11 = 65535;
                                        zzajkVar5 = zzajkVar8;
                                        if (i58 == 2) {
                                            i49 = zzajl.zzc(bArr2, i31, zzajkVar5);
                                            int i98 = zzajkVar5.zza;
                                            if (i98 < 0) {
                                                throw zzalf.zzf();
                                            }
                                            if (i98 > bArr2.length - i49) {
                                                throw zzalf.zzj();
                                            }
                                            if (i98 == 0) {
                                                zzalcVar.add(zzajp.zza);
                                            } else {
                                                zzalcVar.add(zzajp.zza(bArr2, i49, i98));
                                                i49 += i98;
                                            }
                                            while (i49 < i30) {
                                                int zzc14 = zzajl.zzc(bArr2, i49, zzajkVar5);
                                                if (i33 == zzajkVar5.zza) {
                                                    i49 = zzajl.zzc(bArr2, zzc14, zzajkVar5);
                                                    int i99 = zzajkVar5.zza;
                                                    if (i99 < 0) {
                                                        throw zzalf.zzf();
                                                    }
                                                    if (i99 > bArr2.length - i49) {
                                                        throw zzalf.zzj();
                                                    }
                                                    if (i99 == 0) {
                                                        zzalcVar.add(zzajp.zza);
                                                    } else {
                                                        zzalcVar.add(zzajp.zza(bArr2, i49, i99));
                                                        i49 += i99;
                                                    }
                                                } else {
                                                    i32 = i35;
                                                    unsafe4 = unsafe6;
                                                    if (i49 == i31) {
                                                    }
                                                }
                                            }
                                            i32 = i35;
                                            unsafe4 = unsafe6;
                                            if (i49 == i31) {
                                            }
                                        }
                                        i32 = i35;
                                        unsafe4 = unsafe6;
                                        i49 = i31;
                                        if (i49 == i31) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        int i100 = i16;
                                        i33 = i68;
                                        if (i58 == 2) {
                                            zzajkVar5 = zzajkVar8;
                                            zza4 = zzajl.zza(bArr2, i100, (zzalc<?>) zzalcVar, zzajkVar8);
                                            i30 = i10;
                                            c11 = 65535;
                                            i38 = i51;
                                            i31 = i100;
                                            unsafe6 = unsafe3;
                                        } else if (i58 == 0) {
                                            zzajkVar5 = zzajkVar8;
                                            unsafe6 = unsafe3;
                                            i30 = i10;
                                            c11 = 65535;
                                            i38 = i51;
                                            i31 = i100;
                                            zza4 = zzajl.zza(i33, bArr, i100, i10, (zzalc<?>) zzalcVar, zzajkVar);
                                        } else {
                                            i31 = i100;
                                            zzajkVar5 = zzajkVar8;
                                            i30 = i10;
                                            i32 = i51;
                                            unsafe4 = unsafe3;
                                            i49 = i31;
                                            if (i49 == i31) {
                                            }
                                        }
                                        zzamx.zza(t5, i57, zzalcVar, zzamgVar2.zzd(i38), null, zzamgVar2.zzp);
                                        i32 = i38;
                                        i49 = zza4;
                                        unsafe4 = unsafe6;
                                        if (i49 == i31) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i39 = i16;
                                        i40 = i51;
                                        i33 = i68;
                                        c12 = 65535;
                                        if (i58 == 2) {
                                            zzakz zzakzVar3 = (zzakz) zzalcVar;
                                            zzc = zzajl.zzc(bArr2, i39, zzajkVar8);
                                            int i101 = zzajkVar8.zza + zzc;
                                            while (zzc < i101) {
                                                zzc = zzajl.zzc(bArr2, zzc, zzajkVar8);
                                                zzakzVar3.zzc(zzakb.zze(zzajkVar8.zza));
                                            }
                                            if (zzc != i101) {
                                                throw zzalf.zzj();
                                            }
                                        } else if (i58 == 0) {
                                            zzakz zzakzVar4 = (zzakz) zzalcVar;
                                            zzc = zzajl.zzc(bArr2, i39, zzajkVar8);
                                            zzakzVar4.zzc(zzakb.zze(zzajkVar8.zza));
                                            while (zzc < i10) {
                                                int zzc15 = zzajl.zzc(bArr2, zzc, zzajkVar8);
                                                if (i33 == zzajkVar8.zza) {
                                                    zzc = zzajl.zzc(bArr2, zzc15, zzajkVar8);
                                                    zzakzVar4.zzc(zzakb.zze(zzajkVar8.zza));
                                                }
                                            }
                                        } else {
                                            zzajkVar5 = zzajkVar8;
                                            i30 = i10;
                                            i32 = i40;
                                            i31 = i39;
                                            unsafe4 = unsafe3;
                                            i49 = i31;
                                            if (i49 == i31) {
                                            }
                                        }
                                        zzajkVar5 = zzajkVar8;
                                        i49 = zzc;
                                        i30 = i10;
                                        i32 = i40;
                                        i31 = i39;
                                        unsafe4 = unsafe3;
                                        if (i49 == i31) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i39 = i16;
                                        i40 = i51;
                                        c12 = 65535;
                                        if (i58 == 2) {
                                            zzalr zzalrVar5 = (zzalr) zzalcVar;
                                            zzc2 = zzajl.zzc(bArr2, i39, zzajkVar8);
                                            int i102 = zzajkVar8.zza + zzc2;
                                            while (zzc2 < i102) {
                                                zzc2 = zzajl.zzd(bArr2, zzc2, zzajkVar8);
                                                zzalrVar5.zza(zzakb.zza(zzajkVar8.zzb));
                                            }
                                            if (zzc2 != i102) {
                                                throw zzalf.zzj();
                                            }
                                            zzajkVar5 = zzajkVar8;
                                            i49 = zzc2;
                                            i30 = i10;
                                            i32 = i40;
                                            i31 = i39;
                                            i33 = i68;
                                            unsafe4 = unsafe3;
                                            if (i49 == i31) {
                                            }
                                        } else if (i58 == 0) {
                                            zzalr zzalrVar6 = (zzalr) zzalcVar;
                                            zzc = zzajl.zzd(bArr2, i39, zzajkVar8);
                                            zzalrVar6.zza(zzakb.zza(zzajkVar8.zzb));
                                            while (true) {
                                                if (zzc < i10) {
                                                    int zzc16 = zzajl.zzc(bArr2, zzc, zzajkVar8);
                                                    i33 = i68;
                                                    if (i33 == zzajkVar8.zza) {
                                                        zzc = zzajl.zzd(bArr2, zzc16, zzajkVar8);
                                                        zzalrVar6.zza(zzakb.zza(zzajkVar8.zzb));
                                                        i68 = i33;
                                                    }
                                                } else {
                                                    i33 = i68;
                                                }
                                            }
                                            zzajkVar5 = zzajkVar8;
                                            i49 = zzc;
                                            i30 = i10;
                                            i32 = i40;
                                            i31 = i39;
                                            unsafe4 = unsafe3;
                                            if (i49 == i31) {
                                            }
                                        } else {
                                            zzajkVar5 = zzajkVar8;
                                            i30 = i10;
                                            i32 = i40;
                                            i31 = i39;
                                            i33 = i68;
                                            unsafe4 = unsafe3;
                                            i49 = i31;
                                            if (i49 == i31) {
                                            }
                                        }
                                        break;
                                    case 49:
                                        if (i58 == 3) {
                                            i39 = i16;
                                            i40 = i51;
                                            c12 = 65535;
                                            zzc2 = zzajl.zza((zzamv<?>) zzamgVar2.zze(i51), i68, bArr, i16, i10, (zzalc<Object>) zzalcVar, zzajkVar);
                                            zzajkVar5 = zzajkVar8;
                                            i49 = zzc2;
                                            i30 = i10;
                                            i32 = i40;
                                            i31 = i39;
                                            i33 = i68;
                                            unsafe4 = unsafe3;
                                            if (i49 == i31) {
                                            }
                                        }
                                        break;
                                    default:
                                        i30 = i10;
                                        i31 = i16;
                                        i32 = i51;
                                        i33 = i68;
                                        unsafe4 = unsafe3;
                                        zzajkVar5 = zzajkVar8;
                                        i49 = i31;
                                        if (i49 == i31) {
                                        }
                                        break;
                                }
                            }
                        } else if (i58 == 2) {
                            zzalc zzalcVar2 = (zzalc) unsafe9.getObject(t10, j);
                            if (!zzalcVar2.zzc()) {
                                int size = zzalcVar2.size();
                                zzalcVar2 = zzalcVar2.zza(size == 0 ? 10 : size << 1);
                                unsafe9.putObject(t10, j, zzalcVar2);
                            }
                            zzajkVar7 = zzajkVar8;
                            i49 = zzajl.zzb(zzamgVar2.zze(i51), i68, bArr, i16, i10, zzalcVar2, zzajkVar);
                            i51 = i51;
                            i50 = i57;
                            i52 = i68;
                            i53 = i53;
                            i54 = i54;
                            i47 = i10;
                            unsafe8 = unsafe9;
                            i48 = i18;
                        } else {
                            i21 = i53;
                            i22 = i54;
                            unsafe = unsafe9;
                            i28 = i51;
                            i29 = i16;
                            zzajkVar4 = zzajkVar8;
                        }
                        i24 = i11;
                        i20 = i29;
                        i19 = i57;
                        i17 = i68;
                        i23 = i28;
                        zzajkVar2 = zzajkVar4;
                    }
                }
                if (i17 == i24 && i24 != 0) {
                    i13 = i10;
                    i15 = i20;
                    i52 = i17;
                    i12 = i24;
                    i53 = i21;
                    i54 = i22;
                    i14 = 1048575;
                    zzamgVar = this;
                } else if (!this.zzh || zzajkVar2.zzd == zzakk.zza) {
                    int i103 = i17;
                    int i104 = i19;
                    zzajkVar7 = zzajkVar;
                    i49 = zzajl.zza(i103, bArr, i20, i10, zzc(t5), zzajkVar7);
                    bArr2 = bArr;
                    i47 = i10;
                    i48 = i18;
                    i51 = i23;
                    i53 = i21;
                    i54 = i22;
                    unsafe8 = unsafe;
                    i52 = i103;
                    zzamgVar2 = this;
                    i50 = i104;
                } else {
                    int i105 = i17;
                    i49 = zzajl.zza(i17, bArr, i20, i10, t5, this.zzg, this.zzp, zzajkVar);
                    bArr2 = bArr;
                    i50 = i19;
                    i52 = i105;
                    i48 = i18;
                    i51 = i23;
                    i53 = i21;
                    i54 = i22;
                    unsafe8 = unsafe;
                    i47 = i10;
                    zzamgVar2 = this;
                    zzajkVar7 = zzajkVar;
                }
            } else {
                i12 = i11;
                unsafe = unsafe8;
                i13 = i47;
                zzamgVar = zzamgVar2;
                i14 = 1048575;
                i15 = i49;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00c0. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0630 A[Catch: all -> 0x00cb, TryCatch #7 {all -> 0x00cb, blocks: (B:14:0x00c5, B:48:0x00d3, B:19:0x062b, B:21:0x0630, B:22:0x0635, B:77:0x00ff, B:80:0x0114, B:82:0x0125, B:84:0x0136, B:86:0x0147, B:88:0x0158, B:90:0x0162, B:93:0x0169, B:94:0x016e, B:96:0x017b, B:98:0x018c, B:100:0x019a, B:102:0x01ac, B:104:0x01b4, B:106:0x01c6, B:108:0x01d8, B:110:0x01ea, B:112:0x01fc, B:114:0x020e, B:116:0x0220, B:118:0x0232, B:120:0x0244, B:122:0x0254, B:123:0x0275, B:124:0x025e, B:126:0x0266, B:128:0x0286, B:130:0x0298, B:132:0x02a6, B:134:0x02b4, B:136:0x02c2), top: B:13:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x063b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0665 A[LOOP:2: B:40:0x0661->B:42:0x0665, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0679  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzams] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t5, zzams zzamsVar, zzakk zzakkVar) {
        zzano zzanoVar;
        T t10;
        int i7;
        zzano zzanoVar2;
        T t11;
        zzakm<?> zzakmVar;
        zzakk zzakkVar2;
        Object obj;
        Object obj2;
        T t12 = t5;
        zzakk zzakkVar3 = zzakkVar;
        zzakkVar.getClass();
        zzf(t5);
        zzano zzanoVar3 = this.zzp;
        zzakm<?> zzakmVar2 = this.zzq;
        Object obj3 = null;
        zzakr<?> zzakrVar = null;
        while (true) {
            try {
                int zzc = zzamsVar.zzc();
                int zza2 = zza(zzc);
                if (zza2 >= 0) {
                    zzanoVar = zzanoVar3;
                    t10 = t12;
                    try {
                        int zzc2 = zzc(zza2);
                        switch ((267386880 & zzc2) >>> 20) {
                            case 0:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza(t10, zzc2 & 1048575, zzamsVar.zza());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 1:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzb());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 2:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzl());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 3:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzo());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 4:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzg());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 5:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzk());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 6:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzf());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 7:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zzc(t10, zzc2 & 1048575, zzamsVar.zzs());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zza((Object) t10, zzc2, (zzams) zzamsVar);
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 9:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamc zzamcVar = (zzamc) zza((zzamg<T>) t10, zza2);
                                zzamsVar.zzb(zzamcVar, zze(zza2), zzakkVar2);
                                zza((zzamg<T>) t10, zza2, zzamcVar);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 10:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza(t10, zzc2 & 1048575, zzamsVar.zzp());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzj());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 12:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                int zze = zzamsVar.zze();
                                zzald zzd = zzd(zza2);
                                if (zzd != null && !zzd.zza(zze)) {
                                    obj3 = zzamx.zza(t10, zzc, zze, obj2, zzanoVar);
                                    zzanoVar3 = zzanoVar;
                                    zzakmVar2 = zzakmVar;
                                    zzakkVar3 = zzakkVar2;
                                    t12 = t10;
                                    break;
                                }
                                zzanp.zza((Object) t10, zzc2 & 1048575, zze);
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 13:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzh());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 14:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzm());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 15:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzi());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 16:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzanp.zza((Object) t10, zzc2 & 1048575, zzamsVar.zzn());
                                zzb((zzamg<T>) t10, zza2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 17:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamc zzamcVar2 = (zzamc) zza((zzamg<T>) t10, zza2);
                                zzamsVar.zza(zzamcVar2, zze(zza2), zzakkVar2);
                                zza((zzamg<T>) t10, zza2, zzamcVar2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 18:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzc(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 19:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzg(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 20:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzi(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 21:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzq(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 22:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzh(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 23:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzf(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 24:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zze(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zza(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 26:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                if (zzg(zzc2)) {
                                    zzamsVar.zzo(this.zzo.zza(t10, zzc2 & 1048575));
                                } else {
                                    zzamsVar.zzn(this.zzo.zza(t10, zzc2 & 1048575));
                                }
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 27:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzb(this.zzo.zza(t10, zzc2 & 1048575), zze(zza2), zzakkVar2);
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 28:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzb(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 29:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzp(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 30:
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                List zza3 = this.zzo.zza(t10, zzc2 & 1048575);
                                zzamsVar.zzd(zza3);
                                obj3 = zzamx.zza(t5, zzc, zza3, zzd(zza2), obj3, zzanoVar);
                                zzanoVar3 = zzanoVar;
                                zzakmVar2 = zzakmVar;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                break;
                            case 31:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzj(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 32:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzk(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 33:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzl(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 34:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzm(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 35:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzc(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 36:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzg(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 37:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzi(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 38:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzq(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 39:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzh(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 40:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzf(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 41:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zze(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 42:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zza(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 43:
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamsVar.zzp(this.zzo.zza(t10, zzc2 & 1048575));
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 44:
                                List zza4 = this.zzo.zza(t10, zzc2 & 1048575);
                                zzamsVar.zzd(zza4);
                                obj = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                try {
                                    obj3 = zzamx.zza(t5, zzc, zza4, zzd(zza2), obj, zzanoVar);
                                } catch (zzale unused) {
                                    obj3 = obj;
                                    zzanoVar.zza((zzams) zzamsVar);
                                    if (obj3 == null) {
                                    }
                                    if (!zzanoVar.zza((zzano) obj3, (zzams) zzamsVar, 0)) {
                                    }
                                    zzanoVar3 = zzanoVar;
                                    zzakmVar2 = zzakmVar;
                                    zzakkVar3 = zzakkVar2;
                                    t12 = t10;
                                } catch (Throwable th) {
                                    th = th;
                                    obj3 = obj;
                                    while (i7 < this.zzm) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                zzanoVar3 = zzanoVar;
                                zzakmVar2 = zzakmVar;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                break;
                            case 45:
                                zzamsVar.zzj(this.zzo.zza(t10, zzc2 & 1048575));
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 46:
                                zzamsVar.zzk(this.zzo.zza(t10, zzc2 & 1048575));
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 47:
                                zzamsVar.zzl(this.zzo.zza(t10, zzc2 & 1048575));
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 48:
                                zzamsVar.zzm(this.zzo.zza(t10, zzc2 & 1048575));
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 49:
                                zzamsVar.zza(this.zzo.zza(t10, zzc2 & 1048575), zze(zza2), zzakkVar3);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 50:
                                Object zzf = zzf(zza2);
                                long zzc3 = zzc(zza2) & 1048575;
                                Object zze2 = zzanp.zze(t10, zzc3);
                                if (zze2 == null) {
                                    zze2 = this.zzr.zzb(zzf);
                                    zzanp.zza(t10, zzc3, zze2);
                                } else if (this.zzr.zzf(zze2)) {
                                    Object zzb2 = this.zzr.zzb(zzf);
                                    this.zzr.zza(zzb2, zze2);
                                    zzanp.zza(t10, zzc3, zzb2);
                                    zze2 = zzb2;
                                }
                                zzamsVar.zza(this.zzr.zze(zze2), this.zzr.zza(zzf), zzakkVar3);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 51:
                                zzanp.zza(t10, zzc2 & 1048575, Double.valueOf(zzamsVar.zza()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 52:
                                zzanp.zza(t10, zzc2 & 1048575, Float.valueOf(zzamsVar.zzb()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 53:
                                zzanp.zza(t10, zzc2 & 1048575, Long.valueOf(zzamsVar.zzl()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 54:
                                zzanp.zza(t10, zzc2 & 1048575, Long.valueOf(zzamsVar.zzo()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 55:
                                zzanp.zza(t10, zzc2 & 1048575, Integer.valueOf(zzamsVar.zzg()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 56:
                                zzanp.zza(t10, zzc2 & 1048575, Long.valueOf(zzamsVar.zzk()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 57:
                                zzanp.zza(t10, zzc2 & 1048575, Integer.valueOf(zzamsVar.zzf()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 58:
                                zzanp.zza(t10, zzc2 & 1048575, Boolean.valueOf(zzamsVar.zzs()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 59:
                                zza((Object) t10, zzc2, (zzams) zzamsVar);
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 60:
                                zzamc zzamcVar3 = (zzamc) zza((zzamg<T>) t10, zzc, zza2);
                                zzamsVar.zzb(zzamcVar3, zze(zza2), zzakkVar3);
                                zza((zzamg<T>) t10, zzc, zza2, zzamcVar3);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 61:
                                zzanp.zza(t10, zzc2 & 1048575, zzamsVar.zzp());
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 62:
                                zzanp.zza(t10, zzc2 & 1048575, Integer.valueOf(zzamsVar.zzj()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 63:
                                int zze3 = zzamsVar.zze();
                                zzald zzd2 = zzd(zza2);
                                if (zzd2 != null && !zzd2.zza(zze3)) {
                                    obj3 = zzamx.zza(t10, zzc, zze3, obj3, zzanoVar);
                                    t12 = t10;
                                    zzanoVar3 = zzanoVar;
                                    break;
                                }
                                zzanp.zza(t10, zzc2 & 1048575, Integer.valueOf(zze3));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 64:
                                zzanp.zza(t10, zzc2 & 1048575, Integer.valueOf(zzamsVar.zzh()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 65:
                                zzanp.zza(t10, zzc2 & 1048575, Long.valueOf(zzamsVar.zzm()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 66:
                                zzanp.zza(t10, zzc2 & 1048575, Integer.valueOf(zzamsVar.zzi()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 67:
                                zzanp.zza(t10, zzc2 & 1048575, Long.valueOf(zzamsVar.zzn()));
                                zzb((zzamg<T>) t10, zzc, zza2);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            case 68:
                                zzamc zzamcVar4 = (zzamc) zza((zzamg<T>) t10, zzc, zza2);
                                zzamsVar.zza(zzamcVar4, zze(zza2), zzakkVar3);
                                zza((zzamg<T>) t10, zzc, zza2, zzamcVar4);
                                obj2 = obj3;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzakmVar2 = zzakmVar;
                                obj3 = obj2;
                                zzakkVar3 = zzakkVar2;
                                t12 = t10;
                                zzanoVar3 = zzanoVar;
                                break;
                            default:
                                if (obj3 == null) {
                                    try {
                                        try {
                                            obj3 = zzanoVar.zzc(t10);
                                        } catch (zzale unused2) {
                                            obj = obj3;
                                            zzakmVar = zzakmVar2;
                                            zzakkVar2 = zzakkVar3;
                                            obj3 = obj;
                                            zzanoVar.zza((zzams) zzamsVar);
                                            if (obj3 == null) {
                                                obj3 = zzanoVar.zzc(t10);
                                            }
                                            if (!zzanoVar.zza((zzano) obj3, (zzams) zzamsVar, 0)) {
                                                for (int i10 = this.zzl; i10 < this.zzm; i10++) {
                                                    obj3 = zza((Object) t5, this.zzk[i10], (int) obj3, (zzano<UT, int>) zzanoVar, (Object) t5);
                                                }
                                                if (obj3 != null) {
                                                    zzanoVar.zzb((Object) t10, (T) obj3);
                                                    return;
                                                }
                                                return;
                                            }
                                            zzanoVar3 = zzanoVar;
                                            zzakmVar2 = zzakmVar;
                                            zzakkVar3 = zzakkVar2;
                                            t12 = t10;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        while (i7 < this.zzm) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                try {
                                    if (!zzanoVar.zza((zzano) obj3, (zzams) zzamsVar, 0)) {
                                        for (int i11 = this.zzl; i11 < this.zzm; i11++) {
                                            obj3 = zza((Object) t5, this.zzk[i11], (int) obj3, (zzano<UT, int>) zzanoVar, (Object) t5);
                                        }
                                        if (obj3 != null) {
                                            zzanoVar.zzb((Object) t10, (T) obj3);
                                            return;
                                        }
                                        return;
                                    }
                                    t12 = t10;
                                    zzanoVar3 = zzanoVar;
                                } catch (zzale unused3) {
                                    zzakmVar = zzakmVar2;
                                    zzakkVar2 = zzakkVar3;
                                    zzanoVar.zza((zzams) zzamsVar);
                                    if (obj3 == null) {
                                    }
                                    if (!zzanoVar.zza((zzano) obj3, (zzams) zzamsVar, 0)) {
                                    }
                                    zzanoVar3 = zzanoVar;
                                    zzakmVar2 = zzakmVar;
                                    zzakkVar3 = zzakkVar2;
                                    t12 = t10;
                                }
                                break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        for (i7 = this.zzl; i7 < this.zzm; i7++) {
                            obj3 = zza((Object) t5, this.zzk[i7], (int) obj3, (zzano<UT, int>) zzanoVar, (Object) t5);
                        }
                        if (obj3 != null) {
                            zzanoVar.zzb((Object) t10, (T) obj3);
                        }
                        throw th;
                    }
                } else {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i12 = this.zzl; i12 < this.zzm; i12++) {
                            obj3 = zza((Object) t5, this.zzk[i12], (int) obj3, (zzano<UT, int>) zzanoVar3, (Object) t5);
                        }
                        if (obj3 != null) {
                            zzanoVar3.zzb((Object) t12, (T) obj3);
                            return;
                        }
                        return;
                    }
                    try {
                        Object zza5 = !this.zzh ? null : zzakmVar2.zza(zzakkVar3, this.zzg, zzc);
                        if (zza5 != null) {
                            zzakr<?> zzb3 = zzakrVar == null ? zzakmVar2.zzb(t12) : zzakrVar;
                            zzanoVar2 = zzanoVar3;
                            t11 = t12;
                            try {
                                obj3 = zzakmVar2.zza(t5, zzamsVar, zza5, zzakkVar, zzb3, obj3, zzanoVar2);
                                zzakrVar = zzb3;
                            } catch (Throwable th4) {
                                th = th4;
                                t10 = t11;
                                zzanoVar = zzanoVar2;
                                while (i7 < this.zzm) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                        } else {
                            zzanoVar2 = zzanoVar3;
                            t11 = t12;
                            zzanoVar2.zza((zzams) zzamsVar);
                            if (obj3 == null) {
                                obj3 = zzanoVar2.zzc(t11);
                            }
                            if (!zzanoVar2.zza((zzano) obj3, (zzams) zzamsVar, 0)) {
                                int i13 = this.zzl;
                                while (i13 < this.zzm) {
                                    zzano zzanoVar4 = zzanoVar2;
                                    obj3 = zza((Object) t5, this.zzk[i13], (int) obj3, (zzano<UT, int>) zzanoVar4, (Object) t5);
                                    i13++;
                                    t11 = t11;
                                    zzanoVar2 = zzanoVar4;
                                }
                                Object obj4 = t11;
                                zzano zzanoVar5 = zzanoVar2;
                                if (obj3 != null) {
                                    zzanoVar5.zzb(obj4, obj3);
                                    return;
                                }
                                return;
                            }
                        }
                        t12 = t11;
                        zzanoVar3 = zzanoVar2;
                    } catch (Throwable th5) {
                        th = th5;
                        zzanoVar = zzanoVar3;
                        t10 = t12;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                zzanoVar = zzanoVar3;
                t10 = t12;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:320:0x05b5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b90  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t5, zzaof zzaofVar) {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i7;
        Iterator<Map.Entry<?, Object>> it2;
        int i10;
        Map.Entry<?, ?> entry2;
        int i11;
        int i12;
        int i13;
        Map.Entry<?, ?> entry3;
        int i14;
        boolean z8;
        int i15;
        Unsafe unsafe;
        boolean z10;
        Iterator<Map.Entry<?, Object>> it3;
        Map.Entry<?, ?> entry4;
        int length2;
        zzaof zzaofVar2 = zzaofVar;
        int i16 = 267386880;
        int i17 = 1048575;
        if (zzaofVar.zza() == 2) {
            zza(this.zzp, t5, zzaofVar2);
            if (this.zzh) {
                zzakr<?> zza2 = this.zzq.zza(t5);
                if (!zza2.zza.isEmpty()) {
                    it3 = zza2.zzc();
                    entry4 = (Map.Entry) it3.next();
                    for (length2 = this.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzc = zzc(length2);
                        int i18 = this.zzc[length2];
                        while (entry4 != null && this.zzq.zza(entry4) > i18) {
                            this.zzq.zza(zzaofVar2, entry4);
                            entry4 = it3.hasNext() ? (Map.Entry) it3.next() : null;
                        }
                        switch ((zzc & 267386880) >>> 20) {
                            case 0:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zza(i18, zzanp.zza(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zza(i18, zzanp.zzb(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zzb(i18, zzanp.zzd(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zze(i18, zzanp.zzd(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zzc(i18, zzanp.zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zza(i18, zzanp.zzd(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zzb(i18, zzanp.zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zza(i18, zzanp.zzh(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zza(i18, zzanp.zze(t5, zzc & 1048575), zzaofVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zzb(i18, zzanp.zze(t5, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zza(i18, (zzajp) zzanp.zze(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zzf(i18, zzanp.zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zza(i18, zzanp.zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zzd(i18, zzanp.zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zzc(i18, zzanp.zzd(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zze(i18, zzanp.zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zzd(i18, zzanp.zzd(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zzc((zzamg<T>) t5, length2)) {
                                    zzaofVar2.zza(i18, zzanp.zze(t5, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzamx.zzb(this.zzc[length2], (List<Double>) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 19:
                                zzamx.zzf(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 20:
                                zzamx.zzh(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 21:
                                zzamx.zzn(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 22:
                                zzamx.zzg(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 23:
                                zzamx.zze(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 24:
                                zzamx.zzd(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                zzamx.zza(this.zzc[length2], (List<Boolean>) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 26:
                                zzamx.zzb(this.zzc[length2], (List<String>) zzanp.zze(t5, zzc & 1048575), zzaofVar2);
                                break;
                            case 27:
                                zzamx.zzb(this.zzc[length2], (List<?>) zzanp.zze(t5, zzc & 1048575), zzaofVar2, (zzamv<?>) zze(length2));
                                break;
                            case 28:
                                zzamx.zza(this.zzc[length2], (List<zzajp>) zzanp.zze(t5, zzc & 1048575), zzaofVar2);
                                break;
                            case 29:
                                zzamx.zzm(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 30:
                                zzamx.zzc(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 31:
                                zzamx.zzi(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 32:
                                zzamx.zzj(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 33:
                                zzamx.zzk(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 34:
                                zzamx.zzl(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, false);
                                break;
                            case 35:
                                zzamx.zzb(this.zzc[length2], (List<Double>) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 36:
                                zzamx.zzf(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 37:
                                zzamx.zzh(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 38:
                                zzamx.zzn(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 39:
                                zzamx.zzg(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 40:
                                zzamx.zze(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 41:
                                zzamx.zzd(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 42:
                                zzamx.zza(this.zzc[length2], (List<Boolean>) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 43:
                                zzamx.zzm(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 44:
                                zzamx.zzc(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 45:
                                zzamx.zzi(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 46:
                                zzamx.zzj(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 47:
                                zzamx.zzk(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 48:
                                zzamx.zzl(this.zzc[length2], (List) zzanp.zze(t5, zzc & 1048575), zzaofVar2, true);
                                break;
                            case 49:
                                zzamx.zza(this.zzc[length2], (List<?>) zzanp.zze(t5, zzc & 1048575), zzaofVar2, (zzamv<?>) zze(length2));
                                break;
                            case 50:
                                zza(zzaofVar2, i18, zzanp.zze(t5, zzc & 1048575), length2);
                                break;
                            case 51:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zza(i18, zza(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zza(i18, zzb(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zzb(i18, zzd(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zze(i18, zzd(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zzc(i18, zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zza(i18, zzd(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zzb(i18, zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zza(i18, zze(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zza(i18, zzanp.zze(t5, zzc & 1048575), zzaofVar2);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zzb(i18, zzanp.zze(t5, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zza(i18, (zzajp) zzanp.zze(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zzf(i18, zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zza(i18, zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zzd(i18, zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zzc(i18, zzd(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zze(i18, zzc(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zzd(i18, zzd(t5, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zzc((zzamg<T>) t5, i18, length2)) {
                                    zzaofVar2.zza(i18, zzanp.zze(t5, zzc & 1048575), zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry4 != null) {
                        this.zzq.zza(zzaofVar2, entry4);
                        entry4 = it3.hasNext() ? (Map.Entry) it3.next() : null;
                    }
                    return;
                }
            }
            it3 = null;
            entry4 = null;
            while (length2 >= 0) {
            }
            while (entry4 != null) {
            }
            return;
        }
        if (this.zzh) {
            zzakr<?> zza3 = this.zzq.zza(t5);
            if (!zza3.zza.isEmpty()) {
                Iterator<Map.Entry<?, Object>> zzd = zza3.zzd();
                entry = (Map.Entry) zzd.next();
                it = zzd;
                length = this.zzc.length;
                Unsafe unsafe2 = zzb;
                int i19 = 0;
                i7 = 0;
                int i20 = 1048575;
                while (i7 < length) {
                    int zzc2 = zzc(i7);
                    int[] iArr = this.zzc;
                    int i21 = iArr[i7];
                    int i22 = (zzc2 & i16) >>> 20;
                    if (i22 <= 17) {
                        int i23 = iArr[i7 + 2];
                        int i24 = i23 & i17;
                        if (i24 != i20) {
                            if (i24 == i17) {
                                it2 = it;
                                i19 = 0;
                            } else {
                                it2 = it;
                                i19 = unsafe2.getInt(t5, i24);
                            }
                            i20 = i24;
                        } else {
                            it2 = it;
                        }
                        entry2 = entry;
                        i11 = i19;
                        i12 = 1 << (i23 >>> 20);
                        i10 = i20;
                    } else {
                        it2 = it;
                        i10 = i20;
                        entry2 = entry;
                        i11 = i19;
                        i12 = 0;
                    }
                    while (entry2 != null && this.zzq.zza(entry2) <= i21) {
                        this.zzq.zza(zzaofVar2, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    long j = zzc2 & 1048575;
                    switch (i22) {
                        case 0:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zza(i21, zzanp.zza(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zza(i21, zzanp.zzb(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zzb(i21, unsafe.getLong(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zze(i21, unsafe.getLong(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zzc(i21, unsafe.getInt(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zza(i21, unsafe.getLong(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zzb(i21, unsafe.getInt(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zza(i21, zzanp.zzh(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case g.BYTES_FIELD_NUMBER /* 8 */:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zza(i21, unsafe.getObject(t5, j), zzaofVar2);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zzb(i21, unsafe.getObject(t5, j), zze(i15));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zza(i21, (zzajp) unsafe.getObject(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zzf(i21, unsafe.getInt(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zza(i21, unsafe.getInt(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zzd(i21, unsafe.getInt(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zzc(i21, unsafe.getLong(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i15, i13, i11, i12)) {
                                zzaofVar2.zze(i21, unsafe.getInt(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            i13 = i10;
                            if (zza((zzamg<T>) t5, i15, i10, i11, i12)) {
                                zzaofVar2.zzd(i21, unsafe.getLong(t5, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            z8 = false;
                            entry3 = entry2;
                            i15 = i7;
                            i14 = length;
                            unsafe = unsafe2;
                            if (zza((zzamg<T>) t5, i7, i10, i11, i12)) {
                                zzaofVar2 = zzaofVar;
                                zzaofVar2.zza(i21, unsafe.getObject(t5, j), zze(i15));
                            } else {
                                zzaofVar2 = zzaofVar;
                            }
                            i13 = i10;
                            break;
                        case 18:
                            z10 = false;
                            zzamx.zzb(this.zzc[i7], (List<Double>) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 19:
                            z10 = false;
                            zzamx.zzf(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 20:
                            z10 = false;
                            zzamx.zzh(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 21:
                            z10 = false;
                            zzamx.zzn(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 22:
                            z10 = false;
                            zzamx.zzg(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 23:
                            z10 = false;
                            zzamx.zze(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 24:
                            z10 = false;
                            zzamx.zzd(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case BlurFactor.DEFAULT_RADIUS /* 25 */:
                            z10 = false;
                            zzamx.zza(this.zzc[i7], (List<Boolean>) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 26:
                            zzamx.zzb(this.zzc[i7], (List<String>) unsafe2.getObject(t5, j), zzaofVar2);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 27:
                            zzamx.zzb(this.zzc[i7], (List<?>) unsafe2.getObject(t5, j), zzaofVar2, (zzamv<?>) zze(i7));
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 28:
                            zzamx.zza(this.zzc[i7], (List<zzajp>) unsafe2.getObject(t5, j), zzaofVar2);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 29:
                            z10 = false;
                            zzamx.zzm(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 30:
                            z10 = false;
                            zzamx.zzc(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 31:
                            z10 = false;
                            zzamx.zzi(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 32:
                            z10 = false;
                            zzamx.zzj(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 33:
                            z10 = false;
                            zzamx.zzk(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 34:
                            z10 = false;
                            zzamx.zzl(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, false);
                            i13 = i10;
                            entry3 = entry2;
                            z8 = z10;
                            i14 = length;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 35:
                            zzamx.zzb(this.zzc[i7], (List<Double>) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 36:
                            zzamx.zzf(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 37:
                            zzamx.zzh(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 38:
                            zzamx.zzn(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 39:
                            zzamx.zzg(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 40:
                            zzamx.zze(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 41:
                            zzamx.zzd(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 42:
                            zzamx.zza(this.zzc[i7], (List<Boolean>) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 43:
                            zzamx.zzm(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 44:
                            zzamx.zzc(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 45:
                            zzamx.zzi(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 46:
                            zzamx.zzj(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 47:
                            zzamx.zzk(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 48:
                            zzamx.zzl(this.zzc[i7], (List) unsafe2.getObject(t5, j), zzaofVar2, true);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 49:
                            zzamx.zza(this.zzc[i7], (List<?>) unsafe2.getObject(t5, j), zzaofVar2, (zzamv<?>) zze(i7));
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 50:
                            zza(zzaofVar2, i21, unsafe2.getObject(t5, j), i7);
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 51:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zza(i21, zza(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 52:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zza(i21, zzb(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 53:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zzb(i21, zzd(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 54:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zze(i21, zzd(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 55:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zzc(i21, zzc(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 56:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zza(i21, zzd(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 57:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zzb(i21, zzc(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 58:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zza(i21, zze(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 59:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zza(i21, unsafe2.getObject(t5, j), zzaofVar2);
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 60:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zzb(i21, unsafe2.getObject(t5, j), zze(i7));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 61:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zza(i21, (zzajp) unsafe2.getObject(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 62:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zzf(i21, zzc(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 63:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zza(i21, zzc(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 64:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zzd(i21, zzc(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 65:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zzc(i21, zzd(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 66:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zze(i21, zzc(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 67:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zzd(i21, zzd(t5, j));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        case 68:
                            if (zzc((zzamg<T>) t5, i21, i7)) {
                                zzaofVar2.zza(i21, unsafe2.getObject(t5, j), zze(i7));
                            }
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                        default:
                            i13 = i10;
                            entry3 = entry2;
                            i14 = length;
                            z8 = false;
                            i15 = i7;
                            unsafe = unsafe2;
                            break;
                    }
                    i7 = i15 + 3;
                    i19 = i11;
                    unsafe2 = unsafe;
                    i17 = 1048575;
                    it = it2;
                    entry = entry3;
                    length = i14;
                    i20 = i13;
                    i16 = 267386880;
                }
                Iterator<Map.Entry<?, Object>> it4 = it;
                while (entry != null) {
                    this.zzq.zza(zzaofVar2, entry);
                    entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
                }
                zza(this.zzp, t5, zzaofVar2);
            }
        }
        entry = null;
        it = null;
        length = this.zzc.length;
        Unsafe unsafe22 = zzb;
        int i192 = 0;
        i7 = 0;
        int i202 = 1048575;
        while (i7 < length) {
        }
        Iterator<Map.Entry<?, Object>> it42 = it;
        while (entry != null) {
        }
        zza(this.zzp, t5, zzaofVar2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zza(T t5, T t10) {
        zzf(t5);
        t10.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzc = zzc(i7);
            long j = 1048575 & zzc;
            int i10 = this.zzc[i7];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza(t5, j, zzanp.zza(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzb(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzd(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzd(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzc(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzd(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzc(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zzc(t5, j, zzanp.zzh(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza(t5, j, zzanp.zze(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t5, t10, i7);
                    break;
                case 10:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza(t5, j, zzanp.zze(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzc(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzc(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzc(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzd(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzc(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzamg<T>) t10, i7)) {
                        zzanp.zza((Object) t5, j, zzanp.zzd(t10, j));
                        zzb((zzamg<T>) t5, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t5, t10, i7);
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
                    this.zzo.zza(t5, t10, j);
                    break;
                case 50:
                    zzamx.zza(this.zzr, t5, t10, j);
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
                    if (zzc((zzamg<T>) t10, i10, i7)) {
                        zzanp.zza(t5, j, zzanp.zze(t10, j));
                        zzb((zzamg<T>) t5, i10, i7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t5, t10, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzamg<T>) t10, i10, i7)) {
                        zzanp.zza(t5, j, zzanp.zze(t10, j));
                        zzb((zzamg<T>) t5, i10, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t5, t10, i7);
                    break;
            }
        }
        zzamx.zza(this.zzp, t5, t10);
        if (this.zzh) {
            zzamx.zza(this.zzq, t5, t10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zza(T t5, byte[] bArr, int i7, int i10, zzajk zzajkVar) {
        zza((zzamg<T>) t5, bArr, i7, i10, 0, zzajkVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zzb(T t5) {
        int i7;
        int zza2;
        int i10;
        int zzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzc2 = zzc(i12);
            int i13 = this.zzc[i12];
            long j = 1048575 & zzc2;
            int i14 = 37;
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    i7 = i11 * 53;
                    zza2 = zzalb.zza(Double.doubleToLongBits(zzanp.zza(t5, j)));
                    i11 = zza2 + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    zza2 = Float.floatToIntBits(zzanp.zzb(t5, j));
                    i11 = zza2 + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    zza2 = zzalb.zza(zzanp.zzd(t5, j));
                    i11 = zza2 + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    zza2 = zzalb.zza(zzanp.zzd(t5, j));
                    i11 = zza2 + i7;
                    break;
                case 4:
                    i10 = i11 * 53;
                    zzc = zzanp.zzc(t5, j);
                    i11 = i10 + zzc;
                    break;
                case 5:
                    i7 = i11 * 53;
                    zza2 = zzalb.zza(zzanp.zzd(t5, j));
                    i11 = zza2 + i7;
                    break;
                case 6:
                    i10 = i11 * 53;
                    zzc = zzanp.zzc(t5, j);
                    i11 = i10 + zzc;
                    break;
                case 7:
                    i7 = i11 * 53;
                    zza2 = zzalb.zza(zzanp.zzh(t5, j));
                    i11 = zza2 + i7;
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    i7 = i11 * 53;
                    zza2 = ((String) zzanp.zze(t5, j)).hashCode();
                    i11 = zza2 + i7;
                    break;
                case 9:
                    Object zze = zzanp.zze(t5, j);
                    if (zze != null) {
                        i14 = zze.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i7 = i11 * 53;
                    zza2 = zzanp.zze(t5, j).hashCode();
                    i11 = zza2 + i7;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i10 = i11 * 53;
                    zzc = zzanp.zzc(t5, j);
                    i11 = i10 + zzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    zzc = zzanp.zzc(t5, j);
                    i11 = i10 + zzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    zzc = zzanp.zzc(t5, j);
                    i11 = i10 + zzc;
                    break;
                case 14:
                    i7 = i11 * 53;
                    zza2 = zzalb.zza(zzanp.zzd(t5, j));
                    i11 = zza2 + i7;
                    break;
                case 15:
                    i10 = i11 * 53;
                    zzc = zzanp.zzc(t5, j);
                    i11 = i10 + zzc;
                    break;
                case 16:
                    i7 = i11 * 53;
                    zza2 = zzalb.zza(zzanp.zzd(t5, j));
                    i11 = zza2 + i7;
                    break;
                case 17:
                    Object zze2 = zzanp.zze(t5, j);
                    if (zze2 != null) {
                        i14 = zze2.hashCode();
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
                    zza2 = zzanp.zze(t5, j).hashCode();
                    i11 = zza2 + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    zza2 = zzanp.zze(t5, j).hashCode();
                    i11 = zza2 + i7;
                    break;
                case 51:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = zzalb.zza(Double.doubleToLongBits(zza(t5, j)));
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = Float.floatToIntBits(zzb(t5, j));
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = zzalb.zza(zzd(t5, j));
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = zzalb.zza(zzd(t5, j));
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t5, j);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = zzalb.zza(zzd(t5, j));
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t5, j);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = zzalb.zza(zze(t5, j));
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = ((String) zzanp.zze(t5, j)).hashCode();
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = zzanp.zze(t5, j).hashCode();
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = zzanp.zze(t5, j).hashCode();
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t5, j);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t5, j);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t5, j);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = zzalb.zza(zzd(t5, j));
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t5, j);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = zzalb.zza(zzd(t5, j));
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzamg<T>) t5, i13, i12)) {
                        i7 = i11 * 53;
                        zza2 = zzanp.zze(t5, j).hashCode();
                        i11 = zza2 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzp.zzd(t5).hashCode() + (i11 * 53);
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t5).hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzh(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzanp.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzanp.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzanp.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamx.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanp.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanp.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(T t5, T t10) {
        int length = this.zzc.length;
        int i7 = 0;
        while (true) {
            boolean z8 = true;
            if (i7 >= length) {
                if (!this.zzp.zzd(t5).equals(this.zzp.zzd(t10))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t5).equals(this.zzq.zza(t10));
                }
                return true;
            }
            int zzc = zzc(i7);
            long j = zzc & 1048575;
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 1:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 2:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 3:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 4:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 5:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 6:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 7:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 9:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 10:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 12:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 13:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 14:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 15:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 16:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
                    break;
                case 17:
                    if (zzc(t5, t10, i7)) {
                        break;
                    }
                    z8 = false;
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
                    z8 = zzamx.zza(zzanp.zze(t5, j), zzanp.zze(t10, j));
                    break;
                case 50:
                    z8 = zzamx.zza(zzanp.zze(t5, j), zzanp.zze(t10, j));
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
                    long zzb2 = zzb(i7) & 1048575;
                    if (zzanp.zzc(t5, zzb2) == zzanp.zzc(t10, zzb2)) {
                        break;
                    }
                    z8 = false;
                    break;
            }
            if (!z8) {
                return false;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zzd(T t5) {
        if (zzg(t5)) {
            if (t5 instanceof zzaky) {
                zzaky zzakyVar = (zzaky) t5;
                zzakyVar.zzb(f.API_PRIORITY_OTHER);
                zzakyVar.zza = 0;
                zzakyVar.zzt();
            }
            int length = this.zzc.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int zzc = zzc(i7);
                long j = 1048575 & zzc;
                int i10 = (zzc & 267386880) >>> 20;
                if (i10 != 9) {
                    if (i10 != 60 && i10 != 68) {
                        switch (i10) {
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
                                this.zzo.zzb(t5, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t5, j);
                                if (object != null) {
                                    unsafe.putObject(t5, j, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzamg<T>) t5, this.zzc[i7], i7)) {
                        zze(i7).zzd(zzb.getObject(t5, j));
                    }
                }
                if (zzc((zzamg<T>) t5, i7)) {
                    zze(i7).zzd(zzb.getObject(t5, j));
                }
            }
            this.zzp.zzf(t5);
            if (this.zzh) {
                this.zzq.zzc(t5);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzamv] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzamv] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final boolean zze(T t5) {
        int i7;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.zzl) {
            int i14 = this.zzk[i13];
            int i15 = this.zzc[i14];
            int zzc = zzc(i14);
            int i16 = this.zzc[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = zzb.getInt(t5, i17);
                }
                i10 = i12;
                i7 = i17;
            } else {
                i7 = i11;
                i10 = i12;
            }
            if ((268435456 & zzc) != 0 && !zza((zzamg<T>) t5, i14, i7, i10, i18)) {
                return false;
            }
            int i19 = (267386880 & zzc) >>> 20;
            if (i19 != 9 && i19 != 17) {
                if (i19 != 27) {
                    if (i19 == 60 || i19 == 68) {
                        if (zzc((zzamg<T>) t5, i15, i14) && !zza((Object) t5, zzc, zze(i14))) {
                            return false;
                        }
                    } else if (i19 != 49) {
                        if (i19 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzr.zzd(zzanp.zze(t5, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (this.zzr.zza(zzf(i14)).zzc.zzb() == zzaod.MESSAGE) {
                                ?? r12 = 0;
                                for (Object obj : zzd.values()) {
                                    r12 = r12;
                                    if (r12 == 0) {
                                        r12 = zzamr.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r12.zze(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzanp.zze(t5, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zze(i14);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zze.zze(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zza((zzamg<T>) t5, i14, i7, i10, i18) && !zza((Object) t5, zzc, zze(i14))) {
                return false;
            }
            i13++;
            i11 = i7;
            i12 = i10;
        }
        return !this.zzh || this.zzq.zza(t5).zzg();
    }
}
