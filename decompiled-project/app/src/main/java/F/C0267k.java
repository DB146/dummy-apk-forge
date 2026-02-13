package F;

import cc.InterfaceC0942l;
import java.util.concurrent.CancellationException;
import z.C2555g;

/* renamed from: F.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267k {

    /* renamed from: a, reason: collision with root package name */
    public final S.e f3980a;

    public C0267k(int i7) {
        switch (i7) {
            case 1:
                this.f3980a = new S.e(new C2555g[16]);
                return;
            default:
                this.f3980a = new S.e(new C0266j[16]);
                return;
        }
    }

    public void a(CancellationException cancellationException) {
        S.e eVar = this.f3980a;
        int i7 = eVar.f8961c;
        InterfaceC0942l[] interfaceC0942lArr = new InterfaceC0942l[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            interfaceC0942lArr[i10] = ((C2555g) eVar.f8959a[i10]).f27980b;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            interfaceC0942lArr[i11].d(cancellationException);
        }
        if (eVar.f8961c == 0) {
            return;
        }
        B.a.c("uncancelled requests present");
    }

    public void b() {
        S.e eVar = this.f3980a;
        Xb.g I6 = h3.H.I(0, eVar.f8961c);
        int i7 = I6.f11025a;
        int i10 = I6.f11026b;
        if (i7 <= i10) {
            while (true) {
                ((C2555g) eVar.f8959a[i7]).f27980b.resumeWith(Db.q.f3365a);
                if (i7 == i10) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        eVar.g();
    }
}
