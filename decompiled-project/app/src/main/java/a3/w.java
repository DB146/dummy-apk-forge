package a3;

import java.util.ArrayList;
import u.C2052e;

/* loaded from: classes.dex */
public final class w extends v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2052e f12599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f12600b;

    public w(x xVar, C2052e c2052e) {
        this.f12600b = xVar;
        this.f12599a = c2052e;
    }

    @Override // a3.v, a3.s
    public final void d(u uVar) {
        ((ArrayList) this.f12599a.get(this.f12600b.f12602b)).remove(uVar);
        uVar.B(this);
    }
}
