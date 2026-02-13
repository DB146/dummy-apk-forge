package G3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final C f4343e = new C(10);

    /* renamed from: f, reason: collision with root package name */
    public static final D f4344f = new D(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4345a;

    /* renamed from: b, reason: collision with root package name */
    public final C f4346b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f4347c;

    /* renamed from: d, reason: collision with root package name */
    public final Q7.h f4348d;

    public y(Q7.h hVar) {
        C c10 = f4343e;
        this.f4345a = new ArrayList();
        this.f4347c = new HashSet();
        this.f4348d = hVar;
        this.f4346b = c10;
    }

    public final synchronized s a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f4345a.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                x xVar = (x) it.next();
                if (this.f4347c.contains(xVar)) {
                    z8 = true;
                } else if (xVar.f4340a.isAssignableFrom(cls) && xVar.f4341b.isAssignableFrom(cls2)) {
                    this.f4347c.add(xVar);
                    arrayList.add(xVar.f4342c.m(this));
                    this.f4347c.remove(xVar);
                }
            }
            if (arrayList.size() > 1) {
                C c10 = this.f4346b;
                Q7.h hVar = this.f4348d;
                c10.getClass();
                return new C0280b(2, arrayList, hVar);
            }
            if (arrayList.size() == 1) {
                return (s) arrayList.get(0);
            }
            if (z8) {
                return f4344f;
            }
            throw new RuntimeException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f4347c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f4345a.iterator();
            while (it.hasNext()) {
                x xVar = (x) it.next();
                if (!this.f4347c.contains(xVar) && xVar.f4340a.isAssignableFrom(cls)) {
                    this.f4347c.add(xVar);
                    arrayList.add(xVar.f4342c.m(this));
                    this.f4347c.remove(xVar);
                }
            }
        } catch (Throwable th) {
            this.f4347c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f4345a.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (!arrayList.contains(xVar.f4341b) && xVar.f4340a.isAssignableFrom(cls)) {
                arrayList.add(xVar.f4341b);
            }
        }
        return arrayList;
    }
}
