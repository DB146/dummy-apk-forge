package h3;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f17711b;

    public /* synthetic */ s(AtomicBoolean atomicBoolean, int i7) {
        this.f17710a = i7;
        this.f17711b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17710a) {
            case 0:
                this.f17711b.set(true);
                return;
            default:
                this.f17711b.set(true);
                return;
        }
    }
}
