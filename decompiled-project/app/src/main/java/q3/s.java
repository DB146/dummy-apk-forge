package q3;

import A9.C0084f1;
import B0.C0200s;
import C4.F;
import I2.A;
import I2.AbstractC0315d;
import I2.C0313b;
import J7.t;
import L7.C0381a;
import L7.C0385e;
import L7.E;
import N6.H;
import N6.t0;
import P4.C0463k;
import P4.c0;
import W1.U;
import W4.B;
import W4.C;
import W4.C0585c;
import W4.C0588f;
import W4.C0589g;
import W4.u;
import Y5.C0628k0;
import Z9.C0666c;
import a.AbstractC0672a;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.tv.usecase.GetChannelLinkStreamById;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.core.utils.UtilsKt;
import da.C1063a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import l2.C1471o;
import l2.C1481z;
import m4.C1586o0;
import m4.K;
import m5.L;
import n5.AbstractC1705a;
import n5.D;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import s4.C1981i;
import s4.InterfaceC1984l;
import s4.v;
import sb.C2012f;
import t8.C2034c;
import va.C2161e;
import y7.u0;
import y9.G;

/* loaded from: classes.dex */
public final class s implements com.bumptech.glide.load.data.d, F6.c, T2.b, InterfaceC1394e, OnCompleteListener, t, V4.p, zzo, Z.m, Callback, InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23437a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23438b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23439c;

    public s(int i7) {
        this.f23437a = i7;
        switch (i7) {
            case 5:
                this.f23438b = new W3.k(1000L);
                this.f23439c = X3.d.a(10, new Hc.e(4));
                return;
            case 6:
            default:
                this.f23438b = new S.e(new Reference[16]);
                this.f23439c = new ReferenceQueue();
                return;
            case 7:
                this.f23438b = new SparseIntArray();
                this.f23439c = new SparseIntArray();
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f23438b = byteArrayOutputStream;
                this.f23439c = new DataOutputStream(byteArrayOutputStream);
                return;
        }
    }

    public /* synthetic */ s(int i7, Object obj, Object obj2) {
        this.f23437a = i7;
        this.f23439c = obj;
        this.f23438b = obj2;
    }

    public /* synthetic */ s(int i7, Object obj, Object obj2, boolean z8) {
        this.f23437a = i7;
        this.f23438b = obj;
        this.f23439c = obj2;
    }

    public s(C0084f1 c0084f1) {
        this.f23437a = 1;
        this.f23439c = c0084f1;
        this.f23438b = new Rect();
    }

    public s(C0200s c0200s) {
        this.f23437a = 11;
        this.f23438b = new AtomicInteger(0);
        this.f23439c = new AtomicBoolean(false);
    }

    public s(A a9, T2.b actual) {
        this.f23437a = 9;
        kotlin.jvm.internal.l.e(actual, "actual");
        this.f23439c = a9;
        this.f23438b = actual;
    }

    public s(S2.b bVar) {
        this.f23437a = 18;
        this.f23438b = bVar;
    }

    public s(U9.j jVar) {
        this.f23437a = 17;
        this.f23438b = new HashMap();
        this.f23439c = jVar;
    }

    public s(W4.n nVar) {
        this.f23437a = 22;
        this.f23439c = nVar;
        this.f23438b = D.m(null);
    }

    public s(C0628k0 c0628k0, String str) {
        this.f23437a = 23;
        this.f23438b = str;
        Objects.requireNonNull(c0628k0);
        this.f23439c = c0628k0;
    }

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f23437a = 0;
        this.f23438b = workDatabase_Impl;
        this.f23439c = new b(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 20);
    }

    public /* synthetic */ s(Object obj) {
        this.f23437a = 27;
        this.f23439c = obj;
        this.f23438b = new ArrayList();
    }

    public /* synthetic */ s(Object obj, int i7) {
        this.f23437a = i7;
        this.f23439c = obj;
    }

    public s(List list) {
        this.f23437a = 4;
        this.f23438b = list;
        this.f23439c = new v[list.size()];
    }

    public static int v(int i7, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            i11++;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = 1;
            }
        }
        return i11 + 1 > i10 ? i12 + 1 : i12;
    }

    public void A() {
        W4.n nVar = (W4.n) this.f23439c;
        AbstractC1705a.m(nVar.f10729B == 2);
        nVar.f10729B = 1;
        nVar.f10732E = false;
        long j = nVar.f10733F;
        if (j != -9223372036854775807L) {
            nVar.V(D.Z(j));
        }
    }

    public void B(l lVar) {
        W4.s sVar;
        C0588f c0588f;
        W4.n nVar = (W4.n) this.f23439c;
        int i7 = nVar.f10729B;
        AbstractC1705a.m(i7 == 1 || i7 == 2);
        nVar.f10729B = 2;
        if (nVar.f10745z == null) {
            W4.m mVar = new W4.m(nVar);
            nVar.f10745z = mVar;
            if (!mVar.f10726b) {
                mVar.f10726b = true;
                mVar.f10725a.postDelayed(mVar, 30000L);
            }
        }
        nVar.f10733F = -9223372036854775807L;
        R7.b bVar = nVar.f10735b;
        long M3 = D.M(((B) lVar.f23391b).f10628a);
        H h10 = (H) lVar.f23392c;
        bVar.getClass();
        ArrayList arrayList = new ArrayList(h10.size());
        for (int i10 = 0; i10 < h10.size(); i10++) {
            String path = ((C) h10.get(i10)).f10632c.getPath();
            AbstractC1705a.l(path);
            arrayList.add(path);
        }
        int i11 = 0;
        while (true) {
            sVar = (W4.s) bVar.f8929b;
            if (i11 >= W4.s.g(sVar).size()) {
                break;
            }
            if (!arrayList.contains(((W4.q) W4.s.g(sVar).get(i11)).a().getPath())) {
                u uVar = (u) W4.s.h(sVar).f8074b;
                uVar.f10782B = false;
                uVar.v();
                if (W4.s.i(sVar)) {
                    sVar.f10763E = true;
                    W4.s.b(sVar);
                    W4.s.p(sVar);
                    W4.s.f(sVar);
                }
            }
            i11++;
        }
        for (int i12 = 0; i12 < h10.size(); i12++) {
            C c10 = (C) h10.get(i12);
            Uri uri = c10.f10632c;
            int i13 = 0;
            while (true) {
                ArrayList arrayList2 = sVar.f10773e;
                if (i13 >= arrayList2.size()) {
                    c0588f = null;
                    break;
                }
                if (!((W4.r) arrayList2.get(i13)).f10756d) {
                    W4.q qVar = ((W4.r) arrayList2.get(i13)).f10753a;
                    if (qVar.a().equals(uri)) {
                        c0588f = qVar.f10750b;
                        break;
                    }
                }
                i13++;
            }
            if (c0588f != null) {
                long j = c10.f10630a;
                if (j != -9223372036854775807L) {
                    C0589g c0589g = c0588f.f10687v;
                    c0589g.getClass();
                    if (!c0589g.f10698h) {
                        c0588f.f10687v.f10699i = j;
                    }
                } else {
                    c0588f.getClass();
                }
                int i14 = c10.f10631b;
                C0589g c0589g2 = c0588f.f10687v;
                c0589g2.getClass();
                if (!c0589g2.f10698h) {
                    c0588f.f10687v.j = i14;
                }
                if (W4.s.i(sVar) && W4.s.a(sVar) == W4.s.m(sVar)) {
                    c0588f.f10690y = M3;
                    c0588f.f10691z = j;
                }
            }
        }
        if (!W4.s.i(sVar)) {
            if (W4.s.e(sVar) == -9223372036854775807L || !sVar.f10768J) {
                return;
            }
            sVar.r(W4.s.e(sVar));
            W4.s.f(sVar);
            return;
        }
        if (W4.s.a(sVar) == W4.s.m(sVar)) {
            W4.s.b(sVar);
            W4.s.p(sVar);
        } else {
            W4.s.b(sVar);
            sVar.r(W4.s.m(sVar));
        }
    }

    public void C(R7.a aVar) {
        W4.n nVar = (W4.n) this.f23439c;
        AbstractC1705a.m(nVar.f10729B != -1);
        nVar.f10729B = 1;
        nVar.f10744y = ((D9.a) aVar.f8927b).f3289a;
        nVar.P();
    }

    public void D(String str, Q2.d provider) {
        kotlin.jvm.internal.l.e(provider, "provider");
        S2.b bVar = (S2.b) this.f23438b;
        synchronized (((U9.j) bVar.f8988f)) {
            if (((LinkedHashMap) bVar.g).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) bVar.g).put(str, provider);
        }
    }

    public void E() {
        if (!((S2.b) this.f23438b).f8985c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Q2.a aVar = (Q2.a) this.f23439c;
        if (aVar == null) {
            aVar = new Q2.a(this);
        }
        this.f23439c = aVar;
        try {
            C1471o.class.getDeclaredConstructor(null);
            Q2.a aVar2 = (Q2.a) this.f23439c;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f8618b).add(C1471o.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C1471o.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public T7.s F(C0385e c0385e) {
        return ((C0381a) ((E) this.f23439c).f6317a).C(((C0385e) this.f23438b).i(c0385e));
    }

    public v G(int i7) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f23438b;
            if (i10 >= iArr.length) {
                AbstractC1705a.t("BaseMediaChunkOutput", "Unmatched track of type: " + i7);
                return new C1981i();
            }
            if (i7 == iArr[i10]) {
                return ((c0[]) this.f23439c)[i10];
            }
            i10++;
        }
    }

    public void H() {
        synchronized (this) {
            ((AtomicInteger) this.f23438b).decrementAndGet();
            if (((AtomicInteger) this.f23438b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // J7.t
    public void a(String str, String str2) {
        ((L7.f) this.f23439c).f6341a.f(((E) this.f23438b).c(str != null ? G7.b.a(str, str2) : null));
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        TVChannelLinkStream it = (TVChannelLinkStream) obj;
        kotlin.jvm.internal.l.e(it, "it");
        BaseTVChannelViewModel baseTVChannelViewModel = (BaseTVChannelViewModel) this.f23438b;
        baseTVChannelViewModel.markLastWatchedChannel(it);
        baseTVChannelViewModel.getListProgramForChannel(it.getChannel());
        baseTVChannelViewModel.enqueueInsertWatchNextTVChannel(it.getChannel());
        baseTVChannelViewModel.get_tvWithLinkStreamLiveData().l(new G(it));
        String message = "play by deeplink result: {channelId: " + ((String) this.f23439c) + ", channel: " + it + "}";
        kotlin.jvm.internal.l.e(message, "message");
        c2.q.t(baseTVChannelViewModel.getActionLogger(), it.getChannel().getTvChannelName(), new Db.j[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        int i7 = 1;
        int i10 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f23437a) {
            case 10:
                Boolean exist = (Boolean) obj;
                kotlin.jvm.internal.l.e(exist, "exist");
                boolean booleanValue = exist.booleanValue();
                M9.d dVar = (M9.d) this.f23439c;
                C2161e c2161e = (C2161e) this.f23438b;
                M9.t tVar = c2161e.f25314a;
                if (!booleanValue) {
                    sb.g j = tVar.j(dVar);
                    vb.n nVar = Ab.e.f1561c;
                    return new sb.p(new C2012f(j.q(nVar).n(nVar), new l(10, c2161e, dVar, objArr == true ? 1 : 0), lb.b.f19615d, lb.b.f19614c), I9.b.f5313c, false);
                }
                c2161e.a().l(new y9.H(dVar));
                tVar.getClass();
                U9.h z8 = tVar.f6916c.z();
                z8.getClass();
                return android.support.v4.media.session.b.g(z8.f9862a, new U9.e(z8, dVar, 2)).e(Ab.e.f1561c).a(new F8.a(i7, c2161e, dVar));
            case 15:
                N9.b it = (N9.b) obj;
                kotlin.jvm.internal.l.e(it, "it");
                String tvgUrlList = it.f7405f;
                M9.k kVar = (M9.k) this.f23438b;
                kVar.getClass();
                M9.d config = (M9.d) this.f23439c;
                kotlin.jvm.internal.l.e(config, "config");
                kotlin.jvm.internal.l.e(tvgUrlList, "tvgUrlList");
                List r02 = ac.g.r0(tvgUrlList, new String[]{","});
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : r02) {
                    if (!ac.g.h0(ac.g.v0((String) obj2).toString())) {
                        arrayList.add(obj2);
                    }
                }
                return new sb.p(new sb.q(gb.i.k(arrayList), M9.h.f6864d, i10), new c(16, kVar, config, objArr2 == true ? 1 : 0), true).b((gb.o) kVar.f6878e.getValue());
            default:
                List totalChannel = (List) obj;
                String str = (String) this.f23439c;
                GetChannelLinkStreamById t5 = (GetChannelLinkStreamById) this.f23438b;
                kotlin.jvm.internal.l.e(totalChannel, "totalChannel");
                try {
                    String message = "{channelId: " + str + ", totalChannel: " + totalChannel + " }";
                    kotlin.jvm.internal.l.e(t5, "t");
                    kotlin.jvm.internal.l.e(message, "message");
                    for (Object obj3 : totalChannel) {
                        if (str.equals(((TVChannel) obj3).getChannelId())) {
                            return GetChannelLinkStreamById.access$getGetStreamLinkStreamFrom$p(t5).a((TVChannel) obj3).o(2L);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                } catch (NoSuchElementException unused) {
                    return gb.i.i(new C1063a());
                } catch (Throwable th) {
                    kotlin.jvm.internal.l.e(t5, "t");
                    return gb.i.i(th);
                }
        }
    }

    @Override // Z.m
    public Object b(Z.b bVar, Object obj) {
        return ((Rb.e) this.f23438b).invoke(bVar, obj);
    }

    @Override // com.bumptech.glide.load.data.d
    public void c(Exception exc) {
        C3.D d10 = (C3.D) this.f23439c;
        G3.r rVar = (G3.r) this.f23438b;
        G3.r rVar2 = d10.f2506f;
        if (rVar2 == null || rVar2 != rVar) {
            return;
        }
        C3.D d11 = (C3.D) this.f23439c;
        G3.r rVar3 = (G3.r) this.f23438b;
        C3.k kVar = d11.f2502b;
        C3.f fVar = d11.f2507u;
        com.bumptech.glide.load.data.e eVar = rVar3.f4329c;
        kVar.b(fVar, exc, eVar, eVar.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1 A[Catch: all -> 0x00c2, TRY_ENTER, TryCatch #0 {all -> 0x00c2, blocks: (B:61:0x00c1, B:62:0x00c4, B:63:0x00dc), top: B:59:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:61:0x00c1, B:62:0x00c4, B:63:0x00dc), top: B:59:0x00bf }] */
    @Override // T2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T2.a d(String fileName) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        kotlin.jvm.internal.l.e(fileName, "fileName");
        A a9 = (A) this.f23439c;
        a9.getClass();
        if (!fileName.equals(":memory:")) {
            fileName = ((C0313b) a9.f5003d).f5128a.getDatabasePath(fileName).getAbsolutePath();
            kotlin.jvm.internal.l.b(fileName);
        }
        boolean z8 = true;
        J2.a aVar = new J2.a(fileName, (a9.f5001b || a9.f5002c || fileName.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = aVar.f5445a;
        reentrantLock.lock();
        c cVar = aVar.f5446b;
        if (cVar != null) {
            try {
                cVar.q();
            } catch (Throwable th) {
                th = th;
                z8 = false;
                try {
                    if (!z8) {
                        throw th;
                    }
                    throw new IllegalStateException("Unable to open database '" + fileName + "'. Was a proper path / name used in Room's database builder?", th);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (a9.f5002c) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                T2.a d10 = ((T2.b) this.f23438b).d(fileName);
                if (a9.f5001b) {
                    if (((C0313b) a9.f5003d).g == I2.D.f5024c) {
                        AbstractC0672a.h(d10, "PRAGMA synchronous = NORMAL");
                    } else {
                        AbstractC0672a.h(d10, "PRAGMA synchronous = FULL");
                    }
                    A.b(d10);
                    ((H2.E) a9.f5004e).t(d10);
                } else {
                    try {
                        a9.f5002c = true;
                        A.a(a9, d10);
                        a9.f5002c = false;
                    } catch (Throwable th2) {
                        a9.f5002c = false;
                        throw th2;
                    }
                }
                if (cVar != null && (fileChannel2 = (FileChannel) cVar.f23372c) != null) {
                    try {
                        fileChannel2.close();
                        cVar.f23372c = null;
                    } finally {
                    }
                }
                return d10;
            } catch (Throwable th3) {
                if (cVar != null && (fileChannel = (FileChannel) cVar.f23372c) != null) {
                    try {
                        fileChannel.close();
                        cVar.f23372c = null;
                    } finally {
                    }
                }
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            if (!z8) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(Object obj) {
        C3.D d10 = (C3.D) this.f23439c;
        G3.r rVar = (G3.r) this.f23438b;
        G3.r rVar2 = d10.f2506f;
        if (rVar2 == null || rVar2 != rVar) {
            return;
        }
        C3.D d11 = (C3.D) this.f23439c;
        G3.r rVar3 = (G3.r) this.f23438b;
        C3.m mVar = d11.f2501a.f2537p;
        if (obj != null && mVar.a(rVar3.f4329c.d())) {
            d11.f2505e = obj;
            d11.f2502b.v(2);
        } else {
            C3.k kVar = d11.f2502b;
            A3.h hVar = rVar3.f4327a;
            com.bumptech.glide.load.data.e eVar = rVar3.f4329c;
            kVar.d(hVar, obj, eVar, eVar.d(), d11.f2507u);
        }
    }

    public void f(Object obj, String str) {
        ((ArrayList) this.f23438b).add(X.c.i(str, "=", String.valueOf(obj)));
    }

    @Override // okhttp3.Callback
    public void g(Call call, Response response) {
        kotlin.jvm.internal.l.e(call, "call");
        UtilsKt.doOnSuccess(response, new Ba.o((U9.k) this.f23439c, 20), (C0666c) this.f23438b);
    }

    public boolean h() {
        synchronized (this) {
            if (((AtomicBoolean) this.f23439c).get()) {
                return false;
            }
            ((AtomicInteger) this.f23438b).incrementAndGet();
            return true;
        }
    }

    @Override // okhttp3.Callback
    public void i(Call call, IOException iOException) {
        kotlin.jvm.internal.l.e(call, "call");
        ((C0666c) this.f23438b).invoke(iOException);
    }

    public T7.s j(T7.c cVar, Q7.a aVar) {
        E e2 = (E) this.f23439c;
        e2.getClass();
        C0385e o10 = ((C0385e) this.f23438b).o(cVar);
        T7.s C2 = ((C0381a) e2.f6317a).C(o10);
        if (C2 != null) {
            return C2;
        }
        if (aVar.a(cVar)) {
            return ((C0381a) e2.f6317a).y(o10).o(((T7.m) aVar.f8671c).f9350a.h(cVar));
        }
        return null;
    }

    public T7.s k(T7.s sVar) {
        E e2 = (E) this.f23439c;
        e2.getClass();
        T7.s sVar2 = T7.k.f9348e;
        C0381a c0381a = (C0381a) e2.f6317a;
        C0385e c0385e = (C0385e) this.f23438b;
        T7.s<T7.q> C2 = c0381a.C(c0385e);
        if (C2 == null) {
            C0381a y10 = ((C0381a) e2.f6317a).y(c0385e);
            Iterator it = sVar.iterator();
            while (it.hasNext()) {
                T7.q qVar = (T7.q) it.next();
                sVar2 = sVar2.w(qVar.f9359a, y10.y(new C0385e(qVar.f9359a)).o(qVar.f9360b));
            }
            ArrayList arrayList = new ArrayList();
            O7.g gVar = y10.f6321a;
            Object obj = gVar.f7495a;
            if (obj != null) {
                for (T7.q qVar2 : (T7.s) obj) {
                    arrayList.add(new T7.q(qVar2.f9359a, qVar2.f9360b));
                }
            } else {
                for (Map.Entry entry : gVar.f7496b) {
                    O7.g gVar2 = (O7.g) entry.getValue();
                    if (gVar2.f7495a != null) {
                        arrayList.add(new T7.q((T7.c) entry.getKey(), (T7.s) gVar2.f7495a));
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                T7.q qVar3 = (T7.q) it2.next();
                sVar2 = sVar2.w(qVar3.f9359a, qVar3.f9360b);
            }
        } else if (!C2.p()) {
            for (T7.q qVar4 : C2) {
                sVar2 = sVar2.w(qVar4.f9359a, qVar4.f9360b);
            }
        }
        return sVar2;
    }

    @Override // V4.p
    public L l() {
        return new l(17, ((Hc.e) this.f23438b).l(), (List) this.f23439c, false);
    }

    public T7.s m(C0385e c0385e, T7.s sVar, T7.s sVar2) {
        E e2 = (E) this.f23439c;
        e2.getClass();
        O7.k.b("Either existingEventSnap or existingServerSnap must exist", (sVar == null && sVar2 == null) ? false : true);
        C0385e i7 = ((C0385e) this.f23438b).i(c0385e);
        if (((C0381a) e2.f6317a).C(i7) != null) {
            return null;
        }
        C0381a y10 = ((C0381a) e2.f6317a).y(i7);
        return y10.f6321a.isEmpty() ? sVar2.k(c0385e) : y10.o(sVar2.k(c0385e));
    }

    public void n(long j, n5.v vVar) {
        if (vVar.a() < 9) {
            return;
        }
        int h10 = vVar.h();
        int h11 = vVar.h();
        int v10 = vVar.v();
        if (h10 == 434 && h11 == 1195456820 && v10 == 3) {
            c2.i.j(j, vVar, (v[]) this.f23439c);
        }
    }

    public Bundle o(String key) {
        kotlin.jvm.internal.l.e(key, "key");
        S2.b bVar = (S2.b) this.f23438b;
        if (!bVar.f8984b) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = (Bundle) bVar.f8989h;
        if (bundle == null) {
            return null;
        }
        Bundle n6 = bundle.containsKey(key) ? Y6.b.n(key, bundle) : null;
        bundle.remove(key);
        if (bundle.isEmpty()) {
            bVar.f8989h = null;
        }
        return n6;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        J6.d dVar = (J6.d) this.f23438b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f23439c;
        synchronized (dVar.f5549f) {
            dVar.f5548e.remove(taskCompletionSource);
        }
    }

    public void p(InterfaceC1984l interfaceC1984l, F f4) {
        int i7 = 0;
        while (true) {
            v[] vVarArr = (v[]) this.f23439c;
            if (i7 >= vVarArr.length) {
                return;
            }
            f4.a();
            f4.b();
            v u3 = interfaceC1984l.u(f4.f2683d, 3);
            m4.L l10 = (m4.L) ((List) this.f23438b).get(i7);
            String str = l10.f20096z;
            AbstractC1705a.g("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            K k = new K();
            f4.b();
            k.f19976a = f4.f2684e;
            k.k = str;
            k.f19979d = l10.f20088d;
            k.f19978c = l10.f20087c;
            k.f19972C = l10.f20080R;
            k.f19985m = l10.f20065B;
            h3.o.w(k, u3);
            vVarArr[i7] = u3;
            i7++;
        }
    }

    public byte[] q(H4.a aVar) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f23438b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f23439c;
        try {
            dataOutputStream.writeBytes(aVar.f4887a);
            dataOutputStream.writeByte(0);
            String str = aVar.f4888b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f4889c);
            dataOutputStream.writeLong(aVar.f4890d);
            dataOutputStream.write(aVar.f4891e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public com.bumptech.glide.n r(Context context, com.bumptech.glide.b bVar, C1481z c1481z, U u3, boolean z8) {
        W3.o.a();
        W3.o.a();
        HashMap hashMap = (HashMap) this.f23438b;
        com.bumptech.glide.n nVar = (com.bumptech.glide.n) hashMap.get(c1481z);
        if (nVar != null) {
            return nVar;
        }
        P3.h hVar = new P3.h(c1481z);
        U9.i iVar = new U9.i(this, u3);
        ((U9.j) this.f23439c).getClass();
        com.bumptech.glide.n nVar2 = new com.bumptech.glide.n(bVar, hVar, iVar, context);
        hashMap.put(c1481z, nVar2);
        hVar.j(new P3.j(c1481z, this));
        if (z8) {
            nVar2.j();
        }
        return nVar2;
    }

    @Override // V4.p
    public L s(V4.l lVar, V4.i iVar) {
        ((Hc.e) this.f23438b).getClass();
        return new l(17, new V4.o(lVar, iVar), (List) this.f23439c, false);
    }

    public String t(A3.h hVar) {
        String str;
        synchronized (((W3.k) this.f23438b)) {
            str = (String) ((W3.k) this.f23438b).a(hVar);
        }
        if (str == null) {
            E3.i iVar = (E3.i) ((Q7.h) this.f23439c).h();
            try {
                hVar.b(iVar.f3540a);
                byte[] digest = iVar.f3540a.digest();
                char[] cArr = W3.o.f10620b;
                synchronized (cArr) {
                    for (int i7 = 0; i7 < digest.length; i7++) {
                        byte b2 = digest[i7];
                        int i10 = i7 * 2;
                        char[] cArr2 = W3.o.f10619a;
                        cArr[i10] = cArr2[(b2 & 255) >>> 4];
                        cArr[i10 + 1] = cArr2[b2 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((Q7.h) this.f23439c).M(iVar);
            }
        }
        synchronized (((W3.k) this.f23438b)) {
            ((W3.k) this.f23438b).d(hVar, str);
        }
        return str;
    }

    public String toString() {
        switch (this.f23437a) {
            case 26:
                String str = "[ ";
                if (((b1.f) this.f23438b) != null) {
                    for (int i7 = 0; i7 < 9; i7++) {
                        StringBuilder m10 = X.c.m(str);
                        m10.append(((b1.f) this.f23438b).f13809v[i7]);
                        m10.append(" ");
                        str = m10.toString();
                    }
                }
                StringBuilder n6 = A3.c.n(str, "] ");
                n6.append((b1.f) this.f23438b);
                return n6.toString();
            case 27:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f23439c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f23438b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public Q2.d u() {
        Q2.d dVar;
        S2.b bVar = (S2.b) this.f23438b;
        synchronized (((U9.j) bVar.f8988f)) {
            Iterator it = ((LinkedHashMap) bVar.g).entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Q2.d dVar2 = (Q2.d) entry.getValue();
                if (kotlin.jvm.internal.l.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public ArrayList w(String str) {
        TreeMap treeMap = I2.H.f5039w;
        I2.H a9 = AbstractC0315d.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        a9.p(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f23438b;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            ArrayList arrayList = new ArrayList(n6.getCount());
            while (n6.moveToNext()) {
                arrayList.add(n6.getString(0));
            }
            return arrayList;
        } finally {
            n6.close();
            a9.F();
        }
    }

    public void x() {
        ((SparseIntArray) this.f23438b).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(c cVar) {
        boolean z8;
        B b2 = B.f10626c;
        String str = (String) ((W4.E) cVar.f23372c).f10642a.get("range");
        W4.n nVar = (W4.n) this.f23439c;
        if (str != null) {
            try {
                b2 = B.a(str);
            } catch (C1586o0 e2) {
                nVar.f10734a.w("SDP format error.", e2);
                return;
            }
        }
        Uri uri = nVar.f10741v;
        N6.E e10 = new N6.E();
        int i7 = 0;
        while (true) {
            W4.E e11 = (W4.E) cVar.f23372c;
            if (i7 < e11.f10643b.size()) {
                C0585c c0585c = (C0585c) e11.f10643b.get(i7);
                String O10 = u0.O(c0585c.j.f10669b);
                O10.getClass();
                char c10 = 65535;
                switch (O10.hashCode()) {
                    case -1922091719:
                        if (O10.equals("MPEG4-GENERIC")) {
                            c10 = 0;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            case '\t':
                            case '\n':
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            case '\f':
                            case '\r':
                            case 14:
                            case 15:
                            case 16:
                                z8 = true;
                                break;
                            default:
                                z8 = false;
                                break;
                        }
                        if (!z8) {
                            e10.d(new W4.v((W4.o) cVar.f23371b, c0585c, uri));
                        }
                        i7++;
                    case 2412:
                        if (O10.equals("L8")) {
                            c10 = 1;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 64593:
                        if (O10.equals("AC3")) {
                            c10 = 2;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 64934:
                        if (O10.equals("AMR")) {
                            c10 = 3;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 74609:
                        if (O10.equals("L16")) {
                            c10 = 4;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 85182:
                        if (O10.equals("VP8")) {
                            c10 = 5;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 85183:
                        if (O10.equals("VP9")) {
                            c10 = 6;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 2194728:
                        if (O10.equals("H264")) {
                            c10 = 7;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 2194729:
                        if (O10.equals("H265")) {
                            c10 = '\b';
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 2433087:
                        if (O10.equals("OPUS")) {
                            c10 = '\t';
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 2450119:
                        if (O10.equals("PCMA")) {
                            c10 = '\n';
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 2450139:
                        if (O10.equals("PCMU")) {
                            c10 = 11;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 1061166827:
                        if (O10.equals("MP4A-LATM")) {
                            c10 = '\f';
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 1934494802:
                        if (O10.equals("AMR-WB")) {
                            c10 = '\r';
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 1959269366:
                        if (O10.equals("MP4V-ES")) {
                            c10 = 14;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 2137188397:
                        if (O10.equals("H263-1998")) {
                            c10 = 15;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    case 2137209252:
                        if (O10.equals("H263-2000")) {
                            c10 = 16;
                        }
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                    default:
                        switch (c10) {
                        }
                        if (!z8) {
                        }
                        i7++;
                        break;
                }
            } else {
                t0 h10 = e10.h();
                boolean isEmpty = h10.isEmpty();
                R7.b bVar = nVar.f10734a;
                if (isEmpty) {
                    bVar.w("No playable track.", null);
                    return;
                }
                bVar.getClass();
                int i10 = 0;
                while (true) {
                    int size = h10.size();
                    W4.s sVar = (W4.s) bVar.f8929b;
                    if (i10 >= size) {
                        C0463k h11 = W4.s.h(sVar);
                        h11.getClass();
                        long j = b2.f10628a;
                        long j10 = b2.f10629b;
                        long M3 = D.M(j10 - j);
                        u uVar = (u) h11.f8074b;
                        uVar.f10781A = M3;
                        uVar.f10782B = !(j10 == -9223372036854775807L);
                        uVar.f10783C = j10 == -9223372036854775807L;
                        uVar.f10784D = false;
                        uVar.v();
                        nVar.f10730C = true;
                        return;
                    }
                    W4.r rVar = new W4.r(sVar, (W4.v) h10.get(i10), i10, sVar.f10776v);
                    sVar.f10773e.add(rVar);
                    rVar.b();
                    i10++;
                }
            }
        }
    }

    public void z(C0463k c0463k) {
        W4.n nVar = (W4.n) this.f23439c;
        if (nVar.f10745z != null) {
            return;
        }
        H h10 = (H) c0463k.f8074b;
        if (!h10.isEmpty() && !h10.contains(2)) {
            nVar.f10734a.w("DESCRIBE not supported.", null);
            return;
        }
        nVar.f10740u.E(nVar.f10741v, nVar.f10744y);
    }

    @Override // F6.c
    public Object zza() {
        return new E6.i(((E6.e) ((C2034c) this.f23438b).f24513b).f3734b, (E6.j) ((F6.c) this.f23439c).zza());
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public String zza(String str) {
        Map map = (Map) ((C0628k0) this.f23439c).f11798d.get((String) this.f23438b);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
