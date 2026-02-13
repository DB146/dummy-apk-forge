package J7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import b4.C0838i;
import com.google.android.gms.tasks.OnFailureListener;
import l4.AbstractC1485a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements OnFailureListener, i4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5574b;

    public /* synthetic */ e(long j, C0838i c0838i) {
        this.f5573a = j;
        this.f5574b = c0838i;
    }

    public /* synthetic */ e(r rVar, long j) {
        this.f5574b = rVar;
        this.f5573a = j;
    }

    @Override // i4.e
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f5573a));
        C0838i c0838i = (C0838i) this.f5574b;
        String str = c0838i.f13859a;
        Y3.d dVar = c0838i.f13861c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC1485a.a(dVar))}) < 1) {
            contentValues.put("backend_name", c0838i.f13859a);
            contentValues.put("priority", Integer.valueOf(AbstractC1485a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        r rVar = (r) this.f5574b;
        long j = rVar.f5611B;
        long j10 = this.f5573a;
        Q7.h hVar = rVar.f5637y;
        if (j10 != j) {
            hVar.p("Ignoring getToken error, because this was not the latest attempt.", null, new Object[0]);
            return;
        }
        rVar.f5622h = m.f5590a;
        hVar.p("Error fetching token: " + exc, null, new Object[0]);
        rVar.o();
    }
}
