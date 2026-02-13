package Jb;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;

/* loaded from: classes2.dex */
public abstract class h extends g implements kotlin.jvm.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f5770a;

    public h(Hb.d dVar) {
        super(dVar);
        this.f5770a = 2;
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.f5770a;
    }

    @Override // Jb.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        w.f19135a.getClass();
        String a9 = x.a(this);
        l.d(a9, "renderLambdaToString(...)");
        return a9;
    }
}
