package W1;

import f.AbstractC1119c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: W1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578v extends AbstractC1119c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10568a;

    public C0578v(AtomicReference atomicReference) {
        this.f10568a = atomicReference;
    }

    @Override // f.AbstractC1119c
    public final void a(Object obj) {
        AbstractC1119c abstractC1119c = (AbstractC1119c) this.f10568a.get();
        if (abstractC1119c == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC1119c.a(obj);
    }
}
