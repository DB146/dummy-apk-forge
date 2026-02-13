package Y5;

import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzu;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: Y5.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0625j0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0628k0 f11788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11789c;

    public /* synthetic */ CallableC0625j0(C0628k0 c0628k0, String str, int i7) {
        this.f11787a = i7;
        this.f11788b = c0628k0;
        this.f11789c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11787a) {
            case 0:
                return new zzu("internal.appMetadata", new CallableC0625j0(this.f11788b, this.f11789c, 1));
            case 1:
                C0628k0 c0628k0 = this.f11788b;
                C0633m c0633m = c0628k0.f12021b.f11405c;
                I1.S(c0633m);
                String str = this.f11789c;
                C0601b0 N02 = c0633m.N0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((C0646q0) c0628k0.f3094a).f11910d.O();
                hashMap.put("gmp_version", 130000L);
                if (N02 != null) {
                    String N10 = N02.N();
                    if (N10 != null) {
                        hashMap.put("app_version", N10);
                    }
                    hashMap.put("app_version_int", Long.valueOf(N02.P()));
                    hashMap.put("dynamite_version", Long.valueOf(N02.b()));
                }
                return hashMap;
            default:
                return new zzn("internal.remoteConfig", new q3.s(this.f11788b, this.f11789c));
        }
    }
}
