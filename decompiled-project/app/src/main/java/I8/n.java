package I8;

import H2.C0297k;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes.dex */
public final class n extends AbstractMap implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final C0297k f5296w = new C0297k(2);

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f5297a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5298b;

    /* renamed from: c, reason: collision with root package name */
    public m f5299c;

    /* renamed from: d, reason: collision with root package name */
    public int f5300d;

    /* renamed from: e, reason: collision with root package name */
    public int f5301e;

    /* renamed from: f, reason: collision with root package name */
    public final m f5302f;

    /* renamed from: u, reason: collision with root package name */
    public l f5303u;

    /* renamed from: v, reason: collision with root package name */
    public l f5304v;

    public n(boolean z8) {
        C0297k c0297k = f5296w;
        this.f5300d = 0;
        this.f5301e = 0;
        this.f5297a = c0297k;
        this.f5298b = z8;
        this.f5302f = new m(z8);
    }

    public final m a(Object obj, boolean z8) {
        int i7;
        m mVar;
        m mVar2 = this.f5299c;
        C0297k c0297k = f5296w;
        Comparator comparator = this.f5297a;
        if (mVar2 != null) {
            Comparable comparable = comparator == c0297k ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mVar2.f5292f;
                i7 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i7 == 0) {
                    return mVar2;
                }
                m mVar3 = i7 < 0 ? mVar2.f5288b : mVar2.f5289c;
                if (mVar3 == null) {
                    break;
                }
                mVar2 = mVar3;
            }
        } else {
            i7 = 0;
        }
        if (!z8) {
            return null;
        }
        m mVar4 = this.f5302f;
        if (mVar2 != null) {
            mVar = new m(this.f5298b, mVar2, obj, mVar4, mVar4.f5291e);
            if (i7 < 0) {
                mVar2.f5288b = mVar;
            } else {
                mVar2.f5289c = mVar;
            }
            b(mVar2, true);
        } else {
            if (comparator == c0297k && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mVar = new m(this.f5298b, mVar2, obj, mVar4, mVar4.f5291e);
            this.f5299c = mVar;
        }
        this.f5300d++;
        this.f5301e++;
        return mVar;
    }

    public final void b(m mVar, boolean z8) {
        while (mVar != null) {
            m mVar2 = mVar.f5288b;
            m mVar3 = mVar.f5289c;
            int i7 = mVar2 != null ? mVar2.f5295w : 0;
            int i10 = mVar3 != null ? mVar3.f5295w : 0;
            int i11 = i7 - i10;
            if (i11 == -2) {
                m mVar4 = mVar3.f5288b;
                m mVar5 = mVar3.f5289c;
                int i12 = (mVar4 != null ? mVar4.f5295w : 0) - (mVar5 != null ? mVar5.f5295w : 0);
                if (i12 == -1 || (i12 == 0 && !z8)) {
                    e(mVar);
                } else {
                    f(mVar3);
                    e(mVar);
                }
                if (z8) {
                    return;
                }
            } else if (i11 == 2) {
                m mVar6 = mVar2.f5288b;
                m mVar7 = mVar2.f5289c;
                int i13 = (mVar6 != null ? mVar6.f5295w : 0) - (mVar7 != null ? mVar7.f5295w : 0);
                if (i13 == 1 || (i13 == 0 && !z8)) {
                    f(mVar);
                } else {
                    e(mVar2);
                    f(mVar);
                }
                if (z8) {
                    return;
                }
            } else if (i11 == 0) {
                mVar.f5295w = i7 + 1;
                if (z8) {
                    return;
                }
            } else {
                mVar.f5295w = Math.max(i7, i10) + 1;
                if (!z8) {
                    return;
                }
            }
            mVar = mVar.f5287a;
        }
    }

    public final void c(m mVar, boolean z8) {
        m mVar2;
        m mVar3;
        int i7;
        if (z8) {
            m mVar4 = mVar.f5291e;
            mVar4.f5290d = mVar.f5290d;
            mVar.f5290d.f5291e = mVar4;
        }
        m mVar5 = mVar.f5288b;
        m mVar6 = mVar.f5289c;
        m mVar7 = mVar.f5287a;
        int i10 = 0;
        if (mVar5 == null || mVar6 == null) {
            if (mVar5 != null) {
                d(mVar, mVar5);
                mVar.f5288b = null;
            } else if (mVar6 != null) {
                d(mVar, mVar6);
                mVar.f5289c = null;
            } else {
                d(mVar, null);
            }
            b(mVar7, false);
            this.f5300d--;
            this.f5301e++;
            return;
        }
        if (mVar5.f5295w > mVar6.f5295w) {
            m mVar8 = mVar5.f5289c;
            while (true) {
                m mVar9 = mVar8;
                mVar3 = mVar5;
                mVar5 = mVar9;
                if (mVar5 == null) {
                    break;
                } else {
                    mVar8 = mVar5.f5289c;
                }
            }
        } else {
            m mVar10 = mVar6.f5288b;
            while (true) {
                mVar2 = mVar6;
                mVar6 = mVar10;
                if (mVar6 == null) {
                    break;
                } else {
                    mVar10 = mVar6.f5288b;
                }
            }
            mVar3 = mVar2;
        }
        c(mVar3, false);
        m mVar11 = mVar.f5288b;
        if (mVar11 != null) {
            i7 = mVar11.f5295w;
            mVar3.f5288b = mVar11;
            mVar11.f5287a = mVar3;
            mVar.f5288b = null;
        } else {
            i7 = 0;
        }
        m mVar12 = mVar.f5289c;
        if (mVar12 != null) {
            i10 = mVar12.f5295w;
            mVar3.f5289c = mVar12;
            mVar12.f5287a = mVar3;
            mVar.f5289c = null;
        }
        mVar3.f5295w = Math.max(i7, i10) + 1;
        d(mVar, mVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f5299c = null;
        this.f5300d = 0;
        this.f5301e++;
        m mVar = this.f5302f;
        mVar.f5291e = mVar;
        mVar.f5290d = mVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        m mVar = null;
        if (obj != null) {
            try {
                mVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return mVar != null;
    }

    public final void d(m mVar, m mVar2) {
        m mVar3 = mVar.f5287a;
        mVar.f5287a = null;
        if (mVar2 != null) {
            mVar2.f5287a = mVar3;
        }
        if (mVar3 == null) {
            this.f5299c = mVar2;
        } else if (mVar3.f5288b == mVar) {
            mVar3.f5288b = mVar2;
        } else {
            mVar3.f5289c = mVar2;
        }
    }

    public final void e(m mVar) {
        m mVar2 = mVar.f5288b;
        m mVar3 = mVar.f5289c;
        m mVar4 = mVar3.f5288b;
        m mVar5 = mVar3.f5289c;
        mVar.f5289c = mVar4;
        if (mVar4 != null) {
            mVar4.f5287a = mVar;
        }
        d(mVar, mVar3);
        mVar3.f5288b = mVar;
        mVar.f5287a = mVar3;
        int max = Math.max(mVar2 != null ? mVar2.f5295w : 0, mVar4 != null ? mVar4.f5295w : 0) + 1;
        mVar.f5295w = max;
        mVar3.f5295w = Math.max(max, mVar5 != null ? mVar5.f5295w : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.f5303u;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 0);
        this.f5303u = lVar2;
        return lVar2;
    }

    public final void f(m mVar) {
        m mVar2 = mVar.f5288b;
        m mVar3 = mVar.f5289c;
        m mVar4 = mVar2.f5288b;
        m mVar5 = mVar2.f5289c;
        mVar.f5288b = mVar5;
        if (mVar5 != null) {
            mVar5.f5287a = mVar;
        }
        d(mVar, mVar2);
        mVar2.f5289c = mVar;
        mVar.f5287a = mVar2;
        int max = Math.max(mVar3 != null ? mVar3.f5295w : 0, mVar5 != null ? mVar5.f5295w : 0) + 1;
        mVar.f5295w = max;
        mVar2.f5295w = Math.max(max, mVar4 != null ? mVar4.f5295w : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        m mVar;
        if (obj != null) {
            try {
                mVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (mVar == null) {
                return mVar.f5294v;
            }
            return null;
        }
        mVar = null;
        if (mVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        l lVar = this.f5304v;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 1);
        this.f5304v = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f5298b) {
            throw new NullPointerException("value == null");
        }
        m a9 = a(obj, true);
        Object obj3 = a9.f5294v;
        a9.f5294v = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        m mVar;
        if (obj != null) {
            try {
                mVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (mVar != null) {
                c(mVar, true);
            }
            if (mVar == null) {
                return mVar.f5294v;
            }
            return null;
        }
        mVar = null;
        if (mVar != null) {
        }
        if (mVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5300d;
    }
}
