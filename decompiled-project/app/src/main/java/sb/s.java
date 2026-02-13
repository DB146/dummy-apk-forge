package sb;

import java.util.concurrent.Callable;
import jb.InterfaceC1396g;
import xb.AbstractC2275c;
import xb.C2274b;
import y7.u0;

/* loaded from: classes2.dex */
public final class s extends gb.i implements InterfaceC1396g {

    /* renamed from: a, reason: collision with root package name */
    public final Callable f24325a;

    public s(Callable callable) {
        this.f24325a = callable;
    }

    @Override // jb.InterfaceC1396g
    public final Object get() {
        Object call = this.f24325a.call();
        if (call == null) {
            throw AbstractC2275c.a("The Callable returned a null value.");
        }
        C2274b c2274b = AbstractC2275c.f26321a;
        return call;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        nb.f fVar = new nb.f(lVar);
        lVar.c(fVar);
        if (fVar.g()) {
            return;
        }
        try {
            Object call = this.f24325a.call();
            if (call == null) {
                throw AbstractC2275c.a("Callable returned a null value.");
            }
            C2274b c2274b = AbstractC2275c.f26321a;
            fVar.d(call);
        } catch (Throwable th) {
            u0.L(th);
            if (fVar.g()) {
                com.bumptech.glide.d.t(th);
            } else {
                lVar.onError(th);
            }
        }
    }
}
