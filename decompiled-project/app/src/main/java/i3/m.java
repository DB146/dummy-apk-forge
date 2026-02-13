package i3;

import A9.N2;
import I2.K;
import android.text.TextUtils;
import h3.C1235A;
import h3.I;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import y7.u0;

/* loaded from: classes.dex */
public final class m extends u0 {
    public static final String j = h3.z.g("WorkContinuationImpl");

    /* renamed from: b, reason: collision with root package name */
    public final p f18365b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18366c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18367d;

    /* renamed from: e, reason: collision with root package name */
    public final List f18368e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18369f;
    public final ArrayList g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f18370h;

    /* renamed from: i, reason: collision with root package name */
    public C1235A f18371i;

    public m(p pVar, String str, int i7, List list) {
        this.f18365b = pVar;
        this.f18366c = str;
        this.f18367d = i7;
        this.f18368e = list;
        this.f18369f = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i7 == 1 && ((I) list.get(i10)).f17663b.f23420u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String uuid = ((I) list.get(i10)).f17662a.toString();
            kotlin.jvm.internal.l.d(uuid, "id.toString()");
            this.f18369f.add(uuid);
            this.g.add(uuid);
        }
    }

    public static HashSet T(m mVar) {
        HashSet hashSet = new HashSet();
        mVar.getClass();
        return hashSet;
    }

    public final C1235A S() {
        String str;
        if (this.f18370h) {
            h3.z.e().h(j, "Already enqueued work ids (" + TextUtils.join(", ", this.f18369f) + ")");
        } else {
            p pVar = this.f18365b;
            C1235A c1235a = pVar.f18379c.f17677m;
            int i7 = this.f18367d;
            if (i7 == 1) {
                str = "REPLACE";
            } else if (i7 == 2) {
                str = "KEEP";
            } else if (i7 == 3) {
                str = "APPEND";
            } else {
                if (i7 != 4) {
                    throw null;
                }
                str = "APPEND_OR_REPLACE";
            }
            this.f18371i = vc.i.z(c1235a, "EnqueueRunnable_".concat(str), (K) pVar.f18381e.f23382a, new N2(this, 22));
        }
        return this.f18371i;
    }
}
