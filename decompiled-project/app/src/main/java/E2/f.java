package E2;

import Db.q;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import cc.C0944m;
import cc.F;
import kotlin.jvm.internal.l;
import u1.C2091a;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f3520a;

    public f(MeasurementManager mMeasurementManager) {
        l.e(mMeasurementManager, "mMeasurementManager");
        this.f3520a = mMeasurementManager;
    }

    public static Object b(f fVar, a aVar, Hb.d<? super q> dVar) {
        new C0944m(1, com.bumptech.glide.c.F(dVar)).s();
        MeasurementManager measurementManager = fVar.f3520a;
        throw null;
    }

    public static Object d(f fVar, Hb.d<? super Integer> dVar) {
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(dVar));
        c0944m.s();
        fVar.f3520a.getMeasurementApiStatus(new d(0), new C2091a(c0944m));
        Object r10 = c0944m.r();
        Ib.a aVar = Ib.a.f5345a;
        return r10;
    }

    public static Object g(f fVar, g gVar, Hb.d<? super q> dVar) {
        Object k = F.k(new e(fVar, null), dVar);
        return k == Ib.a.f5345a ? k : q.f3365a;
    }

    public static Object h(f fVar, Uri uri, InputEvent inputEvent, Hb.d<? super q> dVar) {
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(dVar));
        c0944m.s();
        fVar.f3520a.registerSource(uri, inputEvent, new d(0), new C2091a(c0944m));
        Object r10 = c0944m.r();
        return r10 == Ib.a.f5345a ? r10 : q.f3365a;
    }

    public static Object j(f fVar, Uri uri, Hb.d<? super q> dVar) {
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(dVar));
        c0944m.s();
        fVar.f3520a.registerTrigger(uri, new d(0), new C2091a(c0944m));
        Object r10 = c0944m.r();
        return r10 == Ib.a.f5345a ? r10 : q.f3365a;
    }

    public static Object l(f fVar, h hVar, Hb.d<? super q> dVar) {
        new C0944m(1, com.bumptech.glide.c.F(dVar)).s();
        MeasurementManager measurementManager = fVar.f3520a;
        throw null;
    }

    public static Object n(f fVar, i iVar, Hb.d<? super q> dVar) {
        new C0944m(1, com.bumptech.glide.c.F(dVar)).s();
        MeasurementManager measurementManager = fVar.f3520a;
        throw null;
    }

    public Object a(a aVar, Hb.d<? super q> dVar) {
        return b(this, aVar, dVar);
    }

    public Object c(Hb.d<? super Integer> dVar) {
        return d(this, dVar);
    }

    public Object e(g gVar, Hb.d<? super q> dVar) {
        return g(this, gVar, dVar);
    }

    public Object f(Uri uri, InputEvent inputEvent, Hb.d<? super q> dVar) {
        return h(this, uri, inputEvent, dVar);
    }

    public Object i(Uri uri, Hb.d<? super q> dVar) {
        return j(this, uri, dVar);
    }

    public Object k(h hVar, Hb.d<? super q> dVar) {
        return l(this, hVar, dVar);
    }

    public Object m(i iVar, Hb.d<? super q> dVar) {
        return n(this, iVar, dVar);
    }
}
