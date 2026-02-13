package com.google.crypto.tink.shaded.protobuf;

import H2.C0305t;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class Q implements a0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f15727o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f15728p = l0.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f15729a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f15730b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15731c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15732d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1007a f15733e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15734f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f15735h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15736i;
    public final int j;
    public final T k;

    /* renamed from: l, reason: collision with root package name */
    public final I f15737l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f15738m;

    /* renamed from: n, reason: collision with root package name */
    public final M f15739n;

    public Q(int[] iArr, Object[] objArr, int i7, int i10, AbstractC1007a abstractC1007a, boolean z8, int[] iArr2, int i11, int i12, T t5, I i13, d0 d0Var, C1022p c1022p, M m10) {
        this.f15729a = iArr;
        this.f15730b = objArr;
        this.f15731c = i7;
        this.f15732d = i10;
        this.f15734f = abstractC1007a instanceof AbstractC1028w;
        this.g = z8;
        this.f15735h = iArr2;
        this.f15736i = i11;
        this.j = i12;
        this.k = t5;
        this.f15737l = i13;
        this.f15738m = d0Var;
        this.f15733e = abstractC1007a;
        this.f15739n = m10;
    }

    public static long A(int i7) {
        return i7 & 1048575;
    }

    public static int B(Object obj, long j) {
        return ((Integer) l0.f15799d.i(obj, j)).intValue();
    }

    public static long C(Object obj, long j) {
        return ((Long) l0.f15799d.i(obj, j)).longValue();
    }

    public static Field M(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder n6 = X.c.n("Field ", str, " for ");
            n6.append(cls.getName());
            n6.append(" not found. Known fields are ");
            n6.append(Arrays.toString(declaredFields));
            throw new RuntimeException(n6.toString());
        }
    }

    public static int Q(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void T(int i7, Object obj, C1018l c1018l) {
        if (!(obj instanceof String)) {
            c1018l.b(i7, (AbstractC1014h) obj);
            return;
        }
        String str = (String) obj;
        C1016j c1016j = (C1016j) c1018l.f15795a;
        c1016j.B0(i7, 2);
        int i10 = c1016j.f15792d;
        try {
            int r02 = C1016j.r0(str.length() * 3);
            int r03 = C1016j.r0(str.length());
            byte[] bArr = c1016j.f15790b;
            int i11 = c1016j.f15791c;
            if (r03 == r02) {
                int i12 = i10 + r03;
                c1016j.f15792d = i12;
                int Q3 = o0.f15808a.Q(str, bArr, i12, i11 - i12);
                c1016j.f15792d = i10;
                c1016j.C0((Q3 - i10) - r03);
                c1016j.f15792d = Q3;
            } else {
                c1016j.C0(o0.b(str));
                int i13 = c1016j.f15792d;
                c1016j.f15792d = o0.f15808a.Q(str, bArr, i13, i11 - i13);
            }
        } catch (n0 e2) {
            c1016j.f15792d = i10;
            C1016j.f15787e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(A.f15705a);
            try {
                c1016j.C0(bytes.length);
                c1016j.v0(bytes, 0, bytes.length);
            } catch (C1017k e10) {
                throw e10;
            } catch (IndexOutOfBoundsException e11) {
                throw new C1017k(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new C1017k(e12);
        }
    }

    public static List t(AbstractC1007a abstractC1007a, long j) {
        return (List) l0.f15799d.i(abstractC1007a, j);
    }

    public static Q y(Z z8, T t5, I i7, d0 d0Var, C1022p c1022p, M m10) {
        if (z8 instanceof Z) {
            return z(z8, t5, i7, d0Var, c1022p, m10);
        }
        z8.getClass();
        throw new ClassCastException();
    }

    public static Q z(Z z8, T t5, I i7, d0 d0Var, C1022p c1022p, M m10) {
        int i10;
        int charAt;
        int charAt2;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        char charAt3;
        int i17;
        char charAt4;
        int i18;
        char charAt5;
        int i19;
        char charAt6;
        int i20;
        char charAt7;
        int i21;
        char charAt8;
        int i22;
        char charAt9;
        int i23;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        String str;
        char c10;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        Field M3;
        int i37;
        char charAt11;
        int i38;
        int i39;
        int i40;
        Field M10;
        Field M11;
        int i41;
        char charAt12;
        int i42;
        char charAt13;
        int i43;
        char charAt14;
        int i44;
        char charAt15;
        char charAt16;
        int i45 = 0;
        boolean z10 = z8.d() == 2;
        String c11 = z8.c();
        int length = c11.length();
        int charAt17 = c11.charAt(0);
        if (charAt17 >= 55296) {
            int i46 = charAt17 & 8191;
            int i47 = 1;
            int i48 = 13;
            while (true) {
                i10 = i47 + 1;
                charAt16 = c11.charAt(i47);
                if (charAt16 < 55296) {
                    break;
                }
                i46 |= (charAt16 & 8191) << i48;
                i48 += 13;
                i47 = i10;
            }
            charAt17 = i46 | (charAt16 << i48);
        } else {
            i10 = 1;
        }
        int i49 = i10 + 1;
        int charAt18 = c11.charAt(i10);
        if (charAt18 >= 55296) {
            int i50 = charAt18 & 8191;
            int i51 = 13;
            while (true) {
                i44 = i49 + 1;
                charAt15 = c11.charAt(i49);
                if (charAt15 < 55296) {
                    break;
                }
                i50 |= (charAt15 & 8191) << i51;
                i51 += 13;
                i49 = i44;
            }
            charAt18 = i50 | (charAt15 << i51);
            i49 = i44;
        }
        if (charAt18 == 0) {
            i15 = 0;
            charAt = 0;
            charAt2 = 0;
            i14 = 0;
            i12 = 0;
            iArr = f15727o;
            i13 = 0;
        } else {
            int i52 = i49 + 1;
            int charAt19 = c11.charAt(i49);
            if (charAt19 >= 55296) {
                int i53 = charAt19 & 8191;
                int i54 = 13;
                while (true) {
                    i23 = i52 + 1;
                    charAt10 = c11.charAt(i52);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i53 |= (charAt10 & 8191) << i54;
                    i54 += 13;
                    i52 = i23;
                }
                charAt19 = i53 | (charAt10 << i54);
                i52 = i23;
            }
            int i55 = i52 + 1;
            int charAt20 = c11.charAt(i52);
            if (charAt20 >= 55296) {
                int i56 = charAt20 & 8191;
                int i57 = 13;
                while (true) {
                    i22 = i55 + 1;
                    charAt9 = c11.charAt(i55);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i56 |= (charAt9 & 8191) << i57;
                    i57 += 13;
                    i55 = i22;
                }
                charAt20 = i56 | (charAt9 << i57);
                i55 = i22;
            }
            int i58 = i55 + 1;
            charAt = c11.charAt(i55);
            if (charAt >= 55296) {
                int i59 = charAt & 8191;
                int i60 = 13;
                while (true) {
                    i21 = i58 + 1;
                    charAt8 = c11.charAt(i58);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i59 |= (charAt8 & 8191) << i60;
                    i60 += 13;
                    i58 = i21;
                }
                charAt = i59 | (charAt8 << i60);
                i58 = i21;
            }
            int i61 = i58 + 1;
            charAt2 = c11.charAt(i58);
            if (charAt2 >= 55296) {
                int i62 = charAt2 & 8191;
                int i63 = 13;
                while (true) {
                    i20 = i61 + 1;
                    charAt7 = c11.charAt(i61);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i62 |= (charAt7 & 8191) << i63;
                    i63 += 13;
                    i61 = i20;
                }
                charAt2 = i62 | (charAt7 << i63);
                i61 = i20;
            }
            int i64 = i61 + 1;
            int charAt21 = c11.charAt(i61);
            if (charAt21 >= 55296) {
                int i65 = charAt21 & 8191;
                int i66 = 13;
                while (true) {
                    i19 = i64 + 1;
                    charAt6 = c11.charAt(i64);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i65 |= (charAt6 & 8191) << i66;
                    i66 += 13;
                    i64 = i19;
                }
                charAt21 = i65 | (charAt6 << i66);
                i64 = i19;
            }
            int i67 = i64 + 1;
            int charAt22 = c11.charAt(i64);
            if (charAt22 >= 55296) {
                int i68 = charAt22 & 8191;
                int i69 = 13;
                while (true) {
                    i18 = i67 + 1;
                    charAt5 = c11.charAt(i67);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i68 |= (charAt5 & 8191) << i69;
                    i69 += 13;
                    i67 = i18;
                }
                charAt22 = i68 | (charAt5 << i69);
                i67 = i18;
            }
            int i70 = i67 + 1;
            int charAt23 = c11.charAt(i67);
            if (charAt23 >= 55296) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i17 = i72 + 1;
                    charAt4 = c11.charAt(i72);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i71 |= (charAt4 & 8191) << i73;
                    i73 += 13;
                    i72 = i17;
                }
                charAt23 = i71 | (charAt4 << i73);
                i11 = i17;
            } else {
                i11 = i70;
            }
            int i74 = i11 + 1;
            int charAt24 = c11.charAt(i11);
            if (charAt24 >= 55296) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i16 = i76 + 1;
                    charAt3 = c11.charAt(i76);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i75 |= (charAt3 & 8191) << i77;
                    i77 += 13;
                    i76 = i16;
                }
                charAt24 = i75 | (charAt3 << i77);
                i74 = i16;
            }
            int[] iArr2 = new int[charAt24 + charAt22 + charAt23];
            i12 = (charAt19 * 2) + charAt20;
            i13 = charAt22;
            i14 = charAt24;
            i45 = charAt19;
            i49 = i74;
            int i78 = charAt21;
            iArr = iArr2;
            i15 = i78;
        }
        Unsafe unsafe = f15728p;
        Object[] b2 = z8.b();
        Class<?> cls = z8.a().getClass();
        int i79 = i49;
        int[] iArr3 = new int[i15 * 3];
        Object[] objArr = new Object[i15 * 2];
        int i80 = i14 + i13;
        int i81 = i14;
        int i82 = i79;
        int i83 = i80;
        int i84 = 0;
        int i85 = 0;
        while (i82 < length) {
            int i86 = i82 + 1;
            int charAt25 = c11.charAt(i82);
            if (charAt25 >= 55296) {
                int i87 = charAt25 & 8191;
                int i88 = i86;
                int i89 = 13;
                while (true) {
                    i43 = i88 + 1;
                    charAt14 = c11.charAt(i88);
                    i24 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i87 |= (charAt14 & 8191) << i89;
                    i89 += 13;
                    i88 = i43;
                    length = i24;
                }
                charAt25 = i87 | (charAt14 << i89);
                i25 = i43;
            } else {
                i24 = length;
                i25 = i86;
            }
            int i90 = i25 + 1;
            int charAt26 = c11.charAt(i25);
            if (charAt26 >= 55296) {
                int i91 = charAt26 & 8191;
                int i92 = i90;
                int i93 = 13;
                while (true) {
                    i42 = i92 + 1;
                    charAt13 = c11.charAt(i92);
                    i26 = i14;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i91 |= (charAt13 & 8191) << i93;
                    i93 += 13;
                    i92 = i42;
                    i14 = i26;
                }
                charAt26 = i91 | (charAt13 << i93);
                i27 = i42;
            } else {
                i26 = i14;
                i27 = i90;
            }
            int i94 = charAt26 & 255;
            boolean z11 = z10;
            if ((charAt26 & 1024) != 0) {
                iArr[i84] = i85;
                i84++;
            }
            if (i94 >= 51) {
                int i95 = i27 + 1;
                int charAt27 = c11.charAt(i27);
                if (charAt27 >= 55296) {
                    int i96 = charAt27 & 8191;
                    int i97 = i95;
                    int i98 = 13;
                    while (true) {
                        i41 = i97 + 1;
                        charAt12 = c11.charAt(i97);
                        i28 = charAt2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i96 |= (charAt12 & 8191) << i98;
                        i98 += 13;
                        i97 = i41;
                        charAt2 = i28;
                    }
                    charAt27 = i96 | (charAt12 << i98);
                    i39 = i41;
                } else {
                    i28 = charAt2;
                    i39 = i95;
                }
                int i99 = i94 - 51;
                int i100 = i39;
                if (i99 == 9 || i99 == 17) {
                    i40 = 2;
                    objArr[((i85 / 3) * 2) + 1] = b2[i12];
                    i12++;
                } else {
                    if (i99 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i85 / 3) * 2) + 1] = b2[i12];
                        i12++;
                    }
                    i40 = 2;
                }
                int i101 = charAt27 * i40;
                Object obj = b2[i101];
                if (obj instanceof Field) {
                    M10 = (Field) obj;
                } else {
                    M10 = M(cls, (String) obj);
                    b2[i101] = M10;
                }
                int i102 = charAt;
                int objectFieldOffset = (int) unsafe.objectFieldOffset(M10);
                int i103 = i101 + 1;
                Object obj2 = b2[i103];
                if (obj2 instanceof Field) {
                    M11 = (Field) obj2;
                } else {
                    M11 = M(cls, (String) obj2);
                    b2[i103] = M11;
                }
                i36 = objectFieldOffset;
                c10 = 2;
                i30 = charAt26;
                i35 = i12;
                str = c11;
                i33 = (int) unsafe.objectFieldOffset(M11);
                i34 = 0;
                i29 = i102;
                i32 = i100;
            } else {
                i28 = charAt2;
                int i104 = charAt;
                int i105 = i12 + 1;
                Field M12 = M(cls, (String) b2[i12]);
                i29 = i104;
                if (i94 == 9 || i94 == 17) {
                    i30 = charAt26;
                    i31 = 1;
                    objArr[((i85 / 3) * 2) + 1] = M12.getType();
                } else {
                    if (i94 == 27 || i94 == 49) {
                        i30 = charAt26;
                        i31 = 1;
                        i38 = i12 + 2;
                        objArr[((i85 / 3) * 2) + 1] = b2[i105];
                    } else if (i94 == 12 || i94 == 30 || i94 == 44) {
                        i30 = charAt26;
                        i31 = 1;
                        if ((charAt17 & 1) == 1) {
                            i38 = i12 + 2;
                            objArr[((i85 / 3) * 2) + 1] = b2[i105];
                        }
                    } else {
                        if (i94 == 50) {
                            int i106 = i81 + 1;
                            iArr[i81] = i85;
                            int i107 = (i85 / 3) * 2;
                            int i108 = i12 + 2;
                            objArr[i107] = b2[i105];
                            if ((charAt26 & 2048) != 0) {
                                i105 = i12 + 3;
                                objArr[i107 + 1] = b2[i108];
                                i30 = charAt26;
                                i81 = i106;
                                i31 = 1;
                            } else {
                                i81 = i106;
                                i105 = i108;
                            }
                        }
                        i30 = charAt26;
                        i31 = 1;
                    }
                    i105 = i38;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(M12);
                if ((charAt17 & 1) != i31 || i94 > 17) {
                    str = c11;
                    c10 = 2;
                    i32 = i27;
                    i33 = 0;
                    i34 = 0;
                } else {
                    i32 = i27 + 1;
                    int charAt28 = c11.charAt(i27);
                    if (charAt28 >= 55296) {
                        int i109 = charAt28 & 8191;
                        int i110 = 13;
                        while (true) {
                            i37 = i32 + 1;
                            charAt11 = c11.charAt(i32);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i109 |= (charAt11 & 8191) << i110;
                            i110 += 13;
                            i32 = i37;
                        }
                        charAt28 = i109 | (charAt11 << i110);
                        i32 = i37;
                    }
                    c10 = 2;
                    int i111 = (charAt28 / 32) + (i45 * 2);
                    Object obj3 = b2[i111];
                    if (obj3 instanceof Field) {
                        M3 = (Field) obj3;
                    } else {
                        M3 = M(cls, (String) obj3);
                        b2[i111] = M3;
                    }
                    str = c11;
                    i33 = (int) unsafe.objectFieldOffset(M3);
                    i34 = charAt28 % 32;
                }
                if (i94 >= 18 && i94 <= 49) {
                    iArr[i83] = objectFieldOffset2;
                    i83++;
                }
                i35 = i105;
                i36 = objectFieldOffset2;
            }
            int i112 = i85 + 1;
            iArr3[i85] = charAt25;
            int i113 = i85 + 2;
            int i114 = i35;
            int i115 = i30;
            int i116 = i45;
            iArr3[i112] = ((i115 & 256) != 0 ? 268435456 : 0) | ((i115 & 512) != 0 ? 536870912 : 0) | (i94 << 20) | i36;
            i85 += 3;
            iArr3[i113] = i33 | (i34 << 20);
            i82 = i32;
            c11 = str;
            z10 = z11;
            i12 = i114;
            charAt = i29;
            length = i24;
            i14 = i26;
            i45 = i116;
            charAt2 = i28;
        }
        return new Q(iArr3, objArr, charAt, charAt2, z8.a(), z10, iArr, i14, i80, t5, i7, d0Var, c1022p, m10);
    }

    public final void D(Object obj, int i7, long j) {
        Unsafe unsafe = f15728p;
        Object n6 = n(i7);
        Object object = unsafe.getObject(obj, j);
        this.f15739n.getClass();
        if (M.c(object)) {
            L e2 = M.e();
            M.d(e2, object);
            unsafe.putObject(obj, j, e2);
        }
        M.a(n6);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0022. Please report as an issue. */
    public final int E(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j, int i16, P4.Z z8) {
        Unsafe unsafe = f15728p;
        long j10 = this.f15729a[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(P.i(i7, bArr)));
                    int i17 = i7 + 8;
                    unsafe.putInt(obj, j10, i12);
                    return i17;
                }
                return i7;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(P.o(i7, bArr)));
                    int i18 = i7 + 4;
                    unsafe.putInt(obj, j10, i12);
                    return i18;
                }
                return i7;
            case 53:
            case 54:
                if (i13 == 0) {
                    int O10 = P.O(bArr, i7, z8);
                    unsafe.putObject(obj, j, Long.valueOf(z8.f7976b));
                    unsafe.putInt(obj, j10, i12);
                    return O10;
                }
                return i7;
            case 55:
            case 62:
                if (i13 == 0) {
                    int M3 = P.M(bArr, i7, z8);
                    unsafe.putObject(obj, j, Integer.valueOf(z8.f7975a));
                    unsafe.putInt(obj, j10, i12);
                    return M3;
                }
                return i7;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(P.m(i7, bArr)));
                    int i19 = i7 + 8;
                    unsafe.putInt(obj, j10, i12);
                    return i19;
                }
                return i7;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(P.k(i7, bArr)));
                    int i20 = i7 + 4;
                    unsafe.putInt(obj, j10, i12);
                    return i20;
                }
                return i7;
            case 58:
                if (i13 == 0) {
                    int O11 = P.O(bArr, i7, z8);
                    unsafe.putObject(obj, j, Boolean.valueOf(z8.f7976b != 0));
                    unsafe.putInt(obj, j10, i12);
                    return O11;
                }
                return i7;
            case 59:
                if (i13 == 2) {
                    int M10 = P.M(bArr, i7, z8);
                    int i21 = z8.f7975a;
                    if (i21 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i14 & 536870912) != 0 && !o0.e(M10, bArr, M10 + i21)) {
                            throw C.a();
                        }
                        unsafe.putObject(obj, j, new String(bArr, M10, i21, A.f15705a));
                        M10 += i21;
                    }
                    unsafe.putInt(obj, j10, i12);
                    return M10;
                }
                return i7;
            case 60:
                if (i13 == 2) {
                    int s3 = P.s(o(i16), bArr, i7, i10, z8);
                    Object object = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, z8.f7977c);
                    } else {
                        unsafe.putObject(obj, j, A.c(object, z8.f7977c));
                    }
                    unsafe.putInt(obj, j10, i12);
                    return s3;
                }
                return i7;
            case 61:
                if (i13 == 2) {
                    int g = P.g(bArr, i7, z8);
                    unsafe.putObject(obj, j, z8.f7977c);
                    unsafe.putInt(obj, j10, i12);
                    return g;
                }
                return i7;
            case 63:
                if (i13 == 0) {
                    int M11 = P.M(bArr, i7, z8);
                    int i22 = z8.f7975a;
                    m(i16);
                    unsafe.putObject(obj, j, Integer.valueOf(i22));
                    unsafe.putInt(obj, j10, i12);
                    return M11;
                }
                return i7;
            case 66:
                if (i13 == 0) {
                    int M12 = P.M(bArr, i7, z8);
                    unsafe.putObject(obj, j, Integer.valueOf(C1015i.a(z8.f7975a)));
                    unsafe.putInt(obj, j10, i12);
                    return M12;
                }
                return i7;
            case 67:
                if (i13 == 0) {
                    int O12 = P.O(bArr, i7, z8);
                    unsafe.putObject(obj, j, Long.valueOf(C1015i.b(z8.f7976b)));
                    unsafe.putInt(obj, j10, i12);
                    return O12;
                }
                return i7;
            case 68:
                if (i13 == 3) {
                    int q10 = P.q(o(i16), bArr, i7, i10, (i11 & (-8)) | 4, z8);
                    Object object2 = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, z8.f7977c);
                    } else {
                        unsafe.putObject(obj, j, A.c(object2, z8.f7977c));
                    }
                    unsafe.putInt(obj, j10, i12);
                    return q10;
                }
                return i7;
            default:
                return i7;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x0094. Please report as an issue. */
    public final int F(Object obj, byte[] bArr, int i7, int i10, int i11, P4.Z z8) {
        int i12;
        Unsafe unsafe;
        Object obj2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        byte[] bArr2;
        int i22;
        int i23;
        byte[] bArr3;
        byte[] bArr4;
        int i24;
        int i25;
        int F10;
        int i26;
        int i27;
        int i28;
        int i29;
        Q q10 = this;
        Object obj3 = obj;
        byte[] bArr5 = bArr;
        int i30 = i10;
        P4.Z z10 = z8;
        Unsafe unsafe2 = f15728p;
        int i31 = i7;
        int i32 = -1;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = -1;
        while (true) {
            if (i31 < i30) {
                int i37 = i31 + 1;
                byte b2 = bArr5[i31];
                if (b2 < 0) {
                    int L = P.L(b2, bArr5, i37, z10);
                    i13 = z10.f7975a;
                    i37 = L;
                } else {
                    i13 = b2;
                }
                int i38 = i13 >>> 3;
                int i39 = i13 & 7;
                int i40 = q10.f15732d;
                int i41 = q10.f15731c;
                int i42 = i13;
                if (i38 > i32) {
                    i16 = (i38 < i41 || i38 > i40) ? -1 : q10.P(i38, i33 / 3);
                    i17 = -1;
                    i14 = 0;
                } else {
                    if (i38 < i41 || i38 > i40) {
                        i14 = 0;
                        i15 = -1;
                    } else {
                        i14 = 0;
                        i15 = q10.P(i38, 0);
                    }
                    i16 = i15;
                    i17 = -1;
                }
                if (i16 == i17) {
                    i18 = i38;
                    i19 = i37;
                    i20 = i14;
                    unsafe = unsafe2;
                    obj2 = obj3;
                    i21 = i42;
                    i12 = i11;
                } else {
                    int[] iArr = q10.f15729a;
                    int i43 = iArr[i16 + 1];
                    int Q3 = Q(i43);
                    long j = i43 & 1048575;
                    if (Q3 <= 17) {
                        int i44 = iArr[i16 + 2];
                        int i45 = 1 << (i44 >>> 20);
                        int i46 = i44 & 1048575;
                        if (i46 != i36) {
                            if (i36 != -1) {
                                unsafe2.putInt(obj3, i36, i35);
                            }
                            i35 = unsafe2.getInt(obj3, i46);
                            i36 = i46;
                        }
                        switch (Q3) {
                            case 0:
                                bArr3 = bArr;
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                if (i39 == 1) {
                                    l0.q(obj3, j, P.i(i37, bArr3));
                                    i31 = i37 + 8;
                                    i35 |= i45;
                                    i34 = i23;
                                    i33 = i22;
                                    i32 = i18;
                                    i30 = i10;
                                    bArr5 = bArr3;
                                    z10 = z8;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 1:
                                bArr3 = bArr;
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                if (i39 == 5) {
                                    l0.r(obj3, j, P.o(i37, bArr3));
                                    i31 = i37 + 4;
                                    i35 |= i45;
                                    i34 = i23;
                                    i33 = i22;
                                    i32 = i18;
                                    i30 = i10;
                                    bArr5 = bArr3;
                                    z10 = z8;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                if (i39 == 0) {
                                    int O10 = P.O(bArr2, i37, z10);
                                    long j10 = z10.f7976b;
                                    bArr3 = bArr2;
                                    unsafe2.putLong(obj, j, j10);
                                    i35 |= i45;
                                    i31 = O10;
                                    i34 = i23;
                                    i33 = i22;
                                    i32 = i18;
                                    i30 = i10;
                                    bArr5 = bArr3;
                                    z10 = z8;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 4:
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                bArr2 = bArr;
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                if (i39 == 0) {
                                    i31 = P.M(bArr2, i37, z10);
                                    unsafe2.putInt(obj3, j, z10.f7975a);
                                    i35 |= i45;
                                    i34 = i23;
                                    i32 = i18;
                                    bArr5 = bArr2;
                                    i33 = i22;
                                    i30 = i10;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                if (i39 == 1) {
                                    unsafe2.putLong(obj, j, P.m(i37, bArr));
                                    i31 = i37 + 8;
                                    i35 |= i45;
                                    i34 = i23;
                                    i33 = i22;
                                    i32 = i18;
                                    bArr5 = bArr;
                                    i30 = i10;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                bArr4 = bArr;
                                if (i39 == 5) {
                                    unsafe2.putInt(obj3, j, P.k(i37, bArr4));
                                    i24 = i37 + 4;
                                    i35 |= i45;
                                    i34 = i23;
                                    i33 = i22;
                                    i30 = i10;
                                    bArr5 = bArr4;
                                    i31 = i24;
                                    i32 = i18;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 7:
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                bArr4 = bArr;
                                if (i39 == 0) {
                                    int O11 = P.O(bArr4, i37, z10);
                                    l0.m(obj3, j, z10.f7976b != 0);
                                    i35 |= i45;
                                    i33 = i22;
                                    i32 = i18;
                                    i30 = i10;
                                    bArr5 = bArr4;
                                    i31 = O11;
                                    i34 = i23;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                i25 = i10;
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                bArr4 = bArr;
                                if (i39 == 2) {
                                    F10 = (i43 & 536870912) == 0 ? P.F(bArr4, i37, z10) : P.I(bArr4, i37, z10);
                                    unsafe2.putObject(obj3, j, z10.f7977c);
                                    i35 |= i45;
                                    i34 = i23;
                                    bArr5 = bArr4;
                                    i31 = F10;
                                    i32 = i18;
                                    int i47 = i22;
                                    i30 = i25;
                                    i33 = i47;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 9:
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                bArr4 = bArr;
                                if (i39 == 2) {
                                    i25 = i10;
                                    F10 = P.s(q10.o(i22), bArr4, i37, i25, z10);
                                    if ((i35 & i45) == 0) {
                                        unsafe2.putObject(obj3, j, z10.f7977c);
                                    } else {
                                        unsafe2.putObject(obj3, j, A.c(unsafe2.getObject(obj3, j), z10.f7977c));
                                    }
                                    i35 |= i45;
                                    i34 = i23;
                                    bArr5 = bArr4;
                                    i31 = F10;
                                    i32 = i18;
                                    int i472 = i22;
                                    i30 = i25;
                                    i33 = i472;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 10:
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                bArr4 = bArr;
                                if (i39 == 2) {
                                    i24 = P.g(bArr4, i37, z10);
                                    unsafe2.putObject(obj3, j, z10.f7977c);
                                    i35 |= i45;
                                    i34 = i23;
                                    i33 = i22;
                                    i30 = i10;
                                    bArr5 = bArr4;
                                    i31 = i24;
                                    i32 = i18;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 12:
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                bArr4 = bArr;
                                if (i39 == 0) {
                                    i24 = P.M(bArr4, i37, z10);
                                    int i48 = z10.f7975a;
                                    q10.m(i22);
                                    unsafe2.putInt(obj3, j, i48);
                                    i35 |= i45;
                                    i34 = i23;
                                    i33 = i22;
                                    i30 = i10;
                                    bArr5 = bArr4;
                                    i31 = i24;
                                    i32 = i18;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 15:
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                bArr4 = bArr;
                                if (i39 == 0) {
                                    i24 = P.M(bArr4, i37, z10);
                                    unsafe2.putInt(obj3, j, C1015i.a(z10.f7975a));
                                    i35 |= i45;
                                    i34 = i23;
                                    i33 = i22;
                                    i30 = i10;
                                    bArr5 = bArr4;
                                    i31 = i24;
                                    i32 = i18;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 16:
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                if (i39 == 0) {
                                    int O12 = P.O(bArr, i37, z10);
                                    unsafe2.putLong(obj, j, C1015i.b(z10.f7976b));
                                    i35 |= i45;
                                    i34 = i23;
                                    i33 = i22;
                                    i32 = i18;
                                    i31 = O12;
                                    i30 = i10;
                                    bArr5 = bArr;
                                    break;
                                } else {
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            case 17:
                                if (i39 == 3) {
                                    i18 = i38;
                                    i23 = i42;
                                    i22 = i16;
                                    i31 = P.q(q10.o(i16), bArr, i37, i10, (i38 << 3) | 4, z8);
                                    if ((i35 & i45) == 0) {
                                        unsafe2.putObject(obj3, j, z10.f7977c);
                                    } else {
                                        unsafe2.putObject(obj3, j, A.c(unsafe2.getObject(obj3, j), z10.f7977c));
                                    }
                                    i35 |= i45;
                                    i34 = i23;
                                    i33 = i22;
                                    i32 = i18;
                                    bArr5 = bArr;
                                    i30 = i10;
                                    break;
                                } else {
                                    i18 = i38;
                                    i22 = i16;
                                    i23 = i42;
                                    i12 = i11;
                                    i19 = i37;
                                    unsafe = unsafe2;
                                    i21 = i23;
                                    i20 = i22;
                                    obj2 = obj3;
                                    break;
                                }
                            default:
                                i18 = i38;
                                i22 = i16;
                                i23 = i42;
                                i12 = i11;
                                i19 = i37;
                                unsafe = unsafe2;
                                i21 = i23;
                                i20 = i22;
                                obj2 = obj3;
                                break;
                        }
                    } else {
                        bArr3 = bArr;
                        i18 = i38;
                        int i49 = i16;
                        if (Q3 != 27) {
                            i26 = i35;
                            if (Q3 <= 49) {
                                int i50 = i37;
                                i28 = i36;
                                unsafe = unsafe2;
                                i20 = i49;
                                i31 = H(obj, bArr, i37, i10, i42, i18, i39, i49, i43, Q3, j, z8);
                                if (i31 != i50) {
                                    q10 = this;
                                    obj3 = obj;
                                    bArr5 = bArr;
                                    i34 = i42;
                                    i30 = i10;
                                    z10 = z8;
                                    i32 = i18;
                                    i35 = i26;
                                    i36 = i28;
                                    unsafe2 = unsafe;
                                    i33 = i20;
                                } else {
                                    obj2 = obj;
                                    i21 = i42;
                                    i12 = i11;
                                    i19 = i31;
                                }
                            } else {
                                i27 = i37;
                                i28 = i36;
                                unsafe = unsafe2;
                                i29 = i42;
                                i20 = i49;
                                if (Q3 != 50) {
                                    obj2 = obj;
                                    i31 = E(obj, bArr, i27, i10, i29, i18, i39, i43, Q3, j, i20, z8);
                                    if (i31 != i27) {
                                        bArr5 = bArr;
                                        i34 = i29;
                                        i30 = i10;
                                        z10 = z8;
                                        obj3 = obj2;
                                        i33 = i20;
                                        i32 = i18;
                                        i35 = i26;
                                        i36 = i28;
                                        unsafe2 = unsafe;
                                        q10 = this;
                                    } else {
                                        i21 = i29;
                                        i12 = i11;
                                        i19 = i31;
                                        i20 = i20;
                                    }
                                } else if (i39 == 2) {
                                    D(obj, i20, j);
                                    throw null;
                                }
                            }
                            i35 = i26;
                            i36 = i28;
                        } else if (i39 == 2) {
                            AbstractC1008b abstractC1008b = (AbstractC1008b) ((InterfaceC1031z) unsafe2.getObject(obj3, j));
                            boolean i51 = abstractC1008b.i();
                            InterfaceC1031z interfaceC1031z = abstractC1008b;
                            if (!i51) {
                                int size = abstractC1008b.size();
                                InterfaceC1031z j11 = abstractC1008b.j(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, j, j11);
                                interfaceC1031z = j11;
                            }
                            i31 = P.t(q10.o(i49), i42, bArr, i37, i10, interfaceC1031z, z8);
                            i34 = i42;
                            i33 = i49;
                            i32 = i18;
                            i35 = i35;
                            i30 = i10;
                            bArr5 = bArr3;
                            z10 = z8;
                        } else {
                            i26 = i35;
                            i27 = i37;
                            i28 = i36;
                            unsafe = unsafe2;
                            i29 = i42;
                            i20 = i49;
                        }
                        i21 = i29;
                        i12 = i11;
                        i19 = i27;
                        i35 = i26;
                        i36 = i28;
                        obj2 = obj;
                    }
                }
                if (i21 != i12 || i12 == 0) {
                    AbstractC1028w abstractC1028w = (AbstractC1028w) obj2;
                    c0 c0Var = abstractC1028w.unknownFields;
                    if (c0Var == c0.f15762f) {
                        c0Var = c0.b();
                        abstractC1028w.unknownFields = c0Var;
                    }
                    i31 = P.J(i21, bArr, i19, i10, c0Var, z8);
                    bArr5 = bArr;
                    i30 = i10;
                    z10 = z8;
                    i34 = i21;
                    obj3 = obj2;
                    i32 = i18;
                    unsafe2 = unsafe;
                    i33 = i20;
                    q10 = this;
                } else {
                    i31 = i19;
                    i34 = i21;
                }
            } else {
                i12 = i11;
                unsafe = unsafe2;
                obj2 = obj3;
            }
        }
        if (i36 != -1) {
            unsafe.putInt(obj2, i36, i35);
        }
        for (int i52 = this.f15736i; i52 < this.j; i52++) {
            l(this.f15735h[i52], obj2, null);
        }
        if (i12 == 0) {
            if (i31 != i10) {
                throw C.e();
            }
        } else if (i31 > i10 || i34 != i12) {
            throw C.e();
        }
        return i31;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x006d. Please report as an issue. */
    public final void G(Object obj, byte[] bArr, int i7, int i10, P4.Z z8) {
        int i11;
        int i12;
        int P10;
        int i13;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe;
        int i17;
        Object obj2;
        int i18;
        int i19;
        int i20;
        Q q10 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i21 = i10;
        P4.Z z10 = z8;
        Unsafe unsafe2 = f15728p;
        int i22 = -1;
        int i23 = 0;
        int i24 = i7;
        int i25 = 0;
        int i26 = -1;
        while (i24 < i21) {
            int i27 = i24 + 1;
            byte b2 = bArr2[i24];
            if (b2 < 0) {
                i12 = P.L(b2, bArr2, i27, z10);
                i11 = z10.f7975a;
            } else {
                i11 = b2;
                i12 = i27;
            }
            int i28 = i11 >>> 3;
            int i29 = i11 & 7;
            int i30 = q10.f15732d;
            int i31 = q10.f15731c;
            if (i28 > i26) {
                int i32 = i25 / 3;
                if (i28 >= i31 && i28 <= i30) {
                    P10 = q10.P(i28, i32);
                }
                P10 = i22;
            } else {
                if (i28 >= i31 && i28 <= i30) {
                    P10 = q10.P(i28, i23);
                }
                P10 = i22;
            }
            int i33 = P10;
            if (i33 == i22) {
                i13 = i28;
                i14 = i12;
                i15 = i23;
                i16 = i15;
                unsafe = unsafe2;
                i17 = i22;
                obj2 = obj3;
            } else {
                int i34 = q10.f15729a[i33 + 1];
                int Q3 = Q(i34);
                long j = 1048575 & i34;
                if (Q3 <= 17) {
                    switch (Q3) {
                        case 0:
                            i18 = i33;
                            if (i29 != 1) {
                                i13 = i28;
                                i19 = i12;
                                unsafe = unsafe2;
                                i16 = i18;
                                break;
                            } else {
                                l0.q(obj3, j, P.i(i12, bArr2));
                                i24 = i12 + 8;
                                i26 = i28;
                                i25 = i18;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 1:
                            i18 = i33;
                            if (i29 != 5) {
                                i13 = i28;
                                i19 = i12;
                                unsafe = unsafe2;
                                i16 = i18;
                                break;
                            } else {
                                l0.r(obj3, j, P.o(i12, bArr2));
                                i24 = i12 + 4;
                                i26 = i28;
                                i25 = i18;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i18 = i33;
                            if (i29 != 0) {
                                i13 = i28;
                                i19 = i12;
                                unsafe = unsafe2;
                                i16 = i18;
                                break;
                            } else {
                                int O10 = P.O(bArr2, i12, z10);
                                unsafe2.putLong(obj, j, z10.f7976b);
                                i26 = i28;
                                i24 = O10;
                                i25 = i18;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 4:
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            i18 = i33;
                            if (i29 != 0) {
                                i13 = i28;
                                i19 = i12;
                                unsafe = unsafe2;
                                i16 = i18;
                                break;
                            } else {
                                i24 = P.M(bArr2, i12, z10);
                                unsafe2.putInt(obj3, j, z10.f7975a);
                                i26 = i28;
                                i25 = i18;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i18 = i33;
                            if (i29 != 1) {
                                i13 = i28;
                                i19 = i12;
                                unsafe = unsafe2;
                                i16 = i18;
                                break;
                            } else {
                                unsafe2.putLong(obj, j, P.m(i12, bArr2));
                                i24 = i12 + 8;
                                i26 = i28;
                                i25 = i18;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i18 = i33;
                            if (i29 != 5) {
                                i13 = i28;
                                i19 = i12;
                                unsafe = unsafe2;
                                i16 = i18;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j, P.k(i12, bArr2));
                                i24 = i12 + 4;
                                i26 = i28;
                                i25 = i18;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 7:
                            i20 = i33;
                            if (i29 != 0) {
                                i13 = i28;
                                i19 = i12;
                                i16 = i20;
                                unsafe = unsafe2;
                                break;
                            } else {
                                i24 = P.O(bArr2, i12, z10);
                                l0.m(obj3, j, z10.f7976b != 0);
                                i26 = i28;
                                i25 = i20;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            i20 = i33;
                            if (i29 != 2) {
                                i13 = i28;
                                i19 = i12;
                                i16 = i20;
                                unsafe = unsafe2;
                                break;
                            } else {
                                i24 = (536870912 & i34) == 0 ? P.F(bArr2, i12, z10) : P.I(bArr2, i12, z10);
                                unsafe2.putObject(obj3, j, z10.f7977c);
                                i26 = i28;
                                i25 = i20;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 9:
                            i20 = i33;
                            if (i29 != 2) {
                                i13 = i28;
                                i19 = i12;
                                i16 = i20;
                                unsafe = unsafe2;
                                break;
                            } else {
                                i24 = P.s(q10.o(i20), bArr2, i12, i21, z10);
                                Object object = unsafe2.getObject(obj3, j);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j, z10.f7977c);
                                } else {
                                    unsafe2.putObject(obj3, j, A.c(object, z10.f7977c));
                                }
                                i26 = i28;
                                i25 = i20;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 10:
                            i20 = i33;
                            if (i29 != 2) {
                                i13 = i28;
                                i19 = i12;
                                i16 = i20;
                                unsafe = unsafe2;
                                break;
                            } else {
                                i24 = P.g(bArr2, i12, z10);
                                unsafe2.putObject(obj3, j, z10.f7977c);
                                i26 = i28;
                                i25 = i20;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 12:
                            i20 = i33;
                            if (i29 != 0) {
                                i13 = i28;
                                i19 = i12;
                                i16 = i20;
                                unsafe = unsafe2;
                                break;
                            } else {
                                i24 = P.M(bArr2, i12, z10);
                                unsafe2.putInt(obj3, j, z10.f7975a);
                                i26 = i28;
                                i25 = i20;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 15:
                            i20 = i33;
                            if (i29 != 0) {
                                i13 = i28;
                                i19 = i12;
                                i16 = i20;
                                unsafe = unsafe2;
                                break;
                            } else {
                                i24 = P.M(bArr2, i12, z10);
                                unsafe2.putInt(obj3, j, C1015i.a(z10.f7975a));
                                i26 = i28;
                                i25 = i20;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        case 16:
                            if (i29 != 0) {
                                i16 = i33;
                                i13 = i28;
                                i19 = i12;
                                unsafe = unsafe2;
                                break;
                            } else {
                                int O11 = P.O(bArr2, i12, z10);
                                i20 = i33;
                                unsafe2.putLong(obj, j, C1015i.b(z10.f7976b));
                                i26 = i28;
                                i24 = O11;
                                i25 = i20;
                                i23 = 0;
                                i22 = -1;
                                break;
                            }
                        default:
                            i16 = i33;
                            i13 = i28;
                            i19 = i12;
                            unsafe = unsafe2;
                            break;
                    }
                } else {
                    i20 = i33;
                    if (Q3 != 27) {
                        i13 = i28;
                        if (Q3 <= 49) {
                            int i35 = i12;
                            i16 = i20;
                            i15 = 0;
                            unsafe = unsafe2;
                            i17 = -1;
                            i24 = H(obj, bArr, i12, i10, i11, i13, i29, i20, i34, Q3, j, z8);
                            if (i24 != i35) {
                                q10 = this;
                                obj3 = obj;
                                bArr2 = bArr;
                                i21 = i10;
                                z10 = z8;
                                i23 = 0;
                                unsafe2 = unsafe;
                                i26 = i13;
                                i25 = i16;
                                i22 = -1;
                            } else {
                                obj2 = obj;
                                i14 = i24;
                            }
                        } else {
                            i19 = i12;
                            i16 = i20;
                            unsafe = unsafe2;
                            i15 = 0;
                            i17 = -1;
                            if (Q3 == 50) {
                                if (i29 == 2) {
                                    D(obj, i16, j);
                                    throw null;
                                }
                                i14 = i19;
                                obj2 = obj;
                            } else {
                                obj2 = obj;
                                i24 = E(obj, bArr, i19, i10, i11, i13, i29, i34, Q3, j, i16, z8);
                                if (i24 != i19) {
                                    bArr2 = bArr;
                                    i21 = i10;
                                    z10 = z8;
                                    obj3 = obj2;
                                    i23 = 0;
                                    unsafe2 = unsafe;
                                    i26 = i13;
                                    i25 = i16;
                                    i22 = i17;
                                    q10 = this;
                                } else {
                                    i14 = i24;
                                    i16 = i16;
                                }
                            }
                        }
                    } else if (i29 == 2) {
                        AbstractC1008b abstractC1008b = (AbstractC1008b) ((InterfaceC1031z) unsafe2.getObject(obj3, j));
                        boolean i36 = abstractC1008b.i();
                        InterfaceC1031z interfaceC1031z = abstractC1008b;
                        if (!i36) {
                            int size = abstractC1008b.size();
                            InterfaceC1031z j10 = abstractC1008b.j(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(obj3, j, j10);
                            interfaceC1031z = j10;
                        }
                        i24 = P.t(q10.o(i20), i11, bArr, i12, i10, interfaceC1031z, z8);
                        i25 = i20;
                        i26 = i28;
                        i23 = 0;
                        i22 = -1;
                    } else {
                        i13 = i28;
                        i19 = i12;
                        i16 = i20;
                        unsafe = unsafe2;
                    }
                }
                i15 = 0;
                i17 = -1;
                i14 = i19;
                obj2 = obj;
            }
            AbstractC1028w abstractC1028w = (AbstractC1028w) obj2;
            c0 c0Var = abstractC1028w.unknownFields;
            if (c0Var == c0.f15762f) {
                c0Var = c0.b();
                abstractC1028w.unknownFields = c0Var;
            }
            i24 = P.J(i11, bArr, i14, i10, c0Var, z8);
            bArr2 = bArr;
            i21 = i10;
            z10 = z8;
            obj3 = obj2;
            i23 = i15;
            unsafe2 = unsafe;
            i26 = i13;
            i25 = i16;
            i22 = i17;
            q10 = this;
        }
        if (i24 != i21) {
            throw C.e();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0031. Please report as an issue. */
    public final int H(Object obj, byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, long j, int i15, long j10, P4.Z z8) {
        int N10;
        Unsafe unsafe = f15728p;
        AbstractC1008b abstractC1008b = (AbstractC1008b) ((InterfaceC1031z) unsafe.getObject(obj, j10));
        boolean i16 = abstractC1008b.i();
        InterfaceC1031z interfaceC1031z = abstractC1008b;
        if (!i16) {
            int size = abstractC1008b.size();
            InterfaceC1031z j11 = abstractC1008b.j(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j10, j11);
            interfaceC1031z = j11;
        }
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    return P.v(bArr, i7, interfaceC1031z, z8);
                }
                if (i13 == 1) {
                    return P.j(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 19:
            case 36:
                if (i13 == 2) {
                    return P.y(bArr, i7, interfaceC1031z, z8);
                }
                if (i13 == 5) {
                    return P.p(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    return P.C(bArr, i7, interfaceC1031z, z8);
                }
                if (i13 == 0) {
                    return P.P(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return P.B(bArr, i7, interfaceC1031z, z8);
                }
                if (i13 == 0) {
                    return P.N(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    return P.x(bArr, i7, interfaceC1031z, z8);
                }
                if (i13 == 1) {
                    return P.n(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    return P.w(bArr, i7, interfaceC1031z, z8);
                }
                if (i13 == 5) {
                    return P.l(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
            case 42:
                if (i13 == 2) {
                    return P.u(bArr, i7, interfaceC1031z, z8);
                }
                if (i13 == 0) {
                    return P.f(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 26:
                if (i13 == 2) {
                    return (j & 536870912) == 0 ? P.G(i11, bArr, i7, i10, interfaceC1031z, z8) : P.H(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 27:
                if (i13 == 2) {
                    return P.t(o(i14), i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 28:
                if (i13 == 2) {
                    return P.h(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 30:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        N10 = P.N(i11, bArr, i7, i10, interfaceC1031z, z8);
                    }
                    return i7;
                }
                N10 = P.B(bArr, i7, interfaceC1031z, z8);
                AbstractC1028w abstractC1028w = (AbstractC1028w) obj;
                c0 c0Var = abstractC1028w.unknownFields;
                if (c0Var == c0.f15762f) {
                    c0Var = null;
                }
                m(i14);
                b0.z(i12, interfaceC1031z, c0Var, this.f15738m);
                if (c0Var != null) {
                    abstractC1028w.unknownFields = c0Var;
                }
                return N10;
            case 33:
            case 47:
                if (i13 == 2) {
                    return P.z(bArr, i7, interfaceC1031z, z8);
                }
                if (i13 == 0) {
                    return P.D(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 34:
            case 48:
                if (i13 == 2) {
                    return P.A(bArr, i7, interfaceC1031z, z8);
                }
                if (i13 == 0) {
                    return P.E(i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            case 49:
                if (i13 == 3) {
                    return P.r(o(i14), i11, bArr, i7, i10, interfaceC1031z, z8);
                }
                return i7;
            default:
                return i7;
        }
    }

    public final void I(Object obj, long j, C0305t c0305t, a0 a0Var, C1021o c1021o) {
        int l10;
        List c10 = this.f15737l.c(obj, j);
        int i7 = c0305t.f4826b;
        if ((i7 & 7) != 3) {
            throw C.b();
        }
        do {
            c10.add(c0305t.F(a0Var, c1021o));
            C1015i c1015i = (C1015i) c0305t.f4829e;
            if (c1015i.d() || c0305t.f4828d != 0) {
                return;
            } else {
                l10 = c1015i.l();
            }
        } while (l10 == i7);
        c0305t.f4828d = l10;
    }

    public final void J(Object obj, int i7, C0305t c0305t, a0 a0Var, C1021o c1021o) {
        int l10;
        List c10 = this.f15737l.c(obj, i7 & 1048575);
        int i10 = c0305t.f4826b;
        if ((i10 & 7) != 2) {
            throw C.b();
        }
        do {
            c10.add(c0305t.N(a0Var, c1021o));
            C1015i c1015i = (C1015i) c0305t.f4829e;
            if (c1015i.d() || c0305t.f4828d != 0) {
                return;
            } else {
                l10 = c1015i.l();
            }
        } while (l10 == i10);
        c0305t.f4828d = l10;
    }

    public final void K(int i7, C0305t c0305t, Object obj) {
        if ((536870912 & i7) != 0) {
            l0.u(obj, i7 & 1048575, c0305t.e0());
        } else if (this.f15734f) {
            l0.u(obj, i7 & 1048575, c0305t.b0());
        } else {
            l0.u(obj, i7 & 1048575, c0305t.m());
        }
    }

    public final void L(int i7, C0305t c0305t, Object obj) {
        boolean z8 = (536870912 & i7) != 0;
        I i10 = this.f15737l;
        if (z8) {
            c0305t.d0(i10.c(obj, i7 & 1048575), true);
        } else {
            c0305t.d0(i10.c(obj, i7 & 1048575), false);
        }
    }

    public final void N(int i7, Object obj) {
        if (this.g) {
            return;
        }
        int i10 = this.f15729a[i7 + 2];
        long j = i10 & 1048575;
        l0.s(obj, l0.f15799d.g(obj, j) | (1 << (i10 >>> 20)), j);
    }

    public final void O(Object obj, int i7, int i10) {
        l0.s(obj, i7, this.f15729a[i10 + 2] & 1048575);
    }

    public final int P(int i7, int i10) {
        int[] iArr = this.f15729a;
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

    public final int R(int i7) {
        return this.f15729a[i7 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0040. Please report as an issue. */
    public final void S(Object obj, C1018l c1018l) {
        int i7;
        boolean z8;
        int[] iArr = this.f15729a;
        int length = iArr.length;
        Unsafe unsafe = f15728p;
        int i10 = -1;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int R10 = R(i12);
            int i13 = iArr[i12];
            int Q3 = Q(R10);
            if (this.g || Q3 > 17) {
                i7 = 0;
            } else {
                int i14 = iArr[i12 + 2];
                int i15 = i14 & 1048575;
                if (i15 != i10) {
                    i11 = unsafe.getInt(obj, i15);
                    i10 = i15;
                }
                i7 = 1 << (i14 >>> 20);
            }
            long j = R10 & 1048575;
            switch (Q3) {
                case 0:
                    if ((i7 & i11) != 0) {
                        c1018l.c(i13, l0.f15799d.e(obj, j));
                    }
                case 1:
                    if ((i7 & i11) != 0) {
                        c1018l.g(i13, l0.f15799d.f(obj, j));
                    }
                case 2:
                    if ((i7 & i11) != 0) {
                        c1018l.j(i13, unsafe.getLong(obj, j));
                    }
                case 3:
                    if ((i7 & i11) != 0) {
                        c1018l.q(i13, unsafe.getLong(obj, j));
                    }
                case 4:
                    if ((i7 & i11) != 0) {
                        c1018l.i(i13, unsafe.getInt(obj, j));
                    }
                case 5:
                    if ((i7 & i11) != 0) {
                        c1018l.f(i13, unsafe.getLong(obj, j));
                    }
                case 6:
                    if ((i7 & i11) != 0) {
                        c1018l.e(i13, unsafe.getInt(obj, j));
                    }
                case 7:
                    if ((i7 & i11) != 0) {
                        c1018l.a(i13, l0.f15799d.c(obj, j));
                    }
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i7 & i11) != 0) {
                        T(i13, unsafe.getObject(obj, j), c1018l);
                    }
                case 9:
                    if ((i7 & i11) != 0) {
                        c1018l.k(i13, unsafe.getObject(obj, j), o(i12));
                    }
                case 10:
                    if ((i7 & i11) != 0) {
                        c1018l.b(i13, (AbstractC1014h) unsafe.getObject(obj, j));
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if ((i7 & i11) != 0) {
                        c1018l.p(i13, unsafe.getInt(obj, j));
                    }
                case 12:
                    if ((i7 & i11) != 0) {
                        c1018l.d(i13, unsafe.getInt(obj, j));
                    }
                case 13:
                    if ((i7 & i11) != 0) {
                        c1018l.l(i13, unsafe.getInt(obj, j));
                    }
                case 14:
                    if ((i7 & i11) != 0) {
                        c1018l.m(i13, unsafe.getLong(obj, j));
                    }
                case 15:
                    if ((i7 & i11) != 0) {
                        c1018l.n(i13, unsafe.getInt(obj, j));
                    }
                case 16:
                    if ((i7 & i11) != 0) {
                        c1018l.o(i13, unsafe.getLong(obj, j));
                    }
                case 17:
                    if ((i7 & i11) != 0) {
                        c1018l.h(i13, unsafe.getObject(obj, j), o(i12));
                    }
                case 18:
                    b0.F(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 19:
                    b0.J(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 20:
                    b0.M(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 21:
                    b0.U(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 22:
                    b0.L(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 23:
                    b0.I(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 24:
                    b0.H(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    b0.D(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 26:
                    b0.S(iArr[i12], (List) unsafe.getObject(obj, j), c1018l);
                case 27:
                    b0.N(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, o(i12));
                case 28:
                    b0.E(iArr[i12], (List) unsafe.getObject(obj, j), c1018l);
                case 29:
                    z8 = false;
                    b0.T(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 30:
                    z8 = false;
                    b0.G(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 31:
                    z8 = false;
                    b0.O(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 32:
                    z8 = false;
                    b0.P(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 33:
                    z8 = false;
                    b0.Q(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 34:
                    z8 = false;
                    b0.R(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, false);
                case 35:
                    b0.F(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 36:
                    b0.J(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 37:
                    b0.M(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 38:
                    b0.U(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 39:
                    b0.L(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 40:
                    b0.I(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 41:
                    b0.H(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 42:
                    b0.D(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 43:
                    b0.T(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 44:
                    b0.G(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 45:
                    b0.O(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 46:
                    b0.P(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 47:
                    b0.Q(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 48:
                    b0.R(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, true);
                case 49:
                    b0.K(iArr[i12], (List) unsafe.getObject(obj, j), c1018l, o(i12));
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object n6 = n(i12);
                        this.f15739n.getClass();
                        A3.c.p(n6);
                        throw null;
                    }
                case 51:
                    if (s(obj, i13, i12)) {
                        c1018l.c(i13, ((Double) l0.f15799d.i(obj, j)).doubleValue());
                    }
                case 52:
                    if (s(obj, i13, i12)) {
                        c1018l.g(i13, ((Float) l0.f15799d.i(obj, j)).floatValue());
                    }
                case 53:
                    if (s(obj, i13, i12)) {
                        c1018l.j(i13, C(obj, j));
                    }
                case 54:
                    if (s(obj, i13, i12)) {
                        c1018l.q(i13, C(obj, j));
                    }
                case 55:
                    if (s(obj, i13, i12)) {
                        c1018l.i(i13, B(obj, j));
                    }
                case 56:
                    if (s(obj, i13, i12)) {
                        c1018l.f(i13, C(obj, j));
                    }
                case 57:
                    if (s(obj, i13, i12)) {
                        c1018l.e(i13, B(obj, j));
                    }
                case 58:
                    if (s(obj, i13, i12)) {
                        c1018l.a(i13, ((Boolean) l0.f15799d.i(obj, j)).booleanValue());
                    }
                case 59:
                    if (s(obj, i13, i12)) {
                        T(i13, unsafe.getObject(obj, j), c1018l);
                    }
                case 60:
                    if (s(obj, i13, i12)) {
                        c1018l.k(i13, unsafe.getObject(obj, j), o(i12));
                    }
                case 61:
                    if (s(obj, i13, i12)) {
                        c1018l.b(i13, (AbstractC1014h) unsafe.getObject(obj, j));
                    }
                case 62:
                    if (s(obj, i13, i12)) {
                        c1018l.p(i13, B(obj, j));
                    }
                case 63:
                    if (s(obj, i13, i12)) {
                        c1018l.d(i13, B(obj, j));
                    }
                case 64:
                    if (s(obj, i13, i12)) {
                        c1018l.l(i13, B(obj, j));
                    }
                case 65:
                    if (s(obj, i13, i12)) {
                        c1018l.m(i13, C(obj, j));
                    }
                case 66:
                    if (s(obj, i13, i12)) {
                        c1018l.n(i13, B(obj, j));
                    }
                case 67:
                    if (s(obj, i13, i12)) {
                        c1018l.o(i13, C(obj, j));
                    }
                case 68:
                    if (s(obj, i13, i12)) {
                        c1018l.h(i13, unsafe.getObject(obj, j), o(i12));
                    }
                default:
            }
        }
        this.f15738m.getClass();
        ((AbstractC1028w) obj).unknownFields.d(c1018l);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void a(Object obj) {
        int[] iArr;
        int i7;
        int i10 = this.f15736i;
        while (true) {
            iArr = this.f15735h;
            i7 = this.j;
            if (i10 >= i7) {
                break;
            }
            long R10 = R(iArr[i10]) & 1048575;
            Object i11 = l0.f15799d.i(obj, R10);
            if (i11 != null) {
                this.f15739n.getClass();
                ((L) i11).f15724a = false;
                l0.u(obj, R10, i11);
            }
            i10++;
        }
        int length = iArr.length;
        while (i7 < length) {
            this.f15737l.a(obj, iArr[i7]);
            i7++;
        }
        this.f15738m.getClass();
        ((AbstractC1028w) obj).unknownFields.f15767e = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final boolean b(Object obj) {
        int i7;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z8 = true;
            if (i11 >= this.f15736i) {
                return true;
            }
            int i13 = this.f15735h[i11];
            int[] iArr = this.f15729a;
            int i14 = iArr[i13];
            int R10 = R(i13);
            boolean z10 = this.g;
            if (z10) {
                i7 = 0;
            } else {
                int i15 = iArr[i13 + 2];
                int i16 = i15 & 1048575;
                i7 = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    i12 = f15728p.getInt(obj, i16);
                    i10 = i16;
                }
            }
            if ((268435456 & R10) != 0) {
                if (!(z10 ? r(i13, obj) : (i12 & i7) != 0)) {
                    return false;
                }
            }
            int Q3 = Q(R10);
            if (Q3 == 9 || Q3 == 17) {
                if (z10) {
                    z8 = r(i13, obj);
                } else if ((i7 & i12) == 0) {
                    z8 = false;
                }
                if (z8) {
                    if (!o(i13).b(l0.f15799d.i(obj, R10 & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                if (Q3 != 27) {
                    if (Q3 == 60 || Q3 == 68) {
                        if (s(obj, i14, i13)) {
                            if (!o(i13).b(l0.f15799d.i(obj, R10 & 1048575))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (Q3 != 49) {
                        if (Q3 != 50) {
                            continue;
                        } else {
                            Object i17 = l0.f15799d.i(obj, R10 & 1048575);
                            this.f15739n.getClass();
                            if (!((L) i17).isEmpty()) {
                                A3.c.p(n(i13));
                                throw null;
                            }
                        }
                    }
                }
                List list = (List) l0.f15799d.i(obj, R10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    a0 o10 = o(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!o10.b(list.get(i18))) {
                            return false;
                        }
                    }
                }
            }
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final Object c() {
        this.k.getClass();
        return ((AbstractC1028w) this.f15733e).f(4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final int d(AbstractC1007a abstractC1007a) {
        return this.g ? q(abstractC1007a) : p(abstractC1007a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void e(AbstractC1028w abstractC1028w, AbstractC1028w abstractC1028w2) {
        abstractC1028w2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f15729a;
            if (i7 >= iArr.length) {
                b0.B(this.f15738m, abstractC1028w, abstractC1028w2);
                return;
            }
            int R10 = R(i7);
            long j = 1048575 & R10;
            int i10 = iArr[i7];
            switch (Q(R10)) {
                case 0:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.q(abstractC1028w, j, l0.f15799d.e(abstractC1028w2, j));
                        N(i7, abstractC1028w);
                        break;
                    }
                case 1:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.r(abstractC1028w, j, l0.f15799d.f(abstractC1028w2, j));
                        N(i7, abstractC1028w);
                        break;
                    }
                case 2:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.t(abstractC1028w, j, l0.f15799d.h(abstractC1028w2, j));
                        N(i7, abstractC1028w);
                        break;
                    }
                case 3:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.t(abstractC1028w, j, l0.f15799d.h(abstractC1028w2, j));
                        N(i7, abstractC1028w);
                        break;
                    }
                case 4:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.s(abstractC1028w, l0.f15799d.g(abstractC1028w2, j), j);
                        N(i7, abstractC1028w);
                        break;
                    }
                case 5:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.t(abstractC1028w, j, l0.f15799d.h(abstractC1028w2, j));
                        N(i7, abstractC1028w);
                        break;
                    }
                case 6:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.s(abstractC1028w, l0.f15799d.g(abstractC1028w2, j), j);
                        N(i7, abstractC1028w);
                        break;
                    }
                case 7:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.m(abstractC1028w, j, l0.f15799d.c(abstractC1028w2, j));
                        N(i7, abstractC1028w);
                        break;
                    }
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.u(abstractC1028w, j, l0.f15799d.i(abstractC1028w2, j));
                        N(i7, abstractC1028w);
                        break;
                    }
                case 9:
                    w(abstractC1028w, abstractC1028w2, i7);
                    break;
                case 10:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.u(abstractC1028w, j, l0.f15799d.i(abstractC1028w2, j));
                        N(i7, abstractC1028w);
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.s(abstractC1028w, l0.f15799d.g(abstractC1028w2, j), j);
                        N(i7, abstractC1028w);
                        break;
                    }
                case 12:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.s(abstractC1028w, l0.f15799d.g(abstractC1028w2, j), j);
                        N(i7, abstractC1028w);
                        break;
                    }
                case 13:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.s(abstractC1028w, l0.f15799d.g(abstractC1028w2, j), j);
                        N(i7, abstractC1028w);
                        break;
                    }
                case 14:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.t(abstractC1028w, j, l0.f15799d.h(abstractC1028w2, j));
                        N(i7, abstractC1028w);
                        break;
                    }
                case 15:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.s(abstractC1028w, l0.f15799d.g(abstractC1028w2, j), j);
                        N(i7, abstractC1028w);
                        break;
                    }
                case 16:
                    if (!r(i7, abstractC1028w2)) {
                        break;
                    } else {
                        l0.t(abstractC1028w, j, l0.f15799d.h(abstractC1028w2, j));
                        N(i7, abstractC1028w);
                        break;
                    }
                case 17:
                    w(abstractC1028w, abstractC1028w2, i7);
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
                    this.f15737l.b(abstractC1028w, abstractC1028w2, j);
                    break;
                case 50:
                    Class cls = b0.f15756a;
                    k0 k0Var = l0.f15799d;
                    Object i11 = k0Var.i(abstractC1028w, j);
                    Object i12 = k0Var.i(abstractC1028w2, j);
                    this.f15739n.getClass();
                    l0.u(abstractC1028w, j, M.d(i11, i12));
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
                    if (!s(abstractC1028w2, i10, i7)) {
                        break;
                    } else {
                        l0.u(abstractC1028w, j, l0.f15799d.i(abstractC1028w2, j));
                        O(abstractC1028w, i10, i7);
                        break;
                    }
                case 60:
                    x(abstractC1028w, abstractC1028w2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!s(abstractC1028w2, i10, i7)) {
                        break;
                    } else {
                        l0.u(abstractC1028w, j, l0.f15799d.i(abstractC1028w2, j));
                        O(abstractC1028w, i10, i7);
                        break;
                    }
                case 68:
                    x(abstractC1028w, abstractC1028w2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.b0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.b0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.b0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.b0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r12, r7)) == java.lang.Float.floatToIntBits(r5.f(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r12, r7)) == java.lang.Double.doubleToLongBits(r5.e(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.b0.C(r9.i(r12, r7), r9.i(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1 A[LOOP:0: B:2:0x0005->B:86:0x01f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(AbstractC1028w abstractC1028w, AbstractC1028w abstractC1028w2) {
        int[] iArr = this.f15729a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean z8 = true;
            if (i7 >= length) {
                this.f15738m.getClass();
                return abstractC1028w.unknownFields.equals(abstractC1028w2.unknownFields);
            }
            int R10 = R(i7);
            long j = R10 & 1048575;
            switch (Q(R10)) {
                case 0:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                        return false;
                    }
                    i7 += 3;
                case 1:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var2 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 2:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var3 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 3:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var4 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 4:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var5 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 5:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var6 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 6:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var7 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 7:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var8 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var9 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 9:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var10 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 10:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var11 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var12 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 12:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var13 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 13:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var14 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 14:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var15 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 15:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var16 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 16:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var17 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 17:
                    if (k(abstractC1028w, abstractC1028w2, i7)) {
                        k0 k0Var18 = l0.f15799d;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
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
                    k0 k0Var19 = l0.f15799d;
                    z8 = b0.C(k0Var19.i(abstractC1028w, j), k0Var19.i(abstractC1028w2, j));
                    if (z8) {
                    }
                    break;
                case 50:
                    k0 k0Var20 = l0.f15799d;
                    z8 = b0.C(k0Var20.i(abstractC1028w, j), k0Var20.i(abstractC1028w2, j));
                    if (z8) {
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
                    long j10 = iArr[i7 + 2] & 1048575;
                    k0 k0Var21 = l0.f15799d;
                    if (k0Var21.g(abstractC1028w, j10) == k0Var21.g(abstractC1028w2, j10)) {
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                default:
                    if (z8) {
                    }
                    break;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void g(Object obj, C0305t c0305t, C1021o c1021o) {
        c1021o.getClass();
        u(this.f15738m, obj, c0305t, c1021o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void h(Object obj, C1018l c1018l) {
        c1018l.getClass();
        if (!this.g) {
            S(obj, c1018l);
            return;
        }
        int[] iArr = this.f15729a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int R10 = R(i7);
            int i10 = iArr[i7];
            switch (Q(R10)) {
                case 0:
                    if (r(i7, obj)) {
                        c1018l.c(i10, l0.f15799d.e(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(i7, obj)) {
                        c1018l.g(i10, l0.f15799d.f(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(i7, obj)) {
                        c1018l.j(i10, l0.f15799d.h(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(i7, obj)) {
                        c1018l.q(i10, l0.f15799d.h(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(i7, obj)) {
                        c1018l.i(i10, l0.f15799d.g(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(i7, obj)) {
                        c1018l.f(i10, l0.f15799d.h(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(i7, obj)) {
                        c1018l.e(i10, l0.f15799d.g(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(i7, obj)) {
                        c1018l.a(i10, l0.f15799d.c(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    if (r(i7, obj)) {
                        T(i10, l0.f15799d.i(obj, R10 & 1048575), c1018l);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (r(i7, obj)) {
                        c1018l.k(i10, l0.f15799d.i(obj, R10 & 1048575), o(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(i7, obj)) {
                        c1018l.b(i10, (AbstractC1014h) l0.f15799d.i(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (r(i7, obj)) {
                        c1018l.p(i10, l0.f15799d.g(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(i7, obj)) {
                        c1018l.d(i10, l0.f15799d.g(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(i7, obj)) {
                        c1018l.l(i10, l0.f15799d.g(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(i7, obj)) {
                        c1018l.m(i10, l0.f15799d.h(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(i7, obj)) {
                        c1018l.n(i10, l0.f15799d.g(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(i7, obj)) {
                        c1018l.o(i10, l0.f15799d.h(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(i7, obj)) {
                        c1018l.h(i10, l0.f15799d.i(obj, R10 & 1048575), o(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    b0.F(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 19:
                    b0.J(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 20:
                    b0.M(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 21:
                    b0.U(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 22:
                    b0.L(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 23:
                    b0.I(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 24:
                    b0.H(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    b0.D(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 26:
                    b0.S(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l);
                    break;
                case 27:
                    b0.N(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, o(i7));
                    break;
                case 28:
                    b0.E(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l);
                    break;
                case 29:
                    b0.T(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 30:
                    b0.G(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 31:
                    b0.O(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 32:
                    b0.P(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 33:
                    b0.Q(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 34:
                    b0.R(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, false);
                    break;
                case 35:
                    b0.F(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 36:
                    b0.J(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 37:
                    b0.M(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 38:
                    b0.U(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 39:
                    b0.L(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 40:
                    b0.I(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 41:
                    b0.H(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 42:
                    b0.D(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 43:
                    b0.T(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 44:
                    b0.G(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 45:
                    b0.O(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 46:
                    b0.P(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 47:
                    b0.Q(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 48:
                    b0.R(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, true);
                    break;
                case 49:
                    b0.K(iArr[i7], (List) l0.f15799d.i(obj, R10 & 1048575), c1018l, o(i7));
                    break;
                case 50:
                    if (l0.f15799d.i(obj, R10 & 1048575) != null) {
                        Object n6 = n(i7);
                        this.f15739n.getClass();
                        A3.c.p(n6);
                        throw null;
                    }
                    break;
                case 51:
                    if (s(obj, i10, i7)) {
                        c1018l.c(i10, ((Double) l0.f15799d.i(obj, R10 & 1048575)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(obj, i10, i7)) {
                        c1018l.g(i10, ((Float) l0.f15799d.i(obj, R10 & 1048575)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(obj, i10, i7)) {
                        c1018l.j(i10, C(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(obj, i10, i7)) {
                        c1018l.q(i10, C(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(obj, i10, i7)) {
                        c1018l.i(i10, B(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(obj, i10, i7)) {
                        c1018l.f(i10, C(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(obj, i10, i7)) {
                        c1018l.e(i10, B(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(obj, i10, i7)) {
                        c1018l.a(i10, ((Boolean) l0.f15799d.i(obj, R10 & 1048575)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(obj, i10, i7)) {
                        T(i10, l0.f15799d.i(obj, R10 & 1048575), c1018l);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(obj, i10, i7)) {
                        c1018l.k(i10, l0.f15799d.i(obj, R10 & 1048575), o(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(obj, i10, i7)) {
                        c1018l.b(i10, (AbstractC1014h) l0.f15799d.i(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(obj, i10, i7)) {
                        c1018l.p(i10, B(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(obj, i10, i7)) {
                        c1018l.d(i10, B(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(obj, i10, i7)) {
                        c1018l.l(i10, B(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(obj, i10, i7)) {
                        c1018l.m(i10, C(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(obj, i10, i7)) {
                        c1018l.n(i10, B(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(obj, i10, i7)) {
                        c1018l.o(i10, C(obj, R10 & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(obj, i10, i7)) {
                        c1018l.h(i10, l0.f15799d.i(obj, R10 & 1048575), o(i7));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f15738m.getClass();
        ((AbstractC1028w) obj).unknownFields.d(c1018l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.crypto.tink.shaded.protobuf.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(AbstractC1028w abstractC1028w) {
        int i7;
        int b2;
        int i10;
        int[] iArr = this.f15729a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int R10 = R(i12);
            int i13 = iArr[i12];
            long j = 1048575 & R10;
            int i14 = 1237;
            int i15 = 37;
            switch (Q(R10)) {
                case 0:
                    i7 = i11 * 53;
                    b2 = A.b(Double.doubleToLongBits(l0.f15799d.e(abstractC1028w, j)));
                    i11 = b2 + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    b2 = Float.floatToIntBits(l0.f15799d.f(abstractC1028w, j));
                    i11 = b2 + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    b2 = A.b(l0.f15799d.h(abstractC1028w, j));
                    i11 = b2 + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    b2 = A.b(l0.f15799d.h(abstractC1028w, j));
                    i11 = b2 + i7;
                    break;
                case 4:
                    i7 = i11 * 53;
                    b2 = l0.f15799d.g(abstractC1028w, j);
                    i11 = b2 + i7;
                    break;
                case 5:
                    i7 = i11 * 53;
                    b2 = A.b(l0.f15799d.h(abstractC1028w, j));
                    i11 = b2 + i7;
                    break;
                case 6:
                    i7 = i11 * 53;
                    b2 = l0.f15799d.g(abstractC1028w, j);
                    i11 = b2 + i7;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean c10 = l0.f15799d.c(abstractC1028w, j);
                    Charset charset = A.f15705a;
                    break;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    i7 = i11 * 53;
                    b2 = ((String) l0.f15799d.i(abstractC1028w, j)).hashCode();
                    i11 = b2 + i7;
                    break;
                case 9:
                    Object i16 = l0.f15799d.i(abstractC1028w, j);
                    if (i16 != null) {
                        i15 = i16.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i7 = i11 * 53;
                    b2 = l0.f15799d.i(abstractC1028w, j).hashCode();
                    i11 = b2 + i7;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i7 = i11 * 53;
                    b2 = l0.f15799d.g(abstractC1028w, j);
                    i11 = b2 + i7;
                    break;
                case 12:
                    i7 = i11 * 53;
                    b2 = l0.f15799d.g(abstractC1028w, j);
                    i11 = b2 + i7;
                    break;
                case 13:
                    i7 = i11 * 53;
                    b2 = l0.f15799d.g(abstractC1028w, j);
                    i11 = b2 + i7;
                    break;
                case 14:
                    i7 = i11 * 53;
                    b2 = A.b(l0.f15799d.h(abstractC1028w, j));
                    i11 = b2 + i7;
                    break;
                case 15:
                    i7 = i11 * 53;
                    b2 = l0.f15799d.g(abstractC1028w, j);
                    i11 = b2 + i7;
                    break;
                case 16:
                    i7 = i11 * 53;
                    b2 = A.b(l0.f15799d.h(abstractC1028w, j));
                    i11 = b2 + i7;
                    break;
                case 17:
                    Object i17 = l0.f15799d.i(abstractC1028w, j);
                    if (i17 != null) {
                        i15 = i17.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
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
                    b2 = l0.f15799d.i(abstractC1028w, j).hashCode();
                    i11 = b2 + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    b2 = l0.f15799d.i(abstractC1028w, j).hashCode();
                    i11 = b2 + i7;
                    break;
                case 51:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = A.b(Double.doubleToLongBits(((Double) l0.f15799d.i(abstractC1028w, j)).doubleValue()));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = Float.floatToIntBits(((Float) l0.f15799d.i(abstractC1028w, j)).floatValue());
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = A.b(C(abstractC1028w, j));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = A.b(C(abstractC1028w, j));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = B(abstractC1028w, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = A.b(C(abstractC1028w, j));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = B(abstractC1028w, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(abstractC1028w, i13, i12)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) l0.f15799d.i(abstractC1028w, j)).booleanValue();
                        Charset charset2 = A.f15705a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = ((String) l0.f15799d.i(abstractC1028w, j)).hashCode();
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = l0.f15799d.i(abstractC1028w, j).hashCode();
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = l0.f15799d.i(abstractC1028w, j).hashCode();
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = B(abstractC1028w, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = B(abstractC1028w, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = B(abstractC1028w, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = A.b(C(abstractC1028w, j));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = B(abstractC1028w, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = A.b(C(abstractC1028w, j));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(abstractC1028w, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = l0.f15799d.i(abstractC1028w, j).hashCode();
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f15738m.getClass();
        return abstractC1028w.unknownFields.hashCode() + (i11 * 53);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final void j(Object obj, byte[] bArr, int i7, int i10, P4.Z z8) {
        if (this.g) {
            G(obj, bArr, i7, i10, z8);
        } else {
            F(obj, bArr, i7, i10, 0, z8);
        }
    }

    public final boolean k(AbstractC1028w abstractC1028w, AbstractC1028w abstractC1028w2, int i7) {
        return r(i7, abstractC1028w) == r(i7, abstractC1028w2);
    }

    public final void l(int i7, Object obj, Object obj2) {
        int i10 = this.f15729a[i7];
        if (l0.f15799d.i(obj, R(i7) & 1048575) == null) {
            return;
        }
        m(i7);
    }

    public final void m(int i7) {
        if (this.f15730b[((i7 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object n(int i7) {
        return this.f15730b[(i7 / 3) * 2];
    }

    public final a0 o(int i7) {
        int i10 = (i7 / 3) * 2;
        Object[] objArr = this.f15730b;
        a0 a0Var = (a0) objArr[i10];
        if (a0Var != null) {
            return a0Var;
        }
        a0 a9 = X.f15745c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a9;
        return a9;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0034. Please report as an issue. */
    public final int p(AbstractC1007a abstractC1007a) {
        int i7;
        int a02;
        int Y2;
        Unsafe unsafe = f15728p;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f15729a;
            if (i11 >= iArr.length) {
                this.f15738m.getClass();
                return ((AbstractC1028w) abstractC1007a).unknownFields.a() + i12;
            }
            int R10 = R(i11);
            int i14 = iArr[i11];
            int Q3 = Q(R10);
            if (Q3 <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & 1048575;
                i7 = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    i13 = unsafe.getInt(abstractC1007a, i16);
                    i10 = i16;
                }
            } else {
                i7 = 0;
            }
            long j = R10 & 1048575;
            switch (Q3) {
                case 0:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.a0(i14);
                        i12 += a02;
                        break;
                    }
                case 1:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.e0(i14);
                        i12 += a02;
                        break;
                    }
                case 2:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.i0(i14, unsafe.getLong(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 3:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.s0(i14, unsafe.getLong(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 4:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.g0(i14, unsafe.getInt(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 5:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.d0(i14);
                        i12 += a02;
                        break;
                    }
                case 6:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.c0(i14);
                        i12 += a02;
                        break;
                    }
                case 7:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.X(i14);
                        i12 += a02;
                        break;
                    }
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC1007a, j);
                        Y2 = object instanceof AbstractC1014h ? C1016j.Y(i14, (AbstractC1014h) object) : C1016j.n0(i14, (String) object);
                        i12 = Y2 + i12;
                        break;
                    }
                case 9:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = b0.o(i14, unsafe.getObject(abstractC1007a, j), o(i11));
                        i12 += a02;
                        break;
                    }
                case 10:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.Y(i14, (AbstractC1014h) unsafe.getObject(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.q0(i14, unsafe.getInt(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 12:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.b0(i14, unsafe.getInt(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 13:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.j0(i14);
                        i12 += a02;
                        break;
                    }
                case 14:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.k0(i14);
                        i12 += a02;
                        break;
                    }
                case 15:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.l0(i14, unsafe.getInt(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 16:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.m0(i14, unsafe.getLong(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 17:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        a02 = C1016j.f0(i14, (AbstractC1007a) unsafe.getObject(abstractC1007a, j), o(i11));
                        i12 += a02;
                        break;
                    }
                case 18:
                    a02 = b0.h(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 19:
                    a02 = b0.f(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 20:
                    a02 = b0.m(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 21:
                    a02 = b0.x(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 22:
                    a02 = b0.k(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 23:
                    a02 = b0.h(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 24:
                    a02 = b0.f(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    a02 = b0.a(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 26:
                    a02 = b0.u(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 27:
                    a02 = b0.p(i14, (List) unsafe.getObject(abstractC1007a, j), o(i11));
                    i12 += a02;
                    break;
                case 28:
                    a02 = b0.c(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 29:
                    a02 = b0.v(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 30:
                    a02 = b0.d(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 31:
                    a02 = b0.f(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 32:
                    a02 = b0.h(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 33:
                    a02 = b0.q(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 34:
                    a02 = b0.s(i14, (List) unsafe.getObject(abstractC1007a, j));
                    i12 += a02;
                    break;
                case 35:
                    int i17 = b0.i((List) unsafe.getObject(abstractC1007a, j));
                    if (i17 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(i17, C1016j.p0(i14), i17, i12);
                        break;
                    }
                case 36:
                    int g = b0.g((List) unsafe.getObject(abstractC1007a, j));
                    if (g <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(g, C1016j.p0(i14), g, i12);
                        break;
                    }
                case 37:
                    int n6 = b0.n((List) unsafe.getObject(abstractC1007a, j));
                    if (n6 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(n6, C1016j.p0(i14), n6, i12);
                        break;
                    }
                case 38:
                    int y10 = b0.y((List) unsafe.getObject(abstractC1007a, j));
                    if (y10 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(y10, C1016j.p0(i14), y10, i12);
                        break;
                    }
                case 39:
                    int l10 = b0.l((List) unsafe.getObject(abstractC1007a, j));
                    if (l10 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(l10, C1016j.p0(i14), l10, i12);
                        break;
                    }
                case 40:
                    int i18 = b0.i((List) unsafe.getObject(abstractC1007a, j));
                    if (i18 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(i18, C1016j.p0(i14), i18, i12);
                        break;
                    }
                case 41:
                    int g2 = b0.g((List) unsafe.getObject(abstractC1007a, j));
                    if (g2 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(g2, C1016j.p0(i14), g2, i12);
                        break;
                    }
                case 42:
                    int b2 = b0.b((List) unsafe.getObject(abstractC1007a, j));
                    if (b2 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(b2, C1016j.p0(i14), b2, i12);
                        break;
                    }
                case 43:
                    int w10 = b0.w((List) unsafe.getObject(abstractC1007a, j));
                    if (w10 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(w10, C1016j.p0(i14), w10, i12);
                        break;
                    }
                case 44:
                    int e2 = b0.e((List) unsafe.getObject(abstractC1007a, j));
                    if (e2 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(e2, C1016j.p0(i14), e2, i12);
                        break;
                    }
                case 45:
                    int g10 = b0.g((List) unsafe.getObject(abstractC1007a, j));
                    if (g10 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(g10, C1016j.p0(i14), g10, i12);
                        break;
                    }
                case 46:
                    int i19 = b0.i((List) unsafe.getObject(abstractC1007a, j));
                    if (i19 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(i19, C1016j.p0(i14), i19, i12);
                        break;
                    }
                case 47:
                    int r10 = b0.r((List) unsafe.getObject(abstractC1007a, j));
                    if (r10 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(r10, C1016j.p0(i14), r10, i12);
                        break;
                    }
                case 48:
                    int t5 = b0.t((List) unsafe.getObject(abstractC1007a, j));
                    if (t5 <= 0) {
                        break;
                    } else {
                        i12 = X.c.x(t5, C1016j.p0(i14), t5, i12);
                        break;
                    }
                case 49:
                    a02 = b0.j(i14, (List) unsafe.getObject(abstractC1007a, j), o(i11));
                    i12 += a02;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC1007a, j);
                    Object n8 = n(i11);
                    this.f15739n.getClass();
                    M.b(object2, n8);
                    break;
                case 51:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.a0(i14);
                        i12 += a02;
                        break;
                    }
                case 52:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.e0(i14);
                        i12 += a02;
                        break;
                    }
                case 53:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.i0(i14, C(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 54:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.s0(i14, C(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 55:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.g0(i14, B(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 56:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.d0(i14);
                        i12 += a02;
                        break;
                    }
                case 57:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.c0(i14);
                        i12 += a02;
                        break;
                    }
                case 58:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.X(i14);
                        i12 += a02;
                        break;
                    }
                case 59:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC1007a, j);
                        Y2 = object3 instanceof AbstractC1014h ? C1016j.Y(i14, (AbstractC1014h) object3) : C1016j.n0(i14, (String) object3);
                        i12 = Y2 + i12;
                        break;
                    }
                case 60:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = b0.o(i14, unsafe.getObject(abstractC1007a, j), o(i11));
                        i12 += a02;
                        break;
                    }
                case 61:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.Y(i14, (AbstractC1014h) unsafe.getObject(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 62:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.q0(i14, B(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 63:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.b0(i14, B(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 64:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.j0(i14);
                        i12 += a02;
                        break;
                    }
                case 65:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.k0(i14);
                        i12 += a02;
                        break;
                    }
                case 66:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.l0(i14, B(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 67:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.m0(i14, C(abstractC1007a, j));
                        i12 += a02;
                        break;
                    }
                case 68:
                    if (!s(abstractC1007a, i14, i11)) {
                        break;
                    } else {
                        a02 = C1016j.f0(i14, (AbstractC1007a) unsafe.getObject(abstractC1007a, j), o(i11));
                        i12 += a02;
                        break;
                    }
            }
            i11 += 3;
        }
    }

    public final int q(AbstractC1007a abstractC1007a) {
        int a02;
        Unsafe unsafe = f15728p;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f15729a;
            if (i7 >= iArr.length) {
                this.f15738m.getClass();
                return ((AbstractC1028w) abstractC1007a).unknownFields.a() + i10;
            }
            int R10 = R(i7);
            int Q3 = Q(R10);
            int i11 = iArr[i7];
            long j = R10 & 1048575;
            if (Q3 >= r.f15811b.a() && Q3 <= r.f15812c.a()) {
                int i12 = iArr[i7 + 2];
            }
            switch (Q3) {
                case 0:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.a0(i11);
                        break;
                    }
                case 1:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.e0(i11);
                        break;
                    }
                case 2:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.i0(i11, l0.j(abstractC1007a, j));
                        break;
                    }
                case 3:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.s0(i11, l0.j(abstractC1007a, j));
                        break;
                    }
                case 4:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.g0(i11, l0.i(abstractC1007a, j));
                        break;
                    }
                case 5:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.d0(i11);
                        break;
                    }
                case 6:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.c0(i11);
                        break;
                    }
                case 7:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.X(i11);
                        break;
                    }
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        Object k = l0.k(abstractC1007a, j);
                        if (!(k instanceof AbstractC1014h)) {
                            a02 = C1016j.n0(i11, (String) k);
                            break;
                        } else {
                            a02 = C1016j.Y(i11, (AbstractC1014h) k);
                            break;
                        }
                    }
                case 9:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = b0.o(i11, l0.k(abstractC1007a, j), o(i7));
                        break;
                    }
                case 10:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.Y(i11, (AbstractC1014h) l0.k(abstractC1007a, j));
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.q0(i11, l0.i(abstractC1007a, j));
                        break;
                    }
                case 12:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.b0(i11, l0.i(abstractC1007a, j));
                        break;
                    }
                case 13:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.j0(i11);
                        break;
                    }
                case 14:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.k0(i11);
                        break;
                    }
                case 15:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.l0(i11, l0.i(abstractC1007a, j));
                        break;
                    }
                case 16:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.m0(i11, l0.j(abstractC1007a, j));
                        break;
                    }
                case 17:
                    if (!r(i7, abstractC1007a)) {
                        break;
                    } else {
                        a02 = C1016j.f0(i11, (AbstractC1007a) l0.k(abstractC1007a, j), o(i7));
                        break;
                    }
                case 18:
                    a02 = b0.h(i11, t(abstractC1007a, j));
                    break;
                case 19:
                    a02 = b0.f(i11, t(abstractC1007a, j));
                    break;
                case 20:
                    a02 = b0.m(i11, t(abstractC1007a, j));
                    break;
                case 21:
                    a02 = b0.x(i11, t(abstractC1007a, j));
                    break;
                case 22:
                    a02 = b0.k(i11, t(abstractC1007a, j));
                    break;
                case 23:
                    a02 = b0.h(i11, t(abstractC1007a, j));
                    break;
                case 24:
                    a02 = b0.f(i11, t(abstractC1007a, j));
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    a02 = b0.a(i11, t(abstractC1007a, j));
                    break;
                case 26:
                    a02 = b0.u(i11, t(abstractC1007a, j));
                    break;
                case 27:
                    a02 = b0.p(i11, t(abstractC1007a, j), o(i7));
                    break;
                case 28:
                    a02 = b0.c(i11, t(abstractC1007a, j));
                    break;
                case 29:
                    a02 = b0.v(i11, t(abstractC1007a, j));
                    break;
                case 30:
                    a02 = b0.d(i11, t(abstractC1007a, j));
                    break;
                case 31:
                    a02 = b0.f(i11, t(abstractC1007a, j));
                    break;
                case 32:
                    a02 = b0.h(i11, t(abstractC1007a, j));
                    break;
                case 33:
                    a02 = b0.q(i11, t(abstractC1007a, j));
                    break;
                case 34:
                    a02 = b0.s(i11, t(abstractC1007a, j));
                    break;
                case 35:
                    int i13 = b0.i((List) unsafe.getObject(abstractC1007a, j));
                    if (i13 > 0) {
                        i10 = X.c.x(i13, C1016j.p0(i11), i13, i10);
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    int g = b0.g((List) unsafe.getObject(abstractC1007a, j));
                    if (g > 0) {
                        i10 = X.c.x(g, C1016j.p0(i11), g, i10);
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    int n6 = b0.n((List) unsafe.getObject(abstractC1007a, j));
                    if (n6 > 0) {
                        i10 = X.c.x(n6, C1016j.p0(i11), n6, i10);
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    int y10 = b0.y((List) unsafe.getObject(abstractC1007a, j));
                    if (y10 > 0) {
                        i10 = X.c.x(y10, C1016j.p0(i11), y10, i10);
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    int l10 = b0.l((List) unsafe.getObject(abstractC1007a, j));
                    if (l10 > 0) {
                        i10 = X.c.x(l10, C1016j.p0(i11), l10, i10);
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    int i14 = b0.i((List) unsafe.getObject(abstractC1007a, j));
                    if (i14 > 0) {
                        i10 = X.c.x(i14, C1016j.p0(i11), i14, i10);
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    int g2 = b0.g((List) unsafe.getObject(abstractC1007a, j));
                    if (g2 > 0) {
                        i10 = X.c.x(g2, C1016j.p0(i11), g2, i10);
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int b2 = b0.b((List) unsafe.getObject(abstractC1007a, j));
                    if (b2 > 0) {
                        i10 = X.c.x(b2, C1016j.p0(i11), b2, i10);
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    int w10 = b0.w((List) unsafe.getObject(abstractC1007a, j));
                    if (w10 > 0) {
                        i10 = X.c.x(w10, C1016j.p0(i11), w10, i10);
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    int e2 = b0.e((List) unsafe.getObject(abstractC1007a, j));
                    if (e2 > 0) {
                        i10 = X.c.x(e2, C1016j.p0(i11), e2, i10);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    int g10 = b0.g((List) unsafe.getObject(abstractC1007a, j));
                    if (g10 > 0) {
                        i10 = X.c.x(g10, C1016j.p0(i11), g10, i10);
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    int i15 = b0.i((List) unsafe.getObject(abstractC1007a, j));
                    if (i15 > 0) {
                        i10 = X.c.x(i15, C1016j.p0(i11), i15, i10);
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    int r10 = b0.r((List) unsafe.getObject(abstractC1007a, j));
                    if (r10 > 0) {
                        i10 = X.c.x(r10, C1016j.p0(i11), r10, i10);
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    int t5 = b0.t((List) unsafe.getObject(abstractC1007a, j));
                    if (t5 > 0) {
                        i10 = X.c.x(t5, C1016j.p0(i11), t5, i10);
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    a02 = b0.j(i11, t(abstractC1007a, j), o(i7));
                    break;
                case 50:
                    Object k7 = l0.k(abstractC1007a, j);
                    Object n8 = n(i7);
                    this.f15739n.getClass();
                    M.b(k7, n8);
                    continue;
                case 51:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.a0(i11);
                        break;
                    }
                case 52:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.e0(i11);
                        break;
                    }
                case 53:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.i0(i11, C(abstractC1007a, j));
                        break;
                    }
                case 54:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.s0(i11, C(abstractC1007a, j));
                        break;
                    }
                case 55:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.g0(i11, B(abstractC1007a, j));
                        break;
                    }
                case 56:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.d0(i11);
                        break;
                    }
                case 57:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.c0(i11);
                        break;
                    }
                case 58:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.X(i11);
                        break;
                    }
                case 59:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        Object k10 = l0.k(abstractC1007a, j);
                        if (!(k10 instanceof AbstractC1014h)) {
                            a02 = C1016j.n0(i11, (String) k10);
                            break;
                        } else {
                            a02 = C1016j.Y(i11, (AbstractC1014h) k10);
                            break;
                        }
                    }
                case 60:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = b0.o(i11, l0.k(abstractC1007a, j), o(i7));
                        break;
                    }
                case 61:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.Y(i11, (AbstractC1014h) l0.k(abstractC1007a, j));
                        break;
                    }
                case 62:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.q0(i11, B(abstractC1007a, j));
                        break;
                    }
                case 63:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.b0(i11, B(abstractC1007a, j));
                        break;
                    }
                case 64:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.j0(i11);
                        break;
                    }
                case 65:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.k0(i11);
                        break;
                    }
                case 66:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.l0(i11, B(abstractC1007a, j));
                        break;
                    }
                case 67:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.m0(i11, C(abstractC1007a, j));
                        break;
                    }
                case 68:
                    if (!s(abstractC1007a, i11, i7)) {
                        break;
                    } else {
                        a02 = C1016j.f0(i11, (AbstractC1007a) l0.k(abstractC1007a, j), o(i7));
                        break;
                    }
            }
            i10 = a02 + i10;
            i7 += 3;
        }
    }

    public final boolean r(int i7, Object obj) {
        if (!this.g) {
            int i10 = this.f15729a[i7 + 2];
            return (l0.f15799d.g(obj, (long) (i10 & 1048575)) & (1 << (i10 >>> 20))) != 0;
        }
        int R10 = R(i7);
        long j = R10 & 1048575;
        switch (Q(R10)) {
            case 0:
                return l0.f15799d.e(obj, j) != 0.0d;
            case 1:
                return l0.f15799d.f(obj, j) != 0.0f;
            case 2:
                return l0.f15799d.h(obj, j) != 0;
            case 3:
                return l0.f15799d.h(obj, j) != 0;
            case 4:
                return l0.f15799d.g(obj, j) != 0;
            case 5:
                return l0.f15799d.h(obj, j) != 0;
            case 6:
                return l0.f15799d.g(obj, j) != 0;
            case 7:
                return l0.f15799d.c(obj, j);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                Object i11 = l0.f15799d.i(obj, j);
                if (i11 instanceof String) {
                    return !((String) i11).isEmpty();
                }
                if (i11 instanceof AbstractC1014h) {
                    return !AbstractC1014h.f15775b.equals(i11);
                }
                throw new IllegalArgumentException();
            case 9:
                return l0.f15799d.i(obj, j) != null;
            case 10:
                return !AbstractC1014h.f15775b.equals(l0.f15799d.i(obj, j));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return l0.f15799d.g(obj, j) != 0;
            case 12:
                return l0.f15799d.g(obj, j) != 0;
            case 13:
                return l0.f15799d.g(obj, j) != 0;
            case 14:
                return l0.f15799d.h(obj, j) != 0;
            case 15:
                return l0.f15799d.g(obj, j) != 0;
            case 16:
                return l0.f15799d.h(obj, j) != 0;
            case 17:
                return l0.f15799d.i(obj, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(Object obj, int i7, int i10) {
        return l0.f15799d.g(obj, (long) (this.f15729a[i10 + 2] & 1048575)) == i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0083. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0650 A[Catch: all -> 0x065e, TryCatch #8 {all -> 0x065e, blocks: (B:36:0x064b, B:38:0x0650, B:40:0x0657, B:42:0x0661), top: B:35:0x064b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0667 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0687 A[LOOP:3: B:57:0x0685->B:58:0x0687, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0691  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(d0 d0Var, Object obj, C0305t c0305t, C1021o c1021o) {
        int i7;
        int i10;
        c0 c0Var;
        c0 c0Var2;
        int Q3;
        I i11;
        c0 c0Var3;
        int[] iArr = this.f15735h;
        int i12 = this.j;
        int i13 = this.f15736i;
        Throwable th = null;
        c0 c0Var4 = null;
        while (true) {
            try {
                int c10 = c0305t.c();
                try {
                    int P10 = (c10 < this.f15731c || c10 > this.f15732d) ? -1 : P(c10, 0);
                    c0 c0Var5 = c0.f15762f;
                    if (P10 >= 0) {
                        int R10 = R(P10);
                        try {
                            Q3 = Q(R10);
                            i11 = this.f15737l;
                        } catch (B unused) {
                            c0Var2 = c0Var5;
                        }
                        switch (Q3) {
                            case 0:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.q(obj, A(R10), c0305t.p());
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 1:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.r(obj, A(R10), c0305t.C());
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 2:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.t(obj, A(R10), c0305t.K());
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 3:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.t(obj, A(R10), c0305t.i0());
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 4:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.s(obj, c0305t.H(), A(R10));
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 5:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.t(obj, A(R10), c0305t.z());
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 6:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.s(obj, c0305t.w(), A(R10));
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 7:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.m(obj, A(R10), c0305t.i());
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                i7 = i13;
                                c0Var = c0Var4;
                                K(R10, c0305t, obj);
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 9:
                                i7 = i13;
                                c0Var = c0Var4;
                                if (r(P10, obj)) {
                                    l0.u(obj, A(R10), A.c(l0.k(obj, A(R10)), c0305t.O(o(P10), c1021o)));
                                } else {
                                    l0.u(obj, A(R10), c0305t.O(o(P10), c1021o));
                                    N(P10, obj);
                                }
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 10:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.u(obj, A(R10), c0305t.m());
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.s(obj, c0305t.f0(), A(R10));
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 12:
                                i7 = i13;
                                c0Var = c0Var4;
                                int s3 = c0305t.s();
                                m(P10);
                                l0.s(obj, s3, A(R10));
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 13:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.s(obj, c0305t.P(), A(R10));
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 14:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.t(obj, A(R10), c0305t.S());
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 15:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.s(obj, c0305t.V(), A(R10));
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 16:
                                i7 = i13;
                                c0Var = c0Var4;
                                l0.t(obj, A(R10), c0305t.Y());
                                N(P10, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 17:
                                i7 = i13;
                                c0Var = c0Var4;
                                if (r(P10, obj)) {
                                    l0.u(obj, A(R10), A.c(l0.k(obj, A(R10)), c0305t.G(o(P10), c1021o)));
                                } else {
                                    l0.u(obj, A(R10), c0305t.G(o(P10), c1021o));
                                    N(P10, obj);
                                }
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 18:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.r(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 19:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.E(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 20:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.M(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 21:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.k0(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 22:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.J(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 23:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.B(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 24:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.y(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.k(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 26:
                                i7 = i13;
                                c0Var = c0Var4;
                                L(R10, c0305t, obj);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 27:
                                i7 = i13;
                                c0Var = c0Var4;
                                J(obj, R10, c0305t, o(P10), c1021o);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 28:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.o(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 29:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.h0(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 30:
                                i7 = i13;
                                c0Var = c0Var4;
                                List c11 = i11.c(obj, A(R10));
                                c0305t.u(c11);
                                m(P10);
                                b0.z(c10, c11, c0Var, d0Var);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 31:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.R(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 32:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.U(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 33:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.X(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 34:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.a0(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 35:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.r(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 36:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.E(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 37:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.M(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 38:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.k0(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 39:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.J(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 40:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.B(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 41:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.y(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 42:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.k(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 43:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.h0(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 44:
                                i7 = i13;
                                c0Var = c0Var4;
                                List c12 = i11.c(obj, A(R10));
                                c0305t.u(c12);
                                m(P10);
                                b0.z(c10, c12, c0Var, d0Var);
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 45:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.R(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 46:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.U(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 47:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.X(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 48:
                                i7 = i13;
                                c0Var = c0Var4;
                                c0305t.a0(i11.c(obj, A(R10)));
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 49:
                                try {
                                    c0Var2 = c0Var5;
                                    i7 = i13;
                                    c0Var = c0Var4;
                                } catch (B unused2) {
                                    c0Var2 = c0Var5;
                                    i7 = i13;
                                    try {
                                        d0Var.getClass();
                                        if (c0Var4 == null) {
                                            AbstractC1028w abstractC1028w = (AbstractC1028w) obj;
                                            c0 c0Var6 = abstractC1028w.unknownFields;
                                            if (c0Var6 == c0Var2) {
                                                c0Var6 = c0.b();
                                                abstractC1028w.unknownFields = c0Var6;
                                            }
                                            c0Var4 = c0Var6;
                                        }
                                        if (!d0.a(c0Var4, c0305t)) {
                                            for (int i14 = i7; i14 < i12; i14++) {
                                                l(iArr[i14], obj, c0Var4);
                                            }
                                            if (c0Var4 != null) {
                                                ((AbstractC1028w) obj).unknownFields = c0Var4;
                                                return;
                                            }
                                            return;
                                        }
                                        i13 = i7;
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        while (i10 < i12) {
                                        }
                                        if (c0Var4 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                try {
                                    I(obj, A(R10), c0305t, o(P10), c1021o);
                                    c0Var4 = c0Var;
                                } catch (B unused3) {
                                    c0Var4 = c0Var;
                                    d0Var.getClass();
                                    if (c0Var4 == null) {
                                    }
                                    if (!d0.a(c0Var4, c0305t)) {
                                    }
                                    i13 = i7;
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0Var4 = c0Var;
                                    while (i10 < i12) {
                                    }
                                    if (c0Var4 != null) {
                                    }
                                    throw th;
                                }
                                i13 = i7;
                                th = null;
                                break;
                            case 50:
                                c0Var3 = c0Var5;
                                v(P10, obj, n(P10));
                                throw th;
                                break;
                            case 51:
                                l0.u(obj, A(R10), Double.valueOf(c0305t.p()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 52:
                                l0.u(obj, A(R10), Float.valueOf(c0305t.C()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 53:
                                l0.u(obj, A(R10), Long.valueOf(c0305t.K()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 54:
                                l0.u(obj, A(R10), Long.valueOf(c0305t.i0()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 55:
                                l0.u(obj, A(R10), Integer.valueOf(c0305t.H()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 56:
                                l0.u(obj, A(R10), Long.valueOf(c0305t.z()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 57:
                                l0.u(obj, A(R10), Integer.valueOf(c0305t.w()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 58:
                                l0.u(obj, A(R10), Boolean.valueOf(c0305t.i()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 59:
                                K(R10, c0305t, obj);
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 60:
                                if (s(obj, c10, P10)) {
                                    l0.u(obj, A(R10), A.c(l0.k(obj, A(R10)), c0305t.O(o(P10), c1021o)));
                                } else {
                                    l0.u(obj, A(R10), c0305t.O(o(P10), c1021o));
                                    N(P10, obj);
                                }
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 61:
                                l0.u(obj, A(R10), c0305t.m());
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 62:
                                l0.u(obj, A(R10), Integer.valueOf(c0305t.f0()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 63:
                                int s10 = c0305t.s();
                                m(P10);
                                c0Var3 = c0Var5;
                                try {
                                    l0.u(obj, A(R10), Integer.valueOf(s10));
                                    O(obj, c10, P10);
                                    i7 = i13;
                                    c0Var = c0Var4;
                                    c0Var4 = c0Var;
                                } catch (B unused4) {
                                    c0Var2 = c0Var3;
                                    i7 = i13;
                                    d0Var.getClass();
                                    if (c0Var4 == null) {
                                    }
                                    if (!d0.a(c0Var4, c0305t)) {
                                    }
                                    i13 = i7;
                                    th = null;
                                }
                                i13 = i7;
                                th = null;
                                break;
                            case 64:
                                l0.u(obj, A(R10), Integer.valueOf(c0305t.P()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 65:
                                l0.u(obj, A(R10), Long.valueOf(c0305t.S()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 66:
                                l0.u(obj, A(R10), Integer.valueOf(c0305t.V()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 67:
                                l0.u(obj, A(R10), Long.valueOf(c0305t.Y()));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            case 68:
                                l0.u(obj, A(R10), c0305t.G(o(P10), c1021o));
                                O(obj, c10, P10);
                                i7 = i13;
                                c0Var = c0Var4;
                                c0Var4 = c0Var;
                                i13 = i7;
                                th = null;
                                break;
                            default:
                                if (c0Var4 == null) {
                                    try {
                                        d0Var.getClass();
                                        c0Var4 = d0.b();
                                    } catch (B unused5) {
                                        c0Var2 = c0Var5;
                                        i7 = i13;
                                        d0Var.getClass();
                                        if (c0Var4 == null) {
                                        }
                                        if (!d0.a(c0Var4, c0305t)) {
                                        }
                                        i13 = i7;
                                        th = null;
                                    }
                                }
                                d0Var.getClass();
                                if (!d0.a(c0Var4, c0305t)) {
                                    while (i13 < i12) {
                                        l(iArr[i13], obj, c0Var4);
                                        i13++;
                                    }
                                    ((AbstractC1028w) obj).unknownFields = c0Var4;
                                    return;
                                }
                                i7 = i13;
                                i13 = i7;
                                th = null;
                                break;
                        }
                    } else {
                        if (c10 == Integer.MAX_VALUE) {
                            while (i13 < i12) {
                                l(iArr[i13], obj, c0Var4);
                                i13++;
                            }
                            if (c0Var4 != null) {
                                d0Var.getClass();
                                ((AbstractC1028w) obj).unknownFields = c0Var4;
                                return;
                            }
                            return;
                        }
                        try {
                            d0Var.getClass();
                            if (c0Var4 == null) {
                                AbstractC1028w abstractC1028w2 = (AbstractC1028w) obj;
                                c0 c0Var7 = abstractC1028w2.unknownFields;
                                if (c0Var7 == c0Var5) {
                                    c0Var7 = c0.b();
                                    abstractC1028w2.unknownFields = c0Var7;
                                }
                                c0Var4 = c0Var7;
                            }
                            if (!d0.a(c0Var4, c0305t)) {
                                while (i13 < i12) {
                                    l(iArr[i13], obj, c0Var4);
                                    i13++;
                                }
                                if (c0Var4 != null) {
                                    ((AbstractC1028w) obj).unknownFields = c0Var4;
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i7 = i13;
                            for (i10 = i7; i10 < i12; i10++) {
                                l(iArr[i10], obj, c0Var4);
                            }
                            if (c0Var4 != null) {
                                d0Var.getClass();
                                ((AbstractC1028w) obj).unknownFields = c0Var4;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    i7 = i13;
                    c0Var = c0Var4;
                }
            } catch (Throwable th6) {
                th = th6;
                i7 = i13;
            }
        }
    }

    public final void v(int i7, Object obj, Object obj2) {
        long R10 = R(i7) & 1048575;
        Object i10 = l0.f15799d.i(obj, R10);
        M m10 = this.f15739n;
        if (i10 != null) {
            m10.getClass();
            if (M.c(i10)) {
                L c10 = L.f15723b.c();
                M.d(c10, i10);
                l0.u(obj, R10, c10);
                i10 = c10;
            }
        } else {
            m10.getClass();
            i10 = L.f15723b.c();
            l0.u(obj, R10, i10);
        }
        m10.getClass();
        A3.c.p(obj2);
        throw null;
    }

    public final void w(AbstractC1028w abstractC1028w, AbstractC1028w abstractC1028w2, int i7) {
        long R10 = R(i7) & 1048575;
        if (r(i7, abstractC1028w2)) {
            k0 k0Var = l0.f15799d;
            Object i10 = k0Var.i(abstractC1028w, R10);
            Object i11 = k0Var.i(abstractC1028w2, R10);
            if (i10 != null && i11 != null) {
                l0.u(abstractC1028w, R10, A.c(i10, i11));
                N(i7, abstractC1028w);
            } else if (i11 != null) {
                l0.u(abstractC1028w, R10, i11);
                N(i7, abstractC1028w);
            }
        }
    }

    public final void x(AbstractC1028w abstractC1028w, AbstractC1028w abstractC1028w2, int i7) {
        int R10 = R(i7);
        int i10 = this.f15729a[i7];
        long j = R10 & 1048575;
        if (s(abstractC1028w2, i10, i7)) {
            k0 k0Var = l0.f15799d;
            Object i11 = k0Var.i(abstractC1028w, j);
            Object i12 = k0Var.i(abstractC1028w2, j);
            if (i11 != null && i12 != null) {
                l0.u(abstractC1028w, j, A.c(i11, i12));
                O(abstractC1028w, i10, i7);
            } else if (i12 != null) {
                l0.u(abstractC1028w, j, i12);
                O(abstractC1028w, i10, i7);
            }
        }
    }
}
