package xc;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class p extends q {

    /* renamed from: d, reason: collision with root package name */
    public Object f26366d;

    public p(String str) {
        vc.i.D(str);
        this.f26366d = str;
    }

    @Override // xc.q
    public final int C() {
        return 0;
    }

    @Override // xc.q
    public final q F(q qVar) {
        p pVar = (p) super.F(qVar);
        Object obj = this.f26366d;
        if (obj instanceof b) {
            pVar.f26366d = ((b) obj).clone();
        }
        return pVar;
    }

    @Override // xc.q
    public final List G() {
        return q.f26367c;
    }

    @Override // xc.q
    public final boolean J() {
        return this.f26366d instanceof b;
    }

    @Override // xc.q
    public final String O() {
        return Z();
    }

    @Override // xc.q
    public final l T() {
        return this.f26368a;
    }

    public final String Z() {
        return o(N());
    }

    public final void a0() {
        Object obj = this.f26366d;
        if (obj instanceof b) {
            return;
        }
        b bVar = new b();
        this.f26366d = bVar;
        bVar.H(N(), (String) obj);
    }

    @Override // xc.q
    public final String b(String str) {
        a0();
        return super.b(str);
    }

    @Override // xc.q
    public final String o(String str) {
        return !(this.f26366d instanceof b) ? N().equals(str) ? (String) this.f26366d : "" : super.o(str);
    }

    @Override // xc.q
    public final void t(String str, String str2) {
        if (!(this.f26366d instanceof b) && str.equals(N())) {
            this.f26366d = str2;
        } else {
            a0();
            super.t(str, str2);
        }
    }

    @Override // xc.q
    public final b y() {
        a0();
        return (b) this.f26366d;
    }

    @Override // xc.q
    public final String z() {
        l lVar = this.f26368a;
        return lVar != null ? lVar.z() : "";
    }
}
