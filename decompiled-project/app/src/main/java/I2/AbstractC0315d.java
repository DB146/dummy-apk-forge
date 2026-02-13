package I2;

import android.content.Context;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: I2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0315d {
    public static H a(int i7, String query) {
        kotlin.jvm.internal.l.e(query, "query");
        TreeMap treeMap = H.f5039w;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
            if (ceilingEntry == null) {
                H h10 = new H(i7);
                h10.f5041b = query;
                h10.f5047v = i7;
                return h10;
            }
            treeMap.remove(ceilingEntry.getKey());
            H h11 = (H) ceilingEntry.getValue();
            h11.getClass();
            h11.f5041b = query;
            h11.f5047v = i7;
            return h11;
        }
    }

    public static final B d(Context context, Class cls, String str) {
        kotlin.jvm.internal.l.e(context, "context");
        if (ac.g.h0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (str.equals(":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new B(context, cls, str);
    }

    public static final Object e(InterfaceC0333w interfaceC0333w, String str, Jb.c cVar) {
        Object b2 = interfaceC0333w.b(str, new Ba.i(3), cVar);
        return b2 == Ib.a.f5345a ? b2 : Db.q.f3365a;
    }

    public abstract void b(T2.c cVar, Object obj);

    public abstract String c();

    public void f(T2.a connection, Object obj) {
        kotlin.jvm.internal.l.e(connection, "connection");
        if (obj == null) {
            return;
        }
        T2.c R10 = connection.R(c());
        try {
            b(R10, obj);
            R10.J();
            Tb.a.g(R10, null);
            R10 = connection.R("SELECT changes()");
            try {
                R10.J();
                R10.x(0);
                Tb.a.g(R10, null);
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public void g(T2.a connection, Iterable iterable) {
        kotlin.jvm.internal.l.e(connection, "connection");
        if (iterable == null) {
            return;
        }
        T2.c R10 = connection.R(c());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    b(R10, obj);
                    R10.J();
                    R10.reset();
                }
            }
            Tb.a.g(R10, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Tb.a.g(R10, th);
                throw th2;
            }
        }
    }

    public void h(T2.a connection, Object obj) {
        kotlin.jvm.internal.l.e(connection, "connection");
        if (obj == null) {
            return;
        }
        T2.c R10 = connection.R(c());
        try {
            b(R10, obj);
            R10.J();
            Tb.a.g(R10, null);
        } finally {
        }
    }
}
