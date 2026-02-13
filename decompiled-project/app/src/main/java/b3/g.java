package b3;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build;

/* loaded from: classes.dex */
public final class g extends AbstractC0827b {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f13825d = (String[]) AbstractC0829d.a(AbstractC0827b.f13815c, new String[]{"channel_id", "weight"});

    /* JADX WARN: Type inference failed for: r5v1, types: [b3.g, java.lang.Object, b3.c] */
    public static g d(Cursor cursor) {
        AbstractC0826a abstractC0826a = new AbstractC0826a();
        AbstractC0827b.b(cursor, abstractC0826a);
        int columnIndex = cursor.getColumnIndex("channel_id");
        if (columnIndex >= 0 && !cursor.isNull(columnIndex)) {
            ((ContentValues) abstractC0826a.f3094a).put("channel_id", Long.valueOf(cursor.getLong(columnIndex)));
        }
        int columnIndex2 = cursor.getColumnIndex("weight");
        if (columnIndex2 >= 0 && !cursor.isNull(columnIndex2)) {
            ((ContentValues) abstractC0826a.f3094a).put("weight", Integer.valueOf(cursor.getInt(columnIndex2)));
        }
        ?? obj = new Object();
        obj.f13817a = (ContentValues) abstractC0826a.f3094a;
        return obj;
    }

    public final ContentValues e() {
        ContentValues c10 = super.c();
        if (Build.VERSION.SDK_INT < 26) {
            c10.remove("channel_id");
            c10.remove("weight");
        }
        return c10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f13817a.equals(((g) obj).f13817a);
    }

    public final String toString() {
        return "PreviewProgram{" + this.f13817a.toString() + "}";
    }
}
