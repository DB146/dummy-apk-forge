package Eb;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import y7.u0;

/* loaded from: classes2.dex */
public final class D extends AbstractC0255f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3854a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3855b;

    public D(List list) {
        this.f3855b = list;
    }

    public D(r8.o oVar) {
        this.f3855b = oVar;
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        switch (this.f3854a) {
            case 0:
                return ((List) this.f3855b).size();
            default:
                return ((Matcher) ((r8.o) this.f3855b).f23858c).groupCount() + 1;
        }
    }

    @Override // Eb.AbstractC0250a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f3854a) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.f3854a) {
            case 0:
                if (i7 >= 0 && i7 <= u0.s(this)) {
                    return ((List) this.f3855b).get(u0.s(this) - i7);
                }
                StringBuilder r10 = h3.o.r(i7, "Element index ", " must be in range [");
                r10.append(new Xb.e(0, u0.s(this), 1));
                r10.append("].");
                throw new IndexOutOfBoundsException(r10.toString());
            default:
                String group = ((Matcher) ((r8.o) this.f3855b).f23858c).group(i7);
                return group == null ? "" : group;
        }
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f3854a) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // Eb.AbstractC0255f, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f3854a) {
            case 0:
                return new C(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f3854a) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public ListIterator listIterator() {
        switch (this.f3854a) {
            case 0:
                return new C(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public ListIterator listIterator(int i7) {
        switch (this.f3854a) {
            case 0:
                return new C(this, i7);
            default:
                return super.listIterator(i7);
        }
    }
}
