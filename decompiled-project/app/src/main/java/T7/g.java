package T7;

import java.util.Stack;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f9338e;

    public g(h hVar) {
        this.f9338e = hVar;
    }

    @Override // T7.e
    public final void y(c cVar, s sVar) {
        h hVar = this.f9338e;
        hVar.e();
        if (hVar.f9339a) {
            ((StringBuilder) hVar.f9342d).append(",");
        }
        ((StringBuilder) hVar.f9342d).append(O7.k.f(cVar.f9331a));
        ((StringBuilder) hVar.f9342d).append(":(");
        int i7 = hVar.f9341c;
        Stack stack = (Stack) hVar.f9343e;
        if (i7 == stack.size()) {
            stack.add(cVar);
        } else {
            stack.set(hVar.f9341c, cVar);
        }
        hVar.f9341c++;
        hVar.f9339a = false;
        q3.l.G(sVar, hVar);
        hVar.f9341c--;
        StringBuilder sb2 = (StringBuilder) hVar.f9342d;
        if (sb2 != null) {
            sb2.append(")");
        }
        hVar.f9339a = true;
    }
}
