package V2;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class j extends i implements U2.e {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f10026b;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f10026b = sQLiteStatement;
    }

    public final int l() {
        return this.f10026b.executeUpdateDelete();
    }
}
