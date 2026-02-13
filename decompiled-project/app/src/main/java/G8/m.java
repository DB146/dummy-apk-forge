package G8;

import J8.C0347b;
import J8.C0349d;
import J8.C0353h;
import J8.C0357l;
import J8.C0358m;
import J8.C0360o;
import J8.C0361p;
import J8.C0362q;
import J8.C0367w;
import J8.T;
import J8.V;
import J8.d0;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: m, reason: collision with root package name */
    public static final i f4379m = i.f4371d;

    /* renamed from: n, reason: collision with root package name */
    public static final h f4380n = h.f4369a;

    /* renamed from: o, reason: collision with root package name */
    public static final x f4381o = x.f4396a;

    /* renamed from: p, reason: collision with root package name */
    public static final x f4382p = x.f4397b;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f4383a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4384b;

    /* renamed from: c, reason: collision with root package name */
    public final q3.e f4385c;

    /* renamed from: d, reason: collision with root package name */
    public final C0357l f4386d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4387e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f4388f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final i f4389h;

    /* renamed from: i, reason: collision with root package name */
    public final List f4390i;
    public final List j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4391l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m() {
        this(r1, f4380n, r3, f4379m, 0, r6, r7, r8, f4381o, f4382p, r11);
        I8.d dVar = I8.d.f5268c;
        Map emptyMap = Collections.emptyMap();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
    }

    public m(I8.d dVar, h hVar, Map map, i iVar, int i7, List list, List list2, List list3, x xVar, x xVar2, List list4) {
        this.f4383a = new ThreadLocal();
        this.f4384b = new ConcurrentHashMap();
        this.f4388f = map;
        q3.e eVar = new q3.e(10, map, list4);
        this.f4385c = eVar;
        this.g = true;
        this.f4389h = iVar;
        this.f4391l = i7;
        this.f4390i = list;
        this.j = list2;
        this.k = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d0.f5668A);
        arrayList.add(xVar == x.f4396a ? C0362q.f5713c : new C0360o(xVar, 1));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(d0.f5682p);
        arrayList.add(d0.g);
        arrayList.add(d0.f5673d);
        arrayList.add(d0.f5674e);
        arrayList.add(d0.f5675f);
        J8.A a9 = d0.k;
        arrayList.add(new V(Long.TYPE, Long.class, a9));
        arrayList.add(new V(Double.TYPE, Double.class, new j(0)));
        arrayList.add(new V(Float.TYPE, Float.class, new j(1)));
        arrayList.add(xVar2 == x.f4397b ? C0361p.f5711b : new C0360o(new C0361p(xVar2), 0));
        arrayList.add(d0.f5676h);
        arrayList.add(d0.f5677i);
        arrayList.add(new T(AtomicLong.class, new k(a9, 0).a(), 0));
        arrayList.add(new T(AtomicLongArray.class, new k(a9, 1).a(), 0));
        arrayList.add(d0.j);
        arrayList.add(d0.f5678l);
        arrayList.add(d0.f5683q);
        arrayList.add(d0.f5684r);
        arrayList.add(new T(BigDecimal.class, d0.f5679m, 0));
        arrayList.add(new T(BigInteger.class, d0.f5680n, 0));
        arrayList.add(new T(I8.j.class, d0.f5681o, 0));
        arrayList.add(d0.f5685s);
        arrayList.add(d0.f5686t);
        arrayList.add(d0.f5688v);
        arrayList.add(d0.f5689w);
        arrayList.add(d0.f5691y);
        arrayList.add(d0.f5687u);
        arrayList.add(d0.f5671b);
        arrayList.add(C0353h.f5694c);
        arrayList.add(d0.f5690x);
        if (M8.f.f6839a) {
            arrayList.add(M8.f.f6841c);
            arrayList.add(M8.f.f6840b);
            arrayList.add(M8.f.f6842d);
        }
        arrayList.add(C0347b.f5660c);
        arrayList.add(d0.f5670a);
        arrayList.add(new C0349d(eVar, 0));
        arrayList.add(new C0349d(eVar, 1));
        C0357l c0357l = new C0357l(eVar);
        this.f4386d = c0357l;
        arrayList.add(c0357l);
        arrayList.add(d0.f5669B);
        arrayList.add(new C0367w(eVar, hVar, dVar, c0357l, list4));
        this.f4387e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        r10.f7505C = r3;
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        if (r10.j0() != 10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        throw new Db.d("JSON document was not fully consumed.", 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        throw new Db.d(4, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        throw new Db.d(4, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, N8.a aVar) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        O8.a aVar2 = new O8.a(new StringReader(str));
        int i7 = this.f4391l;
        int i10 = i7 == 0 ? 2 : i7;
        if (i10 == 0) {
            throw null;
        }
        aVar2.f7505C = i10;
        boolean z8 = true;
        if (i7 != 0) {
            if (i7 == 0) {
                throw null;
            }
            aVar2.f7505C = i7;
        } else if (i10 == 2) {
            aVar2.f7505C = 1;
        }
        try {
            try {
                try {
                    try {
                        try {
                            aVar2.j0();
                            z8 = false;
                            z d10 = d(aVar);
                            Class cls = aVar.f7386a;
                            Object b2 = d10.b(aVar2);
                            Class l10 = I8.h.l(cls);
                            if (b2 != null && !l10.isInstance(b2)) {
                                throw new ClassCastException("Type adapter '" + d10 + "' returned wrong type; requested " + cls + " but got instance of " + b2.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            throw null;
                        } catch (IOException e2) {
                            throw new Db.d(4, e2);
                        }
                    } catch (IllegalStateException e10) {
                        throw new Db.d(4, e10);
                    }
                } catch (EOFException e11) {
                    if (!z8) {
                        throw new Db.d(4, e11);
                    }
                    if (i10 == 0) {
                        throw null;
                    }
                    aVar2.f7505C = i10;
                }
            } catch (AssertionError e12) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e12.getMessage(), e12);
            }
        } catch (Throwable th) {
            if (i10 == 0) {
                throw null;
            }
            aVar2.f7505C = i10;
            throw th;
        }
    }

    public final Object c(String str, Type type) {
        return b(str, new N8.a(type));
    }

    public final z d(N8.a aVar) {
        boolean z8;
        ConcurrentHashMap concurrentHashMap = this.f4384b;
        z zVar = (z) concurrentHashMap.get(aVar);
        if (zVar != null) {
            return zVar;
        }
        ThreadLocal threadLocal = this.f4383a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z8 = true;
        } else {
            z zVar2 = (z) map.get(aVar);
            if (zVar2 != null) {
                return zVar2;
            }
            z8 = false;
        }
        try {
            l lVar = new l();
            map.put(aVar, lVar);
            Iterator it = this.f4387e.iterator();
            z zVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zVar3 = ((A) it.next()).a(this, aVar);
                if (zVar3 != null) {
                    if (lVar.f4378a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    lVar.f4378a = zVar3;
                    map.put(aVar, zVar3);
                }
            }
            if (z8) {
                threadLocal.remove();
            }
            if (zVar3 != null) {
                if (z8) {
                    concurrentHashMap.putAll(map);
                }
                return zVar3;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z8) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final O8.b e(Writer writer) {
        O8.b bVar = new O8.b(writer);
        bVar.Y(this.f4389h);
        bVar.f7529w = this.g;
        int i7 = this.f4391l;
        if (i7 == 0) {
            i7 = 2;
        }
        bVar.Z(i7);
        bVar.f7531y = false;
        return bVar;
    }

    public final String f(Object obj) {
        if (obj != null) {
            return g(obj.getClass(), obj);
        }
        StringWriter stringWriter = new StringWriter();
        try {
            h(e(stringWriter));
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new Db.d(4, e2);
        }
    }

    public final String g(Type type, Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            i(obj, type, e(stringWriter));
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new Db.d(4, e2);
        }
    }

    public final void h(O8.b bVar) {
        q qVar = q.f4393a;
        int i7 = bVar.f7528v;
        boolean z8 = bVar.f7529w;
        boolean z10 = bVar.f7531y;
        bVar.f7529w = this.g;
        bVar.f7531y = false;
        int i10 = this.f4391l;
        if (i10 != 0) {
            bVar.Z(i10);
        } else if (i7 == 2) {
            bVar.f7528v = 1;
        }
        try {
            try {
                d0.f5692z.getClass();
                C0358m.e(bVar, qVar);
                bVar.Z(i7);
                bVar.f7529w = z8;
                bVar.f7531y = z10;
            } catch (IOException e2) {
                throw new Db.d(4, e2);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e10.getMessage(), e10);
            }
        } catch (Throwable th) {
            bVar.Z(i7);
            bVar.f7529w = z8;
            bVar.f7531y = z10;
            throw th;
        }
    }

    public final void i(Object obj, Type type, O8.b bVar) {
        z d10 = d(new N8.a(type));
        int i7 = bVar.f7528v;
        int i10 = this.f4391l;
        if (i10 != 0) {
            bVar.Z(i10);
        } else if (i7 == 2) {
            bVar.f7528v = 1;
        }
        boolean z8 = bVar.f7529w;
        boolean z10 = bVar.f7531y;
        bVar.f7529w = this.g;
        bVar.f7531y = false;
        try {
            try {
                d10.c(bVar, obj);
            } catch (IOException e2) {
                throw new Db.d(4, e2);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e10.getMessage(), e10);
            }
        } finally {
            bVar.Z(i7);
            bVar.f7529w = z8;
            bVar.f7531y = z10;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f4387e + ",instanceCreators:" + this.f4385c + "}";
    }
}
