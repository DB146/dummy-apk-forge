package q3;

import M1.C0389d;
import M1.C0395j;
import M1.C0398m;
import M1.Q;
import M1.V;
import P4.n0;
import W1.C;
import W1.X;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.work.impl.WorkDatabase_Impl;
import cc.C0953t;
import cc.F;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import d2.C1041a;
import i1.C1290a;
import i2.C1312U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import l2.C1481z;
import l2.U;
import l2.Y;
import l2.a0;
import l2.c0;
import l2.d0;
import mc.AbstractC1660e;
import mc.C1659d;
import mc.InterfaceC1656a;
import q2.C1886c;
import t7.InterfaceC2030a;
import t7.InterfaceC2031b;
import u.T;
import w.AbstractC2175b;
import w.K;
import x.AbstractC2243m;

/* loaded from: classes.dex */
public final class n implements Continuation, InterfaceC2031b, InterfaceC2030a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23395a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23396b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23397c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23398d;

    /* renamed from: e, reason: collision with root package name */
    public Object f23399e;

    public n(int i7) {
        this.f23395a = i7;
        switch (i7) {
            case 6:
                this.f23396b = new T(0);
                this.f23397c = new SparseArray();
                this.f23398d = new u.r((Object) null);
                this.f23399e = new T(0);
                return;
            case 7:
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                C1312U c1312u = new C1312U();
                this.f23396b = c1312u;
                C1312U c1312u2 = new C1312U();
                this.f23397c = c1312u2;
                this.f23398d = c1312u2;
                this.f23399e = c1312u;
                return;
            default:
                this.f23396b = new ArrayList();
                this.f23397c = new HashMap();
                this.f23398d = new HashMap();
                return;
        }
    }

    public /* synthetic */ n(int i7, String str, Object obj, Object obj2, Object obj3) {
        this.f23395a = i7;
        this.f23398d = obj2;
        this.f23396b = str;
        this.f23397c = obj;
        this.f23399e = obj3;
    }

    public n(Q q10, List list) {
        this.f23395a = 3;
        this.f23399e = q10;
        this.f23396b = AbstractC1660e.a();
        this.f23397c = F.a();
        this.f23398d = Eb.o.s0(list);
    }

    public n(n0 n0Var, boolean[] zArr) {
        this.f23395a = 4;
        this.f23396b = n0Var;
        this.f23397c = zArr;
        int i7 = n0Var.f8119a;
        this.f23398d = new boolean[i7];
        this.f23399e = new boolean[i7];
    }

    public n(WorkDatabase_Impl workDatabase_Impl) {
        this.f23395a = 0;
        this.f23396b = workDatabase_Impl;
        this.f23397c = new b(workDatabase_Impl, 4);
        this.f23398d = new h(workDatabase_Impl, 2);
        this.f23399e = new h(workDatabase_Impl, 3);
    }

    public n(C1290a c1290a) {
        this.f23395a = 12;
        this.f23396b = c1290a;
    }

    public n(d0 store, a0 factory, o2.c defaultExtras) {
        this.f23395a = 9;
        kotlin.jvm.internal.l.e(store, "store");
        kotlin.jvm.internal.l.e(factory, "factory");
        kotlin.jvm.internal.l.e(defaultExtras, "defaultExtras");
        this.f23396b = store;
        this.f23397c = factory;
        this.f23398d = defaultExtras;
        this.f23399e = new Object();
    }

    public n(o7.o oVar, TimeUnit timeUnit) {
        this.f23395a = 11;
        this.f23398d = new Object();
        this.f23396b = oVar;
        this.f23397c = timeUnit;
    }

    public static int b(int i7, C1041a c1041a, int i10) {
        return i7 + c1041a.f16485b + ((int) (c1041a.f16484a * i10));
    }

    public void a(C c10) {
        if (((ArrayList) this.f23396b).contains(c10)) {
            throw new IllegalStateException("Fragment already added: " + c10);
        }
        synchronized (((ArrayList) this.f23396b)) {
            ((ArrayList) this.f23396b).add(c10);
        }
        c10.f10305z = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Jb.c cVar) {
        C0395j c0395j;
        int i7;
        n nVar;
        C0389d c0389d;
        if (cVar instanceof C0395j) {
            c0395j = (C0395j) cVar;
            int i10 = c0395j.f6682d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0395j.f6682d = i10 - Integer.MIN_VALUE;
                Object obj = c0395j.f6680b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c0395j.f6682d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    List list = (List) this.f23398d;
                    Q q10 = (Q) this.f23399e;
                    if (list == null || list.isEmpty()) {
                        c0395j.f6679a = this;
                        c0395j.f6682d = 1;
                        obj = Q.f(q10, false, c0395j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        nVar = this;
                        c0389d = (C0389d) obj;
                    } else {
                        M1.a0 g = q10.g();
                        C0398m c0398m = new C0398m(q10, this, null);
                        c0395j.f6679a = this;
                        c0395j.f6682d = 2;
                        obj = g.b(c0398m, c0395j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        nVar = this;
                        c0389d = (C0389d) obj;
                    }
                } else if (i7 == 1) {
                    nVar = c0395j.f6679a;
                    com.bumptech.glide.c.c0(obj);
                    c0389d = (C0389d) obj;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = c0395j.f6679a;
                    com.bumptech.glide.c.c0(obj);
                    c0389d = (C0389d) obj;
                }
                ((Q) nVar.f23399e).f6627h.y(c0389d);
                return Db.q.f3365a;
            }
        }
        c0395j = new C0395j(this, cVar);
        Object obj2 = c0395j.f6680b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c0395j.f6682d;
        if (i7 != 0) {
        }
        ((Q) nVar.f23399e).f6627h.y(c0389d);
        return Db.q.f3365a;
    }

    public C d(String str) {
        W1.a0 a0Var = (W1.a0) ((HashMap) this.f23397c).get(str);
        if (a0Var != null) {
            return a0Var.f10427c;
        }
        return null;
    }

    public C e(String str) {
        for (W1.a0 a0Var : ((HashMap) this.f23397c).values()) {
            if (a0Var != null) {
                C c10 = a0Var.f10427c;
                if (!str.equals(c10.f10293f)) {
                    c10 = c10.f10267J.f10357c.e(str);
                }
                if (c10 != null) {
                    return c10;
                }
            }
        }
        return null;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (W1.a0 a0Var : ((HashMap) this.f23397c).values()) {
            if (a0Var != null) {
                arrayList.add(a0Var);
            }
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (W1.a0 a0Var : ((HashMap) this.f23397c).values()) {
            if (a0Var != null) {
                arrayList.add(a0Var.f10427c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List h() {
        ArrayList arrayList;
        if (((ArrayList) this.f23396b).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f23396b)) {
            arrayList = new ArrayList((ArrayList) this.f23396b);
        }
        return arrayList;
    }

    @Override // t7.InterfaceC2031b
    public void i(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f23399e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // t7.InterfaceC2030a
    public void j(Bundle bundle) {
        synchronized (this.f23398d) {
            try {
                s7.c cVar = s7.c.f24187a;
                cVar.f("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f23399e = new CountDownLatch(1);
                ((o7.o) this.f23396b).j(bundle);
                cVar.f("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f23399e).await(500, (TimeUnit) this.f23397c)) {
                        cVar.f("App exception callback received from Analytics listener.");
                    } else {
                        cVar.g("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f23399e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractC2243m k(long j, AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2) {
        if (((AbstractC2243m) this.f23398d) == null) {
            this.f23398d = abstractC2243m.c();
        }
        AbstractC2243m abstractC2243m3 = (AbstractC2243m) this.f23398d;
        if (abstractC2243m3 == null) {
            kotlin.jvm.internal.l.j("velocityVector");
            throw null;
        }
        int b2 = abstractC2243m3.b();
        for (int i7 = 0; i7 < b2; i7++) {
            AbstractC2243m abstractC2243m4 = (AbstractC2243m) this.f23398d;
            if (abstractC2243m4 == null) {
                kotlin.jvm.internal.l.j("velocityVector");
                throw null;
            }
            abstractC2243m.getClass();
            long j10 = j / 1000000;
            K a9 = ((R1.d) ((C1290a) this.f23396b).f18187b).a(abstractC2243m2.a(i7));
            long j11 = a9.f25517c;
            abstractC2243m4.e(i7, (((Math.signum(a9.f25515a) * AbstractC2175b.a(j11 > 0 ? ((float) j10) / ((float) j11) : 1.0f).f25546b) * a9.f25516b) / ((float) j11)) * 1000.0f);
        }
        AbstractC2243m abstractC2243m5 = (AbstractC2243m) this.f23398d;
        if (abstractC2243m5 != null) {
            return abstractC2243m5;
        }
        kotlin.jvm.internal.l.j("velocityVector");
        throw null;
    }

    public Y l(kotlin.jvm.internal.e eVar, String key) {
        Y viewModel;
        Y a9;
        kotlin.jvm.internal.l.e(key, "key");
        synchronized (((C1886c) this.f23399e)) {
            try {
                d0 d0Var = (d0) this.f23396b;
                d0Var.getClass();
                viewModel = (Y) d0Var.f19210a.get(key);
                if (eVar.d(viewModel)) {
                    a0 a0Var = (a0) this.f23397c;
                    if (a0Var instanceof U) {
                        U u3 = (U) a0Var;
                        kotlin.jvm.internal.l.b(viewModel);
                        u3.getClass();
                        C1481z c1481z = u3.f19186d;
                        if (c1481z != null) {
                            s sVar = u3.f19187e;
                            kotlin.jvm.internal.l.b(sVar);
                            l2.Q.a(viewModel, sVar, c1481z);
                        }
                    }
                    kotlin.jvm.internal.l.c(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    o2.d dVar = new o2.d((o2.c) this.f23398d);
                    dVar.f21663a.put(c0.f19205b, key);
                    a0 factory = (a0) this.f23397c;
                    kotlin.jvm.internal.l.e(factory, "factory");
                    try {
                        try {
                            a9 = factory.c(eVar, dVar);
                        } catch (AbstractMethodError unused) {
                            a9 = factory.a(c2.i.q(eVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        a9 = factory.b(c2.i.q(eVar), dVar);
                    }
                    viewModel = a9;
                    d0 d0Var2 = (d0) this.f23396b;
                    d0Var2.getClass();
                    kotlin.jvm.internal.l.e(viewModel, "viewModel");
                    Y y10 = (Y) d0Var2.f19210a.put(key, viewModel);
                    if (y10 != null) {
                        y10.clear$lifecycle_viewmodel_release();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewModel;
    }

    public void m(W1.a0 a0Var) {
        C c10 = a0Var.f10427c;
        String str = c10.f10293f;
        HashMap hashMap = (HashMap) this.f23397c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(c10.f10293f, a0Var);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + c10);
        }
    }

    public void n(W1.a0 a0Var) {
        C c10 = a0Var.f10427c;
        if (c10.f10273Q) {
            ((X) this.f23399e).d(c10);
        }
        HashMap hashMap = (HashMap) this.f23397c;
        if (hashMap.get(c10.f10293f) == a0Var && ((W1.a0) hashMap.put(c10.f10293f, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + c10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[Catch: all -> 0x008f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:25:0x0064, B:29:0x0072), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v5, types: [mc.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(Jb.c cVar) {
        V v10;
        int i7;
        C1659d c1659d;
        n nVar;
        InterfaceC1656a interfaceC1656a;
        Throwable th;
        n nVar2;
        try {
            if (cVar instanceof V) {
                v10 = (V) cVar;
                int i10 = v10.f6640e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    v10.f6640e = i10 - Integer.MIN_VALUE;
                    Object obj = v10.f6638c;
                    Ib.a aVar = Ib.a.f5345a;
                    i7 = v10.f6640e;
                    Db.q qVar = Db.q.f3365a;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        if (((C0953t) this.f23397c).H()) {
                            return qVar;
                        }
                        v10.f6636a = this;
                        c1659d = (C1659d) this.f23396b;
                        v10.f6637b = c1659d;
                        v10.f6640e = 1;
                        if (c1659d.n(v10) == aVar) {
                            return aVar;
                        }
                        nVar = this;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC1656a = v10.f6637b;
                            nVar2 = v10.f6636a;
                            try {
                                com.bumptech.glide.c.c0(obj);
                                ((C0953t) nVar2.f23397c).J(qVar);
                                interfaceC1656a.l(null);
                                return qVar;
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC1656a.l(null);
                                throw th;
                            }
                        }
                        ?? r22 = v10.f6637b;
                        nVar = v10.f6636a;
                        com.bumptech.glide.c.c0(obj);
                        c1659d = r22;
                    }
                    if (!((C0953t) nVar.f23397c).H()) {
                        c1659d.l(null);
                        return qVar;
                    }
                    v10.f6636a = nVar;
                    v10.f6637b = c1659d;
                    v10.f6640e = 2;
                    if (nVar.c(v10) == aVar) {
                        return aVar;
                    }
                    interfaceC1656a = c1659d;
                    nVar2 = nVar;
                    ((C0953t) nVar2.f23397c).J(qVar);
                    interfaceC1656a.l(null);
                    return qVar;
                }
            }
            if (!((C0953t) nVar.f23397c).H()) {
            }
        } catch (Throwable th3) {
            interfaceC1656a = c1659d;
            th = th3;
            interfaceC1656a.l(null);
            throw th;
        }
        v10 = new V(this, cVar);
        Object obj2 = v10.f6638c;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = v10.f6640e;
        Db.q qVar2 = Db.q.f3365a;
        if (i7 != 0) {
        }
    }

    public Bundle p(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f23398d;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return task;
        }
        Exception exception = task.getException();
        G.g(exception);
        if (!zzaei.zzc(exception)) {
            return task;
        }
        boolean isLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
        String str = (String) this.f23396b;
        if (isLoggable) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
        }
        return ((T6.a) this.f23397c).z(str, Boolean.TRUE, (RecaptchaAction) this.f23398d).continueWithTask((o7.o) this.f23399e);
    }

    public String toString() {
        switch (this.f23395a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return "horizontal=" + ((C1312U) this.f23397c) + "; vertical=" + ((C1312U) this.f23396b);
            default:
                return super.toString();
        }
    }
}
