package i2;

import A9.o3;

/* renamed from: i2.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1311T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f18231b;

    public /* synthetic */ RunnableC1311T(o3 o3Var, int i7) {
        this.f18230a = i7;
        this.f18231b = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18230a) {
            case 0:
                this.f18231b.f1334a.setVisibility(0);
                return;
            default:
                this.f18231b.f1334a.setVisibility(4);
                return;
        }
    }
}
