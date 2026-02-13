package o5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import ia.C1358d;
import n5.D;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final d f22028a;

    /* renamed from: b, reason: collision with root package name */
    public final q f22029b;

    /* renamed from: c, reason: collision with root package name */
    public final s f22030c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22031d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f22032e;

    /* renamed from: f, reason: collision with root package name */
    public float f22033f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f22034h;

    /* renamed from: i, reason: collision with root package name */
    public float f22035i;
    public int j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f22036l;

    /* renamed from: m, reason: collision with root package name */
    public long f22037m;

    /* renamed from: n, reason: collision with root package name */
    public long f22038n;

    /* renamed from: o, reason: collision with root package name */
    public long f22039o;

    /* renamed from: p, reason: collision with root package name */
    public long f22040p;

    /* renamed from: q, reason: collision with root package name */
    public long f22041q;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o5.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(Context context) {
        q qVar;
        DisplayManager displayManager;
        ?? obj = new Object();
        obj.f21953a = new C1808c();
        obj.f21954b = new C1808c();
        obj.f21956d = -9223372036854775807L;
        this.f22028a = obj;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            qVar = (D.f21141a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new r(displayManager);
            if (qVar == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    qVar = new C1358d(windowManager, 9);
                }
            }
            this.f22029b = qVar;
            this.f22030c = qVar != null ? s.f22023e : null;
            this.k = -9223372036854775807L;
            this.f22036l = -9223372036854775807L;
            this.f22033f = -1.0f;
            this.f22035i = 1.0f;
            this.j = 0;
        }
        qVar = null;
        this.f22029b = qVar;
        this.f22030c = qVar != null ? s.f22023e : null;
        this.k = -9223372036854775807L;
        this.f22036l = -9223372036854775807L;
        this.f22033f = -1.0f;
        this.f22035i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (D.f21141a < 30 || (surface = this.f22032e) == null || this.j == Integer.MIN_VALUE || this.f22034h == 0.0f) {
            return;
        }
        this.f22034h = 0.0f;
        p.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f4;
        float f10;
        if (D.f21141a < 30 || this.f22032e == null) {
            return;
        }
        d dVar = this.f22028a;
        if (!dVar.f21953a.a()) {
            f4 = this.f22033f;
        } else if (dVar.f21953a.a()) {
            f4 = (float) (1.0E9d / (dVar.f21953a.f21950e != 0 ? r2.f21951f / r4 : 0L));
        } else {
            f4 = -1.0f;
        }
        float f11 = this.g;
        if (f4 == f11) {
            return;
        }
        if (f4 != -1.0f && f11 != -1.0f) {
            if (dVar.f21953a.a()) {
                if ((dVar.f21953a.a() ? dVar.f21953a.f21951f : -9223372036854775807L) >= 5000000000L) {
                    f10 = 0.02f;
                    if (Math.abs(f4 - this.g) < f10) {
                        return;
                    }
                }
            }
            f10 = 1.0f;
            if (Math.abs(f4 - this.g) < f10) {
            }
        } else if (f4 == -1.0f && dVar.f21957e < 30) {
            return;
        }
        this.g = f4;
        c(false);
    }

    public final void c(boolean z8) {
        Surface surface;
        float f4;
        if (D.f21141a < 30 || (surface = this.f22032e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f22031d) {
            float f10 = this.g;
            if (f10 != -1.0f) {
                f4 = f10 * this.f22035i;
                if (z8 && this.f22034h == f4) {
                    return;
                }
                this.f22034h = f4;
                p.a(surface, f4);
            }
        }
        f4 = 0.0f;
        if (z8) {
        }
        this.f22034h = f4;
        p.a(surface, f4);
    }
}
