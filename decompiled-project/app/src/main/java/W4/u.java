package W4;

import P4.AbstractC0453a;
import P4.C0463k;
import P4.InterfaceC0476y;
import P4.U;
import P4.h0;
import android.net.Uri;
import java.util.ArrayList;
import javax.net.SocketFactory;
import m4.AbstractC1556J;
import m4.C1558a0;
import m4.L0;
import m4.V;
import m5.C1620q;
import m5.T;

/* loaded from: classes.dex */
public final class u extends AbstractC0453a {

    /* renamed from: A, reason: collision with root package name */
    public long f10781A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f10782B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f10783C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f10784D;

    /* renamed from: v, reason: collision with root package name */
    public final C1558a0 f10785v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC0586d f10786w;

    /* renamed from: x, reason: collision with root package name */
    public final String f10787x = "ExoPlayerLib/2.19.1";

    /* renamed from: y, reason: collision with root package name */
    public final Uri f10788y;

    /* renamed from: z, reason: collision with root package name */
    public final SocketFactory f10789z;

    static {
        AbstractC1556J.a("goog.exo.rtsp");
    }

    public u(C1558a0 c1558a0, InterfaceC0586d interfaceC0586d, SocketFactory socketFactory) {
        this.f10785v = c1558a0;
        this.f10786w = interfaceC0586d;
        V v10 = c1558a0.f20224b;
        v10.getClass();
        this.f10788y = v10.f20177a;
        this.f10789z = socketFactory;
        this.f10781A = -9223372036854775807L;
        this.f10784D = true;
    }

    @Override // P4.AbstractC0453a
    public final InterfaceC0476y b(P4.B b2, C1620q c1620q, long j) {
        C0463k c0463k = new C0463k(this, 12);
        return new s(c1620q, this.f10786w, this.f10788y, c0463k, this.f10787x, this.f10789z);
    }

    @Override // P4.AbstractC0453a
    public final C1558a0 i() {
        return this.f10785v;
    }

    @Override // P4.AbstractC0453a
    public final void k() {
    }

    @Override // P4.AbstractC0453a
    public final void n(T t5) {
        v();
    }

    @Override // P4.AbstractC0453a
    public final void p(InterfaceC0476y interfaceC0476y) {
        s sVar = (s) interfaceC0476y;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = sVar.f10773e;
            if (i7 >= arrayList.size()) {
                n5.D.g(sVar.f10772d);
                sVar.f10764F = true;
                return;
            }
            r rVar = (r) arrayList.get(i7);
            if (!rVar.f10757e) {
                rVar.f10754b.e(null);
                rVar.f10755c.z();
                rVar.f10757e = true;
            }
            i7++;
        }
    }

    @Override // P4.AbstractC0453a
    public final void r() {
    }

    public final void v() {
        L0 h0Var = new h0(this.f10781A, this.f10782B, this.f10783C, this.f10785v);
        if (this.f10784D) {
            h0Var = new U(h0Var, 1);
        }
        o(h0Var);
    }
}
