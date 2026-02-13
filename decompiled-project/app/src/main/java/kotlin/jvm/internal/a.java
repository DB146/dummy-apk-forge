package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class a implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19117a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f19118b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19119c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19120d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19121e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f19122f;

    /* renamed from: u, reason: collision with root package name */
    public final int f19123u;

    public a(int i7, int i10, Class cls, Object obj, String str, String str2) {
        this.f19117a = obj;
        this.f19118b = cls;
        this.f19119c = str;
        this.f19120d = str2;
        this.f19122f = i7;
        this.f19123u = i10 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19121e == aVar.f19121e && this.f19122f == aVar.f19122f && this.f19123u == aVar.f19123u && this.f19117a.equals(aVar.f19117a) && this.f19118b.equals(aVar.f19118b) && this.f19119c.equals(aVar.f19119c) && this.f19120d.equals(aVar.f19120d);
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.f19122f;
    }

    public final int hashCode() {
        return ((((A3.c.d(A3.c.d((this.f19118b.hashCode() + (this.f19117a.hashCode() * 31)) * 31, 31, this.f19119c), 31, this.f19120d) + (this.f19121e ? 1231 : 1237)) * 31) + this.f19122f) * 31) + this.f19123u;
    }

    public final String toString() {
        w.f19135a.getClass();
        return x.a(this);
    }
}
