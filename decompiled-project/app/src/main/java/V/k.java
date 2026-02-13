package V;

import Eb.AbstractC0250a;
import Eb.t;
import h3.H;
import java.util.Iterator;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class k extends AbstractC0250a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9955a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9956b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f9955a = i7;
        this.f9956b = obj;
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        switch (this.f9955a) {
            case 0:
                c cVar = (c) this.f9956b;
                cVar.getClass();
                return cVar.f9941b;
            default:
                return ((Matcher) ((r8.o) this.f9956b).f23858c).groupCount() + 1;
        }
    }

    @Override // Eb.AbstractC0250a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f9955a) {
            case 0:
                return ((c) this.f9956b).containsValue(obj);
            default:
                if (obj == null ? true : obj instanceof ac.d) {
                    return super.contains((ac.d) obj);
                }
                return false;
        }
    }

    @Override // Eb.AbstractC0250a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f9955a) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9955a) {
            case 0:
                c cVar = (c) this.f9956b;
                m[] mVarArr = new m[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    mVarArr[i7] = new n(2);
                }
                return new d(cVar.f9940a, mVarArr);
            default:
                return new Zb.k(new Zb.j(new t(new Xb.e(0, b() - 1, 1), 0), new Ba.o(this, 21), 1));
        }
    }

    public ac.d o(int i7) {
        r8.o oVar = (r8.o) this.f9956b;
        Matcher matcher = (Matcher) oVar.f23858c;
        Xb.g I6 = H.I(matcher.start(i7), matcher.end(i7));
        if (I6.f11025a < 0) {
            return null;
        }
        String group = ((Matcher) oVar.f23858c).group(i7);
        kotlin.jvm.internal.l.d(group, "group(...)");
        return new ac.d(group, I6);
    }
}
