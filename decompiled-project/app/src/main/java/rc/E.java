package rc;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final D f23937a = new D(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f23938b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f23939c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f23938b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i7 = 0; i7 < highestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f23939c = atomicReferenceArr;
    }

    public static final void a(D segment) {
        kotlin.jvm.internal.l.e(segment, "segment");
        if (segment.f23936f != null || segment.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f23934d) {
            return;
        }
        AtomicReference atomicReference = f23939c[(int) (Thread.currentThread().getId() & (f23938b - 1))];
        D d10 = f23937a;
        D d11 = (D) atomicReference.getAndSet(d10);
        if (d11 == d10) {
            return;
        }
        int i7 = d11 != null ? d11.f23933c : 0;
        if (i7 >= 65536) {
            atomicReference.set(d11);
            return;
        }
        segment.f23936f = d11;
        segment.f23932b = 0;
        segment.f23933c = i7 + 8192;
        atomicReference.set(segment);
    }

    public static final D b() {
        AtomicReference atomicReference = f23939c[(int) (Thread.currentThread().getId() & (f23938b - 1))];
        D d10 = f23937a;
        D d11 = (D) atomicReference.getAndSet(d10);
        if (d11 == d10) {
            return new D();
        }
        if (d11 == null) {
            atomicReference.set(null);
            return new D();
        }
        atomicReference.set(d11.f23936f);
        d11.f23936f = null;
        d11.f23933c = 0;
        return d11;
    }
}
