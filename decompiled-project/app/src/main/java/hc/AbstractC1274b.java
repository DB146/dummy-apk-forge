package hc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: hc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1274b extends q {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17935a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1274b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC1273a.f17929a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r1 = r0.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.compareAndSet(r4, r2, r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0.get(r4) == r2) goto L17;
     */
    @Override // hc.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17935a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        R7.a aVar = AbstractC1273a.f17929a;
        if (obj2 == aVar) {
            R7.a c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract R7.a c(Object obj);
}
