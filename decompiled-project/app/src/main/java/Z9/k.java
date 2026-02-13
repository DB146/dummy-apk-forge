package Z9;

import java.util.List;
import jb.InterfaceC1390a;
import tb.C2037a;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements gb.r, InterfaceC1390a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f12284a;

    public /* synthetic */ k(s sVar) {
        this.f12284a = sVar;
    }

    @Override // gb.r
    public void c(C2037a c2037a) {
        s t5 = this.f12284a;
        kotlin.jvm.internal.l.e(t5, "t");
        try {
            List n02 = Eb.o.n0(new n(new Ba.i(6), 0), t5.e());
            if (!c2037a.g() && !Thread.currentThread().isInterrupted()) {
                c2037a.c(n02);
            }
        } catch (Exception e2) {
            if (c2037a.g()) {
                return;
            }
            c2037a.a(e2);
        }
    }

    @Override // jb.InterfaceC1390a
    public void run() {
        s t5 = this.f12284a;
        kotlin.jvm.internal.l.e(t5, "t");
    }
}
