package N6;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class D0 extends W {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f7221c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f7222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(Set set, Set set2, int i7) {
        super(2);
        this.f7220b = i7;
        this.f7221c = set;
        this.f7222d = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f7220b) {
            case 0:
                return this.f7221c.contains(obj) || this.f7222d.contains(obj);
            default:
                return ((L) this.f7221c).contains(obj) && ((L) this.f7222d).contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f7220b) {
            case 1:
                return ((L) this.f7221c).containsAll(collection) && ((L) this.f7222d).containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f7220b) {
            case 0:
                return this.f7221c.isEmpty() && this.f7222d.isEmpty();
            default:
                return Collections.disjoint((L) this.f7222d, (L) this.f7221c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7220b) {
            case 0:
                return new C0(this);
            default:
                return new M(this);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f7220b) {
            case 0:
                Set set = this.f7221c;
                int size = set.size();
                Iterator it = this.f7222d.iterator();
                while (it.hasNext()) {
                    if (!set.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            default:
                Iterator it2 = ((L) this.f7221c).iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    if (((L) this.f7222d).contains(it2.next())) {
                        i7++;
                    }
                }
                return i7;
        }
    }
}
