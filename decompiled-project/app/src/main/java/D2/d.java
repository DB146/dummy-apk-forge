package D2;

import E2.f;
import E2.g;
import E2.h;
import E2.i;
import android.net.Uri;
import android.view.InputEvent;
import cc.F;
import cc.P;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f f3163a;

    public d(f fVar) {
        this.f3163a = fVar;
    }

    public R6.a a(E2.a deletionRequest) {
        l.e(deletionRequest, "deletionRequest");
        throw null;
    }

    public R6.a b() {
        return E6.b.d(F.e(F.b(P.f14498a), null, new a(this, null), 3));
    }

    public R6.a c(g request) {
        l.e(request, "request");
        throw null;
    }

    public R6.a d(Uri attributionSource, InputEvent inputEvent) {
        l.e(attributionSource, "attributionSource");
        return E6.b.d(F.e(F.b(P.f14498a), null, new b(this, attributionSource, inputEvent, null), 3));
    }

    public R6.a e(Uri trigger) {
        l.e(trigger, "trigger");
        return E6.b.d(F.e(F.b(P.f14498a), null, new c(this, trigger, null), 3));
    }

    public R6.a f(h request) {
        l.e(request, "request");
        throw null;
    }

    public R6.a g(i request) {
        l.e(request, "request");
        throw null;
    }
}
