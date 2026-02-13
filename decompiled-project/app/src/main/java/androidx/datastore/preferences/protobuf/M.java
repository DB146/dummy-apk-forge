package androidx.datastore.preferences.protobuf;

import H2.C0305t;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class M implements W {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f13335n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f13336o = j0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f13337a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f13338b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13339c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13340d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0798a f13341e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13342f;
    public final int[] g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13343h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13344i;
    public final O j;
    public final B k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f13345l;

    /* renamed from: m, reason: collision with root package name */
    public final I f13346m;

    public M(int[] iArr, Object[] objArr, int i7, int i10, AbstractC0798a abstractC0798a, int[] iArr2, int i11, int i12, O o10, B b2, e0 e0Var, C0811n c0811n, I i13) {
        this.f13337a = iArr;
        this.f13338b = objArr;
        this.f13339c = i7;
        this.f13340d = i10;
        this.f13342f = abstractC0798a instanceof AbstractC0817u;
        this.g = iArr2;
        this.f13343h = i11;
        this.f13344i = i12;
        this.j = o10;
        this.k = b2;
        this.f13345l = e0Var;
        this.f13341e = abstractC0798a;
        this.f13346m = i13;
    }

    public static long A(Object obj, long j) {
        return ((Long) j0.f13421c.h(obj, j)).longValue();
    }

    public static Field G(Class cls, String str) {
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

    public static int L(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0817u) {
            return ((AbstractC0817u) obj).i();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static M x(V v10, O o10, B b2, e0 e0Var, C0811n c0811n, I i7) {
        int i10;
        int charAt;
        int charAt2;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
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
        int i32;
        int i33;
        int i34;
        int i35;
        Field G9;
        int i36;
        char charAt11;
        int i37;
        int i38;
        Object obj;
        Field G10;
        Object obj2;
        Field G11;
        int i39;
        char charAt12;
        int i40;
        char charAt13;
        int i41;
        char charAt14;
        int i42;
        char charAt15;
        String c10 = v10.c();
        int length = c10.length();
        char c11 = 55296;
        if (c10.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i10 = i43 + 1;
                if (c10.charAt(i43) < 55296) {
                    break;
                }
                i43 = i10;
            }
        } else {
            i10 = 1;
        }
        int i44 = i10 + 1;
        int charAt16 = c10.charAt(i10);
        if (charAt16 >= 55296) {
            int i45 = charAt16 & 8191;
            int i46 = 13;
            while (true) {
                i42 = i44 + 1;
                charAt15 = c10.charAt(i44);
                if (charAt15 < 55296) {
                    break;
                }
                i45 |= (charAt15 & 8191) << i46;
                i46 += 13;
                i44 = i42;
            }
            charAt16 = i45 | (charAt15 << i46);
            i44 = i42;
        }
        if (charAt16 == 0) {
            i13 = 0;
            charAt = 0;
            charAt2 = 0;
            i12 = 0;
            i15 = 0;
            i14 = 0;
            iArr = f13335n;
            i11 = 0;
        } else {
            int i47 = i44 + 1;
            int charAt17 = c10.charAt(i44);
            if (charAt17 >= 55296) {
                int i48 = charAt17 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    charAt10 = c10.charAt(i47);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i48 |= (charAt10 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                charAt17 = i48 | (charAt10 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int charAt18 = c10.charAt(i47);
            if (charAt18 >= 55296) {
                int i51 = charAt18 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    charAt9 = c10.charAt(i50);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i51 |= (charAt9 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                charAt18 = i51 | (charAt9 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int charAt19 = c10.charAt(i50);
            if (charAt19 >= 55296) {
                int i54 = charAt19 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    charAt8 = c10.charAt(i53);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i54 |= (charAt8 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                charAt19 = i54 | (charAt8 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            int charAt20 = c10.charAt(i53);
            if (charAt20 >= 55296) {
                int i57 = charAt20 & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    charAt7 = c10.charAt(i56);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i57 |= (charAt7 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                charAt20 = i57 | (charAt7 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            charAt = c10.charAt(i56);
            if (charAt >= 55296) {
                int i60 = charAt & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    charAt6 = c10.charAt(i59);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i60 |= (charAt6 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                charAt = i60 | (charAt6 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            charAt2 = c10.charAt(i59);
            if (charAt2 >= 55296) {
                int i63 = charAt2 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    charAt5 = c10.charAt(i62);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i63 |= (charAt5 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                charAt2 = i63 | (charAt5 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int charAt21 = c10.charAt(i62);
            if (charAt21 >= 55296) {
                int i66 = charAt21 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    charAt4 = c10.charAt(i65);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i66 |= (charAt4 & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                charAt21 = i66 | (charAt4 << i67);
                i65 = i17;
            }
            int i68 = i65 + 1;
            int charAt22 = c10.charAt(i65);
            if (charAt22 >= 55296) {
                int i69 = charAt22 & 8191;
                int i70 = 13;
                while (true) {
                    i16 = i68 + 1;
                    charAt3 = c10.charAt(i68);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i69 |= (charAt3 & 8191) << i70;
                    i70 += 13;
                    i68 = i16;
                }
                charAt22 = i69 | (charAt3 << i70);
                i68 = i16;
            }
            int i71 = (charAt17 * 2) + charAt18;
            i11 = charAt17;
            i44 = i68;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i12 = charAt19;
            i13 = i71;
            i14 = charAt22;
            i15 = charAt20;
        }
        Unsafe unsafe = f13336o;
        Object[] b10 = v10.b();
        Class<?> cls = v10.a().getClass();
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i72 = i14 + charAt2;
        int i73 = i14;
        int i74 = i72;
        int i75 = 0;
        int i76 = 0;
        while (i44 < length) {
            int i77 = i44 + 1;
            int charAt23 = c10.charAt(i44);
            if (charAt23 >= c11) {
                int i78 = charAt23 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i41 = i79 + 1;
                    charAt14 = c10.charAt(i79);
                    if (charAt14 < c11) {
                        break;
                    }
                    i78 |= (charAt14 & 8191) << i80;
                    i80 += 13;
                    i79 = i41;
                }
                charAt23 = i78 | (charAt14 << i80);
                i24 = i41;
            } else {
                i24 = i77;
            }
            int i81 = i24 + 1;
            int charAt24 = c10.charAt(i24);
            if (charAt24 >= c11) {
                int i82 = charAt24 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i40 = i83 + 1;
                    charAt13 = c10.charAt(i83);
                    i25 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i82 |= (charAt13 & 8191) << i84;
                    i84 += 13;
                    i83 = i40;
                    length = i25;
                }
                charAt24 = i82 | (charAt13 << i84);
                i26 = i40;
            } else {
                i25 = length;
                i26 = i81;
            }
            int i85 = charAt24 & 255;
            int i86 = i14;
            if ((charAt24 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            if (i85 >= 51) {
                int i87 = i26 + 1;
                int charAt25 = c10.charAt(i26);
                i27 = i75;
                char c12 = 55296;
                if (charAt25 >= 55296) {
                    int i88 = charAt25 & 8191;
                    int i89 = 13;
                    while (true) {
                        i39 = i87 + 1;
                        charAt12 = c10.charAt(i87);
                        if (charAt12 < c12) {
                            break;
                        }
                        i88 |= (charAt12 & 8191) << i89;
                        i89 += 13;
                        i87 = i39;
                        c12 = 55296;
                    }
                    charAt25 = i88 | (charAt12 << i89);
                    i87 = i39;
                }
                int i90 = i85 - 51;
                int i91 = i87;
                if (i90 == 9 || i90 == 17) {
                    i38 = i13 + 1;
                    objArr[((i76 / 3) * 2) + 1] = b10[i13];
                } else {
                    if (i90 == 12 && (P.c.a(v10.d(), 1) || (charAt24 & 2048) != 0)) {
                        i38 = i13 + 1;
                        objArr[((i76 / 3) * 2) + 1] = b10[i13];
                    }
                    int i92 = charAt25 * 2;
                    obj = b10[i92];
                    if (obj instanceof Field) {
                        G10 = G(cls, (String) obj);
                        b10[i92] = G10;
                    } else {
                        G10 = (Field) obj;
                    }
                    int i93 = i12;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(G10);
                    int i94 = i92 + 1;
                    obj2 = b10[i94];
                    int i95 = i13;
                    if (obj2 instanceof Field) {
                        G11 = G(cls, (String) obj2);
                        b10[i94] = G11;
                    } else {
                        G11 = (Field) obj2;
                    }
                    i35 = (int) unsafe.objectFieldOffset(G11);
                    i34 = objectFieldOffset;
                    i32 = i91;
                    i33 = 0;
                    i28 = i15;
                    i29 = i93;
                    i30 = i95;
                }
                i13 = i38;
                int i922 = charAt25 * 2;
                obj = b10[i922];
                if (obj instanceof Field) {
                }
                int i932 = i12;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(G10);
                int i942 = i922 + 1;
                obj2 = b10[i942];
                int i952 = i13;
                if (obj2 instanceof Field) {
                }
                i35 = (int) unsafe.objectFieldOffset(G11);
                i34 = objectFieldOffset2;
                i32 = i91;
                i33 = 0;
                i28 = i15;
                i29 = i932;
                i30 = i952;
            } else {
                i27 = i75;
                int i96 = i12;
                int i97 = i13 + 1;
                Field G12 = G(cls, (String) b10[i13]);
                i28 = i15;
                if (i85 == 9 || i85 == 17) {
                    i29 = i96;
                    objArr[((i76 / 3) * 2) + 1] = G12.getType();
                } else {
                    if (i85 == 27 || i85 == 49) {
                        i29 = i96;
                        i37 = i13 + 2;
                        objArr[((i76 / 3) * 2) + 1] = b10[i97];
                    } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                        i29 = i96;
                        if (v10.d() == 1 || (charAt24 & 2048) != 0) {
                            i37 = i13 + 2;
                            objArr[((i76 / 3) * 2) + 1] = b10[i97];
                        }
                    } else {
                        if (i85 == 50) {
                            int i98 = i73 + 1;
                            iArr[i73] = i76;
                            int i99 = (i76 / 3) * 2;
                            int i100 = i13 + 2;
                            objArr[i99] = b10[i97];
                            if ((charAt24 & 2048) != 0) {
                                i97 = i13 + 3;
                                objArr[i99 + 1] = b10[i100];
                                i73 = i98;
                            } else {
                                i73 = i98;
                                i97 = i100;
                            }
                        }
                        i29 = i96;
                    }
                    i97 = i37;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(G12);
                if ((charAt24 & 4096) == 0 || i85 > 17) {
                    i30 = i97;
                    i31 = 1048575;
                    i32 = i26;
                    i33 = 0;
                } else {
                    int i101 = i26 + 1;
                    int charAt26 = c10.charAt(i26);
                    if (charAt26 >= 55296) {
                        int i102 = charAt26 & 8191;
                        int i103 = 13;
                        while (true) {
                            i36 = i101 + 1;
                            charAt11 = c10.charAt(i101);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i102 |= (charAt11 & 8191) << i103;
                            i103 += 13;
                            i101 = i36;
                        }
                        charAt26 = i102 | (charAt11 << i103);
                        i101 = i36;
                    }
                    int i104 = (charAt26 / 32) + (i11 * 2);
                    Object obj3 = b10[i104];
                    if (obj3 instanceof Field) {
                        G9 = (Field) obj3;
                    } else {
                        G9 = G(cls, (String) obj3);
                        b10[i104] = G9;
                    }
                    i30 = i97;
                    i32 = i101;
                    i31 = (int) unsafe.objectFieldOffset(G9);
                    i33 = charAt26 % 32;
                }
                if (i85 >= 18 && i85 <= 49) {
                    iArr[i74] = objectFieldOffset3;
                    i74++;
                }
                int i105 = i31;
                i34 = objectFieldOffset3;
                i35 = i105;
            }
            int i106 = i76 + 1;
            iArr2[i76] = charAt23;
            int i107 = i76 + 2;
            String str = c10;
            iArr2[i106] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i85 << 20) | i34;
            i76 += 3;
            iArr2[i107] = (i33 << 20) | i35;
            i13 = i30;
            i14 = i86;
            i44 = i32;
            i75 = i27;
            length = i25;
            i12 = i29;
            c10 = str;
            i15 = i28;
            c11 = 55296;
        }
        return new M(iArr2, objArr, i12, i15, v10.a(), iArr, i14, i72, o10, b2, e0Var, c0811n, i7);
    }

    public static long y(int i7) {
        return i7 & 1048575;
    }

    public static int z(Object obj, long j) {
        return ((Integer) j0.f13421c.h(obj, j)).intValue();
    }

    public final int B(int i7) {
        if (i7 < this.f13339c || i7 > this.f13340d) {
            return -1;
        }
        int[] iArr = this.f13337a;
        int length = (iArr.length / 3) - 1;
        int i10 = 0;
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

    public final void C(Object obj, long j, C0305t c0305t, W w10, C0810m c0810m) {
        int z8;
        this.k.getClass();
        InterfaceC0818v b2 = B.b(obj, j);
        int i7 = c0305t.f4826b;
        if ((i7 & 7) != 3) {
            throw C0821y.b();
        }
        do {
            AbstractC0817u c10 = w10.c();
            c0305t.g(c10, w10, c0810m);
            w10.a(c10);
            ((U) b2).add(c10);
            AbstractC0807j abstractC0807j = (AbstractC0807j) c0305t.f4829e;
            if (abstractC0807j.c() || c0305t.f4828d != 0) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == i7);
        c0305t.f4828d = z8;
    }

    public final void D(Object obj, int i7, C0305t c0305t, W w10, C0810m c0810m) {
        int z8;
        this.k.getClass();
        InterfaceC0818v b2 = B.b(obj, i7 & 1048575);
        int i10 = c0305t.f4826b;
        if ((i10 & 7) != 2) {
            throw C0821y.b();
        }
        do {
            AbstractC0817u c10 = w10.c();
            c0305t.h(c10, w10, c0810m);
            w10.a(c10);
            ((U) b2).add(c10);
            AbstractC0807j abstractC0807j = (AbstractC0807j) c0305t.f4829e;
            if (abstractC0807j.c() || c0305t.f4828d != 0) {
                return;
            } else {
                z8 = abstractC0807j.z();
            }
        } while (z8 == i10);
        c0305t.f4828d = z8;
    }

    public final void E(int i7, C0305t c0305t, Object obj) {
        if ((536870912 & i7) != 0) {
            c0305t.n0(2);
            j0.o(obj, i7 & 1048575, ((AbstractC0807j) c0305t.f4829e).y());
        } else if (!this.f13342f) {
            j0.o(obj, i7 & 1048575, c0305t.l());
        } else {
            c0305t.n0(2);
            j0.o(obj, i7 & 1048575, ((AbstractC0807j) c0305t.f4829e).x());
        }
    }

    public final void F(int i7, C0305t c0305t, Object obj) {
        boolean z8 = (536870912 & i7) != 0;
        B b2 = this.k;
        if (z8) {
            b2.getClass();
            c0305t.c0(B.b(obj, i7 & 1048575), true);
        } else {
            b2.getClass();
            c0305t.c0(B.b(obj, i7 & 1048575), false);
        }
    }

    public final void H(int i7, Object obj) {
        int i10 = this.f13337a[i7 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        j0.m(obj, (1 << (i10 >>> 20)) | j0.f13421c.f(obj, j), j);
    }

    public final void I(Object obj, int i7, int i10) {
        j0.m(obj, i7, this.f13337a[i10 + 2] & 1048575);
    }

    public final void J(Object obj, int i7, AbstractC0798a abstractC0798a) {
        f13336o.putObject(obj, M(i7) & 1048575, abstractC0798a);
        H(i7, obj);
    }

    public final void K(Object obj, int i7, int i10, AbstractC0798a abstractC0798a) {
        f13336o.putObject(obj, M(i10) & 1048575, abstractC0798a);
        I(obj, i7, i10);
    }

    public final int M(int i7) {
        return this.f13337a[i7 + 1];
    }

    public final void N(Object obj, E e2) {
        int i7;
        int i10;
        int i11;
        int i12;
        int[] iArr = this.f13337a;
        int length = iArr.length;
        Unsafe unsafe = f13336o;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i16 < length) {
            int M3 = M(i16);
            int i17 = iArr[i16];
            int L = L(M3);
            if (L <= 17) {
                int i18 = iArr[i16 + 2];
                int i19 = i18 & i13;
                if (i19 != i14) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i7 = i14;
                i10 = i15;
                i11 = 1 << (i18 >>> 20);
            } else {
                i7 = i14;
                i10 = i15;
                i11 = 0;
            }
            long j = M3 & i13;
            switch (L) {
                case 0:
                    i12 = i7;
                    if (!o(obj, i16, i12, i10, i11)) {
                        break;
                    } else {
                        e2.c(i17, j0.f13421c.d(obj, j));
                        continue;
                    }
                case 1:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.g(i17, j0.f13421c.e(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.j(i17, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.q(i17, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.i(i17, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.f(i17, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.e(i17, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.a(i17, j0.f13421c.c(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C0808k) e2.f13325a).z0(i17, (String) object);
                            break;
                        } else {
                            e2.b(i17, (C0804g) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.k(i17, unsafe.getObject(obj, j), m(i16));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.b(i17, (C0804g) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.p(i17, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.d(i17, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.l(i17, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.m(i17, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.n(i17, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i12 = i7;
                    if (o(obj, i16, i12, i10, i11)) {
                        e2.o(i17, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i12 = i7;
                    if (o(obj, i16, i7, i10, i11)) {
                        e2.h(i17, unsafe.getObject(obj, j), m(i16));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    X.E(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 19:
                    X.I(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 20:
                    X.L(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 21:
                    X.T(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 22:
                    X.K(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 23:
                    X.H(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 24:
                    X.G(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    X.C(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 26:
                    X.R(iArr[i16], (List) unsafe.getObject(obj, j), e2);
                    break;
                case 27:
                    X.M(iArr[i16], (List) unsafe.getObject(obj, j), e2, m(i16));
                    break;
                case 28:
                    X.D(iArr[i16], (List) unsafe.getObject(obj, j), e2);
                    break;
                case 29:
                    X.S(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 30:
                    X.F(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 31:
                    X.N(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 32:
                    X.O(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 33:
                    X.P(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 34:
                    X.Q(iArr[i16], (List) unsafe.getObject(obj, j), e2, false);
                    break;
                case 35:
                    X.E(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 36:
                    X.I(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 37:
                    X.L(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 38:
                    X.T(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 39:
                    X.K(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 40:
                    X.H(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 41:
                    X.G(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 42:
                    X.C(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 43:
                    X.S(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 44:
                    X.F(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 45:
                    X.N(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 46:
                    X.O(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 47:
                    X.P(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 48:
                    X.Q(iArr[i16], (List) unsafe.getObject(obj, j), e2, true);
                    break;
                case 49:
                    X.J(iArr[i16], (List) unsafe.getObject(obj, j), e2, m(i16));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i20 = 2;
                        Object obj2 = this.f13338b[(i16 / 3) * 2];
                        this.f13346m.getClass();
                        F f4 = ((G) obj2).f13329a;
                        C0808k c0808k = (C0808k) e2.f13325a;
                        c0808k.getClass();
                        for (Map.Entry entry : ((H) object2).entrySet()) {
                            c0808k.B0(i17, i20);
                            c0808k.D0(G.a(f4, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0813p.b(c0808k, f4.f13326a, 1, key);
                            C0813p.b(c0808k, f4.f13327b, 2, value);
                            i20 = 2;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (q(obj, i17, i16)) {
                        e2.c(i17, ((Double) j0.f13421c.h(obj, j)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (q(obj, i17, i16)) {
                        e2.g(i17, ((Float) j0.f13421c.h(obj, j)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (q(obj, i17, i16)) {
                        e2.j(i17, A(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (q(obj, i17, i16)) {
                        e2.q(i17, A(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (q(obj, i17, i16)) {
                        e2.i(i17, z(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (q(obj, i17, i16)) {
                        e2.f(i17, A(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (q(obj, i17, i16)) {
                        e2.e(i17, z(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (q(obj, i17, i16)) {
                        e2.a(i17, ((Boolean) j0.f13421c.h(obj, j)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (q(obj, i17, i16)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((C0808k) e2.f13325a).z0(i17, (String) object3);
                            break;
                        } else {
                            e2.b(i17, (C0804g) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (q(obj, i17, i16)) {
                        e2.k(i17, unsafe.getObject(obj, j), m(i16));
                        break;
                    }
                    break;
                case 61:
                    if (q(obj, i17, i16)) {
                        e2.b(i17, (C0804g) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (q(obj, i17, i16)) {
                        e2.p(i17, z(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (q(obj, i17, i16)) {
                        e2.d(i17, z(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (q(obj, i17, i16)) {
                        e2.l(i17, z(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (q(obj, i17, i16)) {
                        e2.m(i17, A(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (q(obj, i17, i16)) {
                        e2.n(i17, z(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (q(obj, i17, i16)) {
                        e2.o(i17, A(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (q(obj, i17, i16)) {
                        e2.h(i17, unsafe.getObject(obj, j), m(i16));
                        break;
                    }
                    break;
            }
            i12 = i7;
            i16 += 3;
            i14 = i12;
            i15 = i10;
            i13 = 1048575;
        }
        this.f13345l.getClass();
        ((AbstractC0817u) obj).unknownFields.d(e2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0817u) {
                AbstractC0817u abstractC0817u = (AbstractC0817u) obj;
                abstractC0817u.d();
                abstractC0817u.c();
                abstractC0817u.j();
            }
            int[] iArr = this.f13337a;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int M3 = M(i7);
                long j = 1048575 & M3;
                int L = L(M3);
                if (L != 9) {
                    if (L != 60 && L != 68) {
                        switch (L) {
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
                                this.k.getClass();
                                B.a(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = f13336o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f13346m.getClass();
                                    I.c(object);
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(obj, iArr[i7], i7)) {
                        m(i7).a(f13336o.getObject(obj, j));
                    }
                }
                if (n(i7, obj)) {
                    m(i7).a(f13336o.getObject(obj, j));
                }
            }
            this.f13345l.getClass();
            e0.b(obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean b(Object obj) {
        int i7;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.f13343h) {
            int i14 = this.g[i13];
            int[] iArr = this.f13337a;
            int i15 = iArr[i14];
            int M3 = M(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = f13336o.getInt(obj, i17);
                }
                i10 = i12;
                i7 = i17;
            } else {
                i7 = i11;
                i10 = i12;
            }
            if ((268435456 & M3) != 0 && !o(obj, i14, i7, i10, i18)) {
                return false;
            }
            int L = L(M3);
            if (L != 9 && L != 17) {
                if (L != 27) {
                    if (L == 60 || L == 68) {
                        if (q(obj, i15, i14)) {
                            if (!m(i14).b(j0.f13421c.h(obj, M3 & 1048575))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (L != 49) {
                        if (L != 50) {
                            continue;
                        } else {
                            Object h10 = j0.f13421c.h(obj, M3 & 1048575);
                            this.f13346m.getClass();
                            H h11 = (H) h10;
                            if (h11.isEmpty()) {
                                continue;
                            } else {
                                if (((G) this.f13338b[(i14 / 3) * 2]).f13329a.f13327b.f13453a != s0.MESSAGE) {
                                    continue;
                                } else {
                                    W w10 = null;
                                    for (Object obj2 : h11.values()) {
                                        if (w10 == null) {
                                            w10 = T.f13352c.a(obj2.getClass());
                                        }
                                        if (!w10.b(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) j0.f13421c.h(obj, M3 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    W m10 = m(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!m10.b(list.get(i19))) {
                            return false;
                        }
                    }
                }
            } else if (o(obj, i14, i7, i10, i18)) {
                if (!m(i14).b(j0.f13421c.h(obj, M3 & 1048575))) {
                    return false;
                }
            } else {
                continue;
            }
            i13++;
            i11 = i7;
            i12 = i10;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0817u c() {
        this.j.getClass();
        return ((AbstractC0817u) this.f13341e).k();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj, Object obj2) {
        if (!p(obj)) {
            throw new IllegalArgumentException(X.c.g(obj, "Mutating immutable message: "));
        }
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f13337a;
            if (i7 >= iArr.length) {
                X.A(this.f13345l, obj, obj2);
                return;
            }
            int M3 = M(i7);
            long j = 1048575 & M3;
            int i10 = iArr[i7];
            switch (L(M3)) {
                case 0:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        i0 i0Var = j0.f13421c;
                        i0Var.l(obj, j, i0Var.d(obj2, j));
                        H(i7, obj);
                        break;
                    }
                case 1:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        i0 i0Var2 = j0.f13421c;
                        i0Var2.m(obj, j, i0Var2.e(obj2, j));
                        H(i7, obj);
                        break;
                    }
                case 2:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.n(obj, j, j0.f13421c.g(obj2, j));
                        H(i7, obj);
                        break;
                    }
                case 3:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.n(obj, j, j0.f13421c.g(obj2, j));
                        H(i7, obj);
                        break;
                    }
                case 4:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j0.f13421c.f(obj2, j), j);
                        H(i7, obj);
                        break;
                    }
                case 5:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.n(obj, j, j0.f13421c.g(obj2, j));
                        H(i7, obj);
                        break;
                    }
                case 6:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j0.f13421c.f(obj2, j), j);
                        H(i7, obj);
                        break;
                    }
                case 7:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        i0 i0Var3 = j0.f13421c;
                        i0Var3.j(obj, j, i0Var3.c(obj2, j));
                        H(i7, obj);
                        break;
                    }
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.o(obj, j, j0.f13421c.h(obj2, j));
                        H(i7, obj);
                        break;
                    }
                case 9:
                    t(i7, obj, obj2);
                    break;
                case 10:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.o(obj, j, j0.f13421c.h(obj2, j));
                        H(i7, obj);
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j0.f13421c.f(obj2, j), j);
                        H(i7, obj);
                        break;
                    }
                case 12:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j0.f13421c.f(obj2, j), j);
                        H(i7, obj);
                        break;
                    }
                case 13:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j0.f13421c.f(obj2, j), j);
                        H(i7, obj);
                        break;
                    }
                case 14:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.n(obj, j, j0.f13421c.g(obj2, j));
                        H(i7, obj);
                        break;
                    }
                case 15:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j0.f13421c.f(obj2, j), j);
                        H(i7, obj);
                        break;
                    }
                case 16:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        j0.n(obj, j, j0.f13421c.g(obj2, j));
                        H(i7, obj);
                        break;
                    }
                case 17:
                    t(i7, obj, obj2);
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
                    this.k.getClass();
                    i0 i0Var4 = j0.f13421c;
                    InterfaceC0818v interfaceC0818v = (InterfaceC0818v) i0Var4.h(obj, j);
                    InterfaceC0818v interfaceC0818v2 = (InterfaceC0818v) i0Var4.h(obj2, j);
                    U u3 = (U) interfaceC0818v;
                    int i11 = u3.f13357c;
                    int i12 = ((U) interfaceC0818v2).f13357c;
                    if (i11 > 0 && i12 > 0) {
                        if (!((AbstractC0799b) interfaceC0818v).f13378a) {
                            interfaceC0818v = u3.o(i12 + i11);
                        }
                        ((AbstractC0799b) interfaceC0818v).addAll(interfaceC0818v2);
                    }
                    if (i11 > 0) {
                        interfaceC0818v2 = interfaceC0818v;
                    }
                    j0.o(obj, j, interfaceC0818v2);
                    break;
                case 50:
                    Class cls = X.f13362a;
                    i0 i0Var5 = j0.f13421c;
                    Object h10 = i0Var5.h(obj, j);
                    Object h11 = i0Var5.h(obj2, j);
                    this.f13346m.getClass();
                    j0.o(obj, j, I.b(h10, h11));
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
                    if (!q(obj2, i10, i7)) {
                        break;
                    } else {
                        j0.o(obj, j, j0.f13421c.h(obj2, j));
                        I(obj, i10, i7);
                        break;
                    }
                case 60:
                    u(i7, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!q(obj2, i10, i7)) {
                        break;
                    } else {
                        j0.o(obj, j, j0.f13421c.h(obj2, j));
                        I(obj, i10, i7);
                        break;
                    }
                case 68:
                    u(i7, obj, obj2);
                    break;
            }
            i7 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void e(Object obj, E e2) {
        e2.getClass();
        N(obj, e2);
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
    @Override // androidx.datastore.preferences.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(AbstractC0817u abstractC0817u) {
        int i7;
        int b2;
        int i10;
        int[] iArr = this.f13337a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int M3 = M(i12);
            int i13 = iArr[i12];
            long j = 1048575 & M3;
            int i14 = 1237;
            int i15 = 37;
            switch (L(M3)) {
                case 0:
                    i7 = i11 * 53;
                    b2 = AbstractC0819w.b(Double.doubleToLongBits(j0.f13421c.d(abstractC0817u, j)));
                    i11 = b2 + i7;
                    break;
                case 1:
                    i7 = i11 * 53;
                    b2 = Float.floatToIntBits(j0.f13421c.e(abstractC0817u, j));
                    i11 = b2 + i7;
                    break;
                case 2:
                    i7 = i11 * 53;
                    b2 = AbstractC0819w.b(j0.f13421c.g(abstractC0817u, j));
                    i11 = b2 + i7;
                    break;
                case 3:
                    i7 = i11 * 53;
                    b2 = AbstractC0819w.b(j0.f13421c.g(abstractC0817u, j));
                    i11 = b2 + i7;
                    break;
                case 4:
                    i7 = i11 * 53;
                    b2 = j0.f13421c.f(abstractC0817u, j);
                    i11 = b2 + i7;
                    break;
                case 5:
                    i7 = i11 * 53;
                    b2 = AbstractC0819w.b(j0.f13421c.g(abstractC0817u, j));
                    i11 = b2 + i7;
                    break;
                case 6:
                    i7 = i11 * 53;
                    b2 = j0.f13421c.f(abstractC0817u, j);
                    i11 = b2 + i7;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean c10 = j0.f13421c.c(abstractC0817u, j);
                    Charset charset = AbstractC0819w.f13467a;
                    break;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    i7 = i11 * 53;
                    b2 = ((String) j0.f13421c.h(abstractC0817u, j)).hashCode();
                    i11 = b2 + i7;
                    break;
                case 9:
                    Object h10 = j0.f13421c.h(abstractC0817u, j);
                    if (h10 != null) {
                        i15 = h10.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i7 = i11 * 53;
                    b2 = j0.f13421c.h(abstractC0817u, j).hashCode();
                    i11 = b2 + i7;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i7 = i11 * 53;
                    b2 = j0.f13421c.f(abstractC0817u, j);
                    i11 = b2 + i7;
                    break;
                case 12:
                    i7 = i11 * 53;
                    b2 = j0.f13421c.f(abstractC0817u, j);
                    i11 = b2 + i7;
                    break;
                case 13:
                    i7 = i11 * 53;
                    b2 = j0.f13421c.f(abstractC0817u, j);
                    i11 = b2 + i7;
                    break;
                case 14:
                    i7 = i11 * 53;
                    b2 = AbstractC0819w.b(j0.f13421c.g(abstractC0817u, j));
                    i11 = b2 + i7;
                    break;
                case 15:
                    i7 = i11 * 53;
                    b2 = j0.f13421c.f(abstractC0817u, j);
                    i11 = b2 + i7;
                    break;
                case 16:
                    i7 = i11 * 53;
                    b2 = AbstractC0819w.b(j0.f13421c.g(abstractC0817u, j));
                    i11 = b2 + i7;
                    break;
                case 17:
                    Object h11 = j0.f13421c.h(abstractC0817u, j);
                    if (h11 != null) {
                        i15 = h11.hashCode();
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
                    b2 = j0.f13421c.h(abstractC0817u, j).hashCode();
                    i11 = b2 + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    b2 = j0.f13421c.h(abstractC0817u, j).hashCode();
                    i11 = b2 + i7;
                    break;
                case 51:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = AbstractC0819w.b(Double.doubleToLongBits(((Double) j0.f13421c.h(abstractC0817u, j)).doubleValue()));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = Float.floatToIntBits(((Float) j0.f13421c.h(abstractC0817u, j)).floatValue());
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = AbstractC0819w.b(A(abstractC0817u, j));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = AbstractC0819w.b(A(abstractC0817u, j));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = z(abstractC0817u, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = AbstractC0819w.b(A(abstractC0817u, j));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = z(abstractC0817u, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(abstractC0817u, i13, i12)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) j0.f13421c.h(abstractC0817u, j)).booleanValue();
                        Charset charset2 = AbstractC0819w.f13467a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = ((String) j0.f13421c.h(abstractC0817u, j)).hashCode();
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = j0.f13421c.h(abstractC0817u, j).hashCode();
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = j0.f13421c.h(abstractC0817u, j).hashCode();
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = z(abstractC0817u, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = z(abstractC0817u, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = z(abstractC0817u, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = AbstractC0819w.b(A(abstractC0817u, j));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = z(abstractC0817u, j);
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = AbstractC0819w.b(A(abstractC0817u, j));
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(abstractC0817u, i13, i12)) {
                        i7 = i11 * 53;
                        b2 = j0.f13421c.h(abstractC0817u, j).hashCode();
                        i11 = b2 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f13345l.getClass();
        return abstractC0817u.unknownFields.hashCode() + (i11 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r12, r7)) == java.lang.Float.floatToIntBits(r5.e(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r12, r7)) == java.lang.Double.doubleToLongBits(r5.d(r13, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r9.h(r12, r7), r9.h(r13, r7)) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1 A[LOOP:0: B:2:0x0005->B:86:0x01f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(AbstractC0817u abstractC0817u, AbstractC0817u abstractC0817u2) {
        int[] iArr = this.f13337a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean z8 = true;
            if (i7 >= length) {
                this.f13345l.getClass();
                return abstractC0817u.unknownFields.equals(abstractC0817u2.unknownFields);
            }
            int M3 = M(i7);
            long j = M3 & 1048575;
            switch (L(M3)) {
                case 0:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                        return false;
                    }
                    i7 += 3;
                case 1:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var2 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 2:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var3 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 3:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var4 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 4:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var5 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 5:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var6 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 6:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var7 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 7:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var8 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var9 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 9:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var10 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 10:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var11 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var12 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 12:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var13 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 13:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var14 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 14:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var15 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 15:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var16 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 16:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var17 = j0.f13421c;
                        break;
                    }
                    z8 = false;
                    if (z8) {
                    }
                    break;
                case 17:
                    if (j(abstractC0817u, abstractC0817u2, i7)) {
                        i0 i0Var18 = j0.f13421c;
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
                    i0 i0Var19 = j0.f13421c;
                    z8 = X.B(i0Var19.h(abstractC0817u, j), i0Var19.h(abstractC0817u2, j));
                    if (z8) {
                    }
                    break;
                case 50:
                    i0 i0Var20 = j0.f13421c;
                    z8 = X.B(i0Var20.h(abstractC0817u, j), i0Var20.h(abstractC0817u2, j));
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
                    i0 i0Var21 = j0.f13421c;
                    if (i0Var21.f(abstractC0817u, j10) == i0Var21.f(abstractC0817u2, j10)) {
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

    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(Object obj, C0305t c0305t, C0810m c0810m) {
        c0810m.getClass();
        if (!p(obj)) {
            throw new IllegalArgumentException(X.c.g(obj, "Mutating immutable message: "));
        }
        r(this.f13345l, obj, c0305t, c0810m);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0050. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.W
    public final int i(AbstractC0817u abstractC0817u) {
        int i7;
        int i10;
        int i11;
        int T10;
        int S7;
        int i12;
        int h02;
        int j02;
        Unsafe unsafe = f13336o;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = this.f13337a;
            if (i16 >= iArr.length) {
                this.f13345l.getClass();
                return abstractC0817u.unknownFields.b() + i17;
            }
            int M3 = M(i16);
            int L = L(M3);
            int i18 = iArr[i16];
            int i19 = iArr[i16 + 2];
            int i20 = i19 & i13;
            if (L <= 17) {
                if (i20 != i14) {
                    i15 = i20 == i13 ? 0 : unsafe.getInt(abstractC0817u, i20);
                    i14 = i20;
                }
                i7 = i14;
                i10 = i15;
                i11 = 1 << (i19 >>> 20);
            } else {
                i7 = i14;
                i10 = i15;
                i11 = 0;
            }
            long j = M3 & i13;
            if (L >= EnumC0814q.f13442b.a()) {
                EnumC0814q.f13443c.a();
            }
            switch (L) {
                case 0:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.T(i18);
                        i17 += T10;
                        break;
                    }
                case 1:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.X(i18);
                        i17 += T10;
                        break;
                    }
                case 2:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.a0(i18, unsafe.getLong(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 3:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.k0(i18, unsafe.getLong(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 4:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.Z(i18, unsafe.getInt(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 5:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.W(i18);
                        i17 += T10;
                        break;
                    }
                case 6:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.V(i18);
                        i17 += T10;
                        break;
                    }
                case 7:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.R(i18);
                        i17 += T10;
                        break;
                    }
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0817u, j);
                        S7 = object instanceof C0804g ? C0808k.S(i18, (C0804g) object) : C0808k.f0(i18, (String) object);
                        i17 = S7 + i17;
                        break;
                    }
                case 9:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = X.o(i18, unsafe.getObject(abstractC0817u, j), m(i16));
                        i17 += T10;
                        break;
                    }
                case 10:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.S(i18, (C0804g) unsafe.getObject(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.i0(i18, unsafe.getInt(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 12:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.U(i18, unsafe.getInt(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 13:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.b0(i18);
                        i17 += T10;
                        break;
                    }
                case 14:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.c0(i18);
                        i17 += T10;
                        break;
                    }
                case 15:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.d0(i18, unsafe.getInt(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 16:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.e0(i18, unsafe.getLong(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 17:
                    if (!o(abstractC0817u, i16, i7, i10, i11)) {
                        break;
                    } else {
                        T10 = C0808k.Y(i18, (AbstractC0798a) unsafe.getObject(abstractC0817u, j), m(i16));
                        i17 += T10;
                        break;
                    }
                case 18:
                    T10 = X.h(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 19:
                    T10 = X.f(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 20:
                    T10 = X.m(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 21:
                    T10 = X.x(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 22:
                    T10 = X.k(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 23:
                    T10 = X.h(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 24:
                    T10 = X.f(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    T10 = X.a(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 26:
                    T10 = X.u(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 27:
                    T10 = X.p(i18, (List) unsafe.getObject(abstractC0817u, j), m(i16));
                    i17 += T10;
                    break;
                case 28:
                    T10 = X.c(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 29:
                    T10 = X.v(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 30:
                    T10 = X.d(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 31:
                    T10 = X.f(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 32:
                    T10 = X.h(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 33:
                    T10 = X.q(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 34:
                    T10 = X.s(i18, (List) unsafe.getObject(abstractC0817u, j));
                    i17 += T10;
                    break;
                case 35:
                    i12 = X.i((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 36:
                    i12 = X.g((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 37:
                    i12 = X.n((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 38:
                    i12 = X.y((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 39:
                    i12 = X.l((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 40:
                    i12 = X.i((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 41:
                    i12 = X.g((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 42:
                    i12 = X.b((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 43:
                    i12 = X.w((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 44:
                    i12 = X.e((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 45:
                    i12 = X.g((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 46:
                    i12 = X.i((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 47:
                    i12 = X.r((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 48:
                    i12 = X.t((List) unsafe.getObject(abstractC0817u, j));
                    if (i12 <= 0) {
                        break;
                    } else {
                        h02 = C0808k.h0(i18);
                        j02 = C0808k.j0(i12);
                        i17 += j02 + h02 + i12;
                        break;
                    }
                case 49:
                    T10 = X.j(i18, (List) unsafe.getObject(abstractC0817u, j), m(i16));
                    i17 += T10;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0817u, j);
                    Object obj = this.f13338b[(i16 / 3) * 2];
                    this.f13346m.getClass();
                    T10 = I.a(i18, object2, obj);
                    i17 += T10;
                    break;
                case 51:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.T(i18);
                        i17 += T10;
                        break;
                    }
                case 52:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.X(i18);
                        i17 += T10;
                        break;
                    }
                case 53:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.a0(i18, A(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 54:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.k0(i18, A(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 55:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.Z(i18, z(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 56:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.W(i18);
                        i17 += T10;
                        break;
                    }
                case 57:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.V(i18);
                        i17 += T10;
                        break;
                    }
                case 58:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.R(i18);
                        i17 += T10;
                        break;
                    }
                case 59:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0817u, j);
                        S7 = object3 instanceof C0804g ? C0808k.S(i18, (C0804g) object3) : C0808k.f0(i18, (String) object3);
                        i17 = S7 + i17;
                        break;
                    }
                case 60:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = X.o(i18, unsafe.getObject(abstractC0817u, j), m(i16));
                        i17 += T10;
                        break;
                    }
                case 61:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.S(i18, (C0804g) unsafe.getObject(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 62:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.i0(i18, z(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 63:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.U(i18, z(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 64:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.b0(i18);
                        i17 += T10;
                        break;
                    }
                case 65:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.c0(i18);
                        i17 += T10;
                        break;
                    }
                case 66:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.d0(i18, z(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 67:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.e0(i18, A(abstractC0817u, j));
                        i17 += T10;
                        break;
                    }
                case 68:
                    if (!q(abstractC0817u, i18, i16)) {
                        break;
                    } else {
                        T10 = C0808k.Y(i18, (AbstractC0798a) unsafe.getObject(abstractC0817u, j), m(i16));
                        i17 += T10;
                        break;
                    }
            }
            i16 += 3;
            i14 = i7;
            i15 = i10;
            i13 = 1048575;
        }
    }

    public final boolean j(AbstractC0817u abstractC0817u, AbstractC0817u abstractC0817u2, int i7) {
        return n(i7, abstractC0817u) == n(i7, abstractC0817u2);
    }

    public final void k(int i7, Object obj, Object obj2) {
        int i10 = this.f13337a[i7];
        if (j0.f13421c.h(obj, M(i7) & 1048575) == null) {
            return;
        }
        l(i7);
    }

    public final void l(int i7) {
        if (this.f13338b[((i7 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final W m(int i7) {
        int i10 = (i7 / 3) * 2;
        Object[] objArr = this.f13338b;
        W w10 = (W) objArr[i10];
        if (w10 != null) {
            return w10;
        }
        W a9 = T.f13352c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a9;
        return a9;
    }

    public final boolean n(int i7, Object obj) {
        int i10 = this.f13337a[i7 + 2];
        long j = i10 & 1048575;
        if (j != 1048575) {
            return ((1 << (i10 >>> 20)) & j0.f13421c.f(obj, j)) != 0;
        }
        int M3 = M(i7);
        long j10 = M3 & 1048575;
        switch (L(M3)) {
            case 0:
                return Double.doubleToRawLongBits(j0.f13421c.d(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(j0.f13421c.e(obj, j10)) != 0;
            case 2:
                return j0.f13421c.g(obj, j10) != 0;
            case 3:
                return j0.f13421c.g(obj, j10) != 0;
            case 4:
                return j0.f13421c.f(obj, j10) != 0;
            case 5:
                return j0.f13421c.g(obj, j10) != 0;
            case 6:
                return j0.f13421c.f(obj, j10) != 0;
            case 7:
                return j0.f13421c.c(obj, j10);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                Object h10 = j0.f13421c.h(obj, j10);
                if (h10 instanceof String) {
                    return !((String) h10).isEmpty();
                }
                if (h10 instanceof C0804g) {
                    return !C0804g.f13396c.equals(h10);
                }
                throw new IllegalArgumentException();
            case 9:
                return j0.f13421c.h(obj, j10) != null;
            case 10:
                return !C0804g.f13396c.equals(j0.f13421c.h(obj, j10));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return j0.f13421c.f(obj, j10) != 0;
            case 12:
                return j0.f13421c.f(obj, j10) != 0;
            case 13:
                return j0.f13421c.f(obj, j10) != 0;
            case 14:
                return j0.f13421c.g(obj, j10) != 0;
            case 15:
                return j0.f13421c.f(obj, j10) != 0;
            case 16:
                return j0.f13421c.g(obj, j10) != 0;
            case 17:
                return j0.f13421c.h(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean o(Object obj, int i7, int i10, int i11, int i12) {
        return i10 == 1048575 ? n(i7, obj) : (i11 & i12) != 0;
    }

    public final boolean q(Object obj, int i7, int i10) {
        return j0.f13421c.f(obj, (long) (this.f13337a[i10 + 2] & 1048575)) == i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x006d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:56:0x064b A[Catch: all -> 0x025f, TryCatch #4 {all -> 0x025f, blocks: (B:54:0x0646, B:56:0x064b, B:57:0x0650, B:50:0x025a, B:78:0x0262, B:79:0x0275, B:80:0x0288, B:81:0x029b, B:82:0x02ae, B:83:0x02c7, B:84:0x02da, B:85:0x02ed, B:86:0x0300, B:87:0x0313, B:88:0x0326, B:89:0x0339, B:90:0x034c, B:91:0x035f, B:92:0x0372, B:93:0x0385, B:94:0x0398, B:95:0x03ab, B:96:0x03be, B:97:0x03d7, B:98:0x03ea, B:99:0x03fd, B:100:0x0411, B:101:0x0419, B:102:0x042c, B:103:0x043f, B:104:0x0452, B:105:0x0465, B:106:0x0478, B:107:0x048b, B:108:0x049e, B:109:0x04b1, B:110:0x04ca, B:111:0x04e0, B:112:0x04f6, B:113:0x050d, B:114:0x0524, B:115:0x053d, B:116:0x0553, B:117:0x0566, B:118:0x057f, B:119:0x058a, B:120:0x05a2, B:121:0x05b9, B:122:0x05d0, B:123:0x05e6, B:124:0x05fc, B:125:0x0611, B:126:0x0629), top: B:53:0x0646 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0656 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(e0 e0Var, Object obj, C0305t c0305t, C0810m c0810m) {
        int i7;
        int i10;
        int L;
        AbstractC0807j abstractC0807j;
        B b2;
        int i11;
        Object obj2;
        int[] iArr = this.g;
        int i12 = this.f13344i;
        int i13 = this.f13343h;
        d0 d0Var = null;
        while (true) {
            try {
                int c10 = c0305t.c();
                int B10 = B(c10);
                if (B10 >= 0) {
                    int M3 = M(B10);
                    try {
                        L = L(M3);
                        abstractC0807j = (AbstractC0807j) c0305t.f4829e;
                        b2 = this.k;
                    } catch (C0820x unused) {
                        i7 = i13;
                        i10 = 0;
                    }
                    switch (L) {
                        case 0:
                            i7 = i13;
                            long y10 = y(M3);
                            c0305t.n0(1);
                            j0.f13421c.l(obj, y10, abstractC0807j.m());
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 1:
                            i7 = i13;
                            long y11 = y(M3);
                            c0305t.n0(5);
                            j0.f13421c.m(obj, y11, abstractC0807j.q());
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 2:
                            i7 = i13;
                            long y12 = y(M3);
                            c0305t.n0(0);
                            j0.n(obj, y12, abstractC0807j.s());
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 3:
                            i7 = i13;
                            long y13 = y(M3);
                            c0305t.n0(0);
                            j0.n(obj, y13, abstractC0807j.B());
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 4:
                            i7 = i13;
                            long y14 = y(M3);
                            c0305t.n0(0);
                            j0.m(obj, abstractC0807j.r(), y14);
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 5:
                            i7 = i13;
                            long y15 = y(M3);
                            c0305t.n0(1);
                            j0.n(obj, y15, abstractC0807j.p());
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 6:
                            i7 = i13;
                            long y16 = y(M3);
                            c0305t.n0(5);
                            j0.m(obj, abstractC0807j.o(), y16);
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 7:
                            i7 = i13;
                            long y17 = y(M3);
                            c0305t.n0(0);
                            j0.f13421c.j(obj, y17, abstractC0807j.j());
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            i7 = i13;
                            E(M3, c0305t, obj);
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 9:
                            i7 = i13;
                            AbstractC0798a abstractC0798a = (AbstractC0798a) v(B10, obj);
                            W m10 = m(B10);
                            c0305t.n0(2);
                            c0305t.h(abstractC0798a, m10, c0810m);
                            J(obj, B10, abstractC0798a);
                            i13 = i7;
                            break;
                        case 10:
                            i7 = i13;
                            j0.o(obj, y(M3), c0305t.l());
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            i7 = i13;
                            long y18 = y(M3);
                            c0305t.n0(0);
                            j0.m(obj, abstractC0807j.A(), y18);
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 12:
                            i7 = i13;
                            c0305t.n0(0);
                            int n6 = abstractC0807j.n();
                            l(B10);
                            j0.m(obj, n6, y(M3));
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 13:
                            i7 = i13;
                            long y19 = y(M3);
                            c0305t.n0(5);
                            j0.m(obj, abstractC0807j.t(), y19);
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 14:
                            i7 = i13;
                            long y20 = y(M3);
                            c0305t.n0(1);
                            j0.n(obj, y20, abstractC0807j.u());
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 15:
                            i7 = i13;
                            long y21 = y(M3);
                            c0305t.n0(0);
                            j0.m(obj, abstractC0807j.v(), y21);
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 16:
                            i7 = i13;
                            long y22 = y(M3);
                            c0305t.n0(0);
                            j0.n(obj, y22, abstractC0807j.w());
                            H(B10, obj);
                            i13 = i7;
                            break;
                        case 17:
                            i7 = i13;
                            AbstractC0798a abstractC0798a2 = (AbstractC0798a) v(B10, obj);
                            W m11 = m(B10);
                            c0305t.n0(3);
                            c0305t.g(abstractC0798a2, m11, c0810m);
                            J(obj, B10, abstractC0798a2);
                            i13 = i7;
                            break;
                        case 18:
                            i7 = i13;
                            long y23 = y(M3);
                            b2.getClass();
                            c0305t.q(B.b(obj, y23));
                            i13 = i7;
                            break;
                        case 19:
                            i7 = i13;
                            long y24 = y(M3);
                            b2.getClass();
                            c0305t.D(B.b(obj, y24));
                            i13 = i7;
                            break;
                        case 20:
                            i7 = i13;
                            long y25 = y(M3);
                            b2.getClass();
                            c0305t.L(B.b(obj, y25));
                            i13 = i7;
                            break;
                        case 21:
                            i7 = i13;
                            long y26 = y(M3);
                            b2.getClass();
                            c0305t.j0(B.b(obj, y26));
                            i13 = i7;
                            break;
                        case 22:
                            i7 = i13;
                            long y27 = y(M3);
                            b2.getClass();
                            c0305t.I(B.b(obj, y27));
                            i13 = i7;
                            break;
                        case 23:
                            i7 = i13;
                            long y28 = y(M3);
                            b2.getClass();
                            c0305t.A(B.b(obj, y28));
                            i13 = i7;
                            break;
                        case 24:
                            i7 = i13;
                            long y29 = y(M3);
                            b2.getClass();
                            c0305t.x(B.b(obj, y29));
                            i13 = i7;
                            break;
                        case BlurFactor.DEFAULT_RADIUS /* 25 */:
                            i7 = i13;
                            long y30 = y(M3);
                            b2.getClass();
                            c0305t.j(B.b(obj, y30));
                            i13 = i7;
                            break;
                        case 26:
                            i7 = i13;
                            F(M3, c0305t, obj);
                            i13 = i7;
                            break;
                        case 27:
                            i7 = i13;
                            D(obj, M3, c0305t, m(B10), c0810m);
                            i13 = i7;
                            break;
                        case 28:
                            i7 = i13;
                            long y31 = y(M3);
                            b2.getClass();
                            c0305t.n(B.b(obj, y31));
                            i13 = i7;
                            break;
                        case 29:
                            i7 = i13;
                            long y32 = y(M3);
                            b2.getClass();
                            c0305t.g0(B.b(obj, y32));
                            i13 = i7;
                            break;
                        case 30:
                            i7 = i13;
                            long y33 = y(M3);
                            b2.getClass();
                            InterfaceC0818v b10 = B.b(obj, y33);
                            c0305t.t(b10);
                            l(B10);
                            X.z(obj, c10, b10, d0Var, e0Var);
                            i13 = i7;
                            break;
                        case 31:
                            i7 = i13;
                            long y34 = y(M3);
                            b2.getClass();
                            c0305t.Q(B.b(obj, y34));
                            i13 = i7;
                            break;
                        case 32:
                            i7 = i13;
                            long y35 = y(M3);
                            b2.getClass();
                            c0305t.T(B.b(obj, y35));
                            i13 = i7;
                            break;
                        case 33:
                            i7 = i13;
                            long y36 = y(M3);
                            b2.getClass();
                            c0305t.W(B.b(obj, y36));
                            i13 = i7;
                            break;
                        case 34:
                            i7 = i13;
                            long y37 = y(M3);
                            b2.getClass();
                            c0305t.Z(B.b(obj, y37));
                            i13 = i7;
                            break;
                        case 35:
                            i7 = i13;
                            long y38 = y(M3);
                            b2.getClass();
                            c0305t.q(B.b(obj, y38));
                            i13 = i7;
                            break;
                        case 36:
                            i7 = i13;
                            long y39 = y(M3);
                            b2.getClass();
                            c0305t.D(B.b(obj, y39));
                            i13 = i7;
                            break;
                        case 37:
                            i7 = i13;
                            long y40 = y(M3);
                            b2.getClass();
                            c0305t.L(B.b(obj, y40));
                            i13 = i7;
                            break;
                        case 38:
                            i7 = i13;
                            long y41 = y(M3);
                            b2.getClass();
                            c0305t.j0(B.b(obj, y41));
                            i13 = i7;
                            break;
                        case 39:
                            i7 = i13;
                            long y42 = y(M3);
                            b2.getClass();
                            c0305t.I(B.b(obj, y42));
                            i13 = i7;
                            break;
                        case 40:
                            i7 = i13;
                            long y43 = y(M3);
                            b2.getClass();
                            c0305t.A(B.b(obj, y43));
                            i13 = i7;
                            break;
                        case 41:
                            i7 = i13;
                            long y44 = y(M3);
                            b2.getClass();
                            c0305t.x(B.b(obj, y44));
                            i13 = i7;
                            break;
                        case 42:
                            i7 = i13;
                            long y45 = y(M3);
                            b2.getClass();
                            c0305t.j(B.b(obj, y45));
                            i13 = i7;
                            break;
                        case 43:
                            i7 = i13;
                            long y46 = y(M3);
                            b2.getClass();
                            c0305t.g0(B.b(obj, y46));
                            i13 = i7;
                            break;
                        case 44:
                            i7 = i13;
                            long y47 = y(M3);
                            b2.getClass();
                            InterfaceC0818v b11 = B.b(obj, y47);
                            c0305t.t(b11);
                            l(B10);
                            X.z(obj, c10, b11, d0Var, e0Var);
                            i13 = i7;
                            break;
                        case 45:
                            i7 = i13;
                            long y48 = y(M3);
                            b2.getClass();
                            c0305t.Q(B.b(obj, y48));
                            i13 = i7;
                            break;
                        case 46:
                            i7 = i13;
                            long y49 = y(M3);
                            b2.getClass();
                            c0305t.T(B.b(obj, y49));
                            i13 = i7;
                            break;
                        case 47:
                            i7 = i13;
                            long y50 = y(M3);
                            b2.getClass();
                            c0305t.W(B.b(obj, y50));
                            i13 = i7;
                            break;
                        case 48:
                            i7 = i13;
                            long y51 = y(M3);
                            b2.getClass();
                            c0305t.Z(B.b(obj, y51));
                            i13 = i7;
                            break;
                        case 49:
                            i7 = i13;
                            i10 = 0;
                            try {
                                C(obj, y(M3), c0305t, m(B10), c0810m);
                            } catch (C0820x unused2) {
                                try {
                                    e0Var.getClass();
                                    if (d0Var == null) {
                                        d0Var = e0.a(obj);
                                    }
                                    if (!e0.c(i10, c0305t, d0Var)) {
                                        for (int i14 = i7; i14 < i12; i14++) {
                                            k(iArr[i14], obj, d0Var);
                                        }
                                        if (d0Var != null) {
                                            ((AbstractC0817u) obj).unknownFields = d0Var;
                                            return;
                                        }
                                        return;
                                    }
                                    i13 = i7;
                                } catch (Throwable th) {
                                    th = th;
                                    for (int i15 = i7; i15 < i12; i15++) {
                                        k(iArr[i15], obj, d0Var);
                                    }
                                    if (d0Var != null) {
                                        e0Var.getClass();
                                        ((AbstractC0817u) obj).unknownFields = d0Var;
                                    }
                                    throw th;
                                }
                            }
                            i13 = i7;
                        case 50:
                            try {
                                obj2 = this.f13338b[(B10 / 3) * 2];
                                i11 = 0;
                            } catch (C0820x unused3) {
                                i11 = 0;
                            }
                            try {
                                s(obj, B10, obj2, c0810m, c0305t);
                                i7 = i13;
                            } catch (C0820x unused4) {
                                i7 = i13;
                                i10 = i11;
                                e0Var.getClass();
                                if (d0Var == null) {
                                }
                                if (!e0.c(i10, c0305t, d0Var)) {
                                }
                                i13 = i7;
                            }
                            i13 = i7;
                            break;
                        case 51:
                            long y52 = y(M3);
                            c0305t.n0(1);
                            j0.o(obj, y52, Double.valueOf(abstractC0807j.m()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 52:
                            long y53 = y(M3);
                            c0305t.n0(5);
                            j0.o(obj, y53, Float.valueOf(abstractC0807j.q()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 53:
                            long y54 = y(M3);
                            c0305t.n0(0);
                            j0.o(obj, y54, Long.valueOf(abstractC0807j.s()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 54:
                            long y55 = y(M3);
                            c0305t.n0(0);
                            j0.o(obj, y55, Long.valueOf(abstractC0807j.B()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 55:
                            long y56 = y(M3);
                            c0305t.n0(0);
                            j0.o(obj, y56, Integer.valueOf(abstractC0807j.r()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 56:
                            long y57 = y(M3);
                            c0305t.n0(1);
                            j0.o(obj, y57, Long.valueOf(abstractC0807j.p()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 57:
                            long y58 = y(M3);
                            c0305t.n0(5);
                            j0.o(obj, y58, Integer.valueOf(abstractC0807j.o()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 58:
                            long y59 = y(M3);
                            c0305t.n0(0);
                            j0.o(obj, y59, Boolean.valueOf(abstractC0807j.j()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 59:
                            E(M3, c0305t, obj);
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 60:
                            AbstractC0798a abstractC0798a3 = (AbstractC0798a) w(obj, c10, B10);
                            W m12 = m(B10);
                            c0305t.n0(2);
                            c0305t.h(abstractC0798a3, m12, c0810m);
                            K(obj, c10, B10, abstractC0798a3);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 61:
                            j0.o(obj, y(M3), c0305t.l());
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 62:
                            long y60 = y(M3);
                            c0305t.n0(0);
                            j0.o(obj, y60, Integer.valueOf(abstractC0807j.A()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 63:
                            c0305t.n0(0);
                            int n8 = abstractC0807j.n();
                            l(B10);
                            j0.o(obj, y(M3), Integer.valueOf(n8));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 64:
                            long y61 = y(M3);
                            c0305t.n0(5);
                            j0.o(obj, y61, Integer.valueOf(abstractC0807j.t()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 65:
                            long y62 = y(M3);
                            c0305t.n0(1);
                            j0.o(obj, y62, Long.valueOf(abstractC0807j.u()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 66:
                            long y63 = y(M3);
                            c0305t.n0(0);
                            j0.o(obj, y63, Integer.valueOf(abstractC0807j.v()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 67:
                            long y64 = y(M3);
                            c0305t.n0(0);
                            j0.o(obj, y64, Long.valueOf(abstractC0807j.w()));
                            I(obj, c10, B10);
                            i7 = i13;
                            i13 = i7;
                            break;
                        case 68:
                            AbstractC0798a abstractC0798a4 = (AbstractC0798a) w(obj, c10, B10);
                            W m13 = m(B10);
                            c0305t.n0(3);
                            c0305t.g(abstractC0798a4, m13, c0810m);
                            K(obj, c10, B10, abstractC0798a4);
                            i7 = i13;
                            i13 = i7;
                            break;
                        default:
                            if (d0Var == null) {
                                e0Var.getClass();
                                d0Var = e0.a(obj);
                            }
                            e0Var.getClass();
                            if (!e0.c(0, c0305t, d0Var)) {
                                while (i13 < i12) {
                                    k(iArr[i13], obj, d0Var);
                                    i13++;
                                }
                                if (d0Var != null) {
                                    ((AbstractC0817u) obj).unknownFields = d0Var;
                                    return;
                                }
                                return;
                            }
                            i7 = i13;
                            i13 = i7;
                            break;
                    }
                } else {
                    if (c10 == Integer.MAX_VALUE) {
                        while (i13 < i12) {
                            k(iArr[i13], obj, d0Var);
                            i13++;
                        }
                        if (d0Var != null) {
                            e0Var.getClass();
                            ((AbstractC0817u) obj).unknownFields = d0Var;
                            return;
                        }
                        return;
                    }
                    e0Var.getClass();
                    if (d0Var == null) {
                        d0Var = e0.a(obj);
                    }
                    if (!e0.c(0, c0305t, d0Var)) {
                        while (i13 < i12) {
                            k(iArr[i13], obj, d0Var);
                            i13++;
                        }
                        if (d0Var != null) {
                            ((AbstractC0817u) obj).unknownFields = d0Var;
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i7 = i13;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(Object obj, int i7, Object obj2, C0810m c0810m, C0305t c0305t) {
        long M3 = M(i7) & 1048575;
        Object h10 = j0.f13421c.h(obj, M3);
        I i10 = this.f13346m;
        if (h10 == null) {
            i10.getClass();
            h10 = H.f13330b.b();
            j0.o(obj, M3, h10);
        } else {
            i10.getClass();
            if (!((H) h10).f13331a) {
                H b2 = H.f13330b.b();
                I.b(b2, h10);
                j0.o(obj, M3, b2);
                h10 = b2;
            }
        }
        i10.getClass();
        H h11 = (H) h10;
        F f4 = ((G) obj2).f13329a;
        c0305t.n0(2);
        AbstractC0807j abstractC0807j = (AbstractC0807j) c0305t.f4829e;
        int i11 = abstractC0807j.i(abstractC0807j.A());
        Object obj3 = "";
        P1.g gVar = f4.f13328c;
        Object obj4 = gVar;
        while (true) {
            try {
                int c10 = c0305t.c();
                if (c10 == Integer.MAX_VALUE || abstractC0807j.c()) {
                    break;
                }
                if (c10 == 1) {
                    obj3 = c0305t.v(f4.f13326a, null, null);
                } else if (c10 != 2) {
                    try {
                        if (!c0305t.p0()) {
                            throw new IOException("Unable to parse map entry.");
                            break;
                        }
                    } catch (C0820x unused) {
                        if (!c0305t.p0()) {
                            throw new IOException("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj4 = c0305t.v(f4.f13327b, gVar.getClass(), c0810m);
                }
            } catch (Throwable th) {
                abstractC0807j.h(i11);
                throw th;
            }
        }
    }

    public final void t(int i7, Object obj, Object obj2) {
        if (n(i7, obj2)) {
            long M3 = M(i7) & 1048575;
            Unsafe unsafe = f13336o;
            Object object = unsafe.getObject(obj2, M3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f13337a[i7] + " is present but null: " + obj2);
            }
            W m10 = m(i7);
            if (!n(i7, obj)) {
                if (p(object)) {
                    AbstractC0817u c10 = m10.c();
                    m10.d(c10, object);
                    unsafe.putObject(obj, M3, c10);
                } else {
                    unsafe.putObject(obj, M3, object);
                }
                H(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M3);
            if (!p(object2)) {
                AbstractC0817u c11 = m10.c();
                m10.d(c11, object2);
                unsafe.putObject(obj, M3, c11);
                object2 = c11;
            }
            m10.d(object2, object);
        }
    }

    public final void u(int i7, Object obj, Object obj2) {
        int[] iArr = this.f13337a;
        int i10 = iArr[i7];
        if (q(obj2, i10, i7)) {
            long M3 = M(i7) & 1048575;
            Unsafe unsafe = f13336o;
            Object object = unsafe.getObject(obj2, M3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            W m10 = m(i7);
            if (!q(obj, i10, i7)) {
                if (p(object)) {
                    AbstractC0817u c10 = m10.c();
                    m10.d(c10, object);
                    unsafe.putObject(obj, M3, c10);
                } else {
                    unsafe.putObject(obj, M3, object);
                }
                I(obj, i10, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, M3);
            if (!p(object2)) {
                AbstractC0817u c11 = m10.c();
                m10.d(c11, object2);
                unsafe.putObject(obj, M3, c11);
                object2 = c11;
            }
            m10.d(object2, object);
        }
    }

    public final Object v(int i7, Object obj) {
        W m10 = m(i7);
        long M3 = M(i7) & 1048575;
        if (!n(i7, obj)) {
            return m10.c();
        }
        Object object = f13336o.getObject(obj, M3);
        if (p(object)) {
            return object;
        }
        AbstractC0817u c10 = m10.c();
        if (object != null) {
            m10.d(c10, object);
        }
        return c10;
    }

    public final Object w(Object obj, int i7, int i10) {
        W m10 = m(i10);
        if (!q(obj, i7, i10)) {
            return m10.c();
        }
        Object object = f13336o.getObject(obj, M(i10) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0817u c10 = m10.c();
        if (object != null) {
            m10.d(c10, object);
        }
        return c10;
    }
}
