package da;

import Db.j;
import Eb.B;
import N6.y0;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.model.TVDataSourceFrom;
import gb.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l;
import sb.C2012f;
import sb.F;
import sb.q;
import vb.C2170d;

/* renamed from: da.c */
/* loaded from: classes2.dex */
public final class C1065c extends H9.b {

    /* renamed from: a */
    public final y0 f16609a;

    /* renamed from: b */
    public final RoomDataBase f16610b;

    /* renamed from: c */
    public final long f16611c;

    /* renamed from: d */
    public final ReentrantLock f16612d;

    /* renamed from: e */
    public final Condition f16613e;

    /* renamed from: f */
    public final AtomicBoolean f16614f;
    public volatile C2012f g;

    public C1065c(y0 y0Var, RoomDataBase roomDataBase, long j) {
        l.e(roomDataBase, "roomDataBase");
        this.f16609a = y0Var;
        this.f16610b = roomDataBase;
        this.f16611c = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f16612d = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        l.d(newCondition, "newCondition(...)");
        this.f16613e = newCondition;
        this.f16614f = new AtomicBoolean(false);
    }

    public static /* synthetic */ i b(C1065c c1065c, boolean z8, int i7) {
        if ((i7 & 1) != 0) {
            z8 = false;
        }
        return c1065c.a(z8, Long.valueOf(c1065c.f16611c));
    }

    public final i a(boolean z8, Long l10) {
        this.f16612d.lock();
        try {
            if (this.f16614f.get()) {
                List list = (List) getCacheData();
                i iVar = this.g;
                if (list != null) {
                    iVar = i.l(list);
                } else if (iVar == null) {
                    this.f16613e.await();
                    iVar = a(z8, l10);
                }
                return iVar;
            }
            this.f16614f.set(true);
            this.f16612d.unlock();
            ArrayList arrayList = new ArrayList();
            i execute = execute(B.H(new j("extra:tv_source_from", TVDataSourceFrom.MAIN_SOURCE), new j("extra:refresh_data", Boolean.valueOf(z8))));
            long longValue = l10.longValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            execute.getClass();
            C2170d c2170d = Ab.e.f1560b;
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(c2170d, "scheduler is null");
            F f4 = new F(execute, longValue, timeUnit, c2170d);
            q3.c cVar = new q3.c(29, this, arrayList, false);
            Y5.B b2 = lb.b.f19615d;
            C2012f c2012f = new C2012f(f4, cVar, b2, lb.b.f19614c);
            this.f16612d.lock();
            try {
                this.g = c2012f;
                this.f16612d.unlock();
                return new C2012f(c2012f, b2, b2, new F8.a(14, this, arrayList)).h(new R7.a(this, 23));
            } finally {
                this.f16612d.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // H9.b
    public final i prepareExecute(Map map) {
        if (getCacheData() != null) {
            Object obj = map.get("extra:refresh_data");
            l.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) obj).booleanValue()) {
                Object cacheData = getCacheData();
                l.b(cacheData);
                return i.l(cacheData);
            }
        }
        Object obj2 = map.get("extra:tv_source_from");
        l.b(obj2);
        Object obj3 = this.f16609a.get(obj2);
        l.b(obj3);
        i a9 = ((Y9.a) obj3).a();
        q3.e eVar = new q3.e(26, this, map);
        a9.getClass();
        return new q(a9, eVar, 2);
    }
}
