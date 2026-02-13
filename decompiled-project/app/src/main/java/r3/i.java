package r3;

import h3.z;
import i3.C1340B;
import java.util.Set;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final i3.d f23668a;

    /* renamed from: b, reason: collision with root package name */
    public final i3.i f23669b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23670c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23671d;

    public i(i3.d processor, i3.i token, boolean z8, int i7) {
        kotlin.jvm.internal.l.e(processor, "processor");
        kotlin.jvm.internal.l.e(token, "token");
        this.f23668a = processor;
        this.f23669b = token;
        this.f23670c = z8;
        this.f23671d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d10;
        C1340B b2;
        if (this.f23670c) {
            i3.d dVar = this.f23668a;
            i3.i iVar = this.f23669b;
            int i7 = this.f23671d;
            dVar.getClass();
            String str = iVar.f18357a.f23386a;
            synchronized (dVar.k) {
                b2 = dVar.b(str);
            }
            d10 = i3.d.d(str, b2, i7);
        } else {
            i3.d dVar2 = this.f23668a;
            i3.i iVar2 = this.f23669b;
            int i10 = this.f23671d;
            dVar2.getClass();
            String str2 = iVar2.f18357a.f23386a;
            synchronized (dVar2.k) {
                try {
                    if (dVar2.f18347f.get(str2) != null) {
                        z.e().a(i3.d.f18341l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) dVar2.f18348h.get(str2);
                        if (set != null && set.contains(iVar2)) {
                            d10 = i3.d.d(str2, dVar2.b(str2), i10);
                        }
                    }
                    d10 = false;
                } finally {
                }
            }
        }
        z.e().a(z.g("StopWorkRunnable"), "StopWorkRunnable for " + this.f23669b.f18357a.f23386a + "; Processor.stopWork = " + d10);
    }
}
