package I2;

import A0.C0028q;
import K2.InterfaceC0380b;
import a.AbstractC0672a;
import android.content.Context;
import g3.C1191j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Executor;
import y7.u0;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5000a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5001b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5002c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5003d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5004e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5005f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5006h;

    public A(C0313b c0313b, Ba.o oVar) {
        this.f5000a = 0;
        this.f5003d = c0313b;
        this.f5004e = new H2.E(-1, "", "");
        Collection collection = Eb.v.f3891a;
        Collection collection2 = c0313b.f5132e;
        this.f5005f = collection2 == null ? collection : collection2;
        ArrayList h02 = Eb.o.h0(collection2 != null ? collection2 : collection, new C0336z(new Ba.o(this, 11)));
        Context context = c0313b.f5128a;
        kotlin.jvm.internal.l.e(context, "context");
        D5.i migrationContainer = c0313b.f5131d;
        kotlin.jvm.internal.l.e(migrationContainer, "migrationContainer");
        D d10 = c0313b.g;
        Executor queryExecutor = c0313b.f5134h;
        kotlin.jvm.internal.l.e(queryExecutor, "queryExecutor");
        Executor transactionExecutor = c0313b.f5135i;
        kotlin.jvm.internal.l.e(transactionExecutor, "transactionExecutor");
        List typeConverters = c0313b.f5141q;
        kotlin.jvm.internal.l.e(typeConverters, "typeConverters");
        List autoMigrationSpecs = c0313b.f5142r;
        kotlin.jvm.internal.l.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.g = new L2.b(new C1191j((U2.d) oVar.invoke(new C0313b(context, c0313b.f5129b, c0313b.f5130c, migrationContainer, h02, c0313b.f5133f, d10, queryExecutor, transactionExecutor, c0313b.j, c0313b.k, c0313b.f5136l, c0313b.f5137m, c0313b.f5138n, c0313b.f5139o, c0313b.f5140p, typeConverters, autoMigrationSpecs, c0313b.f5143s, c0313b.f5144t, c0313b.f5145u))));
        boolean z8 = d10 == D.f5024c;
        U2.d c10 = c();
        if (c10 != null) {
            c10.setWriteAheadLoggingEnabled(z8);
        }
    }

    public A(C0313b c0313b, H2.E e2) {
        int i7;
        K2.h hVar;
        this.f5000a = 0;
        this.f5003d = c0313b;
        this.f5004e = e2;
        Object obj = c0313b.f5132e;
        this.f5005f = obj == null ? Eb.v.f3891a : obj;
        D d10 = c0313b.g;
        String str = c0313b.f5129b;
        T2.b bVar = c0313b.f5144t;
        if (bVar == null) {
            U2.c cVar = c0313b.f5130c;
            if (cVar == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            Context context = c0313b.f5128a;
            kotlin.jvm.internal.l.e(context, "context");
            this.g = new L2.b(new C1191j(cVar.b(new U2.b(context, str, new C0335y(this, e2.f4586a), false, false))));
        } else {
            if (str == null) {
                hVar = new K2.h(new q3.s(this, bVar));
            } else {
                q3.s sVar = new q3.s(this, bVar);
                int ordinal = d10.ordinal();
                if (ordinal == 1) {
                    i7 = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + d10 + '\'').toString());
                    }
                    i7 = 4;
                }
                int ordinal2 = d10.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + d10 + '\'').toString());
                }
                hVar = new K2.h(sVar, str, i7);
            }
            this.g = hVar;
        }
        boolean z8 = d10 == D.f5024c;
        U2.d c10 = c();
        if (c10 != null) {
            c10.setWriteAheadLoggingEnabled(z8);
        }
    }

    public A(boolean z8, boolean z10, rc.z zVar, Long l10, Long l11, Long l12, Long l13) {
        this.f5000a = 1;
        Eb.w wVar = Eb.w.f3892a;
        this.f5001b = z8;
        this.f5002c = z10;
        this.f5003d = l10;
        this.f5004e = l11;
        this.f5005f = l12;
        this.g = l13;
        this.f5006h = Eb.B.L(wVar);
    }

    public static final void a(A a9, T2.a aVar) {
        Object n6;
        D d10 = ((C0313b) a9.f5003d).g;
        D d11 = D.f5024c;
        if (d10 == d11) {
            AbstractC0672a.h(aVar, "PRAGMA journal_mode = WAL");
        } else {
            AbstractC0672a.h(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (((C0313b) a9.f5003d).g == d11) {
            AbstractC0672a.h(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            AbstractC0672a.h(aVar, "PRAGMA synchronous = FULL");
        }
        b(aVar);
        T2.c R10 = aVar.R("PRAGMA user_version");
        try {
            R10.J();
            int x2 = (int) R10.x(0);
            Tb.a.g(R10, null);
            H2.E e2 = (H2.E) a9.f5004e;
            if (x2 != e2.f4586a) {
                AbstractC0672a.h(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                int i7 = e2.f4586a;
                try {
                    if (x2 == 0) {
                        a9.d(aVar);
                    } else {
                        a9.e(aVar, x2, i7);
                    }
                    AbstractC0672a.h(aVar, "PRAGMA user_version = " + i7);
                    n6 = Db.q.f3365a;
                } catch (Throwable th) {
                    n6 = com.bumptech.glide.c.n(th);
                }
                if (!(n6 instanceof Db.l)) {
                    AbstractC0672a.h(aVar, "END TRANSACTION");
                }
                Throwable a10 = Db.m.a(n6);
                if (a10 != null) {
                    AbstractC0672a.h(aVar, "ROLLBACK TRANSACTION");
                    throw a10;
                }
            }
            a9.f(aVar);
        } finally {
        }
    }

    public static void b(T2.a aVar) {
        T2.c R10 = aVar.R("PRAGMA busy_timeout");
        try {
            R10.J();
            long x2 = R10.x(0);
            Tb.a.g(R10, null);
            if (x2 < 3000) {
                AbstractC0672a.h(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Tb.a.g(R10, th);
                throw th2;
            }
        }
    }

    public U2.d c() {
        C1191j c1191j;
        InterfaceC0380b interfaceC0380b = (InterfaceC0380b) this.g;
        L2.b bVar = interfaceC0380b instanceof L2.b ? (L2.b) interfaceC0380b : null;
        if (bVar == null || (c1191j = bVar.f6265a) == null) {
            return null;
        }
        return (U2.d) c1191j.f17441b;
    }

    public void d(T2.a connection) {
        kotlin.jvm.internal.l.e(connection, "connection");
        T2.c R10 = connection.R("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z8 = false;
            if (R10.J()) {
                if (R10.x(0) == 0) {
                    z8 = true;
                }
            }
            Tb.a.g(R10, null);
            H2.E e2 = (H2.E) this.f5004e;
            e2.a(connection);
            if (!z8) {
                F w10 = e2.w(connection);
                if (!w10.f5034a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + w10.f5035b).toString());
                }
            }
            AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            AbstractC0672a.h(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) e2.f4587b) + "')");
            e2.s(connection);
            for (C c10 : (List) this.f5005f) {
                c10.getClass();
                if (connection instanceof L2.a) {
                    c10.a(((L2.a) connection).f6264a);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Tb.a.g(R10, th);
                throw th2;
            }
        }
    }

    public void e(T2.a connection, int i7, int i10) {
        kotlin.jvm.internal.l.e(connection, "connection");
        C0313b c0313b = (C0313b) this.f5003d;
        List<M2.a> e2 = P2.j.e(c0313b.f5131d, i7, i10);
        H2.E e10 = (H2.E) this.f5004e;
        if (e2 != null) {
            e10.v(connection);
            for (M2.a aVar : e2) {
                aVar.getClass();
                if (!(connection instanceof L2.a)) {
                    throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                aVar.a(((L2.a) connection).f6264a);
            }
            F w10 = e10.w(connection);
            if (!w10.f5034a) {
                throw new IllegalStateException(("Migration didn't properly handle: " + w10.f5035b).toString());
            }
            e10.u(connection);
            AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            AbstractC0672a.h(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) e10.f4587b) + "')");
            return;
        }
        if (P2.j.k(c0313b, i7, i10)) {
            throw new IllegalStateException(("A migration from " + i7 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (c0313b.f5143s) {
            T2.c R10 = connection.R("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                Fb.b m10 = u0.m();
                while (R10.J()) {
                    String j = R10.j(0);
                    if (!ac.n.Y(j, "sqlite_", false) && !j.equals("android_metadata")) {
                        m10.add(new Db.j(j, Boolean.valueOf(kotlin.jvm.internal.l.a(R10.j(1), "view"))));
                    }
                }
                Fb.b i11 = u0.i(m10);
                Tb.a.g(R10, null);
                ListIterator listIterator = i11.listIterator(0);
                while (true) {
                    C0028q c0028q = (C0028q) listIterator;
                    if (!c0028q.hasNext()) {
                        break;
                    }
                    Db.j jVar = (Db.j) c0028q.next();
                    String str = (String) jVar.f3354a;
                    if (((Boolean) jVar.f3355b).booleanValue()) {
                        AbstractC0672a.h(connection, "DROP VIEW IF EXISTS " + str);
                    } else {
                        AbstractC0672a.h(connection, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Tb.a.g(R10, th);
                    throw th2;
                }
            }
        } else {
            e10.c(connection);
        }
        for (C c10 : (List) this.f5005f) {
            c10.getClass();
            if (connection instanceof L2.a) {
                c10.b(((L2.a) connection).f6264a);
            }
        }
        e10.a(connection);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(T2.a connection) {
        boolean z8;
        Object n6;
        F w10;
        kotlin.jvm.internal.l.e(connection, "connection");
        T2.c R10 = connection.R("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (R10.J()) {
                if (R10.x(0) != 0) {
                    z8 = true;
                    Tb.a.g(R10, null);
                    H2.E e2 = (H2.E) this.f5004e;
                    if (z8) {
                        AbstractC0672a.h(connection, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            w10 = e2.w(connection);
                        } catch (Throwable th) {
                            n6 = com.bumptech.glide.c.n(th);
                        }
                        if (!w10.f5034a) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + w10.f5035b).toString());
                        }
                        e2.u(connection);
                        AbstractC0672a.h(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        AbstractC0672a.h(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) e2.f4587b) + "')");
                        n6 = Db.q.f3365a;
                        if (!(n6 instanceof Db.l)) {
                            AbstractC0672a.h(connection, "END TRANSACTION");
                        }
                        Throwable a9 = Db.m.a(n6);
                        if (a9 != null) {
                            AbstractC0672a.h(connection, "ROLLBACK TRANSACTION");
                            throw a9;
                        }
                    } else {
                        R10 = connection.R("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String j = R10.J() ? R10.j(0) : null;
                            Tb.a.g(R10, null);
                            if (!((String) e2.f4587b).equals(j) && !((String) e2.f4588c).equals(j)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) e2.f4587b) + ", found: " + j).toString());
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                    }
                    e2.t(connection);
                    for (C c10 : (List) this.f5005f) {
                        c10.getClass();
                        if (connection instanceof L2.a) {
                            c10.c(((L2.a) connection).f6264a);
                        }
                    }
                    this.f5001b = true;
                }
            }
            z8 = false;
            Tb.a.g(R10, null);
            H2.E e22 = (H2.E) this.f5004e;
            if (z8) {
            }
            e22.t(connection);
            while (r0.hasNext()) {
            }
            this.f5001b = true;
        } catch (Throwable th22) {
            try {
                throw th22;
            } finally {
            }
        }
    }

    public String toString() {
        switch (this.f5000a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                if (this.f5001b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f5002c) {
                    arrayList.add("isDirectory");
                }
                Long l10 = (Long) this.f5003d;
                if (l10 != null) {
                    arrayList.add("byteCount=" + l10);
                }
                Long l11 = (Long) this.f5004e;
                if (l11 != null) {
                    arrayList.add("createdAt=" + l11);
                }
                Long l12 = (Long) this.f5005f;
                if (l12 != null) {
                    arrayList.add("lastModifiedAt=" + l12);
                }
                Long l13 = (Long) this.g;
                if (l13 != null) {
                    arrayList.add("lastAccessedAt=" + l13);
                }
                Map map = (Map) this.f5006h;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return Eb.o.d0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }
}
