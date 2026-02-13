package V2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements U2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f9995b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f9996c = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Object f9997d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f9998e;

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f9999a;

    static {
        Db.h hVar = Db.h.f3352a;
        f9997d = android.support.v4.media.session.b.y(hVar, new S9.a(9));
        f9998e = android.support.v4.media.session.b.y(hVar, new S9.a(10));
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f9999a = sQLiteDatabase;
    }

    @Override // U2.a
    public final void B(Object[] objArr) {
        this.f9999a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // U2.a
    public final void C() {
        this.f9999a.setTransactionSuccessful();
    }

    @Override // U2.a
    public final void D() {
        this.f9999a.beginTransactionNonExclusive();
    }

    @Override // U2.a
    public final int M(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f9995b[3]);
        sb2.append("WorkSpec SET ");
        int i7 = 0;
        for (String str : contentValues.keySet()) {
            sb2.append(i7 > 0 ? "," : "");
            sb2.append(str);
            objArr2[i7] = contentValues.get(str);
            sb2.append("=?");
            i7++;
        }
        for (int i10 = size; i10 < length; i10++) {
            objArr2[i10] = objArr[i10 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        j q10 = q(sb2.toString());
        int length2 = objArr2.length;
        int i11 = 0;
        while (i11 < length2) {
            Object obj = objArr2[i11];
            i11++;
            if (obj == null) {
                q10.a(i11);
            } else if (obj instanceof byte[]) {
                q10.g(i11, (byte[]) obj);
            } else if (obj instanceof Float) {
                q10.b(i11, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                q10.b(i11, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                q10.f(i11, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                q10.f(i11, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                q10.f(i11, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                q10.f(i11, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                q10.p(i11, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i11 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                q10.f(i11, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return q10.f10026b.executeUpdateDelete();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9999a.close();
    }

    @Override // U2.a
    public final void h() {
        this.f9999a.endTransaction();
    }

    @Override // U2.a
    public final void i() {
        this.f9999a.beginTransaction();
    }

    @Override // U2.a
    public final boolean isOpen() {
        return this.f9999a.isOpen();
    }

    @Override // U2.a
    public final void o(String sql) {
        l.e(sql, "sql");
        this.f9999a.execSQL(sql);
    }

    @Override // U2.a
    public final j q(String sql) {
        l.e(sql, "sql");
        SQLiteStatement compileStatement = this.f9999a.compileStatement(sql);
        l.d(compileStatement, "compileStatement(...)");
        return new j(compileStatement);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Db.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [Db.g, java.lang.Object] */
    @Override // U2.a
    public final void r() {
        ?? r02 = f9998e;
        if (((Method) r02.getValue()) != null) {
            ?? r12 = f9997d;
            if (((Method) r12.getValue()) != null) {
                Method method = (Method) r02.getValue();
                l.b(method);
                Method method2 = (Method) r12.getValue();
                l.b(method2);
                Object invoke = method2.invoke(this.f9999a, null);
                if (invoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(invoke, 0, null, 0, null);
                return;
            }
        }
        i();
    }

    @Override // U2.a
    public final boolean u() {
        return this.f9999a.inTransaction();
    }

    @Override // U2.a
    public final Cursor v(U2.f fVar) {
        final a aVar = new a(fVar);
        Cursor rawQueryWithFactory = this.f9999a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: V2.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) a.this.f(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, fVar.l(), f9996c, null);
        l.d(rawQueryWithFactory, "rawQueryWithFactory(...)");
        return rawQueryWithFactory;
    }

    @Override // U2.a
    public final boolean z() {
        return this.f9999a.isWriteAheadLoggingEnabled();
    }
}
