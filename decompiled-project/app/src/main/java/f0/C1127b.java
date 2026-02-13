package f0;

import V0.l;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import j0.AbstractC1365c;
import j0.C1364b;
import l0.C1442a;
import l0.C1443b;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127b extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final V0.d f16925a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16926b;

    /* renamed from: c, reason: collision with root package name */
    public final Rb.c f16927c;

    public C1127b(V0.d dVar, long j, Rb.c cVar) {
        this.f16925a = dVar;
        this.f16926b = j;
        this.f16927c = cVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C1443b c1443b = new C1443b();
        l lVar = l.f9982a;
        Canvas canvas2 = AbstractC1365c.f18532a;
        C1364b c1364b = new C1364b();
        c1364b.f18529a = canvas;
        C1442a c1442a = c1443b.f19141a;
        V0.c cVar = c1442a.f19137a;
        l lVar2 = c1442a.f19138b;
        j0.l lVar3 = c1442a.f19139c;
        long j = c1442a.f19140d;
        c1442a.f19137a = this.f16925a;
        c1442a.f19138b = lVar;
        c1442a.f19139c = c1364b;
        c1442a.f19140d = this.f16926b;
        c1364b.i();
        this.f16927c.invoke(c1443b);
        c1364b.g();
        c1442a.f19137a = cVar;
        c1442a.f19138b = lVar2;
        c1442a.f19139c = lVar3;
        c1442a.f19140d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f16926b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        V0.d dVar = this.f16925a;
        point.set(dVar.B(intBitsToFloat / dVar.k()), dVar.B(Float.intBitsToFloat((int) (j & 4294967295L)) / dVar.k()));
        point2.set(point.x / 2, point.y / 2);
    }
}
