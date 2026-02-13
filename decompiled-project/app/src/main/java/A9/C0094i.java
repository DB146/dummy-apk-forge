package A9;

import H2.AbstractC0303q;
import java.util.List;

/* renamed from: A9.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0094i extends AbstractC0303q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f1222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O5.b f1223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0098j f1224d;

    public C0094i(C0098j c0098j, List list, O5.b bVar) {
        this.f1224d = c0098j;
        this.f1222b = list;
        this.f1223c = bVar;
    }

    @Override // H2.AbstractC0303q
    public final boolean a(int i7, int i10) {
        return this.f1223c.g(this.f1224d.f1234d.get(i7), this.f1222b.get(i10));
    }

    @Override // H2.AbstractC0303q
    public final boolean b(int i7, int i10) {
        return this.f1223c.h(this.f1224d.f1234d.get(i7), this.f1222b.get(i10));
    }

    @Override // H2.AbstractC0303q
    public final void g(int i7, int i10) {
        this.f1224d.f1234d.get(i7);
        this.f1222b.get(i10);
        this.f1223c.getClass();
    }

    @Override // H2.AbstractC0303q
    public final int h() {
        return this.f1222b.size();
    }

    @Override // H2.AbstractC0303q
    public final int i() {
        return this.f1224d.f1234d.size();
    }
}
