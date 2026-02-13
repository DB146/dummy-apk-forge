package okhttp3.internal.publicsuffix;

import A3.c;
import Eb.o;
import Eb.t;
import Eb.v;
import Y5.C0658x;
import Zb.b;
import Zb.i;
import ac.AbstractC0796a;
import ac.g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.platform.Platform;
import rc.C1967k;
import y7.u0;

/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f22929b = new Companion(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1967k f22930c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f22931d;

    /* renamed from: e, reason: collision with root package name */
    public static final PublicSuffixDatabase f22932e;

    /* renamed from: a, reason: collision with root package name */
    public final AssetPublicSuffixList f22933a;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static final String a(Companion companion, C1967k c1967k, C1967k[] c1967kArr, int i7) {
            int i10;
            boolean z8;
            int i11;
            int i12;
            int i13 = -1;
            companion.getClass();
            int f4 = c1967k.f();
            int i14 = 0;
            while (i14 < f4) {
                int i15 = (i14 + f4) / 2;
                while (i15 > i13 && c1967k.r(i15) != 10) {
                    i15 += i13;
                }
                int i16 = i15 + 1;
                int i17 = 1;
                while (true) {
                    i10 = i16 + i17;
                    if (c1967k.r(i10) == 10) {
                        break;
                    }
                    i17++;
                }
                int i18 = i10 - i16;
                int i19 = i7;
                boolean z10 = false;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (z10) {
                        i11 = 46;
                        z8 = false;
                    } else {
                        byte r10 = c1967kArr[i19].r(i20);
                        byte[] bArr = _UtilCommonKt.f22495a;
                        int i22 = r10 & 255;
                        z8 = z10;
                        i11 = i22;
                    }
                    byte r11 = c1967k.r(i16 + i21);
                    byte[] bArr2 = _UtilCommonKt.f22495a;
                    i12 = i11 - (r11 & 255);
                    if (i12 != 0) {
                        break;
                    }
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (c1967kArr[i19].f() != i20) {
                        z10 = z8;
                    } else {
                        if (i19 == c1967kArr.length - 1) {
                            break;
                        }
                        i19++;
                        z10 = true;
                        i20 = -1;
                    }
                }
                if (i12 >= 0) {
                    if (i12 <= 0) {
                        int i23 = i18 - i21;
                        int f10 = c1967kArr[i19].f() - i20;
                        int length = c1967kArr.length;
                        for (int i24 = i19 + 1; i24 < length; i24++) {
                            f10 += c1967kArr[i24].f();
                        }
                        if (f10 >= i23) {
                            if (f10 <= i23) {
                                return c1967k.B(i16, i18 + i16).z(AbstractC0796a.f12815a);
                            }
                        }
                    }
                    i14 = i10 + 1;
                    i13 = -1;
                }
                f4 = i15;
                i13 = -1;
            }
            return null;
        }
    }

    static {
        byte[] copyOf = Arrays.copyOf(new byte[]{42}, 1);
        l.d(copyOf, "copyOf(...)");
        f22930c = new C1967k(copyOf);
        f22931d = u0.x("*");
        l.e(PublicSuffixList.f22934a, "<this>");
        f22932e = new PublicSuffixDatabase(new AssetPublicSuffixList(0));
    }

    public PublicSuffixDatabase(AssetPublicSuffixList assetPublicSuffixList) {
        this.f22933a = assetPublicSuffixList;
    }

    public static List b(String str) {
        List s02 = g.s0(str, new char[]{'.'});
        if (!l.a(o.e0(s02), "")) {
            return s02;
        }
        int size = s02.size() - 1;
        return o.o0(size >= 0 ? size : 0, s02);
    }

    public final String a(String str) {
        Companion companion;
        String str2;
        String str3;
        String str4;
        List list;
        String unicode = IDN.toUnicode(str);
        l.b(unicode);
        List b2 = b(unicode);
        AssetPublicSuffixList assetPublicSuffixList = this.f22933a;
        if (assetPublicSuffixList.f22925b.get() || !assetPublicSuffixList.f22925b.compareAndSet(false, true)) {
            try {
                assetPublicSuffixList.f22926c.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z8 = false;
            while (true) {
                try {
                    try {
                        assetPublicSuffixList.c();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z8 = true;
                    } catch (IOException e2) {
                        Platform.f22897a.getClass();
                        Platform.f22898b.h(5, "Failed to read public suffix list", e2);
                        if (z8) {
                        }
                    }
                } finally {
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (assetPublicSuffixList.f22927d == null) {
            throw new IllegalStateException(("Unable to load " + ((Object) assetPublicSuffixList.f22924f) + " resource.").toString());
        }
        int size = b2.size();
        C1967k[] c1967kArr = new C1967k[size];
        for (int i7 = 0; i7 < size; i7++) {
            C1967k c1967k = C1967k.f23967d;
            c1967kArr[i7] = C0658x.c((String) b2.get(i7));
        }
        int i10 = 0;
        while (true) {
            companion = f22929b;
            if (i10 >= size) {
                str2 = null;
                break;
            }
            str2 = Companion.a(companion, assetPublicSuffixList.a(), c1967kArr, i10);
            if (str2 != null) {
                break;
            }
            i10++;
        }
        if (size > 1) {
            C1967k[] c1967kArr2 = (C1967k[]) c1967kArr.clone();
            int length = c1967kArr2.length - 1;
            for (int i11 = 0; i11 < length; i11++) {
                c1967kArr2[i11] = f22930c;
                str3 = Companion.a(companion, assetPublicSuffixList.a(), c1967kArr2, i11);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i12 = size - 1;
            for (int i13 = 0; i13 < i12; i13++) {
                C1967k c1967k2 = assetPublicSuffixList.f22928e;
                if (c1967k2 == null) {
                    l.j("exceptionBytes");
                    throw null;
                }
                str4 = Companion.a(companion, c1967k2, c1967kArr, i13);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list = g.s0("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list = f22931d;
        } else {
            List list2 = v.f3891a;
            List s02 = str2 != null ? g.s0(str2, new char[]{'.'}) : list2;
            if (str3 != null) {
                list2 = g.s0(str3, new char[]{'.'});
            }
            list = s02.size() > list2.size() ? s02 : list2;
        }
        if (b2.size() == list.size() && ((String) list.get(0)).charAt(0) != '!') {
            return null;
        }
        int size2 = ((String) list.get(0)).charAt(0) == '!' ? b2.size() - list.size() : b2.size() - (list.size() + 1);
        Zb.g tVar = new t(b(str), 0);
        if (size2 < 0) {
            throw new IllegalArgumentException(c.f(size2, "Requested element count ", " is less than zero.").toString());
        }
        if (size2 != 0) {
            tVar = tVar instanceof Zb.c ? ((Zb.c) tVar).a(size2) : new b(tVar, size2);
        }
        return i.O(tVar, ".");
    }
}
