package A8;

import android.util.Log;

/* loaded from: classes.dex */
public final class W implements T {

    /* renamed from: f, reason: collision with root package name */
    public static final double f595f = Math.random();
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y6.i f596a;

    /* renamed from: b, reason: collision with root package name */
    public final k8.e f597b;

    /* renamed from: c, reason: collision with root package name */
    public final E8.j f598c;

    /* renamed from: d, reason: collision with root package name */
    public final C0048l f599d;

    /* renamed from: e, reason: collision with root package name */
    public final Hb.i f600e;

    public W(Y6.i firebaseApp, k8.e firebaseInstallations, E8.j sessionSettings, C0048l eventGDTLogger, Hb.i backgroundDispatcher) {
        kotlin.jvm.internal.l.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.l.e(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.l.e(sessionSettings, "sessionSettings");
        kotlin.jvm.internal.l.e(eventGDTLogger, "eventGDTLogger");
        kotlin.jvm.internal.l.e(backgroundDispatcher, "backgroundDispatcher");
        this.f596a = firebaseApp;
        this.f597b = firebaseInstallations;
        this.f598c = sessionSettings;
        this.f599d = eventGDTLogger;
        this.f600e = backgroundDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(W w10, Jb.c cVar) {
        V v10;
        int i7;
        boolean z8;
        Boolean a9;
        if (cVar instanceof V) {
            v10 = (V) cVar;
            int i10 = v10.f594d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                v10.f594d = i10 - Integer.MIN_VALUE;
                Object obj = v10.f592b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = v10.f594d;
                z8 = true;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
                    v10.f591a = w10;
                    v10.f594d = 1;
                    if (w10.f598c.b(v10) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w10 = v10.f591a;
                    com.bumptech.glide.c.c0(obj);
                }
                E8.j jVar = w10.f598c;
                a9 = jVar.f3784a.a();
                if (a9 == null) {
                    z8 = a9.booleanValue();
                } else {
                    Boolean a10 = jVar.f3785b.a();
                    if (a10 != null) {
                        z8 = a10.booleanValue();
                    }
                }
                if (z8) {
                    Log.d("SessionFirelogPublisher", "Sessions SDK disabled. Events will not be sent.");
                    return Boolean.FALSE;
                }
                if (f595f <= w10.f598c.a()) {
                    return Boolean.TRUE;
                }
                Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
                return Boolean.FALSE;
            }
        }
        v10 = new V(w10, cVar);
        Object obj2 = v10.f592b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = v10.f594d;
        z8 = true;
        if (i7 != 0) {
        }
        E8.j jVar2 = w10.f598c;
        a9 = jVar2.f3784a.a();
        if (a9 == null) {
        }
        if (z8) {
        }
    }
}
