package S2;

import A9.N2;
import N6.F;
import N6.H;
import N6.t0;
import N6.y0;
import Q2.e;
import U9.j;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.l;
import l2.EnumC1474s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8983a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8984b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8985c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8986d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8987e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8988f;
    public Serializable g;

    /* renamed from: h, reason: collision with root package name */
    public Cloneable f8989h;

    public b() {
        this.f8988f = y0.f7368u;
        F f4 = H.f7232b;
        this.g = t0.f7341e;
    }

    public b(e owner, N2 n22) {
        l.e(owner, "owner");
        this.f8986d = owner;
        this.f8987e = n22;
        this.f8988f = new j(14);
        this.g = new LinkedHashMap();
        this.f8985c = true;
    }

    public b(UUID uuid) {
        this.f8986d = uuid;
        this.f8988f = y0.f7368u;
        F f4 = H.f7232b;
        this.g = t0.f7341e;
    }

    public void a() {
        e eVar = (e) this.f8986d;
        if (eVar.w().f19242d != EnumC1474s.f19228b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f8983a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        ((N2) this.f8987e).invoke();
        eVar.w().a(new a(this, 0));
        this.f8983a = true;
    }
}
