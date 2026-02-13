package androidx.work.impl;

import I2.C0313b;
import I2.C0323l;
import I2.G;
import U2.b;
import U2.d;
import android.content.Context;
import i1.C1290a;
import i3.C1343b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q3.c;
import q3.e;
import q3.f;
import q3.h;
import q3.i;
import q3.l;
import q3.n;
import q3.q;
import q3.s;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: l, reason: collision with root package name */
    public volatile q f13739l;

    /* renamed from: m, reason: collision with root package name */
    public volatile c f13740m;

    /* renamed from: n, reason: collision with root package name */
    public volatile s f13741n;

    /* renamed from: o, reason: collision with root package name */
    public volatile i f13742o;

    /* renamed from: p, reason: collision with root package name */
    public volatile l f13743p;

    /* renamed from: q, reason: collision with root package name */
    public volatile n f13744q;

    /* renamed from: r, reason: collision with root package name */
    public volatile e f13745r;

    @Override // androidx.work.impl.WorkDatabase
    public final l A() {
        l lVar;
        if (this.f13743p != null) {
            return this.f13743p;
        }
        synchronized (this) {
            try {
                if (this.f13743p == null) {
                    this.f13743p = new l(this);
                }
                lVar = this.f13743p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n B() {
        n nVar;
        if (this.f13744q != null) {
            return this.f13744q;
        }
        synchronized (this) {
            try {
                if (this.f13744q == null) {
                    this.f13744q = new n(this);
                }
                nVar = this.f13744q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q C() {
        q qVar;
        if (this.f13739l != null) {
            return this.f13739l;
        }
        synchronized (this) {
            try {
                if (this.f13739l == null) {
                    this.f13739l = new q(this);
                }
                qVar = this.f13739l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s D() {
        s sVar;
        if (this.f13741n != null) {
            return this.f13741n;
        }
        synchronized (this) {
            try {
                if (this.f13741n == null) {
                    this.f13741n = new s(this);
                }
                sVar = this.f13741n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // I2.E
    public final C0323l e() {
        return new C0323l(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // I2.E
    public final d g(C0313b c0313b) {
        G g = new G(c0313b, new C1290a(this, 1));
        Context context = c0313b.f5128a;
        kotlin.jvm.internal.l.e(context, "context");
        return c0313b.f5130c.b(new b(context, c0313b.f5129b, g, false, false));
    }

    @Override // I2.E
    public final List h(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1343b(13, 14, 10));
        arrayList.add(new C1343b(11));
        arrayList.add(new C1343b(16, 17, 12));
        arrayList.add(new C1343b(17, 18, 13));
        arrayList.add(new C1343b(18, 19, 14));
        arrayList.add(new C1343b(15));
        arrayList.add(new C1343b(20, 21, 16));
        arrayList.add(new C1343b(22, 23, 17));
        return arrayList;
    }

    @Override // I2.E
    public final Set m() {
        return new HashSet();
    }

    @Override // I2.E
    public final Map o() {
        HashMap hashMap = new HashMap();
        hashMap.put(q.class, Collections.emptyList());
        hashMap.put(c.class, Collections.emptyList());
        hashMap.put(s.class, Collections.emptyList());
        hashMap.put(i.class, Collections.emptyList());
        hashMap.put(l.class, Collections.emptyList());
        hashMap.put(n.class, Collections.emptyList());
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(f.class, Collections.emptyList());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c x() {
        c cVar;
        if (this.f13740m != null) {
            return this.f13740m;
        }
        synchronized (this) {
            try {
                if (this.f13740m == null) {
                    this.f13740m = new c(this);
                }
                cVar = this.f13740m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e y() {
        e eVar;
        if (this.f13745r != null) {
            return this.f13745r;
        }
        synchronized (this) {
            try {
                if (this.f13745r == null) {
                    this.f13745r = new e(this);
                }
                eVar = this.f13745r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [q3.i, java.lang.Object] */
    @Override // androidx.work.impl.WorkDatabase
    public final i z() {
        i iVar;
        if (this.f13742o != null) {
            return this.f13742o;
        }
        synchronized (this) {
            try {
                if (this.f13742o == null) {
                    ?? obj = new Object();
                    obj.f23382a = this;
                    obj.f23383b = new q3.b(this, 2);
                    obj.f23384c = new h(this, 0);
                    obj.f23385d = new h(this, 1);
                    this.f13742o = obj;
                }
                iVar = this.f13742o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }
}
