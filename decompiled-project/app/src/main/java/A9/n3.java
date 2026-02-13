package A9;

/* loaded from: classes2.dex */
public final class n3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f1306b;

    public /* synthetic */ n3(o3 o3Var, int i7) {
        this.f1305a = i7;
        this.f1306b = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1305a) {
            case 0:
                this.f1306b.f1334a.setVisibility(0);
                return;
            default:
                this.f1306b.f1334a.setVisibility(4);
                return;
        }
    }
}
