package D3;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final q3.c f3173a = new q3.c(5, (byte) 0);

    /* renamed from: b, reason: collision with root package name */
    public final e f3174b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3175c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3176d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f3177e;

    /* renamed from: f, reason: collision with root package name */
    public int f3178f;

    public f(int i7) {
        this.f3177e = i7;
    }

    public final void a(int i7, Class cls) {
        NavigableMap f4 = f(cls);
        Integer num = (Integer) f4.get(Integer.valueOf(i7));
        if (num != null) {
            if (num.intValue() == 1) {
                f4.remove(Integer.valueOf(i7));
                return;
            } else {
                f4.put(Integer.valueOf(i7), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i7 + ", this: " + this);
    }

    public final void b(int i7) {
        while (this.f3178f > i7) {
            Object z8 = this.f3173a.z();
            W3.g.b(z8);
            b d10 = d(z8.getClass());
            this.f3178f -= d10.b() * d10.a(z8);
            a(d10.a(z8), z8.getClass());
            if (Log.isLoggable(d10.c(), 2)) {
                Log.v(d10.c(), "evicted: " + d10.a(z8));
            }
        }
    }

    public final synchronized Object c(int i7, Class cls) {
        d dVar;
        int i10;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i7));
            if (num == null || ((i10 = this.f3178f) != 0 && this.f3177e / i10 < 2 && num.intValue() > i7 * 8)) {
                e eVar = this.f3174b;
                h hVar = (h) ((ArrayDeque) eVar.f3094a).poll();
                if (hVar == null) {
                    hVar = eVar.K();
                }
                dVar = (d) hVar;
                dVar.f3170b = i7;
                dVar.f3171c = cls;
            }
            e eVar2 = this.f3174b;
            int intValue = num.intValue();
            h hVar2 = (h) ((ArrayDeque) eVar2.f3094a).poll();
            if (hVar2 == null) {
                hVar2 = eVar2.K();
            }
            dVar = (d) hVar2;
            dVar.f3170b = intValue;
            dVar.f3171c = cls;
        } catch (Throwable th) {
            throw th;
        }
        return e(dVar, cls);
    }

    public final b d(Class cls) {
        HashMap hashMap = this.f3176d;
        b bVar = (b) hashMap.get(cls);
        if (bVar == null) {
            if (cls.equals(int[].class)) {
                bVar = new b(1);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                bVar = new b(0);
            }
            hashMap.put(cls, bVar);
        }
        return bVar;
    }

    public final Object e(d dVar, Class cls) {
        Object obj;
        b d10 = d(cls);
        Object m10 = this.f3173a.m(dVar);
        if (m10 != null) {
            this.f3178f -= d10.b() * d10.a(m10);
            a(d10.a(m10), cls);
        }
        if (m10 != null) {
            return m10;
        }
        if (Log.isLoggable(d10.c(), 2)) {
            Log.v(d10.c(), "Allocated " + dVar.f3170b + " bytes");
        }
        int i7 = dVar.f3170b;
        switch (d10.f3164a) {
            case 0:
                obj = new byte[i7];
                break;
            default:
                obj = new int[i7];
                break;
        }
        return obj;
    }

    public final NavigableMap f(Class cls) {
        HashMap hashMap = this.f3175c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        b d10 = d(cls);
        int a9 = d10.a(obj);
        int b2 = d10.b() * a9;
        if (b2 <= this.f3177e / 2) {
            e eVar = this.f3174b;
            h hVar = (h) ((ArrayDeque) eVar.f3094a).poll();
            if (hVar == null) {
                hVar = eVar.K();
            }
            d dVar = (d) hVar;
            dVar.f3170b = a9;
            dVar.f3171c = cls;
            this.f3173a.y(dVar, obj);
            NavigableMap f4 = f(cls);
            Integer num = (Integer) f4.get(Integer.valueOf(dVar.f3170b));
            Integer valueOf = Integer.valueOf(dVar.f3170b);
            int i7 = 1;
            if (num != null) {
                i7 = 1 + num.intValue();
            }
            f4.put(valueOf, Integer.valueOf(i7));
            this.f3178f += b2;
            b(this.f3177e);
        }
    }
}
