package b3;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public ContentValues f13820a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Bitmap f13821b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f13822c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13823d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f13824e;

    public static e a(Cursor cursor) {
        if (!cursor.getString(2).equals("TYPE_PREVIEW")) {
            return null;
        }
        q3.c cVar = new q3.c(27, (byte) 0);
        ((ContentValues) cVar.f23371b).put("_id", Long.valueOf(cursor.getInt(0)));
        ((ContentValues) cVar.f23371b).put("package_name", cursor.getString(1));
        ((ContentValues) cVar.f23371b).put("type", cursor.getString(2));
        ((ContentValues) cVar.f23371b).put("display_name", cursor.getString(3).toString());
        String string = cursor.getString(4);
        ContentValues contentValues = (ContentValues) cVar.f23371b;
        if (string == null) {
            contentValues.remove("description");
        } else {
            contentValues.put("description", string.toString());
        }
        Uri parse = Uri.parse(cursor.getString(5));
        ((ContentValues) cVar.f23371b).put("app_link_intent_uri", parse != null ? parse.toString() : null);
        ((ContentValues) cVar.f23371b).put("internal_provider_id", cursor.getString(6));
        ((ContentValues) cVar.f23371b).put("internal_provider_data", cursor.getBlob(7));
        ((ContentValues) cVar.f23371b).put("internal_provider_flag1", Long.valueOf(cursor.getLong(8)));
        ((ContentValues) cVar.f23371b).put("internal_provider_flag2", Long.valueOf(cursor.getLong(9)));
        ((ContentValues) cVar.f23371b).put("internal_provider_flag3", Long.valueOf(cursor.getLong(10)));
        ((ContentValues) cVar.f23371b).put("internal_provider_flag4", Long.valueOf(cursor.getLong(11)));
        return cVar.g();
    }

    public final long b() {
        Long asLong = this.f13820a.getAsLong("_id");
        if (asLong == null) {
            return -1L;
        }
        return asLong.longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f13820a.equals(((e) obj).f13820a);
    }

    public final int hashCode() {
        return this.f13820a.hashCode();
    }

    public final String toString() {
        return "Channel{" + this.f13820a.toString() + "}";
    }
}
