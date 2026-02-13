package Jb;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;

/* loaded from: classes2.dex */
public abstract class i extends c implements kotlin.jvm.internal.h {
    private final int arity;

    public i(int i7, Hb.d dVar) {
        super(dVar);
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // Jb.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        w.f19135a.getClass();
        String a9 = x.a(this);
        l.d(a9, "renderLambdaToString(...)");
        return a9;
    }
}
