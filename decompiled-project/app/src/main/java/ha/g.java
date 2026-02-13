package ha;

import Db.o;
import Eb.p;
import P4.C0463k;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.kt.apps.core.extensions.ExtensionsChannel;
import gb.q;
import hb.InterfaceC1269b;
import i1.C1290a;
import j9.C1388a;
import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kb.EnumC1437b;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import o5.w;
import q3.j;
import q3.n;
import t7.InterfaceC2031b;
import va.C;
import yb.InterfaceC2474d;

/* loaded from: classes2.dex */
public final class g implements InterfaceC1394e, gb.g, q, InterfaceC2474d, InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17914a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17915b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17916c;

    public g(int i7) {
        this.f17914a = i7;
        switch (i7) {
            case 13:
                this.f17915b = new AtomicInteger();
                this.f17916c = new AtomicInteger();
                return;
            default:
                AtomicReference atomicReference = new AtomicReference();
                this.f17915b = atomicReference;
                AtomicReference atomicReference2 = new AtomicReference();
                this.f17916c = atomicReference2;
                AtomicReference atomicReference3 = new AtomicReference();
                atomicReference2.lazySet(atomicReference3);
                return;
        }
    }

    public g(int i7, int i10) {
        this.f17914a = 4;
        this.f17915b = new int[]{i7, i10};
        this.f17916c = new float[]{0.0f, 1.0f};
    }

    public g(int i7, int i10, int i11) {
        this.f17914a = 4;
        this.f17915b = new int[]{i7, i10, i11};
        this.f17916c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.f17914a = i7;
        this.f17915b = obj;
        this.f17916c = obj2;
    }

    public /* synthetic */ g(int i7, boolean z8) {
        this.f17914a = i7;
    }

    public g(C0463k c0463k) {
        this.f17914a = 1;
        this.f17915b = c0463k;
        this.f17916c = new Object();
    }

    public g(Context context) {
        this.f17914a = 10;
        this.f17915b = context;
        this.f17916c = null;
    }

    public g(MediaCodec.CryptoInfo cryptoInfo) {
        this.f17914a = 7;
        this.f17915b = cryptoInfo;
        this.f17916c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public g(C1388a c1388a, int[] iArr) {
        this.f17914a = 2;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f17915b = c1388a;
        int length = iArr.length;
        int i7 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f17916c = iArr;
            return;
        }
        while (i7 < length && iArr[i7] == 0) {
            i7++;
        }
        if (i7 == length) {
            this.f17916c = new int[]{0};
            return;
        }
        int i10 = length - i7;
        int[] iArr2 = new int[i10];
        this.f17916c = iArr2;
        System.arraycopy(iArr, i7, iArr2, 0, i10);
    }

    public g(ArrayList arrayList, ArrayList arrayList2) {
        this.f17914a = 4;
        int size = arrayList.size();
        this.f17915b = new int[size];
        this.f17916c = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            ((int[]) this.f17915b)[i7] = ((Integer) arrayList.get(i7)).intValue();
            ((float[]) this.f17916c)[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    public g(Supplier supplier) {
        this.f17914a = 15;
        this.f17916c = supplier;
        this.f17915b = new wc.g(new wc.d(1), 0);
    }

    @Override // gb.g
    public void a() {
        ((gb.g) this.f17915b).a();
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        String str = (String) obj;
        C c10 = (C) this.f17915b;
        if (c10.f10272P) {
            return;
        }
        l.b(str);
        int i7 = C.f25269v2;
        C.p1(c10, (ExtensionsChannel) this.f17916c, str);
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        List<V9.a> it = (List) obj;
        l.e(it, "it");
        ArrayList arrayList = new ArrayList(p.S(it, 10));
        for (V9.a aVar : it) {
            o oVar = i.f17917e;
            String str = aVar.f10235b;
            v vVar = (v) this.f17915b;
            String str2 = (String) vVar.f19134a;
            ArrayList arrayList2 = (ArrayList) this.f17916c;
            arrayList.add(new C1266b(aVar, f.b(aVar.f10235b, arrayList2), f.a(str, str2, arrayList2, 100) + f.a(aVar.f10234a, (String) vVar.f19134a, arrayList2, 100)));
        }
        return arrayList;
    }

    public g b(g gVar) {
        C1388a c1388a = (C1388a) gVar.f17915b;
        C1388a c1388a2 = (C1388a) this.f17915b;
        if (!c1388a2.equals(c1388a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (k()) {
            return gVar;
        }
        if (gVar.k()) {
            return this;
        }
        int[] iArr = (int[]) this.f17916c;
        int length = iArr.length;
        int[] iArr2 = (int[]) gVar.f17916c;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i7 = length2; i7 < iArr.length; i7++) {
            iArr3[i7] = c1388a2.a(iArr2[i7 - length2], iArr[i7]);
        }
        return new g(c1388a2, iArr3);
    }

    @Override // gb.g, gb.q
    public void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f17914a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                EnumC1437b.j((nb.e) this.f17916c, interfaceC1269b);
                return;
            default:
                EnumC1437b.f((tb.d) this.f17915b, interfaceC1269b);
                return;
        }
    }

    @Override // yb.InterfaceC2475e
    public void clear() {
        switch (this.f17914a) {
            case 3:
                this.f17915b = null;
                this.f17916c = null;
                return;
        }
        while (poll() != null && !isEmpty()) {
        }
    }

    public Object d() {
        ArrayDeque j = j();
        return !j.isEmpty() ? j.pop() : ((Supplier) this.f17916c).get();
    }

    public boolean e(j jVar) {
        boolean containsKey;
        synchronized (this.f17916c) {
            containsKey = ((LinkedHashMap) ((C0463k) this.f17915b).f8074b).containsKey(jVar);
        }
        return containsKey;
    }

    public int f(int i7) {
        if (i7 == 0) {
            return g(0);
        }
        C1388a c1388a = (C1388a) this.f17915b;
        int[] iArr = (int[]) this.f17916c;
        if (i7 == 1) {
            int i10 = 0;
            for (int i11 : iArr) {
                i10 = c1388a.a(i10, i11);
            }
            return i10;
        }
        int i12 = iArr[0];
        int length = iArr.length;
        for (int i13 = 1; i13 < length; i13++) {
            i12 = c1388a.a(c1388a.c(i7, i12), iArr[i13]);
        }
        return i12;
    }

    public int g(int i7) {
        return ((int[]) this.f17916c)[(r0.length - 1) - i7];
    }

    public int h() {
        return ((int[]) this.f17916c).length - 1;
    }

    @Override // yb.InterfaceC2475e
    public boolean isEmpty() {
        return ((ub.a) ((AtomicReference) this.f17916c).get()) == ((ub.a) ((AtomicReference) this.f17915b).get());
    }

    public ArrayDeque j() {
        wc.g gVar = (wc.g) this.f17915b;
        ArrayDeque arrayDeque = (ArrayDeque) ((SoftReference) gVar.get()).get();
        if (arrayDeque != null) {
            return arrayDeque;
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        gVar.set(new SoftReference(arrayDeque2));
        return arrayDeque2;
    }

    public boolean k() {
        return ((int[]) this.f17916c)[0] == 0;
    }

    public g l(int i7) {
        C1388a c1388a = (C1388a) this.f17915b;
        if (i7 == 0) {
            return c1388a.f18673c;
        }
        if (i7 == 1) {
            return this;
        }
        int[] iArr = (int[]) this.f17916c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = c1388a.c(iArr[i10], i7);
        }
        return new g(c1388a, iArr2);
    }

    public g m(g gVar) {
        C1388a c1388a = (C1388a) gVar.f17915b;
        C1388a c1388a2 = (C1388a) this.f17915b;
        if (!c1388a2.equals(c1388a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (k() || gVar.k()) {
            return c1388a2.f18673c;
        }
        int[] iArr = (int[]) this.f17916c;
        int length = iArr.length;
        int[] iArr2 = (int[]) gVar.f17916c;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = iArr[i7];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = i7 + i11;
                iArr3[i12] = c1388a2.a(iArr3[i12], c1388a2.c(i10, iArr2[i11]));
            }
        }
        return new g(c1388a2, iArr3);
    }

    public void n(int i7, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i7 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC2031b interfaceC2031b = "clx".equals(bundle2.getString("_o")) ? (n) this.f17915b : (C1290a) this.f17916c;
            if (interfaceC2031b == null) {
                return;
            }
            interfaceC2031b.i(string, bundle2);
        }
    }

    public void o(Object obj) {
        ArrayDeque j = j();
        if (j.size() < 12) {
            j.push(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ub.a, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    @Override // yb.InterfaceC2475e
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        ?? atomicReference = new AtomicReference();
        atomicReference.f24918a = obj;
        ((ub.a) ((AtomicReference) this.f17915b).getAndSet(atomicReference)).lazySet(atomicReference);
        return true;
    }

    @Override // gb.g, gb.q
    public void onError(Throwable th) {
        switch (this.f17914a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((gb.g) this.f17915b).onError(th);
                return;
            default:
                ((q) this.f17916c).onError(th);
                return;
        }
    }

    @Override // gb.g, gb.q
    public void onSuccess(Object obj) {
        switch (this.f17914a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((gb.g) this.f17915b).onSuccess(obj);
                return;
            default:
                ((q) this.f17916c).onSuccess(obj);
                return;
        }
    }

    public i3.i p(j id) {
        i3.i C2;
        l.e(id, "id");
        synchronized (this.f17916c) {
            C2 = ((C0463k) this.f17915b).C(id);
        }
        return C2;
    }

    @Override // yb.InterfaceC2475e
    public Object poll() {
        ub.a aVar;
        AtomicReference atomicReference = (AtomicReference) this.f17916c;
        ub.a aVar2 = (ub.a) atomicReference.get();
        ub.a aVar3 = (ub.a) aVar2.get();
        if (aVar3 != null) {
            Object obj = aVar3.f24918a;
            aVar3.f24918a = null;
            atomicReference.lazySet(aVar3);
            aVar2.lazySet(null);
            return obj;
        }
        if (aVar2 == ((ub.a) ((AtomicReference) this.f17915b).get())) {
            return null;
        }
        do {
            aVar = (ub.a) aVar2.get();
        } while (aVar == null);
        Object obj2 = aVar.f24918a;
        aVar.f24918a = null;
        atomicReference.lazySet(aVar);
        aVar2.lazySet(null);
        return obj2;
    }

    public List q(String workSpecId) {
        List D10;
        l.e(workSpecId, "workSpecId");
        synchronized (this.f17916c) {
            D10 = ((C0463k) this.f17915b).D(workSpecId);
        }
        return D10;
    }

    public g r(g gVar) {
        if (!((C1388a) this.f17915b).equals((C1388a) gVar.f17915b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (gVar.k()) {
            return this;
        }
        int[] iArr = (int[]) gVar.f17916c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i7 = 0;
        while (true) {
            C1388a c1388a = (C1388a) gVar.f17915b;
            if (i7 >= length) {
                return b(new g(c1388a, iArr2));
            }
            int i10 = iArr[i7];
            c1388a.getClass();
            iArr2[i7] = (929 - i10) % 929;
            i7++;
        }
    }

    public i3.i s(j jVar) {
        i3.i F10;
        synchronized (this.f17916c) {
            F10 = ((C0463k) this.f17915b).F(jVar);
        }
        return F10;
    }

    public void t(w wVar) {
        Handler handler = (Handler) this.f17915b;
        if (handler != null) {
            handler.post(new Aa.j(28, this, wVar));
        }
    }

    public String toString() {
        switch (this.f17914a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(h() * 8);
                for (int h10 = h(); h10 >= 0; h10--) {
                    int g = g(h10);
                    if (g != 0) {
                        if (g < 0) {
                            sb2.append(" - ");
                            g = -g;
                        } else if (sb2.length() > 0) {
                            sb2.append(" + ");
                        }
                        if (h10 == 0 || g != 1) {
                            sb2.append(g);
                        }
                        if (h10 != 0) {
                            if (h10 == 1) {
                                sb2.append('x');
                            } else {
                                sb2.append("x^");
                                sb2.append(h10);
                            }
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
