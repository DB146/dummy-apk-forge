package ob;

import gb.AbstractC1204a;
import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicInteger;
import kb.C1436a;
import kb.EnumC1437b;

/* renamed from: ob.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1834b extends AtomicInteger implements gb.b {

    /* renamed from: a, reason: collision with root package name */
    public final gb.b f22205a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1204a[] f22206b;

    /* renamed from: c, reason: collision with root package name */
    public int f22207c;

    /* renamed from: d, reason: collision with root package name */
    public final C1436a f22208d = new C1436a();

    public C1834b(gb.b bVar, AbstractC1204a[] abstractC1204aArr) {
        this.f22205a = bVar;
        this.f22206b = abstractC1204aArr;
    }

    @Override // gb.b
    public final void a() {
        b();
    }

    public final void b() {
        C1436a c1436a = this.f22208d;
        if (c1436a.g() || getAndIncrement() != 0) {
            return;
        }
        while (!c1436a.g()) {
            int i7 = this.f22207c;
            this.f22207c = i7 + 1;
            AbstractC1204a[] abstractC1204aArr = this.f22206b;
            if (i7 == abstractC1204aArr.length) {
                this.f22205a.a();
                return;
            } else {
                abstractC1204aArr[i7].c(this);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // gb.b, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        C1436a c1436a = this.f22208d;
        c1436a.getClass();
        EnumC1437b.f(c1436a, interfaceC1269b);
    }

    @Override // gb.b, gb.q
    public final void onError(Throwable th) {
        this.f22205a.onError(th);
    }
}
