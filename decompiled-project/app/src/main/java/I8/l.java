package I8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f5286b;

    public /* synthetic */ l(n nVar, int i7) {
        this.f5285a = i7;
        this.f5286b = nVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5285a) {
            case 0:
                this.f5286b.clear();
                return;
            default:
                this.f5286b.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        m a9;
        switch (this.f5285a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                n nVar = this.f5286b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                m mVar = null;
                if (key != null) {
                    try {
                        a9 = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a9 != null && Objects.equals(a9.f5294v, entry.getValue())) {
                        mVar = a9;
                    }
                    return mVar == null;
                }
                a9 = null;
                if (a9 != null) {
                    mVar = a9;
                }
                if (mVar == null) {
                }
            default:
                return this.f5286b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5285a) {
            case 0:
                return new k(this.f5286b, 0);
            default:
                return new k(this.f5286b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        m a9;
        switch (this.f5285a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                n nVar = this.f5286b;
                Object key = entry.getKey();
                m mVar = null;
                if (key != null) {
                    try {
                        a9 = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a9 != null && Objects.equals(a9.f5294v, entry.getValue())) {
                        mVar = a9;
                    }
                    if (mVar != null) {
                        return false;
                    }
                    nVar.c(mVar, true);
                    return true;
                }
                a9 = null;
                if (a9 != null) {
                    mVar = a9;
                }
                if (mVar != null) {
                }
            default:
                n nVar2 = this.f5286b;
                m mVar2 = null;
                if (obj != null) {
                    try {
                        mVar2 = nVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (mVar2 != null) {
                    nVar2.c(mVar2, true);
                }
                return mVar2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f5285a) {
            case 0:
                return this.f5286b.f5300d;
            default:
                return this.f5286b.f5300d;
        }
    }
}
