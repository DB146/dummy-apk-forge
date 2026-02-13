package y3;

import a.AbstractC0672a;
import android.graphics.drawable.Drawable;
import h3.H;
import j0.AbstractC1365c;
import l0.InterfaceC1445d;
import o0.AbstractC1775c;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2379b extends AbstractC1775c {

    /* renamed from: e, reason: collision with root package name */
    public final Drawable f26795e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26796f;

    public C2379b(Drawable drawable) {
        long j;
        this.f26795e = drawable;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            j = 9205357640488583168L;
        } else {
            j = AbstractC0672a.u((drawable.getIntrinsicWidth() << 32) | (drawable.getIntrinsicHeight() & 4294967295L));
        }
        this.f26796f = j;
    }

    @Override // o0.AbstractC1775c
    public final void a(float f4) {
        this.f26795e.setAlpha(H.k(Tb.a.F(f4 * 255), 0, 255));
    }

    @Override // o0.AbstractC1775c
    public final void b(j0.i iVar) {
        this.f26795e.setColorFilter(iVar != null ? iVar.f18543a : null);
    }

    @Override // o0.AbstractC1775c
    public final void c(V0.l layoutDirection) {
        int i7;
        kotlin.jvm.internal.l.e(layoutDirection, "layoutDirection");
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i7 = 1;
            if (ordinal != 1) {
                throw new Db.d(1);
            }
        } else {
            i7 = 0;
        }
        this.f26795e.setLayoutDirection(i7);
    }

    @Override // o0.AbstractC1775c
    public final long e() {
        return this.f26796f;
    }

    @Override // o0.AbstractC1775c
    public final void f(InterfaceC1445d interfaceC1445d) {
        kotlin.jvm.internal.l.e(interfaceC1445d, "<this>");
        j0.l x2 = interfaceC1445d.u().x();
        int F10 = Tb.a.F(i0.e.c(interfaceC1445d.v()));
        int F11 = Tb.a.F(i0.e.b(interfaceC1445d.v()));
        Drawable drawable = this.f26795e;
        drawable.setBounds(0, 0, F10, F11);
        try {
            x2.i();
            drawable.draw(AbstractC1365c.a(x2));
        } finally {
            x2.g();
        }
    }
}
