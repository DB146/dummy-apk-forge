package w8;

import s7.b;
import y8.d;

/* renamed from: w8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2224a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f25823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f25824c;

    public /* synthetic */ RunnableC2224a(b bVar, d dVar, int i7) {
        this.f25822a = i7;
        this.f25823b = bVar;
        this.f25824c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25822a) {
            case 0:
                this.f25823b.a(this.f25824c);
                return;
            default:
                this.f25823b.a(this.f25824c);
                return;
        }
    }
}
