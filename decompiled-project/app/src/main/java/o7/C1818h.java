package o7;

import com.google.android.gms.internal.p002firebaseauthapi.zze;

/* renamed from: o7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1818h {

    /* renamed from: f, reason: collision with root package name */
    public static final I5.a f22088f = new I5.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    public volatile long f22089a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f22090b;

    /* renamed from: c, reason: collision with root package name */
    public long f22091c;

    /* renamed from: d, reason: collision with root package name */
    public zze f22092d;

    /* renamed from: e, reason: collision with root package name */
    public hc.i f22093e;

    public final void a() {
        f22088f.e(A3.c.h("Scheduling refresh for ", this.f22089a - this.f22091c), new Object[0]);
        this.f22092d.removeCallbacks(this.f22093e);
        this.f22090b = Math.max((this.f22089a - System.currentTimeMillis()) - this.f22091c, 0L) / 1000;
        this.f22092d.postDelayed(this.f22093e, this.f22090b * 1000);
    }
}
