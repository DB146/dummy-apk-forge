package b3;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build;

/* loaded from: classes.dex */
public final class m extends AbstractC0827b {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f13830d = (String[]) AbstractC0829d.a(AbstractC0827b.f13815c, new String[]{"watch_next_type", "last_engagement_time_utc_millis"});

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, b3.c, b3.m] */
    public static m d(Cursor cursor) {
        AbstractC0826a abstractC0826a = new AbstractC0826a();
        AbstractC0827b.b(cursor, abstractC0826a);
        int columnIndex = cursor.getColumnIndex("watch_next_type");
        if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
            ((ContentValues) abstractC0826a.f3094a).put("watch_next_type", Integer.valueOf(cursor.getInt(columnIndex)));
        }
        int columnIndex2 = cursor.getColumnIndex("last_engagement_time_utc_millis");
        if (columnIndex2 >= 0 && !cursor.isNull(columnIndex2)) {
            ((ContentValues) abstractC0826a.f3094a).put("last_engagement_time_utc_millis", Long.valueOf(cursor.getLong(columnIndex2)));
        }
        ?? obj = new Object();
        obj.f13817a = (ContentValues) abstractC0826a.f3094a;
        return obj;
    }

    public final ContentValues e() {
        ContentValues c10 = super.c();
        if (Build.VERSION.SDK_INT < 26) {
            c10.remove("watch_next_type");
            c10.remove("last_engagement_time_utc_millis");
        }
        return c10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return this.f13817a.equals(((m) obj).f13817a);
    }

    public final String toString() {
        return "WatchNextProgram{" + this.f13817a.toString() + "}";
    }
}
