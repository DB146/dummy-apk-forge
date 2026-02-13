package h4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b4.C0838i;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e4.EnumC1087c;
import j4.InterfaceC1376b;
import j8.InterfaceC1386a;
import j8.InterfaceC1387b;
import java.util.HashMap;
import v8.C2153g;
import y7.C2438l0;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC1376b, i4.e, InterfaceC1386a, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f17745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17747c;

    public /* synthetic */ h(Object obj, long j, Object obj2) {
        this.f17746b = obj;
        this.f17745a = j;
        this.f17747c = obj2;
    }

    public /* synthetic */ h(Object obj, Object obj2, long j) {
        this.f17746b = obj;
        this.f17747c = obj2;
        this.f17745a = j;
    }

    @Override // i4.e
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i7 = ((EnumC1087c) this.f17747c).f16790a;
        String num = Integer.toString(i7);
        String str = (String) this.f17746b;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            boolean z8 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.f17745a;
            if (z8) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i7)});
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i7));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            }
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // j4.InterfaceC1376b
    public Object e() {
        i iVar = (i) this.f17746b;
        long b2 = iVar.g.b() + this.f17745a;
        i4.g gVar = (i4.g) iVar.f17750c;
        C0838i c0838i = (C0838i) this.f17747c;
        gVar.getClass();
        gVar.F(new J7.e(b2, c0838i));
        return null;
    }

    @Override // j8.InterfaceC1386a
    public void f(InterfaceC1387b interfaceC1387b) {
        ((s7.a) interfaceC1387b.get()).d((String) this.f17746b, this.f17745a, (C2438l0) this.f17747c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((C2153g) this.f17746b).c(task, this.f17745a, (HashMap) this.f17747c);
    }
}
