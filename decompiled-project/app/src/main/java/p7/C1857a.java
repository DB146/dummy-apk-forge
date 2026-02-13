package p7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m4.Y;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1857a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23118a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f23119b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f23120c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23121d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23122e;

    /* renamed from: f, reason: collision with root package name */
    public final c f23123f;
    public final Set g;

    public C1857a(String str, Set set, Set set2, int i7, int i10, c cVar, Set set3) {
        this.f23118a = str;
        this.f23119b = Collections.unmodifiableSet(set);
        this.f23120c = Collections.unmodifiableSet(set2);
        this.f23121d = i7;
        this.f23122e = i10;
        this.f23123f = cVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static Y a(Class cls) {
        return new Y(cls, new Class[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.Y, java.lang.Object] */
    public static Y b(p pVar) {
        p[] pVarArr = new p[0];
        ?? obj = new Object();
        obj.f20191a = null;
        HashSet hashSet = new HashSet();
        obj.f20194d = hashSet;
        obj.f20195e = new HashSet();
        obj.f20192b = 0;
        obj.f20193c = 0;
        obj.g = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            c2.i.e(pVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.f20194d, pVarArr);
        return obj;
    }

    public static C1857a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            c2.i.e(cls2, "Null interface");
            hashSet.add(p.a(cls2));
        }
        return new C1857a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new n4.d(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f23119b.toArray()) + ">{" + this.f23121d + ", type=" + this.f23122e + ", deps=" + Arrays.toString(this.f23120c.toArray()) + "}";
    }
}
