package P4;

import I2.AbstractC0315d;
import N6.t0;
import W1.C0563f;
import W1.C0571n;
import W4.C0588f;
import W4.InterfaceC0587e;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c7.C0914c;
import c7.InterfaceC0913b;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.TaskCompletionSource;
import ea.C1108c;
import ea.C1111f;
import i3.C1340B;
import i3.InterfaceC1342a;
import j8.InterfaceC1387b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.C1549C;
import m4.C1568f0;
import m4.C1584n0;
import m4.J0;
import o.Y0;
import org.json.JSONObject;
import r4.C1941m;
import v8.C2151e;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7864c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7865d;

    public /* synthetic */ G(Object obj, Object obj2, Object obj3, int i7) {
        this.f7862a = i7;
        this.f7863b = obj;
        this.f7864c = obj2;
        this.f7865d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ G(AtomicBoolean atomicBoolean, a1.i iVar, Rb.a aVar) {
        this.f7862a = 5;
        this.f7863b = atomicBoolean;
        this.f7864c = iVar;
        this.f7865d = (kotlin.jvm.internal.m) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [Rb.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, P4.I] */
    /* JADX WARN: Type inference failed for: r2v28, types: [r4.n, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        JSONObject optJSONObject;
        boolean z8 = true;
        switch (this.f7862a) {
            case 0:
                A4.s sVar = (A4.s) this.f7863b;
                this.f7864c.I(sVar.f470a, (B) sVar.f471b, (C0474w) this.f7865d);
                return;
            case 1:
                ViewGroup container = (ViewGroup) this.f7863b;
                kotlin.jvm.internal.l.e(container, "$container");
                C0563f this$0 = (C0563f) this.f7865d;
                kotlin.jvm.internal.l.e(this$0, "this$0");
                container.endViewTransition((View) this.f7864c);
                ((W1.o0) this$0.f10471c.f3094a).c(this$0);
                return;
            case 2:
                kotlin.jvm.internal.l.e((C0571n) this.f7865d, "this$0");
                W1.C inFragment = ((W1.o0) this.f7863b).f10533c;
                W1.C outFragment = ((W1.o0) this.f7864c).f10533c;
                W1.i0 i0Var = W1.d0.f10463a;
                kotlin.jvm.internal.l.e(inFragment, "inFragment");
                kotlin.jvm.internal.l.e(outFragment, "outFragment");
                return;
            case 3:
                Q9.a aVar = ((C0588f) this.f7863b).f10682c;
                String str = (String) this.f7864c;
                W4.q qVar = (W4.q) aVar.f8707b;
                qVar.f10751c = str;
                InterfaceC0587e interfaceC0587e = (InterfaceC0587e) this.f7865d;
                W4.G B10 = interfaceC0587e.B();
                W4.s sVar2 = qVar.f10752d;
                if (B10 != null) {
                    sVar2.f10772d.f10742w.f10803c.put(Integer.valueOf(interfaceC0587e.j()), B10);
                    sVar2.f10768J = true;
                }
                sVar2.z();
                return;
            case 4:
                a1.i iVar = (a1.i) this.f7864c;
                Rb.a aVar2 = (Rb.a) this.f7865d;
                if (((AtomicBoolean) this.f7863b).get()) {
                    return;
                }
                try {
                    iVar.a(aVar2.invoke());
                    return;
                } catch (Throwable th) {
                    iVar.b(th);
                    return;
                }
            case 5:
                a1.i iVar2 = (a1.i) this.f7864c;
                ?? r12 = (kotlin.jvm.internal.m) this.f7865d;
                if (((AtomicBoolean) this.f7863b).get()) {
                    return;
                }
                try {
                    iVar2.a(r12.invoke());
                    return;
                } catch (Throwable th2) {
                    iVar2.b(th2);
                    return;
                }
            case 6:
                i3.d dVar = (i3.d) this.f7863b;
                a1.l lVar = (a1.l) this.f7864c;
                C1340B c1340b = (C1340B) this.f7865d;
                dVar.getClass();
                try {
                    z8 = ((Boolean) lVar.f12477b.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (dVar.k) {
                    try {
                        q3.j p10 = O5.b.p(c1340b.f18318a);
                        String str2 = p10.f23386a;
                        if (dVar.c(str2) == c1340b) {
                            dVar.b(str2);
                        }
                        h3.z.e().a(i3.d.f18341l, i3.d.class.getSimpleName() + " " + str2 + " executed; reschedule = " + z8);
                        Iterator it = dVar.j.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1342a) it.next()).b(p10, z8);
                        }
                    } finally {
                    }
                }
                return;
            case 7:
                ((i3.d) ((C1111f) this.f7863b).f16837b).g((i3.i) this.f7864c, (C1108c) this.f7865d);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                C1568f0 c1568f0 = (C1568f0) this.f7863b;
                c1568f0.getClass();
                t0 h10 = ((N6.E) this.f7864c).h();
                n4.f fVar = c1568f0.f20374c;
                C1549C c1549c = fVar.f21092u;
                c1549c.getClass();
                T6.a aVar3 = fVar.f21089d;
                aVar3.getClass();
                aVar3.f9321b = N6.H.F(h10);
                if (!h10.isEmpty()) {
                    aVar3.f9324e = (B) h10.get(0);
                    B b2 = (B) this.f7865d;
                    b2.getClass();
                    aVar3.f9325f = b2;
                }
                if (((B) aVar3.f9323d) == null) {
                    aVar3.f9323d = T6.a.n(c1549c, (N6.H) aVar3.f9321b, (B) aVar3.f9324e, (J0) aVar3.f9320a);
                }
                aVar3.x(c1549c.Y());
                return;
            case 9:
                n4.f fVar2 = (n4.f) ((C1584n0) ((C1111f) this.f7863b).f16838c).f20449i;
                Pair pair = (Pair) this.f7864c;
                fVar2.D(((Integer) pair.first).intValue(), (B) pair.second, (Exception) this.f7865d);
                return;
            case 10:
                q3.q C2 = ((WorkDatabase) this.f7863b).C();
                C2.getClass();
                TreeMap treeMap = I2.H.f5039w;
                I2.H a9 = AbstractC0315d.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                a9.p(1, (String) this.f7864c);
                WorkDatabase_Impl workDatabase_Impl = C2.f23424a;
                workDatabase_Impl.b();
                Cursor n6 = P2.j.n(workDatabase_Impl, a9);
                try {
                    ArrayList arrayList = new ArrayList(n6.getCount());
                    while (n6.moveToNext()) {
                        arrayList.add(n6.getString(0));
                    }
                    n6.close();
                    a9.F();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        r3.f.a((i3.p) this.f7865d, (String) it2.next());
                    }
                    return;
                } catch (Throwable th3) {
                    n6.close();
                    a9.F();
                    throw th3;
                }
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                C1941m c1941m = (C1941m) this.f7863b;
                this.f7864c.D(c1941m.f23771a, c1941m.f23772b, (Exception) this.f7865d);
                return;
            case 12:
                Intent intent = (Intent) this.f7864c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7865d;
                r8.g gVar = (r8.g) this.f7863b;
                gVar.getClass();
                try {
                    gVar.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 13:
                v7.l lVar2 = ((v7.p) this.f7863b).g;
                Thread currentThread = Thread.currentThread();
                lVar2.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                v7.r rVar = lVar2.f25138n;
                if (rVar == null || !rVar.f25172e.get()) {
                    long j = currentTimeMillis / 1000;
                    String e2 = lVar2.e();
                    if (e2 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    x7.c cVar = new x7.c(e2, j, (Map) this.f7865d);
                    Y0 y02 = lVar2.f25137m;
                    y02.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e2);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    y02.f((Exception) this.f7864c, currentThread, "error", cVar, false);
                    return;
                }
                return;
            default:
                u8.h hVar = (u8.h) this.f7863b;
                String str3 = (String) this.f7864c;
                C2151e c2151e = (C2151e) this.f7865d;
                C1111f c1111f = hVar.f24891a;
                InterfaceC0913b interfaceC0913b = (InterfaceC0913b) ((InterfaceC1387b) c1111f.f16837b).get();
                if (interfaceC0913b == null) {
                    return;
                }
                JSONObject jSONObject = c2151e.f25214e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = c2151e.f25211b;
                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str3)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (optString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) c1111f.f16838c)) {
                        try {
                            if (!optString.equals(((Map) c1111f.f16838c).get(str3))) {
                                ((Map) c1111f.f16838c).put(str3, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str3);
                                bundle.putString("arm_value", jSONObject2.optString(str3));
                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                C0914c c0914c = (C0914c) interfaceC0913b;
                                c0914c.a("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", optString);
                                c0914c.a("fp", "_fpc", bundle2);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }
}
