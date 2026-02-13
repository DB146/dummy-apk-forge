package h7;

import L7.o;
import Y5.C0660y;
import Y5.C0662z;
import android.content.Context;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import g7.InterfaceC1200a;
import ha.C1265a;
import j7.InterfaceC1385a;
import j8.InterfaceC1387b;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l7.C1511c;
import p7.l;

/* renamed from: h7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259e implements InterfaceC1385a {

    /* renamed from: a, reason: collision with root package name */
    public final Y6.i f17836a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1387b f17837b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f17838c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f17839d;

    /* renamed from: e, reason: collision with root package name */
    public final i f17840e;

    /* renamed from: f, reason: collision with root package name */
    public final k f17841f;
    public final Executor g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f17842h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f17843i;
    public final Task j;
    public final C0662z k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1200a f17844l;

    /* renamed from: m, reason: collision with root package name */
    public C1256b f17845m;

    /* renamed from: n, reason: collision with root package name */
    public Task f17846n;

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, h7.i] */
    public C1259e(Y6.i iVar, InterfaceC1387b interfaceC1387b, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        G.g(iVar);
        G.g(interfaceC1387b);
        this.f17836a = iVar;
        this.f17837b = interfaceC1387b;
        this.f17838c = new ArrayList();
        this.f17839d = new ArrayList();
        iVar.b();
        String g = iVar.g();
        ?? obj = new Object();
        Context context = iVar.f12041a;
        G.g(context);
        G.d(g);
        obj.f17858a = new l(new h(0, context, "com.google.firebase.appcheck.store." + g));
        this.f17840e = obj;
        iVar.b();
        this.f17841f = new k(context, this, executor2, scheduledExecutorService);
        this.g = executor;
        this.f17842h = executor2;
        this.f17843i = executor3;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new Aa.j(15, this, taskCompletionSource));
        this.j = taskCompletionSource.getTask();
        this.k = new C0662z(11);
    }

    public final Task a() {
        final C1511c c1511c = (C1511c) this.f17844l;
        c1511c.getClass();
        Task call = Tasks.call(c1511c.f19592e, new D7.c(c1511c, new C0660y(13)));
        final int i7 = 1;
        SuccessContinuation successContinuation = new SuccessContinuation() { // from class: l7.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                switch (i7) {
                    case 0:
                        C1511c c1511c2 = c1511c;
                        c1511c2.getClass();
                        return Tasks.call(c1511c2.f19592e, new o(2, c1511c2, new D7.a(((IntegrityTokenResponse) obj).token(), (byte) 0)));
                    default:
                        C1511c c1511c3 = c1511c;
                        c1511c3.getClass();
                        return c1511c3.f19589b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(c1511c3.f19588a)).setNonce(((C1509a) obj).f19585a).build());
                }
            }
        };
        Executor executor = c1511c.f19591d;
        final int i10 = 0;
        return call.onSuccessTask(executor, successContinuation).onSuccessTask(executor, new SuccessContinuation() { // from class: l7.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                switch (i10) {
                    case 0:
                        C1511c c1511c2 = c1511c;
                        c1511c2.getClass();
                        return Tasks.call(c1511c2.f19592e, new o(2, c1511c2, new D7.a(((IntegrityTokenResponse) obj).token(), (byte) 0)));
                    default:
                        C1511c c1511c3 = c1511c;
                        c1511c3.getClass();
                        return c1511c3.f19589b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(c1511c3.f19588a)).setNonce(((C1509a) obj).f19585a).build());
                }
            }
        }).onSuccessTask(executor, new C1265a(11)).onSuccessTask(this.g, new Q9.a(this, 15));
    }

    public final Task b(boolean z8) {
        return this.j.continueWithTask(this.f17842h, new C1258d(this, z8));
    }
}
