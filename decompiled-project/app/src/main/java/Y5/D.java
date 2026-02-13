package Y5;

import com.google.android.gms.internal.measurement.zzkl;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ D f11233b = new D(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11234a;

    public /* synthetic */ D(int i7) {
        this.f11234a = i7;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11234a) {
            case 0:
                zzkl.zzc();
                return;
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f11234a) {
            case 1:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }
}
