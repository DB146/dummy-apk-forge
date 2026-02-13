package I2;

import A0.C0028q;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import i1.C1290a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import y7.u0;

/* loaded from: classes.dex */
public final class G extends A4.c {

    /* renamed from: c, reason: collision with root package name */
    public C0313b f5036c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5037d;

    /* renamed from: e, reason: collision with root package name */
    public final C1290a f5038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0313b configuration, C1290a c1290a) {
        super(23, 1);
        kotlin.jvm.internal.l.e(configuration, "configuration");
        this.f5037d = configuration.f5132e;
        this.f5036c = configuration;
        this.f5038e = c1290a;
    }

    @Override // A4.c
    public final void B(V2.c cVar) {
        Cursor v10 = cVar.v(new D7.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'", 2));
        try {
            boolean z8 = false;
            if (v10.moveToFirst()) {
                if (v10.getInt(0) == 0) {
                    z8 = true;
                }
            }
            tc.b.o(v10, null);
            C1290a c1290a = this.f5038e;
            C1290a.k(cVar);
            if (!z8) {
                F o10 = C1290a.o(cVar);
                if (!o10.f5034a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + o10.f5035b);
                }
            }
            cVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            ((WorkDatabase_Impl) c1290a.f18187b).getClass();
            List list = this.f5037d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C) it.next()).a(cVar);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tc.b.o(v10, th);
                throw th2;
            }
        }
    }

    @Override // A4.c
    public final void C(V2.c cVar, int i7, int i10) {
        E(cVar, i7, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    @Override // A4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(V2.c cVar) {
        boolean z8;
        List list;
        Cursor v10 = cVar.v(new D7.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'", 2));
        try {
            if (v10.moveToFirst()) {
                if (v10.getInt(0) != 0) {
                    z8 = true;
                    tc.b.o(v10, null);
                    C1290a c1290a = this.f5038e;
                    if (z8) {
                        F o10 = C1290a.o(cVar);
                        if (!o10.f5034a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + o10.f5035b);
                        }
                        cVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        cVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                    } else {
                        v10 = cVar.v(new D7.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 2));
                        try {
                            String string = v10.moveToFirst() ? v10.getString(0) : null;
                            tc.b.o(v10, null);
                            if (!"86254750241babac4b8d52996a675549".equals(string) && !"1cbd3130fa23b59692c061c594c16cc0".equals(string)) {
                                throw new IllegalStateException(X.c.t("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: ", string));
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1290a.f18187b;
                    workDatabase_Impl.getClass();
                    cVar.o("PRAGMA foreign_keys = ON");
                    workDatabase_Impl.s(new L2.a(cVar));
                    list = this.f5037d;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((C) it.next()).c(cVar);
                        }
                    }
                    this.f5036c = null;
                }
            }
            z8 = false;
            tc.b.o(v10, null);
            C1290a c1290a2 = this.f5038e;
            if (z8) {
            }
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c1290a2.f18187b;
            workDatabase_Impl2.getClass();
            cVar.o("PRAGMA foreign_keys = ON");
            workDatabase_Impl2.s(new L2.a(cVar));
            list = this.f5037d;
            if (list != null) {
            }
            this.f5036c = null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } finally {
            }
        }
    }

    @Override // A4.c
    public final void E(V2.c cVar, int i7, int i10) {
        C0313b c0313b = this.f5036c;
        C1290a c1290a = this.f5038e;
        if (c0313b != null) {
            D5.i iVar = c0313b.f5131d;
            iVar.getClass();
            List<M2.a> e2 = P2.j.e(iVar, i7, i10);
            if (e2 != null) {
                P2.j.d(new L2.a(cVar));
                for (M2.a aVar : e2) {
                    aVar.getClass();
                    aVar.a(cVar);
                }
                F o10 = C1290a.o(cVar);
                if (!o10.f5034a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + o10.f5035b);
                }
                cVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                return;
            }
        }
        C0313b c0313b2 = this.f5036c;
        if (c0313b2 == null || P2.j.k(c0313b2, i7, i10)) {
            throw new IllegalStateException(A3.c.e(i7, i10, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        if (c0313b2.f5143s) {
            Cursor v10 = cVar.v(new D7.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'", 2));
            try {
                Fb.b m10 = u0.m();
                while (v10.moveToNext()) {
                    String string = v10.getString(0);
                    kotlin.jvm.internal.l.b(string);
                    if (!ac.n.Y(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        m10.add(new Db.j(string, Boolean.valueOf(kotlin.jvm.internal.l.a(v10.getString(1), "view"))));
                    }
                }
                Fb.b i11 = u0.i(m10);
                tc.b.o(v10, null);
                ListIterator listIterator = i11.listIterator(0);
                while (true) {
                    C0028q c0028q = (C0028q) listIterator;
                    if (!c0028q.hasNext()) {
                        break;
                    }
                    Db.j jVar = (Db.j) c0028q.next();
                    String str = (String) jVar.f3354a;
                    if (((Boolean) jVar.f3355b).booleanValue()) {
                        cVar.o("DROP VIEW IF EXISTS " + str);
                    } else {
                        cVar.o("DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    tc.b.o(v10, th);
                    throw th2;
                }
            }
        } else {
            cVar.o("DROP TABLE IF EXISTS `Dependency`");
            cVar.o("DROP TABLE IF EXISTS `WorkSpec`");
            cVar.o("DROP TABLE IF EXISTS `WorkTag`");
            cVar.o("DROP TABLE IF EXISTS `SystemIdInfo`");
            cVar.o("DROP TABLE IF EXISTS `WorkName`");
            cVar.o("DROP TABLE IF EXISTS `WorkProgress`");
            cVar.o("DROP TABLE IF EXISTS `Preference`");
            ((WorkDatabase_Impl) c1290a.f18187b).getClass();
        }
        List list = this.f5037d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C) it.next()).b(cVar);
            }
        }
        C1290a.k(cVar);
    }

    @Override // A4.c
    public final void z(V2.c cVar) {
    }
}
