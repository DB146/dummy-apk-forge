package N6;

import java.util.Map;

/* renamed from: N6.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447u extends AbstractC0441n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7344a;

    /* renamed from: b, reason: collision with root package name */
    public int f7345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0448v f7346c;

    public C0447u(C0448v c0448v, int i7) {
        this.f7346c = c0448v;
        Object obj = C0448v.f7348x;
        this.f7344a = c0448v.k()[i7];
        this.f7345b = i7;
    }

    public final void a() {
        int i7 = this.f7345b;
        Object obj = this.f7344a;
        C0448v c0448v = this.f7346c;
        if (i7 != -1 && i7 < c0448v.size()) {
            if (O5.b.o(obj, c0448v.k()[this.f7345b])) {
                return;
            }
        }
        Object obj2 = C0448v.f7348x;
        this.f7345b = c0448v.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7344a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0448v c0448v = this.f7346c;
        Map c10 = c0448v.c();
        if (c10 != null) {
            return c10.get(this.f7344a);
        }
        a();
        int i7 = this.f7345b;
        if (i7 == -1) {
            return null;
        }
        return c0448v.l()[i7];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0448v c0448v = this.f7346c;
        Map c10 = c0448v.c();
        Object obj2 = this.f7344a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i7 = this.f7345b;
        if (i7 == -1) {
            c0448v.put(obj2, obj);
            return null;
        }
        Object obj3 = c0448v.l()[i7];
        c0448v.l()[this.f7345b] = obj;
        return obj3;
    }
}
