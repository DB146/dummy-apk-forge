package W4;

import N6.y0;
import java.util.HashMap;
import java.util.Locale;
import m4.C1586o0;
import n5.AbstractC1705a;

/* renamed from: W4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10660a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10661b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10662c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10663d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f10664e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f10665f = -1;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public String f10666h;

    /* renamed from: i, reason: collision with root package name */
    public String f10667i;

    public C0583a(int i7, int i10, String str, String str2) {
        this.f10660a = str;
        this.f10661b = i7;
        this.f10662c = str2;
        this.f10663d = i10;
    }

    public static String b(int i7, int i10, int i11, String str) {
        int i12 = n5.D.f21141a;
        Locale locale = Locale.US;
        return i7 + " " + str + "/" + i10 + "/" + i11;
    }

    public final C0585c a() {
        String b2;
        C0584b a9;
        HashMap hashMap = this.f10664e;
        try {
            if (hashMap.containsKey("rtpmap")) {
                String str = (String) hashMap.get("rtpmap");
                int i7 = n5.D.f21141a;
                a9 = C0584b.a(str);
            } else {
                int i10 = this.f10663d;
                AbstractC1705a.h(i10 < 96);
                if (i10 == 0) {
                    b2 = b(0, 8000, 1, "PCMU");
                } else if (i10 == 8) {
                    b2 = b(8, 8000, 1, "PCMA");
                } else if (i10 == 10) {
                    b2 = b(10, 44100, 2, "L16");
                } else {
                    if (i10 != 11) {
                        throw new IllegalStateException(h3.o.l(i10, "Unsupported static paylod type "));
                    }
                    b2 = b(11, 44100, 1, "L16");
                }
                a9 = C0584b.a(b2);
            }
            return new C0585c(this, y0.b(hashMap), a9);
        } catch (C1586o0 e2) {
            throw new IllegalStateException(e2);
        }
    }
}
