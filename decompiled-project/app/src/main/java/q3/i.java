package q3;

import A8.e0;
import B0.C;
import C3.A;
import C3.C0237c;
import C3.ThreadFactoryC0236b;
import C3.t;
import I2.AbstractC0315d;
import I2.H;
import I2.K;
import P4.AbstractC0462j;
import P4.B;
import P4.C0474w;
import P4.I;
import Z9.C0665b;
import Z9.C0666c;
import Z9.C0669f;
import android.content.Context;
import android.database.Cursor;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase_Impl;
import cc.F;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.UtilsKt;
import d0.InterfaceC1037e;
import i1.C1290a;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import m.AbstractC1519a;
import m.C1523e;
import m4.L;
import n.MenuC1663A;
import n.MenuC1678l;
import n.MenuItemC1685s;
import n5.D;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import r4.C1941m;
import s1.InterfaceMenuItemC1970a;
import u.T;
import x.AbstractC2243m;
import x.InterfaceC2244n;
import x.InterfaceC2250u;
import x.s0;

/* loaded from: classes.dex */
public final class i implements I, r4.n, Callback, InterfaceC1037e, Continuation, s0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f23382a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23383b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23384c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23385d;

    public i(int i7) {
        switch (i7) {
            case 5:
                Random random = new Random();
                this.f23384c = new HashMap();
                this.f23385d = random;
                this.f23382a = new HashMap();
                this.f23383b = new HashMap();
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                this.f23382a = new b1.d(10);
                this.f23383b = new T(0);
                this.f23384c = new ArrayList();
                this.f23385d = new HashSet();
                return;
            default:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0236b(0));
                this.f23383b = new HashMap();
                this.f23384c = new ReferenceQueue();
                this.f23382a = newSingleThreadExecutor;
                newSingleThreadExecutor.execute(new C(this, 2));
                return;
        }
    }

    public i(InterfaceC2244n interfaceC2244n) {
        this.f23382a = interfaceC2244n;
    }

    public i(InterfaceC2250u interfaceC2250u) {
        this(new C1290a(interfaceC2250u, 28));
    }

    public static void J(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            hashMap.remove(arrayList.get(i7));
        }
    }

    public static final Message a(i iVar, ArrayList arrayList, int i7) {
        Object obj;
        iVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Message) next).what == i7) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Object next2 = it2.next();
            if (it2.hasNext()) {
                long when = ((Message) next2).getWhen();
                do {
                    Object next3 = it2.next();
                    long when2 = ((Message) next3).getWhen();
                    if (when < when2) {
                        next2 = next3;
                        when = when2;
                    }
                } while (it2.hasNext());
            }
            obj = next2;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q3.i, java.lang.Object] */
    public static I7.n l(List list, Map map, Comparator comparator) {
        ?? obj = new Object();
        obj.f23382a = list;
        obj.f23383b = map;
        Collections.sort(list, comparator);
        I7.m mVar = new I7.m(list.size());
        int i7 = mVar.f5254b - 1;
        int size = list.size();
        while (i7 >= 0) {
            boolean z8 = (mVar.f5253a & ((long) (1 << i7))) == 0;
            int pow = (int) Math.pow(2.0d, i7);
            i7--;
            size -= pow;
            if (z8) {
                obj.m(2, pow, size);
            } else {
                obj.m(2, pow, size);
                size -= pow;
                obj.m(1, pow, size);
            }
        }
        I7.i iVar = (I7.k) obj.f23384c;
        if (iVar == null) {
            iVar = I7.h.f5245a;
        }
        return new I7.n(iVar, comparator);
    }

    public boolean A(AbstractC1519a abstractC1519a, MenuC1678l menuC1678l) {
        C1523e t5 = t(abstractC1519a);
        T t10 = (T) this.f23385d;
        Menu menu = (Menu) t10.get(menuC1678l);
        if (menu == null) {
            menu = new MenuC1663A((Context) this.f23383b, menuC1678l);
            t10.put(menuC1678l, menu);
        }
        return ((ActionMode.Callback) this.f23382a).onCreateActionMode(t5, menu);
    }

    @Override // P4.I
    public void B(int i7, B b2, P4.r rVar, C0474w c0474w) {
        if (w(i7, b2)) {
            ((A4.s) this.f23383b).r(rVar, y(c0474w));
        }
    }

    @Override // r4.n
    public void C(int i7, B b2) {
        if (w(i7, b2)) {
            ((C1941m) this.f23384c).b();
        }
    }

    @Override // r4.n
    public void D(int i7, B b2, Exception exc) {
        if (w(i7, b2)) {
            ((C1941m) this.f23384c).d(exc);
        }
    }

    @Override // P4.I
    public void E(int i7, B b2, P4.r rVar, C0474w c0474w) {
        if (w(i7, b2)) {
            ((A4.s) this.f23383b).A(rVar, y(c0474w));
        }
    }

    @Override // P4.I
    public void F(int i7, B b2, P4.r rVar, C0474w c0474w) {
        if (w(i7, b2)) {
            ((A4.s) this.f23383b).u(rVar, y(c0474w));
        }
    }

    public void G(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f23384c;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    @Override // P4.I
    public void H(int i7, B b2, C0474w c0474w) {
        if (w(i7, b2)) {
            ((A4.s) this.f23383b).H(y(c0474w));
        }
    }

    @Override // P4.I
    public void I(int i7, B b2, C0474w c0474w) {
        if (w(i7, b2)) {
            ((A4.s) this.f23383b).j(y(c0474w));
        }
    }

    public T4.b K(List list) {
        ArrayList j = j(list);
        if (j.size() < 2) {
            return (T4.b) N6.r.k(j, null);
        }
        Collections.sort(j, new A0.B(6));
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i10 = ((T4.b) j.get(0)).f9245c;
        int i11 = 0;
        while (true) {
            if (i11 >= j.size()) {
                break;
            }
            T4.b bVar = (T4.b) j.get(i11);
            if (i10 == bVar.f9245c) {
                arrayList.add(new Pair(bVar.f9244b, Integer.valueOf(bVar.f9246d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (T4.b) j.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.f23384c;
        T4.b bVar2 = (T4.b) hashMap.get(arrayList);
        if (bVar2 == null) {
            List subList = j.subList(0, arrayList.size());
            int i12 = 0;
            for (int i13 = 0; i13 < subList.size(); i13++) {
                i12 += ((T4.b) subList.get(i13)).f9246d;
            }
            int nextInt = ((Random) this.f23385d).nextInt(i12);
            int i14 = 0;
            while (true) {
                if (i7 >= subList.size()) {
                    bVar2 = (T4.b) N6.r.l(subList);
                    break;
                }
                T4.b bVar3 = (T4.b) subList.get(i7);
                i14 += bVar3.f9246d;
                if (nextInt < i14) {
                    bVar2 = bVar3;
                    break;
                }
                i7++;
            }
            hashMap.put(arrayList, bVar2);
        }
        return bVar2;
    }

    public void L(int i7) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f23384c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i7, 0, 0);
        kotlin.jvm.internal.l.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        F.B(F.b((Hb.i) this.f23382a), null, 0, new e0(this, arrayList, null), 3);
    }

    public synchronized void c(C3.s sVar, t tVar) {
        C0237c c0237c = (C0237c) ((HashMap) this.f23383b).put(sVar, new C0237c(sVar, tVar, (ReferenceQueue) this.f23384c));
        if (c0237c != null) {
            c0237c.f2513c = null;
            c0237c.clear();
        }
    }

    @Override // x.q0
    public AbstractC2243m d(long j, AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        if (((AbstractC2243m) this.f23384c) == null) {
            this.f23384c = abstractC2243m3.c();
        }
        AbstractC2243m abstractC2243m4 = (AbstractC2243m) this.f23384c;
        if (abstractC2243m4 == null) {
            kotlin.jvm.internal.l.j("velocityVector");
            throw null;
        }
        int b2 = abstractC2243m4.b();
        for (int i7 = 0; i7 < b2; i7++) {
            AbstractC2243m abstractC2243m5 = (AbstractC2243m) this.f23384c;
            if (abstractC2243m5 == null) {
                kotlin.jvm.internal.l.j("velocityVector");
                throw null;
            }
            abstractC2243m5.e(i7, ((InterfaceC2244n) this.f23382a).get(i7).c(j, abstractC2243m.a(i7), abstractC2243m2.a(i7), abstractC2243m3.a(i7)));
        }
        AbstractC2243m abstractC2243m6 = (AbstractC2243m) this.f23384c;
        if (abstractC2243m6 != null) {
            return abstractC2243m6;
        }
        kotlin.jvm.internal.l.j("velocityVector");
        throw null;
    }

    @Override // P4.I
    public void e(int i7, B b2, P4.r rVar, C0474w c0474w, IOException iOException, boolean z8) {
        if (w(i7, b2)) {
            ((A4.s) this.f23383b).x(rVar, y(c0474w), iOException, z8);
        }
    }

    @Override // r4.n
    public void f(int i7, B b2) {
        if (w(i7, b2)) {
            ((C1941m) this.f23384c).e();
        }
    }

    @Override // okhttp3.Callback
    public void g(Call call, Response response) {
        kotlin.jvm.internal.l.e(call, "call");
        C0665b c0665b = (C0665b) this.f23385d;
        C0666c c0666c = (C0666c) this.f23382a;
        UtilsKt.doOnSuccess(response, new Ea.g((C0669f) this.f23383b, (TVChannel) this.f23384c, c0665b, c0666c, 2), c0666c);
    }

    @Override // x.q0
    public long h(AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        int b2 = abstractC2243m.b();
        long j = 0;
        for (int i7 = 0; i7 < b2; i7++) {
            j = Math.max(j, ((InterfaceC2244n) this.f23382a).get(i7).d(abstractC2243m.a(i7), abstractC2243m2.a(i7), abstractC2243m3.a(i7)));
        }
        return j;
    }

    @Override // okhttp3.Callback
    public void i(Call call, IOException iOException) {
        kotlin.jvm.internal.l.e(call, "call");
        ((C0666c) this.f23382a).invoke(iOException);
    }

    public ArrayList j(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f23382a;
        J(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f23383b;
        J(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            T4.b bVar = (T4.b) list.get(i7);
            if (!hashMap.containsKey(bVar.f9244b) && !hashMap2.containsKey(Integer.valueOf(bVar.f9245c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public I7.i k(int i7, int i10) {
        if (i10 == 0) {
            return I7.h.f5245a;
        }
        Map map = (Map) this.f23383b;
        List list = (List) this.f23382a;
        if (i10 == 1) {
            Object obj = list.get(i7);
            return new I7.g(obj, map.get(obj), null, null);
        }
        int i11 = i10 / 2;
        int i12 = i7 + i11;
        I7.i k = k(i7, i11);
        I7.i k7 = k(i12 + 1, i11);
        Object obj2 = list.get(i12);
        return new I7.g(obj2, map.get(obj2), k, k7);
    }

    public void m(int i7, int i10, int i11) {
        I7.i k = k(i11 + 1, i10 - 1);
        Object obj = ((List) this.f23382a).get(i11);
        Map map = (Map) this.f23383b;
        I7.k kVar = i7 == 1 ? new I7.k(obj, map.get(obj), null, k) : new I7.g(obj, map.get(obj), null, k);
        if (((I7.k) this.f23384c) == null) {
            this.f23384c = kVar;
            this.f23385d = kVar;
        } else {
            ((I7.k) this.f23385d).r(kVar);
            this.f23385d = kVar;
        }
    }

    @Override // x.q0
    public AbstractC2243m n(long j, AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        if (((AbstractC2243m) this.f23383b) == null) {
            this.f23383b = abstractC2243m.c();
        }
        AbstractC2243m abstractC2243m4 = (AbstractC2243m) this.f23383b;
        if (abstractC2243m4 == null) {
            kotlin.jvm.internal.l.j("valueVector");
            throw null;
        }
        int b2 = abstractC2243m4.b();
        for (int i7 = 0; i7 < b2; i7++) {
            AbstractC2243m abstractC2243m5 = (AbstractC2243m) this.f23383b;
            if (abstractC2243m5 == null) {
                kotlin.jvm.internal.l.j("valueVector");
                throw null;
            }
            abstractC2243m5.e(i7, ((InterfaceC2244n) this.f23382a).get(i7).b(j, abstractC2243m.a(i7), abstractC2243m2.a(i7), abstractC2243m3.a(i7)));
        }
        AbstractC2243m abstractC2243m6 = (AbstractC2243m) this.f23383b;
        if (abstractC2243m6 != null) {
            return abstractC2243m6;
        }
        kotlin.jvm.internal.l.j("valueVector");
        throw null;
    }

    @Override // x.q0
    public AbstractC2243m o(AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        if (((AbstractC2243m) this.f23385d) == null) {
            this.f23385d = abstractC2243m3.c();
        }
        AbstractC2243m abstractC2243m4 = (AbstractC2243m) this.f23385d;
        if (abstractC2243m4 == null) {
            kotlin.jvm.internal.l.j("endVelocityVector");
            throw null;
        }
        int b2 = abstractC2243m4.b();
        for (int i7 = 0; i7 < b2; i7++) {
            AbstractC2243m abstractC2243m5 = (AbstractC2243m) this.f23385d;
            if (abstractC2243m5 == null) {
                kotlin.jvm.internal.l.j("endVelocityVector");
                throw null;
            }
            abstractC2243m5.e(i7, ((InterfaceC2244n) this.f23382a).get(i7).e(abstractC2243m.a(i7), abstractC2243m2.a(i7), abstractC2243m3.a(i7)));
        }
        AbstractC2243m abstractC2243m6 = (AbstractC2243m) this.f23385d;
        if (abstractC2243m6 != null) {
            return abstractC2243m6;
        }
        kotlin.jvm.internal.l.j("endVelocityVector");
        throw null;
    }

    public void p(C0237c c0237c) {
        A a9;
        synchronized (this) {
            ((HashMap) this.f23383b).remove(c0237c.f2511a);
            if (c0237c.f2512b && (a9 = c0237c.f2513c) != null) {
                ((C3.n) this.f23385d).e(c0237c.f2511a, new t(a9, true, false, c0237c.f2511a, (C3.n) this.f23385d));
            }
        }
    }

    public void q(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((T) this.f23383b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                q(arrayList2.get(i7), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void r(Runnable runnable) {
        ((K) this.f23382a).execute(runnable);
    }

    @Override // r4.n
    public void s(int i7, B b2) {
        if (w(i7, b2)) {
            ((C1941m) this.f23384c).a();
        }
    }

    public C1523e t(AbstractC1519a abstractC1519a) {
        ArrayList arrayList = (ArrayList) this.f23384c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1523e c1523e = (C1523e) arrayList.get(i7);
            if (c1523e != null && c1523e.f19633b == abstractC1519a) {
                return c1523e;
            }
        }
        C1523e c1523e2 = new C1523e((Context) this.f23383b, abstractC1519a);
        arrayList.add(c1523e2);
        return c1523e2;
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [T6.a, java.lang.Object] */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        T6.a aVar;
        T6.a aVar2;
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f23382a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f23383b;
        String str = (String) this.f23384c;
        o7.o oVar = (o7.o) this.f23385d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        G.g(exception);
        if (!zzaei.zzd(exception)) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        synchronized (firebaseAuth) {
            aVar = firebaseAuth.j;
        }
        if (aVar == null) {
            Y6.i iVar = firebaseAuth.f15828a;
            Object obj = new Object();
            ?? obj2 = new Object();
            obj2.f9320a = new Object();
            obj2.f9321b = new HashMap();
            obj2.f9323d = iVar;
            obj2.f9324e = firebaseAuth;
            obj2.f9325f = obj;
            synchronized (firebaseAuth) {
                firebaseAuth.j = obj2;
            }
        }
        synchronized (firebaseAuth) {
            aVar2 = firebaseAuth.j;
        }
        return aVar2.z(str, Boolean.FALSE, recaptchaAction).continueWithTask(oVar).continueWithTask(new n(10, str, aVar2, recaptchaAction, oVar));
    }

    public g u(j id) {
        kotlin.jvm.internal.l.e(id, "id");
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        a9.p(1, id.f23386a);
        a9.f(2, id.f23387b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f23382a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            return n6.moveToFirst() ? new g(n6.getString(P2.j.i(n6, "work_spec_id")), n6.getInt(P2.j.i(n6, "generation")), n6.getInt(P2.j.i(n6, "system_id"))) : null;
        } finally {
            n6.close();
            a9.F();
        }
    }

    public void v(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f23382a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f23383b).o(gVar);
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.r();
        }
    }

    public boolean w(int i7, B b2) {
        B b10;
        AbstractC0462j abstractC0462j = (AbstractC0462j) this.f23385d;
        Object obj = this.f23382a;
        if (b2 != null) {
            b10 = abstractC0462j.v(obj, b2);
            if (b10 == null) {
                return false;
            }
        } else {
            b10 = null;
        }
        int x2 = abstractC0462j.x(i7, obj);
        A4.s sVar = (A4.s) this.f23383b;
        if (sVar.f470a != x2 || !D.a((B) sVar.f471b, b10)) {
            this.f23383b = new A4.s((CopyOnWriteArrayList) abstractC0462j.f7980c.f472c, x2, b10);
        }
        C1941m c1941m = (C1941m) this.f23384c;
        if (c1941m.f23771a == x2 && D.a(c1941m.f23772b, b10)) {
            return true;
        }
        this.f23384c = new C1941m(abstractC0462j.f7981d.f23773c, x2, b10);
        return true;
    }

    @Override // r4.n
    public void x(int i7, B b2, int i10) {
        if (w(i7, b2)) {
            ((C1941m) this.f23384c).c(i10);
        }
    }

    public C0474w y(C0474w c0474w) {
        AbstractC0462j abstractC0462j = (AbstractC0462j) this.f23385d;
        Object obj = this.f23382a;
        long j = c0474w.f8151b;
        long w10 = abstractC0462j.w(obj, j);
        long j10 = c0474w.f8153d;
        long w11 = abstractC0462j.w(obj, j10);
        if (w10 == j && w11 == j10) {
            return c0474w;
        }
        return new C0474w(c0474w.f8150a, c0474w.f8152c, (L) c0474w.f8155f, c0474w.f8154e, c0474w.f8156u, w10, w11);
    }

    public boolean z(AbstractC1519a abstractC1519a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f23382a).onActionItemClicked(t(abstractC1519a), new MenuItemC1685s((Context) this.f23383b, (InterfaceMenuItemC1970a) menuItem));
    }
}
