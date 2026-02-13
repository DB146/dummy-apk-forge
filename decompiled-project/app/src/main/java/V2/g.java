package V2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f10010v = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10011a;

    /* renamed from: b, reason: collision with root package name */
    public final R7.a f10012b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.c f10013c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10014d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10015e;

    /* renamed from: f, reason: collision with root package name */
    public final W2.a f10016f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10017u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final R7.a aVar, final A4.c callback, boolean z8) {
        super(context, str, null, callback.f368b, new DatabaseErrorHandler() { // from class: V2.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i7 = g.f10010v;
                l.b(sQLiteDatabase);
                c q10 = com.bumptech.glide.d.q(aVar, sQLiteDatabase);
                A4.c.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + q10 + ".path");
                SQLiteDatabase sQLiteDatabase2 = q10.f9999a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        A4.c.f(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object second = ((Pair) it.next()).second;
                                l.d(second, "second");
                                A4.c.f((String) second);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                A4.c.f(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    q10.close();
                } catch (IOException unused2) {
                    if (list != null) {
                        return;
                    }
                }
            }
        });
        l.e(context, "context");
        l.e(callback, "callback");
        this.f10011a = context;
        this.f10012b = aVar;
        this.f10013c = callback;
        this.f10014d = z8;
        if (str == null) {
            str = UUID.randomUUID().toString();
            l.d(str, "toString(...)");
        }
        this.f10016f = new W2.a(str, context.getCacheDir(), false);
    }

    public final SQLiteDatabase F(boolean z8) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z10 = this.f10017u;
        Context context = this.f10011a;
        if (databaseName != null && !z10 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return n(z8);
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return n(z8);
            } catch (Throwable th) {
                th = th;
                if (th instanceof e) {
                    e eVar = (e) th;
                    int ordinal = eVar.f10002a.ordinal();
                    th = eVar.f10003b;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        throw new Db.d(1);
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f10014d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return n(z8);
                } catch (e e2) {
                    throw e2.f10003b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        W2.a aVar = this.f10016f;
        try {
            aVar.a(aVar.f10590a);
            super.close();
            this.f10012b.f8927b = null;
            this.f10017u = false;
        } finally {
            aVar.b();
        }
    }

    public final U2.a l(boolean z8) {
        W2.a aVar = this.f10016f;
        try {
            aVar.a((this.f10017u || getDatabaseName() == null) ? false : true);
            this.f10015e = false;
            SQLiteDatabase F10 = F(z8);
            if (!this.f10015e) {
                c q10 = com.bumptech.glide.d.q(this.f10012b, F10);
                aVar.b();
                return q10;
            }
            close();
            U2.a l10 = l(z8);
            aVar.b();
            return l10;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final SQLiteDatabase n(boolean z8) {
        if (z8) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            l.b(writableDatabase);
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        l.b(readableDatabase);
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        l.e(db2, "db");
        boolean z8 = this.f10015e;
        A4.c cVar = this.f10013c;
        if (!z8 && cVar.f368b != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            cVar.z(com.bumptech.glide.d.q(this.f10012b, db2));
        } catch (Throwable th) {
            throw new e(f.f10004a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        l.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f10013c.B(com.bumptech.glide.d.q(this.f10012b, sqLiteDatabase));
        } catch (Throwable th) {
            throw new e(f.f10005b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i7, int i10) {
        l.e(db2, "db");
        this.f10015e = true;
        try {
            this.f10013c.C(com.bumptech.glide.d.q(this.f10012b, db2), i7, i10);
        } catch (Throwable th) {
            throw new e(f.f10007d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        l.e(db2, "db");
        if (!this.f10015e) {
            try {
                this.f10013c.D(com.bumptech.glide.d.q(this.f10012b, db2));
            } catch (Throwable th) {
                throw new e(f.f10008e, th);
            }
        }
        this.f10017u = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i7, int i10) {
        l.e(sqLiteDatabase, "sqLiteDatabase");
        this.f10015e = true;
        try {
            this.f10013c.E(com.bumptech.glide.d.q(this.f10012b, sqLiteDatabase), i7, i10);
        } catch (Throwable th) {
            throw new e(f.f10006c, th);
        }
    }
}
