package Y5;

import java.util.Objects;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final int f11567a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11568b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11569c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f11570d;

    public U(W w10, int i7, boolean z8, boolean z10) {
        Objects.requireNonNull(w10);
        this.f11570d = w10;
        this.f11567a = i7;
        this.f11568b = z8;
        this.f11569c = z10;
    }

    public final void a(String str) {
        this.f11570d.S(this.f11567a, this.f11568b, this.f11569c, str, null, null, null);
    }

    public final void b(Object obj, String str) {
        this.f11570d.S(this.f11567a, this.f11568b, this.f11569c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f11570d.S(this.f11567a, this.f11568b, this.f11569c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f11570d.S(this.f11567a, this.f11568b, this.f11569c, str, obj, obj2, obj3);
    }
}
