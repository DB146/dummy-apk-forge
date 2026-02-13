package i4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b4.C0838i;
import e4.EnumC1087c;
import j4.InterfaceC1376b;
import j4.InterfaceC1377c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import k4.InterfaceC1421a;
import l4.AbstractC1485a;

/* loaded from: classes.dex */
public final class g implements d, InterfaceC1377c, c {

    /* renamed from: f, reason: collision with root package name */
    public static final Y3.c f18411f = new Y3.c("proto");

    /* renamed from: a, reason: collision with root package name */
    public final i f18412a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1421a f18413b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1421a f18414c;

    /* renamed from: d, reason: collision with root package name */
    public final C1345a f18415d;

    /* renamed from: e, reason: collision with root package name */
    public final Cb.a f18416e;

    public g(InterfaceC1421a interfaceC1421a, InterfaceC1421a interfaceC1421a2, C1345a c1345a, i iVar, Cb.a aVar) {
        this.f18412a = iVar;
        this.f18413b = interfaceC1421a;
        this.f18414c = interfaceC1421a2;
        this.f18415d = c1345a;
        this.f18416e = aVar;
    }

    public static String U(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((C1346b) it.next()).f18406a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object V(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long n(SQLiteDatabase sQLiteDatabase, C0838i c0838i) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c0838i.f13859a, String.valueOf(AbstractC1485a.a(c0838i.f13861c))));
        byte[] bArr = c0838i.f13860b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public final Object F(e eVar) {
        SQLiteDatabase l10 = l();
        l10.beginTransaction();
        try {
            Object apply = eVar.apply(l10);
            l10.setTransactionSuccessful();
            return apply;
        } finally {
            l10.endTransaction();
        }
    }

    public final ArrayList K(SQLiteDatabase sQLiteDatabase, C0838i c0838i, int i7) {
        ArrayList arrayList = new ArrayList();
        Long n6 = n(sQLiteDatabase, c0838i);
        if (n6 == null) {
            return arrayList;
        }
        V(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{n6.toString()}, null, null, null, String.valueOf(i7)), new M9.e(this, arrayList, c0838i, 10));
        return arrayList;
    }

    public final void P(long j, EnumC1087c enumC1087c, String str) {
        F(new h4.h(str, enumC1087c, j));
    }

    public final Object T(InterfaceC1376b interfaceC1376b) {
        SQLiteDatabase l10 = l();
        InterfaceC1421a interfaceC1421a = this.f18414c;
        long b2 = interfaceC1421a.b();
        while (true) {
            try {
                l10.beginTransaction();
                try {
                    Object e2 = interfaceC1376b.e();
                    l10.setTransactionSuccessful();
                    return e2;
                } finally {
                    l10.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (interfaceC1421a.b() >= this.f18415d.f18403c + b2) {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18412a.close();
    }

    public final SQLiteDatabase l() {
        i iVar = this.f18412a;
        Objects.requireNonNull(iVar);
        InterfaceC1421a interfaceC1421a = this.f18414c;
        long b2 = interfaceC1421a.b();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e2) {
                if (interfaceC1421a.b() >= this.f18415d.f18403c + b2) {
                    throw new RuntimeException("Timed out while trying to open db.", e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
