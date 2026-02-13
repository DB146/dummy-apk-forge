package S6;

import W6.A;
import W6.B;
import W6.C;
import W6.D;
import W6.r;
import W6.x;
import W6.y;
import W6.z;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9183a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static C a(y yVar) {
        z p10 = C.p();
        int r10 = yVar.r();
        p10.c();
        C.m((C) p10.f15819b, r10);
        for (x xVar : yVar.q()) {
            A r11 = B.r();
            String r12 = xVar.q().r();
            r11.c();
            B.m((B) r11.f15819b, r12);
            r t5 = xVar.t();
            r11.c();
            B.o((B) r11.f15819b, t5);
            D s3 = xVar.s();
            r11.c();
            B.n((B) r11.f15819b, s3);
            int r13 = xVar.r();
            r11.c();
            B.p((B) r11.f15819b, r13);
            B b2 = (B) r11.a();
            p10.c();
            C.n((C) p10.f15819b, b2);
        }
        return (C) p10.a();
    }
}
