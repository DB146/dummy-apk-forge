package T7;

import java.util.Map;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: c, reason: collision with root package name */
    public final Map f9346c;

    public i(Map map, s sVar) {
        super(sVar);
        this.f9346c = map;
    }

    @Override // T7.o
    public final /* bridge */ /* synthetic */ int b(o oVar) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f9346c.equals(iVar.f9346c) && this.f9354a.equals(iVar.f9354a);
    }

    @Override // T7.s
    public final Object getValue() {
        return this.f9346c;
    }

    public final int hashCode() {
        return this.f9354a.hashCode() + this.f9346c.hashCode();
    }

    @Override // T7.o
    public final int i() {
        return 1;
    }

    @Override // T7.s
    public final String m(int i7) {
        return o(i7) + "deferredValue:" + this.f9346c;
    }

    @Override // T7.s
    public final s s(s sVar) {
        O7.k.c(com.bumptech.glide.c.I(sVar));
        return new i(this.f9346c, sVar);
    }
}
