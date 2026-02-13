package N6;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class D extends AbstractC0441n implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7218a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7219b;

    public D(Object obj, Object obj2) {
        this.f7218a = obj;
        this.f7219b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7218a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7219b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
