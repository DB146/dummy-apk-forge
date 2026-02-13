package Y;

import Q.AbstractC0499k0;
import Q.InterfaceC0493h0;
import Q.U0;

/* loaded from: classes.dex */
public final class j extends V.c implements InterfaceC0493h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j f11053d = new V.c(V.l.f9957e, 0);

    @Override // V.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0499k0) {
            return super.containsKey((AbstractC0499k0) obj);
        }
        return false;
    }

    @Override // Eb.AbstractC0256g, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof U0) {
            return super.containsValue((U0) obj);
        }
        return false;
    }

    @Override // V.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0499k0) {
            return (U0) super.get((AbstractC0499k0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0499k0) ? obj2 : (U0) super.getOrDefault((AbstractC0499k0) obj, (U0) obj2);
    }
}
