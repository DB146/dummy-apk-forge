package u;

import androidx.datastore.preferences.protobuf.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2052e extends T implements Map {

    /* renamed from: d, reason: collision with root package name */
    public b0 f24667d;

    /* renamed from: e, reason: collision with root package name */
    public C2049b f24668e;

    /* renamed from: f, reason: collision with root package name */
    public C2051d f24669f;

    public C2052e() {
        super(0);
    }

    public C2052e(C2052e c2052e) {
        super(0);
        g(c2052e);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        b0 b0Var = this.f24667d;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this, 1);
        this.f24667d = b0Var2;
        return b0Var2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2049b c2049b = this.f24668e;
        if (c2049b != null) {
            return c2049b;
        }
        C2049b c2049b2 = new C2049b(this);
        this.f24668e = c2049b2;
        return c2049b2;
    }

    public final boolean l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean m(Collection collection) {
        int i7 = this.f24637c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i7 != this.f24637c;
    }

    public final boolean n(Collection collection) {
        int i7 = this.f24637c;
        for (int i10 = i7 - 1; i10 >= 0; i10--) {
            if (!collection.contains(f(i10))) {
                h(i10);
            }
        }
        return i7 != this.f24637c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f24637c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C2051d c2051d = this.f24669f;
        if (c2051d != null) {
            return c2051d;
        }
        C2051d c2051d2 = new C2051d(this);
        this.f24669f = c2051d2;
        return c2051d2;
    }
}
