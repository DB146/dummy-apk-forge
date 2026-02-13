package A9;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: A9.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0157y extends M1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A2 f1473a;

    public C0157y(A2 a22) {
        this.f1473a = a22;
    }

    @Override // A9.M1
    public final void a(RecyclerView recyclerView, H2.i0 i0Var, int i7, int i10) {
        A2 a22 = this.f1473a;
        if (a22.f755r0.f1486b) {
            return;
        }
        a22.f753p0 = i7;
        C0131r1 c0131r1 = a22.f759v0;
        if (c0131r1 == i0Var && a22.f760w0 == i10) {
            return;
        }
        a22.f760w0 = i10;
        if (c0131r1 != null) {
            A2.z0(c0131r1, false, false);
        }
        C0131r1 c0131r12 = (C0131r1) i0Var;
        a22.f759v0 = c0131r12;
        if (c0131r12 != null) {
            A2.z0(c0131r12, true, false);
        }
    }
}
