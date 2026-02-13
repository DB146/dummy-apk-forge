package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class m implements h, Serializable {
    private final int arity;

    public m(int i7) {
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        w.f19135a.getClass();
        String a9 = x.a(this);
        l.d(a9, "renderLambdaToString(...)");
        return a9;
    }
}
