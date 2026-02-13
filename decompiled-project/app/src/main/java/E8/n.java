package E8;

import Db.q;
import M1.InterfaceC0394i;
import cc.F;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final Q1.g f3796c = new Q1.g("firebase_sessions_enabled");

    /* renamed from: d, reason: collision with root package name */
    public static final Q1.g f3797d = new Q1.g("firebase_sessions_sampling_rate");

    /* renamed from: e, reason: collision with root package name */
    public static final Q1.g f3798e = new Q1.g("firebase_sessions_restart_timeout");

    /* renamed from: f, reason: collision with root package name */
    public static final Q1.g f3799f = new Q1.g("firebase_sessions_cache_duration");
    public static final Q1.g g = new Q1.g("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0394i f3800a;

    /* renamed from: b, reason: collision with root package name */
    public h f3801b;

    public n(InterfaceC0394i dataStore) {
        kotlin.jvm.internal.l.e(dataStore, "dataStore");
        this.f3800a = dataStore;
        F.F(Hb.j.f4919a, new k(this, null));
    }

    public static final void a(n nVar, Q1.b bVar) {
        nVar.getClass();
        nVar.f3801b = new h((Boolean) bVar.c(f3796c), (Double) bVar.c(f3797d), (Integer) bVar.c(f3798e), (Integer) bVar.c(f3799f), (Long) bVar.c(g));
    }

    public final boolean b() {
        Integer num;
        h hVar = this.f3801b;
        if (hVar == null) {
            kotlin.jvm.internal.l.j("sessionConfigs");
            throw null;
        }
        if (hVar != null) {
            Long l10 = hVar.f3779e;
            return l10 == null || (num = hVar.f3778d) == null || (System.currentTimeMillis() - l10.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        kotlin.jvm.internal.l.j("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Q1.g gVar, Object obj, Jb.c cVar) {
        l lVar;
        int i7;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f3791c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f3791c = i10 - Integer.MIN_VALUE;
                Object obj2 = lVar.f3789a;
                Ib.a aVar = Ib.a.f5345a;
                i7 = lVar.f3791c;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj2);
                    InterfaceC0394i interfaceC0394i = this.f3800a;
                    m mVar = new m(obj, gVar, this, null);
                    lVar.f3791c = 1;
                    if (interfaceC0394i.a(new Q1.i(mVar, null), lVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj2);
                }
                return q.f3365a;
            }
        }
        lVar = new l(this, cVar);
        Object obj22 = lVar.f3789a;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = lVar.f3791c;
        if (i7 != 0) {
        }
        return q.f3365a;
    }
}
