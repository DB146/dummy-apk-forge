package d2;

import android.util.IntProperty;

/* loaded from: classes.dex */
public final class e extends IntProperty {
    @Override // android.util.Property
    public final Integer get(Object obj) {
        return Integer.valueOf(((g) obj).f16505b.f16502e);
    }

    @Override // android.util.IntProperty
    public final void setValue(Object obj, int i7) {
        g gVar = (g) obj;
        gVar.f16505b.f16502e = i7;
        gVar.invalidateSelf();
    }
}
