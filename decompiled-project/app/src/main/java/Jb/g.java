package Jb;

import Hb.j;

/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(Hb.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != j.f4919a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // Hb.d
    public final Hb.i getContext() {
        return j.f4919a;
    }
}
