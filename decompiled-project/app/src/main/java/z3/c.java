package z3;

import C3.v;
import android.graphics.drawable.Drawable;
import cc.F;
import ec.q;
import ec.r;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements T3.i, S3.e {

    /* renamed from: a, reason: collision with root package name */
    public final r f28221a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.b f28222b;

    /* renamed from: c, reason: collision with root package name */
    public volatile i f28223c;

    /* renamed from: d, reason: collision with root package name */
    public volatile S3.c f28224d;

    /* renamed from: e, reason: collision with root package name */
    public volatile h f28225e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f28226f;

    public c(r scope, Y6.b size) {
        l.e(scope, "scope");
        l.e(size, "size");
        this.f28221a = scope;
        this.f28222b = size;
        this.f28226f = new ArrayList();
        if (size instanceof f) {
            this.f28223c = ((f) size).k;
        } else if (size instanceof C2586a) {
            F.B(scope, null, 0, new C2587b(this, null), 3);
        }
    }

    @Override // T3.i
    public final void a(S3.c cVar) {
        this.f28224d = cVar;
    }

    @Override // T3.i
    public final void b(Drawable drawable) {
        ((q) this.f28221a).h(new g(4, drawable));
    }

    @Override // P3.i
    public final void c() {
    }

    @Override // T3.i
    public final void d(S3.g gVar) {
        synchronized (this) {
            this.f28226f.remove(gVar);
        }
    }

    @Override // T3.i
    public final void e(Drawable drawable) {
        this.f28225e = null;
        ((q) this.f28221a).h(new g(2, drawable));
    }

    @Override // T3.i
    public final void f(S3.g gVar) {
        i iVar = this.f28223c;
        if (iVar != null) {
            gVar.m(iVar.f28238a, iVar.f28239b);
            return;
        }
        synchronized (this) {
            i iVar2 = this.f28223c;
            if (iVar2 != null) {
                gVar.m(iVar2.f28238a, iVar2.f28239b);
            } else {
                this.f28226f.add(gVar);
            }
        }
    }

    @Override // T3.i
    public final S3.c g() {
        return this.f28224d;
    }

    @Override // T3.i
    public final void h(Drawable drawable) {
        this.f28225e = null;
        ((q) this.f28221a).h(new g(1, drawable));
    }

    @Override // T3.i
    public final void i(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // P3.i
    public final void j() {
    }

    @Override // P3.i
    public final void k() {
    }

    @Override // S3.e
    public final boolean onLoadFailed(v vVar, Object obj, T3.i target, boolean z8) {
        l.e(target, "target");
        h hVar = this.f28225e;
        S3.c cVar = this.f28224d;
        if (hVar == null || cVar == null || cVar.i() || cVar.isRunning()) {
            return false;
        }
        q qVar = (q) this.f28221a;
        qVar.getClass();
        qVar.h(new h(4, hVar.f28235b, hVar.f28236c, hVar.f28237d));
        return false;
    }

    @Override // S3.e
    public final boolean onResourceReady(Object obj, Object model, T3.i target, A3.a dataSource, boolean z8) {
        l.e(model, "model");
        l.e(target, "target");
        l.e(dataSource, "dataSource");
        S3.c cVar = this.f28224d;
        h hVar = new h((cVar == null || !cVar.i()) ? 2 : 3, obj, z8, dataSource);
        this.f28225e = hVar;
        ((q) this.f28221a).h(hVar);
        return true;
    }
}
