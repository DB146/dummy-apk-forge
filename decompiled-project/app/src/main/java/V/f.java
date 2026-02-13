package V;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends Eb.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9949a;

    /* renamed from: b, reason: collision with root package name */
    public final Y.i f9950b;

    public /* synthetic */ f(int i7, Y.i iVar) {
        this.f9949a = i7;
        this.f9950b = iVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f9949a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // Eb.i
    public final int b() {
        switch (this.f9949a) {
            case 0:
                Y.i iVar = this.f9950b;
                iVar.getClass();
                return iVar.f11051e;
            default:
                Y.i iVar2 = this.f9950b;
                iVar2.getClass();
                return iVar2.f11051e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9949a) {
            case 0:
                this.f9950b.clear();
                return;
            default:
                this.f9950b.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f9949a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                Y.i iVar = this.f9950b;
                Object obj2 = iVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && iVar.containsKey(entry.getKey());
            default:
                return this.f9950b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9949a) {
            case 0:
                return new g(this.f9950b);
            default:
                m[] mVarArr = new m[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    mVarArr[i7] = new n(1);
                }
                return new e(this.f9950b, mVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f9949a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.f9950b.remove(entry.getKey(), entry.getValue());
            default:
                Y.i iVar = this.f9950b;
                if (!iVar.containsKey(obj)) {
                    return false;
                }
                iVar.remove(obj);
                return true;
        }
    }
}
