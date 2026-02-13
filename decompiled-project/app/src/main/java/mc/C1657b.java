package mc;

import Db.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;

/* renamed from: mc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1657b extends m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1659d f20837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1658c f20838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1657b(C1659d c1659d, C1658c c1658c, int i7) {
        super(1);
        this.f20836a = i7;
        this.f20837b = c1659d;
        this.f20838c = c1658c;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f20836a) {
            case 0:
                this.f20838c.getClass();
                this.f20837b.l(null);
                return q.f3365a;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1659d.f20841v;
                this.f20838c.getClass();
                C1659d c1659d = this.f20837b;
                atomicReferenceFieldUpdater.set(c1659d, null);
                c1659d.l(null);
                return q.f3365a;
        }
    }
}
