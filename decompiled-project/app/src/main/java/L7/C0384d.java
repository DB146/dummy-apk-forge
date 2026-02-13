package L7;

import A0.G0;
import android.os.Build;
import com.google.android.gms.common.internal.G;

/* renamed from: L7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384d {

    /* renamed from: a, reason: collision with root package name */
    public A7.a f6329a;

    /* renamed from: b, reason: collision with root package name */
    public H7.e f6330b;

    /* renamed from: c, reason: collision with root package name */
    public q3.e f6331c;

    /* renamed from: d, reason: collision with root package name */
    public q3.c f6332d;

    /* renamed from: e, reason: collision with root package name */
    public G0 f6333e;

    /* renamed from: f, reason: collision with root package name */
    public String f6334f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public int f6335h;

    /* renamed from: i, reason: collision with root package name */
    public Y6.i f6336i;
    public boolean j;
    public q3.l k;

    public final O7.b a() {
        G0 g02 = this.f6333e;
        if (g02 != null) {
            return (O7.b) g02.f27b;
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    public final Q7.h b(String str) {
        return new Q7.h(this.f6329a, str, null, 4);
    }

    public final q3.l c() {
        if (this.k == null) {
            synchronized (this) {
                this.k = new q3.l(this.f6336i);
            }
        }
        return this.k;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [A7.a, java.lang.Object] */
    public final void d() {
        if (this.f6329a == null) {
            c().getClass();
            int i7 = this.f6335h;
            ?? obj = new Object();
            obj.f532b = null;
            obj.f531a = i7;
            this.f6329a = obj;
        }
        c();
        if (this.g == null) {
            c().getClass();
            this.g = X.c.t("Firebase/5/21.0.0/", A3.c.k(new StringBuilder(), Build.VERSION.SDK_INT, "/Android"));
        }
        if (this.f6330b == null) {
            c().getClass();
            this.f6330b = new H7.e(0);
        }
        if (this.f6333e == null) {
            q3.l lVar = this.k;
            lVar.getClass();
            this.f6333e = new G0(lVar, b("RunLoop"));
        }
        if (this.f6334f == null) {
            this.f6334f = "default";
        }
        G.h(this.f6331c, "You must register an authTokenProvider before initializing Context.");
        G.h(this.f6332d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    public final synchronized void e(String str) {
        if (this.j) {
            throw new RuntimeException("Modifications to DatabaseConfig objects must occur before they are in use");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.f6334f = str;
    }
}
