package p0;

import Eb.v;
import a.AbstractC0672a;
import android.graphics.Path;
import j0.C1368f;
import j0.C1369g;
import j0.F;
import l0.C1447f;
import l0.InterfaceC1445d;

/* loaded from: classes.dex */
public final class f extends m {

    /* renamed from: b, reason: collision with root package name */
    public F f22996b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22997c;

    /* renamed from: d, reason: collision with root package name */
    public float f22998d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22999e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23000f;
    public final C1368f g;

    /* renamed from: h, reason: collision with root package name */
    public C1368f f23001h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f23002i;

    public f() {
        int i7 = q.f23027a;
        this.f22997c = v.f3891a;
        this.f22998d = 1.0f;
        this.f22999e = true;
        C1368f a9 = j0.h.a();
        this.g = a9;
        this.f23001h = a9;
        this.f23002i = android.support.v4.media.session.b.y(Db.h.f3352a, e.f22993b);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List, java.lang.Object] */
    @Override // p0.m
    public final void a(InterfaceC1445d interfaceC1445d) {
        if (this.f22999e) {
            AbstractC0672a.t(this.f22997c, this.g);
            e();
        } else if (this.f23000f) {
            e();
        }
        this.f22999e = false;
        this.f23000f = false;
        F f4 = this.f22996b;
        if (f4 != null) {
            interfaceC1445d.g(this.f23001h, f4, 1.0f, (56 & 8) != 0 ? C1447f.f19147b : null, (56 & 32) != 0 ? 3 : 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [Db.g, java.lang.Object] */
    public final void e() {
        Path path;
        float f4 = this.f22998d;
        C1368f c1368f = this.g;
        if (f4 == 1.0f) {
            this.f23001h = c1368f;
            return;
        }
        if (kotlin.jvm.internal.l.a(this.f23001h, c1368f)) {
            this.f23001h = j0.h.a();
        } else {
            int i7 = this.f23001h.f18539a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f23001h.f18539a.rewind();
            this.f23001h.c(i7);
        }
        ?? r02 = this.f23002i;
        C1369g c1369g = (C1369g) r02.getValue();
        if (c1368f != null) {
            c1369g.getClass();
            path = c1368f.f18539a;
        } else {
            path = null;
        }
        c1369g.f18542a.setPath(path, false);
        float length = ((C1369g) r02.getValue()).f18542a.getLength();
        float f10 = 0.0f * length;
        float f11 = ((this.f22998d + 0.0f) % 1.0f) * length;
        if (f10 <= f11) {
            ((C1369g) r02.getValue()).a(f10, f11, this.f23001h);
        } else {
            ((C1369g) r02.getValue()).a(f10, length, this.f23001h);
            ((C1369g) r02.getValue()).a(0.0f, f11, this.f23001h);
        }
    }

    public final String toString() {
        return this.g.toString();
    }
}
