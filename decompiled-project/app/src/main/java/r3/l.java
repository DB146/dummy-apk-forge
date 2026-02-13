package r3;

import I2.K;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import cc.E;
import h3.y;
import h3.z;
import i3.AbstractC1341C;
import i3.C1340B;
import java.util.UUID;
import l1.AbstractC1449a;
import p3.C1847a;

/* loaded from: classes.dex */
public final class l extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f23675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f23676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q3.p f23677c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f23678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f23679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(y yVar, q3.p pVar, o oVar, Context context, Hb.d dVar) {
        super(2, dVar);
        this.f23676b = yVar;
        this.f23677c = pVar;
        this.f23678d = oVar;
        this.f23679e = context;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new l(this.f23676b, this.f23677c, this.f23678d, this.f23679e, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f23675a;
        y yVar = this.f23676b;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            a1.l a9 = yVar.a();
            this.f23675a = 1;
            obj = AbstractC1341C.a(a9, yVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    com.bumptech.glide.c.c0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        final h3.p pVar = (h3.p) obj;
        q3.p pVar2 = this.f23677c;
        if (pVar == null) {
            throw new IllegalStateException(h3.o.p(new StringBuilder("Worker was marked important ("), pVar2.f23405c, ") but did not provide ForegroundInfo"));
        }
        String str = m.f23680a;
        z.e().a(str, "Updating notification for " + pVar2.f23405c);
        final UUID uuid = yVar.f17719b.f13733a;
        final o oVar = this.f23678d;
        q3.i iVar = oVar.f23685a;
        final Context context = this.f23679e;
        R6.a n6 = q3.f.n((K) iVar.f23382a, "setForegroundAsync", new Rb.a() { // from class: r3.n
            @Override // Rb.a
            public final Object invoke() {
                o oVar2 = o.this;
                UUID uuid2 = uuid;
                h3.p pVar3 = pVar;
                Context context2 = context;
                String uuid3 = uuid2.toString();
                q3.p h10 = oVar2.f23687c.h(uuid3);
                if (h10 == null || h3.o.a(h10.f23404b)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                i3.d dVar = oVar2.f23686b;
                synchronized (dVar.k) {
                    try {
                        z.e().f(i3.d.f18341l, "Moving WorkSpec (" + uuid3 + ") to the foreground");
                        C1340B c1340b = (C1340B) dVar.g.remove(uuid3);
                        if (c1340b != null) {
                            if (dVar.f18342a == null) {
                                PowerManager.WakeLock a10 = j.a(dVar.f18343b, "ProcessorForegroundLck");
                                dVar.f18342a = a10;
                                a10.acquire();
                            }
                            dVar.f18347f.put(uuid3, c1340b);
                            AbstractC1449a.startForegroundService(dVar.f18343b, C1847a.a(dVar.f18343b, O5.b.p(c1340b.f18318a), pVar3));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                q3.j p10 = O5.b.p(h10);
                String str2 = C1847a.f23035x;
                Intent intent = new Intent(context2, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_NOTIFY");
                intent.putExtra("KEY_NOTIFICATION_ID", pVar3.f17703a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", pVar3.f17704b);
                intent.putExtra("KEY_NOTIFICATION", pVar3.f17705c);
                intent.putExtra("KEY_WORKSPEC_ID", p10.f23386a);
                intent.putExtra("KEY_GENERATION", p10.f23387b);
                context2.startService(intent);
                return null;
            }
        });
        this.f23675a = 2;
        obj = Y6.b.c(n6, this);
        return obj == aVar ? aVar : obj;
    }
}
