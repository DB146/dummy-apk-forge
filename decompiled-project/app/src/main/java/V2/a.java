package V2;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Rb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U2.f f9993a;

    public /* synthetic */ a(U2.f fVar) {
        this.f9993a = fVar;
    }

    @Override // Rb.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        l.b(sQLiteQuery);
        this.f9993a.n(new i(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
