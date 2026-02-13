package m4;

import java.io.Serializable;
import java.util.HashSet;
import p7.C1857a;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public String f20191a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f20192b;

    /* renamed from: c, reason: collision with root package name */
    public int f20193c;

    /* renamed from: d, reason: collision with root package name */
    public Object f20194d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f20195e;

    /* renamed from: f, reason: collision with root package name */
    public Object f20196f;
    public Serializable g;

    public Y(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f20194d = hashSet;
        this.f20195e = new HashSet();
        this.f20192b = 0;
        this.f20193c = 0;
        this.g = new HashSet();
        hashSet.add(p7.p.a(cls));
        for (Class cls2 : clsArr) {
            c2.i.e(cls2, "Null interface");
            ((HashSet) this.f20194d).add(p7.p.a(cls2));
        }
    }

    public void a(p7.h hVar) {
        if (((HashSet) this.f20194d).contains(hVar.f23137a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f20195e).add(hVar);
    }

    public C1857a b() {
        if (((p7.c) this.f20196f) != null) {
            return new C1857a(this.f20191a, new HashSet((HashSet) this.f20194d), new HashSet((HashSet) this.f20195e), this.f20192b, this.f20193c, (p7.c) this.f20196f, (HashSet) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i7) {
        if (!(this.f20192b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f20192b = i7;
    }
}
